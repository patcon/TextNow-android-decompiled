package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class f
  implements SafeParcelable
{
  public static final Parcelable.Creator<f> CREATOR = new i();
  private final int BR;
  l atc;
  g auC;
  String label;
  String type;

  f()
  {
    this.BR = 1;
  }

  f(int paramInt, String paramString1, g paramg, String paramString2, l paraml)
  {
    this.BR = paramInt;
    this.label = paramString1;
    this.auC = paramg;
    this.type = paramString2;
    this.atc = paraml;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.f
 * JD-Core Version:    0.6.2
 */