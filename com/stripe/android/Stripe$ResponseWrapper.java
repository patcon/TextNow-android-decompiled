package com.stripe.android;

import com.stripe.android.model.Token;

class Stripe$ResponseWrapper
{
  public final Exception error;
  public final Token token;

  private Stripe$ResponseWrapper(Stripe paramStripe, Token paramToken, Exception paramException)
  {
    this.error = paramException;
    this.token = paramToken;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.Stripe.ResponseWrapper
 * JD-Core Version:    0.6.2
 */