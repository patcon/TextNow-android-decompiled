package com.flurry.sdk;

abstract class lk<N extends hh> extends lz<N>
{
  public lk(Class<N> paramClass)
  {
    super(paramClass);
  }

  protected final rw a(hj paramhj, iz paramiz, rs paramrs)
  {
    rw localrw = paramrs.c();
    hm localhm = paramhj.e();
    if (localhm == hm.b)
      localhm = paramhj.b();
    if (localhm == hm.f)
    {
      String str = paramhj.g();
      Object localObject;
      switch (1.a[paramhj.b().ordinal()])
      {
      default:
        localObject = c(paramhj, paramiz, paramrs);
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        hh localhh = localrw.a(str, (hh)localObject);
        if (localhh != null)
          a(str, localrw, localhh, (hh)localObject);
        localhm = paramhj.b();
        break;
        localObject = a(paramhj, paramiz, paramrs);
        continue;
        localObject = b(paramhj, paramiz, paramrs);
        continue;
        localObject = paramrs.a(paramhj.k());
      }
    }
    return localrw;
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.d(paramhj, paramiz);
  }

  protected void a(String paramString, rw paramrw, hh paramhh1, hh paramhh2)
  {
  }

  protected final rj b(hj paramhj, iz paramiz, rs paramrs)
  {
    rj localrj = paramrs.b();
    while (true)
      switch (1.a[paramhj.b().ordinal()])
      {
      default:
        localrj.a(c(paramhj, paramiz, paramrs));
        break;
      case 1:
        localrj.a(a(paramhj, paramiz, paramrs));
        break;
      case 2:
        localrj.a(b(paramhj, paramiz, paramrs));
        break;
      case 3:
        localrj.a(paramrs.a(paramhj.k()));
      case 4:
      }
    return localrj;
  }

  protected final hh c(hj paramhj, iz paramiz, rs paramrs)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    case 4:
    default:
      throw paramiz.b(f());
    case 1:
      return a(paramhj, paramiz, paramrs);
    case 2:
      return b(paramhj, paramiz, paramrs);
    case 5:
      return a(paramhj, paramiz, paramrs);
    case 6:
      Object localObject = paramhj.z();
      if (localObject == null)
        return paramrs.a();
      if (localObject.getClass() == [B.class)
        return paramrs.a((byte[])localObject);
      return paramrs.a(localObject);
    case 3:
      return paramrs.a(paramhj.k());
    case 7:
      hj.b localb = paramhj.q();
      if ((localb == hj.b.c) || (paramiz.a(iy.a.h)))
        return paramrs.a(paramhj.v());
      if (localb == hj.b.a)
        return paramrs.a(paramhj.t());
      return paramrs.a(paramhj.u());
    case 8:
      if ((paramhj.q() == hj.b.f) || (paramiz.a(iy.a.g)))
        return paramrs.a(paramhj.y());
      return paramrs.a(paramhj.x());
    case 9:
      return paramrs.a(true);
    case 10:
      return paramrs.a(false);
    case 11:
    }
    return paramrs.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lk
 * JD-Core Version:    0.6.2
 */