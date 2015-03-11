package com.flurry.sdk;

import java.net.InetAddress;

public class pl extends pt<InetAddress>
{
  public static final pl a = new pl();

  public pl()
  {
    super(InetAddress.class);
  }

  public void a(InetAddress paramInetAddress, hf paramhf, jw paramjw)
  {
    String str = paramInetAddress.toString().trim();
    int i = str.indexOf('/');
    if (i >= 0)
      if (i != 0)
        break label43;
    label43: for (str = str.substring(1); ; str = str.substring(0, i))
    {
      paramhf.b(str);
      return;
    }
  }

  public void a(InetAddress paramInetAddress, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.a(paramInetAddress, paramhf, InetAddress.class);
    a(paramInetAddress, paramhf, paramjw);
    paramjz.d(paramInetAddress, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pl
 * JD-Core Version:    0.6.2
 */