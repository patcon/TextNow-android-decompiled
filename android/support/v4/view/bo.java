package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bo
{
  static final bs a = new bu();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new bp();
      return;
    }
    if (i >= 18)
    {
      a = new bt();
      return;
    }
    if (i >= 14)
    {
      a = new br();
      return;
    }
    if (i >= 11)
    {
      a = new bq();
      return;
    }
  }

  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bo
 * JD-Core Version:    0.6.2
 */