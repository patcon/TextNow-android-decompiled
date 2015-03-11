package com.enflick.android.TextNow.chatheads;

import android.view.View;
import android.view.WindowManager.LayoutParams;

final class e
{
  public int a;
  public int b;
  public int c;
  public int d;
  public View e;
  public d f;

  e(c paramc, View paramView, d paramd, int paramInt1, int paramInt2)
  {
    this.e = paramView;
    this.f = paramd;
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)paramView.getLayoutParams();
    this.a = localLayoutParams.x;
    this.b = localLayoutParams.y;
    this.c = (paramInt1 - localLayoutParams.x);
    this.d = (paramInt2 - localLayoutParams.y);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.e
 * JD-Core Version:    0.6.2
 */