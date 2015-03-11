package textnow.al;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.handmark.pulltorefresh.library.e;
import com.handmark.pulltorefresh.library.k;

public final class b extends d
{
  private final Animation f;
  private final Animation g;

  public b(Context paramContext, e parame, k paramk, TypedArray paramTypedArray)
  {
    super(paramContext, parame, paramk, paramTypedArray);
    if (parame == e.b);
    for (int i = -180; ; i = 180)
    {
      this.f = new RotateAnimation(0.0F, i, 1, 0.5F, 1, 0.5F);
      this.f.setInterpolator(a);
      this.f.setDuration(150L);
      this.f.setFillAfter(true);
      this.g = new RotateAnimation(i, 0.0F, 1, 0.5F, 1, 0.5F);
      this.g.setInterpolator(a);
      this.g.setDuration(150L);
      this.g.setFillAfter(true);
      return;
    }
  }

  protected final void a()
  {
    if (this.f == this.b.getAnimation())
      this.b.startAnimation(this.g);
  }

  protected final void a(float paramFloat)
  {
  }

  protected final void a(Drawable paramDrawable)
  {
    ViewGroup.LayoutParams localLayoutParams;
    Matrix localMatrix;
    float f1;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicHeight();
      int j = paramDrawable.getIntrinsicWidth();
      localLayoutParams = this.b.getLayoutParams();
      int k = Math.max(i, j);
      localLayoutParams.height = k;
      localLayoutParams.width = k;
      this.b.requestLayout();
      this.b.setScaleType(ImageView.ScaleType.MATRIX);
      localMatrix = new Matrix();
      localMatrix.postTranslate((localLayoutParams.width - j) / 2.0F, (localLayoutParams.height - i) / 2.0F);
      int m = 1.a[this.d.ordinal()];
      f1 = 0.0F;
      switch (m)
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      localMatrix.postRotate(f1, localLayoutParams.width / 2.0F, localLayoutParams.height / 2.0F);
      this.b.setImageMatrix(localMatrix);
      return;
      if (this.e == k.b)
      {
        f1 = 90.0F;
      }
      else
      {
        f1 = 180.0F;
        continue;
        k localk1 = this.e;
        k localk2 = k.b;
        f1 = 0.0F;
        if (localk1 == localk2)
          f1 = 270.0F;
      }
    }
  }

  protected final void b()
  {
    this.b.clearAnimation();
    this.b.setVisibility(4);
    this.c.setVisibility(0);
  }

  protected final void c()
  {
    this.b.startAnimation(this.f);
  }

  protected final void d()
  {
    this.b.clearAnimation();
    this.c.setVisibility(8);
    this.b.setVisibility(0);
  }

  protected final int e()
  {
    return 2130837797;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.al.b
 * JD-Core Version:    0.6.2
 */