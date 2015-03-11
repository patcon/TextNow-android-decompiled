package com.google.android.gms.wallet;

public final class FullWalletRequest$Builder
{
  private FullWalletRequest$Builder(FullWalletRequest paramFullWalletRequest)
  {
  }

  public final FullWalletRequest build()
  {
    return this.ajb;
  }

  public final Builder setCart(Cart paramCart)
  {
    this.ajb.aja = paramCart;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.ajb.aiQ = paramString;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.ajb.aiR = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest.Builder
 * JD-Core Version:    0.6.2
 */