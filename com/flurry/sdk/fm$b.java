package com.flurry.sdk;

import java.util.List;
import java.util.Map;

class fm$b extends fm.a
{
  private fn c;
  private fn d;

  private fm$b(String paramString1, String paramString2, Map<String, String> paramMap, fn paramfn1, fn paramfn2, fn paramfn3)
  {
    super(paramString1, paramString2, paramMap, paramfn1, paramfn2, null);
    this.c = paramfn3;
    Object localObject;
    this.d = localObject;
  }

  void b(hf paramhf)
  {
    paramhf.a("response");
    this.c.a(fm.a(this.b), paramhf);
    List localList = this.d.k();
    if (localList.size() > 1)
    {
      fn localfn = fn.b(localList.subList(1, localList.size()));
      paramhf.a("errors");
      localfn.a(fm.a(this.b), paramhf);
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!super.equals(paramObject));
    b localb;
    do
    {
      do
        return false;
      while (!(paramObject instanceof b));
      localb = (b)paramObject;
    }
    while ((!this.c.equals(localb.c)) || (!this.d.equals(localb.d)));
    return true;
  }

  public int hashCode()
  {
    return super.hashCode() + this.c.hashCode() + this.d.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fm.b
 * JD-Core Version:    0.6.2
 */