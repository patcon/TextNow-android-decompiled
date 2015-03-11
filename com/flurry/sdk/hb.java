package com.flurry.sdk;

public final class hb
{
  public static final ha a = new ha("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
  public static final ha b = new ha(a, "MIME-NO-LINEFEEDS", 2147483647);
  public static final ha c = new ha(a, "PEM", true, '=', 64);
  public static final ha d = new ha("MODIFIED-FOR-URL", localStringBuffer.toString(), false, '\000', 2147483647);

  static
  {
    StringBuffer localStringBuffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    localStringBuffer.setCharAt(localStringBuffer.indexOf("+"), '-');
    localStringBuffer.setCharAt(localStringBuffer.indexOf("/"), '_');
  }

  public static ha a()
  {
    return b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hb
 * JD-Core Version:    0.6.2
 */