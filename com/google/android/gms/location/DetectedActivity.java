package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

public class DetectedActivity
  implements SafeParcelable
{
  public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
  public static final int IN_VEHICLE = 0;
  public static final int ON_BICYCLE = 1;
  public static final int ON_FOOT = 2;
  public static final int RUNNING = 8;
  public static final int STILL = 3;
  public static final int TILTING = 5;
  public static final int UNKNOWN = 4;
  public static final int WALKING = 7;
  public static final Comparator<DetectedActivity> aee = new Comparator()
  {
    public final int a(DetectedActivity paramAnonymousDetectedActivity1, DetectedActivity paramAnonymousDetectedActivity2)
    {
      int i = Integer.valueOf(paramAnonymousDetectedActivity2.getConfidence()).compareTo(Integer.valueOf(paramAnonymousDetectedActivity1.getConfidence()));
      if (i == 0)
        i = Integer.valueOf(paramAnonymousDetectedActivity1.getType()).compareTo(Integer.valueOf(paramAnonymousDetectedActivity2.getType()));
      return i;
    }
  };
  private final int BR;
  int aef;
  int aeg;

  public DetectedActivity(int paramInt1, int paramInt2)
  {
    this.BR = 1;
    this.aef = paramInt1;
    this.aeg = paramInt2;
  }

  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.BR = paramInt1;
    this.aef = paramInt2;
    this.aeg = paramInt3;
  }

  private int ea(int paramInt)
  {
    if (paramInt > 9)
      paramInt = 4;
    return paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getConfidence()
  {
    return this.aeg;
  }

  public int getType()
  {
    return ea(this.aef);
  }

  public int getVersionCode()
  {
    return this.BR;
  }

  public String toString()
  {
    return "DetectedActivity [type=" + getType() + ", confidence=" + this.aeg + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.6.2
 */