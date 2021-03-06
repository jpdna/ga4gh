/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.methods;  
@SuppressWarnings("all")
/** This is the response from `POST /variantsets/{id}/sequences/search` expressed as
JSON. */
@org.apache.avro.specific.AvroGenerated
public class SearchVariantSetSequencesResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SearchVariantSetSequencesResponse\",\"namespace\":\"org.ga4gh.methods\",\"doc\":\"This is the response from `POST /variantsets/{id}/sequences/search` expressed as\\nJSON.\",\"fields\":[{\"name\":\"segments\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Segment\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"A `Segment` is a range on a sequence, possibly including the joins at the\\nsequence's ends. It does not include base data. (The bases for a sequence are\\navailable through the `getSequenceBases()` API call.)\\n\\nIn the sequence \\\"GTGG\\\", the segment starting at index 1 on the forward strand\\nwith length 2 is the \\\"TG\\\" on the forward strand. The length-2 segment starting\\nat index 1 on the reverse strand is \\\"AC\\\", corresponding to the first two base\\npairs of the sequence, or the last two bases of the reverse complement.\",\"fields\":[{\"name\":\"start\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"A `Position` is a side of a base pair in some already known sequence. A\\n`Position` is represented by a sequence name or ID, a base number on that\\nsequence (0-based), and a `Strand` to indicate the left or right side.\\n\\nFor example, given the sequence \\\"GTGG\\\", the `Position` on that sequence at\\noffset 1 in the forward orientation would be the left side of the T/A base pair.\\nThe base at this `Position` is \\\"T\\\". Alternately, for offset 1 in the reverse\\norientation, the `Position` would be the right side of the T/A base pair, and\\nthe base at the `Position` is \\\"A\\\".\\n\\nOffsets added to a `Position` are interpreted as reading along its strand;\\nadding to a reverse strand position actually subtracts from its `position`\\nmember.\",\"fields\":[{\"name\":\"referenceName\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the reference sequence in whatever reference set is being used.\\n  Does not generally include a \\\"chr\\\" prefix, so for example \\\"X\\\" would be used\\n  for the X chromosome.\\n\\n  If `sequenceId` is null, this must not be null.\",\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the sequence on which the `Position` is located. This may be a\\n  `Reference` sequence, or a novel piece of sequence associated with a\\n  `VariantSet`.\\n\\n  If `referenceName` is null, this must not be null.\\n\\n  If the server supports the \\\"graph\\\" mode, this must not be null.\",\"default\":null},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that sequence.\\n  Genomic positions are non-negative integers less than sequence length.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `POS_STRAND`:  The postive (+) strand.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `NO_STRAND`: Strand-independent data or data where the strand can not be determined.\",\"symbols\":[\"POS_STRAND\",\"NEG_STRAND\",\"NO_STRAND\"]},\"doc\":\"Strand the position is associated with. `POS_STRAND` represents the forward\\n  strand, or equivalently the left side of a base, and `NEG_STRAND` represents\\n  the reverse strand, or equivalently the right side of a base.\"}]},\"doc\":\"The sequence ID and start index of this `Segment`. This base is always\\n  included in the segment, regardless of orientation.\"},{\"name\":\"length\",\"type\":\"long\",\"doc\":\"The length of this `Segment`'s sequence. If `start` is on the forward strand,\\n  the `Segment` contains the range [`start.position`, `start.position` +\\n  `length`). If `start` is on the reverse strand, the `Segment` contains the\\n  range (`start.position` - `length`, `start.position`]. This is equivalent to\\n  starting from the side indicated by `start`, and traversing through that base\\n  out to the specified length.\"},{\"name\":\"startJoin\",\"type\":[\"null\",\"Position\"],\"doc\":\"Start and end `Position`s where this `Segment` attaches to other sequences.\\n  Note that the segmentId for start and end might not be the same. The\\n  `Segment`s covering the sequences onto which this `Segment` is joined are\\n  called its \\\"parents\\\", while this segment is a \\\"child\\\".\\n\\n  Joins may occur on the outer sides of the terminal bases in a sequence: the\\n  left side of the base at index 0, and the right side of the base with maximum\\n  index. These are the \\\"terminal sides\\\" of the sequence. `startJoin` is the join\\n  on the side indicated by `start`, and may only be set if that side is a\\n  terminal side. Similarly, `endJoin` is the join on the opposite side of the\\n  piece of sequence selected by the segment, and may only be set if that side is\\n  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to\\n  which the corresponding side of this `Sequence` is connected.\",\"default\":null},{\"name\":\"endJoin\",\"type\":[\"null\",\"Position\"],\"default\":null}]}},\"doc\":\"The list of `Segment`s for matching sequences from the novel sequence graph\\n  for the `VariantSet`.\",\"default\":[]},{\"name\":\"nextPageToken\",\"type\":[\"null\",\"string\"],\"doc\":\"The continuation token, which is used to page through large result sets.\\n  Provide this value in a subsequent request to return the next page of\\n  results. This field will be empty if there aren't any additional results.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The list of `Segment`s for matching sequences from the novel sequence graph
  for the `VariantSet`. */
  @Deprecated public java.util.List<org.ga4gh.models.Segment> segments;
  /** The continuation token, which is used to page through large result sets.
  Provide this value in a subsequent request to return the next page of
  results. This field will be empty if there aren't any additional results. */
  @Deprecated public java.lang.CharSequence nextPageToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public SearchVariantSetSequencesResponse() {}

  /**
   * All-args constructor.
   */
  public SearchVariantSetSequencesResponse(java.util.List<org.ga4gh.models.Segment> segments, java.lang.CharSequence nextPageToken) {
    this.segments = segments;
    this.nextPageToken = nextPageToken;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return segments;
    case 1: return nextPageToken;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: segments = (java.util.List<org.ga4gh.models.Segment>)value$; break;
    case 1: nextPageToken = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'segments' field.
   * The list of `Segment`s for matching sequences from the novel sequence graph
  for the `VariantSet`.   */
  public java.util.List<org.ga4gh.models.Segment> getSegments() {
    return segments;
  }

  /**
   * Sets the value of the 'segments' field.
   * The list of `Segment`s for matching sequences from the novel sequence graph
  for the `VariantSet`.   * @param value the value to set.
   */
  public void setSegments(java.util.List<org.ga4gh.models.Segment> value) {
    this.segments = value;
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

  /** Creates a new SearchVariantSetSequencesResponse RecordBuilder */
  public static org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder newBuilder() {
    return new org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder();
  }
  
  /** Creates a new SearchVariantSetSequencesResponse RecordBuilder by copying an existing Builder */
  public static org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder newBuilder(org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder other) {
    return new org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder(other);
  }
  
  /** Creates a new SearchVariantSetSequencesResponse RecordBuilder by copying an existing SearchVariantSetSequencesResponse instance */
  public static org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder newBuilder(org.ga4gh.methods.SearchVariantSetSequencesResponse other) {
    return new org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for SearchVariantSetSequencesResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SearchVariantSetSequencesResponse>
    implements org.apache.avro.data.RecordBuilder<SearchVariantSetSequencesResponse> {

    private java.util.List<org.ga4gh.models.Segment> segments;
    private java.lang.CharSequence nextPageToken;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.methods.SearchVariantSetSequencesResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.segments)) {
        this.segments = data().deepCopy(fields()[0].schema(), other.segments);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SearchVariantSetSequencesResponse instance */
    private Builder(org.ga4gh.methods.SearchVariantSetSequencesResponse other) {
            super(org.ga4gh.methods.SearchVariantSetSequencesResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.segments)) {
        this.segments = data().deepCopy(fields()[0].schema(), other.segments);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nextPageToken)) {
        this.nextPageToken = data().deepCopy(fields()[1].schema(), other.nextPageToken);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'segments' field */
    public java.util.List<org.ga4gh.models.Segment> getSegments() {
      return segments;
    }
    
    /** Sets the value of the 'segments' field */
    public org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder setSegments(java.util.List<org.ga4gh.models.Segment> value) {
      validate(fields()[0], value);
      this.segments = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'segments' field has been set */
    public boolean hasSegments() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'segments' field */
    public org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder clearSegments() {
      segments = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nextPageToken' field */
    public java.lang.CharSequence getNextPageToken() {
      return nextPageToken;
    }
    
    /** Sets the value of the 'nextPageToken' field */
    public org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder setNextPageToken(java.lang.CharSequence value) {
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
    public org.ga4gh.methods.SearchVariantSetSequencesResponse.Builder clearNextPageToken() {
      nextPageToken = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public SearchVariantSetSequencesResponse build() {
      try {
        SearchVariantSetSequencesResponse record = new SearchVariantSetSequencesResponse();
        record.segments = fieldSetFlags()[0] ? this.segments : (java.util.List<org.ga4gh.models.Segment>) defaultValue(fields()[0]);
        record.nextPageToken = fieldSetFlags()[1] ? this.nextPageToken : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
