package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
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

class m$h extends LinearLayout
{
  private final WeakReference<m> a;

  public m$h(Context paramContext, m paramm)
  {
    super(paramContext);
    this.a = new WeakReference(paramm);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    setBackgroundColor(0);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(r.a(50.0F, paramContext), r.a(50.0F, paramContext));
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
    a(paramContext, localLayoutParams, localLayoutParams1);
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1)
  {
    final m localm = (m)this.a.get();
    if (localm == null)
      return;
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(paramLayoutParams);
    BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", paramContext);
    localImageView.setTag("BTN_CLOSE_IMAGE");
    if (!localm.h)
      localImageView.setImageDrawable(localBitmapDrawable);
    while (true)
    {
      RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
      localRelativeLayout.setLayoutParams(paramLayoutParams1);
      localRelativeLayout.addView(localImageView);
      localRelativeLayout.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          new Handler(Looper.getMainLooper()).post(new m.i(localm));
        }
      });
      addView(localRelativeLayout);
      return;
      localImageView.setBackgroundColor(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.h
 * JD-Core Version:    0.6.2
 */