package com.flurry.sdk;

import java.util.HashSet;

public class mg extends ko
{
  public mg(ko paramko)
  {
    super(paramko);
  }

  protected mg(ko paramko, boolean paramBoolean)
  {
    super(paramko, paramBoolean);
  }

  public jg<Object> a()
  {
    if (getClass() != mg.class)
      return this;
    return new mg(this, true);
  }

  public Object b(hj paramhj, iz paramiz)
  {
    if (this.f != null)
      localObject2 = i(paramhj, paramiz);
    boolean bool1;
    int i;
    Object localObject1;
    do
    {
      return localObject2;
      if (this.e != null)
        return this.d.a(this.e.a(paramhj, paramiz));
      if (this.b.c())
        throw jh.a(paramhj, "Can not instantiate abstract type " + this.b + " (need to add/enable type information?)");
      bool1 = this.d.c();
      boolean bool2 = this.d.h();
      if ((!bool1) && (!bool2))
        throw new jh("Can not deserialize Throwable of type " + this.b + " without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
      i = 0;
      localObject1 = null;
      localObject2 = null;
      if (paramhj.e() != hm.c)
      {
        String str = paramhj.g();
        kt localkt = this.h.a(str);
        paramhj.b();
        int k;
        Object localObject3;
        Object localObject4;
        if (localkt != null)
          if (localObject2 != null)
          {
            localkt.a(paramhj, paramiz, localObject2);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
        while (true)
        {
          paramhj.b();
          localObject2 = localObject4;
          localObject1 = localObject3;
          i = k;
          break;
          if (localObject1 == null)
          {
            int i1 = this.h.b();
            localObject1 = new Object[i1 + i1];
          }
          int n = i + 1;
          localObject1[i] = localkt;
          k = n + 1;
          localObject1[n] = localkt.a(paramhj, paramiz);
          localObject3 = localObject1;
          localObject4 = localObject2;
          continue;
          if (("message".equals(str)) && (bool1))
          {
            localObject2 = this.d.a(paramhj.k());
            if (localObject1 != null)
            {
              for (int m = 0; m < i; m += 2)
                ((kt)localObject1[m]).a(localObject2, localObject1[(m + 1)]);
              k = i;
              localObject4 = localObject2;
              localObject3 = null;
            }
          }
          else if ((this.k != null) && (this.k.contains(str)))
          {
            paramhj.d();
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else if (this.j != null)
          {
            this.j.a(paramhj, paramiz, localObject2, str);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else
          {
            a(paramhj, paramiz, localObject2, str);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
        }
      }
    }
    while (localObject2 != null);
    if (bool1);
    for (Object localObject2 = this.d.a(null); ; localObject2 = this.d.m())
    {
      int j = 0;
      if (localObject1 == null)
        break;
      while (j < i)
      {
        ((kt)localObject1[j]).a(localObject2, localObject1[(j + 1)]);
        j += 2;
      }
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mg
 * JD-Core Version:    0.6.2
 */