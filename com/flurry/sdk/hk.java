package com.flurry.sdk;

import java.io.IOException;

public class hk extends IOException
{
  protected hg a;

  protected hk(String paramString)
  {
    super(paramString);
  }

  protected hk(String paramString, hg paramhg)
  {
    this(paramString, paramhg, null);
  }

  protected hk(String paramString, hg paramhg, Throwable paramThrowable)
  {
    super(paramString);
    if (paramThrowable != null)
      initCause(paramThrowable);
    this.a = paramhg;
  }

  protected hk(String paramString, Throwable paramThrowable)
  {
    this(paramString, null, paramThrowable);
  }

  public hg a()
  {
    return this.a;
  }

  public String getMessage()
  {
    String str = super.getMessage();
    if (str == null)
      str = "N/A";
    hg localhg = a();
    if (localhg != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append('\n');
      localStringBuilder.append(" at ");
      localStringBuilder.append(localhg.toString());
      str = localStringBuilder.toString();
    }
    return str;
  }

  public String toString()
  {
    return getClass().getName() + ": " + getMessage();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hk
 * JD-Core Version:    0.6.2
 */