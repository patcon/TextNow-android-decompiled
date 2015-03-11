package com.stripe.android;

import com.stripe.android.model.Token;

public abstract class TokenCallback
{
  public abstract void onError(Exception paramException);

  public abstract void onSuccess(Token paramToken);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.TokenCallback
 * JD-Core Version:    0.6.2
 */