package com.flurry.sdk;

@kc
public class lq extends mc<Enum<?>>
{
  protected final ra<?> a;

  public lq(ra<?> paramra)
  {
    super(Enum.class);
    this.a = paramra;
  }

  public static jg<?> a(iy paramiy, Class<?> paramClass, mr parammr)
  {
    if (parammr.b(0) != String.class)
      throw new IllegalArgumentException("Parameter #0 type for factory method (" + parammr + ") not suitable, must be java.lang.String");
    if (paramiy.a(iy.a.f))
      qy.a(parammr.i());
    return new lq.a(paramClass, parammr);
  }

  public Enum<?> b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    Enum localEnum;
    if ((localhm == hm.h) || (localhm == hm.f))
    {
      String str = paramhj.k();
      localEnum = this.a.a(str);
      if (localEnum == null)
        throw paramiz.b(this.a.a(), "value not one of declared Enum instance names");
    }
    else if (localhm == hm.i)
    {
      if (paramiz.a(iy.a.m))
        throw paramiz.b("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
      int i = paramhj.t();
      localEnum = this.a.a(i);
      if (localEnum == null)
        throw paramiz.c(this.a.a(), "index value outside legal index range [0.." + this.a.b() + "]");
    }
    else
    {
      throw paramiz.b(this.a.a());
    }
    return localEnum;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lq
 * JD-Core Version:    0.6.2
 */