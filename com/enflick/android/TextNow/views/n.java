package com.enflick.android.TextNow.views;

import android.support.v4.view.ca;
import android.view.View;

public final class n
  implements ca
{
  private final o a;

  public n(o paramo)
  {
    this.a = paramo;
  }

  public final void a(View paramView, float paramFloat)
  {
    float f1 = 1.0F;
    float f2;
    float f3;
    switch (ZoomViewPager.1.a[this.a.ordinal()])
    {
    default:
      return;
    case 1:
      paramView.setRotationY(-30.0F * paramFloat);
      return;
    case 2:
      if ((paramFloat < 0.0F) && (paramFloat > -1.0F))
      {
        f2 = 0.85F + 0.15F * Math.abs(Math.abs(paramFloat) - f1);
        f1 = Math.max(0.35F, f1 - Math.abs(paramFloat));
        int i = paramView.getWidth();
        f3 = paramFloat * -i;
        if (f3 <= -i)
          break;
      }
      break;
    case 3:
    case 4:
    }
    while (true)
    {
      paramView.setAlpha(f1);
      paramView.setTranslationX(f3);
      paramView.setScaleX(f2);
      paramView.setScaleY(f2);
      return;
      f3 = 0.0F;
      continue;
      f2 = f1;
      f3 = 0.0F;
      continue;
      if ((paramFloat > 0.0F) && (paramFloat < f1))
      {
        float f7 = f1 - paramFloat;
        f2 = 0.75F + 0.25F * (f1 - Math.abs(paramFloat));
        f3 = paramView.getWidth() * -paramFloat;
        f1 = f7;
      }
      else
      {
        f2 = f1;
        f3 = 0.0F;
        continue;
        if ((paramFloat >= -1.0F) && (paramFloat <= f1))
        {
          f2 = Math.max(0.85F, f1 - Math.abs(paramFloat));
          float f4 = 0.5F + 0.5F * ((f2 - 0.85F) / 0.15F);
          float f5 = paramView.getHeight() * (f1 - f2) / 2.0F;
          float f6 = paramView.getWidth() * (f1 - f2) / 2.0F;
          if (paramFloat < 0.0F)
          {
            f3 = f6 - f5 / 2.0F;
            f1 = f4;
          }
          else
          {
            f3 = -f6 + f5 / 2.0F;
            f1 = f4;
          }
        }
        else
        {
          f2 = f1;
          f3 = 0.0F;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.n
 * JD-Core Version:    0.6.2
 */