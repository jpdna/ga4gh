/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This request maps to the body of `POST /alleles/search` as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchAllelesRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchAllelesRequest\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This request maps to the body of `POST /alleles/search` as JSON.\",\"fields\":[{\"name\":\"variantSetIds\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Required. The IDs of the variant sets to search over.\",\"default\":[]},{\"name\":\"sequenceId\",\"type\":\"string\",\"doc\":\"Required. Only return `Allele`s on the sequence with this ID.\"},{\"name\":\"start\",\"type\":\"long\",\"doc\":\"Required. The beginning of the window (0-based, inclusive) for\\n  which overlapping alleles should be returned.\\n  Genomic positions are non-negative integers less than segment length.\\n  Requests spanning the join of circular genomes are represented as\\n  two requests one on each side of the join (position 0).\"},{\"name\":\"end\",\"type\":\"long\",\"doc\":\"Required. The end of the window (0-based, exclusive) for which overlapping\\n  alleles should be returned.\"},{\"name\":\"pageSize\",\"type\":[\"null\",\"int\"],\"doc\":\"Specifies the maximum number of results to return in a single page.\\n  If unspecified, a system default will be used.\",\"default\":null},{\"name\":\"pageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  To get the next page of results, set this parameter to the value of\\n  `nextPageToken` from the previous response.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Required. The IDs of the variant sets to search over. */
  @Deprecated public java.util.List<java.lang.CharSequence> variantSetIds;
  /** Required. Only return `Allele`s on the sequence with this ID. */
  @Deprecated public java.lang.CharSequence sequenceId;
  /** Required. The beginning of the window (0-based, inclusive) for
  which overlapping alleles should be returned.
  Genomic positions are non-negative integers less than segment length.
  Requests spanning the join of circular genomes are represented as
  two requests one on each side of the join (position 0). */
  @Deprecated public long start;
  /** Required. The end of the window (0-based, exclusive) for which overlapping
  alleles should be returned. */
  @Deprecated public long end;
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
  public SearchAllelesRequest() {}

  /**
   * All-args constructor.
   */
  public SearchAllelesRequest(java.util.List<java.lang.CharSequence> variantSetIds, java.lang.CharSequence sequenceId, java.lang.Long start, java.lang.Long end, java.lang.Integer pageSize, java.lang.CharSequence pageToken) {
    this.variantSetIds = variantSetIds;
    this.sequenceId = sequenceId;
    this.start = start;
    this.end = end;
    this.pageSize = pageSize;
    this.pageToken = pageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return variantSetIds;
    case 1: return sequenceId;
    case 2: return start;
    case 3: return end;
    case 4: return pageSize;
    case 5: return pageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: variantSetIds = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: sequenceId = (java.lang.CharSequence)value$; break;
    case 2: start = (java.lang.Long)value$; break;
    case 3: end = (java.lang.Long)value$; break;
    case 4: pageSize = (java.lang.Integer)value$; break;
    case 5: pageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'variantSetIds' field.
   * Required. The IDs of the variant sets to search over.   */
  public java.util.List<java.lang.CharSequence> getVariantSetIds() {
    return variantSetIds;
  }

  /**
   * Sets the value of the 'variantSetIds' field.
   * Required. The IDs of the variant sets to search over.   * @param value the value to set.
   */
  public void setVariantSetIds(java.util.List<java.lang.CharSequence> value) {
    this.variantSetIds = value;
  }

  /**
   * Gets the value of the 'sequenceId' field.
   * Required. Only return `Allele`s on the sequence with this ID.   */
  public java.lang.CharSequence getSequenceId() {
    return sequenceId;
  }

  /**
   * Sets the value of the 'sequenceId' field.
   * Required. Only return `Allele`s on the sequence with this ID.   * @param value the value to set.
   */
  public void setSequenceId(java.lang.CharSequence value) {
    this.sequenceId = value;
  }

  /**
   * Gets the value of the 'start' field.
   * Required. The beginning of the window (0-based, inclusive) for
  which overlapping alleles should be returned.
  Genomic positions are non-negative integers less than segment length.
  Requests spanning the join of circular genomes are represented as
  two requests one on each side of the join (position 0).   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * Required. The beginning of the window (0-based, inclusive) for
  which overlapping alleles should be returned.
  Genomic positions are non-negative integers less than segment length.
  Requests spanning the join of circular genomes are represented as
  two requests one on each side of the join (position 0).   * @param value the value to set.
   */
  public void setStart(java.lang.Long value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   * Required. The end of the window (0-based, exclusive) for which overlapping
  alleles should be returned.   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * Required. The end of the window (0-based, exclusive) for which overlapping
  alleles should be returned.   * @param value the value to set.
   */
  public void setEnd(java.lang.Long value) {
    this.end = value;
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

  /** Creates a new SearchAllelesRequest RecordBuilder */
  public static org.ga4gh.methods.SearchAllelesRequest.Builder newBuilder() {
    return new org.ga4gh.methods.SearchAllelesRequest.Builder();
  }
  
  /** Creates a new SearchAllelesRequest RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchAllelesRequest.Builder newBuilder(org.ga4gh.methods.SearchAllelesRequest.Builder other) {
    return new org.ga4gh.methods.SearchAllelesRequest.Builder(other);
  }
  
  /** Creates a new SearchAllelesRequest RecordBuilder by copying an existing SearchAllelesRequest instance */
  public static org.ga4gh.methods.SearchAllelesRequest.Builder newBuilder(org.ga4gh.methods.SearchAllelesRequest other) {
    return new org.ga4gh.methods.SearchAllelesRequest.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchAllelesRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchAllelesRequest>
    implements org.apache.avro.data.RecordBuilder<SearchAllelesRequest> {

    private java.util.List<java.lang.CharSequence> variantSetIds;
    private java.lang.CharSequence sequenceId;
    private long start;
    private long end;
    private java.lang.Integer pageSize;
    private java.lang.CharSequence pageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchAllelesRequest.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchAllelesRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.variantSetIds)) {
        this.variantSetIds = data().deepCopy(fields()[0].schema(), other.variantSetIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sequenceId)) {
        this.sequenceId = data().deepCopy(fields()[1].schema(), other.sequenceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[4].schema(), other.pageSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[5].schema(), other.pageToken);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchAllelesRequest instance */
    private Builder(org.ga4gh.methods.SearchAllelesRequest other) {
            super(org.ga4gh.methods.SearchAllelesRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.variantSetIds)) {
        this.variantSetIds = data().deepCopy(fields()[0].schema(), other.variantSetIds);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sequenceId)) {
        this.sequenceId = data().deepCopy(fields()[1].schema(), other.sequenceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pageSize)) {
        this.pageSize = data().deepCopy(fields()[4].schema(), other.pageSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pageToken)) {
        this.pageToken = data().deepCopy(fields()[5].schema(), other.pageToken);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'variantSetIds' field */
    public java.util.List<java.lang.CharSequence> getVariantSetIds() {
      return variantSetIds;
    }
    
    /** Sets the value of the 'variantSetIds' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setVariantSetIds(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.variantSetIds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'variantSetIds' field has been set */
    public boolean hasVariantSetIds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'variantSetIds' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearVariantSetIds() {
      variantSetIds = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'sequenceId' field */
    public java.lang.CharSequence getSequenceId() {
      return sequenceId;
    }
    
    /** Sets the value of the 'sequenceId' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setSequenceId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sequenceId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'sequenceId' field has been set */
    public boolean hasSequenceId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'sequenceId' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearSequenceId() {
      sequenceId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public java.lang.Long getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setStart(long value) {
      validate(fields()[2], value);
      this.start = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'start' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearStart() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public java.lang.Long getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setEnd(long value) {
      validate(fields()[3], value);
      this.end = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'end' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearEnd() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'pageSize' field */
    public java.lang.Integer getPageSize() {
      return pageSize;
    }
    
    /** Sets the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setPageSize(java.lang.Integer value) {
      validate(fields()[4], value);
      this.pageSize = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'pageSize' field has been set */
    public boolean hasPageSize() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'pageSize' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearPageSize() {
      pageSize = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pageToken' field */
    public java.lang.CharSequence getPageToken() {
      return pageToken;
    }
    
    /** Sets the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder setPageToken(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.pageToken = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pageToken' field has been set */
    public boolean hasPageToken() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pageToken' field */
    public org.ga4gh.methods.SearchAllelesRequest.Builder clearPageToken() {
      pageToken = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public SearchAllelesRequest build() {
      try {
        SearchAllelesRequest record = new SearchAllelesRequest();
        record.variantSetIds = fieldSetFlags()[0] ? this.variantSetIds : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.sequenceId = fieldSetFlags()[1] ? this.sequenceId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.start = fieldSetFlags()[2] ? this.start : (java.lang.Long) defaultValue(fields()[2]);
        record.end = fieldSetFlags()[3] ? this.end : (java.lang.Long) defaultValue(fields()[3]);
        record.pageSize = fieldSetFlags()[4] ? this.pageSize : (java.lang.Integer) defaultValue(fields()[4]);
        record.pageToken = fieldSetFlags()[5] ? this.pageToken : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}