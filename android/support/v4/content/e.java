package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class e
{
  private static final f a = new g();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new i();
      return;
    }
    if (i >= 11)
    {
      a = new h();
      return;
    }
  }

  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.content.e
 * JD-Core Version:    0.6.2
 */