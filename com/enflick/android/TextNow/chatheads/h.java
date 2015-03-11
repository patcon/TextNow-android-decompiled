package com.enflick.android.TextNow.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import textnow.v.z;

final class h
  implements d
{
  private static int a = 64;
  private static int b = 64;
  private static int c = 120;
  private Context d;
  private RelativeLayout e;
  private ImageView f;
  private f g;
  private c h;
  private int i;
  private int j;
  private int k;
  private boolean l = false;

  h(Context paramContext, f paramf)
  {
    this.d = paramContext;
    this.g = paramf;
    this.h = c.a(this.g);
    this.e = ((RelativeLayout)LayoutInflater.from(this.d).inflate(2130903087, null));
    this.f = new ImageView(this.d);
    this.f.setImageDrawable(this.d.getResources().getDrawable(2130837587));
    h();
    i();
    a(this.f, 0, 300 + this.j, 2 * this.i, z.a(this.d, c));
    this.k = z.a(this.d, a);
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-2, -2, 2003, 520, -3);
    localLayoutParams.x = 0;
    localLayoutParams.y = paramInt2;
    localLayoutParams.width = paramInt3;
    localLayoutParams.height = paramInt4;
    this.g.a(paramView, localLayoutParams);
  }

  private void h()
  {
    DisplayMetrics localDisplayMetrics = this.g.a();
    this.i = (localDisplayMetrics.widthPixels / 2);
    this.j = (localDisplayMetrics.heightPixels / 2);
  }

  private void i()
  {
    int m = z.a(this.d, b);
    a(this.e, 0, 300 + this.j, m, m);
  }

  public final void a()
  {
    h();
    this.f.getLayoutParams().width = (2 * this.i);
    this.f.requestLayout();
    f();
  }

  public final void a(int paramInt)
  {
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    Point localPoint = c();
    return (Math.abs(paramInt1 - localPoint.x) < this.k) && (Math.abs(paramInt2 - localPoint.y) < this.k);
  }

  public final void b()
  {
    this.g.a(this.e);
    this.g.a(this.f);
  }

  public final Point c()
  {
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)this.e.getLayoutParams();
    return new Point(localLayoutParams.x, localLayoutParams.y);
  }

  public final boolean d()
  {
    return this.l;
  }

  public final void e()
  {
    this.l = true;
    this.h.a(this.e, this, 0, this.j - z.a(this.d, b), false, 6);
    this.h.a(this.f, this, 0, 300 + this.j - z.a(this.d, c), true, 6);
  }

  public final void f()
  {
    this.l = false;
    this.h.a(this.e, this, 0, 300 + this.j, false, 6);
    this.h.a(this.f, this, 0, 300 + this.j, true, 6);
  }

  public final void g()
  {
    this.g.a(this.e);
    i();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.h
 * JD-Core Version:    0.6.2
 */