package com.flurry.sdk;

public class km extends jg<Object>
{
  protected final sh a;
  protected final boolean b;
  protected final boolean c;
  protected final boolean d;
  protected final boolean e;

  public km(sh paramsh)
  {
    this.a = paramsh;
    Class localClass = paramsh.p();
    this.b = localClass.isAssignableFrom(String.class);
    boolean bool1;
    if ((localClass == Boolean.TYPE) || (localClass.isAssignableFrom(Boolean.class)))
    {
      bool1 = true;
      this.c = bool1;
      if ((localClass != Integer.TYPE) && (!localClass.isAssignableFrom(Integer.class)))
        break label110;
    }
    label110: for (boolean bool2 = true; ; bool2 = false)
    {
      this.d = bool2;
      boolean bool3;
      if (localClass != Double.TYPE)
      {
        boolean bool4 = localClass.isAssignableFrom(Double.class);
        bool3 = false;
        if (!bool4);
      }
      else
      {
        bool3 = true;
      }
      this.e = bool3;
      return;
      bool1 = false;
      break;
    }
  }

  public Object a(hj paramhj, iz paramiz)
  {
    throw paramiz.a(this.a.p(), "abstract types can only be instantiated with additional type information");
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    Object localObject = b(paramhj, paramiz);
    if (localObject != null)
      return localObject;
    return paramjy.a(paramhj, paramiz);
  }

  protected Object b(hj paramhj, iz paramiz)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
              return null;
            while (!this.b);
            return paramhj.k();
          }
          while (!this.d);
          return Integer.valueOf(paramhj.t());
        }
        while (!this.e);
        return Double.valueOf(paramhj.x());
      }
      while (!this.c);
      return Boolean.TRUE;
    }
    while (!this.c);
    return Boolean.FALSE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.km
 * JD-Core Version:    0.6.2
 */