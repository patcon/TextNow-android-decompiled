package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class aa
{
  Object a;
  ab b;

  private aa(int paramInt, Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInt >= 14)
      this.b = new ae();
    while (true)
    {
      this.a = this.b.a(paramContext, paramInterpolator);
      return;
      if (paramInt >= 9)
        this.b = new ad();
      else
        this.b = new ac();
    }
  }

  aa(Context paramContext, Interpolator paramInterpolator)
  {
    this(Build.VERSION.SDK_INT, paramContext, paramInterpolator);
  }

  public final int a()
  {
    return this.b.a(this.a);
  }

  public final int b()
  {
    return this.b.b(this.a);
  }

  public final void c()
  {
    this.b.d(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.aa
 * JD-Core Version:    0.6.2
 */