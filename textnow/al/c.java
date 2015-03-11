package textnow.al;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.handmark.pulltorefresh.library.e;

public final class c extends FrameLayout
  implements Animation.AnimationListener
{
  private Animation a;
  private Animation b;
  private ImageView c;
  private final Animation d;
  private final Animation e;

  public c(Context paramContext, e parame)
  {
    super(paramContext);
    this.c = new ImageView(paramContext);
    Drawable localDrawable = getResources().getDrawable(2130837997);
    this.c.setImageDrawable(localDrawable);
    int i = getResources().getDimensionPixelSize(2131165260);
    this.c.setPadding(i, i, i, i);
    addView(this.c);
    int j;
    int k;
    switch (1.a[parame.ordinal()])
    {
    default:
      j = 2130968594;
      k = 2130968600;
      setBackgroundResource(2130837999);
    case 1:
    }
    while (true)
    {
      this.a = AnimationUtils.loadAnimation(paramContext, j);
      this.a.setAnimationListener(this);
      this.b = AnimationUtils.loadAnimation(paramContext, k);
      this.b.setAnimationListener(this);
      LinearInterpolator localLinearInterpolator = new LinearInterpolator();
      this.d = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
      this.d.setInterpolator(localLinearInterpolator);
      this.d.setDuration(150L);
      this.d.setFillAfter(true);
      this.e = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
      this.e.setInterpolator(localLinearInterpolator);
      this.e.setDuration(150L);
      this.e.setFillAfter(true);
      return;
      j = 2130968593;
      k = 2130968599;
      setBackgroundResource(2130837998);
      this.c.setScaleType(ImageView.ScaleType.MATRIX);
      Matrix localMatrix = new Matrix();
      localMatrix.setRotate(180.0F, localDrawable.getIntrinsicWidth() / 2.0F, localDrawable.getIntrinsicHeight() / 2.0F);
      this.c.setImageMatrix(localMatrix);
    }
  }

  public final boolean a()
  {
    Animation localAnimation = getAnimation();
    if (localAnimation != null)
      if (this.a != localAnimation);
    while (getVisibility() == 0)
    {
      return true;
      return false;
    }
    return false;
  }

  public final void b()
  {
    startAnimation(this.b);
  }

  public final void c()
  {
    this.c.clearAnimation();
    startAnimation(this.a);
  }

  public final void d()
  {
    this.c.startAnimation(this.d);
  }

  public final void e()
  {
    this.c.startAnimation(this.e);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (paramAnimation == this.b)
    {
      this.c.clearAnimation();
      setVisibility(8);
    }
    while (true)
    {
      clearAnimation();
      return;
      if (paramAnimation == this.a)
        setVisibility(0);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    setVisibility(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.al.c
 * JD-Core Version:    0.6.2
 */