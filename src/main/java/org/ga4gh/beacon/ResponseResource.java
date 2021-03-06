/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.beacon;  
@SuppressWarnings("all")
/** The response to the Beacon query */
@org.apache.avro.specific.AvroGenerated
public class ResponseResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ResponseResource\",\"namespace\":\"org.ga4gh.beacon\",\"doc\":\"The response to the Beacon query\",\"fields\":[{\"name\":\"exists\",\"type\":\"string\",\"doc\":\"Whether the beacon has observed variants. True if an observation exactly matches request. Overlap if an\\n  observation overlaps request, but not exactly, as in the case of indels or if the query used wildcard for\\n  allele. False if data are present at the requested position but no observations exactly match or overlap. Null\\n  otherwise.\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency\"},{\"name\":\"observed\",\"type\":[\"null\",\"int\"],\"doc\":\"# observed\",\"default\":null},{\"name\":\"info\",\"type\":[\"null\",\"string\"],\"doc\":\"Additional message. OK if request succeeded.\",\"default\":null},{\"name\":\"err\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ErrorResource\",\"doc\":\"ErrorResource\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"allele\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"# observed\",\"default\":null}]}],\"doc\":\"Error details. Provided if a beacon encountered an error.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Whether the beacon has observed variants. True if an observation exactly matches request. Overlap if an
  observation overlaps request, but not exactly, as in the case of indels or if the query used wildcard for
  allele. False if data are present at the requested position but no observations exactly match or overlap. Null
  otherwise. */
  @Deprecated public java.lang.CharSequence exists;
  /** frequency */
  @Deprecated public double frequency;
  /** # observed */
  @Deprecated public java.lang.Integer observed;
  /** Additional message. OK if request succeeded. */
  @Deprecated public java.lang.CharSequence info;
  /** Error details. Provided if a beacon encountered an error. */
  @Deprecated public org.ga4gh.beacon.ErrorResource err;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ResponseResource() {}

  /**
   * All-args constructor.
   */
  public ResponseResource(java.lang.CharSequence exists, java.lang.Double frequency, java.lang.Integer observed, java.lang.CharSequence info, org.ga4gh.beacon.ErrorResource err) {
    this.exists = exists;
    this.frequency = frequency;
    this.observed = observed;
    this.info = info;
    this.err = err;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return exists;
    case 1: return frequency;
    case 2: return observed;
    case 3: return info;
    case 4: return err;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: exists = (java.lang.CharSequence)value$; break;
    case 1: frequency = (java.lang.Double)value$; break;
    case 2: observed = (java.lang.Integer)value$; break;
    case 3: info = (java.lang.CharSequence)value$; break;
    case 4: err = (org.ga4gh.beacon.ErrorResource)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'exists' field.
   * Whether the beacon has observed variants. True if an observation exactly matches request. Overlap if an
  observation overlaps request, but not exactly, as in the case of indels or if the query used wildcard for
  allele. False if data are present at the requested position but no observations exactly match or overlap. Null
  otherwise.   */
  public java.lang.CharSequence getExists() {
    return exists;
  }

  /**
   * Sets the value of the 'exists' field.
   * Whether the beacon has observed variants. True if an observation exactly matches request. Overlap if an
  observation overlaps request, but not exactly, as in the case of indels or if the query used wildcard for
  allele. False if data are present at the requested position but no observations exactly match or overlap. Null
  otherwise.   * @param value the value to set.
   */
  public void setExists(java.lang.CharSequence value) {
    this.exists = value;
  }

  /**
   * Gets the value of the 'frequency' field.
   * frequency   */
  public java.lang.Double getFrequency() {
    return frequency;
  }

  /**
   * Sets the value of the 'frequency' field.
   * frequency   * @param value the value to set.
   */
  public void setFrequency(java.lang.Double value) {
    this.frequency = value;
  }

  /**
   * Gets the value of the 'observed' field.
   * # observed   */
  public java.lang.Integer getObserved() {
    return observed;
  }

  /**
   * Sets the value of the 'observed' field.
   * # observed   * @param value the value to set.
   */
  public void setObserved(java.lang.Integer value) {
    this.observed = value;
  }

  /**
   * Gets the value of the 'info' field.
   * Additional message. OK if request succeeded.   */
  public java.lang.CharSequence getInfo() {
    return info;
  }

  /**
   * Sets the value of the 'info' field.
   * Additional message. OK if request succeeded.   * @param value the value to set.
   */
  public void setInfo(java.lang.CharSequence value) {
    this.info = value;
  }

  /**
   * Gets the value of the 'err' field.
   * Error details. Provided if a beacon encountered an error.   */
  public org.ga4gh.beacon.ErrorResource getErr() {
    return err;
  }

  /**
   * Sets the value of the 'err' field.
   * Error details. Provided if a beacon encountered an error.   * @param value the value to set.
   */
  public void setErr(org.ga4gh.beacon.ErrorResource value) {
    this.err = value;
  }

  /** Creates a new ResponseResource RecordBuilder */
  public static org.ga4gh.beacon.ResponseResource.Builder newBuilder() {
    return new org.ga4gh.beacon.ResponseResource.Builder();
  }
  
  /** Creates a new ResponseResource RecordBuilder by copying an existing Builder */
  public static org.ga4gh.beacon.ResponseResource.Builder newBuilder(org.ga4gh.beacon.ResponseResource.Builder other) {
    return new org.ga4gh.beacon.ResponseResource.Builder(other);
  }
  
  /** Creates a new ResponseResource RecordBuilder by copying an existing ResponseResource instance */
  public static org.ga4gh.beacon.ResponseResource.Builder newBuilder(org.ga4gh.beacon.ResponseResource other) {
    return new org.ga4gh.beacon.ResponseResource.Builder(other);
  }
  
  /**
   * RecordBuilder for ResponseResource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ResponseResource>
    implements org.apache.avro.data.RecordBuilder<ResponseResource> {

    private java.lang.CharSequence exists;
    private double frequency;
    private java.lang.Integer observed;
    private java.lang.CharSequence info;
    private org.ga4gh.beacon.ErrorResource err;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.beacon.ResponseResource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.beacon.ResponseResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.exists)) {
        this.exists = data().deepCopy(fields()[0].schema(), other.exists);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.frequency)) {
        this.frequency = data().deepCopy(fields()[1].schema(), other.frequency);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.observed)) {
        this.observed = data().deepCopy(fields()[2].schema(), other.observed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.info)) {
        this.info = data().deepCopy(fields()[3].schema(), other.info);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.err)) {
        this.err = data().deepCopy(fields()[4].schema(), other.err);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ResponseResource instance */
    private Builder(org.ga4gh.beacon.ResponseResource other) {
            super(org.ga4gh.beacon.ResponseResource.SCHEMA$);
      if (isValidValue(fields()[0], other.exists)) {
        this.exists = data().deepCopy(fields()[0].schema(), other.exists);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.frequency)) {
        this.frequency = data().deepCopy(fields()[1].schema(), other.frequency);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.observed)) {
        this.observed = data().deepCopy(fields()[2].schema(), other.observed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.info)) {
        this.info = data().deepCopy(fields()[3].schema(), other.info);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.err)) {
        this.err = data().deepCopy(fields()[4].schema(), other.err);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'exists' field */
    public java.lang.CharSequence getExists() {
      return exists;
    }
    
    /** Sets the value of the 'exists' field */
    public org.ga4gh.beacon.ResponseResource.Builder setExists(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.exists = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'exists' field has been set */
    public boolean hasExists() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'exists' field */
    public org.ga4gh.beacon.ResponseResource.Builder clearExists() {
      exists = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'frequency' field */
    public java.lang.Double getFrequency() {
      return frequency;
    }
    
    /** Sets the value of the 'frequency' field */
    public org.ga4gh.beacon.ResponseResource.Builder setFrequency(double value) {
      validate(fields()[1], value);
      this.frequency = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'frequency' field has been set */
    public boolean hasFrequency() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'frequency' field */
    public org.ga4gh.beacon.ResponseResource.Builder clearFrequency() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'observed' field */
    public java.lang.Integer getObserved() {
      return observed;
    }
    
    /** Sets the value of the 'observed' field */
    public org.ga4gh.beacon.ResponseResource.Builder setObserved(java.lang.Integer value) {
      validate(fields()[2], value);
      this.observed = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'observed' field has been set */
    public boolean hasObserved() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'observed' field */
    public org.ga4gh.beacon.ResponseResource.Builder clearObserved() {
      observed = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'info' field */
    public java.lang.CharSequence getInfo() {
      return info;
    }
    
    /** Sets the value of the 'info' field */
    public org.ga4gh.beacon.ResponseResource.Builder setInfo(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.info = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'info' field has been set */
    public boolean hasInfo() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'info' field */
    public org.ga4gh.beacon.ResponseResource.Builder clearInfo() {
      info = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'err' field */
    public org.ga4gh.beacon.ErrorResource getErr() {
      return err;
    }
    
    /** Sets the value of the 'err' field */
    public org.ga4gh.beacon.ResponseResource.Builder setErr(org.ga4gh.beacon.ErrorResource value) {
      validate(fields()[4], value);
      this.err = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'err' field has been set */
    public boolean hasErr() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'err' field */
    public org.ga4gh.beacon.ResponseResource.Builder clearErr() {
      err = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public ResponseResource build() {
      try {
        ResponseResource record = new ResponseResource();
        record.exists = fieldSetFlags()[0] ? this.exists : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.frequency = fieldSetFlags()[1] ? this.frequency : (java.lang.Double) defaultValue(fields()[1]);
        record.observed = fieldSetFlags()[2] ? this.observed : (java.lang.Integer) defaultValue(fields()[2]);
        record.info = fieldSetFlags()[3] ? this.info : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.err = fieldSetFlags()[4] ? this.err : (org.ga4gh.beacon.ErrorResource) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
