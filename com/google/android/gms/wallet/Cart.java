package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class Cart
  implements SafeParcelable
{
  public static final Parcelable.Creator<Cart> CREATOR = new b();
  String aiK;
  String aiL;
  ArrayList<LineItem> aiM;
  private final int xM;

  Cart()
  {
    this.xM = 1;
    this.aiM = new ArrayList();
  }

  Cart(int paramInt, String paramString1, String paramString2, ArrayList<LineItem> paramArrayList)
  {
    this.xM = paramInt;
    this.aiK = paramString1;
    this.aiL = paramString2;
    this.aiM = paramArrayList;
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
    return this.aiL;
  }

  public final ArrayList<LineItem> getLineItems()
  {
    return this.aiM;
  }

  public final String getTotalPrice()
  {
    return this.aiK;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart
 * JD-Core Version:    0.6.2
 */