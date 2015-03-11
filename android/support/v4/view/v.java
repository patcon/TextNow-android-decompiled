package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class v
{
  static final w a = new x();

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new y();
      return;
    }
  }

  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }

  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.v
 * JD-Core Version:    0.6.2
 */