package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

public class dn
{
  private static final String a = dn.class.getSimpleName();
  private static dn b;

  public static dn a()
  {
    try
    {
      if (b == null)
        b = new dn();
      dn localdn = b;
      return localdn;
    }
    finally
    {
    }
  }

  public int b()
  {
    int i = ((Integer)dp.a().a("AgentVersion")).intValue();
    eo.a(4, a, "getAgentVersion() = " + i);
    return i;
  }

  int c()
  {
    return ((Integer)dp.a().a("ReleaseMajorVersion")).intValue();
  }

  int d()
  {
    return ((Integer)dp.a().a("ReleaseMinorVersion")).intValue();
  }

  int e()
  {
    return ((Integer)dp.a().a("ReleasePatchVersion")).intValue();
  }

  String f()
  {
    return (String)dp.a().a("ReleaseBetaVersion");
  }

  public String g()
  {
    if (f().length() > 0);
    for (String str = "."; ; str = "")
    {
      Locale localLocale = Locale.getDefault();
      Object[] arrayOfObject = new Object[6];
      arrayOfObject[0] = Integer.valueOf(b());
      arrayOfObject[1] = Integer.valueOf(c());
      arrayOfObject[2] = Integer.valueOf(d());
      arrayOfObject[3] = Integer.valueOf(e());
      arrayOfObject[4] = str;
      arrayOfObject[5] = f();
      return String.format(localLocale, "Flurry_Android_%d_%d.%d.%d%s%s", arrayOfObject);
    }
  }

  public String h()
  {
    dj localdj = dl.a().c();
    String str = null;
    if (localdj != null)
      str = localdj.j();
    return str;
  }

  public String i()
  {
    dj localdj = dl.a().c();
    String str = null;
    if (localdj != null)
      str = localdj.k();
    return str;
  }

  public String j()
  {
    dj localdj = dl.a().c();
    String str = null;
    if (localdj != null)
      str = localdj.l();
    return str;
  }

  public boolean k()
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      return localdj.o();
    return true;
  }

  public Map<dr, ByteBuffer> l()
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      return localdj.p();
    return Collections.emptyMap();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dn
 * JD-Core Version:    0.6.2
 */