package android.support.v4.view;

import android.view.WindowInsets;

final class ct extends cs
{
  private final WindowInsets a;

  ct(WindowInsets paramWindowInsets)
  {
    this.a = paramWindowInsets;
  }

  public final int a()
  {
    return this.a.getSystemWindowInsetLeft();
  }

  public final cs a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new ct(this.a.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public final int b()
  {
    return this.a.getSystemWindowInsetTop();
  }

  public final int c()
  {
    return this.a.getSystemWindowInsetRight();
  }

  public final int d()
  {
    return this.a.getSystemWindowInsetBottom();
  }

  final WindowInsets e()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ct
 * JD-Core Version:    0.6.2
 */