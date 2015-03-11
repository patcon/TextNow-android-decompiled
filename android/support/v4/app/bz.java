package android.support.v4.app;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class bz extends ch
{
  public static final ci a;
  private static final cb g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;

  static
  {
    if (Build.VERSION.SDK_INT >= 20)
      g = new cc();
    while (true)
    {
      a = new ci()
      {
      };
      return;
      if (Build.VERSION.SDK_INT >= 16)
        g = new ce();
      else
        g = new cd();
    }
  }

  bz(String paramString, CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence, boolean paramBoolean, Bundle paramBundle)
  {
    this.b = paramString;
    this.c = paramCharSequence;
    this.d = paramArrayOfCharSequence;
    this.e = paramBoolean;
    this.f = paramBundle;
  }

  public static Bundle a(Intent paramIntent)
  {
    return g.a(paramIntent);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bz
 * JD-Core Version:    0.6.2
 */