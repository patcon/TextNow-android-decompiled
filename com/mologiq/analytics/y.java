package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"NewApi"})
public final class y extends AsyncTask<Object, Object, Object>
{
  private final List<z> a;
  private final Map<String, String> b;
  private final String c;
  private final long d;

  @SuppressLint({"NewApi"})
  private final String e;
  private final WeakReference<Context> f;

  y(Context paramContext, List<z> paramList, Map<String, Object> paramMap, String paramString1, long paramLong, String paramString2)
  {
    this.f = new WeakReference(paramContext);
    this.a = paramList;
    this.b = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((paramMap.get(str) instanceof String))
        this.b.put(str, (String)paramMap.get(str));
    }
    this.c = paramString1;
    this.d = paramLong;
    this.e = paramString2;
  }

  protected final Object doInBackground(Object[] paramArrayOfObject)
  {
    while (true)
    {
      Context localContext2;
      d locald;
      e locale;
      ArrayList localArrayList;
      try
      {
        Context localContext1 = (Context)this.f.get();
        if (localContext1 == null)
          return null;
        boolean bool = ag.d(localContext1).b();
        if (bool)
          break;
        try
        {
          localContext2 = (Context)this.f.get();
          if (localContext2 == null)
            break;
          if (!ak.b(localContext2).equals("wifi"))
            break label602;
          i = 1;
          ah localah = ah.b();
          localah.a(localContext2);
          locald = new d();
          locald.e(localah.m());
          locald.a(localah.n());
          locald.f(localah.o());
          locald.c(localah.A());
          locald.d(localah.B());
          locald.b(localah.z());
          locald.a("1.3.6");
          locald.b("2014-11-17");
          if (localContext2.getPackageName() == null)
          {
            str1 = "";
            locald.c(str1);
            locald.getClass();
            locale = new e(locald);
            locale.a(Long.valueOf(System.currentTimeMillis()));
            locale.a(this.c);
            locale.b(Long.valueOf(this.d));
            locale.b(localContext2.getPackageName());
            if ((this.b == null) || (this.b.size() <= 0))
              break label405;
            localArrayList = new ArrayList();
            Iterator localIterator2 = this.b.keySet().iterator();
            if (!localIterator2.hasNext())
              break label398;
            String str4 = (String)localIterator2.next();
            String str5 = (String)this.b.get(str4);
            locale.getClass();
            f localf = new f(locale);
            localf.a(str4);
            localf.b(str5);
            localArrayList.add(localf);
            continue;
          }
        }
        catch (Exception localException2)
        {
          ak.a(localException2.getStackTrace().toString());
          return null;
        }
      }
      catch (Exception localException1)
      {
        ak.a(ak.a(localException1));
        return null;
      }
      String str1 = localContext2.getPackageName();
      continue;
      label398: locale.a(localArrayList);
      label405: locald.d(this.e);
      locald.a(i);
      Iterator localIterator1 = this.a.iterator();
      while (localIterator1.hasNext())
      {
        z localz = (z)localIterator1.next();
        if (localz.equals(z.a))
          locald.b(locale);
        else if (localz.equals(z.b))
          locald.a(locale);
        else if (localz.equals(z.c))
          locald.c(locale);
      }
      String str2 = locald.a();
      new ak(localContext2);
      ag localag = ag.d(localContext2);
      if (!localag.k())
        break;
      String str3 = ak.a(localag.d(), str2, localContext2, 500, 1000, true);
      if ((str3 == null) || (str3.length() <= 0))
        break;
      localag.a(str3, localContext2);
      localag.b(localContext2);
      return null;
      label602: int i = 0;
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.y
 * JD-Core Version:    0.6.2
 */