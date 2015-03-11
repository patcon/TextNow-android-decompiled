package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart
  implements SafeParcelable
{
  public static final Parcelable.Creator<Cart> CREATOR = new b();
  private final int BR;
  String asv;
  String asw;
  ArrayList<LineItem> asx;

  Cart()
  {
    this.BR = 1;
    this.asx = new ArrayList();
  }

  Cart(int paramInt, String paramString1, String paramString2, ArrayList<LineItem> paramArrayList)
  {
    this.BR = paramInt;
    this.asv = paramString1;
    this.asw = paramString2;
    this.asx = paramArrayList;
  }

  public static Cart.Builder newBuilder()
  {
    Cart localCart = new Cart();
    localCart.getClass();
    return new Cart.Builder(localCart, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getCurrencyCode()
  {
    return this.asw;
  }

  public final ArrayList<LineItem> getLineItems()
  {
    return this.asx;
  }

  public final String getTotalPrice()
  {
    return this.asv;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart
 * JD-Core Version:    0.6.2
 */