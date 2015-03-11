package com.admarvel.android.ads;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class AdMarvelVideoActivity$i$a
{
  public String a;
  public List<String> b;

  public AdMarvelVideoActivity$i$a(AdMarvelVideoActivity.i parami, String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = new ArrayList();
    this.b.add(URLDecoder.decode(paramString2));
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.b.add(URLDecoder.decode(paramString));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.i.a
 * JD-Core Version:    0.6.2
 */