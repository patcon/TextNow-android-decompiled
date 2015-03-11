package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;

final class n
{
  private static SharedElementCallback a(o paramo)
  {
    p localp = null;
    if (paramo != null)
      localp = new p(paramo);
    return localp;
  }

  public static void a(Activity paramActivity, o paramo)
  {
    paramActivity.setEnterSharedElementCallback(a(paramo));
  }

  public static void b(Activity paramActivity, o paramo)
  {
    paramActivity.setExitSharedElementCallback(a(paramo));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.n
 * JD-Core Version:    0.6.2
 */