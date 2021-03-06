/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.beacon;  
@SuppressWarnings("all")
/** The response from the Beacon */
@org.apache.avro.specific.AvroGenerated
public class BeaconResponseResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BeaconResponseResource\",\"namespace\":\"org.ga4gh.beacon\",\"doc\":\"The response from the Beacon\",\"fields\":[{\"name\":\"beacon\",\"type\":\"string\",\"doc\":\"Beacon ID\"},{\"name\":\"query\",\"type\":{\"type\":\"record\",\"name\":\"QueryResource\",\"doc\":\"A request for information about a specific site\",\"fields\":[{\"name\":\"allele\",\"type\":\"string\",\"doc\":\"Allele string. Use I<seq> for insertions and Dn for deletions, \\n      where <seq> is the nucleotide sequence inserted after position \\n      and n is a number of nucleotides deleted from the reference \\n      starting at position.\"},{\"name\":\"chromosome\",\"type\":\"string\",\"doc\":\"The chromosome of the request\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"0-based allele locus\"},{\"name\":\"reference\",\"type\":\"string\",\"doc\":\"The version of the reference\"},{\"name\":\"dataset\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the targeted population\",\"default\":null}]},\"doc\":\"Query\"},{\"name\":\"response\",\"type\":{\"type\":\"record\",\"name\":\"ResponseResource\",\"doc\":\"The response to the Beacon query\",\"fields\":[{\"name\":\"exists\",\"type\":\"string\",\"doc\":\"Whether the beacon has observed variants. True if an observation exactly matches request. Overlap if an\\n  observation overlaps request, but not exactly, as in the case of indels or if the query used wildcard for\\n  allele. False if data are present at the requested position but no observations exactly match or overlap. Null\\n  otherwise.\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency\"},{\"name\":\"observed\",\"type\":[\"null\",\"int\"],\"doc\":\"# observed\",\"default\":null},{\"name\":\"info\",\"type\":[\"null\",\"string\"],\"doc\":\"Additional message. OK if request succeeded.\",\"default\":null},{\"name\":\"err\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ErrorResource\",\"doc\":\"ErrorResource\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"allele\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"# observed\",\"default\":null}]}],\"doc\":\"Error details. Provided if a beacon encountered an error.\",\"default\":null}]},\"doc\":\"Response\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Beacon ID */
  @Deprecated public java.lang.CharSequence beacon;
  /** Query */
  @Deprecated public org.ga4gh.beacon.QueryResource query;
  /** Response */
  @Deprecated public org.ga4gh.beacon.ResponseResource response;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BeaconResponseResource() {}

  /**
   * All-args constructor.
   */
  public BeaconResponseResource(java.lang.CharSequence beacon, org.ga4gh.beacon.QueryResource query, org.ga4gh.beacon.ResponseResource response) {
    this.beacon = beacon;
    this.query = query;
    this.response = response;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return beacon;
    case 1: return query;
    case 2: return response;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: beacon = (java.lang.CharSequence)value$; break;
    case 1: query = (org.ga4gh.beacon.QueryResource)value$; break;
    case 2: response = (org.ga4gh.beacon.ResponseResource)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'beacon' field.
   * Beacon ID   */
  public java.lang.CharSequence getBeacon() {
    return beacon;
  }

  /**
   * Sets the value of the 'beacon' field.
   * Beacon ID   * @param value the value to set.
   */
  public void setBeacon(java.lang.CharSequence value) {
    this.beacon = value;
  }

  /**
   * Gets the value of the 'query' field.
   * Query   */
  public org.ga4gh.beacon.QueryResource getQuery() {
    return query;
  }

  /**
   * Sets the value of the 'query' field.
   * Query   * @param value the value to set.
   */
  public void setQuery(org.ga4gh.beacon.QueryResource value) {
    this.query = value;
  }

  /**
   * Gets the value of the 'response' field.
   * Response   */
  public org.ga4gh.beacon.ResponseResource getResponse() {
    return response;
  }

  /**
   * Sets the value of the 'response' field.
   * Response   * @param value the value to set.
   */
  public void setResponse(org.ga4gh.beacon.ResponseResource value) {
    this.response = value;
  }

  /** Creates a new BeaconResponseResource RecordBuilder */
  public static org.ga4gh.beacon.BeaconResponseResource.Builder newBuilder() {
    return new org.ga4gh.beacon.BeaconResponseResource.Builder();
  }
  
  /** Creates a new BeaconResponseResource RecordBuilder by copying an existing Builder */
  public static org.ga4gh.beacon.BeaconResponseResource.Builder newBuilder(org.ga4gh.beacon.BeaconResponseResource.Builder other) {
    return new org.ga4gh.beacon.BeaconResponseResource.Builder(other);
  }
  
  /** Creates a new BeaconResponseResource RecordBuilder by copying an existing BeaconResponseResource instance */
  public static org.ga4gh.beacon.BeaconResponseResource.Builder newBuilder(org.ga4gh.beacon.BeaconResponseResource other) {
    return new org.ga4gh.beacon.BeaconResponseResource.Builder(other);
  }
  
  /**
   * RecordBuilder for BeaconResponseResource instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BeaconResponseResource>
    implements org.apache.avro.data.RecordBuilder<BeaconResponseResource> {

    private java.lang.CharSequence beacon;
    private org.ga4gh.beacon.QueryResource query;
    private org.ga4gh.beacon.ResponseResource response;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.beacon.BeaconResponseResource.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.beacon.BeaconResponseResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.beacon)) {
        this.beacon = data().deepCopy(fields()[0].schema(), other.beacon);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.query)) {
        this.query = data().deepCopy(fields()[1].schema(), other.query);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.response)) {
        this.response = data().deepCopy(fields()[2].schema(), other.response);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing BeaconResponseResource instance */
    private Builder(org.ga4gh.beacon.BeaconResponseResource other) {
            super(org.ga4gh.beacon.BeaconResponseResource.SCHEMA$);
      if (isValidValue(fields()[0], other.beacon)) {
        this.beacon = data().deepCopy(fields()[0].schema(), other.beacon);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.query)) {
        this.query = data().deepCopy(fields()[1].schema(), other.query);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.response)) {
        this.response = data().deepCopy(fields()[2].schema(), other.response);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'beacon' field */
    public java.lang.CharSequence getBeacon() {
      return beacon;
    }
    
    /** Sets the value of the 'beacon' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder setBeacon(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.beacon = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'beacon' field has been set */
    public boolean hasBeacon() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'beacon' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder clearBeacon() {
      beacon = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'query' field */
    public org.ga4gh.beacon.QueryResource getQuery() {
      return query;
    }
    
    /** Sets the value of the 'query' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder setQuery(org.ga4gh.beacon.QueryResource value) {
      validate(fields()[1], value);
      this.query = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'query' field has been set */
    public boolean hasQuery() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'query' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder clearQuery() {
      query = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'response' field */
    public org.ga4gh.beacon.ResponseResource getResponse() {
      return response;
    }
    
    /** Sets the value of the 'response' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder setResponse(org.ga4gh.beacon.ResponseResource value) {
      validate(fields()[2], value);
      this.response = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'response' field has been set */
    public boolean hasResponse() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'response' field */
    public org.ga4gh.beacon.BeaconResponseResource.Builder clearResponse() {
      response = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public BeaconResponseResource build() {
      try {
        BeaconResponseResource record = new BeaconResponseResource();
        record.beacon = fieldSetFlags()[0] ? this.beacon : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.query = fieldSetFlags()[1] ? this.query : (org.ga4gh.beacon.QueryResource) defaultValue(fields()[1]);
        record.response = fieldSetFlags()[2] ? this.response : (org.ga4gh.beacon.ResponseResource) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
