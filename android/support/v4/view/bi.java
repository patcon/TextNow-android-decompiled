package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bi
{
  static final bm a = new bo();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new bj();
      return;
    }
    if (i >= 18)
    {
      a = new bn();
      return;
    }
    if (i >= 14)
    {
      a = new bl();
      return;
    }
    if (i >= 11)
    {
      a = new bk();
      return;
    }
  }

  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bi
 * JD-Core Version:    0.6.2
 */