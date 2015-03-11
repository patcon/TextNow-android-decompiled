package com.stripe.android;

import java.util.concurrent.Executor;

abstract interface Stripe$TokenRequester
{
  public abstract void request(String paramString1, String paramString2, Executor paramExecutor, TokenCallback paramTokenCallback);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.Stripe.TokenRequester
 * JD-Core Version:    0.6.2
 */