package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

final class v extends Drawable
  implements Animatable
{
  private static final Interpolator a = new LinearInterpolator();
  private static final Interpolator b = new w((byte)0);
  private static final Interpolator c = new y((byte)0);
  private static final Interpolator d = new AccelerateDecelerateInterpolator();
  private final int[] e = { -16777216 };
  private final ArrayList<Animation> f = new ArrayList();
  private final x g;
  private float h;
  private Resources i;
  private View j;
  private Animation k;
  private float l;
  private double m;
  private double n;
  private Animation o;
  private final Drawable.Callback p = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      v.this.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      v.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }

    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      v.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };

  public v(Context paramContext, View paramView)
  {
    this.j = paramView;
    this.i = paramContext.getResources();
    this.g = new x(this.p);
    this.g.a(this.e);
    x localx1 = this.g;
    float f1 = this.i.getDisplayMetrics().density;
    this.m = (40.0D * f1);
    this.n = (40.0D * f1);
    localx1.a(f1 * (float)2.5D);
    localx1.a(8.75D * f1);
    localx1.b(0);
    localx1.a(10.0F * f1, 5.0F * f1);
    localx1.a((int)this.m, (int)this.n);
    final x localx2 = this.g;
    Animation local1 = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        float f1 = (float)(1.0D + Math.floor(localx2.i() / 0.8F));
        float f2 = localx2.e() + paramAnonymousFloat * (localx2.f() - localx2.e());
        localx2.b(f2);
        float f3 = localx2.i() + paramAnonymousFloat * (f1 - localx2.i());
        localx2.d(f3);
        localx2.e(1.0F - paramAnonymousFloat);
      }
    };
    local1.setInterpolator(d);
    local1.setDuration(666L);
    local1.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        localx2.a();
        localx2.j();
        localx2.a(false);
        v.b(v.this).startAnimation(v.a(v.this));
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    Animation local3 = new Animation()
    {
      public final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        float f1 = (float)Math.toRadians(localx2.c() / (6.283185307179586D * localx2.h()));
        float f2 = localx2.f();
        float f3 = localx2.e();
        float f4 = localx2.i();
        float f5 = f2 + (0.8F - f1) * v.a().getInterpolation(paramAnonymousFloat);
        localx2.c(f5);
        float f6 = f3 + 0.8F * v.b().getInterpolation(paramAnonymousFloat);
        localx2.b(f6);
        float f7 = f4 + 0.25F * paramAnonymousFloat;
        localx2.d(f7);
        float f8 = 144.0F * paramAnonymousFloat + 720.0F * (v.c(v.this) / 5.0F);
        v.this.c(f8);
      }
    };
    local3.setRepeatCount(-1);
    local3.setRepeatMode(1);
    local3.setInterpolator(a);
    local3.setDuration(1333L);
    local3.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        localx2.j();
        localx2.a();
        localx2.b(localx2.g());
        v.a(v.this, (1.0F + v.c(v.this)) % 5.0F);
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        v.a(v.this, 0.0F);
      }
    });
    this.o = local1;
    this.k = local3;
  }

  public final void a(float paramFloat)
  {
    this.g.e(paramFloat);
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.g.b(0.0F);
    this.g.c(paramFloat2);
  }

  public final void a(int paramInt)
  {
    this.g.a(-328966);
  }

  public final void a(boolean paramBoolean)
  {
    this.g.a(paramBoolean);
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.g.a(paramArrayOfInt);
    this.g.b(0);
  }

  public final void b(float paramFloat)
  {
    this.g.d(paramFloat);
  }

  final void c(float paramFloat)
  {
    this.h = paramFloat;
    invalidateSelf();
  }

  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i1 = paramCanvas.save();
    paramCanvas.rotate(this.h, localRect.exactCenterX(), localRect.exactCenterY());
    this.g.a(paramCanvas, localRect);
    paramCanvas.restoreToCount(i1);
  }

  public final int getAlpha()
  {
    return this.g.b();
  }

  public final int getIntrinsicHeight()
  {
    return (int)this.n;
  }

  public final int getIntrinsicWidth()
  {
    return (int)this.m;
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final boolean isRunning()
  {
    ArrayList localArrayList = this.f;
    int i1 = localArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Animation localAnimation = (Animation)localArrayList.get(i2);
      if ((localAnimation.hasStarted()) && (!localAnimation.hasEnded()))
        return true;
    }
    return false;
  }

  public final void setAlpha(int paramInt)
  {
    this.g.c(paramInt);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.g.a(paramColorFilter);
  }

  public final void start()
  {
    this.k.reset();
    this.g.j();
    if (this.g.g() != this.g.d())
    {
      this.j.startAnimation(this.o);
      return;
    }
    this.g.b(0);
    this.g.k();
    this.j.startAnimation(this.k);
  }

  public final void stop()
  {
    this.j.clearAnimation();
    c(0.0F);
    this.g.a(false);
    this.g.b(0);
    this.g.k();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.v
 * JD-Core Version:    0.6.2
 */