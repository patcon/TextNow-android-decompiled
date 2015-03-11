package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class u
{
  private static final String a = u.class.getSimpleName();
  private final FlurryAdModule b;
  private an c;
  private final m d;
  private final Map<String, u.a> e;

  public u(FlurryAdModule paramFlurryAdModule)
  {
    this.b = paramFlurryAdModule;
    this.d = new m();
    this.c = new an();
    this.e = new HashMap();
  }

  private void a(List<AdUnit> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
      return;
    this.c.a(paramList);
  }

  private u.a g(String paramString)
  {
    try
    {
      u.a locala = (u.a)this.e.get(paramString);
      if (locala == null)
      {
        locala = new u.a(this, paramString);
        this.e.put(paramString, locala);
      }
      return locala;
    }
    finally
    {
    }
  }

  public l a(FlurryAdModule paramFlurryAdModule, Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    return this.d.a(paramFlurryAdModule, paramContext, paramViewGroup, paramString);
  }

  public List<AdUnit> a(String paramString, int paramInt1, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString))
      return Collections.emptyList();
    List localList = this.c.a(paramString, paramInt1, paramInt2);
    this.c.a(paramString, localList);
    return localList;
  }

  public void a()
  {
    try
    {
      Iterator localIterator = this.e.values().iterator();
      while (localIterator.hasNext())
        ((u.a)localIterator.next()).a();
    }
    finally
    {
    }
    this.e.clear();
  }

  public void a(final Activity paramActivity, du.a parama)
  {
    if (du.a.c.equals(parama))
    {
      Iterator localIterator2 = this.d.a(paramActivity).iterator();
      while (localIterator2.hasNext())
        ((l)localIterator2.next()).c();
    }
    if (du.a.d.equals(parama))
    {
      Iterator localIterator1 = this.d.a(paramActivity).iterator();
      while (localIterator1.hasNext())
        ((l)localIterator1.next()).b();
    }
    if (du.a.b.equals(parama))
      this.b.a(new ff()
      {
        public void a()
        {
          u.this.a(paramActivity);
        }
      });
  }

  public void a(Context paramContext, String paramString)
  {
    eo.a(3, a, "removeAd: context = " + paramContext + ", adSpaceName = " + paramString);
    g(paramString).c();
  }

  public void a(Context paramContext, String paramString, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize, boolean paramBoolean)
  {
    eo.a(3, a, "fetchAd: context = " + paramContext + ", adSpaceName = " + paramString + ", viewGroup = " + paramViewGroup + ", size = " + paramFlurryAdSize + ", autoDisplay = " + paramBoolean);
    g(paramString).a(paramContext, paramViewGroup, paramFlurryAdSize, paramBoolean);
  }

  void a(String paramString, int paramInt)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.c.a(paramString, paramInt);
  }

  public void a(String paramString, AdUnit paramAdUnit)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramAdUnit == null))
      return;
    this.c.a(paramString, paramAdUnit);
  }

  void a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
      return;
    this.c.a(paramString1, paramString2);
  }

  public void a(String paramString, List<AdUnit> paramList)
  {
    if (paramList == null);
    u.a locala;
    do
    {
      return;
      eo.a(3, a, "Handling ad response");
      if (TextUtils.isEmpty(paramString))
      {
        a(paramList);
        f(paramString);
        eo.a(3, a, "handleAdResponse: setting cache request limit count");
        return;
      }
      locala = g(paramString);
    }
    while (locala.a(paramList));
    a(paramList);
    f(paramString);
    eo.a(3, a, "handleAdResponse: setting cache request limit count");
    locala.f();
  }

  public boolean a(Context paramContext)
  {
    Iterator localIterator = this.d.a(paramContext).iterator();
    for (int i = 0; localIterator.hasNext(); i++)
      a(paramContext, ((l)localIterator.next()).getAdSpace());
    eo.a(3, a, "removeAllAds: removed " + i + " banners");
    boolean bool = false;
    if (i > 0)
      bool = true;
    return bool;
  }

  public boolean a(Context paramContext, String paramString, ViewGroup paramViewGroup)
  {
    eo.a(3, a, "displayAd: context = " + paramContext + ", adSpaceName = " + paramString + ", viewGroup = " + paramViewGroup);
    return g(paramString).a(paramContext, paramViewGroup);
  }

  public boolean a(Context paramContext, String paramString, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize)
  {
    eo.a(3, a, "getAd: context = " + paramContext + ", adSpaceName = " + paramString + ", viewGroup = " + paramViewGroup + ", size = " + paramFlurryAdSize);
    if (a(paramString))
      return a(paramContext, paramString, paramViewGroup);
    a(paramContext, paramString, paramViewGroup, paramFlurryAdSize, true);
    return false;
  }

  public boolean a(Context paramContext, String paramString, FlurryAdSize paramFlurryAdSize)
  {
    eo.a(3, a, "isAdAvailable: adSpaceName = " + paramString);
    return a(paramString);
  }

  public boolean a(String paramString)
  {
    eo.a(3, a, "isAdReady: adSpaceName = " + paramString);
    return g(paramString).d();
  }

  public String b(String paramString)
  {
    return g(paramString).e();
  }

  public void b()
  {
    this.c.a();
  }

  public an c()
  {
    return this.c;
  }

  public l c(String paramString)
  {
    return this.d.a(paramString);
  }

  public void d(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.c.a(paramString);
  }

  public List<AdUnit> e(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return Collections.emptyList();
    return this.c.d(paramString);
  }

  public void f(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.c.b(paramString);
    eo.a(3, a, "fetchAdTaskExecute: setting cache request limit count");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.u
 * JD-Core Version:    0.6.2
 */