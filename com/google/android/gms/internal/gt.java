package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class gt extends Drawable
  implements Drawable.Callback
{
  private int FA;
  private int FB = 0;
  private boolean FC;
  private gt.b FD;
  private Drawable FE;
  private Drawable FF;
  private boolean FG;
  private boolean FH;
  private boolean FI;
  private int FJ;
  private boolean Fp = true;
  private int Fv = 0;
  private long Fw;
  private int Fx;
  private int Fy;
  private int Fz = 255;

  public gt(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    if (paramDrawable1 == null)
      paramDrawable1 = gt.a.fh();
    this.FE = paramDrawable1;
    paramDrawable1.setCallback(this);
    gt.b localb1 = this.FD;
    localb1.FN |= paramDrawable1.getChangingConfigurations();
    if (paramDrawable2 == null)
      paramDrawable2 = gt.a.fh();
    this.FF = paramDrawable2;
    paramDrawable2.setCallback(this);
    gt.b localb2 = this.FD;
    localb2.FN |= paramDrawable2.getChangingConfigurations();
  }

  gt(gt.b paramb)
  {
    this.FD = new gt.b(paramb);
  }

  public final boolean canConstantState()
  {
    if (!this.FG)
      if ((this.FE.getConstantState() == null) || (this.FF.getConstantState() == null))
        break label44;
    label44: for (boolean bool = true; ; bool = false)
    {
      this.FH = bool;
      this.FG = true;
      return this.FH;
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    switch (this.Fv)
    {
    default:
    case 1:
    case 2:
    }
    int k;
    boolean bool;
    Drawable localDrawable1;
    Drawable localDrawable2;
    do
      for (int j = i; ; j = 0)
      {
        k = this.FB;
        bool = this.Fp;
        localDrawable1 = this.FE;
        localDrawable2 = this.FF;
        if (j == 0)
          break;
        if ((!bool) || (k == 0))
          localDrawable1.draw(paramCanvas);
        if (k == this.Fz)
        {
          localDrawable2.setAlpha(this.Fz);
          localDrawable2.draw(paramCanvas);
        }
        return;
        this.Fw = SystemClock.uptimeMillis();
        this.Fv = 2;
      }
    while (this.Fw < 0L);
    float f1 = (float)(SystemClock.uptimeMillis() - this.Fw) / this.FA;
    if (f1 >= 1.0F);
    while (true)
    {
      if (i != 0)
        this.Fv = 0;
      float f2 = Math.min(f1, 1.0F);
      this.FB = ((int)(this.Fx + f2 * (this.Fy - this.Fx)));
      break;
      i = 0;
    }
    if (bool)
      localDrawable1.setAlpha(this.Fz - k);
    localDrawable1.draw(paramCanvas);
    if (bool)
      localDrawable1.setAlpha(this.Fz);
    if (k > 0)
    {
      localDrawable2.setAlpha(k);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(this.Fz);
    }
    invalidateSelf();
  }

  public final Drawable fg()
  {
    return this.FF;
  }

  public final int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | this.FD.FM | this.FD.FN;
  }

  public final Drawable.ConstantState getConstantState()
  {
    if (canConstantState())
    {
      this.FD.FM = getChangingConfigurations();
      return this.FD;
    }
    return null;
  }

  public final int getIntrinsicHeight()
  {
    return Math.max(this.FE.getIntrinsicHeight(), this.FF.getIntrinsicHeight());
  }

  public final int getIntrinsicWidth()
  {
    return Math.max(this.FE.getIntrinsicWidth(), this.FF.getIntrinsicWidth());
  }

  public final int getOpacity()
  {
    if (!this.FI)
    {
      this.FJ = Drawable.resolveOpacity(this.FE.getOpacity(), this.FF.getOpacity());
      this.FI = true;
    }
    return this.FJ;
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    if (ip.gc())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.invalidateDrawable(this);
    }
  }

  public final Drawable mutate()
  {
    if ((!this.FC) && (super.mutate() == this))
    {
      if (!canConstantState())
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      this.FE.mutate();
      this.FF.mutate();
      this.FC = true;
    }
    return this;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    this.FE.setBounds(paramRect);
    this.FF.setBounds(paramRect);
  }

  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (ip.gc())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.scheduleDrawable(this, paramRunnable, paramLong);
    }
  }

  public final void setAlpha(int paramInt)
  {
    if (this.FB == this.Fz)
      this.FB = paramInt;
    this.Fz = paramInt;
    invalidateSelf();
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.FE.setColorFilter(paramColorFilter);
    this.FF.setColorFilter(paramColorFilter);
  }

  public final void startTransition(int paramInt)
  {
    this.Fx = 0;
    this.Fy = this.Fz;
    this.FB = 0;
    this.FA = paramInt;
    this.Fv = 1;
    invalidateSelf();
  }

  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (ip.gc())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.unscheduleDrawable(this, paramRunnable);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gt
 * JD-Core Version:    0.6.2
 */