package android.support.v4.view;

import android.os.Build.VERSION;

public final class m
{
  static final n a = new o();

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new p();
      return;
    }
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.m
 * JD-Core Version:    0.6.2
 */