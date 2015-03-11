package com.admarvel.android.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class AdMarvelXMLElement
{
  private String a = null;
  private LinkedHashMap<String, String> b = null;
  private StringBuilder c = new StringBuilder();
  private LinkedHashMap<String, ArrayList<AdMarvelXMLElement>> d = new LinkedHashMap();

  AdMarvelXMLElement(String paramString, LinkedHashMap<String, String> paramLinkedHashMap)
  {
    this.a = paramString;
    this.b = paramLinkedHashMap;
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.c.append(paramString);
  }

  public String b()
  {
    if (this.c == null)
      return null;
    return this.c.toString();
  }

  public LinkedHashMap<String, ArrayList<AdMarvelXMLElement>> c()
  {
    return this.d;
  }

  public LinkedHashMap<String, String> getAttributes()
  {
    return this.b;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<");
    localStringBuilder.append(this.a);
    if (this.b != null)
    {
      Iterator localIterator3 = this.b.keySet().iterator();
      while (localIterator3.hasNext())
      {
        String str = (String)localIterator3.next();
        localStringBuilder.append(" ");
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append("\"");
        localStringBuilder.append(AdMarvelXMLReader.xmlEncode((String)this.b.get(str)));
        localStringBuilder.append("\"");
      }
    }
    localStringBuilder.append(">");
    Iterator localIterator1 = this.d.values().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((ArrayList)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
        localStringBuilder.append(((AdMarvelXMLElement)localIterator2.next()).toString());
    }
    localStringBuilder.append(AdMarvelXMLReader.xmlEncode(this.c.toString()));
    localStringBuilder.append("</");
    localStringBuilder.append(this.a);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelXMLElement
 * JD-Core Version:    0.6.2
 */