/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.ga4gh.models;  
@SuppressWarnings("all")
/** `Allele`s are the key component of the "allelic" model of variation: they are
single objects that are present in some copy number.

An `Allele` is a contiguous piece of sequence that we will want to say is
present (in general at some copy number) or absent in a sample. Very often it
will just be a single `Segment` covering the entirety of a novel sequence, but
it is also common for it to be a mix of `Segment`s on reference and novel
sequences, or in general to be any contiguous path through the augmented
sequence graph.

`Allele`s belong to `VariantSet`s. `Allele`s can also be used to represent the
reference and alternate alleles of `Variant`s.

Note that `Path`s cannot follow adjacencies not represented in the augmented
sequence graph. For example, if  an `Allele` that spans a novel deletion is
required, a new empty-string sequence should exist to describe that deletion
adjacency, with a `Segment` describing that sequence available through
`searchVariantSetSequences()` or `getVariantSetSequence()`. */
@org.apache.avro.specific.AvroGenerated
public class Allele extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Allele\",\"namespace\":\"org.ga4gh.models\",\"doc\":\"`Allele`s are the key component of the \\\"allelic\\\" model of variation: they are\\nsingle objects that are present in some copy number.\\n\\nAn `Allele` is a contiguous piece of sequence that we will want to say is\\npresent (in general at some copy number) or absent in a sample. Very often it\\nwill just be a single `Segment` covering the entirety of a novel sequence, but\\nit is also common for it to be a mix of `Segment`s on reference and novel\\nsequences, or in general to be any contiguous path through the augmented\\nsequence graph.\\n\\n`Allele`s belong to `VariantSet`s. `Allele`s can also be used to represent the\\nreference and alternate alleles of `Variant`s.\\n\\nNote that `Path`s cannot follow adjacencies not represented in the augmented\\nsequence graph. For example, if  an `Allele` that spans a novel deletion is\\nrequired, a new empty-string sequence should exist to describe that deletion\\nadjacency, with a `Segment` describing that sequence available through\\n`searchVariantSetSequences()` or `getVariantSetSequence()`.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The ID of this `Allele`. If this `Allele` is one `Segment` consisting of\\n  the entirety of a sequence, this is equal to the ID of that sequence.\"},{\"name\":\"variantSetId\",\"type\":\"string\",\"doc\":\"The ID of the variant set this allele belongs to.\"},{\"name\":\"path\",\"type\":{\"type\":\"record\",\"name\":\"Path\",\"doc\":\"A `Path` is an ordered list of `Segment`s. In general any contiguous path\\nthrough a sequence graph, with no novel adjacencies, can be represented by a\\n`Path`.\",\"fields\":[{\"name\":\"segments\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Segment\",\"doc\":\"A `Segment` is a range on a sequence, possibly including the joins at the\\nsequence's ends. It does not include base data. (The bases for a sequence are\\navailable through the `getSequenceBases()` API call.)\\n\\nIn the sequence \\\"GTGG\\\", the segment starting at index 1 on the forward strand\\nwith length 2 is the \\\"TG\\\" on the forward strand. The length-2 segment starting\\nat index 1 on the reverse strand is \\\"AC\\\", corresponding to the first two base\\npairs of the sequence, or the last two bases of the reverse complement.\",\"fields\":[{\"name\":\"start\",\"type\":{\"type\":\"record\",\"name\":\"Position\",\"doc\":\"A `Position` is a side of a base pair in some already known sequence. A\\n`Position` is represented by a sequence name or ID, a base number on that\\nsequence (0-based), and a `Strand` to indicate the left or right side.\\n\\nFor example, given the sequence \\\"GTGG\\\", the `Position` on that sequence at\\noffset 1 in the forward orientation would be the left side of the T/A base pair.\\nThe base at this `Position` is \\\"T\\\". Alternately, for offset 1 in the reverse\\norientation, the `Position` would be the right side of the T/A base pair, and\\nthe base at the `Position` is \\\"A\\\".\\n\\nOffsets added to a `Position` are interpreted as reading along its strand;\\nadding to a reverse strand position actually subtracts from its `position`\\nmember.\",\"fields\":[{\"name\":\"referenceName\",\"type\":[\"null\",\"string\"],\"doc\":\"The name of the reference sequence in whatever reference set is being used.\\n  Does not generally include a \\\"chr\\\" prefix, so for example \\\"X\\\" would be used\\n  for the X chromosome.\\n\\n  If `sequenceId` is null, this must not be null.\",\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the sequence on which the `Position` is located. This may be a\\n  `Reference` sequence, or a novel piece of sequence associated with a\\n  `VariantSet`.\\n\\n  If `referenceName` is null, this must not be null.\\n\\n  If the server supports the \\\"graph\\\" mode, this must not be null.\",\"default\":null},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"The 0-based offset from the start of the forward strand for that sequence.\\n  Genomic positions are non-negative integers less than sequence length.\"},{\"name\":\"strand\",\"type\":{\"type\":\"enum\",\"name\":\"Strand\",\"doc\":\"Indicates the DNA strand associate for some data item.\\n* `POS_STRAND`:  The postive (+) strand.\\n* `NEG_STRAND`: The negative (-) strand.\\n* `NO_STRAND`: Strand-independent data or data where the strand can not be determined.\",\"symbols\":[\"POS_STRAND\",\"NEG_STRAND\",\"NO_STRAND\"]},\"doc\":\"Strand the position is associated with. `POS_STRAND` represents the forward\\n  strand, or equivalently the left side of a base, and `NEG_STRAND` represents\\n  the reverse strand, or equivalently the right side of a base.\"}]},\"doc\":\"The sequence ID and start index of this `Segment`. This base is always\\n  included in the segment, regardless of orientation.\"},{\"name\":\"length\",\"type\":\"long\",\"doc\":\"The length of this `Segment`'s sequence. If `start` is on the forward strand,\\n  the `Segment` contains the range [`start.position`, `start.position` +\\n  `length`). If `start` is on the reverse strand, the `Segment` contains the\\n  range (`start.position` - `length`, `start.position`]. This is equivalent to\\n  starting from the side indicated by `start`, and traversing through that base\\n  out to the specified length.\"},{\"name\":\"startJoin\",\"type\":[\"null\",\"Position\"],\"doc\":\"Start and end `Position`s where this `Segment` attaches to other sequences.\\n  Note that the segmentId for start and end might not be the same. The\\n  `Segment`s covering the sequences onto which this `Segment` is joined are\\n  called its \\\"parents\\\", while this segment is a \\\"child\\\".\\n\\n  Joins may occur on the outer sides of the terminal bases in a sequence: the\\n  left side of the base at index 0, and the right side of the base with maximum\\n  index. These are the \\\"terminal sides\\\" of the sequence. `startJoin` is the join\\n  on the side indicated by `start`, and may only be set if that side is a\\n  terminal side. Similarly, `endJoin` is the join on the opposite side of the\\n  piece of sequence selected by the segment, and may only be set if that side is\\n  a terminal side. The value of `startJoin` or `endJoin`, if set, is the side to\\n  which the corresponding side of this `Sequence` is connected.\",\"default\":null},{\"name\":\"endJoin\",\"type\":[\"null\",\"Position\"],\"default\":null}]}},\"doc\":\"We require that one of each consecutive pair of `Segment`s in a `Path` be\\n  joined onto the other. `Segment`s appear in the order in which they occur when\\n  walking the path from one end to the other.\",\"default\":[]}]},\"doc\":\"The ordered and oriented `Segment`s of DNA that this `Allele` represents.\\n  Note that a `Segment` in this `Path` that is 0-length represents the\\n  adjacency immediately before the named base.\\n\\n  `Segment`s on this `Path` are on either `Reference` sequences, or sequences\\n  available through the `getVariantSetSequence()` API call.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The ID of this `Allele`. If this `Allele` is one `Segment` consisting of
  the entirety of a sequence, this is equal to the ID of that sequence. */
  @Deprecated public java.lang.CharSequence id;
  /** The ID of the variant set this allele belongs to. */
  @Deprecated public java.lang.CharSequence variantSetId;
  /** The ordered and oriented `Segment`s of DNA that this `Allele` represents.
  Note that a `Segment` in this `Path` that is 0-length represents the
  adjacency immediately before the named base.

  `Segment`s on this `Path` are on either `Reference` sequences, or sequences
  available through the `getVariantSetSequence()` API call. */
  @Deprecated public org.ga4gh.models.Path path;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Allele() {}

  /**
   * All-args constructor.
   */
  public Allele(java.lang.CharSequence id, java.lang.CharSequence variantSetId, org.ga4gh.models.Path path) {
    this.id = id;
    this.variantSetId = variantSetId;
    this.path = path;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return variantSetId;
    case 2: return path;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: variantSetId = (java.lang.CharSequence)value$; break;
    case 2: path = (org.ga4gh.models.Path)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * The ID of this `Allele`. If this `Allele` is one `Segment` consisting of
  the entirety of a sequence, this is equal to the ID of that sequence.   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The ID of this `Allele`. If this `Allele` is one `Segment` consisting of
  the entirety of a sequence, this is equal to the ID of that sequence.   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'variantSetId' field.
   * The ID of the variant set this allele belongs to.   */
  public java.lang.CharSequence getVariantSetId() {
    return variantSetId;
  }

  /**
   * Sets the value of the 'variantSetId' field.
   * The ID of the variant set this allele belongs to.   * @param value the value to set.
   */
  public void setVariantSetId(java.lang.CharSequence value) {
    this.variantSetId = value;
  }

  /**
   * Gets the value of the 'path' field.
   * The ordered and oriented `Segment`s of DNA that this `Allele` represents.
  Note that a `Segment` in this `Path` that is 0-length represents the
  adjacency immediately before the named base.

  `Segment`s on this `Path` are on either `Reference` sequences, or sequences
  available through the `getVariantSetSequence()` API call.   */
  public org.ga4gh.models.Path getPath() {
    return path;
  }

  /**
   * Sets the value of the 'path' field.
   * The ordered and oriented `Segment`s of DNA that this `Allele` represents.
  Note that a `Segment` in this `Path` that is 0-length represents the
  adjacency immediately before the named base.

  `Segment`s on this `Path` are on either `Reference` sequences, or sequences
  available through the `getVariantSetSequence()` API call.   * @param value the value to set.
   */
  public void setPath(org.ga4gh.models.Path value) {
    this.path = value;
  }

  /** Creates a new Allele RecordBuilder */
  public static org.ga4gh.models.Allele.Builder newBuilder() {
    return new org.ga4gh.models.Allele.Builder();
  }
  
  /** Creates a new Allele RecordBuilder by copying an existing Builder */
  public static org.ga4gh.models.Allele.Builder newBuilder(org.ga4gh.models.Allele.Builder other) {
    return new org.ga4gh.models.Allele.Builder(other);
  }
  
  /** Creates a new Allele RecordBuilder by copying an existing Allele instance */
  public static org.ga4gh.models.Allele.Builder newBuilder(org.ga4gh.models.Allele other) {
    return new org.ga4gh.models.Allele.Builder(other);
  }
  
  /**
   * RecordBuilder for Allele instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Allele>
    implements org.apache.avro.data.RecordBuilder<Allele> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence variantSetId;
    private org.ga4gh.models.Path path;

    /** Creates a new Builder */
    private Builder() {
      super(org.ga4gh.models.Allele.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.ga4gh.models.Allele.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetId)) {
        this.variantSetId = data().deepCopy(fields()[1].schema(), other.variantSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.path)) {
        this.path = data().deepCopy(fields()[2].schema(), other.path);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Allele instance */
    private Builder(org.ga4gh.models.Allele other) {
            super(org.ga4gh.models.Allele.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.variantSetId)) {
        this.variantSetId = data().deepCopy(fields()[1].schema(), other.variantSetId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.path)) {
        this.path = data().deepCopy(fields()[2].schema(), other.path);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.ga4gh.models.Allele.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.ga4gh.models.Allele.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'variantSetId' field */
    public java.lang.CharSequence getVariantSetId() {
      return variantSetId;
    }
    
    /** Sets the value of the 'variantSetId' field */
    public org.ga4gh.models.Allele.Builder setVariantSetId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.variantSetId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'variantSetId' field has been set */
    public boolean hasVariantSetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'variantSetId' field */
    public org.ga4gh.models.Allele.Builder clearVariantSetId() {
      variantSetId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'path' field */
    public org.ga4gh.models.Path getPath() {
      return path;
    }
    
    /** Sets the value of the 'path' field */
    public org.ga4gh.models.Allele.Builder setPath(org.ga4gh.models.Path value) {
      validate(fields()[2], value);
      this.path = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'path' field has been set */
    public boolean hasPath() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'path' field */
    public org.ga4gh.models.Allele.Builder clearPath() {
      path = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Allele build() {
      try {
        Allele record = new Allele();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.variantSetId = fieldSetFlags()[1] ? this.variantSetId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.path = fieldSetFlags()[2] ? this.path : (org.ga4gh.models.Path) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
