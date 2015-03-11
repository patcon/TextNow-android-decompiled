package com.flurry.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout.LayoutParams;
import com.flurry.android.AdCreative;
import com.flurry.android.AdNetworkView;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public final class bp extends AdNetworkView
{
  private static final String a = bp.class.getSimpleName();
  private final String b;
  private final String c;
  private final boolean d;
  private AdView e;
  private AdListener f;

  public bp(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdCreative paramAdCreative, Bundle paramBundle)
  {
    super(paramContext, paramFlurryAdModule, parame, paramAdCreative);
    this.b = paramBundle.getString("com.flurry.gms.ads.MY_AD_UNIT_ID");
    this.c = paramBundle.getString("com.flurry.gms.ads.MYTEST_AD_DEVICE_ID");
    this.d = paramBundle.getBoolean("com.flurry.gms.ads.test");
    setFocusable(true);
  }

  private AdSize a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 728) && (paramInt2 >= 90))
      return AdSize.LEADERBOARD;
    if ((paramInt1 >= 468) && (paramInt2 >= 60))
      return AdSize.FULL_BANNER;
    if ((paramInt1 >= 320) && (paramInt2 >= 50))
      return AdSize.BANNER;
    if ((paramInt1 >= 300) && (paramInt2 >= 250))
      return AdSize.MEDIUM_RECTANGLE;
    eo.a(3, a, "Could not find GMS AdSize that matches size");
    return null;
  }

  private AdSize a(Context paramContext, int paramInt1, int paramInt2)
  {
    int i = fc.h();
    int j = fc.g();
    if ((paramInt1 <= 0) || (paramInt1 > j))
      paramInt1 = j;
    if ((paramInt2 <= 0) || (paramInt2 > i))
      paramInt2 = i;
    return a(paramInt1, paramInt2);
  }

  final AdListener getAdListener()
  {
    return this.f;
  }

  final AdView getAdView()
  {
    return this.e;
  }

  public final void initLayout()
  {
    eo.a(4, a, "GMS AdView initLayout.");
    Context localContext = getContext();
    int i = getAdCreative().getWidth();
    int j = getAdCreative().getHeight();
    AdSize localAdSize = a(localContext, i, j);
    if (localAdSize == null)
    {
      eo.a(6, a, "Could not find GMS AdSize that matches {width = " + i + ", height " + j + "}");
      return;
    }
    eo.a(3, a, "Determined GMS AdSize as " + localAdSize + " that best matches {width = " + i + ", height = " + j + "}");
    this.f = new bp.a(this, null);
    this.e = new AdView(localContext);
    this.e.setAdSize(localAdSize);
    this.e.setAdUnitId(this.b);
    this.e.setAdListener(this.f);
    setGravity(17);
    addView(this.e, new RelativeLayout.LayoutParams(localAdSize.getWidthInPixels(localContext), localAdSize.getHeightInPixels(localContext)));
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    if (this.d)
    {
      eo.a(3, a, "GMS AdView set to Test Mode.");
      localBuilder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR);
      if (!TextUtils.isEmpty(this.c))
        localBuilder.addTestDevice(this.c);
    }
    this.e.loadAd(localBuilder.build());
  }

  public final void onDestroy()
  {
    eo.a(4, a, "GMS AdView onDestroy.");
    if (this.e != null)
    {
      this.e.destroy();
      this.e = null;
    }
    super.onDestroy();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bp
 * JD-Core Version:    0.6.2
 */