package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class j
  implements SafeParcelable
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  private final int BR;
  String auJ;
  String tG;

  j()
  {
    this.BR = 1;
  }

  j(int paramInt, String paramString1, String paramString2)
  {
    this.BR = paramInt;
    this.auJ = paramString1;
    this.tG = paramString2;
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
    k.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.j
 * JD-Core Version:    0.6.2
 */