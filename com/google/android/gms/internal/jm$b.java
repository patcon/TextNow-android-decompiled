package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class jm$b
  implements SafeParcelable
{
  public static final jl CREATOR = new jl();
  final ji.a<?, ?> MM;
  final String fv;
  final int versionCode;

  jm$b(int paramInt, String paramString, ji.a<?, ?> parama)
  {
    this.versionCode = paramInt;
    this.fv = paramString;
    this.MM = parama;
  }

  jm$b(String paramString, ji.a<?, ?> parama)
  {
    this.versionCode = 1;
    this.fv = paramString;
    this.MM = parama;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jl.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jm.b
 * JD-Core Version:    0.6.2
 */