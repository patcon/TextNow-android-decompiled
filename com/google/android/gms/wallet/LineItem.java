package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem
  implements SafeParcelable
{
  public static final Parcelable.Creator<LineItem> CREATOR = new i();
  private final int BR;
  String asP;
  String asQ;
  int asR;
  String asv;
  String asw;
  String description;

  LineItem()
  {
    this.BR = 1;
    this.asR = 0;
  }

  LineItem(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, String paramString5)
  {
    this.BR = paramInt1;
    this.description = paramString1;
    this.asP = paramString2;
    this.asQ = paramString3;
    this.asv = paramString4;
    this.asR = paramInt2;
    this.asw = paramString5;
  }

  public static LineItem.Builder newBuilder()
  {
    LineItem localLineItem = new LineItem();
    localLineItem.getClass();
    return new LineItem.Builder(localLineItem, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getCurrencyCode()
  {
    return this.asw;
  }

  public final String getDescription()
  {
    return this.description;
  }

  public final String getQuantity()
  {
    return this.asP;
  }

  public final int getRole()
  {
    return this.asR;
  }

  public final String getTotalPrice()
  {
    return this.asv;
  }

  public final String getUnitPrice()
  {
    return this.asQ;
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
 * Qualified Name:     com.google.android.gms.wallet.LineItem
 * JD-Core Version:    0.6.2
 */