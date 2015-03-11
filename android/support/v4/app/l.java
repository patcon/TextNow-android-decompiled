package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.content.c;

public final class l extends c
{
  private static o a(cc paramcc)
  {
    m localm = null;
    if (paramcc != null)
      localm = new m(paramcc);
    return localm;
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

  public static void a(Activity paramActivity, cc paramcc)
  {
    if (Build.VERSION.SDK_INT >= 21)
      n.a(paramActivity, a(paramcc));
  }

  public static void b(Activity paramActivity, cc paramcc)
  {
    if (Build.VERSION.SDK_INT >= 21)
      n.b(paramActivity, a(paramcc));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.l
 * JD-Core Version:    0.6.2
 */