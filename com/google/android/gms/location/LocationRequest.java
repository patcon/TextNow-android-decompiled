package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

public final class LocationRequest
  implements SafeParcelable
{
  public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
  public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
  public static final int PRIORITY_HIGH_ACCURACY = 100;
  public static final int PRIORITY_LOW_POWER = 104;
  public static final int PRIORITY_NO_POWER = 105;
  long Vb;
  long Vl;
  long Vm;
  boolean Vn;
  int Vo;
  float Vp;
  int mPriority;
  private final int xM;

  public LocationRequest()
  {
    this.xM = 1;
    this.mPriority = 102;
    this.Vl = 3600000L;
    this.Vm = 600000L;
    this.Vn = false;
    this.Vb = 9223372036854775807L;
    this.Vo = 2147483647;
    this.Vp = 0.0F;
  }

  LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat)
  {
    this.xM = paramInt1;
    this.mPriority = paramInt2;
    this.Vl = paramLong1;
    this.Vm = paramLong2;
    this.Vn = paramBoolean;
    this.Vb = paramLong3;
    this.Vo = paramInt3;
    this.Vp = paramFloat;
  }

  private static void a(float paramFloat)
  {
    if (paramFloat < 0.0F)
      throw new IllegalArgumentException("invalid displacement: " + paramFloat);
  }

  private static void cG(int paramInt)
  {
    switch (paramInt)
    {
    case 101:
    case 103:
    default:
      throw new IllegalArgumentException("invalid quality: " + paramInt);
    case 100:
    case 102:
    case 104:
    case 105:
    }
  }

  public static String cH(int paramInt)
  {
    switch (paramInt)
    {
    case 101:
    case 103:
    default:
      return "???";
    case 100:
      return "PRIORITY_HIGH_ACCURACY";
    case 102:
      return "PRIORITY_BALANCED_POWER_ACCURACY";
    case 104:
      return "PRIORITY_LOW_POWER";
    case 105:
    }
    return "PRIORITY_NO_POWER";
  }

  public static LocationRequest create()
  {
    return new LocationRequest();
  }

  private static void v(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("invalid interval: " + paramLong);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LocationRequest localLocationRequest;
    do
    {
      return true;
      if (!(paramObject instanceof LocationRequest))
        return false;
      localLocationRequest = (LocationRequest)paramObject;
    }
    while ((this.mPriority == localLocationRequest.mPriority) && (this.Vl == localLocationRequest.Vl) && (this.Vm == localLocationRequest.Vm) && (this.Vn == localLocationRequest.Vn) && (this.Vb == localLocationRequest.Vb) && (this.Vo == localLocationRequest.Vo) && (this.Vp == localLocationRequest.Vp));
    return false;
  }

  public final long getExpirationTime()
  {
    return this.Vb;
  }

  public final long getFastestInterval()
  {
    return this.Vm;
  }

  public final long getInterval()
  {
    return this.Vl;
  }

  public final int getNumUpdates()
  {
    return this.Vo;
  }

  public final int getPriority()
  {
    return this.mPriority;
  }

  public final float getSmallestDisplacement()
  {
    return this.Vp;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.mPriority);
    arrayOfObject[1] = Long.valueOf(this.Vl);
    arrayOfObject[2] = Long.valueOf(this.Vm);
    arrayOfObject[3] = Boolean.valueOf(this.Vn);
    arrayOfObject[4] = Long.valueOf(this.Vb);
    arrayOfObject[5] = Integer.valueOf(this.Vo);
    arrayOfObject[6] = Float.valueOf(this.Vp);
    return hk.hashCode(arrayOfObject);
  }

  public final LocationRequest setExpirationDuration(long paramLong)
  {
    long l = SystemClock.elapsedRealtime();
    if (paramLong > 9223372036854775807L - l);
    for (this.Vb = 9223372036854775807L; ; this.Vb = (l + paramLong))
    {
      if (this.Vb < 0L)
        this.Vb = 0L;
      return this;
    }
  }

  public final LocationRequest setExpirationTime(long paramLong)
  {
    this.Vb = paramLong;
    if (this.Vb < 0L)
      this.Vb = 0L;
    return this;
  }

  public final LocationRequest setFastestInterval(long paramLong)
  {
    v(paramLong);
    this.Vn = true;
    this.Vm = paramLong;
    return this;
  }

  public final LocationRequest setInterval(long paramLong)
  {
    v(paramLong);
    this.Vl = paramLong;
    if (!this.Vn)
      this.Vm = (()(this.Vl / 6.0D));
    return this;
  }

  public final LocationRequest setNumUpdates(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("invalid numUpdates: " + paramInt);
    this.Vo = paramInt;
    return this;
  }

  public final LocationRequest setPriority(int paramInt)
  {
    cG(paramInt);
    this.mPriority = paramInt;
    return this;
  }

  public final LocationRequest setSmallestDisplacement(float paramFloat)
  {
    a(paramFloat);
    this.Vp = paramFloat;
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Request[").append(cH(this.mPriority));
    if (this.mPriority != 105)
    {
      localStringBuilder.append(" requested=");
      localStringBuilder.append(this.Vl + "ms");
    }
    localStringBuilder.append(" fastest=");
    localStringBuilder.append(this.Vm + "ms");
    if (this.Vb != 9223372036854775807L)
    {
      long l = this.Vb - SystemClock.elapsedRealtime();
      localStringBuilder.append(" expireIn=");
      localStringBuilder.append(l + "ms");
    }
    if (this.Vo != 2147483647)
      localStringBuilder.append(" num=").append(this.Vo);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    LocationRequestCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationRequest
 * JD-Core Version:    0.6.2
 */