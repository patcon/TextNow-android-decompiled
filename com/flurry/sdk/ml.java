package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public class ml
{
  public static final ml a = new ml();

  private Object a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (LinkageError localLinkageError)
    {
      label13: break label13;
    }
  }

  private boolean a(Class<?> paramClass, String paramString)
  {
    while (paramClass != null)
    {
      if (paramClass.getName().equals(paramString));
      while (b(paramClass, paramString))
        return true;
      paramClass = paramClass.getSuperclass();
    }
    return false;
  }

  private boolean b(Class<?> paramClass, String paramString)
  {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    for (int j = 0; j < i; j++)
      if (arrayOfClass[j].getName().equals(paramString))
        return true;
    int k = arrayOfClass.length;
    for (int m = 0; ; m++)
    {
      if (m >= k)
        break label73;
      if (b(arrayOfClass[m], paramString))
        break;
    }
    label73: return false;
  }

  private boolean c(Class<?> paramClass, String paramString)
  {
    for (Class localClass = paramClass.getSuperclass(); localClass != null; localClass = localClass.getSuperclass())
      if (localClass.getName().startsWith(paramString))
        return true;
    do
    {
      paramClass = paramClass.getSuperclass();
      if (paramClass == null)
        break;
    }
    while (!d(paramClass, paramString));
    return true;
    return false;
  }

  private boolean d(Class<?> paramClass, String paramString)
  {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    for (int j = 0; j < i; j++)
      if (arrayOfClass[j].getName().startsWith(paramString))
        return true;
    int k = arrayOfClass.length;
    for (int m = 0; ; m++)
    {
      if (m >= k)
        break label73;
      if (d(arrayOfClass[m], paramString))
        break;
    }
    label73: return false;
  }

  public jg<?> a(sh paramsh, iy paramiy, jc paramjc)
  {
    Class localClass = paramsh.p();
    String str1 = localClass.getName();
    if (str1.startsWith("org.joda.time."));
    Object localObject;
    for (String str2 = "com.flurry.org.codehaus.jackson.map.ext.JodaDeserializers"; ; str2 = "com.flurry.org.codehaus.jackson.map.ext.CoreXMLDeserializers")
    {
      localObject = a(str2);
      if (localObject != null)
        break label114;
      return null;
      if ((!str1.startsWith("javax.xml.")) && (!c(localClass, "javax.xml.")))
        break;
    }
    if (a(localClass, "org.w3c.dom.Node"))
      return (jg)a("com.flurry.org.codehaus.jackson.map.ext.DOMDeserializer$DocumentDeserializer");
    if (a(localClass, "org.w3c.dom.Node"))
      return (jg)a("com.flurry.org.codehaus.jackson.map.ext.DOMDeserializer$NodeDeserializer");
    return null;
    label114: Collection localCollection = ((rg)localObject).a();
    Iterator localIterator1 = localCollection.iterator();
    while (localIterator1.hasNext())
    {
      lz locallz2 = (lz)localIterator1.next();
      if (localClass == locallz2.f())
        return locallz2;
    }
    Iterator localIterator2 = localCollection.iterator();
    while (localIterator2.hasNext())
    {
      lz locallz1 = (lz)localIterator2.next();
      if (locallz1.f().isAssignableFrom(localClass))
        return locallz1;
    }
    return null;
  }

  public jk<?> a(ju paramju, sh paramsh)
  {
    Class localClass = paramsh.p();
    String str1 = localClass.getName();
    if (str1.startsWith("org.joda.time."));
    Object localObject;
    for (String str2 = "com.flurry.org.codehaus.jackson.map.ext.JodaSerializers"; ; str2 = "com.flurry.org.codehaus.jackson.map.ext.CoreXMLSerializers")
    {
      localObject = a(str2);
      if (localObject != null)
        break label89;
      return null;
      if ((!str1.startsWith("javax.xml.")) && (!c(localClass, "javax.xml.")))
        break;
    }
    if (a(localClass, "org.w3c.dom.Node"))
      return (jk)a("com.flurry.org.codehaus.jackson.map.ext.DOMSerializer");
    return null;
    label89: Collection localCollection = ((rg)localObject).a();
    Iterator localIterator1 = localCollection.iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      if (localClass == localEntry2.getKey())
        return (jk)localEntry2.getValue();
    }
    Iterator localIterator2 = localCollection.iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      if (((Class)localEntry1.getKey()).isAssignableFrom(localClass))
        return (jk)localEntry1.getValue();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ml
 * JD-Core Version:    0.6.2
 */