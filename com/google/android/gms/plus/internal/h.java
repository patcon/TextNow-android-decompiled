package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hk.a;
import java.util.Arrays;

public class h
  implements SafeParcelable
{
  public static final j CREATOR = new j();
  private final String[] abT;
  private final String[] abU;
  private final String[] abV;
  private final String abW;
  private final String abX;
  private final String abY;
  private final String abZ;
  private final PlusCommonExtras aca;
  private final int xM;
  private final String yQ;

  h(int paramInt, String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, String paramString5, PlusCommonExtras paramPlusCommonExtras)
  {
    this.xM = paramInt;
    this.yQ = paramString1;
    this.abT = paramArrayOfString1;
    this.abU = paramArrayOfString2;
    this.abV = paramArrayOfString3;
    this.abW = paramString2;
    this.abX = paramString3;
    this.abY = paramString4;
    this.abZ = paramString5;
    this.aca = paramPlusCommonExtras;
  }

  public h(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString2, String paramString3, String paramString4, PlusCommonExtras paramPlusCommonExtras)
  {
    this.xM = 1;
    this.yQ = paramString1;
    this.abT = paramArrayOfString1;
    this.abU = paramArrayOfString2;
    this.abV = paramArrayOfString3;
    this.abW = paramString2;
    this.abX = paramString3;
    this.abY = paramString4;
    this.abZ = null;
    this.aca = paramPlusCommonExtras;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h));
    h localh;
    do
    {
      return false;
      localh = (h)paramObject;
    }
    while ((this.xM != localh.xM) || (!hk.equal(this.yQ, localh.yQ)) || (!Arrays.equals(this.abT, localh.abT)) || (!Arrays.equals(this.abU, localh.abU)) || (!Arrays.equals(this.abV, localh.abV)) || (!hk.equal(this.abW, localh.abW)) || (!hk.equal(this.abX, localh.abX)) || (!hk.equal(this.abY, localh.abY)) || (!hk.equal(this.abZ, localh.abZ)) || (!hk.equal(this.aca, localh.aca)));
    return true;
  }

  public String getAccountName()
  {
    return this.yQ;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[10];
    arrayOfObject[0] = Integer.valueOf(this.xM);
    arrayOfObject[1] = this.yQ;
    arrayOfObject[2] = this.abT;
    arrayOfObject[3] = this.abU;
    arrayOfObject[4] = this.abV;
    arrayOfObject[5] = this.abW;
    arrayOfObject[6] = this.abX;
    arrayOfObject[7] = this.abY;
    arrayOfObject[8] = this.abZ;
    arrayOfObject[9] = this.aca;
    return hk.hashCode(arrayOfObject);
  }

  public String[] jZ()
  {
    return this.abT;
  }

  public String[] ka()
  {
    return this.abU;
  }

  public String[] kb()
  {
    return this.abV;
  }

  public String kc()
  {
    return this.abW;
  }

  public String kd()
  {
    return this.abX;
  }

  public String ke()
  {
    return this.abY;
  }

  public String kf()
  {
    return this.abZ;
  }

  public PlusCommonExtras kg()
  {
    return this.aca;
  }

  public Bundle kh()
  {
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
    this.aca.n(localBundle);
    return localBundle;
  }

  public String toString()
  {
    return hk.e(this).a("versionCode", Integer.valueOf(this.xM)).a("accountName", this.yQ).a("requestedScopes", this.abT).a("visibleActivities", this.abU).a("requiredFeatures", this.abV).a("packageNameForAuth", this.abW).a("callingPackageName", this.abX).a("applicationName", this.abY).a("extra", this.aca.toString()).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.h
 * JD-Core Version:    0.6.2
 */