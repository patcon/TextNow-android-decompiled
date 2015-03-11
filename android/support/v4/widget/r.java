package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class r
{
  private static final u b = new s();
  private Object a;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new t();
      return;
    }
  }

  public r(Context paramContext)
  {
    this.a = b.a(paramContext);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }

  public final boolean a()
  {
    return b.a(this.a);
  }

  public final boolean a(float paramFloat)
  {
    return b.a(this.a, paramFloat);
  }

  public final boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }

  public final void b()
  {
    b.b(this.a);
  }

  public final boolean c()
  {
    return b.c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.r
 * JD-Core Version:    0.6.2
 */