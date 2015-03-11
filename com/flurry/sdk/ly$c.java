package com.flurry.sdk;

@kb
final class ly$c extends ly.a<byte[]>
{
  public ly$c()
  {
    super([B.class);
  }

  private final byte[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j));
    for (int i = paramhj.r(); ; i = 0)
    {
      return new byte[] { i };
      if (localhm != hm.m)
        throw paramiz.b(this.q.getComponentType());
    }
  }

  public final byte[] b(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.h)
      return paramhj.a(paramiz.c());
    if (localhm1 == hm.g)
    {
      Object localObject3 = paramhj.z();
      if (localObject3 == null)
        return null;
      if ((localObject3 instanceof byte[]))
        return (byte[])localObject3;
    }
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.c localc = paramiz.h().b();
    byte[] arrayOfByte = (byte[])localc.a();
    int i = 0;
    Object localObject1 = arrayOfByte;
    hm localhm2 = paramhj.b();
    int j;
    label131: Object localObject2;
    int k;
    if (localhm2 != hm.e)
      if ((localhm2 == hm.i) || (localhm2 == hm.j))
      {
        j = paramhj.r();
        if (i < localObject1.length)
          break label219;
        localObject2 = (byte[])localc.a(localObject1, i);
        k = 0;
      }
    while (true)
    {
      int m = k + 1;
      localObject2[k] = j;
      localObject1 = localObject2;
      i = m;
      break;
      if (localhm2 != hm.m)
        throw paramiz.b(this.q.getComponentType());
      j = 0;
      break label131;
      return (byte[])localc.b(localObject1, i);
      label219: k = i;
      localObject2 = localObject1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.c
 * JD-Core Version:    0.6.2
 */