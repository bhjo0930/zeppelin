/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.zeppelin.interpreter.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-3-4")
public class ParagraphInfo implements org.apache.thrift.TBase<ParagraphInfo, ParagraphInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ParagraphInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ParagraphInfo");

  private static final org.apache.thrift.protocol.TField NOTE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("noteId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphTitle", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphText", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ParagraphInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ParagraphInfoTupleSchemeFactory());
  }

  public String noteId; // required
  public String paragraphId; // required
  public String paragraphTitle; // required
  public String paragraphText; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTE_ID((short)1, "noteId"),
    PARAGRAPH_ID((short)2, "paragraphId"),
    PARAGRAPH_TITLE((short)3, "paragraphTitle"),
    PARAGRAPH_TEXT((short)4, "paragraphText");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOTE_ID
          return NOTE_ID;
        case 2: // PARAGRAPH_ID
          return PARAGRAPH_ID;
        case 3: // PARAGRAPH_TITLE
          return PARAGRAPH_TITLE;
        case 4: // PARAGRAPH_TEXT
          return PARAGRAPH_TEXT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTE_ID, new org.apache.thrift.meta_data.FieldMetaData("noteId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAGRAPH_ID, new org.apache.thrift.meta_data.FieldMetaData("paragraphId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAGRAPH_TITLE, new org.apache.thrift.meta_data.FieldMetaData("paragraphTitle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAGRAPH_TEXT, new org.apache.thrift.meta_data.FieldMetaData("paragraphText", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ParagraphInfo.class, metaDataMap);
  }

  public ParagraphInfo() {
  }

  public ParagraphInfo(
    String noteId,
    String paragraphId,
    String paragraphTitle,
    String paragraphText)
  {
    this();
    this.noteId = noteId;
    this.paragraphId = paragraphId;
    this.paragraphTitle = paragraphTitle;
    this.paragraphText = paragraphText;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ParagraphInfo(ParagraphInfo other) {
    if (other.isSetNoteId()) {
      this.noteId = other.noteId;
    }
    if (other.isSetParagraphId()) {
      this.paragraphId = other.paragraphId;
    }
    if (other.isSetParagraphTitle()) {
      this.paragraphTitle = other.paragraphTitle;
    }
    if (other.isSetParagraphText()) {
      this.paragraphText = other.paragraphText;
    }
  }

  public ParagraphInfo deepCopy() {
    return new ParagraphInfo(this);
  }

  @Override
  public void clear() {
    this.noteId = null;
    this.paragraphId = null;
    this.paragraphTitle = null;
    this.paragraphText = null;
  }

  public String getNoteId() {
    return this.noteId;
  }

  public ParagraphInfo setNoteId(String noteId) {
    this.noteId = noteId;
    return this;
  }

  public void unsetNoteId() {
    this.noteId = null;
  }

  /** Returns true if field noteId is set (has been assigned a value) and false otherwise */
  public boolean isSetNoteId() {
    return this.noteId != null;
  }

  public void setNoteIdIsSet(boolean value) {
    if (!value) {
      this.noteId = null;
    }
  }

  public String getParagraphId() {
    return this.paragraphId;
  }

  public ParagraphInfo setParagraphId(String paragraphId) {
    this.paragraphId = paragraphId;
    return this;
  }

  public void unsetParagraphId() {
    this.paragraphId = null;
  }

  /** Returns true if field paragraphId is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphId() {
    return this.paragraphId != null;
  }

  public void setParagraphIdIsSet(boolean value) {
    if (!value) {
      this.paragraphId = null;
    }
  }

  public String getParagraphTitle() {
    return this.paragraphTitle;
  }

  public ParagraphInfo setParagraphTitle(String paragraphTitle) {
    this.paragraphTitle = paragraphTitle;
    return this;
  }

  public void unsetParagraphTitle() {
    this.paragraphTitle = null;
  }

  /** Returns true if field paragraphTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphTitle() {
    return this.paragraphTitle != null;
  }

  public void setParagraphTitleIsSet(boolean value) {
    if (!value) {
      this.paragraphTitle = null;
    }
  }

  public String getParagraphText() {
    return this.paragraphText;
  }

  public ParagraphInfo setParagraphText(String paragraphText) {
    this.paragraphText = paragraphText;
    return this;
  }

  public void unsetParagraphText() {
    this.paragraphText = null;
  }

  /** Returns true if field paragraphText is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphText() {
    return this.paragraphText != null;
  }

  public void setParagraphTextIsSet(boolean value) {
    if (!value) {
      this.paragraphText = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOTE_ID:
      if (value == null) {
        unsetNoteId();
      } else {
        setNoteId((String)value);
      }
      break;

    case PARAGRAPH_ID:
      if (value == null) {
        unsetParagraphId();
      } else {
        setParagraphId((String)value);
      }
      break;

    case PARAGRAPH_TITLE:
      if (value == null) {
        unsetParagraphTitle();
      } else {
        setParagraphTitle((String)value);
      }
      break;

    case PARAGRAPH_TEXT:
      if (value == null) {
        unsetParagraphText();
      } else {
        setParagraphText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTE_ID:
      return getNoteId();

    case PARAGRAPH_ID:
      return getParagraphId();

    case PARAGRAPH_TITLE:
      return getParagraphTitle();

    case PARAGRAPH_TEXT:
      return getParagraphText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOTE_ID:
      return isSetNoteId();
    case PARAGRAPH_ID:
      return isSetParagraphId();
    case PARAGRAPH_TITLE:
      return isSetParagraphTitle();
    case PARAGRAPH_TEXT:
      return isSetParagraphText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ParagraphInfo)
      return this.equals((ParagraphInfo)that);
    return false;
  }

  public boolean equals(ParagraphInfo that) {
    if (that == null)
      return false;

    boolean this_present_noteId = true && this.isSetNoteId();
    boolean that_present_noteId = true && that.isSetNoteId();
    if (this_present_noteId || that_present_noteId) {
      if (!(this_present_noteId && that_present_noteId))
        return false;
      if (!this.noteId.equals(that.noteId))
        return false;
    }

    boolean this_present_paragraphId = true && this.isSetParagraphId();
    boolean that_present_paragraphId = true && that.isSetParagraphId();
    if (this_present_paragraphId || that_present_paragraphId) {
      if (!(this_present_paragraphId && that_present_paragraphId))
        return false;
      if (!this.paragraphId.equals(that.paragraphId))
        return false;
    }

    boolean this_present_paragraphTitle = true && this.isSetParagraphTitle();
    boolean that_present_paragraphTitle = true && that.isSetParagraphTitle();
    if (this_present_paragraphTitle || that_present_paragraphTitle) {
      if (!(this_present_paragraphTitle && that_present_paragraphTitle))
        return false;
      if (!this.paragraphTitle.equals(that.paragraphTitle))
        return false;
    }

    boolean this_present_paragraphText = true && this.isSetParagraphText();
    boolean that_present_paragraphText = true && that.isSetParagraphText();
    if (this_present_paragraphText || that_present_paragraphText) {
      if (!(this_present_paragraphText && that_present_paragraphText))
        return false;
      if (!this.paragraphText.equals(that.paragraphText))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_noteId = true && (isSetNoteId());
    list.add(present_noteId);
    if (present_noteId)
      list.add(noteId);

    boolean present_paragraphId = true && (isSetParagraphId());
    list.add(present_paragraphId);
    if (present_paragraphId)
      list.add(paragraphId);

    boolean present_paragraphTitle = true && (isSetParagraphTitle());
    list.add(present_paragraphTitle);
    if (present_paragraphTitle)
      list.add(paragraphTitle);

    boolean present_paragraphText = true && (isSetParagraphText());
    list.add(present_paragraphText);
    if (present_paragraphText)
      list.add(paragraphText);

    return list.hashCode();
  }

  @Override
  public int compareTo(ParagraphInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNoteId()).compareTo(other.isSetNoteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noteId, other.noteId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParagraphId()).compareTo(other.isSetParagraphId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphId, other.paragraphId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParagraphTitle()).compareTo(other.isSetParagraphTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphTitle, other.paragraphTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParagraphText()).compareTo(other.isSetParagraphText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphText, other.paragraphText);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ParagraphInfo(");
    boolean first = true;

    sb.append("noteId:");
    if (this.noteId == null) {
      sb.append("null");
    } else {
      sb.append(this.noteId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphId:");
    if (this.paragraphId == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphTitle:");
    if (this.paragraphTitle == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphTitle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphText:");
    if (this.paragraphText == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphText);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ParagraphInfoStandardSchemeFactory implements SchemeFactory {
    public ParagraphInfoStandardScheme getScheme() {
      return new ParagraphInfoStandardScheme();
    }
  }

  private static class ParagraphInfoStandardScheme extends StandardScheme<ParagraphInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ParagraphInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.noteId = iprot.readString();
              struct.setNoteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAGRAPH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paragraphId = iprot.readString();
              struct.setParagraphIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAGRAPH_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paragraphTitle = iprot.readString();
              struct.setParagraphTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARAGRAPH_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paragraphText = iprot.readString();
              struct.setParagraphTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ParagraphInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.noteId != null) {
        oprot.writeFieldBegin(NOTE_ID_FIELD_DESC);
        oprot.writeString(struct.noteId);
        oprot.writeFieldEnd();
      }
      if (struct.paragraphId != null) {
        oprot.writeFieldBegin(PARAGRAPH_ID_FIELD_DESC);
        oprot.writeString(struct.paragraphId);
        oprot.writeFieldEnd();
      }
      if (struct.paragraphTitle != null) {
        oprot.writeFieldBegin(PARAGRAPH_TITLE_FIELD_DESC);
        oprot.writeString(struct.paragraphTitle);
        oprot.writeFieldEnd();
      }
      if (struct.paragraphText != null) {
        oprot.writeFieldBegin(PARAGRAPH_TEXT_FIELD_DESC);
        oprot.writeString(struct.paragraphText);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ParagraphInfoTupleSchemeFactory implements SchemeFactory {
    public ParagraphInfoTupleScheme getScheme() {
      return new ParagraphInfoTupleScheme();
    }
  }

  private static class ParagraphInfoTupleScheme extends TupleScheme<ParagraphInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ParagraphInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNoteId()) {
        optionals.set(0);
      }
      if (struct.isSetParagraphId()) {
        optionals.set(1);
      }
      if (struct.isSetParagraphTitle()) {
        optionals.set(2);
      }
      if (struct.isSetParagraphText()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNoteId()) {
        oprot.writeString(struct.noteId);
      }
      if (struct.isSetParagraphId()) {
        oprot.writeString(struct.paragraphId);
      }
      if (struct.isSetParagraphTitle()) {
        oprot.writeString(struct.paragraphTitle);
      }
      if (struct.isSetParagraphText()) {
        oprot.writeString(struct.paragraphText);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ParagraphInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.noteId = iprot.readString();
        struct.setNoteIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.paragraphId = iprot.readString();
        struct.setParagraphIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.paragraphTitle = iprot.readString();
        struct.setParagraphTitleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.paragraphText = iprot.readString();
        struct.setParagraphTextIsSet(true);
      }
    }
  }

}

