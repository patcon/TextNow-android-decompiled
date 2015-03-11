package com.flurry.sdk;

import android.util.Pair;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.ScreenOrientationType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class au
{
  private static final String a = au.class.getSimpleName();
  private final ds<Pair<String, ScreenOrientationType>, AdUnit> b = new ds();

  public List<AdUnit> a(String paramString, ScreenOrientationType paramScreenOrientationType)
  {
    try
    {
      Pair localPair = Pair.create(paramString, paramScreenOrientationType);
      List localList = this.b.a(localPair);
      if (localList == null);
      for (Object localObject2 = null; ; localObject2 = new ArrayList(localList))
        return localObject2;
    }
    finally
    {
    }
  }

  public void a()
  {
    try
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.b.c().iterator();
      while (localIterator.hasNext())
        localHashSet.add(((Pair)localIterator.next()).first);
    }
    finally
    {
    }
    this.b.a();
  }

  public void a(String paramString)
  {
    try
    {
      Pair localPair1 = Pair.create(paramString, ScreenOrientationType.a);
      this.b.b(localPair1);
      Pair localPair2 = Pair.create(paramString, ScreenOrientationType.b);
      this.b.b(localPair2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString, ScreenOrientationType paramScreenOrientationType, int paramInt)
  {
    while (true)
    {
      List localList;
      try
      {
        Pair localPair = Pair.create(paramString, paramScreenOrientationType);
        localList = this.b.a(localPair);
        if (localList == null)
          return;
        if ((paramInt < 0) || (paramInt > localList.size()))
        {
          this.b.b(localPair);
          continue;
        }
      }
      finally
      {
      }
      if (paramInt > 0)
        localList.subList(0, paramInt).clear();
    }
  }

  public void a(String paramString1, ScreenOrientationType paramScreenOrientationType, String paramString2)
  {
    try
    {
      Pair localPair = Pair.create(paramString1, paramScreenOrientationType);
      List localList = this.b.a(localPair);
      if (localList == null);
      while (true)
      {
        return;
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
          if (((AdUnit)localIterator.next()).f().toString().equals(paramString2))
            localIterator.remove();
      }
    }
    finally
    {
    }
  }

  public void a(String paramString, List<AdUnit> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      try
      {
        eo.a(3, a, "putting " + paramList.size() + " adSpace: " + paramString);
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          AdUnit localAdUnit = (AdUnit)localIterator.next();
          Pair localPair = Pair.create(paramString, localAdUnit.u());
          this.b.a(localPair, localAdUnit);
        }
      }
      finally
      {
      }
    }
  }

  public boolean a(String paramString, ScreenOrientationType paramScreenOrientationType, AdUnit paramAdUnit)
  {
    boolean bool1 = false;
    if (paramAdUnit == null);
    while (true)
    {
      return bool1;
      try
      {
        Pair localPair = Pair.create(paramString, paramScreenOrientationType);
        List localList = this.b.a(localPair);
        bool1 = false;
        if (localList == null)
          continue;
        boolean bool2 = localList.remove(paramAdUnit);
        bool1 = bool2;
      }
      finally
      {
      }
    }
  }

  public boolean a(String paramString, ScreenOrientationType paramScreenOrientationType, List<AdUnit> paramList)
  {
    boolean bool1 = false;
    if (paramList == null);
    while (true)
    {
      return bool1;
      try
      {
        Pair localPair = Pair.create(paramString, paramScreenOrientationType);
        List localList = this.b.a(localPair);
        bool1 = false;
        if (localList == null)
          continue;
        boolean bool2 = localList.removeAll(paramList);
        bool1 = bool2;
      }
      finally
      {
      }
    }
  }

  public int b(String paramString, ScreenOrientationType paramScreenOrientationType)
  {
    try
    {
      Pair localPair = Pair.create(paramString, paramScreenOrientationType);
      List localList = this.b.a(localPair);
      if (localList == null);
      int i;
      for (int j = 0; ; j = i)
      {
        return j;
        i = localList.size();
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.au
 * JD-Core Version:    0.6.2
 */