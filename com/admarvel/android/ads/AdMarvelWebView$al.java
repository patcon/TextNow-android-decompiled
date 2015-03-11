package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$al
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private String b;

  public AdMarvelWebView$al(AdMarvelWebView paramAdMarvelWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = paramString;
  }

  public void run()
  {
    f localf;
    try
    {
      AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
      if (localAdMarvelWebView == null)
        return;
      localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
      if ((localf == null) || (this.b == null) || (this.b.trim().length() <= 0))
        return;
      if (this.b.equalsIgnoreCase("mute"))
      {
        localf.d();
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    if (this.b.equalsIgnoreCase("unmute"))
      localf.e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.al
 * JD-Core Version:    0.6.2
 */