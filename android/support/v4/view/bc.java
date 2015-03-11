package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class bc
{
  static final bh a = new bd();

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bg();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bf();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new be();
      return;
    }
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bc
 * JD-Core Version:    0.6.2
 */