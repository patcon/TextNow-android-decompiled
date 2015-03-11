package com.flurry.sdk;

@kb
public class lm extends mc<Class<?>>
{
  public lm()
  {
    super(Class.class);
  }

  public Class<?> b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.h)
    {
      String str = paramhj.k();
      if (str.indexOf('.') < 0)
      {
        if ("int".equals(str))
          return Integer.TYPE;
        if ("long".equals(str))
          return Long.TYPE;
        if ("float".equals(str))
          return Float.TYPE;
        if ("double".equals(str))
          return Double.TYPE;
        if ("boolean".equals(str))
          return Boolean.TYPE;
        if ("byte".equals(str))
          return Byte.TYPE;
        if ("char".equals(str))
          return Character.TYPE;
        if ("short".equals(str))
          return Short.TYPE;
        if ("void".equals(str))
          return Void.TYPE;
      }
      try
      {
        Class localClass = Class.forName(paramhj.k());
        return localClass;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        throw paramiz.a(this.q, localClassNotFoundException);
      }
    }
    throw paramiz.a(this.q, localhm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lm
 * JD-Core Version:    0.6.2
 */