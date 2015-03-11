package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class o
  implements k
{
  static final String a = o.class.getSimpleName();
  private static final Map<String, k> b = a();

  private static k a(String paramString)
  {
    return (k)b.get(paramString);
  }

  private static String a(AdUnit paramAdUnit)
  {
    if (paramAdUnit == null)
      return null;
    List localList = paramAdUnit.d();
    if ((localList == null) || (localList.isEmpty()))
      return null;
    AdFrame localAdFrame = (AdFrame)localList.get(0);
    if (localAdFrame == null)
      return null;
    int i = localAdFrame.b().intValue();
    if ((paramAdUnit.e().intValue() == 1) || (i == 2) || (i == 1) || (i == 3))
      return "FLURRY";
    if (i == 4)
      return "THIRD_PARTY";
    return null;
  }

  private static Map<String, k> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("FLURRY", new o.a(null));
    localHashMap.put("THIRD_PARTY", new bk());
    return Collections.unmodifiableMap(localHashMap);
  }

  public final i a(Context paramContext, FlurryAdModule paramFlurryAdModule, e parame, AdUnit paramAdUnit)
  {
    if ((paramContext == null) || (paramFlurryAdModule == null) || (parame == null) || (paramAdUnit == null));
    String str;
    do
    {
      return null;
      str = a(paramAdUnit);
    }
    while (str == null);
    k localk = a(str);
    if (localk == null)
    {
      eo.d(a, "Cannot create ad banner for type: " + str);
      return null;
    }
    eo.a(3, a, "Creating ad banner for type: " + str);
    return localk.a(paramContext, paramFlurryAdModule, parame, paramAdUnit);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.o
 * JD-Core Version:    0.6.2
 */