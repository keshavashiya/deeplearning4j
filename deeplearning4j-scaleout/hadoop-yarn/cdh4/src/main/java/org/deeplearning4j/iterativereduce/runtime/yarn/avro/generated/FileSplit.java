/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated;
@SuppressWarnings("all")
public class FileSplit extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FileSplit\",\"namespace\":\"com.cloudera.org.deeplearning4j.iterativereduce.runtime.yarn.avro.generated\",\"fields\":[{\"name\":\"path\",\"type\":\"string\"},{\"name\":\"offset\",\"type\":\"long\"},{\"name\":\"length\",\"type\":\"long\"}]}");
  @Deprecated public CharSequence path;
  @Deprecated public long offset;
  @Deprecated public long length;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return path;
    case 1: return offset;
    case 2: return length;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: path = (CharSequence)value$; break;
    case 1: offset = (Long)value$; break;
    case 2: length = (Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'path' field.
   */
  public CharSequence getPath() {
    return path;
  }

  /**
   * Sets the value of the 'path' field.
   * @param value the value to set.
   */
  public void setPath(CharSequence value) {
    this.path = value;
  }

  /**
   * Gets the value of the 'offset' field.
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Sets the value of the 'offset' field.
   * @param value the value to set.
   */
  public void setOffset(Long value) {
    this.offset = value;
  }

  /**
   * Gets the value of the 'length' field.
   */
  public Long getLength() {
    return length;
  }

  /**
   * Sets the value of the 'length' field.
   * @param value the value to set.
   */
  public void setLength(Long value) {
    this.length = value;
  }

  /** Creates a new FileSplit RecordBuilder */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Creates a new FileSplit RecordBuilder by copying an existing Builder */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /** Creates a new FileSplit RecordBuilder by copying an existing FileSplit instance */
  public static Builder newBuilder(FileSplit other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for FileSplit instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FileSplit>
    implements org.apache.avro.data.RecordBuilder<FileSplit> {

    private CharSequence path;
    private long offset;
    private long length;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(Builder other) {
      super(other);
    }

    /** Creates a Builder by copying an existing FileSplit instance */
    private Builder(FileSplit other) {
            super(FileSplit.SCHEMA$);
      if (isValidValue(fields()[0], other.path)) {
        this.path = (CharSequence) data().deepCopy(fields()[0].schema(), other.path);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offset)) {
        this.offset = (Long) data().deepCopy(fields()[1].schema(), other.offset);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.length)) {
        this.length = (Long) data().deepCopy(fields()[2].schema(), other.length);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'path' field */
    public CharSequence getPath() {
      return path;
    }

    /** Sets the value of the 'path' field */
    public FileSplit.Builder setPath(CharSequence value) {
      validate(fields()[0], value);
      this.path = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'path' field has been set */
    public boolean hasPath() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'path' field */
    public Builder clearPath() {
      path = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'offset' field */
    public Long getOffset() {
      return offset;
    }

    /** Sets the value of the 'offset' field */
    public Builder setOffset(long value) {
      validate(fields()[1], value);
      this.offset = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'offset' field has been set */
    public boolean hasOffset() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'offset' field */
    public Builder clearOffset() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'length' field */
    public Long getLength() {
      return length;
    }

    /** Sets the value of the 'length' field */
    public Builder setLength(long value) {
      validate(fields()[2], value);
      this.length = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /** Checks whether the 'length' field has been set */
    public boolean hasLength() {
      return fieldSetFlags()[2];
    }

    /** Clears the value of the 'length' field */
    public Builder clearLength() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FileSplit build() {
      try {
        FileSplit record = new FileSplit();
        record.path = fieldSetFlags()[0] ? this.path : (CharSequence) defaultValue(fields()[0]);
        record.offset = fieldSetFlags()[1] ? this.offset : (Long) defaultValue(fields()[1]);
        record.length = fieldSetFlags()[2] ? this.length : (Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
