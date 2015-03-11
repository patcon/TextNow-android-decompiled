package com.admarvel.android.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;

public class o$a extends Button
{
  public o$a(o paramo, Context paramContext)
  {
    super(paramContext);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
      super.setBackgroundDrawable(new o.a.a(this, paramDrawable));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.o.a
 * JD-Core Version:    0.6.2
 */