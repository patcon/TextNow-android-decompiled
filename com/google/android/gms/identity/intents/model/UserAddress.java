package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UserAddress
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserAddress> CREATOR = new b();
  private final int BR;
  String adN;
  String adO;
  String adP;
  String adQ;
  String adR;
  String adS;
  String adT;
  String adU;
  String adV;
  String adW;
  boolean adX;
  String adY;
  String adZ;
  String name;
  String uW;

  UserAddress()
  {
    this.BR = 1;
  }

  UserAddress(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean, String paramString13, String paramString14)
  {
    this.BR = paramInt;
    this.name = paramString1;
    this.adN = paramString2;
    this.adO = paramString3;
    this.adP = paramString4;
    this.adQ = paramString5;
    this.adR = paramString6;
    this.adS = paramString7;
    this.adT = paramString8;
    this.uW = paramString9;
    this.adU = paramString10;
    this.adV = paramString11;
    this.adW = paramString12;
    this.adX = paramBoolean;
    this.adY = paramString13;
    this.adZ = paramString14;
  }

  public static UserAddress fromIntent(Intent paramIntent)
  {
    if ((paramIntent == null) || (!paramIntent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")))
      return null;
    return (UserAddress)paramIntent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
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

  public final String getAddress4()
  {
    return this.adQ;
  }

  public final String getAddress5()
  {
    return this.adR;
  }

  public final String getAdministrativeArea()
  {
    return this.adS;
  }

  public final String getCompanyName()
  {
    return this.adY;
  }

  public final String getCountryCode()
  {
    return this.uW;
  }

  public final String getEmailAddress()
  {
    return this.adZ;
  }

  public final String getLocality()
  {
    return this.adT;
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

  public final String getSortingCode()
  {
    return this.adV;
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
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.model.UserAddress
 * JD-Core Version:    0.6.2
 */