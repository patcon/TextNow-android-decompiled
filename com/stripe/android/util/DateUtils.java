package com.stripe.android.util;

import com.stripe.android.time.Clock;
import java.util.Calendar;
import java.util.Locale;

public class DateUtils
{
  public static boolean hasMonthPassed(int paramInt1, int paramInt2)
  {
    Calendar localCalendar = Clock.getCalendarInstance();
    return (hasYearPassed(paramInt1)) || ((normalizeYear(paramInt1) == localCalendar.get(1)) && (paramInt2 < 1 + localCalendar.get(2)));
  }

  public static boolean hasYearPassed(int paramInt)
  {
    return normalizeYear(paramInt) < Clock.getCalendarInstance().get(1);
  }

  private static int normalizeYear(int paramInt)
  {
    if ((paramInt < 100) && (paramInt >= 0))
    {
      String str1 = String.valueOf(Clock.getCalendarInstance().get(1));
      String str2 = str1.substring(0, -2 + str1.length());
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str2;
      arrayOfObject[1] = Integer.valueOf(paramInt);
      paramInt = Integer.parseInt(String.format(localLocale, "%s%02d", arrayOfObject));
    }
    return paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.android.util.DateUtils
 * JD-Core Version:    0.6.2
 */