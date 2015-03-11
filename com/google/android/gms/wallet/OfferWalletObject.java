package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject.a;

public final class OfferWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator<OfferWalletObject> CREATOR = new n();
  String ajT;
  CommonWalletObject ajU;
  String eC;
  private final int xM;

  OfferWalletObject()
  {
    this.xM = 3;
  }

  OfferWalletObject(int paramInt, String paramString1, String paramString2, CommonWalletObject paramCommonWalletObject)
  {
    this.xM = paramInt;
    this.ajT = paramString2;
    if (paramInt < 3)
    {
      this.ajU = CommonWalletObject.nk().cw(paramString1).nl();
      return;
    }
    this.ajU = paramCommonWalletObject;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getId()
  {
    return this.ajU.getId();
  }

  public final String getRedemptionCode()
  {
    return this.ajT;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.OfferWalletObject
 * JD-Core Version:    0.6.2
 */