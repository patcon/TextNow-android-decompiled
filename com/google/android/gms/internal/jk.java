package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jk
  implements SafeParcelable
{
  public static final jl CREATOR = new jl();
  private final int Va;
  private final int Wa;
  private final jm Wb;
  private final int xM;

  jk(int paramInt1, int paramInt2, int paramInt3, jm paramjm)
  {
    this.xM = paramInt1;
    this.Va = paramInt2;
    this.Wa = paramInt3;
    this.Wb = paramjm;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    jk localjk;
    do
    {
      return true;
      if (!(paramObject instanceof jk))
        return false;
      localjk = (jk)paramObject;
    }
    while ((this.Va == localjk.Va) && (this.Wa == localjk.Wa) && (this.Wb.equals(localjk.Wb)));
    return false;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.Va);
    arrayOfObject[1] = Integer.valueOf(this.Wa);
    return hk.hashCode(arrayOfObject);
  }

  public final int jc()
  {
    return this.Va;
  }

  public final int je()
  {
    return this.Wa;
  }

  public final jm jf()
  {
    return this.Wb;
  }

  public final String toString()
  {
    return hk.e(this).a("transitionTypes", Integer.valueOf(this.Va)).a("loiteringTimeMillis", Integer.valueOf(this.Wa)).a("placeFilter", this.Wb).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jl.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jk
 * JD-Core Version:    0.6.2
 */