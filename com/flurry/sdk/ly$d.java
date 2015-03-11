package com.flurry.sdk;

@kb
final class ly$d extends ly.a<char[]>
{
  public ly$d()
  {
    super([C.class);
  }

  public final char[] b(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.h)
    {
      char[] arrayOfChar1 = paramhj.l();
      int i = paramhj.n();
      int j = paramhj.m();
      char[] arrayOfChar2 = new char[j];
      System.arraycopy(arrayOfChar1, i, arrayOfChar2, 0, j);
      return arrayOfChar2;
    }
    if (paramhj.j())
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      while (true)
      {
        hm localhm2 = paramhj.b();
        if (localhm2 == hm.e)
          break;
        if (localhm2 != hm.h)
          throw paramiz.b(Character.TYPE);
        String str = paramhj.k();
        if (str.length() != 1)
          throw jh.a(paramhj, "Can not convert a JSON String of length " + str.length() + " into a char element of char array");
        localStringBuilder.append(str.charAt(0));
      }
      return localStringBuilder.toString().toCharArray();
    }
    if (localhm1 == hm.g)
    {
      Object localObject = paramhj.z();
      if (localObject == null)
        return null;
      if ((localObject instanceof char[]))
        return (char[])localObject;
      if ((localObject instanceof String))
        return ((String)localObject).toCharArray();
      if ((localObject instanceof byte[]))
        return hb.a().a((byte[])localObject, false).toCharArray();
    }
    throw paramiz.b(this.q);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.d
 * JD-Core Version:    0.6.2
 */