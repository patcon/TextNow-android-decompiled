package com.admarvel.android.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class AdMarvelVideoActivity$i
{
  private final ArrayList<AdMarvelVideoActivity.i.a> b = new ArrayList();

  public AdMarvelVideoActivity$i(AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
  }

  public List<AdMarvelVideoActivity.i.a> a()
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
      if (((AdMarvelVideoActivity.i.a)this.b.get(i)).a().equalsIgnoreCase(paramString1))
      {
        ((AdMarvelVideoActivity.i.a)this.b.get(i)).a(paramString2);
        return;
      }
    this.b.add(new AdMarvelVideoActivity.i.a(this, paramString1, paramString2));
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.i
 * JD-Core Version:    0.6.2
 */