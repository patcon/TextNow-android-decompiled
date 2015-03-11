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

public final class bs extends bg
{
  protected final aj a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdUnit == null) || (paramBundle == null))
      return null;
    return new bv(paramContext, paramFlurryAdModule, parame, paramAdUnit, paramBundle);
  }

  protected final i a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdCreative paramAdCreative, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdCreative == null) || (paramBundle == null))
      return null;
    return new bt(paramContext, paramFlurryAdModule, parame, paramAdCreative, paramBundle);
  }

  protected final String f()
  {
    return "InMobi";
  }

  protected final List<bc> g()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bc("InMobiAndroidSDK", "4.1.0", "com.inmobi.monetization.IMInterstitial"));
    return localArrayList;
  }

  @TargetApi(13)
  protected final List<ActivityInfo> j()
  {
    ArrayList localArrayList = new ArrayList();
    ActivityInfo localActivityInfo = new ActivityInfo();
    localActivityInfo.name = "com.inmobi.androidsdk.IMBrowserActivity";
    localActivityInfo.configChanges = 3248;
    localArrayList.add(localActivityInfo);
    return localArrayList;
  }

  protected final List<bc> k()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bc("InMobiAndroidSDK", "4.1.0", "com.inmobi.monetization.IMBanner"));
    return localArrayList;
  }

  protected final List<String> n()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("com.flurry.inmobi.MY_APP_ID");
    return localArrayList;
  }

  protected final List<String> o()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("android.permission.INTERNET");
    return localArrayList;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bs
 * JD-Core Version:    0.6.2
 */