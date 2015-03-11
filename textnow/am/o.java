package textnow.am;

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
  private static ThreadLocal<p> h = new ThreadLocal();
  private static final ThreadLocal<ArrayList<o>> i = new ThreadLocal()
  {
  };
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
  private static final Interpolator n = new AccelerateDecelerateInterpolator();
  private static final n o = new e();
  private static final n p = new c();
  private static long z = 10L;
  private int A = 0;
  private int B = 1;
  private Interpolator C = n;
  private ArrayList<q> D = null;
  long b;
  long c = -1L;
  int d = 0;
  boolean e = false;
  k[] f;
  HashMap<String, k> g;
  private boolean q = false;
  private int r = 0;
  private float s = 0.0F;
  private boolean t = false;
  private long u;
  private boolean v = false;
  private boolean w = false;
  private long x = 300L;
  private long y = 0L;

  public static o a(float[] paramArrayOfFloat)
  {
    o localo = new o();
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
      return localo;
    if ((localo.f == null) || (localo.f.length == 0))
    {
      k[] arrayOfk = new k[1];
      arrayOfk[0] = k.a("", paramArrayOfFloat);
      localo.a(arrayOfk);
    }
    while (true)
    {
      localo.e = false;
      return localo;
      localo.f[0].a(paramArrayOfFloat);
    }
  }

  public static o a(int[] paramArrayOfInt)
  {
    o localo = new o();
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      return localo;
    if ((localo.f == null) || (localo.f.length == 0))
    {
      k[] arrayOfk = new k[1];
      arrayOfk[0] = k.a("", paramArrayOfInt);
      localo.a(arrayOfk);
    }
    while (true)
    {
      localo.e = false;
      return localo;
      localo.f[0].a(paramArrayOfInt);
    }
  }

  private void a(k[] paramArrayOfk)
  {
    int i1 = paramArrayOfk.length;
    this.f = paramArrayOfk;
    this.g = new HashMap(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      k localk = paramArrayOfk[i2];
      this.g.put(localk.c(), localk);
    }
    this.e = false;
  }

  private void d(long paramLong)
  {
    l();
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    if (this.d != 1)
    {
      this.c = paramLong;
      this.d = 2;
    }
    this.b = (l1 - paramLong);
    c(l1);
  }

  private void l()
  {
    if (!this.e)
    {
      int i1 = this.f.length;
      for (int i2 = 0; i2 < i1; i2++)
        this.f[i2].b();
      this.e = true;
    }
  }

  private void m()
  {
    ((ArrayList)i.get()).remove(this);
    ((ArrayList)j.get()).remove(this);
    ((ArrayList)k.get()).remove(this);
    this.d = 0;
    if ((this.v) && (this.a != null))
    {
      ArrayList localArrayList = (ArrayList)this.a.clone();
      int i1 = localArrayList.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((b)localArrayList.get(i2)).b(this);
    }
    this.v = false;
    this.w = false;
  }

  private o n()
  {
    int i1 = 0;
    o localo = (o)super.c();
    if (this.D != null)
    {
      ArrayList localArrayList = this.D;
      localo.D = new ArrayList();
      int i3 = localArrayList.size();
      for (int i4 = 0; i4 < i3; i4++)
        localo.D.add(localArrayList.get(i4));
    }
    localo.c = -1L;
    localo.q = false;
    localo.r = 0;
    localo.e = false;
    localo.d = 0;
    localo.t = false;
    k[] arrayOfk = this.f;
    if (arrayOfk != null)
    {
      int i2 = arrayOfk.length;
      localo.f = new k[i2];
      localo.g = new HashMap(i2);
      while (i1 < i2)
      {
        k localk = arrayOfk[i1].a();
        localo.f[i1] = localk;
        localo.g.put(localk.c(), localk);
        i1++;
      }
    }
    return localo;
  }

  public final o a(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.x = paramLong;
    return this;
  }

  public final void a()
  {
    if (Looper.myLooper() == null)
      throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    this.q = false;
    this.r = 0;
    this.d = 0;
    this.w = true;
    this.t = false;
    ((ArrayList)j.get()).add(this);
    if (this.y == 0L)
    {
      if ((!this.e) || (this.d == 0));
      for (long l1 = 0L; ; l1 = AnimationUtils.currentAnimationTimeMillis() - this.b)
      {
        d(l1);
        this.d = 0;
        this.v = true;
        if (this.a == null)
          break;
        ArrayList localArrayList = (ArrayList)this.a.clone();
        int i1 = localArrayList.size();
        for (int i2 = 0; i2 < i1; i2++)
          ((b)localArrayList.get(i2)).a(this);
      }
    }
    p localp = (p)h.get();
    if (localp == null)
    {
      localp = new p((byte)0);
      h.set(localp);
    }
    localp.sendEmptyMessage(0);
  }

  public final void a(Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
    {
      this.C = paramInterpolator;
      return;
    }
    this.C = new LinearInterpolator();
  }

  public final void a(q paramq)
  {
    if (this.D == null)
      this.D = new ArrayList();
    this.D.add(paramq);
  }

  public final void b()
  {
    if ((this.d != 0) || (((ArrayList)j.get()).contains(this)) || (((ArrayList)k.get()).contains(this)))
    {
      if ((this.v) && (this.a != null))
      {
        Iterator localIterator = ((ArrayList)this.a.clone()).iterator();
        while (localIterator.hasNext())
          ((b)localIterator.next()).c(this);
      }
      m();
    }
  }

  public final void b(long paramLong)
  {
    this.y = paramLong;
  }

  final boolean c(long paramLong)
  {
    int i1 = 1;
    int i2 = 0;
    if (this.d == 0)
    {
      this.d = i1;
      if (this.c >= 0L)
        break label60;
      this.b = paramLong;
    }
    while (true)
      switch (this.d)
      {
      default:
        i1 = 0;
        return i1;
        label60: this.b = (paramLong - this.c);
        this.c = -1L;
      case 1:
      case 2:
      }
    float f1;
    if (this.x > 0L)
      f1 = (float)(paramLong - this.b) / (float)this.x;
    boolean bool;
    float f2;
    while (true)
      if (f1 >= 1.0F)
        if ((this.r < this.A) || (this.A == -1))
        {
          if (this.a != null)
          {
            int i6 = this.a.size();
            int i7 = 0;
            while (true)
              if (i7 < i6)
              {
                ((b)this.a.get(i7)).d(this);
                i7++;
                continue;
                f1 = 1.0F;
                break;
              }
          }
          if (this.B == 2)
          {
            if (this.q)
            {
              bool = false;
              this.q = bool;
            }
          }
          else
          {
            this.r += (int)f1;
            f2 = f1 % 1.0F;
            this.b += this.x;
            i1 = 0;
          }
        }
    while (true)
    {
      label243: if (this.q)
        f2 = 1.0F - f2;
      float f3 = this.C.getInterpolation(f2);
      this.s = f3;
      int i3 = this.f.length;
      int i4 = 0;
      while (true)
        if (i4 < i3)
        {
          this.f[i4].a(f3);
          i4++;
          continue;
          bool = i1;
          break;
          f2 = Math.min(f1, 1.0F);
          break label243;
        }
      if (this.D == null)
        break;
      int i5 = this.D.size();
      while (i2 < i5)
      {
        ((q)this.D.get(i2)).a(this);
        i2++;
      }
      break;
      f2 = f1;
      i1 = 0;
    }
  }

  public final Object d()
  {
    if ((this.f != null) && (this.f.length > 0))
      return this.f[0].d();
    return null;
  }

  public final float e()
  {
    return this.s;
  }

  public final String toString()
  {
    String str = "ValueAnimator@" + Integer.toHexString(hashCode());
    if (this.f != null)
      for (int i1 = 0; i1 < this.f.length; i1++)
        str = str + "\n    " + this.f[i1].toString();
    return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.o
 * JD-Core Version:    0.6.2
 */