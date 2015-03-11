package com.admarvel.android.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class AdMarvelXMLElement
{
  private LinkedHashMap<String, String> attributes = null;
  private LinkedHashMap<String, ArrayList<AdMarvelXMLElement>> children = new LinkedHashMap();
  private StringBuilder data = new StringBuilder();
  private String name = null;

  AdMarvelXMLElement(String paramString)
  {
    this.name = paramString;
  }

  AdMarvelXMLElement(String paramString, LinkedHashMap<String, String> paramLinkedHashMap)
  {
    this.name = paramString;
    this.attributes = paramLinkedHashMap;
  }

  public void appendData(String paramString)
  {
    this.data.append(paramString);
  }

  public LinkedHashMap<String, String> getAttributes()
  {
    return this.attributes;
  }

  public LinkedHashMap<String, ArrayList<AdMarvelXMLElement>> getChildren()
  {
    return this.children;
  }

  public String getData()
  {
    if (this.data == null)
      return null;
    return this.data.toString();
  }

  public String getName()
  {
    return this.name;
  }

  public void setChildren(LinkedHashMap<String, ArrayList<AdMarvelXMLElement>> paramLinkedHashMap)
  {
    this.children = paramLinkedHashMap;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<");
    localStringBuilder.append(this.name);
    if (this.attributes != null)
    {
      Iterator localIterator3 = this.attributes.keySet().iterator();
      while (localIterator3.hasNext())
      {
        String str = (String)localIterator3.next();
        localStringBuilder.append(" ");
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append("\"");
        localStringBuilder.append(AdMarvelXMLReader.xmlEncode((String)this.attributes.get(str)));
        localStringBuilder.append("\"");
      }
    }
    localStringBuilder.append(">");
    Iterator localIterator1 = this.children.values().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((ArrayList)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
        localStringBuilder.append(((AdMarvelXMLElement)localIterator2.next()).toString());
    }
    localStringBuilder.append(AdMarvelXMLReader.xmlEncode(this.data.toString()));
    localStringBuilder.append("</");
    localStringBuilder.append(this.name);
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelXMLElement
 * JD-Core Version:    0.6.2
 */