package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new o();
  private final int BR;
  String atF;
  String atG;
  int atH;
  int atI;

  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.BR = paramInt1;
    this.atF = paramString1;
    this.atG = paramString2;
    this.atH = paramInt2;
    this.atI = paramInt3;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getCvn()
  {
    return this.atG;
  }

  public final int getExpirationMonth()
  {
    return this.atH;
  }

  public final int getExpirationYear()
  {
    return this.atI;
  }

  public final String getPan()
  {
    return this.atF;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * JD-Core Version:    0.6.2
 */