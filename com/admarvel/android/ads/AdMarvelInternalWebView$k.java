package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelInternalWebView$k
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelInternalWebView$k(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    while (true)
    {
      Activity localActivity;
      ViewGroup localViewGroup;
      LinearLayout localLinearLayout;
      w localw;
      AdMarvelActivity.g localg;
      try
      {
        if (this.b == null)
          break label503;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        break;
        if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
          break label502;
        if (this.a != null)
        {
          localContext = (Context)this.a.get();
          if ((localContext == null) || (!(localContext instanceof Activity)))
            break label502;
          localActivity = (Activity)localContext;
          if (localActivity == null)
            break label502;
          localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
          localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE");
          if (localLinearLayout != null)
          {
            if (!AdMarvelInternalWebView.b(localAdMarvelInternalWebView))
              break label460;
            if (AdMarvelInternalWebView.c(localAdMarvelInternalWebView))
              break label408;
            localLinearLayout.setVisibility(8);
          }
          if (AdMarvelInternalWebView.d(localAdMarvelInternalWebView).get() != true)
            break label502;
          if ((localAdMarvelInternalWebView.getParent() == null) || (!(localAdMarvelInternalWebView.getParent() instanceof RelativeLayout)))
            break label492;
          localw = (w)((RelativeLayout)localAdMarvelInternalWebView.getParent()).findViewWithTag(localAdMarvelInternalWebView.GUID + "CONTROLS");
          if (AdMarvelInternalWebView.e(localAdMarvelInternalWebView).compareAndSet(false, true))
          {
            if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
            {
              AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
              if (!localAdMarvelActivity.c())
                break label469;
              if (AdMarvelUtils.isLogDumpEnabled())
              {
                localAdMarvelInternalWebView.loadUrl("javascript:window.ADMARVEL.fetchWebViewHtmlContent(document.getElementsByTagName('html')[0].outerHTML);");
                ((AdMarvelActivity)localActivity).h();
              }
              if (localAdMarvelActivity != null)
              {
                if (localAdMarvelActivity.a == null)
                  break label486;
                localg = (AdMarvelActivity.g)localAdMarvelActivity.a.get();
                if (localg != null)
                  localg.c();
              }
            }
            localAdMarvelInternalWebView.clearHistory();
            if (localw != null)
              localw.setVisibility(0);
            localAdMarvelInternalWebView.setVisibility(0);
          }
          if ((localw == null) || (AdMarvelInternalWebView.e(localAdMarvelInternalWebView).get() != true))
            break label502;
          localw.a();
          localw.findViewWithTag(localAdMarvelInternalWebView.GUID + "PROGRESS_BAR").setVisibility(8);
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log("Exception" + localException.getMessage());
        return;
      }
      Context localContext = null;
      continue;
      label408: localLinearLayout.setVisibility(0);
      ImageView localImageView = (ImageView)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE_IMAGE");
      if (localImageView != null)
      {
        localImageView.setVisibility(4);
        continue;
        label460: localLinearLayout.setVisibility(0);
        continue;
        label469: if (AdMarvelUtils.isLogDumpEnabled())
        {
          ((AdMarvelActivity)localActivity).i();
          continue;
          label486: localg = null;
          continue;
          label492: localw = null;
        }
      }
    }
    while (localAdMarvelInternalWebView == null)
    {
      label502: return;
      label503: localAdMarvelInternalWebView = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.k
 * JD-Core Version:    0.6.2
 */