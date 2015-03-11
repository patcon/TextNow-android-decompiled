package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jr;
import java.util.ArrayList;

public final class d
  implements SafeParcelable
{
  public static final Parcelable.Creator<d> CREATOR = new e();
  private final int BR;
  String auA;
  ArrayList<b> auB;
  String auz;

  d()
  {
    this.BR = 1;
    this.auB = jr.hz();
  }

  d(int paramInt, String paramString1, String paramString2, ArrayList<b> paramArrayList)
  {
    this.BR = paramInt;
    this.auz = paramString1;
    this.auA = paramString2;
    this.auB = paramArrayList;
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
 * Qualified Name:     com.google.android.gms.wallet.wobs.d
 * JD-Core Version:    0.6.2
 */