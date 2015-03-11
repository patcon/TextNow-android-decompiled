package com.stripe.android.time;

import java.util.Calendar;

public class Clock
{
  private static Clock instance;
  protected Calendar calendarInstance;

  private Calendar _calendarInstance()
  {
    if (this.calendarInstance != null)
      return (Calendar)this.calendarInstance.clone();
    return Calendar.getInstance();
  }

  public static Calendar getCalendarInstance()
  {
    return getInstance()._calendarInstance();
  }

  protected static Clock getInstance()
  {
    if (instance == null)
      instance = new Clock();
    return instance;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.time.Clock
 * JD-Core Version:    0.6.2
 */