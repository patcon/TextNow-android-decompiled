package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem
  implements SafeParcelable
{
  public static final Parcelable.Creator<LineItem> CREATOR = new i();
  String aiK;
  String aiL;
  String aje;
  String ajf;
  int ajg;
  String description;
  private final int xM;

  LineItem()
  {
    this.xM = 1;
    this.ajg = 0;
  }

  LineItem(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, String paramString5)
  {
    this.xM = paramInt1;
    this.description = paramString1;
    this.aje = paramString2;
    this.ajf = paramString3;
    this.aiK = paramString4;
    this.ajg = paramInt2;
    this.aiL = paramString5;
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
    return this.aiL;
  }

  public final String getDescription()
  {
    return this.description;
  }

  public final String getQuantity()
  {
    return this.aje;
  }

  public final int getRole()
  {
    return this.ajg;
  }

  public final String getTotalPrice()
  {
    return this.aiK;
  }

  public final String getUnitPrice()
  {
    return this.ajf;
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
 * Qualified Name:     com.google.android.gms.wallet.LineItem
 * JD-Core Version:    0.6.2
 */