package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import java.util.HashSet;
import java.util.Set;

public final class bo
{
  private static final int a;
  private static final Object b = new Object();
  private static String c;
  private static Set<String> d = new HashSet();
  private static final Object g = new Object();
  private static bw h;
  private static final bq i;
  private final Context e;
  private final NotificationManager f;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
      i = new bt();
    while (true)
    {
      a = i.a();
      return;
      if (Build.VERSION.SDK_INT >= 5)
        i = new bs();
      else
        i = new br();
    }
  }

  private bo(Context paramContext)
  {
    this.e = paramContext;
    this.f = ((NotificationManager)this.e.getSystemService("notification"));
  }

  public static bo a(Context paramContext)
  {
    return new bo(paramContext);
  }

  private void a(by paramby)
  {
    synchronized (g)
    {
      if (h == null)
        h = new bw(this.e.getApplicationContext());
      h.a(paramby);
      return;
    }
  }

  public static Set<String> b(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    HashSet localHashSet;
    if ((str != null) && (!str.equals(c)))
    {
      String[] arrayOfString = str.split(":");
      localHashSet = new HashSet(arrayOfString.length);
      int j = arrayOfString.length;
      for (int k = 0; k < j; k++)
      {
        ComponentName localComponentName = ComponentName.unflattenFromString(arrayOfString[k]);
        if (localComponentName != null)
          localHashSet.add(localComponentName.getPackageName());
      }
    }
    synchronized (b)
    {
      d = localHashSet;
      c = str;
      return d;
    }
  }

  public final void a()
  {
    this.f.cancelAll();
    if (Build.VERSION.SDK_INT <= 19)
      a(new bp(this.e.getPackageName()));
  }

  public final void a(int paramInt)
  {
    i.a(this.f, null, paramInt);
    if (Build.VERSION.SDK_INT <= 19)
      a(new bp(this.e.getPackageName(), paramInt, null));
  }

  public final void a(int paramInt, Notification paramNotification)
  {
    Bundle localBundle = ak.a(paramNotification);
    if ((localBundle != null) && (localBundle.getBoolean("android.support.useSideChannel")));
    for (int j = 1; j != 0; j = 0)
    {
      a(new bu(this.e.getPackageName(), paramInt, null, paramNotification));
      i.a(this.f, null, paramInt);
      return;
    }
    i.a(this.f, null, paramInt, paramNotification);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bo
 * JD-Core Version:    0.6.2
 */