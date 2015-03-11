package android.support.v4.app;

import android.app.Notification;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class ak
{
  private static final as a = new av();

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new au();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new at();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new ba();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new az();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new ay();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ax();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new aw();
      return;
    }
  }

  public static Bundle a(Notification paramNotification)
  {
    return a.a(paramNotification);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ak
 * JD-Core Version:    0.6.2
 */