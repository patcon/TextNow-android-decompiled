package com.flurry.sdk;

@kb
final class ly$g extends ly.a<int[]>
{
  public ly$g()
  {
    super([I.class);
  }

  private final int[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = t(paramhj, paramiz);
    return arrayOfInt;
  }

  public final int[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.f localf = paramiz.h().d();
    Object localObject = (int[])localf.a();
    int i = 0;
    int j;
    int k;
    if (paramhj.b() != hm.e)
    {
      j = t(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      int[] arrayOfInt = (int[])localf.a(localObject, i);
      k = 0;
      localObject = arrayOfInt;
    }
    while (true)
    {
      i = k + 1;
      localObject[k] = j;
      break;
      return (int[])localf.b(localObject, i);
      label108: k = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.g
 * JD-Core Version:    0.6.2
 */