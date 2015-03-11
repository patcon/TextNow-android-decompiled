package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class d
  implements SafeParcelable
{
  public static final Parcelable.Creator<d> CREATOR = new e();
  private final int BR;
  OfferWalletObject asA;
  LoyaltyWalletObject asz;

  d()
  {
    this.BR = 2;
  }

  d(int paramInt, LoyaltyWalletObject paramLoyaltyWalletObject, OfferWalletObject paramOfferWalletObject)
  {
    this.BR = paramInt;
    this.asz = paramLoyaltyWalletObject;
    this.asA = paramOfferWalletObject;
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
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.d
 * JD-Core Version:    0.6.2
 */