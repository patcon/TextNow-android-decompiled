package textnow.aw;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class a extends Animation
{
  public static final boolean a;
  private static final WeakHashMap<View, a> b;
  private final WeakReference<View> c;
  private final Camera d = new Camera();
  private boolean e;
  private float f = 1.0F;
  private float g;
  private float h;
  private float i;
  private float j;
  private float k;
  private float l = 1.0F;
  private float m = 1.0F;
  private float n;
  private float o;
  private final RectF p = new RectF();
  private final RectF q = new RectF();
  private final Matrix r = new Matrix();

  static
  {
    if (Integer.valueOf(Build.VERSION.SDK).intValue() < 11);
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      b = new WeakHashMap();
      return;
    }
  }

  private a(View paramView)
  {
    setDuration(0L);
    setFillAfter(true);
    paramView.setAnimation(this);
    this.c = new WeakReference(paramView);
  }

  public static a a(View paramView)
  {
    a locala = (a)b.get(paramView);
    if ((locala == null) || (locala != paramView.getAnimation()))
    {
      locala = new a(paramView);
      b.put(paramView, locala);
    }
    return locala;
  }

  private void a(Matrix paramMatrix, View paramView)
  {
    float f1 = paramView.getWidth();
    float f2 = paramView.getHeight();
    boolean bool = this.e;
    float f3;
    if (bool)
    {
      f3 = this.g;
      if (!bool)
        break label233;
    }
    label233: for (float f4 = this.h; ; f4 = f2 / 2.0F)
    {
      float f5 = this.i;
      float f6 = this.j;
      float f7 = this.k;
      if ((f5 != 0.0F) || (f6 != 0.0F) || (f7 != 0.0F))
      {
        Camera localCamera = this.d;
        localCamera.save();
        localCamera.rotateX(f5);
        localCamera.rotateY(f6);
        localCamera.rotateZ(-f7);
        localCamera.getMatrix(paramMatrix);
        localCamera.restore();
        paramMatrix.preTranslate(-f3, -f4);
        paramMatrix.postTranslate(f3, f4);
      }
      float f8 = this.l;
      float f9 = this.m;
      if ((f8 != 1.0F) || (f9 != 1.0F))
      {
        paramMatrix.postScale(f8, f9);
        paramMatrix.postTranslate(-(f3 / f1) * (f8 * f1 - f1), -(f4 / f2) * (f9 * f2 - f2));
      }
      paramMatrix.postTranslate(this.n, this.o);
      return;
      f3 = f1 / 2.0F;
      break;
    }
  }

  private void a(RectF paramRectF, View paramView)
  {
    paramRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    Matrix localMatrix = this.r;
    localMatrix.reset();
    a(localMatrix, paramView);
    this.r.mapRect(paramRectF);
    paramRectF.offset(paramView.getLeft(), paramView.getTop());
    if (paramRectF.right < paramRectF.left)
    {
      float f2 = paramRectF.right;
      paramRectF.right = paramRectF.left;
      paramRectF.left = f2;
    }
    if (paramRectF.bottom < paramRectF.top)
    {
      float f1 = paramRectF.top;
      paramRectF.top = paramRectF.bottom;
      paramRectF.bottom = f1;
    }
  }

  private void k()
  {
    View localView = (View)this.c.get();
    if (localView != null)
      a(this.p, localView);
  }

  private void l()
  {
    View localView = (View)this.c.get();
    if ((localView == null) || (localView.getParent() == null))
      return;
    RectF localRectF = this.q;
    a(localRectF, localView);
    localRectF.union(this.p);
    ((View)localView.getParent()).invalidate((int)Math.floor(localRectF.left), (int)Math.floor(localRectF.top), (int)Math.ceil(localRectF.right), (int)Math.ceil(localRectF.bottom));
  }

  public final float a()
  {
    return this.f;
  }

  public final void a(float paramFloat)
  {
    if (this.f != paramFloat)
    {
      this.f = paramFloat;
      View localView = (View)this.c.get();
      if (localView != null)
        localView.invalidate();
    }
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    View localView = (View)this.c.get();
    if (localView != null)
    {
      paramTransformation.setAlpha(this.f);
      a(paramTransformation.getMatrix(), localView);
    }
  }

  public final float b()
  {
    return this.k;
  }

  public final void b(float paramFloat)
  {
    if (this.k != paramFloat)
    {
      k();
      this.k = paramFloat;
      l();
    }
  }

  public final float c()
  {
    return this.i;
  }

  public final void c(float paramFloat)
  {
    if (this.i != paramFloat)
    {
      k();
      this.i = paramFloat;
      l();
    }
  }

  public final float d()
  {
    return this.j;
  }

  public final void d(float paramFloat)
  {
    if (this.j != paramFloat)
    {
      k();
      this.j = paramFloat;
      l();
    }
  }

  public final float e()
  {
    return this.l;
  }

  public final void e(float paramFloat)
  {
    if (this.l != paramFloat)
    {
      k();
      this.l = paramFloat;
      l();
    }
  }

  public final float f()
  {
    return this.m;
  }

  public final void f(float paramFloat)
  {
    if (this.m != paramFloat)
    {
      k();
      this.m = paramFloat;
      l();
    }
  }

  public final float g()
  {
    return this.n;
  }

  public final void g(float paramFloat)
  {
    if (this.n != paramFloat)
    {
      k();
      this.n = paramFloat;
      l();
    }
  }

  public final float h()
  {
    return this.o;
  }

  public final void h(float paramFloat)
  {
    if (this.o != paramFloat)
    {
      k();
      this.o = paramFloat;
      l();
    }
  }

  public final float i()
  {
    View localView = (View)this.c.get();
    if (localView == null)
      return 0.0F;
    return localView.getLeft() + this.n;
  }

  public final void i(float paramFloat)
  {
    View localView = (View)this.c.get();
    if (localView != null)
      g(paramFloat - localView.getLeft());
  }

  public final float j()
  {
    View localView = (View)this.c.get();
    if (localView == null)
      return 0.0F;
    return localView.getTop() + this.o;
  }

  public final void j(float paramFloat)
  {
    View localView = (View)this.c.get();
    if (localView != null)
      h(paramFloat - localView.getTop());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.aw.a
 * JD-Core Version:    0.6.2
 */