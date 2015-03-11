package com.flurry.sdk;

import java.util.HashMap;

public class lc
{
  private final lc.b[] a;
  private final HashMap<String, Integer> b;
  private final String[] c;
  private final sq[] d;

  protected lc(lc paramlc)
  {
    this.a = paramlc.a;
    this.b = paramlc.b;
    int i = this.a.length;
    this.c = new String[i];
    this.d = new sq[i];
  }

  protected lc(lc.b[] paramArrayOfb, HashMap<String, Integer> paramHashMap, String[] paramArrayOfString, sq[] paramArrayOfsq)
  {
    this.a = paramArrayOfb;
    this.b = paramHashMap;
    this.c = paramArrayOfString;
    this.d = paramArrayOfsq;
  }

  public lc a()
  {
    return new lc(this);
  }

  public Object a(hj paramhj, iz paramiz, Object paramObject)
  {
    int i = 0;
    int j = this.a.length;
    while (i < j)
    {
      if (this.c[i] == null)
      {
        if (this.d[i] != null)
          throw paramiz.b("Missing external type id property '" + this.a[i].a());
      }
      else
      {
        if (this.d[i] == null)
        {
          kt localkt = this.a[i].b();
          throw paramiz.b("Missing property '" + localkt.c() + "' for external type id '" + this.a[i].a());
        }
        a(paramhj, paramiz, paramObject, i);
      }
      i++;
    }
    return paramObject;
  }

  protected final void a(hj paramhj, iz paramiz, Object paramObject, int paramInt)
  {
    sq localsq = new sq(paramhj.a());
    localsq.b();
    localsq.b(this.c[paramInt]);
    hj localhj1 = this.d[paramInt].a(paramhj);
    localhj1.b();
    localsq.c(localhj1);
    localsq.c();
    hj localhj2 = localsq.a(paramhj);
    localhj2.b();
    this.a[paramInt].b().a(localhj2, paramiz, paramObject);
  }

  public boolean a(hj paramhj, iz paramiz, String paramString, Object paramObject)
  {
    Integer localInteger = (Integer)this.b.get(paramString);
    if (localInteger == null)
      return false;
    int i = localInteger.intValue();
    int k;
    if (this.a[i].a(paramString))
    {
      this.c[i] = paramhj.k();
      paramhj.d();
      if ((paramObject != null) && (this.d[i] != null))
        k = 1;
    }
    while (true)
    {
      if (k != 0)
      {
        a(paramhj, paramiz, paramObject, i);
        this.c[i] = null;
        this.d[i] = null;
      }
      return true;
      k = 0;
      continue;
      sq localsq = new sq(paramhj.a());
      localsq.c(paramhj);
      this.d[i] = localsq;
      int j = 0;
      if (paramObject != null)
      {
        String str = this.c[i];
        j = 0;
        if (str != null)
          j = 1;
      }
      k = j;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lc
 * JD-Core Version:    0.6.2
 */