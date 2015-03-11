package com.flurry.sdk;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class fm$a
{
  private String b;
  private String c;
  private fn d;
  private final fn.r e = new fn.r(fm.a());

  private fm$a(String paramString1, String paramString2, Map<String, String> paramMap, fn paramfn)
  {
    this.b = paramString2;
    this.c = paramMap;
    Object localObject;
    this.d = localObject;
    if (paramfn != null)
    {
      Iterator localIterator = paramfn.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        a((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }

  void a(hf paramhf)
  {
    paramhf.d();
    if (this.c != null)
      paramhf.a("doc", this.c);
    this.e.a(paramhf);
    paramhf.a("request");
    this.d.b(fm.a(this.a), paramhf);
    b(paramhf);
    paramhf.e();
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.e.a(paramString1, paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  void b(hf paramhf)
  {
    paramhf.a("response", "null");
    paramhf.a("one-way", true);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    a locala;
    do
    {
      return true;
      if (!(paramObject instanceof a))
        return false;
      locala = (a)paramObject;
    }
    while ((this.b.equals(locala.b)) && (this.d.equals(locala.d)) && (this.e.equals(locala.e)));
    return false;
  }

  public int hashCode()
  {
    return this.b.hashCode() + this.d.hashCode() + this.e.hashCode();
  }

  public String toString()
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      hf localhf = fn.a.a(localStringWriter);
      a(localhf);
      localhf.g();
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new fk(localIOException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fm.a
 * JD-Core Version:    0.6.2
 */