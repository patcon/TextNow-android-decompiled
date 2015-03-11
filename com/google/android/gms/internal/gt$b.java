package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class gt$b extends Drawable.ConstantState
{
  int FM;
  int FN;

  gt$b(b paramb)
  {
    if (paramb != null)
    {
      this.FM = paramb.FM;
      this.FN = paramb.FN;
    }
  }

  public final int getChangingConfigurations()
  {
    return this.FM;
  }

  public final Drawable newDrawable()
  {
    return new gt(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gt.b
 * JD-Core Version:    0.6.2
 */