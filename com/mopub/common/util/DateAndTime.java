package com.mopub.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateAndTime
{
  protected static DateAndTime instance = new DateAndTime();

  public static String getTimeZoneOffsetString()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("Z");
    localSimpleDateFormat.setTimeZone(localTimeZone());
    return localSimpleDateFormat.format(now());
  }

  public static TimeZone localTimeZone()
  {
    return instance.internalLocalTimeZone();
  }

  public static Date now()
  {
    return instance.internalNow();
  }

  @Deprecated
  public static void setInstance(DateAndTime paramDateAndTime)
  {
    instance = paramDateAndTime;
  }

  public TimeZone internalLocalTimeZone()
  {
    return TimeZone.getDefault();
  }

  public Date internalNow()
  {
    return new Date();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.DateAndTime
 * JD-Core Version:    0.6.2
 */