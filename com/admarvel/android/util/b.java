package com.admarvel.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.admarvel.android.ads.d;
import com.admarvel.android.ads.r;
import java.lang.ref.WeakReference;

public class b extends BroadcastReceiver
{
  private static String a = null;
  private static WeakReference<d> b;
  private static b c = null;

  public static b a()
  {
    if (c == null)
      c = new b();
    return c;
  }

  public static void a(d paramd, String paramString)
  {
    b = new WeakReference(paramd);
    if (paramString != null)
      a = paramString;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1;
    if (paramIntent != null)
    {
      str1 = paramIntent.getAction();
      if ((str1 == null) || (!str1.equals("android.net.conn.CONNECTIVITY_CHANGE")));
    }
    while (true)
    {
      Boolean localBoolean1;
      try
      {
        String str2 = r.a(paramContext);
        localBoolean1 = Boolean.valueOf(false);
        if ((str2.equals("mobile")) || (str2.equals("wifi")))
        {
          localBoolean2 = Boolean.valueOf(true);
          if (b != null)
          {
            d locald = (d)b.get();
            if ((locald != null) && (a != null))
              locald.e(a + "(" + "'" + localBoolean2 + "'" + "," + "'" + str2 + "'" + ")");
          }
          return;
          str1 = null;
        }
      }
      catch (Exception localException)
      {
        Logging.log(localException.getMessage() + " Exception in AdMarvelConnectivityChangeReceiver ");
        return;
      }
      Boolean localBoolean2 = localBoolean1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.b
 * JD-Core Version:    0.6.2
 */