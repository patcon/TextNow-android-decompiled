package com.flurry.sdk;

import java.util.ArrayList;
import java.util.List;

public class qu
{
  final qs a;

  public qu(qs paramqs)
  {
    this.a = paramqs;
  }

  protected sh a(qu.a parama)
  {
    if (!parama.hasMoreTokens())
      throw a(parama, "Unexpected end-of-string");
    Class localClass = a(parama.nextToken(), parama);
    if (parama.hasMoreTokens())
    {
      String str = parama.nextToken();
      if ("<".equals(str))
        return this.a.a(localClass, b(parama));
      parama.a(str);
    }
    return this.a.a(localClass, null);
  }

  public sh a(String paramString)
  {
    qu.a locala = new qu.a(paramString.trim());
    sh localsh = a(locala);
    if (locala.hasMoreTokens())
      throw a(locala, "Unexpected tokens after complete type");
    return localsh;
  }

  protected Class<?> a(String paramString, qu.a parama)
  {
    try
    {
      Class localClass = Class.forName(paramString, true, Thread.currentThread().getContextClassLoader());
      return localClass;
    }
    catch (Exception localException)
    {
      if ((localException instanceof RuntimeException))
        throw ((RuntimeException)localException);
      throw a(parama, "Can not locate class '" + paramString + "', problem: " + localException.getMessage());
    }
  }

  protected IllegalArgumentException a(qu.a parama, String paramString)
  {
    return new IllegalArgumentException("Failed to parse type '" + parama.a() + "' (remaining: '" + parama.b() + "'): " + paramString);
  }

  protected List<sh> b(qu.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    while (parama.hasMoreTokens())
    {
      localArrayList.add(a(parama));
      if (parama.hasMoreTokens())
      {
        String str = parama.nextToken();
        if (">".equals(str))
          return localArrayList;
        if (!",".equals(str))
          throw a(parama, "Unexpected token '" + str + "', expected ',' or '>')");
      }
    }
    throw a(parama, "Unexpected end-of-string");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qu
 * JD-Core Version:    0.6.2
 */