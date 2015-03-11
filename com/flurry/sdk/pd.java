package com.flurry.sdk;

import java.util.Calendar;

@kb
public class pd extends pt<Calendar>
{
  public static pd a = new pd();

  public pd()
  {
    super(Calendar.class);
  }

  public void a(Calendar paramCalendar, hf paramhf, jw paramjw)
  {
    paramjw.a(paramCalendar.getTimeInMillis(), paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pd
 * JD-Core Version:    0.6.2
 */