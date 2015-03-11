package com.flurry.sdk;

final class sb$a
{
  private final String a;
  private final a b;

  public sb$a(String paramString, a parama)
  {
    this.a = paramString;
    this.b = parama;
  }

  public final String a()
  {
    return this.a;
  }

  public final String a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str = this.a;
    for (a locala = this.b; ; locala = locala.b())
    {
      if (str.length() == paramInt2)
      {
        int i = 0;
        do
        {
          if (str.charAt(i) != paramArrayOfChar[(paramInt1 + i)])
            break;
          i++;
        }
        while (i < paramInt2);
        if (i == paramInt2)
          return str;
      }
      if (locala == null)
        break;
      str = locala.a();
    }
    return null;
  }

  public final a b()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sb.a
 * JD-Core Version:    0.6.2
 */