package com.stripe.exception;

public class InvalidRequestException extends StripeException
{
  private static final long serialVersionUID = 1L;
  private final String param;

  public InvalidRequestException(String paramString1, String paramString2, Throwable paramThrowable)
  {
    super(paramString1, paramThrowable);
    this.param = paramString2;
  }

  public String getParam()
  {
    return this.param;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.exception.InvalidRequestException
 * JD-Core Version:    0.6.2
 */