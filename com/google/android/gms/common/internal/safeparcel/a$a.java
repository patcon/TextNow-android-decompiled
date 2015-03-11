package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public class a$a extends RuntimeException
{
  public a$a(String paramString, Parcel paramParcel)
  {
    super(paramString + " Parcel: pos=" + paramParcel.dataPosition() + " size=" + paramParcel.dataSize());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.a.a
 * JD-Core Version:    0.6.2
 */