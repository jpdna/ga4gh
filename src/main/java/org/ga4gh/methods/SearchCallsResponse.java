/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /calls/search` expressed as JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchCallsResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchCallsResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /calls/search` expressed as JSON.\",\"fields\":[{\"name\":\"calls\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Call\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Call` represents the determination of genotype with respect to a\\nparticular `Variant`.\\n\\nIt may include associated information such as quality\\nand phasing. For example, a call might assign a probability of 0.32 to\\nthe occurrence of a SNP named rs1234 in a call set with the name NA12345.\\n\\nThe genotypes described by `Call`s must be consistent with any `AlleleCall`s in\\nthe same `CallSet`. If a server supports \\\"classic\\\" mode, it must provide `Call`s\\nfor all `Variant`s that have associated `AlleleCall`s in the `CallSet`.\",\"fields\":[{\"name\":\"callSetId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the call set this variant call belongs to.\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\"},{\"name\":\"callSetName\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the call set this variant call belongs to.\\n  If this field is not present, the ordering of the call sets from a\\n  `SearchCallSetsRequest` over this `VariantSet` is guaranteed to match\\n  the ordering of the calls on this `Variant`.\\n  The number of results will also be the same.\",\"default\":null},{\"name\":\"variantId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the `Variant` that this `Call` belongs to. Must be set in any `Call`\\n  that is not being returned from the server already contained within its\\n  `Variant`.\"},{\"name\":\"genotype\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"The genotype of this variant call.\\n\\n  A 0 value represents the reference allele of the associated `Variant`. Any\\n  other value is a 1-based index into the alternate alleles of the associated\\n  `Variant`.\\n\\n  If a variant had a referenceBases field of \\\"T\\\", an alternateBases\\n  value of [\\\"A\\\", \\\"C\\\"], and the genotype was [2, 1], that would mean the call\\n  represented the heterozygous value \\\"CA\\\" for this variant. If the genotype\\n  was instead [0, 1] the represented value would be \\\"TA\\\". Ordering of the\\n  genotype values is important if the phaseset field is present.\",\"default\":[]},{\"name\":\"phaseset\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"If this field is a string, this variant call's genotype ordering implies\\n  the phase of the bases and is consistent with any other variant calls on\\n  the same contig which have the same phaseset string.\\n\\n  If this field is an array, each entry is associated with the corresponding\\n  entry in the `genotype` array. Allele instances that are associated with the\\n  same `phaseset` string occur on the same molecule of DNA.\\n\\n  For example, if one `Call` has `genotype` [0, 1], another is associated with\\n  `Allele` 3, and both have a `phaseset` of [\\\"maternal\\\", \\\"paternal\\\"], then one\\n  DNA molecule carries 0, 3 and another carries 1, 3.\\n\\n  If the API server supports the \\\"classic\\\" mode, this field must not be an\\n  array. If the API server supports the \\\"graph\\\" mode and not the \\\"classic\\\" mode,\\n  this field must be an array.\",\"default\":null},{\"name\":\"genotypeLikelihood\",\"type\":{\"type\":\"array\",\"items\":\"double\"},\"doc\":\"The genotype likelihoods for this variant call. Each array entry\\n  represents how likely a specific genotype is for this call as\\n  log10(P(data | genotype)), analogous to the GL tag in the VCF spec. The\\n  value ordering is defined by the GL tag in the VCF spec.\",\"default\":[]},{\"name\":\"info\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"doc\":\"A map of additional variant call information.\",\"default\":{}}]}},\"doc\":\"The list of matching calls.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of matching calls. */
  @Deprecated public java.util.List<org.ga4gh.models.Call> calls;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
  @Deprecated public java.lang.CharSequence nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchCallsResponse() {}

  /**
   * All-args constructor.
   */
  public SearchCallsResponse(java.util.List<org.ga4gh.models.Call> calls, java.lang.CharSequence nextPageToken) {
    this.calls = calls;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return calls;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: calls = (java.util.List<org.ga4gh.models.Call>)value$; break;
    case 1: nextPageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'calls' field.
   * The list of matching calls.   */
  public java.util.List<org.ga4gh.models.Call> getCalls() {
    return calls;
  }

  /**
   * Sets the value of the 'calls' field.
   * The list of matching calls.   * @param value the value to set.
   */
  public void setCalls(java.util.List<org.ga4gh.models.Call> value) {
    this.calls = value;
  }

  /**
   * Gets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   */
  public java.lang.CharSequence getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Sets the value of the 'nextPageToken' field.
   * The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results.   * @param value the value to set.
   */
  public void setNextPageToken(java.lang.CharSequence value) {
    this.nextPageToken = value;
  }

  /** Creates a new SearchCallsResponse RecordBuilder */
  public static org.ga4gh.methods.SearchCallsResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchCallsResponse.Builder();
  }
  
  /** Creates a new SearchCallsResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchCallsResponse.Builder newBuilder(org.ga4gh.methods.SearchCallsResponse.Builder other) {
    return new org.ga4gh.methods.SearchCallsResponse.Builder(other);
  }
  
  /** Creates a new SearchCallsResponse RecordBuilder by copying an existing SearchCallsResponse instance */
  public static org.ga4gh.methods.SearchCallsResponse.Builder newBuilder(org.ga4gh.methods.SearchCallsResponse other) {
    return new org.ga4gh.methods.SearchCallsResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchCallsResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchCallsResponse>
    implements org.apache.avro.data.RecordBuilder<SearchCallsResponse> {

    private java.util.List<org.ga4gh.models.Call> calls;
    private java.lang.CharSequence nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchCallsResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchCallsResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.calls)) {
        this.calls = data().deepCopy(fields()[0].schema(), other.calls);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchCallsResponse instance */
    private Builder(org.ga4gh.methods.SearchCallsResponse other) {
            super(org.ga4gh.methods.SearchCallsResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.calls)) {
        this.calls = data().deepCopy(fields()[0].schema(), other.calls);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'calls' field */
    public java.util.List<org.ga4gh.models.Call> getCalls() {
      return calls;
    }
    
    /** Sets the value of the 'calls' field */
    public org.ga4gh.methods.SearchCallsResponse.Builder setCalls(java.util.List<org.ga4gh.models.Call> value) {
      validate(fields()[0], value);
      this.calls = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'calls' field has been set */
    public boolean hasCalls() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'calls' field */
    public org.ga4gh.methods.SearchCallsResponse.Builder clearCalls() {
      calls = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.CharSequence getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchCallsResponse.Builder setNextPageToken(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nextPageToken = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nextPageToken' field has been set */
    public boolean hasNextPageToken() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchCallsResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchCallsResponse build() {
      try {
        SearchCallsResponse record = new SearchCallsResponse();
        record.calls = fieldSetFlags()[0] ? this.calls : (java.util.List<org.ga4gh.models.Call>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
