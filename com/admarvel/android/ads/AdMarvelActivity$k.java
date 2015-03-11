package com.admarvel.android.ads;

import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;

class AdMarvelActivity$k
  implements Runnable
{
  private AdMarvelActivity$k(AdMarvelActivity paramAdMarvelActivity)
  {
  }

  public void run()
  {
    try
    {
      PowerManager localPowerManager = (PowerManager)this.a.getSystemService("power");
      if ((!this.a.isFinishing()) && (localPowerManager != null) && (localPowerManager.isScreenOn()))
      {
        RelativeLayout localRelativeLayout = (RelativeLayout)this.a.findViewById(AdMarvelActivity.b);
        if (localRelativeLayout != null)
        {
          AdMarvelInternalWebView localAdMarvelInternalWebView1 = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(this.a) + "WEBVIEW");
          if ((localAdMarvelInternalWebView1 != null) && (!localAdMarvelInternalWebView1.isSignalShutdown()) && (localAdMarvelInternalWebView1.visibilityCallback != null) && (localAdMarvelInternalWebView1.visibilityCallback.length() > 0) && (localAdMarvelInternalWebView1.isViewDisplayed))
          {
            localAdMarvelInternalWebView1.injectJavaScript(localAdMarvelInternalWebView1.visibilityCallback + "(" + false + ")");
            localAdMarvelInternalWebView1.isViewDisplayed = false;
          }
        }
        if (this.a.d)
        {
          if (((p)((RelativeLayout)this.a.findViewById(AdMarvelActivity.b)).findViewWithTag(AdMarvelActivity.c(this.a) + "BR_VIDEO") != null) && (AdMarvelActivity.r(this.a)))
          {
            if ((this.a.e != null) && (this.a.e.length() > 0) && (localRelativeLayout != null))
            {
              AdMarvelInternalWebView localAdMarvelInternalWebView2 = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(this.a) + "WEBVIEW");
              if (localAdMarvelInternalWebView2 != null)
                localAdMarvelInternalWebView2.loadUrl("javascript:" + this.a.e + "()");
            }
            this.a.g();
          }
        }
        else if ((this.a.c) && (AdMarvelActivity.r(this.a)) && ((p)((RelativeLayout)this.a.findViewById(AdMarvelActivity.b)).findViewWithTag(AdMarvelActivity.c(this.a) + "BR_VIDEO") != null))
        {
          this.a.g();
          return;
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelActivity.q(this.a).sendEmptyMessage(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.k
 * JD-Core Version:    0.6.2
 */