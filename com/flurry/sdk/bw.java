package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.flurry.android.AdCreative;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.ArrayList;
import java.util.List;

public final class bw extends bg
{
  protected final aj a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdUnit == null) || (paramBundle == null))
      return null;
    return new bz(paramContext, paramFlurryAdModule, parame, paramAdUnit, paramBundle);
  }

  protected final i a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdCreative paramAdCreative, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdCreative == null) || (paramBundle == null))
      return null;
    return new bx(paramContext, paramFlurryAdModule, parame, paramAdCreative, paramBundle);
  }

  protected final String f()
  {
    return "Millennial Media";
  }

  protected final List<bc> g()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bc("MMAdView", "5.1.0", "com.millennialmedia.android.MMInterstitial"));
    return localArrayList;
  }

  protected final List<String> h()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("com.flurry.millennial.MYAPIDINTERSTITIAL");
    return localArrayList;
  }

  @TargetApi(13)
  protected final List<ActivityInfo> j()
  {
    ArrayList localArrayList = new ArrayList();
    ActivityInfo localActivityInfo = new ActivityInfo();
    localActivityInfo.name = "com.millennialmedia.android.MMActivity";
    localActivityInfo.configChanges = 3248;
    localArrayList.add(localActivityInfo);
    return localArrayList;
  }

  protected final List<bc> k()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bc("MMAdView", "5.1.0", "com.millennialmedia.android.MMAdView"));
    return localArrayList;
  }

  protected final List<String> l()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("com.flurry.millennial.MYAPID");
    localArrayList.add("com.flurry.millennial.MYAPIDRECTANGLE");
    return localArrayList;
  }

  protected final List<String> n()
  {
    return new ArrayList();
  }

  protected final List<String> o()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("android.permission.INTERNET");
    localArrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
    localArrayList.add("android.permission.ACCESS_NETWORK_STATE");
    return localArrayList;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bw
 * JD-Core Version:    0.6.2
 */