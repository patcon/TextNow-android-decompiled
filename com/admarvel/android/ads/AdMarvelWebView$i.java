package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
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

class AdMarvelWebView$i extends LinearLayout
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$i(Context paramContext, AdMarvelWebView paramAdMarvelWebView)
  {
    super(paramContext);
    this.a = new WeakReference(paramAdMarvelWebView);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    setBackgroundColor(0);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams1.weight = 1.0F;
    localLayoutParams1.width = 0;
    localLayoutParams1.gravity = 17;
    setLayoutParams(localLayoutParams1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.weight = 25.0F;
    localLayoutParams2.gravity = 17;
    float f = TypedValue.applyDimension(1, 36.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams((int)f, (int)f);
    localLayoutParams.addRule(13);
    a(paramContext, localLayoutParams, localLayoutParams2);
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1)
  {
    final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView == null)
      return;
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(paramLayoutParams);
    localImageView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AdMarvelWebView.d(localAdMarvelWebView).post(new AdMarvelWebView.j(localAdMarvelWebView));
      }
    });
    BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", paramContext);
    localImageView.setTag("BTN_CLOSE_IMAGE");
    if (!AdMarvelWebView.w(localAdMarvelWebView))
      localImageView.setImageDrawable(localBitmapDrawable);
    while (true)
    {
      RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
      localRelativeLayout.setLayoutParams(paramLayoutParams1);
      localRelativeLayout.addView(localImageView);
      addView(localRelativeLayout);
      return;
      localImageView.setBackgroundColor(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.i
 * JD-Core Version:    0.6.2
 */