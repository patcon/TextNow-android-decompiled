package net.hockeyapp.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import textnow.bh.a;

public final class i
{
  private static a a = null;
  private static j b = null;

  @SuppressLint({"NewApi"})
  public static Boolean a()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 11);
      for (boolean bool = true; ; bool = false)
      {
        Boolean localBoolean = Boolean.valueOf(bool);
        return localBoolean;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
    }
    return Boolean.valueOf(false);
  }

  public static Boolean a(WeakReference<Activity> paramWeakReference)
  {
    if (paramWeakReference != null)
    {
      Activity localActivity = (Activity)paramWeakReference.get();
      if (localActivity != null)
      {
        Configuration localConfiguration = localActivity.getResources().getConfiguration();
        if (((0xF & localConfiguration.screenLayout) == 3) || ((0xF & localConfiguration.screenLayout) == 4));
        for (boolean bool = true; ; bool = false)
          return Boolean.valueOf(bool);
      }
    }
    return Boolean.valueOf(false);
  }

  public static j b()
  {
    return b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.i
 * JD-Core Version:    0.6.2
 */