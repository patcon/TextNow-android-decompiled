package com.flurry.sdk;

import java.util.Calendar;
import java.util.Date;

@kb
public class ll extends mc<Calendar>
{
  protected final Class<? extends Calendar> a;

  public ll()
  {
    this(null);
  }

  public ll(Class<? extends Calendar> paramClass)
  {
    super(Calendar.class);
    this.a = paramClass;
  }

  public Calendar b(hj paramhj, iz paramiz)
  {
    Date localDate = B(paramhj, paramiz);
    if (localDate == null)
      return null;
    if (this.a == null)
      return paramiz.a(localDate);
    try
    {
      Calendar localCalendar = (Calendar)this.a.newInstance();
      localCalendar.setTimeInMillis(localDate.getTime());
      return localCalendar;
    }
    catch (Exception localException)
    {
      throw paramiz.a(this.a, localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ll
 * JD-Core Version:    0.6.2
 */