package com.mologiq.analytics;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class v
  implements Runnable
{
  private final List<w> a;
  private final Map<String, String> b;
  private final String c;
  private final long d;
  private final String e;
  private final WeakReference<Context> f;

  public v(Context paramContext, List<w> paramList, Map<String, Object> paramMap, String paramString1, int paramInt, String paramString2)
  {
    this.f = new WeakReference(paramContext);
    this.a = paramList;
    this.b = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        this.c = paramString1;
        this.d = paramInt;
        this.e = paramString2;
        return;
      }
      String str = (String)localIterator.next();
      if ((paramMap.get(str) instanceof String))
        this.b.put(str, (String)paramMap.get(str));
    }
  }

  public final void run()
  {
    while (true)
    {
      Context localContext2;
      int i;
      b localb;
      c localc;
      ArrayList localArrayList;
      Iterator localIterator2;
      Iterator localIterator1;
      try
      {
        Context localContext1 = (Context)this.f.get();
        if (localContext1 == null)
          return;
        boolean bool = ab.d(localContext1).b();
        if (bool)
          break;
        try
        {
          localContext2 = (Context)this.f.get();
          if (localContext2 == null)
            break;
          if (!af.b(localContext2).equals("wifi"))
            break label559;
          i = 1;
          ac localac = ac.b();
          localac.a(localContext2);
          localb = new b();
          localb.e(localac.m());
          localb.a(localac.n());
          localb.f(localac.o());
          localb.a("1.2.9");
          localb.b("2014-07-08");
          if (localContext2.getPackageName() == null)
          {
            str1 = "";
            localb.c(str1);
            localb.getClass();
            localc = new c(localb);
            localc.a(Long.valueOf(System.currentTimeMillis()));
            localc.a(this.c);
            localc.b(Long.valueOf(this.d));
            localc.b(localContext2.getPackageName());
            if ((this.b != null) && (this.b.size() > 0))
            {
              localArrayList = new ArrayList();
              localIterator2 = this.b.keySet().iterator();
              if (localIterator2.hasNext())
                break label412;
              localc.a(localArrayList);
            }
            localb.d(this.e);
            localb.a(i);
            localIterator1 = this.a.iterator();
            if (localIterator1.hasNext())
              break label484;
            String str2 = localb.a();
            new af(localContext2);
            ab localab = ab.d(localContext2);
            String str3 = af.a(localab.d(), str2, localContext2, 500, 1000, true);
            if ((str3 == null) || (str3.length() <= 0))
              break;
            localab.b(str3);
            localab.b(localContext2);
            return;
          }
        }
        catch (Exception localException2)
        {
          af.a(localException2.getStackTrace().toString());
          return;
        }
      }
      catch (Exception localException1)
      {
        af.a(localException1.getStackTrace().toString());
        return;
      }
      String str1 = localContext2.getPackageName();
      continue;
      label412: String str4 = (String)localIterator2.next();
      String str5 = (String)this.b.get(str4);
      localc.getClass();
      d locald = new d(localc);
      locald.a(str4);
      locald.b(str5);
      localArrayList.add(locald);
      continue;
      label484: w localw = (w)localIterator1.next();
      if (localw.equals(w.a))
      {
        localb.b(localc);
      }
      else if (localw.equals(w.b))
      {
        localb.a(localc);
      }
      else if (localw.equals(w.c))
      {
        localb.c(localc);
        continue;
        label559: i = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.v
 * JD-Core Version:    0.6.2
 */