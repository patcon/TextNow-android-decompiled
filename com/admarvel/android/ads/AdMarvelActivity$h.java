package com.admarvel.android.ads;

import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;

class AdMarvelActivity$h
  implements Runnable
{
  private AdMarvelActivity$h(AdMarvelActivity paramAdMarvelActivity)
  {
  }

  public void run()
  {
    try
    {
      PowerManager localPowerManager = (PowerManager)this.a.getSystemService("power");
      if ((!this.a.isFinishing()) && (localPowerManager != null) && (localPowerManager.isScreenOn()))
      {
        RelativeLayout localRelativeLayout = (RelativeLayout)this.a.findViewById(AdMarvelActivity.a);
        if (localRelativeLayout != null)
        {
          d locald1 = (d)localRelativeLayout.findViewWithTag(this.a.e + "WEBVIEW");
          if ((locald1 != null) && (!locald1.b()) && (locald1.j != null) && (locald1.j.length() > 0) && (locald1.k))
          {
            locald1.e(locald1.j + "(" + false + ")");
            locald1.k = false;
          }
        }
        if (this.a.g)
        {
          if (((j)((RelativeLayout)this.a.findViewById(AdMarvelActivity.a)).findViewWithTag(this.a.e + "BR_VIDEO") != null) && (this.a.q))
          {
            if ((this.a.o != null) && (this.a.o.length() > 0) && (localRelativeLayout != null))
            {
              d locald2 = (d)localRelativeLayout.findViewWithTag(this.a.e + "WEBVIEW");
              if (locald2 != null)
                locald2.loadUrl("javascript:" + this.a.o + "()");
            }
            this.a.g();
          }
        }
        else if ((this.a.f) && (this.a.q) && ((j)((RelativeLayout)this.a.findViewById(AdMarvelActivity.a)).findViewWithTag(this.a.e + "BR_VIDEO") != null))
        {
          this.a.g();
          return;
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelActivity.o(this.a).sendEmptyMessage(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.h
 * JD-Core Version:    0.6.2
 */