package com.flurry.sdk;

import java.util.Calendar;
import java.util.Date;

final class ma$c extends ma
{
  protected ma$c()
  {
    super(Calendar.class);
  }

  public final Calendar c(String paramString, iz paramiz)
  {
    Date localDate = paramiz.a(paramString);
    if (localDate == null)
      return null;
    return paramiz.a(localDate);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.c
 * JD-Core Version:    0.6.2
 */