package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ib$b
  implements SafeParcelable
{
  public static final ia CREATOR = new ia();
  final hy.a<?, ?> Hp;
  final String eM;
  final int versionCode;

  ib$b(int paramInt, String paramString, hy.a<?, ?> parama)
  {
    this.versionCode = paramInt;
    this.eM = paramString;
    this.Hp = parama;
  }

  ib$b(String paramString, hy.a<?, ?> parama)
  {
    this.versionCode = 1;
    this.eM = paramString;
    this.Hp = parama;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ia.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ib.b
 * JD-Core Version:    0.6.2
 */