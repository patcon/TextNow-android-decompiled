package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class n
  implements SafeParcelable
{
  public static final Parcelable.Creator<n> CREATOR = new o();
  String alc;
  String description;
  private final int xM;

  n()
  {
    this.xM = 1;
  }

  n(int paramInt, String paramString1, String paramString2)
  {
    this.xM = paramInt;
    this.alc = paramString1;
    this.description = paramString2;
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
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.n
 * JD-Core Version:    0.6.2
 */