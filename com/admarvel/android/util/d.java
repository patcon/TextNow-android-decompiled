package com.admarvel.android.util;

import java.util.HashMap;
import java.util.Map;

public class d
{
  private String a = "fwug66MEqP6JSxtsHXJxH8xKm7u1xfctDoP626eTR0v3guDbSJUETigA3GFBW0EW~DtP6k4y~YFd~Fk91d0VjjUqyQXxJjNZUQ-1LP_bBiklBJ3tXcTIwrfSWkZkdjl5qrHOJv79OC32YUZitEvxQ2ZX7XQt41J0n7HelUErtKXwbbKAkf8pc62WgU-YS6fTqLWSGjoNyDaKFK49X2N7mJ2DVha3rf~I~0KaCR1NR1icrg~C9tXjj6UvrjnScGK9X99ErjuESJHoqJrpjAKe-hkMamvSufxSMKXIycTmY0qjhIKa-9MkwOKRrf205PFD2P4skcIzF07-Ev-nWYmOGrNj8SCwz0wp8bo1fjMmC5WHces7q4gbt2aXACOPYfYn4zjdpBBXU0wwtVI8yYgcQgEVeZ7qjppfJGrPDfcU5U9JZDxVaE2D1KRAS6ZVqmaRPrEr9H6VlaQQDBRDYgDl0whbyRSDsSR~oINlZpbQpF3pTvpMP7c8I1giYMibtdMHxV9EHtG2V-d8JwEz4HmooDs8MPgz3kaBW9aRidvd9NSTDXOlwrUXi2YlXtj__jctLcxDHpdYBXeuwYwxP9fJkNODDb_6aGhL6ULZKVv3KLi1oGRFcDNPNWrfBVpBl8bzp96vPFn28yJ1kQIP3p00Q8yPrn1gII6qD9orv4XHipzY72uGG9WOIxjtGSu~GAWKBajdI4qvMdty-do8JaAdxv1YUvxyTNkINET7xilWjYxb7-gr-x2Qp0DKjxkutJRDiz71sx83eOYyktTtpBvCnvIopUh4VJ4d~TPTHhBNpx6SpSjC99Q_XlQ2JF1QNpKvy2pusFZkqYu-0XmMFNfrEJXWNzXOJM0l~uwTxP-WBUeZ4CL_bBVknKDjVXhD1llttskL~vD48Ta3nLItby6tL69XgtHQs9vRZIHdF_~Z0~8MhQoOb3084MsYziD9bgPRsAlhKRVHkPNnieCB~s-AjGC7UA0DT8wMusQ2CR4iE7y2h1rU4qgfbePD98Qd4vhw";
  private Map<String, String[]> b;
  private int c = 1295;
  private String[] d = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "-", "_", "~" };

  public String a(String paramString)
  {
    this.b = new HashMap();
    for (int i = 0; i < this.d.length; i++)
    {
      Map localMap = this.b;
      String str6 = this.d[i];
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = "";
      arrayOfString2[1] = String.valueOf(i);
      localMap.put(str6, arrayOfString2);
    }
    this.b.put("/", new String[] { ".", "0" });
    this.b.put("?", new String[] { ".", "1" });
    this.b.put(":", new String[] { ".", "2" });
    this.b.put("@", new String[] { ".", "3" });
    this.b.put("=", new String[] { ".", "4" });
    this.b.put("&", new String[] { ".", "5" });
    this.b.put(" ", new String[] { ".", "6" });
    this.b.put("<", new String[] { ".", "7" });
    this.b.put(">", new String[] { ".", "8" });
    this.b.put("\"", new String[] { ".", "9" });
    this.b.put("#", new String[] { ".", "10" });
    this.b.put("%", new String[] { ".", "11" });
    this.b.put("{", new String[] { ".", "12" });
    this.b.put("}", new String[] { ".", "13" });
    this.b.put("|", new String[] { ".", "14" });
    this.b.put("^", new String[] { ".", "15" });
    this.b.put("[", new String[] { ".", "16" });
    this.b.put("]", new String[] { ".", "17" });
    this.b.put("`", new String[] { ".", "18" });
    this.b.put(".", new String[] { ".", "19" });
    this.b.put("\\", new String[] { ".", "20" });
    this.b.put("+", new String[] { ".", "21" });
    int j = (int)(Math.random() * Math.min(this.a.length(), this.c));
    String str1;
    StringBuilder localStringBuilder;
    String str2;
    label775: int k;
    label778: String[] arrayOfString1;
    if ((j > 0) && (j < this.a.length()))
    {
      str1 = this.a.substring(j) + this.a.substring(0, j);
      localStringBuilder = new StringBuilder();
      str2 = Integer.toString(j, 36);
      if (str2.length() != 1)
        break label843;
      localStringBuilder.append("0" + str2);
      k = 0;
      if (k >= paramString.length())
        break label944;
      String str3 = paramString.substring(k, k + 1);
      arrayOfString1 = (String[])this.b.get(str3);
      if (arrayOfString1 != null)
        break label854;
      localStringBuilder.append(str3);
    }
    while (true)
    {
      k++;
      break label778;
      str1 = this.a;
      break;
      label843: localStringBuilder.append(str2);
      break label775;
      label854: String str4 = str1.substring(k % str1.length(), 1 + k % str1.length());
      String str5 = ((String[])this.b.get(str4))[1];
      localStringBuilder.append(arrayOfString1[0]);
      int m = (Integer.parseInt(str5) + Integer.parseInt(arrayOfString1[1])) % this.d.length;
      localStringBuilder.append(this.d[m]);
    }
    label944: return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.d
 * JD-Core Version:    0.6.2
 */