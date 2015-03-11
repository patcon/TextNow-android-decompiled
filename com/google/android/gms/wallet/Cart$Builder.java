package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.List;

public final class Cart$Builder
{
  private Cart$Builder(Cart paramCart)
  {
  }

  public final Builder addLineItem(LineItem paramLineItem)
  {
    this.asy.asx.add(paramLineItem);
    return this;
  }

  public final Cart build()
  {
    return this.asy;
  }

  public final Builder setCurrencyCode(String paramString)
  {
    this.asy.asw = paramString;
    return this;
  }

  public final Builder setLineItems(List<LineItem> paramList)
  {
    this.asy.asx.clear();
    this.asy.asx.addAll(paramList);
    return this;
  }

  public final Builder setTotalPrice(String paramString)
  {
    this.asy.asv = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart.Builder
 * JD-Core Version:    0.6.2
 */