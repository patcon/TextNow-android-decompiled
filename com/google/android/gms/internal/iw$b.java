package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class iw$b extends Drawable.ConstantState
{
  int Lh;
  int Li;

  iw$b(b paramb)
  {
    if (paramb != null)
    {
      this.Lh = paramb.Lh;
      this.Li = paramb.Li;
    }
  }

  public final int getChangingConfigurations()
  {
    return this.Lh;
  }

  public final Drawable newDrawable()
  {
    return new iw(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iw.b
 * JD-Core Version:    0.6.2
 */