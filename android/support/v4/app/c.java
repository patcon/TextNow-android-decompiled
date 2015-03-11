package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;

final class c
{
  private static SharedElementCallback a(d paramd)
  {
    e locale = null;
    if (paramd != null)
      locale = new e(paramd);
    return locale;
  }

  public static void a(Activity paramActivity, d paramd)
  {
    paramActivity.setEnterSharedElementCallback(a(paramd));
  }

  public static void b(Activity paramActivity, d paramd)
  {
    paramActivity.setExitSharedElementCallback(a(paramd));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.c
 * JD-Core Version:    0.6.2
 */