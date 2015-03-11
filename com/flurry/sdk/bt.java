package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout.LayoutParams;
import com.flurry.android.AdCreative;
import com.flurry.android.AdNetworkView;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.inmobi.commons.InMobi;
import com.inmobi.monetization.IMBanner;
import com.inmobi.monetization.IMBannerListener;

public final class bt extends AdNetworkView
{
  private static final String a = bt.class.getSimpleName();
  private final String b;
  private IMBanner c;
  private IMBannerListener d;

  bt(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdCreative paramAdCreative, Bundle paramBundle)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdCreative);
    this.b = paramBundle.getString("com.flurry.inmobi.MY_APP_ID");
    InMobi.initialize((Activity)getContext(), this.b);
    setFocusable(true);
  }

  final IMBannerListener getAdListener()
  {
    return this.d;
  }

  final IMBanner getAdView()
  {
    return this.c;
  }

  public final void initLayout()
  {
    eo.a(3, a, "InMobi initLayout");
    int i = getAdCreative().getWidth();
    int j = getAdCreative().getHeight();
    int k = fc.h();
    int m = fc.g();
    if ((i <= 0) || (i > m))
      if ((j > 0) && (j <= k))
        break label280;
    while (true)
    {
      int n = bu.a(new Point(m, k));
      if (-1 == n)
        break label285;
      this.c = new IMBanner((Activity)getContext(), this.b, n);
      int i1 = 320;
      int i2 = 50;
      Point localPoint = bu.a(n);
      if (localPoint != null)
      {
        i1 = localPoint.x;
        i2 = localPoint.y;
      }
      eo.a(3, a, "Determined InMobi AdSize as " + i1 + "x" + i2);
      float f = fc.c().density;
      int i3 = (int)(0.5F + f * i1);
      int i4 = (int)(0.5F + f * i2);
      this.c.setLayoutParams(new LinearLayout.LayoutParams(i3, i4));
      this.d = new bt.a(this, null);
      this.c.setIMBannerListener(this.d);
      setGravity(17);
      addView(this.c);
      this.c.setRefreshInterval(-1);
      this.c.loadBanner();
      return;
      m = i;
      break;
      label280: k = j;
    }
    label285: eo.a(3, a, "Could not find InMobi AdSize that matches size " + i + "x" + j);
    eo.a(3, a, "Could not load InMobi Ad");
  }

  public final void onDestroy()
  {
    eo.a(3, a, "InMobi onDestroy");
    if (this.c != null)
    {
      this.c.destroy();
      this.c = null;
    }
    super.onDestroy();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bt
 * JD-Core Version:    0.6.2
 */