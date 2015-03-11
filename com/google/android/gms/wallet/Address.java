package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public final class Address
  implements SafeParcelable
{
  public static final Parcelable.Creator<Address> CREATOR = new a();
  String UH;
  String UI;
  String UJ;
  String UO;
  String UQ;
  boolean UR;
  String US;
  String aiI;
  String aiJ;
  String name;
  String rf;
  private final int xM;

  Address()
  {
    this.xM = 1;
  }

  Address(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10)
  {
    this.xM = paramInt;
    this.name = paramString1;
    this.UH = paramString2;
    this.UI = paramString3;
    this.UJ = paramString4;
    this.rf = paramString5;
    this.aiI = paramString6;
    this.aiJ = paramString7;
    this.UO = paramString8;
    this.UQ = paramString9;
    this.UR = paramBoolean;
    this.US = paramString10;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getAddress1()
  {
    return this.UH;
  }

  public final String getAddress2()
  {
    return this.UI;
  }

  public final String getAddress3()
  {
    return this.UJ;
  }

  public final String getCity()
  {
    return this.aiI;
  }

  public final String getCompanyName()
  {
    return this.US;
  }

  public final String getCountryCode()
  {
    return this.rf;
  }

  public final String getName()
  {
    return this.name;
  }

  public final String getPhoneNumber()
  {
    return this.UQ;
  }

  public final String getPostalCode()
  {
    return this.UO;
  }

  public final String getState()
  {
    return this.aiJ;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean isPostBox()
  {
    return this.UR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Address
 * JD-Core Version:    0.6.2
 */