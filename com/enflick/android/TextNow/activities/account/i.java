package com.enflick.android.TextNow.activities.account;

import android.text.TextUtils;
import java.util.ArrayList;

public final class i
{
  public static final i a = new i("DISCOVER", 16, 3, new int[] { 4, 4, 4, 4 });
  public static final i b = new i("AMEX", 15, 4, new int[] { 4, 6, 5 });
  public static final i c = new i("MC", 16, 3, new int[] { 4, 4, 4, 4 });
  public static final i d = new i("VISA", 16, 3, new int[] { 4, 4, 4, 4 });
  public static final i e = new i("JCB", 16, 3, new int[] { 4, 4, 4, 4 });
  public static final i f = new i("DINERSCLUB", 14, 3, new int[] { 4, 4, 4, 2 });
  public static final i g = new i("UNKNOWN", 16, 3, new int[] { 4, 4, 4, 4 });
  public final int h;
  public final int[] i;
  public final int j;
  public final String k;

  private i(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    this.k = paramString;
    this.j = paramInt1;
    this.h = paramInt2;
    this.i = paramArrayOfInt;
  }

  public final String a(String paramString)
  {
    int m = 0;
    int n = paramString.length();
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while ((m < this.i.length) && (i1 + this.i[m] <= n))
    {
      localArrayList.add(paramString.substring(i1, i1 + this.i[m]));
      i1 += this.i[m];
      m++;
    }
    StringBuilder localStringBuilder = new StringBuilder(TextUtils.join(" ", localArrayList));
    if ((i1 < n) && (localArrayList.size() < this.i.length))
    {
      if (localArrayList.size() > 0)
        localStringBuilder.append(' ');
      localStringBuilder.append(paramString.substring(i1, n));
    }
    return localStringBuilder.toString();
  }

  public final String b(String paramString)
  {
    return paramString.substring(0, Math.min(this.j, paramString.length()));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.i
 * JD-Core Version:    0.6.2
 */