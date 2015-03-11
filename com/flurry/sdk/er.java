package com.flurry.sdk;

import android.text.TextUtils;
import java.lang.reflect.Method;

public final class er
{
  private static final String a = er.class.getSimpleName();

  public static et a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      localet = (et)Class.forName(paramString).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localet;
    }
    catch (Exception localException)
    {
      while (true)
      {
        eo.a(5, a, "FlurryModule " + paramString + " is not available:", localException);
        et localet = null;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.er
 * JD-Core Version:    0.6.2
 */