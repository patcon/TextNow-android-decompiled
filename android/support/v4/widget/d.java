package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.av;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class d extends ImageView
{
  private Animation.AnimationListener a;
  private int b;

  public d(Context paramContext, int paramInt, float paramFloat)
  {
    super(paramContext);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(2.0F * (20.0F * f));
    int j = (int)(1.75F * f);
    int k = (int)(0.0F * f);
    this.b = ((int)(3.5F * f));
    ShapeDrawable localShapeDrawable;
    if (a())
    {
      localShapeDrawable = new ShapeDrawable(new OvalShape());
      av.f(this, f * 4.0F);
    }
    while (true)
    {
      localShapeDrawable.getPaint().setColor(-328966);
      setBackgroundDrawable(localShapeDrawable);
      return;
      localShapeDrawable = new ShapeDrawable(new e(this, this.b, i));
      av.a(this, 1, localShapeDrawable.getPaint());
      localShapeDrawable.getPaint().setShadowLayer(this.b, k, j, 503316480);
      int m = this.b;
      setPadding(m, m, m, m);
    }
  }

  private static boolean a()
  {
    return Build.VERSION.SDK_INT >= 21;
  }

  public final void a(Animation.AnimationListener paramAnimationListener)
  {
    this.a = paramAnimationListener;
  }

  public final void onAnimationEnd()
  {
    super.onAnimationEnd();
    if (this.a != null)
      this.a.onAnimationEnd(getAnimation());
  }

  public final void onAnimationStart()
  {
    super.onAnimationStart();
    if (this.a != null)
      this.a.onAnimationStart(getAnimation());
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!a())
      setMeasuredDimension(getMeasuredWidth() + 2 * this.b, getMeasuredHeight() + 2 * this.b);
  }

  public final void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable))
    {
      Resources localResources = getResources();
      ((ShapeDrawable)getBackground()).getPaint().setColor(localResources.getColor(paramInt));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.2
 */