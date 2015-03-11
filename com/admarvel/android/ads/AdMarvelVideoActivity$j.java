package com.admarvel.android.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class AdMarvelVideoActivity$j
{
  private final ArrayList<AdMarvelVideoActivity.j.a> b = new ArrayList();

  public AdMarvelVideoActivity$j(AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
  }

  public List<AdMarvelVideoActivity.j.a> a()
  {
    return this.b;
  }

  public void a(String paramString)
  {
    int i = paramString.indexOf('?');
    if (i >= 0);
    for (String str = paramString.substring(i + 1); ; str = "")
    {
      b(str);
      return;
    }
  }

  protected void a(String paramString1, String paramString2)
  {
    for (int i = 0; i < this.b.size(); i++)
      if (((AdMarvelVideoActivity.j.a)this.b.get(i)).a().equalsIgnoreCase(paramString1))
      {
        ((AdMarvelVideoActivity.j.a)this.b.get(i)).a(paramString2);
        return;
      }
    this.b.add(new AdMarvelVideoActivity.j.a(this, paramString1, paramString2));
  }

  public void b(String paramString)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, "&");
    while (localStringTokenizer.hasMoreElements())
    {
      String str = localStringTokenizer.nextToken();
      if (str.length() > 0)
      {
        int i = str.indexOf('=');
        if (i < 0)
          a(str, "");
        else
          a(str.substring(0, i), str.substring(i + 1));
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.j
 * JD-Core Version:    0.6.2
 */