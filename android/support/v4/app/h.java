package android.support.v4.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.support.v4.view.aq;
import android.view.Window;

final class h extends InsetDrawable
  implements Drawable.Callback
{
  private final boolean b;
  private final Rect c;
  private float d;
  private float e;

  private h(a parama, Drawable paramDrawable)
  {
    super(paramDrawable, 0);
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i > 18)
      bool = true;
    this.b = bool;
    this.c = new Rect();
  }

  public final float a()
  {
    return this.d;
  }

  public final void a(float paramFloat)
  {
    this.d = paramFloat;
    invalidateSelf();
  }

  public final void b(float paramFloat)
  {
    this.e = paramFloat;
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    copyBounds(this.c);
    paramCanvas.save();
    if (aq.e(a.a(this.a).getWindow().getDecorView()) == i);
    for (int j = i; ; j = 0)
    {
      if (j != 0)
        i = -1;
      int k = this.c.width();
      paramCanvas.translate(-this.e * k * this.d * i, 0.0F);
      if ((j != 0) && (!this.b))
      {
        paramCanvas.translate(k, 0.0F);
        paramCanvas.scale(-1.0F, 1.0F);
      }
      super.draw(paramCanvas);
      paramCanvas.restore();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.h
 * JD-Core Version:    0.6.2
 */