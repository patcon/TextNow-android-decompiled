package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hk.a;

public class PlusCommonExtras
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  public static String TAG = "PlusCommonExtras";
  private String abQ;
  private String abR;
  private final int xM;

  public PlusCommonExtras()
  {
    this.xM = 1;
    this.abQ = "";
    this.abR = "";
  }

  PlusCommonExtras(int paramInt, String paramString1, String paramString2)
  {
    this.xM = paramInt;
    this.abQ = paramString1;
    this.abR = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlusCommonExtras));
    PlusCommonExtras localPlusCommonExtras;
    do
    {
      return false;
      localPlusCommonExtras = (PlusCommonExtras)paramObject;
    }
    while ((this.xM != localPlusCommonExtras.xM) || (!hk.equal(this.abQ, localPlusCommonExtras.abQ)) || (!hk.equal(this.abR, localPlusCommonExtras.abR)));
    return true;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.xM);
    arrayOfObject[1] = this.abQ;
    arrayOfObject[2] = this.abR;
    return hk.hashCode(arrayOfObject);
  }

  public String jX()
  {
    return this.abQ;
  }

  public String jY()
  {
    return this.abR;
  }

  public void n(Bundle paramBundle)
  {
    paramBundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
  }

  public String toString()
  {
    return hk.e(this).a("versionCode", Integer.valueOf(this.xM)).a("Gpsrc", this.abQ).a("ClientCallingPackage", this.abR).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.PlusCommonExtras
 * JD-Core Version:    0.6.2
 */