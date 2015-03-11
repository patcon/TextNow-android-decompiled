package com.flurry.sdk;

import com.flurry.android.impl.ads.avro.protocol.v10.SdkAdEvent;
import com.flurry.android.impl.ads.avro.protocol.v10.SdkAdLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class cd
{
  public static List<SdkAdLog> a(List<e> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (paramList == null)
      return localArrayList1;
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      e locale = (e)localIterator1.next();
      SdkAdLog localSdkAdLog = new SdkAdLog();
      localSdkAdLog.a(Long.valueOf(locale.c()));
      String str;
      ArrayList localArrayList2;
      if (locale.b() == null)
      {
        str = "";
        localSdkAdLog.a(str);
        localArrayList2 = new ArrayList();
      }
      while (true)
      {
        SdkAdEvent localSdkAdEvent;
        HashMap localHashMap;
        try
        {
          Iterator localIterator2 = locale.d().iterator();
          if (!localIterator2.hasNext())
            break label276;
          c localc = (c)localIterator2.next();
          if (!localc.b())
            continue;
          localSdkAdEvent = new SdkAdEvent();
          localSdkAdEvent.a(localc.a());
          localSdkAdEvent.a(Long.valueOf(localc.c()));
          Map localMap = localc.d();
          localHashMap = new HashMap();
          Iterator localIterator3 = localMap.entrySet().iterator();
          if (!localIterator3.hasNext())
            break label256;
          Map.Entry localEntry = (Map.Entry)localIterator3.next();
          localHashMap.put(localEntry.getKey(), localEntry.getValue());
          continue;
        }
        finally
        {
        }
        str = locale.b();
        break;
        label256: localSdkAdEvent.a(localHashMap);
        localArrayList2.add(localSdkAdEvent);
      }
      label276: localSdkAdLog.a(localArrayList2);
      localArrayList1.add(localSdkAdLog);
    }
    return localArrayList1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cd
 * JD-Core Version:    0.6.2
 */