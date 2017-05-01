package org.deeplearning4j.datasets.iterator.parallel;

import org.nd4j.linalg.dataset.api.DataSet;
import org.nd4j.linalg.dataset.api.iterator.enums.InequalityHandling;
import org.nd4j.linalg.exception.ND4JIllegalStateException;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author raver119@gmail.com
 */
public abstract class BaseParallelDataSetIterator {
    protected AtomicLong counter = new AtomicLong(0);

    protected InequalityHandling inequalityHandling;
    protected int numProducers;

    protected AtomicBoolean allDepleted = new AtomicBoolean(false);
    protected AtomicBoolean oneDepleted = new AtomicBoolean(false);


    public boolean hasNext() {
        // TODO: configurable probably?
        if (allDepleted.get())
            return false;

        boolean hasNext = hasNextFor(getCurrentProducerIndex());

        switch (inequalityHandling) {
            // FIXME: RESET should be applicable ONLY to producers which return TRUE for resetSupported();
            case RESET: {
                if (!hasNext)
                    reset(getCurrentProducerIndex());

                return true;
            }
            case RELOCATE: {
                // TODO: transparent switch to next producer should happen here
            }
            case PASS_NULL: {
                // we just return true here, no matter what's up
                return true;
            }
            case STOP_EVERYONE: {
                    if (oneDepleted.get())
                        return false;

                    oneDepleted.compareAndSet(true, hasNext);

                    return !oneDepleted.get();
                }
            default:
                throw new ND4JIllegalStateException("Unknown InequalityHanding option was passed in: " + inequalityHandling);

        }
    }

    public DataSet next() {
        DataSet ds = nextFor(getCurrentProducerIndex());
        stepForward();
        return ds;
    }

    protected int getCurrentProducerIndex() {
        return (int)(counter.get() % numProducers);
    }

    protected void stepForward() {
        counter.getAndIncrement();
    }

    public abstract boolean hasNextFor( int consumer);

    public abstract DataSet nextFor(int consumer);

    protected abstract void reset(int consumer);
}