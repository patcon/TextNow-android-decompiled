package com.flurry.sdk;

public class lz$n extends mc<StackTraceElement>
{
  public lz$n()
  {
    super(StackTraceElement.class);
  }

  public StackTraceElement b(hj paramhj, iz paramiz)
  {
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.b)
    {
      String str1 = "";
      String str2 = "";
      String str3 = "";
      int i = -1;
      while (true)
      {
        hm localhm2 = paramhj.c();
        if (localhm2 == hm.c)
          break;
        String str4 = paramhj.g();
        if ("className".equals(str4))
          str1 = paramhj.k();
        else if ("fileName".equals(str4))
          str3 = paramhj.k();
        else if ("lineNumber".equals(str4))
        {
          if (localhm2.c())
            i = paramhj.t();
          else
            throw jh.a(paramhj, "Non-numeric token (" + localhm2 + ") for property 'lineNumber'");
        }
        else if ("methodName".equals(str4))
          str2 = paramhj.k();
        else if (!"nativeMethod".equals(str4))
          a(paramhj, paramiz, this.q, str4);
      }
      return new StackTraceElement(str1, str2, str3, i);
    }
    throw paramiz.a(this.q, localhm1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.n
 * JD-Core Version:    0.6.2
 */