package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public final class Address
  implements SafeParcelable
{
  public static final Parcelable.Creator<Address> CREATOR = new a();
  private final int BR;
  String adN;
  String adO;
  String adP;
  String adU;
  String adW;
  boolean adX;
  String adY;
  String ast;
  String asu;
  String name;
  String uW;

  Address()
  {
    this.BR = 1;
  }

  Address(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10)
  {
    this.BR = paramInt;
    this.name = paramString1;
    this.adN = paramString2;
    this.adO = paramString3;
    this.adP = paramString4;
    this.uW = paramString5;
    this.ast = paramString6;
    this.asu = paramString7;
    this.adU = paramString8;
    this.adW = paramString9;
    this.adX = paramBoolean;
    this.adY = paramString10;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getAddress1()
  {
    return this.adN;
  }

  public final String getAddress2()
  {
    return this.adO;
  }

  public final String getAddress3()
  {
    return this.adP;
  }

  public final String getCity()
  {
    return this.ast;
  }

  public final String getCompanyName()
  {
    return this.adY;
  }

  public final String getCountryCode()
  {
    return this.uW;
  }

  public final String getName()
  {
    return this.name;
  }

  public final String getPhoneNumber()
  {
    return this.adW;
  }

  public final String getPostalCode()
  {
    return this.adU;
  }

  public final String getState()
  {
    return this.asu;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final boolean isPostBox()
  {
    return this.adX;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Address
 * JD-Core Version:    0.6.2
 */