package com.flurry.sdk;

public abstract class hv extends hj
{
  protected hv()
  {
  }

  protected hv(int paramInt)
  {
    super(paramInt);
  }

  protected static final String c(int paramInt)
  {
    char c = (char)paramInt;
    if (Character.isISOControl(c))
      return "(CTRL-CHAR, code " + paramInt + ")";
    if (paramInt > 255)
      return "'" + c + "' (code " + paramInt + " / 0x" + Integer.toHexString(paramInt) + ")";
    return "'" + c + "' (code " + paramInt + ")";
  }

  protected abstract void H();

  protected void R()
  {
    throw a("Unexpected end-of-String in base64 content");
  }

  protected void S()
  {
    c(" in " + this.b);
  }

  protected void T()
  {
    c(" in a value");
  }

  protected final void U()
  {
    throw new RuntimeException("Internal error: this code path should never get executed");
  }

  protected char a(char paramChar)
  {
    if (a(hj.a.f));
    while ((paramChar == '\'') && (a(hj.a.d)))
      return paramChar;
    d("Unrecognized character escape " + c(paramChar));
    return paramChar;
  }

  protected void a(ha paramha, char paramChar, int paramInt, String paramString)
  {
    String str;
    if (paramChar <= ' ')
      str = "Illegal white space character (code 0x" + Integer.toHexString(paramChar) + ") as character #" + (paramInt + 1) + " of 4-char base64 unit: can only used between units";
    while (true)
    {
      if (paramString != null)
        str = str + ": " + paramString;
      throw a(str);
      if (paramha.a(paramChar))
        str = "Unexpected padding character ('" + paramha.b() + "') as character #" + (paramInt + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
      else if ((!Character.isDefined(paramChar)) || (Character.isISOControl(paramChar)))
        str = "Illegal character (code 0x" + Integer.toHexString(paramChar) + ") in base64 content";
      else
        str = "Illegal character '" + paramChar + "' (code 0x" + Integer.toHexString(paramChar) + ") in base64 content";
    }
  }

  protected void a(String paramString, sj paramsj, ha paramha)
  {
    int i = paramString.length();
    int j = 0;
    if (j < i);
    while (true)
    {
      int k = j + 1;
      char c1 = paramString.charAt(j);
      int n;
      int i2;
      if (k < i)
      {
        if (c1 <= ' ')
          break label379;
        int m = paramha.b(c1);
        if (m < 0)
          a(paramha, c1, 0, null);
        if (k >= i)
          R();
        n = k + 1;
        char c2 = paramString.charAt(k);
        int i1 = paramha.b(c2);
        if (i1 < 0)
          a(paramha, c2, 1, null);
        i2 = i1 | m << 6;
        if (n < i)
          break label150;
        if (!paramha.a())
          paramsj.a(i2 >> 4);
      }
      else
      {
        return;
      }
      R();
      label150: int i3 = n + 1;
      char c3 = paramString.charAt(n);
      int i4 = paramha.b(c3);
      if (i4 < 0)
      {
        if (i4 != -2)
          a(paramha, c3, 2, null);
        if (i3 >= i)
          R();
        j = i3 + 1;
        char c5 = paramString.charAt(i3);
        if (!paramha.a(c5))
          a(paramha, c5, 3, "expected padding character '" + paramha.b() + "'");
        paramsj.a(i2 >> 4);
        break;
      }
      int i5 = i4 | i2 << 6;
      if (i3 >= i)
      {
        if (!paramha.a())
        {
          paramsj.b(i5 >> 2);
          return;
        }
        R();
      }
      j = i3 + 1;
      char c4 = paramString.charAt(i3);
      int i6 = paramha.b(c4);
      if (i6 < 0)
      {
        if (i6 != -2)
          a(paramha, c4, 3, null);
        paramsj.b(i5 >> 2);
        break;
      }
      paramsj.c(i6 | i5 << 6);
      break;
      label379: j = k;
    }
  }

  protected final void a(String paramString, Throwable paramThrowable)
  {
    throw b(paramString, paramThrowable);
  }

  protected final hi b(String paramString, Throwable paramThrowable)
  {
    return new hi(paramString, i(), paramThrowable);
  }

  public abstract hm b();

  protected void b(int paramInt)
  {
    int i = (char)paramInt;
    d("Illegal character (" + c(i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
  }

  protected void b(int paramInt, String paramString)
  {
    String str = "Unexpected character (" + c(paramInt) + ")";
    if (paramString != null)
      str = str + ": " + paramString;
    d(str);
  }

  protected void c(int paramInt, String paramString)
  {
    if ((!a(hj.a.e)) || (paramInt >= 32))
    {
      int i = (char)paramInt;
      d("Illegal unquoted character (" + c(i) + "): has to be escaped using backslash to be included in " + paramString);
    }
  }

  protected void c(String paramString)
  {
    d("Unexpected end-of-input" + paramString);
  }

  public hj d()
  {
    if ((this.b != hm.b) && (this.b != hm.d))
      return this;
    int i = 1;
    do
    {
      while (true)
      {
        hm localhm = b();
        if (localhm == null)
        {
          H();
          return this;
        }
        switch (1.a[localhm.ordinal()])
        {
        default:
          break;
        case 1:
        case 2:
          i++;
        case 3:
        case 4:
        }
      }
      i--;
    }
    while (i != 0);
    return this;
  }

  protected final void d(String paramString)
  {
    throw a(paramString);
  }

  public abstract String k();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hv
 * JD-Core Version:    0.6.2
 */