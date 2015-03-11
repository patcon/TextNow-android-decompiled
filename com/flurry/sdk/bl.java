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

public final class bl
  implements ak
{
  private static final String a = bl.class.getSimpleName();
  private static final Map<String, ak> b = a();

  private static ak a(String paramString)
  {
    return (ak)b.get(paramString);
  }

  private static Map<String, ak> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AdMob".toUpperCase(Locale.US), new bq());
    localHashMap.put("Millennial Media".toUpperCase(Locale.US), new bw());
    localHashMap.put("InMobi".toUpperCase(Locale.US), new bs());
    localHashMap.put("Facebook Audience Network".toUpperCase(Locale.US), new bn());
    return Collections.unmodifiableMap(localHashMap);
  }

  public final aj a_(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    aj localaj;
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdUnit == null))
      localaj = null;
    String str;
    do
    {
      return localaj;
      List localList = paramAdUnit.d();
      if ((localList == null) || (localList.isEmpty()))
        return null;
      AdFrame localAdFrame = (AdFrame)localList.get(0);
      if (localAdFrame == null)
        return null;
      str = localAdFrame.d().toString();
      if (TextUtils.isEmpty(str))
        return null;
      ak localak = a(str.toUpperCase(Locale.US));
      if (localak == null)
        return null;
      eo.a(3, a, "Creating ad network takeover launcher: " + localak.getClass().getSimpleName() + " for type: " + str);
      localaj = localak.a_(paramContext, paramFlurryAdModule, parame, paramAdUnit);
    }
    while (localaj != null);
    eo.b(a, "Cannot create ad network takeover launcher for type: " + str);
    return localaj;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bl
 * JD-Core Version:    0.6.2
 */