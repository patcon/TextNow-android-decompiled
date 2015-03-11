package com.flurry.sdk;

@kb
public class mf extends mc<String>
{
  public mf()
  {
    super(String.class);
  }

  public String b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.h)
      return paramhj.k();
    if (localhm == hm.g)
    {
      Object localObject = paramhj.z();
      if (localObject == null)
        return null;
      if ((localObject instanceof byte[]))
        return hb.a().a((byte[])localObject, false);
      return localObject.toString();
    }
    if (localhm.d())
      return paramhj.k();
    throw paramiz.a(this.q, localhm);
  }

  public String b(hj paramhj, iz paramiz, jy paramjy)
  {
    return b(paramhj, paramiz);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mf
 * JD-Core Version:    0.6.2
 */