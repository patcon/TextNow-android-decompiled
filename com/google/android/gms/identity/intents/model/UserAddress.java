package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UserAddress
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserAddress> CREATOR = new b();
  String UH;
  String UI;
  String UJ;
  String UK;
  String UL;
  String UM;
  String UN;
  String UO;
  String UP;
  String UQ;
  boolean UR;
  String US;
  String UT;
  String name;
  String rf;
  private final int xM;

  UserAddress()
  {
    this.xM = 1;
  }

  UserAddress(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean, String paramString13, String paramString14)
  {
    this.xM = paramInt;
    this.name = paramString1;
    this.UH = paramString2;
    this.UI = paramString3;
    this.UJ = paramString4;
    this.UK = paramString5;
    this.UL = paramString6;
    this.UM = paramString7;
    this.UN = paramString8;
    this.rf = paramString9;
    this.UO = paramString10;
    this.UP = paramString11;
    this.UQ = paramString12;
    this.UR = paramBoolean;
    this.US = paramString13;
    this.UT = paramString14;
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

  public final String getAddress4()
  {
    return this.UK;
  }

  public final String getAddress5()
  {
    return this.UL;
  }

  public final String getAdministrativeArea()
  {
    return this.UM;
  }

  public final String getCompanyName()
  {
    return this.US;
  }

  public final String getCountryCode()
  {
    return this.rf;
  }

  public final String getEmailAddress()
  {
    return this.UT;
  }

  public final String getLocality()
  {
    return this.UN;
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

  public final String getSortingCode()
  {
    return this.UP;
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
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.model.UserAddress
 * JD-Core Version:    0.6.2
 */