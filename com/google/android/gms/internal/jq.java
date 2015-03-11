package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

public final class jq
  implements SafeParcelable
{
  public static final jr CREATOR = new jr();
  static final long Wm = TimeUnit.HOURS.toMillis(1L);
  private final long Vl;
  private final jm Wn;
  private final int mPriority;
  final int xM;

  public jq(int paramInt1, jm paramjm, long paramLong, int paramInt2)
  {
    this.xM = paramInt1;
    this.Wn = paramjm;
    this.Vl = paramLong;
    this.mPriority = paramInt2;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    jq localjq;
    do
    {
      return true;
      if (!(paramObject instanceof jq))
        return false;
      localjq = (jq)paramObject;
    }
    while ((hk.equal(this.Wn, localjq.Wn)) && (this.Vl == localjq.Vl) && (this.mPriority == localjq.mPriority));
    return false;
  }

  public final long getInterval()
  {
    return this.Vl;
  }

  public final int getPriority()
  {
    return this.mPriority;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.Wn;
    arrayOfObject[1] = Long.valueOf(this.Vl);
    arrayOfObject[2] = Integer.valueOf(this.mPriority);
    return hk.hashCode(arrayOfObject);
  }

  public final jm jf()
  {
    return this.Wn;
  }

  public final String toString()
  {
    return hk.e(this).a("filter", this.Wn).a("interval", Long.valueOf(this.Vl)).a("priority", Integer.valueOf(this.mPriority)).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jr.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jq
 * JD-Core Version:    0.6.2
 */