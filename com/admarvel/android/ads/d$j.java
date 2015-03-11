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

class d$j extends LinearLayout
{
  private final d.a a;
  private final WeakReference<d> b;
  private final WeakReference<Activity> c;

  public d$j(Context paramContext, d paramd, d.a parama, Activity paramActivity)
  {
    super(paramContext);
    this.a = parama;
    this.b = new WeakReference(paramd);
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
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams((int)f, (int)f);
    localLayoutParams3.gravity = 17;
    a(paramContext, localLayoutParams3, localLayoutParams2);
  }

  private void a(Context paramContext, LinearLayout.LayoutParams paramLayoutParams1, LinearLayout.LayoutParams paramLayoutParams2)
  {
    final d locald = (d)this.b.get();
    if (locald == null);
    while (d.a(locald))
      return;
    ImageView localImageView = new ImageView(paramContext);
    RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
    localRelativeLayout.setLayoutParams(paramLayoutParams2);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(r.a(50.0F, paramContext), r.a(50.0F, paramContext));
    localLayoutParams.addRule(11);
    localLinearLayout.setLayoutParams(localLayoutParams);
    if (this.a != null)
      localLinearLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          d.j.a(d.j.this).a();
        }
      });
    while (true)
    {
      paramLayoutParams1.weight = 1.0F;
      localImageView.setLayoutParams(paramLayoutParams1);
      localImageView.setDuplicateParentStateEnabled(true);
      localImageView.setClickable(false);
      localImageView.setImageDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", paramContext));
      localImageView.setTag(locald.s + "BTN_CLOSE_IMAGE");
      localLinearLayout.addView(localImageView);
      localRelativeLayout.addView(localLinearLayout);
      addView(localRelativeLayout);
      return;
      localLinearLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Activity localActivity = (Activity)d.j.b(d.j.this).get();
          AdMarvelActivity localAdMarvelActivity;
          if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
          {
            localAdMarvelActivity = (AdMarvelActivity)localActivity;
            if (!localAdMarvelActivity.e())
              break label70;
            if (d.c(locald.s) != null)
              d.c(locald.s).a();
            localActivity.finish();
          }
          label70: 
          do
          {
            return;
            boolean bool = AdMarvelInterstitialAds.getListener().b();
            localAdMarvelActivity.b();
            if ((localAdMarvelActivity.o != null) && (localAdMarvelActivity.o.length() > 0))
              locald.loadUrl("javascript:" + localAdMarvelActivity.o + "()");
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.j
 * JD-Core Version:    0.6.2
 */