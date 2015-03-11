package com.stripe.android.time;

import java.util.Calendar;

public class FrozenClock extends Clock
{
  public static void freeze(Calendar paramCalendar)
  {
    getInstance().calendarInstance = paramCalendar;
  }

  public static void unfreeze()
  {
    getInstance().calendarInstance = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.time.FrozenClock
 * JD-Core Version:    0.6.2
 */