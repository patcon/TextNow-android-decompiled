package com.admarvel.android.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.admarvel.android.ads.d;
import java.lang.ref.WeakReference;
import java.util.List;

public class e
{
  private static e m = null;
  private int a = 1000;
  private float b = 2.0F;
  private Sensor c;
  private Sensor d;
  private SensorManager e;
  private WeakReference<d> f;
  private Boolean g;
  private boolean h = false;
  private String i = null;
  private String j = null;
  private String k = null;
  private boolean l = false;
  private SensorEventListener n = new SensorEventListener()
  {
    final float a = 0.8F;
    private long c = 0L;
    private long d = 0L;
    private long e = 0L;
    private long f = 0L;
    private float g = 0.0F;
    private float[] h;
    private float[] i;
    private float[] j;
    private final float[] k = { 0.0F, 0.0F, 0.0F };
    private final float[] l = { 0.0F, 0.0F, 0.0F };
    private final float[] m = { 0.0F, 0.0F, 0.0F };

    public void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
    {
    }

    public void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
    {
      this.c = System.currentTimeMillis();
      if (paramAnonymousSensorEvent.sensor.getType() == 1)
        this.h = ((float[])paramAnonymousSensorEvent.values.clone());
      if (paramAnonymousSensorEvent.sensor.getType() == 2)
        this.j = ((float[])paramAnonymousSensorEvent.values.clone());
      if ((this.h != null) && (this.j != null))
      {
        float[] arrayOfFloat1 = new float[9];
        if (SensorManager.getRotationMatrix(arrayOfFloat1, new float[9], this.h, this.j))
        {
          float[] arrayOfFloat2 = new float[3];
          SensorManager.getOrientation(arrayOfFloat1, arrayOfFloat2);
          float f1 = (float)Math.round(2.0D * Math.toDegrees(arrayOfFloat2[0])) / 2.0F;
          if (f1 < 0.0D)
            f1 += 360.0F;
          e.a(e.this, f1);
        }
      }
      if (this.h != null)
      {
        if (this.e != 0L)
          break label195;
        this.e = this.c;
        this.f = this.c;
        this.i = ((float[])this.h.clone());
      }
      label195: 
      do
      {
        return;
        this.d = (this.c - this.e);
      }
      while (this.d <= 0L);
      if (this.c - this.f >= e.a(e.this))
      {
        this.g = (100.0F * (Math.abs(this.h[0] + this.h[1] + this.h[2] - this.i[0] - this.i[1] - this.i[2]) / (float)(this.c - this.f)));
        this.f = this.c;
        if (this.g > e.b(e.this))
          e.b(e.this, this.g);
      }
      this.m[0] = (0.8F * this.m[0] + 0.2F * this.h[0]);
      this.m[1] = (0.8F * this.m[1] + 0.2F * this.h[1]);
      this.m[2] = (0.8F * this.m[2] + 0.2F * this.h[2]);
      this.k[0] = (this.h[0] - this.m[0]);
      this.k[1] = (this.h[1] - this.m[1]);
      this.k[2] = (this.h[2] - this.m[2]);
      this.l[0] = (this.h[0] - this.i[0]);
      this.l[1] = (this.h[1] - this.i[1]);
      this.l[2] = (this.h[2] - this.i[2]);
      e.a(e.this, this.h[0], this.h[1], this.h[2], this.k[0], this.k[1], this.k[2], this.l[0], this.l[1], this.l[2]);
      this.i = ((float[])this.h.clone());
      this.e = this.c;
    }
  };

  public static e a()
  {
    if (m == null)
      m = new e();
    return m;
  }

  private void a(float paramFloat)
  {
    d locald = (d)this.f.get();
    if ((locald != null) && (this.i != null))
      locald.e(this.i + "()");
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    d locald = (d)this.f.get();
    if ((locald != null) && (this.j != null))
      locald.e(this.j + "(" + paramFloat1 + "," + paramFloat2 + "," + paramFloat3 + "," + paramFloat4 + "," + paramFloat5 + "," + paramFloat6 + "," + paramFloat7 + "," + paramFloat8 + "," + paramFloat9 + ")");
  }

  private void b(float paramFloat)
  {
    d locald = (d)this.f.get();
    if ((locald != null) && (this.k != null))
      locald.e(this.k + "(" + paramFloat + ")");
  }

  private void d()
  {
    this.i = null;
    this.j = null;
    this.k = null;
  }

  public void a(Context paramContext, d paramd)
  {
    this.f = new WeakReference(paramd);
    if (!this.h)
    {
      this.e = ((SensorManager)paramContext.getSystemService("sensor"));
      this.c = this.e.getDefaultSensor(1);
      this.d = this.e.getDefaultSensor(2);
      this.h = this.e.registerListener(this.n, this.c, 3);
    }
    if (this.l)
    {
      this.e.registerListener(this.n, this.d, 3);
      this.l = false;
    }
  }

  public void a(String paramString)
  {
    if (paramString != null)
      this.i = paramString;
  }

  public void a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
      this.b = new Float(paramString1).floatValue();
    if (paramString2 != null)
      this.a = (1000 * Integer.parseInt(paramString2));
  }

  public boolean a(Context paramContext)
  {
    boolean bool;
    if (this.g == null)
    {
      if (paramContext == null)
        break label67;
      this.e = ((SensorManager)paramContext.getSystemService("sensor"));
      if (this.e.getSensorList(1).size() <= 0)
        break label62;
      bool = true;
    }
    label62: label67: for (this.g = new Boolean(bool); ; this.g = Boolean.FALSE)
    {
      return this.g.booleanValue();
      bool = false;
      break;
    }
  }

  public void b(String paramString)
  {
    if (paramString != null)
      this.j = paramString;
  }

  public boolean b()
  {
    return this.h;
  }

  public boolean b(Context paramContext)
  {
    boolean bool;
    if (this.g == null)
    {
      if (paramContext == null)
        break label67;
      this.e = ((SensorManager)paramContext.getSystemService("sensor"));
      if (this.e.getSensorList(2).size() <= 0)
        break label62;
      bool = true;
    }
    label62: label67: for (this.g = new Boolean(bool); ; this.g = Boolean.FALSE)
    {
      return this.g.booleanValue();
      bool = false;
      break;
    }
  }

  public void c()
  {
    this.h = false;
    try
    {
      if ((this.e != null) && (this.n != null))
        this.e.unregisterListener(this.n);
      label30: d();
      return;
    }
    catch (Exception localException)
    {
      break label30;
    }
  }

  public void c(String paramString)
  {
    if (paramString != null)
    {
      this.l = true;
      this.k = paramString;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.e
 * JD-Core Version:    0.6.2
 */