package textnow.at;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class o extends a
{
  private static long A = 10L;
  private static ThreadLocal<p> i = new ThreadLocal();
  private static final ThreadLocal<ArrayList<o>> j = new ThreadLocal()
  {
  };
  private static final ThreadLocal<ArrayList<o>> k = new ThreadLocal()
  {
  };
  private static final ThreadLocal<ArrayList<o>> l = new ThreadLocal()
  {
  };
  private static final ThreadLocal<ArrayList<o>> m = new ThreadLocal()
  {
  };
  private static final ThreadLocal<ArrayList<o>> n = new ThreadLocal()
  {
  };
  private static final Interpolator o = new AccelerateDecelerateInterpolator();
  private static final n p = new e();
  private static final n q = new c();
  private int B = 0;
  private int C = 1;
  private Interpolator D = o;
  private ArrayList<q> E = null;
  long c;
  long d = -1L;
  int e = 0;
  boolean f = false;
  k[] g;
  HashMap<String, k> h;
  private boolean r = false;
  private int s = 0;
  private float t = 0.0F;
  private boolean u = false;
  private long v;
  private boolean w = false;
  private boolean x = false;
  private long y = 300L;
  private long z = 0L;

  public static o a(float[] paramArrayOfFloat)
  {
    o localo = new o();
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
      return localo;
    if ((localo.g == null) || (localo.g.length == 0))
    {
      k[] arrayOfk = new k[1];
      arrayOfk[0] = k.a("", paramArrayOfFloat);
      localo.a(arrayOfk);
    }
    while (true)
    {
      localo.f = false;
      return localo;
      localo.g[0].a(paramArrayOfFloat);
    }
  }

  public static o a(int[] paramArrayOfInt)
  {
    o localo = new o();
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      return localo;
    if ((localo.g == null) || (localo.g.length == 0))
    {
      k[] arrayOfk = new k[1];
      arrayOfk[0] = k.a("", paramArrayOfInt);
      localo.a(arrayOfk);
    }
    while (true)
    {
      localo.f = false;
      return localo;
      localo.g[0].a(paramArrayOfInt);
    }
  }

  private void a(k[] paramArrayOfk)
  {
    int i1 = paramArrayOfk.length;
    this.g = paramArrayOfk;
    this.h = new HashMap(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      k localk = paramArrayOfk[i2];
      this.h.put(localk.c(), localk);
    }
    this.f = false;
  }

  private void d(long paramLong)
  {
    m();
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    if (this.e != 1)
    {
      this.d = paramLong;
      this.e = 2;
    }
    this.c = (l1 - paramLong);
    c(l1);
  }

  private void m()
  {
    if (!this.f)
    {
      int i1 = this.g.length;
      for (int i2 = 0; i2 < i1; i2++)
        this.g[i2].b();
      this.f = true;
    }
  }

  private void n()
  {
    ((ArrayList)j.get()).remove(this);
    ((ArrayList)k.get()).remove(this);
    ((ArrayList)l.get()).remove(this);
    this.e = 0;
    if ((this.w) && (this.b != null))
    {
      ArrayList localArrayList = (ArrayList)this.b.clone();
      int i1 = localArrayList.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((b)localArrayList.get(i2)).b(this);
    }
    this.w = false;
    this.x = false;
  }

  private o o()
  {
    int i1 = 0;
    o localo = (o)super.c();
    if (this.E != null)
    {
      ArrayList localArrayList = this.E;
      localo.E = new ArrayList();
      int i3 = localArrayList.size();
      for (int i4 = 0; i4 < i3; i4++)
        localo.E.add(localArrayList.get(i4));
    }
    localo.d = -1L;
    localo.r = false;
    localo.s = 0;
    localo.f = false;
    localo.e = 0;
    localo.u = false;
    k[] arrayOfk = this.g;
    if (arrayOfk != null)
    {
      int i2 = arrayOfk.length;
      localo.g = new k[i2];
      localo.h = new HashMap(i2);
      while (i1 < i2)
      {
        k localk = arrayOfk[i1].a();
        localo.g[i1] = localk;
        localo.h.put(localk.c(), localk);
        i1++;
      }
    }
    return localo;
  }

  public final o a(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.y = paramLong;
    return this;
  }

  public final void a()
  {
    if (Looper.myLooper() == null)
      throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    this.r = false;
    this.s = 0;
    this.e = 0;
    this.x = true;
    this.u = false;
    ((ArrayList)k.get()).add(this);
    if (this.z == 0L)
    {
      if ((!this.f) || (this.e == 0));
      for (long l1 = 0L; ; l1 = AnimationUtils.currentAnimationTimeMillis() - this.c)
      {
        d(l1);
        this.e = 0;
        this.w = true;
        if (this.b == null)
          break;
        ArrayList localArrayList = (ArrayList)this.b.clone();
        int i1 = localArrayList.size();
        for (int i2 = 0; i2 < i1; i2++)
          ((b)localArrayList.get(i2)).a(this);
      }
    }
    p localp = (p)i.get();
    if (localp == null)
    {
      localp = new p((byte)0);
      i.set(localp);
    }
    localp.sendEmptyMessage(0);
  }

  public final void a(Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
    {
      this.D = paramInterpolator;
      return;
    }
    this.D = new LinearInterpolator();
  }

  public final void a(q paramq)
  {
    if (this.E == null)
      this.E = new ArrayList();
    this.E.add(paramq);
  }

  public final void b()
  {
    if ((this.e != 0) || (((ArrayList)k.get()).contains(this)) || (((ArrayList)l.get()).contains(this)))
    {
      if ((this.w) && (this.b != null))
      {
        Iterator localIterator = ((ArrayList)this.b.clone()).iterator();
        while (localIterator.hasNext())
          ((b)localIterator.next()).c(this);
      }
      n();
    }
  }

  public final void b(long paramLong)
  {
    this.z = paramLong;
  }

  final boolean c(long paramLong)
  {
    int i1 = 1;
    int i2 = 0;
    if (this.e == 0)
    {
      this.e = i1;
      if (this.d >= 0L)
        break label60;
      this.c = paramLong;
    }
    while (true)
      switch (this.e)
      {
      default:
        i1 = 0;
        return i1;
        label60: this.c = (paramLong - this.d);
        this.d = -1L;
      case 1:
      case 2:
      }
    float f1;
    if (this.y > 0L)
      f1 = (float)(paramLong - this.c) / (float)this.y;
    boolean bool;
    float f2;
    while (true)
      if (f1 >= 1.0F)
        if ((this.s < this.B) || (this.B == -1))
        {
          if (this.b != null)
          {
            int i6 = this.b.size();
            int i7 = 0;
            while (true)
              if (i7 < i6)
              {
                ((b)this.b.get(i7)).d(this);
                i7++;
                continue;
                f1 = 1.0F;
                break;
              }
          }
          if (this.C == 2)
          {
            if (this.r)
            {
              bool = false;
              this.r = bool;
            }
          }
          else
          {
            this.s += (int)f1;
            f2 = f1 % 1.0F;
            this.c += this.y;
            i1 = 0;
          }
        }
    while (true)
    {
      label243: if (this.r)
        f2 = 1.0F - f2;
      float f3 = this.D.getInterpolation(f2);
      this.t = f3;
      int i3 = this.g.length;
      int i4 = 0;
      while (true)
        if (i4 < i3)
        {
          this.g[i4].a(f3);
          i4++;
          continue;
          bool = i1;
          break;
          f2 = Math.min(f1, 1.0F);
          break label243;
        }
      if (this.E == null)
        break;
      int i5 = this.E.size();
      while (i2 < i5)
      {
        ((q)this.E.get(i2)).a(this);
        i2++;
      }
      break;
      f2 = f1;
      i1 = 0;
    }
  }

  public final Object e()
  {
    if ((this.g != null) && (this.g.length > 0))
      return this.g[0].d();
    return null;
  }

  public final float f()
  {
    return this.t;
  }

  public final String toString()
  {
    String str = "ValueAnimator@" + Integer.toHexString(hashCode());
    if (this.g != null)
      for (int i1 = 0; i1 < this.g.length; i1++)
        str = str + "\n    " + this.g[i1].toString();
    return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.o
 * JD-Core Version:    0.6.2
 */