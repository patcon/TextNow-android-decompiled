package com.admarvel.android.ads;

import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

public class w$a$a extends LayerDrawable
{
  protected int a = 100;
  protected ColorFilter b = new LightingColorFilter(3768514, 1);

  public w$a$a(w.a parama, Drawable paramDrawable)
  {
    super(new Drawable[] { paramDrawable });
  }

  public boolean isStateful()
  {
    return true;
  }

  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int i = 0;
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    if (k < j)
    {
      int n = paramArrayOfInt[k];
      if (n == 16842910)
        m = 1;
      while (true)
      {
        k++;
        break;
        if (n == 16842919)
          i = 1;
      }
    }
    if ((m != 0) && (i != 0))
      setColorFilter(this.b);
    while (true)
    {
      invalidateSelf();
      return super.onStateChange(paramArrayOfInt);
      if (m == 0)
      {
        setColorFilter(null);
        setAlpha(this.a);
      }
      else
      {
        setColorFilter(null);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.w.a.a
 * JD-Core Version:    0.6.2
 */