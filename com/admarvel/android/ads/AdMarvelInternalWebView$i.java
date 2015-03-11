package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.AdMarvelBitmapDrawableUtils;
import java.lang.ref.WeakReference;

class AdMarvelInternalWebView$i extends LinearLayout
{
  private final AdMarvelInternalWebView.a a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private final WeakReference<Activity> c;

  public AdMarvelInternalWebView$i(Context paramContext, AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelInternalWebView.a parama, Activity paramActivity)
  {
    super(paramContext);
    this.a = parama;
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = new WeakReference(paramActivity);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    setBackgroundColor(0);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams1.weight = 1.0F;
    localLayoutParams1.width = 0;
    localLayoutParams1.gravity = 5;
    setLayoutParams(localLayoutParams1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.weight = 25.0F;
    localLayoutParams2.gravity = 5;
    float f = TypedValue.applyDimension(1, 36.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams((int)f, (int)f);
    localLayoutParams.addRule(11);
    a(paramContext, localLayoutParams, localLayoutParams2);
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1)
  {
    final AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
    if (localAdMarvelInternalWebView == null);
    while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return;
    ImageView localImageView = new ImageView(paramContext);
    RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
    localRelativeLayout.setLayoutParams(paramLayoutParams1);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setLayoutParams(paramLayoutParams);
    if (this.a != null)
      localLinearLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          AdMarvelInternalWebView.i.a(AdMarvelInternalWebView.i.this).a();
        }
      });
    while (true)
    {
      localImageView.setLayoutParams(paramLayoutParams);
      localImageView.setDuplicateParentStateEnabled(true);
      localImageView.setClickable(false);
      localImageView.setImageDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", paramContext));
      localImageView.setTag(localAdMarvelInternalWebView.GUID + "BTN_CLOSE_IMAGE");
      localLinearLayout.addView(localImageView);
      localRelativeLayout.addView(localLinearLayout);
      addView(localRelativeLayout);
      return;
      localLinearLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Activity localActivity = (Activity)AdMarvelInternalWebView.i.b(AdMarvelInternalWebView.i.this).get();
          AdMarvelActivity localAdMarvelActivity;
          if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
          {
            localAdMarvelActivity = (AdMarvelActivity)localActivity;
            if (!localAdMarvelActivity.e())
              break label70;
            if (AdMarvelInternalWebView.c(localAdMarvelInternalWebView.GUID) != null)
              AdMarvelInternalWebView.c(localAdMarvelInternalWebView.GUID).a();
            localActivity.finish();
          }
          label70: 
          do
          {
            return;
            boolean bool = AdMarvelInterstitialAds.getListener().b();
            localAdMarvelActivity.b();
            if ((localAdMarvelActivity.e != null) && (localAdMarvelActivity.e.length() > 0))
              localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelActivity.e + "()");
            if (!bool)
              localActivity.finish();
          }
          while (localAdMarvelActivity.a() <= 2);
          localAdMarvelActivity.finish();
        }
      });
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.i
 * JD-Core Version:    0.6.2
 */