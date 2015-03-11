package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class q
{
  static final u a = new r();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new t();
      return;
    }
  }

  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.b(paramKeyEvent.getMetaState());
  }

  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return a.a(paramKeyEvent.getMetaState(), 1);
  }

  public static void b(KeyEvent paramKeyEvent)
  {
    a.a(paramKeyEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.q
 * JD-Core Version:    0.6.2
 */