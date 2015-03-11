package com.stripe.exception;

public abstract class StripeException extends Exception
{
  private static final long serialVersionUID = 1L;

  public StripeException(String paramString)
  {
    super(paramString, null);
  }

  public StripeException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.exception.StripeException
 * JD-Core Version:    0.6.2
 */