package com.flurry.sdk;

@kb
final class ly$b extends ly.a<boolean[]>
{
  public ly$b()
  {
    super([Z.class);
  }

  private final boolean[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    boolean[] arrayOfBoolean = new boolean[1];
    arrayOfBoolean[0] = n(paramhj, paramiz);
    return arrayOfBoolean;
  }

  public final boolean[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.b localb = paramiz.h().a();
    Object localObject = (boolean[])localb.a();
    int i = 0;
    boolean bool;
    int j;
    if (paramhj.b() != hm.e)
    {
      bool = n(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      boolean[] arrayOfBoolean = (boolean[])localb.a(localObject, i);
      j = 0;
      localObject = arrayOfBoolean;
    }
    while (true)
    {
      i = j + 1;
      localObject[j] = bool;
      break;
      return (boolean[])localb.b(localObject, i);
      label108: j = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.b
 * JD-Core Version:    0.6.2
 */