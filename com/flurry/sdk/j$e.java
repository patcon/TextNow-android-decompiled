package com.flurry.sdk;

import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class j$e extends j.c
{
  private static final Map<String, Integer> a = a();

  j$e()
  {
    super(null);
  }

  private static Integer a(String paramString)
  {
    return (Integer)a.get(paramString);
  }

  private static Map<String, Integer> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("b", Integer.valueOf(12));
    localHashMap.put("t", Integer.valueOf(10));
    localHashMap.put("m", Integer.valueOf(15));
    localHashMap.put("c", Integer.valueOf(14));
    localHashMap.put("l", Integer.valueOf(9));
    localHashMap.put("r", Integer.valueOf(11));
    return Collections.unmodifiableMap(localHashMap);
  }

  public final ViewGroup.LayoutParams a(AdSpaceLayout paramAdSpaceLayout)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(b(paramAdSpaceLayout), c(paramAdSpaceLayout));
    String[] arrayOfString = paramAdSpaceLayout.f().toString().split("-");
    if (arrayOfString.length == 2)
    {
      Integer localInteger1 = a(arrayOfString[0]);
      if (localInteger1 != null)
        localLayoutParams.addRule(localInteger1.intValue());
      Integer localInteger2 = a(arrayOfString[1]);
      if (localInteger2 != null)
        localLayoutParams.addRule(localInteger2.intValue());
    }
    return localLayoutParams;
  }

  public final int g(AdSpaceLayout paramAdSpaceLayout)
  {
    return -1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j.e
 * JD-Core Version:    0.6.2
 */