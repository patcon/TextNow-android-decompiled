package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;

class AdMarvelInternalWebView$f
  implements Runnable
{
  private final WeakReference<Context> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private boolean c = true;

  public AdMarvelInternalWebView$f(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext, Boolean paramBoolean)
  {
    this.a = new WeakReference(paramContext);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramBoolean.booleanValue();
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
    if (localAdMarvelInternalWebView == null);
    label15: label162: ImageView localImageView1;
    do
    {
      ViewGroup localViewGroup;
      LinearLayout localLinearLayout1;
      do
      {
        ImageView localImageView2;
        do
        {
          LinearLayout localLinearLayout2;
          do
          {
            Activity localActivity;
            do
            {
              break label15;
              break label15;
              break label15;
              do
                return;
              while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView));
              localActivity = (Activity)this.a.get();
            }
            while (localActivity == null);
            localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
            if (!this.c)
              break label162;
            if (AdMarvelInternalWebView.c(localAdMarvelInternalWebView))
              break;
            localLinearLayout2 = (LinearLayout)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE");
          }
          while ((localLinearLayout2 == null) || (!AdMarvelInternalWebView.b(localAdMarvelInternalWebView)));
          localLinearLayout2.setVisibility(8);
          return;
          localImageView2 = (ImageView)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE_IMAGE");
        }
        while (localImageView2 == null);
        localImageView2.setVisibility(4);
        return;
        localLinearLayout1 = (LinearLayout)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE");
      }
      while (localLinearLayout1 == null);
      if (localLinearLayout1.getVisibility() != 0)
        localLinearLayout1.setVisibility(0);
      localImageView1 = (ImageView)localViewGroup.findViewWithTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE_IMAGE");
    }
    while ((localImageView1 == null) || (localImageView1.getVisibility() == 0));
    localImageView1.setVisibility(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.f
 * JD-Core Version:    0.6.2
 */