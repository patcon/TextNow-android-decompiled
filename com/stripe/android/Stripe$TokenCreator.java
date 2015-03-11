package com.stripe.android;

import com.stripe.android.model.Card;
import java.util.concurrent.Executor;

abstract interface Stripe$TokenCreator
{
  public abstract void create(Card paramCard, String paramString, Executor paramExecutor, TokenCallback paramTokenCallback);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.Stripe.TokenCreator
 * JD-Core Version:    0.6.2
 */