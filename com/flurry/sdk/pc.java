package com.flurry.sdk;

public abstract class pc extends pw<Object>
  implements jt
{
  protected static final oi[] a = new oi[0];
  protected final oi[] b;
  protected final oi[] c;
  protected final of d;
  protected final Object e;

  protected pc(pc parampc)
  {
    this(parampc.k, parampc.b, parampc.c, parampc.d, parampc.e);
  }

  protected pc(sh paramsh, oi[] paramArrayOfoi1, oi[] paramArrayOfoi2, of paramof, Object paramObject)
  {
    super(paramsh);
    this.b = paramArrayOfoi1;
    this.c = paramArrayOfoi2;
    this.d = paramof;
    this.e = paramObject;
  }

  public pc(Class<?> paramClass, oi[] paramArrayOfoi1, oi[] paramArrayOfoi2, of paramof, Object paramObject)
  {
    super(paramClass);
    this.b = paramArrayOfoi1;
    this.c = paramArrayOfoi2;
    this.d = paramof;
    this.e = paramObject;
  }

  public void a(jw paramjw)
  {
    int i;
    int k;
    label18: oi localoi1;
    sh localsh;
    if (this.c == null)
    {
      i = 0;
      int j = this.b.length;
      k = 0;
      if (k >= j)
        break label221;
      localoi1 = this.b[k];
      if (!localoi1.e())
      {
        localsh = localoi1.f();
        if (localsh != null)
          break label110;
        localsh = paramjw.a(localoi1.g());
        if (localsh.u())
          break label110;
        if ((localsh.f()) || (localsh.h() > 0))
          localoi1.a(localsh);
      }
    }
    while (true)
    {
      k++;
      break label18;
      i = this.c.length;
      break;
      label110: Object localObject = paramjw.a(localsh, localoi1);
      if (localsh.f())
      {
        jz localjz = (jz)localsh.g().o();
        if ((localjz != null) && ((localObject instanceof pf)))
          localObject = ((pf)localObject).b(localjz);
      }
      oi localoi2 = localoi1.a((jk)localObject);
      this.b[k] = localoi2;
      if (k < i)
      {
        oi localoi3 = this.c[k];
        if (localoi3 != null)
          this.c[k] = localoi3.a((jk)localObject);
      }
    }
    label221: if (this.d != null)
      this.d.a(paramjw);
  }

  public void a(Object paramObject, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.b(paramObject, paramhf);
    if (this.e != null)
      c(paramObject, paramhf, paramjw);
    while (true)
    {
      paramjz.e(paramObject, paramhf);
      return;
      b(paramObject, paramhf, paramjw);
    }
  }

  protected oh b(jw paramjw)
  {
    Object localObject = this.e;
    on localon = paramjw.b();
    if (localon == null)
      throw new jh("Can not resolve BeanPropertyFilter with id '" + localObject + "'; no FilterProvider configured");
    return localon.a(localObject);
  }

  protected void b(Object paramObject, hf paramhf, jw paramjw)
  {
    oi[] arrayOfoi;
    if ((this.c != null) && (paramjw.a() != null))
      arrayOfoi = this.c;
    int i;
    jh localjh;
    while (true)
    {
      i = 0;
      try
      {
        int j = arrayOfoi.length;
        while (true)
          if (i < j)
          {
            oi localoi = arrayOfoi[i];
            if (localoi != null)
              localoi.a(paramObject, paramhf, paramjw);
            i++;
            continue;
            arrayOfoi = this.b;
            break;
          }
        if (this.d != null)
          this.d.a(paramObject, paramhf, paramjw);
        return;
      }
      catch (Exception localException)
      {
        if (i == arrayOfoi.length);
        for (String str2 = "[anySetter]"; ; str2 = arrayOfoi[i].d())
        {
          a(paramjw, localException, paramObject, str2);
          return;
        }
      }
      catch (StackOverflowError localStackOverflowError)
      {
        localjh = new jh("Infinite recursion (StackOverflowError)");
        if (i != arrayOfoi.length);
      }
    }
    for (String str1 = "[anySetter]"; ; str1 = arrayOfoi[i].d())
    {
      localjh.a(new jh.a(paramObject, str1));
      throw localjh;
    }
  }

  protected void c(Object paramObject, hf paramhf, jw paramjw)
  {
    oi[] arrayOfoi;
    oh localoh;
    if ((this.c != null) && (paramjw.a() != null))
    {
      arrayOfoi = this.c;
      localoh = b(paramjw);
      if (localoh != null)
        break label49;
      b(paramObject, paramhf, paramjw);
    }
    while (true)
    {
      return;
      arrayOfoi = this.b;
      break;
      label49: int i = 0;
      try
      {
        int j = arrayOfoi.length;
        if (i < j)
        {
          oi localoi = arrayOfoi[i];
          if (localoi != null)
            localoh.a(paramObject, paramhf, paramjw, localoi);
        }
        else
        {
          if (this.d == null)
            continue;
          this.d.a(paramObject, paramhf, paramjw);
          return;
        }
      }
      catch (Exception localException)
      {
        if (i == arrayOfoi.length);
        for (String str2 = "[anySetter]"; ; str2 = arrayOfoi[i].d())
        {
          a(paramjw, localException, paramObject, str2);
          return;
        }
      }
      catch (StackOverflowError localStackOverflowError)
      {
        while (true)
        {
          jh localjh = new jh("Infinite recursion (StackOverflowError)");
          if (i == arrayOfoi.length);
          for (String str1 = "[anySetter]"; ; str1 = arrayOfoi[i].d())
          {
            localjh.a(new jh.a(paramObject, str1));
            throw localjh;
          }
          i++;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pc
 * JD-Core Version:    0.6.2
 */