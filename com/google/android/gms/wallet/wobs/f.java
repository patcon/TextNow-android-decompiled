package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class f
  implements SafeParcelable
{
  public static final Parcelable.Creator<f> CREATOR = new i();
  l ajs;
  g akS;
  String label;
  String type;
  private final int xM;

  f()
  {
    this.xM = 1;
  }

  f(int paramInt, String paramString1, g paramg, String paramString2, l paraml)
  {
    this.xM = paramInt;
    this.label = paramString1;
    this.akS = paramg;
    this.type = paramString2;
    this.ajs = paraml;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.f
 * JD-Core Version:    0.6.2
 */