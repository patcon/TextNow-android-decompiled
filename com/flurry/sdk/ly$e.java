package com.flurry.sdk;

@kb
final class ly$e extends ly.a<double[]>
{
  public ly$e()
  {
    super([D.class);
  }

  private final double[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    double[] arrayOfDouble = new double[1];
    arrayOfDouble[0] = A(paramhj, paramiz);
    return arrayOfDouble;
  }

  public final double[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.d locald = paramiz.h().g();
    Object localObject = (double[])locald.a();
    int i = 0;
    double d;
    int j;
    if (paramhj.b() != hm.e)
    {
      d = A(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      double[] arrayOfDouble = (double[])locald.a(localObject, i);
      j = 0;
      localObject = arrayOfDouble;
    }
    while (true)
    {
      i = j + 1;
      localObject[j] = d;
      break;
      return (double[])locald.b(localObject, i);
      label108: j = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.e
 * JD-Core Version:    0.6.2
 */