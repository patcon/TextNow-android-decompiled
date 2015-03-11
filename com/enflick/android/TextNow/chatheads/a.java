package com.enflick.android.TextNow.chatheads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.WindowManager.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.ChatHeadMessageActivity;
import com.enflick.android.TextNow.views.AvatarView;
import textnow.v.o;
import textnow.v.y;
import textnow.v.z;

public final class a extends GestureDetector.SimpleOnGestureListener
  implements View.OnTouchListener, d
{
  private static String a = "ChatHead";
  private float A;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;
  private f f;
  private c g;
  private textnow.z.f h;
  private b i;
  private int j;
  private h k;
  private RelativeLayout l;
  private AvatarView m;
  private RelativeLayout n;
  private TextView o;
  private g p;
  private WindowManager.LayoutParams q;
  private Context r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private float z;

  public a(Context paramContext, g paramg, f paramf, h paramh, textnow.z.f paramf1, b paramb)
  {
    this.r = paramContext;
    this.f = paramf;
    this.k = paramh;
    this.g = c.a(this.f);
    this.h = paramf1;
    this.i = paramb;
    this.p = paramg;
    this.y = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.r);
    this.r.setTheme(2131362075);
    this.l = ((RelativeLayout)localLayoutInflater.inflate(2130903086, null));
    this.l.setOnTouchListener(this);
    this.n = ((RelativeLayout)this.l.findViewById(2131558587));
    this.o = ((TextView)this.l.findViewById(2131558588));
    this.m = ((AvatarView)this.l.findViewById(2131558586));
    this.m.a(y.b(this.r, 2130772245));
    textnow.z.h localh = textnow.z.h.a(this.r, this.h);
    String str1 = "#";
    if (localh != null)
      str1 = localh.p();
    label351: label363: Bitmap localBitmap;
    do
    {
      while (true)
      {
        this.m.a(str1);
        if (!"support@enflick.com".equalsIgnoreCase(this.h.a()))
          break;
        this.m.setImageResource(2130837562);
        return;
        if (this.h != null)
          str1 = this.h.g();
      }
      String str2;
      if (localh != null)
      {
        str2 = localh.h();
        if (localh == null)
          break label351;
      }
      for (int i1 = localh.d(); ; i1 = this.h.b())
      {
        if (i1 != 5)
          break label363;
        int i2 = str2.split(",").length;
        this.m.a(i2 + "");
        return;
        str2 = this.h.d();
        break;
      }
      if (textnow.z.h.c(str2))
      {
        this.m.setImageDrawable(null);
        return;
      }
      Uri localUri = Uri.parse(str2);
      localBitmap = o.a(this.r).a(localUri, 2130837558, false, true);
    }
    while (localBitmap == null);
    this.m.a(new textnow.ad.a(localBitmap));
  }

  private void b(int paramInt1, int paramInt2)
  {
    WindowManager.LayoutParams localLayoutParams1 = this.q;
    localLayoutParams1.x = (paramInt1 + localLayoutParams1.x);
    WindowManager.LayoutParams localLayoutParams2 = this.q;
    localLayoutParams2.y = (paramInt2 + localLayoutParams2.y);
    if ((this.p.b(this)) && (!this.b) && (this.e))
      this.i.a(this.q.x, this.q.y, false);
    this.f.b(this.l, this.q);
  }

  private void k()
  {
    DisplayMetrics localDisplayMetrics = this.f.a();
    this.w = (localDisplayMetrics.widthPixels / 2);
    this.x = (localDisplayMetrics.heightPixels / 2);
    this.j = z.a(this.r, 64);
  }

  private void l()
  {
    if (this.k != null)
      this.k.f();
  }

  public final textnow.z.f a()
  {
    return this.h;
  }

  public final void a(float paramFloat)
  {
    b((int)paramFloat, 0);
    this.u = ((int)(paramFloat + this.u));
  }

  public final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      this.b = true;
      if (this.p.b(this))
        ChatHeadMessageActivity.a(this.r, this.h);
    }
    do
    {
      return;
      if (paramInt == 3)
      {
        this.b = false;
        return;
      }
    }
    while (paramInt != 7);
    this.d = false;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    b(paramInt1 - this.q.x, paramInt2 - this.q.y);
  }

  public final void a(Point paramPoint)
  {
    this.g.a(this.l, this, paramPoint.x, paramPoint.y, true, 4);
  }

  public final void a(Point paramPoint, boolean paramBoolean)
  {
    k();
    if ((paramPoint == null) && (TextNowApp.c()))
    {
      paramPoint = new Point(this.w + 1 * this.j, -this.x / 2);
      paramBoolean = false;
    }
    RelativeLayout localRelativeLayout = this.l;
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-2, -2, 2003, 520, -3);
    if (paramPoint != null)
    {
      localLayoutParams.x = paramPoint.x;
      localLayoutParams.y = paramPoint.y;
    }
    f localf = this.f;
    this.q = localLayoutParams;
    localf.a(localRelativeLayout, localLayoutParams);
    if ((paramPoint != null) && (paramBoolean))
    {
      i1 = paramPoint.x;
      i2 = paramPoint.y;
      this.g.a(this.l, this, i1, i2, false, 6);
    }
    while ((paramPoint != null) || (!paramBoolean))
    {
      int i1;
      int i2;
      return;
    }
    a(null, null);
    c.a(this.f).a(false, 500, 3);
  }

  public final void a(Integer paramInteger1, Integer paramInteger2)
  {
    int i1 = this.w - this.j / 4;
    int i2 = -this.x / 2;
    if (TextNowApp.c())
      i1 += this.j;
    this.g.a(this.l, this, i1, i2);
  }

  public final void a(boolean paramBoolean)
  {
    b(true);
    this.i.a(this, paramBoolean);
  }

  public final boolean a(a parama)
  {
    return (this.h != null) && (parama.h != null) && (this.h.a().compareTo(parama.h.a()) == 0);
  }

  public final Point b()
  {
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)this.l.getLayoutParams();
    if (localLayoutParams == null)
      return null;
    return new Point(localLayoutParams.x, localLayoutParams.y);
  }

  public final void b(int paramInt)
  {
    this.m.b(paramInt);
  }

  public final void b(boolean paramBoolean)
  {
    this.f.a(this.l);
    if (paramBoolean)
      l();
  }

  public final void c()
  {
    textnow.z.h localh = textnow.z.h.a(this.r, this.h);
    if (localh == null);
    for (final int i1 = 0; ; i1 = localh.i())
    {
      this.n.post(new Runnable()
      {
        public final void run()
        {
          if ((a.c(a.this)) && (a.b(a.this).b(a.this)))
          {
            a.d(a.this).setVisibility(8);
            return;
          }
          if (i1 > 99)
          {
            a.e(a.this).setText("*");
            a.d(a.this).setVisibility(0);
            return;
          }
          if (i1 > 0)
          {
            a.e(a.this).setText(String.valueOf(i1));
            a.d(a.this).setVisibility(0);
            return;
          }
          a.d(a.this).setVisibility(8);
        }
      });
      return;
    }
  }

  public final void c(int paramInt)
  {
    this.u = (this.w - paramInt * this.j - this.j / 2);
    this.v = (-this.x + this.j / 2 + z.g(this.r));
    if (this.b)
    {
      this.g.a(this.l, this, this.u, this.v, false, 2);
      return;
    }
    this.g.a(this.l, this, this.u, this.v);
  }

  public final void d()
  {
    this.f.a(this.l);
    this.f.a(this.l, this.q);
  }

  public final void e()
  {
    k();
    if (!this.b)
    {
      if (!TextNowApp.c())
        break label22;
      j();
    }
    label22: 
    while (!this.p.b(this))
      return;
    this.i.a();
  }

  public final boolean f()
  {
    return this.b;
  }

  public final void g()
  {
    if (this.c);
    do
    {
      return;
      this.c = true;
      Point localPoint = this.k.c();
      this.s = localPoint.x;
      this.t = localPoint.y;
      this.d = true;
      this.g.a(this.l, this, localPoint.x, localPoint.y, false, 7);
    }
    while (!this.p.b(this));
    this.i.d();
  }

  public final void h()
  {
    if (!this.c);
    do
    {
      return;
      this.c = false;
    }
    while (!this.p.b(this));
    this.i.e();
  }

  public final Point i()
  {
    k();
    int i1 = this.q.x;
    int i2 = this.q.y;
    if (i1 > this.w)
      i1 = this.w - this.j;
    if (i1 < -this.w)
      i1 = -this.w + this.j;
    if (i2 > this.x)
      i2 = this.x - this.j;
    if (i2 < -this.x)
      i2 = -this.x + this.j;
    if (i1 >= 0);
    for (float f1 = this.w - this.j / 4; ; f1 = -this.w + this.j / 4)
      return new Point((int)f1, i2);
  }

  public final void j()
  {
    float f1;
    float f2;
    if (this.q.x >= 0)
    {
      f1 = this.w;
      if (this.q.y <= 0)
        break label111;
      f2 = this.x;
    }
    while (true)
      if (Math.abs(this.q.x - f1) < Math.abs(this.q.y - f2))
      {
        if (this.q.x >= 0)
        {
          this.g.a(this.l, this, (int)f1 + this.j, this.q.y, false, 4);
          return;
          f1 = -this.w;
          break;
          label111: f2 = -this.x;
          continue;
        }
        this.g.a(this.l, this, (int)f1 - this.j, this.q.y, false, 4);
        return;
      }
    if (this.q.y > 0)
    {
      this.g.a(this.l, this, this.q.x, (int)f2 + this.j, false, 4);
      return;
    }
    this.g.a(this.l, this, this.q.x, (int)f2 - this.j, false, 4);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getRawX();
    int i2 = (int)paramMotionEvent.getRawY();
    int i3;
    int i4;
    label47: int i5;
    int i6;
    int i7;
    boolean bool1;
    if (i1 >= this.w)
    {
      i3 = i1 - this.w;
      if (i2 < this.x)
        break label190;
      i4 = i2 - this.x;
      Point localPoint = new Point(i3, i4);
      i5 = localPoint.x;
      i6 = localPoint.y;
      i7 = paramMotionEvent.getAction();
      if (i7 != 0)
        break label204;
      boolean bool7 = this.c;
      bool1 = false;
      if (!bool7)
      {
        this.z = paramMotionEvent.getRawX();
        this.A = paramMotionEvent.getRawY();
        if ((this.b) && (this.g.a(this.l, 8)))
          this.g.b(8);
        k();
      }
    }
    label190: label204: boolean bool2;
    label298: 
    do
    {
      do
      {
        if (!this.c)
        {
          this.s = i5;
          this.t = i6;
        }
        return bool1;
        i3 = -1 * (this.w - i1);
        break;
        i4 = -1 * (this.x - i2);
        break label47;
        if (i7 == 1)
        {
          boolean bool4 = this.p.b(this);
          this.z = 0.0F;
          this.A = 0.0F;
          if (!this.e)
            this.i.a(this);
          while (true)
          {
            bool1 = true;
            break;
            if (!this.c)
              break label298;
            com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "removed Floating Chat");
            boolean bool5 = this.b;
            boolean bool6 = false;
            if (!bool5)
              bool6 = true;
            a(bool6);
          }
          if (this.p.i())
            this.i.c();
          while (true)
          {
            if (bool4)
              l();
            this.e = false;
            break;
            if ((!this.b) && (bool4))
              this.i.b();
            else if ((this.b) && (this.e))
              this.g.a(this.l, this, this.u, this.v, false, 8);
          }
        }
        bool1 = false;
      }
      while (i7 != 2);
      float f1 = paramMotionEvent.getRawX() - this.z;
      float f2 = paramMotionEvent.getRawY() - this.A;
      if ((Math.abs(f1) > this.y) || (Math.abs(f2) > this.y))
        this.e = true;
      bool2 = this.e;
      bool1 = false;
    }
    while (!bool2);
    if (!this.d)
    {
      if (!this.k.a(i5, i6))
        break label511;
      g();
    }
    while (true)
    {
      bool1 = true;
      break;
      label511: h();
      boolean bool3 = this.p.b(this);
      int i8 = i5 - this.s;
      int i9 = i6 - this.t;
      if ((this.e) && (bool3))
      {
        b(i8, i9);
        if (!this.k.d())
          this.k.e();
      }
      else if ((!bool3) && (this.b) && (!c.a(this.f).a(8)))
      {
        this.i.a(i8);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.a
 * JD-Core Version:    0.6.2
 */