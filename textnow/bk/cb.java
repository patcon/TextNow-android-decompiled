package textnow.bk;

import android.os.Looper;

final class cb
{
  private static boolean a = false;

  public static boolean a()
  {
    return Looper.getMainLooper().getThread() == Thread.currentThread();
  }

  public static void b()
  {
    if ((!a()) && (!a))
      throw new cc("This method needs to be called from the UI thread!");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.cb
 * JD-Core Version:    0.6.2
 */