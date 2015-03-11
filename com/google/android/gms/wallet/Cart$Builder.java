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
    this.aiN.aiM.add(paramLineItem);
    return this;
  }

  public final Cart build()
  {
    return this.aiN;
  }

  public final Builder setCurrencyCode(String paramString)
  {
    this.aiN.aiL = paramString;
    return this;
  }

  public final Builder setLineItems(List<LineItem> paramList)
  {
    this.aiN.aiM.clear();
    this.aiN.aiM.addAll(paramList);
    return this;
  }

  public final Builder setTotalPrice(String paramString)
  {
    this.aiN.aiK = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart.Builder
 * JD-Core Version:    0.6.2
 */