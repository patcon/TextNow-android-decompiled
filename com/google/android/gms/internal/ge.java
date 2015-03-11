package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ge
  implements SafeParcelable
{
  public static final Parcelable.Creator<ge> CREATOR = new gf();
  private String BC;
  private final int xM;

  public ge()
  {
    this(1, null);
  }

  ge(int paramInt, String paramString)
  {
    this.xM = paramInt;
    this.BC = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public String ec()
  {
    return this.BC;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof ge))
      return false;
    ge localge = (ge)paramObject;
    return gi.a(this.BC, localge.BC);
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.BC;
    return hk.hashCode(arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    gf.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ge
 * JD-Core Version:    0.6.2
 */