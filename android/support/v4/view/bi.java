package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class bi
{
  static final bn a = new bj();

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bm();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bl();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new bk();
      return;
    }
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }

  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return a.b(paramViewConfiguration);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bi
 * JD-Core Version:    0.6.2
 */