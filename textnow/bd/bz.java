package textnow.bd;

import android.os.Looper;

final class bz
{
  private static boolean a = false;

  public static boolean a()
  {
    return Looper.getMainLooper().getThread() == Thread.currentThread();
  }

  public static void b()
  {
    if ((!a()) && (!a))
      throw new ca("This method needs to be called from the UI thread!");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bz
 * JD-Core Version:    0.6.2
 */