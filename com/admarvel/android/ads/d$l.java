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

class d$l
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<d> b;

  public d$l(d paramd, Context paramContext)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    d locald;
    while (true)
    {
      Activity localActivity;
      ViewGroup localViewGroup;
      LinearLayout localLinearLayout;
      o localo;
      try
      {
        if (this.b == null)
          break label452;
        locald = (d)this.b.get();
        break;
        if (d.a(locald))
          break label451;
        if (this.a != null)
        {
          localContext = (Context)this.a.get();
          if ((localContext == null) || (!(localContext instanceof Activity)))
            break label451;
          localActivity = (Activity)localContext;
          if (localActivity != null)
          {
            localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
            localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(locald.s + "BTN_CLOSE");
            if (localLinearLayout != null)
            {
              if (!d.b(locald))
                break label410;
              if (d.c(locald))
                break label358;
              localLinearLayout.setVisibility(8);
            }
          }
          if (d.d(locald).compareAndSet(false, true))
          {
            if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
            {
              AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
              if ((!localAdMarvelActivity.c()) && (!localAdMarvelActivity.e()))
                break label419;
              locald.setVisibility(0);
              if (AdMarvelUtils.isLogDumpEnabled())
              {
                locald.loadUrl("javascript:window.ADMARVEL.fetchWebViewHtmlContent(document.getElementsByTagName('html')[0].outerHTML);");
                ((AdMarvelActivity)localActivity).h();
              }
            }
            locald.clearHistory();
          }
          if (d.d(locald).get() != true)
            break label451;
          if ((locald.getParent() == null) || (!(locald.getParent() instanceof RelativeLayout)))
            break label441;
          localo = (o)((RelativeLayout)locald.getParent()).findViewWithTag(locald.s + "CONTROLS");
          if (localo == null)
            break label451;
          localo.a();
          localo.findViewWithTag(locald.s + "PROGRESS_BAR").setVisibility(8);
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
      label358: localLinearLayout.setVisibility(0);
      ImageView localImageView = (ImageView)localViewGroup.findViewWithTag(locald.s + "BTN_CLOSE_IMAGE");
      if (localImageView != null)
      {
        localImageView.setVisibility(4);
        continue;
        label410: localLinearLayout.setVisibility(0);
        continue;
        label419: locald.setVisibility(0);
        if (AdMarvelUtils.isLogDumpEnabled())
        {
          ((AdMarvelActivity)localActivity).i();
          continue;
          label441: localo = null;
        }
      }
    }
    while (locald == null)
    {
      label451: return;
      label452: locald = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.l
 * JD-Core Version:    0.6.2
 */