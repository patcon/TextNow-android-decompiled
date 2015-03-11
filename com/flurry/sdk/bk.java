package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class bk
  implements k
{
  private static final String a = bk.class.getSimpleName();
  private static final Map<String, k> b = a();

  private static k a(String paramString)
  {
    return (k)b.get(paramString);
  }

  private static Map<String, k> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AdMob".toUpperCase(Locale.US), new bq());
    localHashMap.put("Millennial Media".toUpperCase(Locale.US), new bw());
    localHashMap.put("InMobi".toUpperCase(Locale.US), new bs());
    localHashMap.put("Facebook Audience Network".toUpperCase(Locale.US), new bn());
    return Collections.unmodifiableMap(localHashMap);
  }

  public final i a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    i locali;
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdUnit == null))
      locali = null;
    do
    {
      return locali;
      List localList = paramAdUnit.d();
      if ((localList == null) || (localList.isEmpty()))
        return null;
      AdFrame localAdFrame = (AdFrame)localList.get(0);
      if (localAdFrame == null)
        return null;
      String str = localAdFrame.d().toString();
      if (TextUtils.isEmpty(str))
        return null;
      k localk = a(str.toUpperCase(Locale.US));
      if (localk == null)
        return null;
      eo.a(3, a, "Creating ad network view for type: " + str);
      locali = localk.a(paramContext, paramFlurryAdModule, parame, paramAdUnit);
      if (locali == null)
      {
        eo.b(a, "Cannot create ad network view for type: " + str);
        return null;
      }
    }
    while (locali == null);
    locali.setAdUnit(paramAdUnit);
    return locali;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bk
 * JD-Core Version:    0.6.2
 */