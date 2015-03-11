package com.stripe.exception;

public class APIConnectionException extends StripeException
{
  private static final long serialVersionUID = 1L;

  public APIConnectionException(String paramString)
  {
    super(paramString);
  }

  public APIConnectionException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.exception.APIConnectionException
 * JD-Core Version:    0.6.2
 */