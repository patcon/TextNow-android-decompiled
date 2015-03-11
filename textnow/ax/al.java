package textnow.ax;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.dn;
import com.tremorvideo.sdk.android.videoad.eb;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public final class al extends View
  implements SensorEventListener, ak, p
{
  long A = 0L;
  float B;
  float C;
  float D;
  long E = 0L;
  long F = 0L;
  float G;
  float H;
  int I;
  boolean J = true;
  aq K;
  x L;
  String M;
  boolean N = false;
  private int O = 0;
  private boolean P = true;
  private boolean Q = false;
  private boolean R = false;
  private ba S = null;
  boolean a = false;
  boolean b = false;
  aj c;
  Timer d;
  long e = SystemClock.elapsedRealtime();
  n f;
  am g;
  boolean h = false;
  boolean i = false;
  int j = 0;
  int k = 0;
  int l = 0;
  ArrayList<ba> m = new ArrayList(5);
  ai n;
  ai[] o;
  int[] p;
  long q = 0L;
  boolean r = false;
  int s = 0;
  int t = 0;
  int u = 0;
  int v = 0;
  ao w = null;
  int x = -1;
  long y = 0L;
  boolean z = false;

  public al(Context paramContext, x paramx, e parame, int paramInt, boolean paramBoolean, ai[] paramArrayOfai, ba paramba)
  {
    super(paramContext);
    this.I = paramInt;
    this.J = paramBoolean;
    int i1 = paramContext.getResources().getConfiguration().touchscreen;
    boolean bool = false;
    if (i1 == 1)
      bool = true;
    this.M = parame.h();
    this.o = paramArrayOfai;
    this.p = new int[paramArrayOfai.length];
    this.c = new aj(this, parame, paramContext, bool);
    this.f = new n(paramContext, this.c, parame);
    this.f.e = this;
    this.L = paramx;
    SensorManager localSensorManager = (SensorManager)paramContext.getSystemService("sensor");
    localSensorManager.registerListener(this, localSensorManager.getDefaultSensor(1), 2);
    setFocusableInTouchMode(true);
    this.S = paramba;
    this.d = new Timer();
    this.d.scheduleAtFixedRate(new TimerTask()
    {
      public final void run()
      {
        try
        {
          al.this.m();
          return;
        }
        catch (Exception localException)
        {
          r.a(localException);
        }
      }
    }
    , 10L, 10L);
  }

  private boolean a(ba paramba)
  {
    return this.m.contains(paramba);
  }

  private int b(ba paramba)
  {
    int i1 = 0;
    if (i1 < this.o.length)
      if (!this.o[i1].c().equals(paramba.d()));
    while (true)
    {
      if (i1 >= 0)
      {
        return this.p[i1];
        i1++;
        break;
      }
      return -1;
      i1 = -1;
    }
  }

  private int b(String paramString)
  {
    int i1 = 0;
    if (i1 < this.o.length)
      if (!this.o[i1].c().equals(paramString));
    while (true)
    {
      if (i1 >= 0)
      {
        return this.p[i1];
        i1++;
        break;
      }
      return -1;
      i1 = -1;
    }
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(Math.round(paramFloat3), Math.round(paramFloat4));
    localLayoutParams.leftMargin = Math.round(paramFloat1);
    localLayoutParams.topMargin = Math.round(paramFloat2);
    this.f.a(Math.round(paramFloat3), Math.round(paramFloat4));
    this.f.b.setLayoutParams(localLayoutParams);
  }

  public final void a(bc parambc)
  {
    for (ba localba : this.n.g())
      if ((!a(localba)) && (localba.a() == parambc))
      {
        this.m.add(localba);
        this.g.a(localba, b(localba));
      }
    if ((parambc == bc.al) && (this.c != null))
      this.c.a(ae.c);
  }

  public final void a(dn paramdn)
  {
    this.c.a(paramdn);
  }

  public final void a(final String paramString)
  {
    post(new Runnable()
    {
      public final void run()
      {
        al.this.g.a(paramString, -1);
      }
    });
  }

  public final void a(final ac paramac)
  {
    int i1 = -1;
    int i2 = 0;
    if (this.b)
      return;
    while (true)
    {
      int i11;
      final int i3;
      try
      {
        this.c.a(paramac);
        if ((paramac.c() == ad.u) && (!f()))
          break;
        if ((paramac.b() == ae.c) && (this.n != null) && (this.g != null))
        {
          ba[] arrayOfba = this.n.g();
          int i10 = arrayOfba.length;
          i11 = 0;
          if (i11 < i10)
          {
            ba localba = arrayOfba[i11];
            if ((a(localba)) || (localba.e() < this.f.g()))
              break label1013;
            this.m.add(localba);
            this.g.a(localba, b(localba));
            break label1013;
          }
        }
        if (paramac.c() == ad.b)
        {
          int i9 = ((Integer)paramac.e()).intValue();
          a(this.c.b().e().b(i9));
          i3 = i1;
          label190: if (this.g == null)
            break;
          post(new Runnable()
          {
            public final void run()
            {
              al.this.g.a(Integer.toString(paramac.a()), i3);
            }
          });
          return;
        }
      }
      catch (Exception localException)
      {
        r.a(localException);
        return;
      }
      if (paramac.c() == ad.c)
      {
        int[] arrayOfInt2 = (int[])paramac.e();
        a(this.c.b().e().b(arrayOfInt2[0]));
        this.c.b(arrayOfInt2[1]);
        i3 = i1;
      }
      else
      {
        label420: ai localai;
        if (ab.a(paramac.c()))
        {
          int i6 = paramac.c().ordinal() - ad.d.ordinal();
          int i7 = ((Integer)paramac.e()).intValue();
          this.w = this.c.b();
          this.y = this.c.i();
          this.x = i7;
          this.r = true;
          this.s = 0;
          this.t = 0;
          this.l = 0;
          int[] arrayOfInt1 = this.p;
          arrayOfInt1[i6] = (1 + arrayOfInt1[i6]);
          String str2 = "video-" + (i6 + 1);
          ai[] arrayOfai = this.o;
          int i8 = arrayOfai.length;
          if (i2 >= i8)
            break label1025;
          localai = arrayOfai[i2];
          if (!str2.equals(localai.c()))
            break label1019;
          label445: this.n = localai;
          this.q = -1L;
          this.m.clear();
          if (i6 > 0)
            this.P = false;
          if (this.Q == true)
          {
            post(new an(this, -1));
            label497: if (this.c != null)
              this.c.a(ae.b);
            ad localad = paramac.c();
            switch (5.a[localad.ordinal()])
            {
            default:
            case 1:
            case 2:
            case 3:
            case 4:
            }
          }
        }
        while (true)
        {
          i3 = b("video-" + i1);
          break label190;
          this.R = true;
          break label497;
          if (paramac.c() == ad.k)
          {
            post(new Runnable()
            {
              public final void run()
              {
                al.this.f.c();
              }
            });
            i3 = i1;
            break label190;
          }
          if (paramac.c() == ad.h)
          {
            if (this.f.n == null)
              break label1001;
            i3 = b(this.f.n.c());
            if (this.f.n.a != null)
              break label190;
            post(new Runnable()
            {
              public final void run()
              {
                al.this.f.e();
              }
            });
            break label190;
          }
          if (paramac.c() == ad.j)
          {
            if (this.f.n == null)
              break label1007;
            i3 = b(this.f.n.c());
            if (this.f.n.a == null)
              post(new Runnable()
              {
                public final void run()
                {
                  al.this.f.e();
                  al.this.f.b.setVisibility(4);
                }
              });
          }
          while (this.f.n != null)
          {
            break;
            if (paramac.c() == ad.i)
            {
              post(new Runnable()
              {
                public final void run()
                {
                  if ((al.this.f.o != null) && (al.this.f.o.a == null))
                    if (paramac.e() != null)
                      break label126;
                  label126: for (int i = 255; (al.this.n != null) && (al.this.n == al.this.f.o) && (i == al.this.f.q) && (i == al.this.f.p); i = ((Integer)paramac.e()).intValue())
                  {
                    al.this.f.h();
                    al.this.f.b.setVisibility(0);
                    return;
                  }
                  al.a(al.this, al.this.f.o, i, al.this.f.r);
                }
              });
              if (this.f.o == null)
                break label1001;
              i3 = b(this.f.o.c());
              break;
            }
            if (paramac.c() == ad.Q)
            {
              String str1 = (String)paramac.e();
              if (this.g == null)
                break label1051;
              this.g.a(Integer.toString(paramac.a()), bc.as, -1, str1);
              return;
            }
            if (paramac.c() == ad.l)
            {
              this.b = true;
              if (this.g == null)
                break label1001;
              am localam = this.g;
              localam.a(false);
              i3 = i1;
              break;
            }
            if (paramac.c() == ad.S)
            {
              this.c.b = false;
              int i5 = ((Integer)paramac.e()).intValue();
              this.c.b(i5);
              i3 = i1;
              break;
            }
            if (paramac.c() == ad.R)
            {
              this.c.b = true;
              int i4 = ((Integer)paramac.e()).intValue();
              this.c.b(i4);
            }
            label1001: i3 = i1;
            break;
            label1007: i3 = i1;
          }
          label1013: i11++;
          break;
          label1019: i2++;
          break label420;
          label1025: localai = null;
          break label445;
          i1 = 1;
          continue;
          i1 = 2;
          continue;
          i1 = 3;
          continue;
          i1 = 4;
        }
        label1051: i3 = i1;
      }
    }
  }

  public final void a(am paramam)
  {
    this.g = paramam;
  }

  public final void a(ao paramao)
  {
    this.c.a(paramao);
    this.K = paramao.d();
    this.H = 0.0F;
  }

  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.r = true;
      this.s = this.u;
      this.t = this.v;
    }
    this.c.j();
    r.d("rotate");
    this.f.a(0);
  }

  public final boolean a()
  {
    return !this.i;
  }

  public final void b()
  {
    if (!this.N);
    try
    {
      j();
      this.N = true;
      this.b = true;
      if (this.g != null)
      {
        am localam = this.g;
        localam.a(true);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (this.j > 0)
    {
      if (!paramBoolean)
        break label17;
      this.j = 1;
    }
    label17: 
    do
    {
      return;
      this.j = 0;
      this.h = false;
    }
    while (!this.i);
    this.i = false;
    this.f.h();
  }

  public final void c()
  {
    for (ba localba : this.n.g())
      if (!a(localba))
      {
        bc localbc = localba.a();
        if ((localbc == bc.ag) || (localbc == bc.ah) || (localbc == bc.ai) || (localbc == bc.aj) || (localbc == bc.ak) || (localbc == bc.al))
        {
          r.d("Current Video Time: " + this.l);
          this.m.add(localba);
          this.g.a(localba, b(localba));
        }
      }
  }

  public final int d()
  {
    return this.f.f();
  }

  public final int e()
  {
    return this.f.g();
  }

  public final boolean f()
  {
    if (!this.J);
    while (this.k < 1000 * this.I)
      return false;
    return true;
  }

  public final eb g()
  {
    if (this.g != null)
      return this.g.f();
    return eb.f;
  }

  protected final int getSuggestedMinimumHeight()
  {
    return 0;
  }

  protected final int getSuggestedMinimumWidth()
  {
    return 0;
  }

  public final aj h()
  {
    return this.c;
  }

  public final void i()
  {
    k();
  }

  public final void j()
  {
    ((SensorManager)getContext().getSystemService("sensor")).unregisterListener(this);
    this.b = true;
    this.d.cancel();
    n localn = this.f;
    ((Activity)localn.b.getContext()).runOnUiThread(new n.6(localn));
    this.c.a();
  }

  public final void k()
  {
    if (this.j == 0)
    {
      this.h = true;
      if (this.f.a())
      {
        this.i = true;
        this.f.d();
      }
    }
    this.j = (1 + this.j);
  }

  public final void l()
  {
    if (this.j > 0)
    {
      this.j = (-1 + this.j);
      if (this.j == 0)
      {
        this.h = false;
        if (this.i)
        {
          this.i = false;
          this.f.h();
        }
      }
    }
  }

  protected final void m()
  {
    int i1 = 1;
    long l1 = SystemClock.elapsedRealtime();
    long l2 = l1 - this.e;
    int i2;
    if ((!this.h) && (!this.f.b()))
    {
      i2 = i1;
      this.e = l1;
      this.k = ((int)(l2 + this.k));
      if (i2 != 0)
        this.c.a(l2);
      if ((this.P) && (i2 != 0))
        this.O = ((int)(l2 + this.O));
      if (this.f.a())
        this.l = ((int)(l2 + this.l));
      this.f.a(l2);
    }
    while (true)
    {
      int i5;
      try
      {
        if (!this.h)
        {
          boolean bool = this.b;
          if (!bool)
            continue;
        }
      }
      catch (Exception localException2)
      {
        try
        {
          if (this.S != null)
          {
            if ((this.n == null) || (this.n.d() <= 0) || (!this.f.d))
              continue;
            l3 = this.O + this.f.f();
            if (l3 > this.S.e())
            {
              this.m.add(this.S);
              this.g.a(this.S, -1);
              this.S = null;
            }
          }
          if ((this.r) && ((this.s != this.u) || (this.t != this.v)))
          {
            this.r = false;
            post(new Runnable()
            {
              public final void run()
              {
                if ((al.this.x != -1) && (al.this.w != null))
                {
                  if (al.this.x != 255)
                    break label53;
                  al.this.o();
                }
                while (true)
                {
                  al.this.f.a(0);
                  return;
                  label53: if (al.this.x == 254)
                  {
                    al.this.q();
                  }
                  else if (al.this.x == 253)
                  {
                    al.this.p();
                  }
                  else if (!al.this.c.n())
                  {
                    al.this.r = true;
                  }
                  else
                  {
                    at localat = al.this.w.a(al.this.x);
                    ah localah = al.this.c.a(localat, al.this.y);
                    al.this.a(localah.a, localah.b, localah.f, localah.g);
                  }
                }
              }
            });
          }
          if (i2 == 0);
        }
        catch (Exception localException2)
        {
          try
          {
            long l3;
            post(new Runnable()
            {
              public final void run()
              {
                n localn = al.this.f;
                if (localn.d)
                  localn.f();
                al.this.L.invalidate();
                al.this.invalidate();
              }
            });
            return;
            i2 = 0;
            break;
            if ((this.n != null) && (this.n.a != null))
              continue;
            if ((this.f.b.getVisibility() == 0) && (this.f.a()))
            {
              if ((i1 == 0) || (this.n == null) || (this.g == null) || (this.l == this.q))
                continue;
              ba[] arrayOfba = this.n.g();
              int i4 = arrayOfba.length;
              i5 = 0;
              if (i5 < i4)
              {
                ba localba = arrayOfba[i5];
                if (a(localba))
                  break label771;
                bc localbc = localba.a();
                if (localbc == bc.ag)
                {
                  this.m.add(localba);
                  this.g.a(localba, b(localba));
                  break label771;
                }
                if (localbc == bc.ah)
                {
                  this.m.add(localba);
                  this.g.a(localba, b(localba));
                  break label771;
                  localException1 = localException1;
                  r.a(localException1);
                  continue;
                }
                if (localbc == bc.ai)
                {
                  if (!this.f.b(1))
                    break label771;
                  this.m.add(localba);
                  this.g.a(localba, b(localba));
                  break label771;
                }
                if (localbc == bc.aj)
                {
                  if (!this.f.b(2))
                    break label771;
                  this.m.add(localba);
                  this.g.a(localba, b(localba));
                  break label771;
                }
                if (localbc == bc.ak)
                {
                  if (!this.f.b(3))
                    break label771;
                  this.m.add(localba);
                  this.g.a(localba, b(localba));
                  break label771;
                }
                if ((localbc == bc.al) || (this.q > localba.e()) || (this.l <= localba.e()))
                  break label771;
                this.m.add(localba);
                this.g.a(localba, b(localba));
                break label771;
              }
              this.q = this.l;
              continue;
              int i3 = this.O;
              l3 = i3;
              continue;
              localException2 = localException2;
              r.a(localException2);
            }
          }
          catch (Exception localException3)
          {
            r.a(localException3);
            return;
          }
        }
        i1 = 0;
        continue;
      }
      label771: i5++;
    }
  }

  public final View n()
  {
    return this.f.b;
  }

  public final void o()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(12);
    localLayoutParams.addRule(11);
    localLayoutParams.addRule(9);
    this.f.a(getWidth(), getHeight());
    this.f.b.setLayoutParams(localLayoutParams);
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  protected final void onAttachedToWindow()
  {
    this.Q = true;
    if (this.R == true)
    {
      this.R = false;
      post(new an(this, -1));
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.u = paramCanvas.getWidth();
    this.v = paramCanvas.getHeight();
    paramCanvas.save();
    paramCanvas.translate(getWidth() / 2, getHeight() / 2);
    try
    {
      this.c.a(paramCanvas);
      paramCanvas.restore();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 21)
      break label86;
    while (true)
    {
      try
      {
        this.c.e();
        label13: return super.onKeyDown(paramInt, paramKeyEvent);
        if (paramInt == 22)
        {
          this.c.f();
          continue;
        }
      }
      catch (Exception localException)
      {
        r.a(localException);
        continue;
        if (paramInt == 19)
        {
          this.c.g();
          continue;
        }
        if (paramInt != 20)
          break;
      }
      this.c.h();
    }
    while (true)
    {
      this.c.d();
      break label13;
      label86: if ((paramInt != 4) || (!f()))
        break label13;
      this.c.c();
      break label13;
      if (paramInt != 66)
        if (paramInt != 23)
          break;
    }
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    long l1;
    if (paramSensorEvent.sensor.getType() == 1)
    {
      l1 = System.currentTimeMillis();
      if (this.A != 0L)
        break label60;
      this.A = l1;
      this.B = paramSensorEvent.values[0];
      this.C = paramSensorEvent.values[1];
      this.D = paramSensorEvent.values[2];
    }
    label60: 
    while (l1 - this.A <= 100L)
      return;
    long l2 = l1 - this.A;
    this.A = l1;
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if (10000.0F * (Math.abs(f3 + (f1 + f2) - this.B - this.C - this.D) / (float)l2) > 800.0F)
    {
      this.E = (l2 + this.E);
      this.F = 0L;
      if (this.E > 300L)
      {
        if (!this.f.b())
          this.c.k();
        this.E = 0L;
      }
    }
    while (true)
    {
      this.B = f1;
      this.C = f2;
      this.D = f3;
      return;
      this.F = (l2 + this.F);
      if (this.F > 150L)
        this.E = 0L;
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    label104: 
    do
    {
      try
      {
        if (this.K != aq.a)
        {
          if (paramMotionEvent.getAction() != 0)
            break label104;
          this.G = paramMotionEvent.getX();
        }
        while (true)
        {
          if (this.f != null)
            this.f.a(paramMotionEvent);
          bool = this.f.b();
          if (paramMotionEvent.getAction() != 0)
            break label385;
          int i5 = Math.round(paramMotionEvent.getX()) - getWidth() / 2;
          int i6 = Math.round(paramMotionEvent.getY()) - getHeight() / 2;
          if (bool)
            break label505;
          this.c.a(i5, i6);
          return true;
          if (paramMotionEvent.getAction() != 1)
            break;
          if ((this.K.ordinal() >= aq.f.ordinal()) && (this.H > 0.1F))
          {
            this.K = aq.a;
            this.c.a(aq.a);
          }
        }
      }
      catch (Exception localException)
      {
        r.a(localException);
      }
      return super.onTouchEvent(paramMotionEvent);
    }
    while (paramMotionEvent.getAction() != 2);
    float f1 = paramMotionEvent.getX();
    float f2 = f1 - this.G;
    if ((this.K != aq.c) && (this.K != aq.g))
    {
      label216: if (this.K == aq.b)
        break label517;
      if (this.K == aq.f)
        break label517;
    }
    while (true)
    {
      label239: this.G = f1;
      if (f2 == 0.0F)
        break;
      this.H += 1.2F * (f2 / getWidth());
      this.H = Math.max(0.0F, Math.min(this.H, 1.0F));
      long l1 = Math.round((float)this.c.b().b() * this.H);
      this.c.b(l1);
      post(new Runnable()
      {
        public final void run()
        {
          al.this.invalidate();
        }
      });
      break;
      while (true)
        if ((this.K != aq.d) && (this.K != aq.h))
        {
          if ((this.K == aq.e) || (this.K == aq.i))
            break label239;
          f2 = 0.0F;
          break label239;
          label385: if (paramMotionEvent.getAction() == 2)
          {
            int i3 = Math.round(paramMotionEvent.getX()) - getWidth() / 2;
            int i4 = Math.round(paramMotionEvent.getY()) - getHeight() / 2;
            if (!bool)
            {
              this.c.b(i3, i4);
              return true;
            }
          }
          else
          {
            if ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
              break;
            int i1 = Math.round(paramMotionEvent.getX()) - getWidth() / 2;
            int i2 = Math.round(paramMotionEvent.getY()) - getHeight() / 2;
            if (!bool)
              this.c.c(i1, i2);
          }
          label505: return true;
          if (f2 > 0.0F)
            break label239;
          break label216;
          label517: if (f2 < 0.0F)
          {
            f2 = -f2;
            break label239;
          }
        }
      f2 = -f2;
    }
  }

  public final void p()
  {
    int i1 = this.n.a();
    int i2 = this.n.b();
    RelativeLayout localRelativeLayout = this.f.b;
    this.f.a.a();
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i1, i2);
    localLayoutParams.addRule(13);
    this.f.a(i1, i2);
    localRelativeLayout.setLayoutParams(localLayoutParams);
  }

  public final void q()
  {
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = this.n.a();
    int i4 = this.n.b();
    RelativeLayout localRelativeLayout = this.f.b;
    RelativeLayout.LayoutParams localLayoutParams;
    if (i1 < i2)
    {
      r.d("Set Height");
      int i6 = Math.round(i4 / i3 * i1);
      localLayoutParams = new RelativeLayout.LayoutParams(i1, i6);
      localLayoutParams.addRule(13);
      this.f.a(i1, i6);
    }
    while (true)
    {
      localRelativeLayout.setLayoutParams(localLayoutParams);
      localRelativeLayout.forceLayout();
      return;
      r.d("Set Width");
      int i5 = Math.round(i3 / i4 * i2);
      localLayoutParams = new RelativeLayout.LayoutParams(i5, i2);
      localLayoutParams.addRule(13);
      this.f.a(i5, i2);
    }
  }

  public final boolean r()
  {
    return this.c.l();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.al
 * JD-Core Version:    0.6.2
 */