package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$ab
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private int c;
  private int d;
  private int e;
  private int f;

  public AdMarvelWebView$ab(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }

  public void run()
  {
    while (true)
    {
      float f1;
      RelativeLayout.LayoutParams localLayoutParams;
      try
      {
        AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
        AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        if (localAdMarvelWebView == null)
          break;
        if (localAdMarvelInternalWebView == null)
          return;
        f localf = null;
        if (localAdMarvelWebView != null)
          localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf == null)
          break;
        f1 = localAdMarvelWebView.getContext().getResources().getDisplayMetrics().density;
        localLayoutParams = (RelativeLayout.LayoutParams)localf.getLayoutParams();
        if ((this.e > 0) && (this.f > 0))
        {
          localLayoutParams.width = ((int)(f1 * this.e));
          localLayoutParams.height = ((int)(f1 * this.f));
        }
        if (this.c < 0)
          break label215;
        localLayoutParams.leftMargin = ((int)(f1 * this.c));
        if (this.d >= 0)
        {
          localLayoutParams.topMargin = ((int)(f1 * this.d));
          localf.setLayoutParams(localLayoutParams);
          localf.forceLayout();
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      localLayoutParams.addRule(15);
      continue;
      label215: if (this.d >= 0)
      {
        localLayoutParams.topMargin = ((int)(f1 * this.d));
        localLayoutParams.addRule(14);
      }
      else
      {
        localLayoutParams.addRule(13);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ab
 * JD-Core Version:    0.6.2
 */