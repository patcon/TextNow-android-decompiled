package com.flurry.sdk;

public class mk extends jh
{
  protected final Class<?> c;
  protected final String d;

  public mk(String paramString1, hg paramhg, Class<?> paramClass, String paramString2)
  {
    super(paramString1, paramhg);
    this.c = paramClass;
    this.d = paramString2;
  }

  public static mk a(hj paramhj, Object paramObject, String paramString)
  {
    if (paramObject == null)
      throw new IllegalArgumentException();
    if ((paramObject instanceof Class));
    for (Class localClass = (Class)paramObject; ; localClass = paramObject.getClass())
    {
      mk localmk = new mk("Unrecognized field \"" + paramString + "\" (Class " + localClass.getName() + "), not marked as ignorable", paramhj.i(), localClass, paramString);
      localmk.a(paramObject, paramString);
      return localmk;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mk
 * JD-Core Version:    0.6.2
 */