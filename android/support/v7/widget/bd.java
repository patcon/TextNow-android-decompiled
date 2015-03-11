package android.support.v7.widget;

import android.support.v4.view.av;
import android.support.v4.widget.ai;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

final class bd
  implements Runnable
{
  private int b;
  private int c;
  private ai d;
  private Interpolator e = RecyclerView.e();
  private boolean f = false;
  private boolean g = false;

  public bd(RecyclerView paramRecyclerView)
  {
    this.d = ai.a(paramRecyclerView.getContext(), RecyclerView.e());
  }

  private void b()
  {
    if (this.f)
    {
      this.g = true;
      return;
    }
    av.a(this.a, this);
  }

  public final void a()
  {
    this.a.removeCallbacks(this);
    this.d.h();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
    b();
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, RecyclerView.e());
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.e != paramInterpolator)
    {
      this.e = paramInterpolator;
      this.d = ai.a(this.a.getContext(), paramInterpolator);
    }
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, paramInt3);
    b();
  }

  public final void b(int paramInt1, int paramInt2)
  {
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k;
    int m;
    int n;
    if (i > j)
    {
      k = 1;
      m = (int)Math.sqrt(0);
      n = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (k == 0)
        break label148;
    }
    int i4;
    label148: for (int i1 = this.a.getWidth(); ; i1 = this.a.getHeight())
    {
      int i2 = i1 / 2;
      float f1 = Math.min(1.0F, 1.0F * n / i1);
      float f2 = i2 + i2 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      if (m <= 0)
        break label160;
      i4 = 4 * Math.round(1000.0F * Math.abs(f2 / m));
      a(paramInt1, paramInt2, Math.min(i4, 2000));
      return;
      k = 0;
      break;
    }
    label160: if (k != 0);
    for (int i3 = i; ; i3 = j)
    {
      i4 = (int)(300.0F * (1.0F + i3 / i1));
      break;
    }
  }

  public final void run()
  {
    this.g = false;
    this.f = true;
    RecyclerView.e(this.a);
    ai localai = this.d;
    az localaz = RecyclerView.d(this.a).r;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i2;
    label371: int i12;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    label466: int i9;
    int i11;
    if (localai.g())
    {
      i = localai.b();
      j = localai.c();
      k = i - this.b;
      m = j - this.c;
      this.b = i;
      this.c = j;
      al localal = RecyclerView.f(this.a);
      n = 0;
      int i1 = 0;
      i2 = 0;
      int i3 = 0;
      if (localal != null)
      {
        this.a.b();
        RecyclerView.b(this.a, true);
        i2 = 0;
        i3 = 0;
        if (k != 0)
        {
          i3 = RecyclerView.d(this.a).a(k, this.a.a, this.a.f);
          i2 = k - i3;
        }
        n = 0;
        i1 = 0;
        if (m != 0)
        {
          i1 = RecyclerView.d(this.a).b(m, this.a.a, this.a.f);
          n = m - i1;
        }
        if (RecyclerView.g(this.a))
        {
          int i13 = this.a.c.a();
          int i14 = 0;
          if (i14 < i13)
          {
            View localView1 = this.a.c.b(i14);
            be localbe = this.a.a(localView1);
            if ((localbe != null) && (localbe.h != null))
              if (localbe.h == null)
                break label371;
            for (View localView2 = localbe.h.a; ; localView2 = null)
            {
              if (localView2 != null)
              {
                int i15 = localView1.getLeft();
                int i16 = localView1.getTop();
                if ((i15 != localView2.getLeft()) || (i16 != localView2.getTop()))
                  localView2.layout(i15, i16, i15 + localView2.getWidth(), i16 + localView2.getHeight());
              }
              i14++;
              break;
            }
          }
        }
        if ((localaz != null) && (!localaz.b()) && (localaz.c()))
        {
          i12 = this.a.f.e();
          if (i12 != 0)
            break label740;
          localaz.a();
        }
        RecyclerView.b(this.a, false);
        this.a.a(false);
      }
      i4 = n;
      i5 = i2;
      i6 = i1;
      i7 = i3;
      if ((k != i7) || (m != i6))
        break label774;
      i8 = 1;
      if (!RecyclerView.h(this.a).isEmpty())
        this.a.invalidate();
      if (av.a(this.a) != 2)
        RecyclerView.a(this.a, k, m);
      if ((i5 != 0) || (i4 != 0))
      {
        i9 = (int)localai.f();
        if (i5 == i)
          break label822;
        if (i5 >= 0)
          break label780;
        i11 = -i9;
      }
    }
    label541: label562: label822: for (int i10 = i11; ; i10 = 0)
    {
      if (i4 != j)
        if (i4 < 0)
          i9 = -i9;
      while (true)
      {
        if (av.a(this.a) != 2)
          this.a.b(i10, i9);
        if (((i10 != 0) || (i5 == i) || (localai.d() == 0)) && ((i9 != 0) || (i4 == j) || (localai.e() == 0)))
          localai.h();
        if ((i7 != 0) || (i6 != 0))
        {
          RecyclerView.a(this.a, 0, 0, 0, 0);
          if (RecyclerView.i(this.a) != null)
            RecyclerView.i(this.a);
        }
        if (!RecyclerView.j(this.a))
          this.a.invalidate();
        if ((localai.a()) || (i8 == 0))
          RecyclerView.b(this.a, 0);
        while (true)
        {
          if ((localaz != null) && (localaz.b()))
            az.a(localaz, 0, 0);
          this.f = false;
          if (this.g)
            b();
          return;
          label740: if (localaz.d() >= i12)
            localaz.a(i12 - 1);
          az.a(localaz, k - i2, m - n);
          break;
          i8 = 0;
          break label466;
          if (i5 > 0)
          {
            i11 = i9;
            break label541;
          }
          i11 = 0;
          break label541;
          if (i4 > 0)
            break label562;
          i9 = 0;
          break label562;
          b();
        }
        i9 = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bd
 * JD-Core Version:    0.6.2
 */