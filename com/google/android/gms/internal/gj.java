package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class gj
  implements SafeParcelable
{
  public static final Parcelable.Creator<gj> CREATOR = new gk();
  private double AP;
  private boolean AQ;
  private int BR;
  private final int xM;

  public gj()
  {
    this(1, (0.0D / 0.0D), false, -1);
  }

  gj(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2)
  {
    this.xM = paramInt1;
    this.AP = paramDouble;
    this.AQ = paramBoolean;
    this.BR = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public double eh()
  {
    return this.AP;
  }

  public boolean en()
  {
    return this.AQ;
  }

  public int eo()
  {
    return this.BR;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    gj localgj;
    do
    {
      return true;
      if (!(paramObject instanceof gj))
        return false;
      localgj = (gj)paramObject;
    }
    while ((this.AP == localgj.AP) && (this.AQ == localgj.AQ) && (this.BR == localgj.BR));
    return false;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Double.valueOf(this.AP);
    arrayOfObject[1] = Boolean.valueOf(this.AQ);
    arrayOfObject[2] = Integer.valueOf(this.BR);
    return hk.hashCode(arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    gk.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gj
 * JD-Core Version:    0.6.2
 */