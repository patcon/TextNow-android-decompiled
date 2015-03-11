package com.flurry.sdk;

@kb
final class ly$f extends ly.a<float[]>
{
  public ly$f()
  {
    super([F.class);
  }

  private final float[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    float[] arrayOfFloat = new float[1];
    arrayOfFloat[0] = y(paramhj, paramiz);
    return arrayOfFloat;
  }

  public final float[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.e locale = paramiz.h().f();
    Object localObject = (float[])locale.a();
    int i = 0;
    float f;
    int j;
    if (paramhj.b() != hm.e)
    {
      f = y(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      float[] arrayOfFloat = (float[])locale.a(localObject, i);
      j = 0;
      localObject = arrayOfFloat;
    }
    while (true)
    {
      i = j + 1;
      localObject[j] = f;
      break;
      return (float[])locale.b(localObject, i);
      label108: j = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.f
 * JD-Core Version:    0.6.2
 */