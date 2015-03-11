package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public final class ProgressBarCompat extends View
{
  private static final int[] e = { 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843039, 16843072, 16843040, 16843073 };
  int a;
  int b;
  int c;
  int d;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private boolean k;
  private boolean l;
  private Transformation m;
  private AlphaAnimation n;
  private Drawable o;
  private Drawable p;
  private Drawable q;
  private boolean r;
  private Interpolator s;
  private aa t;
  private long u;
  private boolean v;
  private long w;
  private boolean x;

  private void a()
  {
    if (getVisibility() != 0)
      return;
    if ((this.o instanceof Animatable))
    {
      this.v = true;
      this.n = null;
    }
    while (true)
    {
      postInvalidate();
      return;
      if (this.s == null)
        this.s = new LinearInterpolator();
      this.m = new Transformation();
      this.n = new AlphaAnimation(0.0F, 1.0F);
      this.n.setRepeatMode(this.i);
      this.n.setRepeatCount(-1);
      this.n.setDuration(this.j);
      this.n.setInterpolator(this.s);
      this.n.setStartTime(-1L);
    }
  }

  private void a(int paramInt)
  {
    try
    {
      a(paramInt, false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    while (true)
    {
      float f1;
      Object localObject2;
      Drawable localDrawable;
      try
      {
        if (this.h > 0)
        {
          f1 = paramInt2 / this.h;
          localObject2 = this.q;
          if (localObject2 != null)
          {
            boolean bool = localObject2 instanceof LayerDrawable;
            localDrawable = null;
            if (!bool)
              break label88;
            localDrawable = ((LayerDrawable)localObject2).findDrawableByLayerId(paramInt1);
            break label88;
            ((Drawable)localObject2).setLevel(i1);
          }
        }
        else
        {
          f1 = 0.0F;
          continue;
        }
        invalidate();
        continue;
      }
      finally
      {
      }
      label88: int i1 = (int)(f1 * 10000.0F);
      if (localDrawable != null)
        localObject2 = localDrawable;
    }
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        if (this.u == Thread.currentThread().getId())
        {
          a(paramInt1, paramInt2);
          return;
        }
        if (this.t != null)
        {
          localaa = this.t;
          this.t = null;
          localaa.a(paramInt1, paramInt2, paramBoolean);
          post(localaa);
          continue;
        }
      }
      finally
      {
      }
      aa localaa = new aa(this, paramInt1, paramInt2, paramBoolean);
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        boolean bool = this.k;
        if (bool)
          return;
        i1 = 0;
        if (paramInt < 0)
        {
          if (i1 > this.h)
            i1 = this.h;
          if (i1 == this.f)
            continue;
          this.f = i1;
          a(16908301, this.f, false);
          continue;
        }
      }
      finally
      {
      }
      int i1 = paramInt;
    }
  }

  private void b()
  {
    this.n = null;
    this.m = null;
    if ((this.o instanceof Animatable))
    {
      ((Animatable)this.o).stop();
      this.v = false;
    }
    postInvalidate();
  }

  private void b(int paramInt)
  {
    while (true)
    {
      try
      {
        boolean bool = this.k;
        if (bool)
          return;
        i1 = 0;
        if (paramInt < 0)
        {
          if (i1 > this.h)
            i1 = this.h;
          if (i1 == this.g)
            continue;
          this.g = i1;
          a(16908303, this.g, false);
          continue;
        }
      }
      finally
      {
      }
      int i1 = paramInt;
    }
  }

  private void c()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.p != null) && (this.p.isStateful()))
      this.p.setState(arrayOfInt);
    if ((this.o != null) && (this.o.isStateful()))
      this.o.setState(arrayOfInt);
  }

  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    c();
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.x)
    {
      if (verifyDrawable(paramDrawable))
      {
        Rect localRect = paramDrawable.getBounds();
        int i1 = getScrollX() + getPaddingLeft();
        int i2 = getScrollY() + getPaddingTop();
        invalidate(i1 + localRect.left, i2 + localRect.top, i1 + localRect.right, i2 + localRect.bottom);
      }
    }
    else
      return;
    super.invalidateDrawable(paramDrawable);
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.k)
      a();
  }

  protected final void onDetachedFromWindow()
  {
    if (this.k)
      b();
    if (this.t != null)
      removeCallbacks(this.t);
    super.onDetachedFromWindow();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      Drawable localDrawable = this.q;
      float f1;
      if (localDrawable != null)
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        long l1 = getDrawingTime();
        if (this.n != null)
        {
          this.n.getTransformation(l1, this.m);
          f1 = this.m.getAlpha();
        }
      }
      try
      {
        this.x = true;
        localDrawable.setLevel((int)(f1 * 10000.0F));
        this.x = false;
        if (SystemClock.uptimeMillis() - this.w >= 200L)
        {
          this.w = SystemClock.uptimeMillis();
          postInvalidateDelayed(200L);
        }
        localDrawable.draw(paramCanvas);
        paramCanvas.restore();
        if ((this.v) && ((localDrawable instanceof Animatable)))
        {
          ((Animatable)localDrawable).start();
          this.v = false;
        }
        return;
      }
      finally
      {
        localObject2 = finally;
        this.x = false;
        throw localObject2;
      }
    }
    finally
    {
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    while (true)
    {
      try
      {
        Drawable localDrawable = this.q;
        if (localDrawable != null)
        {
          i1 = Math.max(this.a, Math.min(this.b, localDrawable.getIntrinsicWidth()));
          i2 = Math.max(this.c, Math.min(this.d, localDrawable.getIntrinsicHeight()));
          c();
          int i3 = i1 + (getPaddingLeft() + getPaddingRight());
          int i4 = i2 + (getPaddingTop() + getPaddingBottom());
          setMeasuredDimension(resolveSize(i3, paramInt1), resolveSize(i4, paramInt2));
          return;
        }
      }
      finally
      {
      }
      int i2 = 0;
      int i1 = 0;
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ProgressBarCompat.SavedState localSavedState = (ProgressBarCompat.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    a(localSavedState.a);
    b(localSavedState.b);
  }

  public final Parcelable onSaveInstanceState()
  {
    ProgressBarCompat.SavedState localSavedState = new ProgressBarCompat.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.f;
    localSavedState.b = this.g;
    return localSavedState;
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt1 - getPaddingRight() - getPaddingLeft();
    int i2 = paramInt2 - getPaddingBottom() - getPaddingTop();
    float f1;
    int i5;
    int i3;
    int i4;
    int i6;
    if (this.o != null)
      if ((this.l) && (!(this.o instanceof AnimationDrawable)))
      {
        int i7 = this.o.getIntrinsicWidth();
        int i8 = this.o.getIntrinsicHeight();
        f1 = i7 / i8;
        float f2 = paramInt1 / paramInt2;
        if (f1 != f2)
          if (f2 > f1)
          {
            int i12 = (int)(f1 * paramInt2);
            i5 = (paramInt1 - i12) / 2;
            i3 = i12 + i5;
            i4 = i2;
            i6 = 0;
            this.o.setBounds(i5, i6, i3, i4);
          }
      }
    while (true)
    {
      if (this.p != null)
        this.p.setBounds(0, 0, i3, i4);
      return;
      int i9 = (int)(paramInt1 * (1.0F / f1));
      int i10 = (paramInt2 - i9) / 2;
      int i11 = i9 + i10;
      i3 = i1;
      i4 = i11;
      i6 = i10;
      i5 = 0;
      break;
      i3 = i1;
      i4 = i2;
      i5 = 0;
      i6 = 0;
      break;
      i3 = i1;
      i4 = i2;
    }
  }

  protected final void onVisibilityChanged(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onVisibilityChanged(paramView, paramInt);
    if (this.k)
    {
      if ((paramInt == 8) || (paramInt == 4))
        b();
    }
    else
      return;
    a();
  }

  public final void postInvalidate()
  {
    if (!this.r)
      super.postInvalidate();
  }

  public final void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.k)
      {
        if ((paramInt != 8) && (paramInt != 4))
          break label36;
        b();
      }
    }
    return;
    label36: a();
  }

  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.p) || (paramDrawable == this.o) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ProgressBarCompat
 * JD-Core Version:    0.6.2
 */