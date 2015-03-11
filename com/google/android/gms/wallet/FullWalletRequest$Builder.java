package com.google.android.gms.wallet;

public final class FullWalletRequest$Builder
{
  private FullWalletRequest$Builder(FullWalletRequest paramFullWalletRequest)
  {
  }

  public final FullWalletRequest build()
  {
    return this.asM;
  }

  public final Builder setCart(Cart paramCart)
  {
    this.asM.asL = paramCart;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.asM.asB = paramString;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.asM.asC = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest.Builder
 * JD-Core Version:    0.6.2
 */