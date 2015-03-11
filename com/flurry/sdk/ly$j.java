package com.flurry.sdk;

@kb
final class ly$j extends ly.a<String[]>
{
  public ly$j()
  {
    super([Ljava.lang.String.class);
  }

  private final String[] c(hj paramhj, iz paramiz)
  {
    if (!paramiz.a(iy.a.o))
    {
      if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
        return null;
      throw paramiz.b(this.q);
    }
    String[] arrayOfString = new String[1];
    hm localhm1 = paramhj.e();
    hm localhm2 = hm.m;
    String str = null;
    if (localhm1 == localhm2);
    while (true)
    {
      arrayOfString[0] = str;
      return arrayOfString;
      str = paramhj.k();
    }
  }

  public final String[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    re localre = paramiz.g();
    Object[] arrayOfObject = localre.a();
    int i = 0;
    hm localhm = paramhj.b();
    String str;
    if (localhm != hm.e)
      if (localhm == hm.m)
      {
        str = null;
        label53: if (i < arrayOfObject.length)
          break label120;
        arrayOfObject = localre.a(arrayOfObject);
      }
    label120: for (int j = 0; ; j = i)
    {
      i = j + 1;
      arrayOfObject[j] = str;
      break;
      str = paramhj.k();
      break label53;
      String[] arrayOfString = (String[])localre.a(arrayOfObject, i, String.class);
      paramiz.a(localre);
      return arrayOfString;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.j
 * JD-Core Version:    0.6.2
 */