package com.flurry.sdk;

import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.ScreenOrientationType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class an
{
  private static final String a = an.class.getSimpleName();
  private au b = new au();
  private int c = 0;
  private final Map<String, Integer> d = new HashMap();

  public List<AdUnit> a(String paramString, int paramInt1, int paramInt2)
  {
    while (true)
    {
      Object localObject2;
      Object localObject3;
      List localList;
      ArrayList localArrayList;
      AdUnit localAdUnit;
      try
      {
        localObject2 = cc.a();
        localObject3 = this.b.a(paramString, (ScreenOrientationType)localObject2);
        if (b((List)localObject3))
        {
          eo.a(3, a, "no valid ad units in cache for current orientation for " + paramString);
          if (ScreenOrientationType.a.equals(localObject2))
          {
            localScreenOrientationType = ScreenOrientationType.b;
            localList = this.b.a(paramString, localScreenOrientationType);
            if ((!b(localList)) && (a((AdUnit)localList.get(0))))
              break label361;
            eo.a(3, a, "no valid ad units in cache for other orientation for " + paramString);
            break label361;
          }
        }
        else
        {
          localArrayList = new ArrayList();
          if (localObject3 == null)
            break label356;
          Iterator localIterator = ((List)localObject3).iterator();
          if ((!localIterator.hasNext()) || (localArrayList.size() >= paramInt2))
            break label356;
          localAdUnit = (AdUnit)localIterator.next();
          if ((!fe.a(localAdUnit.c().longValue())) || (localAdUnit.e().intValue() != 1) || (localAdUnit.d().size() <= 0))
            break label287;
          localArrayList.add(localAdUnit);
          eo.a(3, a, "Found combinable ad unit for " + paramString);
          continue;
        }
      }
      finally
      {
      }
      ScreenOrientationType localScreenOrientationType = ScreenOrientationType.a;
      continue;
      label287: if ((!fe.a(localAdUnit.c().longValue())) || (localAdUnit.d().size() <= 0))
      {
        this.b.a(paramString, (ScreenOrientationType)localObject2, localAdUnit);
        eo.a(3, a, "Removed invalid or expired ad unit for " + paramString);
        continue;
        label356: return localArrayList;
        label361: localObject3 = localList;
        localObject2 = localScreenOrientationType;
      }
    }
  }

  public void a()
  {
    try
    {
      this.b.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString)
  {
    try
    {
      this.b.a(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      this.b.a(paramString, cc.a(), paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString, AdUnit paramAdUnit)
  {
    try
    {
      this.b.a(paramString, cc.a(), paramAdUnit);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.b.a(paramString1, cc.a(), paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString, List<AdUnit> paramList)
  {
    try
    {
      this.b.a(paramString, cc.a(), paramList);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(List<AdUnit> paramList)
  {
    ds localds;
    try
    {
      localds = new ds();
      Iterator localIterator1 = paramList.iterator();
      while (localIterator1.hasNext())
      {
        AdUnit localAdUnit = (AdUnit)localIterator1.next();
        if (localAdUnit.g().length() > 0)
        {
          x localx = new x(localAdUnit.g().toString(), localAdUnit.h().longValue(), localAdUnit.l().longValue(), localAdUnit.i().intValue(), localAdUnit.j().intValue(), localAdUnit.k().intValue());
          y.a().a(localx);
        }
        String str2 = localAdUnit.b().toString();
        if (str2 != null)
          localds.a(str2, localAdUnit);
      }
    }
    finally
    {
    }
    Iterator localIterator2 = localds.c().iterator();
    while (localIterator2.hasNext())
    {
      String str1 = (String)localIterator2.next();
      this.b.a(str1, localds.a(str1));
    }
  }

  public boolean a(AdUnit paramAdUnit)
  {
    return ((AdFrame)paramAdUnit.d().get(0)).e().e().equals("takeover");
  }

  public void b(String paramString)
  {
    if (paramString != null);
    try
    {
      if (paramString.length() > 0)
      {
        this.c = this.b.b(paramString, cc.a());
        this.d.put(paramString, Integer.valueOf(this.c));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean b(List<AdUnit> paramList)
  {
    return (paramList == null) || (paramList.size() == 0) || (((AdUnit)paramList.get(0)).d().size() == 0) || (((AdFrame)((AdUnit)paramList.get(0)).d().get(0)).e() == null);
  }

  public int c(String paramString)
  {
    while (true)
    {
      try
      {
        Integer localInteger = (Integer)this.d.get(paramString);
        if (localInteger != null)
        {
          int i = localInteger.intValue();
          j = i;
          return j;
        }
      }
      finally
      {
      }
      int j = 0;
    }
  }

  public List<AdUnit> d(String paramString)
  {
    while (true)
    {
      ScreenOrientationType localScreenOrientationType;
      List localList1;
      Object localObject2;
      Iterator localIterator;
      AdUnit localAdUnit;
      try
      {
        localScreenOrientationType = cc.a();
        localList1 = this.b.a(paramString, localScreenOrientationType);
        if (b(localList1))
        {
          eo.a(3, a, "no valid ad units in cache for current orientation for " + paramString);
          List localList3 = Collections.emptyList();
          localObject2 = localList3;
          return localObject2;
        }
        if (b(localList1))
          break label236;
        localIterator = localList1.iterator();
        if (!localIterator.hasNext())
          break label236;
        localAdUnit = (AdUnit)localIterator.next();
        if (localAdUnit.d().size() <= 0)
        {
          localIterator.remove();
          this.b.a(paramString, localScreenOrientationType, localAdUnit);
          eo.a(3, a, "Removed invalid ad unit -- adspace: " + paramString);
          continue;
        }
      }
      finally
      {
      }
      if (!fe.a(localAdUnit.c().longValue()))
      {
        localIterator.remove();
        this.b.a(paramString, localScreenOrientationType, localAdUnit);
        eo.a(3, a, "Removed expired ad unit -- adspace: " + paramString);
        continue;
        label236: if (!b(localList1))
        {
          eo.a(3, a, "found valid ad units for " + paramString);
          localObject2 = localList1;
        }
        else
        {
          eo.a(3, a, "no valid ad units for " + paramString);
          List localList2 = Collections.emptyList();
          localObject2 = localList2;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.an
 * JD-Core Version:    0.6.2
 */