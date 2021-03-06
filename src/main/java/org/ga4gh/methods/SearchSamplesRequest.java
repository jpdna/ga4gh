/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /samples/search` as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchSamplesRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchSamplesRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /samples/search` as JSON.\",\"fields\":[{\"name\":\"individualIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"If specified, restrict this query to samples for the given individuals.\",\"default\":[]},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"doc\":\"Only return samples for which a substring of the name matches\\n  this string.\",\"default\":null},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** If specified, restrict this query to samples for the given individuals. */
  @Deprecated public java.util.List<java.lang.CharSequence> individualIds;
  /** Only return samples for which a substring of the name matches
  this string. */
  @Deprecated public java.lang.CharSequence name;
  /** Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used. */
  @Deprecated public java.lang.Integer pageSize;
  /** The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response. */
  @Deprecated public java.lang.CharSequence pageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchSamplesRequest() {}

  /**
   * All-args constructor.
   */
  public SearchSamplesRequest(java.util.List<java.lang.CharSequence> individualIds, java.lang.CharSequence name, java.lang.Integer pageSize, java.lang.CharSequence pageToken) {
    this.individualIds = individualIds;
    this.name = name;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return individualIds;
    case 1: return name;
    case 2: return pageSize;
    case 3: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: individualIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: pageSize = (java.lang.Integer)value$; break;
    case 3: pageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'individualIds' field.
   * If specified, restrict this query to samples for the given individuals.   */
  public java.util.List<java.lang.CharSequence> getIndividualIds() {
    return individualIds;
  }

  /**
   * Sets the value of the 'individualIds' field.
   * If specified, restrict this query to samples for the given individuals.   * @param value the value to set.
   */
  public void setIndividualIds(java.util.List<java.lang.CharSequence> value) {
    this.individualIds = value;
  }

  /**
   * Gets the value of the 'name' field.
   * Only return samples for which a substring of the name matches
  this string.   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Only return samples for which a substring of the name matches
  this string.   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Sets the value of the 'pageSize' field.
   * Specifies the maximum number of results to return in a single page.
  If unspecified, a system default will be used.   * @param value the value to set.
   */
  public void setPageSize(java.lang.Integer value) {
    this.pageSize = value;
  }

  /**
   * Gets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   */
  public java.lang.CharSequence getPageToken() {
    return pageToken;
  }

  /**
   * Sets the value of the 'pageToken' field.
   * The continuation token, which is used to page through large result sets.
  To get the next page of results, set this parameter to the value of
  `nextPageToken` from the previous response.   * @param value the value to set.
   */
  public void setPageToken(java.lang.CharSequence value) {
    this.pageToken = value;
  }

  /** Creates a new SearchSamplesRequest RecordBuilder */
  public static org.ga4gh.methods.SearchSamplesRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchSamplesRequest.Builder();
  }
  
  /** Creates a new SearchSamplesRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchSamplesRequest.Builder newBuilder(org.ga4gh.methods.SearchSamplesRequest.Builder other) {
    return new org.ga4gh.methods.SearchSamplesRequest.Builder(other);
  }
  
  /** Creates a new SearchSamplesRequest RecordBuilder by copying an existing SearchSamplesRequest instance */
  public static org.ga4gh.methods.SearchSamplesRequest.Builder newBuilder(org.ga4gh.methods.SearchSamplesRequest other) {
    return new org.ga4gh.methods.SearchSamplesRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchSamplesRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchSamplesRequest>
    implements org.apache.avro.data.RecordBuilder<SearchSamplesRequest> {

    private java.util.List<java.lang.CharSequence> individualIds;
    private java.lang.CharSequence name;
    private java.lang.Integer pageSize;
    private java.lang.CharSequence pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchSamplesRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchSamplesRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.individualIds)) {
        this.individualIds = data().deepCopy(fields()[0].schema(), other.individualIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[2].schema(), other.pageSize);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[3].schema(), other.pageToken);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchSamplesRequest instance */
    private Builder(org.ga4gh.methods.SearchSamplesRequest other) {
            super(org.ga4gh.methods.SearchSamplesRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.individualIds)) {
        this.individualIds = data().deepCopy(fields()[0].schema(), other.individualIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[2].schema(), other.pageSize);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[3].schema(), other.pageToken);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'individualIds' field */
    public java.util.List<java.lang.CharSequence> getIndividualIds() {
      return individualIds;
    }
    
    /** Sets the value of the 'individualIds' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder setIndividualIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.individualIds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'individualIds' field has been set */
    public boolean hasIndividualIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'individualIds' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder clearIndividualIds() {
      individualIds = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder setPageSize(java.lang.Integer value) {
      validate(fields()[2], value);
      this.pageSize = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'pageSize' field has been set */
    public boolean hasPageSize() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.CharSequence getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder setPageToken(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.pageToken = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'pageToken' field has been set */
    public boolean hasPageToken() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchSamplesRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public SearchSamplesRequest build() {
      try {
        SearchSamplesRequest record = new SearchSamplesRequest();
        record.individualIds = fieldSetFlags()[0] ? this.individualIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.pageSize = fieldSetFlags()[2] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[2]);
        record.pageToken = fieldSetFlags()[3] ? this.pageToken : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
