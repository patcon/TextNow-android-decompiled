package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

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
  int UY;
  int UZ;
  private final int xM;

  public DetectedActivity(int paramInt1, int paramInt2)
  {
    this.xM = 1;
    this.UY = paramInt1;
    this.UZ = paramInt2;
  }

  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.xM = paramInt1;
    this.UY = paramInt2;
    this.UZ = paramInt3;
  }

  private int cF(int paramInt)
  {
    if (paramInt > 8)
      paramInt = 4;
    return paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getConfidence()
  {
    return this.UZ;
  }

  public int getType()
  {
    return cF(this.UY);
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public String toString()
  {
    return "DetectedActivity [type=" + getType() + ", confidence=" + this.UZ + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.6.2
 */