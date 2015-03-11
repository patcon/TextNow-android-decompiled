package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class bs extends bz
{
  public static final ca a;
  private static final bt g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;

  static
  {
    if (Build.VERSION.SDK_INT >= 20)
      g = new bu();
    while (true)
    {
      a = new ca()
      {
      };
      return;
      if (Build.VERSION.SDK_INT >= 16)
        g = new bw();
      else
        g = new bv();
    }
  }

  public final String a()
  {
    return this.b;
  }

  public final CharSequence b()
  {
    return this.c;
  }

  public final CharSequence[] c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return this.e;
  }

  public final Bundle e()
  {
    return this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bs
 * JD-Core Version:    0.6.2
 */