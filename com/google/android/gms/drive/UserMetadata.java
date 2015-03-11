package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UserMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserMetadata> CREATOR = new h();
  final int BR;
  final String NG;
  final String NH;
  final String NI;
  final boolean NJ;
  final String NK;

  UserMetadata(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.BR = paramInt;
    this.NG = paramString1;
    this.NH = paramString2;
    this.NI = paramString3;
    this.NJ = paramBoolean;
    this.NK = paramString4;
  }

  public UserMetadata(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramBoolean, paramString4);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.NG;
    arrayOfObject[1] = this.NH;
    arrayOfObject[2] = this.NI;
    arrayOfObject[3] = Boolean.valueOf(this.NJ);
    arrayOfObject[4] = this.NK;
    return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.UserMetadata
 * JD-Core Version:    0.6.2
 */