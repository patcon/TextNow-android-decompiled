package com.stripe.exception;

public class CardException extends StripeException
{
  private static final long serialVersionUID = 1L;
  private String code;
  private String param;

  public CardException(String paramString1, String paramString2, String paramString3, Throwable paramThrowable)
  {
    super(paramString1, paramThrowable);
    this.code = paramString2;
    this.param = paramString3;
  }

  public String getCode()
  {
    return this.code;
  }

  public String getParam()
  {
    return this.param;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.exception.CardException
 * JD-Core Version:    0.6.2
 */