package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$t
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private float c;
  private float d;
  private float e;
  private float f;

  public AdMarvelActivity$t(AdMarvelActivity paramAdMarvelActivity, AdMarvelInternalWebView paramAdMarvelInternalWebView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = paramFloat4;
  }

  public void run()
  {
    try
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
      if (localAdMarvelActivity != null)
      {
        if (localAdMarvelInternalWebView == null)
          return;
        localAdMarvelInternalWebView.loadUrl("javascript:console.log(\"Window Innerwidth \"+window.innerWidth);");
        RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
        p localp = null;
        if (localRelativeLayout != null)
          localp = (p)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
        if ((localp != null) && (AdMarvelActivity.z(localAdMarvelActivity) != null))
        {
          int i = localRelativeLayout.getWidth();
          int j = localRelativeLayout.getHeight();
          RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localp.getLayoutParams();
          localLayoutParams.width = ((int)(i * this.e));
          localLayoutParams.height = ((int)(j * this.f));
          localLayoutParams.leftMargin = ((int)(i * this.c));
          localLayoutParams.topMargin = ((int)(j * this.d));
          localp.setLayoutParams(localLayoutParams);
          localp.forceLayout();
          return;
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.t
 * JD-Core Version:    0.6.2
 */