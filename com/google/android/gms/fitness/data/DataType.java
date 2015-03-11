package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jr;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DataType
  implements SafeParcelable
{
  public static final DataType AGGREGATE_ACTIVITY_SUMMARY;
  public static final DataType AGGREGATE_DISTANCE_DELTA;
  public static final DataType AGGREGATE_HEART_RATE_SUMMARY;
  public static final Set<DataType> AGGREGATE_INPUT_TYPES;
  public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX;
  public static final DataType AGGREGATE_POWER_SUMMARY;
  public static final DataType AGGREGATE_SPEED_SUMMARY;
  public static final DataType AGGREGATE_STEP_COUNT_DELTA;
  public static final DataType AGGREGATE_WEIGHT_SUMMARY;
  public static final Parcelable.Creator<DataType> CREATOR = new h();
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
  public static final DataType ST;
  public static final DataType SU;
  private static final Map<DataType, List<DataType>> SV;
  public static final DataType[] SW;
  public static final String[] SX;
  public static final DataType TYPE_ACTIVITY_SAMPLE;
  public static final DataType TYPE_ACTIVITY_SEGMENT;
  public static final DataType TYPE_CALORIES_CONSUMED;
  public static final DataType TYPE_CALORIES_EXPENDED;
  public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
  public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
  public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
  public static final DataType TYPE_CYCLING_WHEEL_RPM;
  public static final DataType TYPE_DISTANCE_CUMULATIVE;
  public static final DataType TYPE_DISTANCE_DELTA;
  public static final DataType TYPE_HEART_RATE_BPM;
  public static final DataType TYPE_HEIGHT;
  public static final DataType TYPE_LOCATION_SAMPLE;
  public static final DataType TYPE_POWER_SAMPLE;
  public static final DataType TYPE_SPEED;
  public static final DataType TYPE_STEP_COUNT_CADENCE;
  public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
  public static final DataType TYPE_STEP_COUNT_DELTA;
  public static final DataType TYPE_WEIGHT;
  private final int BR;
  private final List<Field> SY;
  private final String mName;

  static
  {
    Field[] arrayOfField1 = new Field[1];
    arrayOfField1[0] = Field.FIELD_STEPS;
    TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", arrayOfField1);
    Field[] arrayOfField2 = new Field[1];
    arrayOfField2[0] = Field.FIELD_STEPS;
    TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", arrayOfField2);
    Field[] arrayOfField3 = new Field[1];
    arrayOfField3[0] = Field.FIELD_RPM;
    TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", arrayOfField3);
    Field[] arrayOfField4 = new Field[1];
    arrayOfField4[0] = Field.FIELD_ACTIVITY;
    TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", arrayOfField4);
    Field[] arrayOfField5 = new Field[1];
    arrayOfField5[0] = Field.FIELD_CALORIES;
    TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", arrayOfField5);
    Field[] arrayOfField6 = new Field[1];
    arrayOfField6[0] = Field.FIELD_CALORIES;
    TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", arrayOfField6);
    Field[] arrayOfField7 = new Field[1];
    arrayOfField7[0] = Field.FIELD_WATTS;
    TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", arrayOfField7);
    Field[] arrayOfField8 = new Field[2];
    arrayOfField8[0] = Field.FIELD_ACTIVITY;
    arrayOfField8[1] = Field.FIELD_CONFIDENCE;
    TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", arrayOfField8);
    Field[] arrayOfField9 = new Field[2];
    arrayOfField9[0] = Field.FIELD_ACTIVITY;
    arrayOfField9[1] = Field.Td;
    ST = new DataType("com.google.activity.edge", arrayOfField9);
    Field[] arrayOfField10 = new Field[3];
    arrayOfField10[0] = Field.Te;
    arrayOfField10[1] = Field.Tf;
    arrayOfField10[2] = Field.Tg;
    SU = new DataType("com.google.accelerometer", arrayOfField10);
    Field[] arrayOfField11 = new Field[1];
    arrayOfField11[0] = Field.FIELD_BPM;
    TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", arrayOfField11);
    Field[] arrayOfField12 = new Field[4];
    arrayOfField12[0] = Field.FIELD_LATITUDE;
    arrayOfField12[1] = Field.FIELD_LONGITUDE;
    arrayOfField12[2] = Field.FIELD_ACCURACY;
    arrayOfField12[3] = Field.FIELD_ALTITUDE;
    TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", arrayOfField12);
    Field[] arrayOfField13 = new Field[1];
    arrayOfField13[0] = Field.FIELD_DISTANCE;
    TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", arrayOfField13);
    Field[] arrayOfField14 = new Field[1];
    arrayOfField14[0] = Field.FIELD_DISTANCE;
    TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", arrayOfField14);
    Field[] arrayOfField15 = new Field[1];
    arrayOfField15[0] = Field.FIELD_SPEED;
    TYPE_SPEED = new DataType("com.google.speed", arrayOfField15);
    Field[] arrayOfField16 = new Field[1];
    arrayOfField16[0] = Field.FIELD_REVOLUTIONS;
    TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", arrayOfField16);
    Field[] arrayOfField17 = new Field[1];
    arrayOfField17[0] = Field.FIELD_RPM;
    TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", arrayOfField17);
    Field[] arrayOfField18 = new Field[1];
    arrayOfField18[0] = Field.FIELD_REVOLUTIONS;
    TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", arrayOfField18);
    Field[] arrayOfField19 = new Field[1];
    arrayOfField19[0] = Field.FIELD_RPM;
    TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", arrayOfField19);
    Field[] arrayOfField20 = new Field[1];
    arrayOfField20[0] = Field.FIELD_HEIGHT;
    TYPE_HEIGHT = new DataType("com.google.height", arrayOfField20);
    Field[] arrayOfField21 = new Field[1];
    arrayOfField21[0] = Field.FIELD_WEIGHT;
    TYPE_WEIGHT = new DataType("com.google.weight", arrayOfField21);
    DataType[] arrayOfDataType1 = new DataType[7];
    arrayOfDataType1[0] = TYPE_STEP_COUNT_DELTA;
    arrayOfDataType1[1] = TYPE_DISTANCE_DELTA;
    arrayOfDataType1[2] = TYPE_ACTIVITY_SEGMENT;
    arrayOfDataType1[3] = TYPE_SPEED;
    arrayOfDataType1[4] = TYPE_HEART_RATE_BPM;
    arrayOfDataType1[5] = TYPE_WEIGHT;
    arrayOfDataType1[6] = TYPE_LOCATION_SAMPLE;
    AGGREGATE_INPUT_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrayOfDataType1)));
    Field[] arrayOfField22 = new Field[3];
    arrayOfField22[0] = Field.FIELD_ACTIVITY;
    arrayOfField22[1] = Field.FIELD_DURATION;
    arrayOfField22[2] = Field.FIELD_NUM_SEGMENTS;
    AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", arrayOfField22);
    AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
    AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
    Field[] arrayOfField23 = new Field[3];
    arrayOfField23[0] = Field.FIELD_AVERAGE;
    arrayOfField23[1] = Field.FIELD_MAX;
    arrayOfField23[2] = Field.FIELD_MIN;
    AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", arrayOfField23);
    Field[] arrayOfField24 = new Field[4];
    arrayOfField24[0] = Field.FIELD_LOW_LATITUDE;
    arrayOfField24[1] = Field.FIELD_LOW_LONGITUDE;
    arrayOfField24[2] = Field.FIELD_HIGH_LATITUDE;
    arrayOfField24[3] = Field.FIELD_HIGH_LONGITUDE;
    AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", arrayOfField24);
    Field[] arrayOfField25 = new Field[3];
    arrayOfField25[0] = Field.FIELD_AVERAGE;
    arrayOfField25[1] = Field.FIELD_MAX;
    arrayOfField25[2] = Field.FIELD_MIN;
    AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", arrayOfField25);
    Field[] arrayOfField26 = new Field[3];
    arrayOfField26[0] = Field.FIELD_AVERAGE;
    arrayOfField26[1] = Field.FIELD_MAX;
    arrayOfField26[2] = Field.FIELD_MIN;
    AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", arrayOfField26);
    Field[] arrayOfField27 = new Field[3];
    arrayOfField27[0] = Field.FIELD_AVERAGE;
    arrayOfField27[1] = Field.FIELD_MAX;
    arrayOfField27[2] = Field.FIELD_MIN;
    AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", arrayOfField27);
    SV = new HashMap()
    {
    };
    DataType[] arrayOfDataType2 = new DataType[27];
    arrayOfDataType2[0] = SU;
    arrayOfDataType2[1] = ST;
    arrayOfDataType2[2] = TYPE_ACTIVITY_SAMPLE;
    arrayOfDataType2[3] = TYPE_ACTIVITY_SEGMENT;
    arrayOfDataType2[4] = AGGREGATE_ACTIVITY_SUMMARY;
    arrayOfDataType2[5] = TYPE_CALORIES_CONSUMED;
    arrayOfDataType2[6] = TYPE_CALORIES_EXPENDED;
    arrayOfDataType2[7] = TYPE_CYCLING_PEDALING_CADENCE;
    arrayOfDataType2[8] = TYPE_CYCLING_PEDALING_CUMULATIVE;
    arrayOfDataType2[9] = TYPE_CYCLING_WHEEL_REVOLUTION;
    arrayOfDataType2[10] = TYPE_CYCLING_WHEEL_RPM;
    arrayOfDataType2[11] = TYPE_DISTANCE_CUMULATIVE;
    arrayOfDataType2[12] = TYPE_DISTANCE_DELTA;
    arrayOfDataType2[13] = TYPE_HEART_RATE_BPM;
    arrayOfDataType2[14] = AGGREGATE_HEART_RATE_SUMMARY;
    arrayOfDataType2[15] = TYPE_HEIGHT;
    arrayOfDataType2[16] = AGGREGATE_LOCATION_BOUNDING_BOX;
    arrayOfDataType2[17] = TYPE_LOCATION_SAMPLE;
    arrayOfDataType2[18] = TYPE_POWER_SAMPLE;
    arrayOfDataType2[19] = AGGREGATE_POWER_SUMMARY;
    arrayOfDataType2[20] = TYPE_SPEED;
    arrayOfDataType2[21] = AGGREGATE_SPEED_SUMMARY;
    arrayOfDataType2[22] = TYPE_STEP_COUNT_CADENCE;
    arrayOfDataType2[23] = TYPE_STEP_COUNT_CUMULATIVE;
    arrayOfDataType2[24] = TYPE_STEP_COUNT_DELTA;
    arrayOfDataType2[25] = TYPE_WEIGHT;
    arrayOfDataType2[26] = AGGREGATE_WEIGHT_SUMMARY;
    SW = arrayOfDataType2;
    String[] arrayOfString = new String[27];
    arrayOfString[0] = SU.getName();
    arrayOfString[1] = ST.getName();
    arrayOfString[2] = TYPE_ACTIVITY_SAMPLE.getName();
    arrayOfString[3] = TYPE_ACTIVITY_SEGMENT.getName();
    arrayOfString[4] = AGGREGATE_ACTIVITY_SUMMARY.getName();
    arrayOfString[5] = TYPE_CALORIES_CONSUMED.getName();
    arrayOfString[6] = TYPE_CALORIES_EXPENDED.getName();
    arrayOfString[7] = TYPE_CYCLING_PEDALING_CADENCE.getName();
    arrayOfString[8] = TYPE_CYCLING_PEDALING_CUMULATIVE.getName();
    arrayOfString[9] = TYPE_CYCLING_WHEEL_REVOLUTION.getName();
    arrayOfString[10] = TYPE_CYCLING_WHEEL_RPM.getName();
    arrayOfString[11] = TYPE_DISTANCE_CUMULATIVE.getName();
    arrayOfString[12] = TYPE_DISTANCE_DELTA.getName();
    arrayOfString[13] = TYPE_HEART_RATE_BPM.getName();
    arrayOfString[14] = AGGREGATE_HEART_RATE_SUMMARY.getName();
    arrayOfString[15] = TYPE_HEIGHT.getName();
    arrayOfString[16] = AGGREGATE_LOCATION_BOUNDING_BOX.getName();
    arrayOfString[17] = TYPE_LOCATION_SAMPLE.getName();
    arrayOfString[18] = TYPE_POWER_SAMPLE.getName();
    arrayOfString[19] = AGGREGATE_POWER_SUMMARY.getName();
    arrayOfString[20] = TYPE_SPEED.getName();
    arrayOfString[21] = AGGREGATE_SPEED_SUMMARY.getName();
    arrayOfString[22] = TYPE_STEP_COUNT_CADENCE.getName();
    arrayOfString[23] = TYPE_STEP_COUNT_CUMULATIVE.getName();
    arrayOfString[24] = TYPE_STEP_COUNT_DELTA.getName();
    arrayOfString[25] = TYPE_WEIGHT.getName();
    arrayOfString[26] = AGGREGATE_WEIGHT_SUMMARY.getName();
    SX = arrayOfString;
  }

  DataType(int paramInt, String paramString, List<Field> paramList)
  {
    this.BR = paramInt;
    this.mName = paramString;
    this.SY = Collections.unmodifiableList(paramList);
  }

  public DataType(String paramString, Field[] paramArrayOfField)
  {
    this(1, paramString, jr.b(paramArrayOfField));
  }

  private boolean a(DataType paramDataType)
  {
    return (this.mName.equals(paramDataType.mName)) && (this.SY.equals(paramDataType.SY));
  }

  public static List<DataType> getAggregatesForInput(DataType paramDataType)
  {
    List localList = (List)SV.get(paramDataType);
    if (localList == null)
      return Collections.emptyList();
    return Collections.unmodifiableList(localList);
  }

  public static String getMimeType(DataType paramDataType)
  {
    return "vnd.google.fitness.data_type/" + paramDataType.getName();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataType)) && (a((DataType)paramObject)));
  }

  public final List<Field> getFields()
  {
    return this.SY;
  }

  public final String getName()
  {
    return this.mName;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    return this.mName.hashCode();
  }

  public final String iQ()
  {
    if (this.mName.startsWith("com.google."))
      return this.mName.substring(11);
    return this.mName;
  }

  public final int indexOf(Field paramField)
  {
    if (this.SY.contains(paramField))
      return this.SY.indexOf(paramField);
    throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[] { paramField, this }));
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.mName;
    arrayOfObject[1] = this.SY;
    return String.format("DataType{%s%s}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataType
 * JD-Core Version:    0.6.2
 */