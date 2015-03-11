package com.admarvel.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

public class e extends BroadcastReceiver
{
  private static String a = null;
  private static WeakReference<AdMarvelInternalWebView> b;

  public static void a(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    b = new WeakReference(paramAdMarvelInternalWebView);
    if (paramString != null)
      a = paramString;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    while (true)
    {
      Boolean localBoolean1;
      try
      {
        String str = ab.a(paramContext);
        localBoolean1 = Boolean.valueOf(false);
        if ((str.equals("mobile")) || (str.equals("wifi")))
        {
          localBoolean2 = Boolean.valueOf(true);
          if (b != null)
          {
            AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)b.get();
            if ((localAdMarvelInternalWebView != null) && (a != null))
              localAdMarvelInternalWebView.loadUrl("javascript:" + a + "(" + "'" + localBoolean2 + "'" + "," + "'" + str + "'" + ")");
          }
          return;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.e
 * JD-Core Version:    0.6.2
 */