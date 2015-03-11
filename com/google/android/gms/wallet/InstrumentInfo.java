package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InstrumentInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator<InstrumentInfo> CREATOR = new h();
  private String ajc;
  private String ajd;
  private final int xM;

  InstrumentInfo(int paramInt, String paramString1, String paramString2)
  {
    this.xM = paramInt;
    this.ajc = paramString1;
    this.ajd = paramString2;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getInstrumentDetails()
  {
    return this.ajd;
  }

  public final String getInstrumentType()
  {
    return this.ajc;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.InstrumentInfo
 * JD-Core Version:    0.6.2
 */