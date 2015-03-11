package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;

public final class a extends android.support.v4.content.c
{
  private static d a(ck paramck)
  {
    b localb = null;
    if (paramck != null)
      localb = new b(paramck);
    return localb;
  }

  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramActivity.finishAffinity();
      return;
    }
    paramActivity.finish();
  }

  public static void a(Activity paramActivity, ck paramck)
  {
    if (Build.VERSION.SDK_INT >= 21)
      c.a(paramActivity, a(paramck));
  }

  public static void b(Activity paramActivity, ck paramck)
  {
    if (Build.VERSION.SDK_INT >= 21)
      c.b(paramActivity, a(paramck));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.6.2
 */