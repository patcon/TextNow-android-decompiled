package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdListener;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.FlurryAdType;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.Callback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class u$a
  implements ap.b, fb.a
{
  private final String b;
  private u.b c;
  private WeakReference<Context> d;
  private WeakReference<ViewGroup> e;
  private FlurryAdSize f;
  private boolean g;
  private List<AdUnit> h;
  private AdUnit i;
  private ah j;
  private int k;
  private long l;
  private long m;
  private long n;
  private long o;
  private long p;
  private String q;

  public u$a(u paramu, String paramString)
  {
    this.b = paramString;
    this.c = u.b.a;
    this.d = new WeakReference(null);
    this.e = new WeakReference(null);
    a();
  }

  private void a(final AdFrame paramAdFrame, final ci paramci)
  {
    try
    {
      final String str = paramci.e();
      el localel = new el();
      localel.a(str);
      localel.b(new ey());
      localel.a(new el.a()
      {
        public void a(el<Void, String> paramAnonymousel, String paramAnonymousString)
        {
          int i = paramAnonymousel.e();
          eo.a(3, u.d(), "VAST resolver: HTTP status code is:" + i + " for url: " + str);
          boolean bool = paramAnonymousel.c();
          ci localci = null;
          if (bool)
          {
            eo.a(3, u.d(), "VAST resolver response:" + paramAnonymousString + " for url: " + str);
            localci = ci.a(paramci, ck.a(paramAnonymousString));
          }
          if (localci == null)
          {
            eo.a(3, u.d(), "VAST resolver failed for frame: " + paramAdFrame);
            u.a(u.a.this.a).a(paramAdFrame.g().toString(), new ci.a().a().b());
          }
          while (true)
          {
            do.a().c(new ff()
            {
              public void a()
              {
                u.a.e(u.a.this);
              }
            });
            return;
            eo.a(3, u.d(), "VAST resolver successful for frame: " + paramAdFrame);
            u.a(u.a.this.a).a(paramAdFrame.g().toString(), localci);
          }
        }
      });
      em.a().a(this, localel);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(AdUnit paramAdUnit)
  {
    try
    {
      String str = ((AdFrame)paramAdUnit.d().get(0)).g().toString();
      e locale = u.a(this.a).a(str);
      HashMap localHashMap = new HashMap();
      a("prepared", (Context)this.d.get(), localHashMap, paramAdUnit, locale, 0, 0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(AdUnit paramAdUnit, b paramb)
  {
    try
    {
      a();
      String str = ((AdFrame)paramAdUnit.d().get(0)).g().toString();
      e locale = u.a(this.a).a(str);
      HashMap localHashMap = new HashMap();
      localHashMap.put("preRender", "true");
      if (paramb == null)
        paramb = b.a;
      localHashMap.put("errorCode", Integer.toString(paramb.a()));
      a("renderFailed", (Context)this.d.get(), localHashMap, paramAdUnit, locale, 0, 0);
      return;
    }
    finally
    {
    }
  }

  private void a(final AdUnit paramAdUnit, final String paramString)
  {
    try
    {
      eo.a(3, u.d(), "Pre-render: HTTP get for url: " + paramString);
      el localel = new el();
      localel.a(paramString);
      localel.b(new ey());
      localel.a(new el.a()
      {
        public void a(el<Void, String> paramAnonymousel, String paramAnonymousString)
        {
          int i = paramAnonymousel.e();
          eo.a(3, u.d(), "Prerender: HTTP status code is:" + i + " for url: " + paramString);
          if (paramAnonymousel.c())
            synchronized (u.a.this)
            {
              u.a.a(u.a.this, paramAnonymousString);
              do.a().c(new ff()
              {
                public void a()
                {
                  u.a.i(u.a.this);
                  u.a.a(u.a.this, (Context)u.a.j(u.a.this).get(), (ViewGroup)u.a.k(u.a.this).get());
                }
              });
              return;
            }
          do.a().c(new ff()
          {
            public void a()
            {
              u.a.a(u.a.this, u.a.4.this.b, b.k);
            }
          });
        }
      });
      em.a().a(this, localel);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(b paramb)
  {
    try
    {
      boolean bool = u.b.e.equals(this.c);
      if (!bool);
      while (true)
      {
        return;
        if ((this.h != null) && (this.h.size() != 0))
          a((AdUnit)this.h.get(0), paramb);
      }
    }
    finally
    {
    }
  }

  private void a(u.b paramb)
  {
    if (paramb == null);
    try
    {
      paramb = u.b.a;
      eo.a(3, u.d(), "Setting state from " + this.c + " to " + paramb + " for adspace: " + this.b);
      if ((u.b.a.equals(this.c)) && (!u.b.a.equals(paramb)))
      {
        eo.a(3, u.d(), "Adding listeners for adspace: " + this.b);
        fa.a().a(this);
        ap.a().a(this);
        eo.a(3, u.d(), "Done adding listeners for adspace: " + this.b);
      }
      while (true)
      {
        this.c = paramb;
        return;
        if ((u.b.a.equals(paramb)) && (!u.b.a.equals(this.c)))
        {
          eo.a(3, u.d(), "Removing listeners for adspace: " + this.b);
          fa.a().b(this);
          ap.a().b(this);
          eo.a(3, u.d(), "Done removing listeners for adspace: " + this.b);
        }
      }
    }
    finally
    {
    }
  }

  private void a(final String paramString, final Context paramContext, final Map<String, String> paramMap, final AdUnit paramAdUnit, final e parame, int paramInt1, int paramInt2)
  {
    try
    {
      eo.a(3, u.d(), "fireEvent(event=" + paramString + ",params=" + paramMap + ")");
      do.a().c(new ff()
      {
        public void a()
        {
          u.a(u.a.this.a).a(new q(paramString, paramMap, paramContext, paramAdUnit, parame, 0), u.a(u.a.this.a).a(), 0);
        }
      });
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(final Context paramContext, final ViewGroup paramViewGroup)
  {
    try
    {
      if (this.g)
        do.a().a(new ff()
        {
          public void a()
          {
            u.a.this.a(paramContext, paramViewGroup);
          }
        });
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(AdUnit paramAdUnit)
  {
    try
    {
      String str = ((AdFrame)paramAdUnit.d().get(0)).g().toString();
      e locale = u.a(this.a).a(str);
      HashMap localHashMap = new HashMap();
      a("unfilled", (Context)this.d.get(), localHashMap, paramAdUnit, locale, 0, 0);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(b paramb)
  {
    try
    {
      a();
      final FlurryAdListener localFlurryAdListener = u.a(this.a).ac();
      eo.a(3, u.d(), "Firing onRenderFailed, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.onRenderFailed(u.a.m(u.a.this));
          }
        });
      return;
    }
    finally
    {
    }
  }

  private void h()
  {
    try
    {
      if ((this.l > 0L) && (System.currentTimeMillis() > this.l))
        u();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void i()
  {
    try
    {
      if ((this.m > 0L) && (System.currentTimeMillis() > this.m))
        n();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void j()
  {
    try
    {
      if ((this.o > 0L) && (System.currentTimeMillis() > this.o))
        a(b.m);
      while (true)
      {
        return;
        if ((this.n > 0L) && (System.currentTimeMillis() > this.n))
        {
          m();
          l();
        }
      }
    }
    finally
    {
    }
  }

  private void k()
  {
    try
    {
      if ((this.p > 0L) && (System.currentTimeMillis() > this.p))
      {
        em.a().a(this);
        a(this.j.c(), b.o);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void l()
  {
    while (true)
    {
      try
      {
        boolean bool = u.b.e.equals(this.c);
        if (!bool)
          return;
        if ((Context)this.d.get() == null)
        {
          u();
          continue;
        }
      }
      finally
      {
      }
      if (FlurryAdModule.i())
      {
        u();
      }
      else
      {
        ap localap = ap.a();
        label62: AdUnit localAdUnit;
        if (this.h.size() > 0)
        {
          localAdUnit = (AdUnit)this.h.get(0);
          List localList = localAdUnit.d();
          if ((localList == null) || (localList.isEmpty()))
          {
            a(localAdUnit, b.f);
          }
          else
          {
            Iterator localIterator = localAdUnit.d().iterator();
            while (true)
              if (localIterator.hasNext())
              {
                AdFrame localAdFrame = (AdFrame)localIterator.next();
                if (localAdFrame.b().intValue() == 6)
                {
                  localAdUnit.a(Boolean.valueOf(true));
                  a(u.b.c);
                  g();
                  break;
                }
                ci localci = u.a(this.a).b(localAdFrame.g().toString());
                ap.a locala;
                long l1;
                if ((localci != null) && (!localci.c()))
                  if (!localci.d())
                  {
                    long l2 = localAdUnit.o().longValue();
                    if ((l2 > 0L) && (this.o == 0L))
                    {
                      eo.a(3, u.d(), "Setting VAST resolve timeout for " + l2 + " ms");
                      this.o = (l2 + System.currentTimeMillis());
                    }
                    a(localAdFrame, localci);
                    break;
                  }
              }
            this.o = 0L;
            if (localap.b(localAdUnit))
            {
              locala = localap.c(localAdUnit);
              l1 = localAdUnit.p().intValue();
              eo.a(3, u.d(), "Pre-caching required for ad, AdUnitCachedStatus: " + locala + ", skip time limit: " + l1);
              if ((!ap.a.d.equals(locala)) && (l1 > 0L) && (this.n == 0L))
              {
                eo.a(3, u.d(), "Setting skip timer for " + l1 + " ms");
                this.n = (l1 + System.currentTimeMillis());
              }
              if (ap.a.d.equals(locala))
                eo.a(3, u.d(), "Pre-caching completed, ad may proceed");
            }
          }
        }
        else
        {
          while (true)
          {
            if (this.h.size() <= 0)
              break label745;
            a(u.b.f);
            do.a().a(new ff()
            {
              public void a()
              {
                u.a.g(u.a.this);
              }
            });
            break;
            if (ap.a.b.equals(locala))
            {
              if (l1 == 0L)
              {
                eo.a(3, u.d(), "No skip timer");
                m();
                break label62;
              }
              if (l1 <= 0L)
                break label62;
              if (System.currentTimeMillis() > this.n)
              {
                eo.a(3, u.d(), "Skip timer expired");
                m();
                break label62;
              }
              eo.a(3, u.d(), "Waiting for skip timer");
              break;
            }
            if (l1 == 0L)
            {
              eo.a(3, u.d(), "No skip timer");
              m();
              break label62;
            }
            int i1 = 1 + this.k;
            this.k = i1;
            if (i1 > 1)
            {
              eo.a(3, u.d(), "Too many precaching attempts, precaching failed");
              a(b.h);
              break;
            }
            int i2 = localap.e(localAdUnit);
            if (i2 > 0)
            {
              eo.a(3, u.d(), "Requesting " + i2 + " asset(s), attempt #" + this.k);
              break;
            }
            eo.a(3, u.d(), "No assets to cache");
            continue;
            eo.a(3, u.d(), "Pre-caching not required for ad");
          }
          label745: u.a(this.a).O();
          u();
          v();
        }
      }
    }
  }

  private void m()
  {
    while (true)
    {
      try
      {
        boolean bool = u.b.e.equals(this.c);
        if (!bool)
          return;
        if ((this.h == null) || (this.h.size() == 0))
          continue;
        String str = ((AdUnit)this.h.remove(0)).f().toString();
        eo.a(3, u.d(), "Precaching required for incomplete ad unit, skipping ad group -- adspace: " + this.b + " groupId: " + str);
        if (!TextUtils.isEmpty(str))
          if ((this.h.size() > 0) && (str.equals(((AdUnit)this.h.get(0)).f().toString())))
          {
            this.h.remove(0);
            continue;
          }
      }
      finally
      {
      }
      u.a(this.a).a("precachingAdGroupSkipped", 1);
      this.k = 0;
      this.n = 0L;
    }
  }

  private void n()
  {
    while (true)
    {
      try
      {
        if (!u.b.c.equals(this.c))
        {
          boolean bool = u.b.d.equals(this.c);
          if (!bool)
            return;
        }
        if ((this.h == null) || (this.h.size() == 0))
          continue;
        Iterator localIterator1 = ((AdFrame)((AdUnit)this.h.get(0)).d().get(0)).f().iterator();
        i1 = 1;
        if (localIterator1.hasNext())
        {
          Callback localCallback = (Callback)localIterator1.next();
          if (!localCallback.b().toString().equals("unfilled"))
            continue;
          Iterator localIterator2 = localCallback.c().iterator();
          if (!localIterator2.hasNext())
            continue;
          String str = ((CharSequence)localIterator2.next()).toString();
          int i2 = str.indexOf('?');
          if (i2 != -1)
            str = str.substring(0, i2);
          if (!str.equals("nextAdUnit"))
            break label280;
          i3 = 0;
          break label283;
        }
        if (i1 == 1)
        {
          b((AdUnit)this.h.get(0));
          a((AdUnit)this.h.get(0), b.n);
          continue;
        }
      }
      finally
      {
      }
      b((AdUnit)this.h.get(0));
      b();
      continue;
      label280: int i3 = i1;
      label283: int i1 = i3;
    }
  }

  private void o()
  {
    while (true)
    {
      Context localContext;
      ViewGroup localViewGroup;
      AdUnit localAdUnit;
      try
      {
        boolean bool = u.b.f.equals(this.c);
        if (!bool)
          return;
        eo.a(3, u.d(), "Preparing ad");
        localContext = (Context)this.d.get();
        localViewGroup = (ViewGroup)this.e.get();
        localAdUnit = (AdUnit)this.h.get(0);
        if (this.i == null)
        {
          this.a.a(this.b, localAdUnit);
          if (localContext != null)
            break label127;
          a(localAdUnit, b.e);
          continue;
        }
      }
      finally
      {
      }
      this.a.a(this.b, this.i);
      continue;
      label127: this.j = u.a(this.a).a(localContext, localAdUnit, this.b, localViewGroup, this.f);
      a(u.b.g);
      do.a().c(new ff()
      {
        public void a()
        {
          u.a.h(u.a.this);
        }
      });
    }
  }

  private void p()
  {
    while (true)
    {
      try
      {
        boolean bool = u.b.g.equals(this.c);
        if (!bool)
          return;
        if (this.j == null)
        {
          u();
          continue;
        }
      }
      finally
      {
      }
      eo.a(3, u.d(), "Pre-rendering ad");
      AdUnit localAdUnit = this.j.c();
      List localList = localAdUnit.d();
      if ((localList == null) || (localList.isEmpty()))
      {
        u();
      }
      else
      {
        Iterator localIterator = localList.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            AdFrame localAdFrame2 = (AdFrame)localIterator.next();
            ci localci = u.a(this.a).b(localAdFrame2.g().toString());
            if ((localci != null) && ((!localci.c()) || (localci.d())))
            {
              a(localAdUnit, b.g);
              break;
            }
          }
        ap localap = ap.a();
        if (localap.b(localAdUnit))
        {
          eo.a(3, u.d(), "Precaching required for ad, copying assets");
          ap.a locala = localap.c(localAdUnit);
          if (ap.a.d.equals(locala))
          {
            u.a(this.a).a("precachingAdAssetsAvailable", 1);
            if (!ap.a().d(localAdUnit))
            {
              eo.a(3, u.d(), "Could not copy required ad assets");
              u.a(this.a).a("precachingAdAssetCopyFailed", 1);
              a(localAdUnit, b.i);
            }
          }
          else
          {
            eo.a(3, u.d(), "Ad assets incomplete");
            u.a(this.a).a("precachingAdAssetsIncomplete", 1);
            a(localAdUnit, b.j);
          }
        }
        else
        {
          if (localap.a(localAdUnit))
          {
            eo.a(3, u.d(), "Precaching optional for ad, copying assets");
            ap.a().d(localAdUnit);
          }
          a(localAdUnit);
          AdFrame localAdFrame1 = (AdFrame)localList.get(0);
          if (localAdFrame1.b().intValue() == 1)
          {
            eo.a(3, u.d(), "Binding is HTML_URL, pre-render required");
            long l1 = localAdUnit.o().longValue();
            if (l1 > 0L)
            {
              eo.a(3, u.d(), "Setting pre-render timeout for " + l1 + " ms");
              this.p = (l1 + System.currentTimeMillis());
            }
            a(localAdUnit, localAdFrame1.c().toString());
          }
          else
          {
            t();
            b((Context)this.d.get(), (ViewGroup)this.e.get());
          }
        }
      }
    }
  }

  private void q()
  {
    try
    {
      boolean bool = u.b.i.equals(this.c);
      if (!bool);
      while (true)
      {
        return;
        AdUnit localAdUnit = this.j.c();
        ap localap = ap.a();
        if ((!localap.b(localAdUnit)) && (localap.a(localAdUnit)))
        {
          eo.a(3, u.d(), "Precaching optional for ad, copying assets before display");
          ap.a().d(localAdUnit);
        }
        a(u.b.j);
        do.a().a(new ff()
        {
          public void a()
          {
            u.a.l(u.a.this);
          }
        });
      }
    }
    finally
    {
    }
  }

  private void r()
  {
    while (true)
    {
      Context localContext;
      ViewGroup localViewGroup;
      try
      {
        boolean bool = u.b.j.equals(this.c);
        if (!bool)
          return;
        localContext = (Context)this.d.get();
        localViewGroup = (ViewGroup)this.e.get();
        if (localContext == null)
        {
          b(b.e);
          continue;
        }
      }
      finally
      {
      }
      AdUnit localAdUnit = this.j.c();
      u.a(this.a).a(localContext, localAdUnit, this.j);
      this.j.a(localContext, localViewGroup);
      v();
      s();
    }
  }

  private void s()
  {
    try
    {
      a();
      final FlurryAdListener localFlurryAdListener = u.a(this.a).ac();
      eo.a(3, u.d(), "Firing onRendered, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.onRendered(u.a.m(u.a.this));
          }
        });
      return;
    }
    finally
    {
    }
  }

  private void t()
  {
    try
    {
      a(u.b.h);
      final FlurryAdListener localFlurryAdListener = u.a(this.a).ac();
      eo.a(3, u.d(), "Firing spaceDidReceiveAd, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.spaceDidReceiveAd(u.a.m(u.a.this));
          }
        });
      return;
    }
    finally
    {
    }
  }

  private void u()
  {
    try
    {
      a();
      final FlurryAdListener localFlurryAdListener = u.a(this.a).ac();
      eo.a(3, u.d(), "Firing spaceDidFailToReceiveAd, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.spaceDidFailToReceiveAd(u.a.m(u.a.this));
          }
        });
      return;
    }
    finally
    {
    }
  }

  private void v()
  {
    try
    {
      List localList = this.a.e(this.b);
      if (localList.isEmpty())
      {
        eo.a(3, u.d(), "Starting ad request from EnsureCacheNotEmpty size: " + localList.size());
        FlurryAdModule.getInstance().e().a(this.b, (ViewGroup)this.e.get(), this.f, false, null);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a()
  {
    try
    {
      em.a().a(this);
      a(u.b.a);
      this.d.clear();
      this.e.clear();
      this.f = null;
      this.g = false;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = 0;
      this.l = 0L;
      this.m = 0L;
      this.n = 0L;
      this.o = 0L;
      this.p = 0L;
      this.q = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(Context paramContext, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        if (d())
        {
          t();
          return;
        }
        if (!u.b.a.equals(this.c))
          continue;
        if (!ev.a().c())
        {
          eo.a(5, u.d(), "There is no network connectivity (ad will not fetch)");
          u();
          continue;
        }
      }
      finally
      {
      }
      u.a(this.a).L();
      this.d = new WeakReference(paramContext);
      this.e = new WeakReference(paramViewGroup);
      this.f = paramFlurryAdSize;
      this.g = paramBoolean;
      this.h = this.a.e(this.b);
      if (this.h.isEmpty())
      {
        a(u.b.b);
        if (15000L > 0L)
        {
          eo.a(3, u.d(), "Setting ad request timeout for " + 15000L + " ms");
          this.l = (15000L + System.currentTimeMillis());
        }
        u.a(this.a).e().a(this.b, (ViewGroup)this.e.get(), this.f, false, null);
      }
      else
      {
        a(u.b.e);
        do.a().c(new ff()
        {
          public void a()
          {
            u.a.e(u.a.this);
          }
        });
      }
    }
  }

  public void a(fb paramfb)
  {
    while (true)
    {
      try
      {
        if (u.b.b.equals(this.c))
        {
          do.a().c(new ff()
          {
            public void a()
            {
              u.a.a(u.a.this);
            }
          });
          return;
        }
        if (u.b.d.equals(this.c))
        {
          do.a().c(new ff()
          {
            public void a()
            {
              u.a.b(u.a.this);
            }
          });
          continue;
        }
      }
      finally
      {
      }
      if (u.b.e.equals(this.c))
        do.a().c(new ff()
        {
          public void a()
          {
            u.a.c(u.a.this);
          }
        });
      else if (u.b.g.equals(this.c))
        do.a().c(new ff()
        {
          public void a()
          {
            u.a.d(u.a.this);
          }
        });
    }
  }

  public void a(String paramString, ar paramar)
  {
    try
    {
      eo.a(3, u.d(), "Detected asset status change for asset:" + paramString + " status:" + paramar);
      if ((u.b.e.equals(this.c)) && ((ar.d.equals(paramar)) || (ar.g.equals(paramar))))
        do.a().c(new ff()
        {
          public void a()
          {
            u.a.e(u.a.this);
          }
        });
      return;
    }
    finally
    {
    }
  }

  public boolean a(Context paramContext, ViewGroup paramViewGroup)
  {
    while (true)
    {
      boolean bool2;
      try
      {
        boolean bool1 = u.b.h.equals(this.c);
        bool2 = false;
        if (!bool1)
          return bool2;
        if (!ev.a().c())
        {
          eo.a(5, u.d(), "There is no network connectivity (ad will not display)");
          b(b.c);
          bool2 = false;
          continue;
        }
      }
      finally
      {
      }
      if (this.j == null)
      {
        b(b.d);
        bool2 = false;
        continue;
      }
      if (paramContext == null)
      {
        b(b.e);
        bool2 = false;
        continue;
      }
      this.d = new WeakReference(paramContext);
      this.e = new WeakReference(paramViewGroup);
      FlurryAdListener localFlurryAdListener = u.a(this.a).ac();
      eo.a(3, u.d(), "Firing shouldDisplayAd, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null);
      try
      {
        String str = this.b;
        if ((this.j instanceof j));
        for (FlurryAdType localFlurryAdType = FlurryAdType.WEB_BANNER; ; localFlurryAdType = FlurryAdType.WEB_TAKEOVER)
        {
          boolean bool4 = localFlurryAdListener.shouldDisplayAd(str, localFlurryAdType);
          bool3 = bool4;
          bool2 = false;
          if (!bool3)
            break;
          if ((paramViewGroup != null) && ((this.j instanceof j)))
            paramViewGroup.setBackgroundColor(369098752);
          a(u.b.i);
          do.a().c(new ff()
          {
            public void a()
            {
              u.a.f(u.a.this);
            }
          });
          bool2 = true;
          break;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          eo.a(6, u.d(), "AdListener.shouldDisplayAd", localThrowable);
          boolean bool3 = false;
        }
      }
    }
  }

  public boolean a(List<AdUnit> paramList)
  {
    while (true)
    {
      try
      {
        if (u.b.d.equals(this.c))
        {
          if ((paramList != null) && (!paramList.isEmpty()))
          {
            int i1 = paramList.size();
            if (i1 <= 1);
          }
          else
          {
            bool1 = false;
            return bool1;
          }
          AdUnit localAdUnit = (AdUnit)paramList.get(0);
          if (!localAdUnit.s().booleanValue())
          {
            bool1 = false;
            continue;
          }
          List localList1 = localAdUnit.d();
          if ((localList1 != null) && (!localList1.isEmpty()) && (((AdFrame)localList1.get(0)).b().intValue() != 6))
          {
            this.h.remove(0);
            String str = null;
            if (localAdUnit != null)
            {
              Map localMap = localAdUnit.t();
              str = null;
              if (localMap != null)
              {
                boolean bool2 = localMap.containsKey("GROUP_ID");
                str = null;
                if (bool2)
                  str = ((CharSequence)localMap.get("GROUP_ID")).toString();
              }
            }
            if (str == null)
            {
              AdFrame localAdFrame = (AdFrame)localAdUnit.d().get(0);
              List localList2 = this.i.d();
              localList2.remove(0);
              localList2.add(0, localAdFrame);
              localAdUnit.a(localList2);
              localAdUnit.a(this.i.f());
              if ((localAdUnit.t() != null) && (localAdUnit.t().isEmpty()))
                localAdUnit.a(this.i.t());
              localAdUnit.b(this.i.g());
            }
            this.h.add(0, localAdUnit);
            a(u.b.e);
            do.a().c(new ff()
            {
              public void a()
              {
                u.a.e(u.a.this);
              }
            });
            bool1 = true;
            continue;
          }
        }
        else
        {
          bool1 = false;
          continue;
        }
      }
      finally
      {
      }
      boolean bool1 = false;
    }
  }

  public void b()
  {
    try
    {
      AdUnit localAdUnit = (AdUnit)this.h.get(0);
      u.b(this.a).a(this.b, localAdUnit);
      this.h.remove(0);
      a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void c()
  {
    try
    {
      l locall = u.c(this.a).a(this.b);
      if (locall != null)
      {
        locall.d();
        locall.removeAllViews();
        ViewGroup localViewGroup = locall.getViewGroup();
        if (localViewGroup != null)
          localViewGroup.removeView(locall);
        u.c(this.a).a(locall);
      }
      u.a(this.a).g(this.b);
      a();
      return;
    }
    finally
    {
    }
  }

  public boolean d()
  {
    try
    {
      boolean bool = u.b.h.equals(this.c);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String e()
  {
    try
    {
      String str = this.q;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void f()
  {
    try
    {
      if (u.b.b.equals(this.c))
      {
        a(u.b.e);
        this.h = this.a.e(this.b);
        l();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void g()
  {
    while (true)
    {
      ViewGroup localViewGroup;
      FlurryAdSize localFlurryAdSize;
      try
      {
        boolean bool = u.b.c.equals(this.c);
        if (!bool)
          return;
        localViewGroup = (ViewGroup)this.e.get();
        localFlurryAdSize = this.f;
        this.h = this.a.e(this.b);
        if (this.h.isEmpty())
        {
          eo.a(6, u.d(), "An auction is required, but there is no ad unit!");
          u();
          continue;
        }
      }
      finally
      {
      }
      a(u.b.d);
      AdUnit localAdUnit = (AdUnit)this.h.get(0);
      long l1 = localAdUnit.o().longValue();
      if (l1 > 0L)
      {
        eo.a(3, u.d(), "Setting CSRTB auction timeout for " + l1 + " ms");
        this.m = (l1 + System.currentTimeMillis());
      }
      this.i = localAdUnit;
      u.a(this.a).e().a(this.b, localViewGroup, localFlurryAdSize, false, localAdUnit);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.u.a
 * JD-Core Version:    0.6.2
 */