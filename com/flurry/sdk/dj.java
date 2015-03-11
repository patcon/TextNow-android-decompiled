package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.flurry.android.impl.analytics.FlurryAnalyticsModule;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;

public class dj
  implements dm.b, dq.a
{
  static int a = 100;
  static int b = 10;
  static int c = 1000;
  static int d = 160000;
  static int e = 50;
  static int f = 20;
  private static final String g = dj.class.getSimpleName();
  private String A = "";
  private String B = "";
  private byte C = -1;
  private Location D;
  private boolean E;
  private String F;
  private byte G;
  private long H;
  private long I;
  private final Map<String, cx.a> J = new HashMap();
  private final List<db> K = new ArrayList();
  private boolean L;
  private int M;
  private final List<da> N = new ArrayList();
  private int O;
  private int P;
  private final cy Q = new cy();
  private Map<String, List<String>> R;
  private dm S;
  private int T;
  private boolean U = false;
  private final AtomicInteger h = new AtomicInteger(0);
  private final AtomicInteger i = new AtomicInteger(0);
  private final AtomicInteger j = new AtomicInteger(0);
  private final String k;
  private String l;
  private WeakReference<Context> m;
  private File n = null;
  private List<dh> o;
  private final Map<dr, ByteBuffer> p = new HashMap();
  private boolean q;
  private long r;
  private List<dh> s = new ArrayList();
  private AdvertisingIdClient.Info t;
  private byte[] u;
  private String v;
  private long w;
  private long x;
  private long y;
  private long z;

  public dj(String paramString)
  {
    eo.a(4, g, "Creating new Flurry session");
    this.k = paramString;
    this.m = new WeakReference(null);
  }

  private void A()
  {
    try
    {
      eo.a(3, g, "generating agent report");
      dc localdc = new dc(this.k, this.l, this.q, o(), this.r, this.w, this.s, p(), this.Q.a(false), a(), cx.a().b(), System.currentTimeMillis());
      this.o = new ArrayList(this.s);
      if (localdc.a() != null)
      {
        eo.a(3, g, "generated report of size " + localdc.a().length + " with " + this.s.size() + " reports.");
        a(localdc.a());
        this.s.removeAll(this.o);
        this.o = null;
        B();
        return;
      }
      eo.d(g, "Error generating report");
      return;
    }
    catch (Throwable localThrowable)
    {
      eo.a(6, g, "", localThrowable);
    }
  }

  private void B()
  {
    try
    {
      if (!fd.a(this.n))
        eo.d(g, "Error persisting report: could not create directory");
      while (true)
      {
        return;
        try
        {
          DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(this.n));
          dk localdk = new dk();
          localdk.a(this.q);
          localdk.a(this.r);
          localdk.a(this.s);
          localdk.a(localDataOutputStream, this.k, i());
        }
        catch (Exception localException)
        {
          eo.b(g, "Error saving persistent data", localException);
        }
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private void C()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: iconst_4
    //   5: getstatic 84	com/flurry/sdk/dj:g	Ljava/lang/String;
    //   8: new 213	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 214	java/lang/StringBuilder:<init>	()V
    //   15: ldc_w 296
    //   18: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_0
    //   22: getfield 114	com/flurry/sdk/dj:n	Ljava/io/File;
    //   25: invokevirtual 301	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   28: invokevirtual 220	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokestatic 152	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   37: aload_0
    //   38: getfield 114	com/flurry/sdk/dj:n	Ljava/io/File;
    //   41: invokevirtual 304	java/io/File:exists	()Z
    //   44: istore_3
    //   45: iload_3
    //   46: ifeq +181 -> 227
    //   49: new 306	java/io/FileInputStream
    //   52: dup
    //   53: aload_0
    //   54: getfield 114	com/flurry/sdk/dj:n	Ljava/io/File;
    //   57: invokespecial 307	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   60: astore 5
    //   62: new 309	java/io/DataInputStream
    //   65: dup
    //   66: aload 5
    //   68: invokespecial 312	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   71: astore 6
    //   73: new 274	com/flurry/sdk/dk
    //   76: dup
    //   77: invokespecial 275	com/flurry/sdk/dk:<init>	()V
    //   80: astore 7
    //   82: aload 7
    //   84: aload 6
    //   86: aload_0
    //   87: getfield 154	com/flurry/sdk/dj:k	Ljava/lang/String;
    //   90: invokevirtual 315	com/flurry/sdk/dk:a	(Ljava/io/DataInputStream;Ljava/lang/String;)Z
    //   93: pop
    //   94: aload_0
    //   95: aload 7
    //   97: invokevirtual 317	com/flurry/sdk/dk:a	()Z
    //   100: putfield 171	com/flurry/sdk/dj:q	Z
    //   103: aload_0
    //   104: aload 7
    //   106: invokevirtual 319	com/flurry/sdk/dk:c	()J
    //   109: putfield 176	com/flurry/sdk/dj:r	J
    //   112: aload_0
    //   113: aload 7
    //   115: invokevirtual 322	com/flurry/sdk/dk:b	()Ljava/util/List;
    //   118: putfield 124	com/flurry/sdk/dj:s	Ljava/util/List;
    //   121: iconst_1
    //   122: istore 4
    //   124: aload 6
    //   126: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   129: aload 5
    //   131: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   134: iload 4
    //   136: ifne +21 -> 157
    //   139: iconst_3
    //   140: getstatic 84	com/flurry/sdk/dj:g	Ljava/lang/String;
    //   143: ldc_w 329
    //   146: invokestatic 152	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   149: aload_0
    //   150: getfield 114	com/flurry/sdk/dj:n	Ljava/io/File;
    //   153: invokevirtual 332	java/io/File:delete	()Z
    //   156: pop
    //   157: iload 4
    //   159: ifne +16 -> 175
    //   162: aload_0
    //   163: iconst_0
    //   164: putfield 171	com/flurry/sdk/dj:q	Z
    //   167: aload_0
    //   168: aload_0
    //   169: getfield 178	com/flurry/sdk/dj:w	J
    //   172: putfield 176	com/flurry/sdk/dj:r	J
    //   175: aload_0
    //   176: monitorexit
    //   177: return
    //   178: astore 8
    //   180: aconst_null
    //   181: astore 6
    //   183: getstatic 84	com/flurry/sdk/dj:g	Ljava/lang/String;
    //   186: ldc_w 334
    //   189: aload 8
    //   191: invokestatic 294	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   194: aload 6
    //   196: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   199: aload_1
    //   200: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   203: iconst_0
    //   204: istore 4
    //   206: goto -72 -> 134
    //   209: aload 6
    //   211: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   214: aload 5
    //   216: invokestatic 327	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   219: aload 9
    //   221: athrow
    //   222: astore_2
    //   223: aload_0
    //   224: monitorexit
    //   225: aload_2
    //   226: athrow
    //   227: iconst_4
    //   228: getstatic 84	com/flurry/sdk/dj:g	Ljava/lang/String;
    //   231: ldc_w 336
    //   234: invokestatic 152	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   237: iconst_0
    //   238: istore 4
    //   240: goto -83 -> 157
    //   243: astore 9
    //   245: aconst_null
    //   246: astore 6
    //   248: goto -39 -> 209
    //   251: astore 9
    //   253: goto -44 -> 209
    //   256: astore 9
    //   258: aload_1
    //   259: astore 5
    //   261: goto -52 -> 209
    //   264: astore 8
    //   266: aload 5
    //   268: astore_1
    //   269: aconst_null
    //   270: astore 6
    //   272: goto -89 -> 183
    //   275: astore 8
    //   277: aload 5
    //   279: astore_1
    //   280: goto -97 -> 183
    //   283: astore 9
    //   285: aconst_null
    //   286: astore 6
    //   288: aconst_null
    //   289: astore 5
    //   291: goto -82 -> 209
    //
    // Exception table:
    //   from	to	target	type
    //   49	62	178	java/lang/Exception
    //   4	45	222	finally
    //   124	134	222	finally
    //   139	157	222	finally
    //   162	175	222	finally
    //   194	203	222	finally
    //   209	222	222	finally
    //   227	237	222	finally
    //   62	73	243	finally
    //   73	121	251	finally
    //   183	194	256	finally
    //   62	73	264	java/lang/Exception
    //   73	121	275	java/lang/Exception
    //   49	62	283	finally
  }

  private void D()
  {
    this.T = (1 + this.T);
  }

  private void E()
  {
    if (this.T > 0)
      this.T = (-1 + this.T);
  }

  private String F()
  {
    return ".flurryagent." + Integer.toString(this.k.hashCode(), 16);
  }

  private int G()
  {
    return this.h.incrementAndGet();
  }

  private int H()
  {
    return this.i.incrementAndGet();
  }

  private void a(long paramLong)
  {
    try
    {
      Iterator localIterator = this.K.iterator();
      while (localIterator.hasNext())
      {
        db localdb = (db)localIterator.next();
        if ((localdb.a()) && (!localdb.b()))
          localdb.a(paramLong);
      }
    }
    finally
    {
    }
  }

  private void a(dr paramdr, ByteBuffer paramByteBuffer)
  {
    synchronized (this.p)
    {
      this.p.put(paramdr, paramByteBuffer);
      return;
    }
  }

  private void a(byte[] paramArrayOfByte)
  {
    dd localdd = FlurryAnalyticsModule.getInstance().a();
    String str = "" + dn.a().b();
    localdd.b(paramArrayOfByte, this.k, str);
  }

  private Map<String, List<String>> d(Context paramContext)
  {
    boolean bool = paramContext instanceof Activity;
    Object localObject1 = null;
    if (bool)
    {
      Bundle localBundle = ((Activity)paramContext).getIntent().getExtras();
      localObject1 = null;
      if (localBundle != null)
      {
        eo.a(3, g, "Launch Options Bundle is present " + localBundle.toString());
        HashMap localHashMap = new HashMap();
        Iterator localIterator = localBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          if (str1 != null)
          {
            Object localObject2 = localBundle.get(str1);
            if (localObject2 != null);
            for (String str2 = localObject2.toString(); ; str2 = "null")
            {
              localHashMap.put(str1, new ArrayList(Arrays.asList(new String[] { str2 })));
              eo.a(3, g, "Launch options Key: " + str1 + ". Its value: " + str2);
              break;
            }
          }
        }
        localObject1 = localHashMap;
      }
    }
    return localObject1;
  }

  private void u()
  {
    dq localdq = dp.a();
    this.G = ((Byte)localdq.a("Gender")).byteValue();
    localdq.a("Gender", this);
    eo.a(4, g, "initSettings, Gender = " + this.G);
    this.F = ((String)localdq.a("UserId"));
    localdq.a("UserId", this);
    eo.a(4, g, "initSettings, UserId = " + this.F);
    this.E = ((Boolean)localdq.a("LogEvents")).booleanValue();
    localdq.a("LogEvents", this);
    eo.a(4, g, "initSettings, LogEvents = " + this.E);
    this.H = ((Long)localdq.a("Age")).longValue();
    localdq.a("Age", this);
    eo.a(4, g, "initSettings, BirthDate = " + this.H);
    this.I = ((Long)localdq.a("ContinueSessionMillis")).longValue();
    localdq.a("ContinueSessionMillis", this);
    eo.a(4, g, "initSettings, ContinueSessionMillis = " + this.I);
  }

  private void v()
  {
    try
    {
      if (this.v != null)
      {
        eo.a(3, g, "Fetched phone id");
        a(dr.a, ByteBuffer.wrap(this.v.getBytes()));
      }
      if (this.u != null)
      {
        eo.a(3, g, "Fetched hashed IMEI");
        a(dr.b, ByteBuffer.wrap(this.u));
      }
      if (this.t != null)
      {
        eo.a(3, g, "Fetched advertising id");
        a(dr.c, ByteBuffer.wrap(this.t.getId().getBytes()));
      }
      A();
      return;
    }
    catch (Throwable localThrowable)
    {
      eo.a(6, g, "", localThrowable);
    }
  }

  private void w()
  {
    a(new ff()
    {
      public void a()
      {
        dh localdh = dj.this.d();
        dj.c(dj.this).clear();
        dj.c(dj.this).add(localdh);
        dj.d(dj.this);
      }
    });
  }

  private void x()
  {
    a(new ff()
    {
      public void a()
      {
        dj.e(dj.this);
      }
    });
  }

  private void y()
  {
    while (true)
    {
      try
      {
        try
        {
          if (this.s.size() <= 0)
            break label45;
          i1 = 1;
          if (i1 != 0)
          {
            A();
            return;
          }
        }
        finally
        {
        }
      }
      catch (Throwable localThrowable)
      {
        eo.a(6, g, "", localThrowable);
      }
      return;
      label45: int i1 = 0;
    }
  }

  private void z()
  {
    a(new ff()
    {
      public void a()
      {
        dz.a().d();
      }
    });
  }

  Map<String, List<String>> a()
  {
    return this.R;
  }

  public void a(Context paramContext)
  {
    try
    {
      eo.a(4, g, "Initializing new Flurry session with context:" + paramContext);
      this.m = new WeakReference(paramContext);
      this.S = new dm(this);
      this.n = paramContext.getFileStreamPath(F());
      this.l = eb.a();
      this.y = -1L;
      this.O = 0;
      this.B = TimeZone.getDefault().getID();
      this.A = (Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
      this.L = true;
      this.M = 0;
      this.P = 0;
      this.R = d(paramContext);
      u();
      long l1 = SystemClock.elapsedRealtime();
      this.w = System.currentTimeMillis();
      this.x = l1;
      a(new ff()
      {
        public void a()
        {
          dj.a(dj.this, dw.a());
        }
      });
      a(new ff()
      {
        public void a()
        {
          dj.a(dj.this, dy.a());
        }
      });
      a(new ff()
      {
        public void a()
        {
          dj.a(dj.this, ea.a());
        }
      });
      a(new ff()
      {
        public void a()
        {
          dj.a(dj.this);
        }
      });
      a(new ff()
      {
        public void a()
        {
          dj.b(dj.this);
        }
      });
      ep.a().a(this, paramContext);
      this.U = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(ff paramff)
  {
    do.a().c(paramff);
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equals("Gender"))
    {
      this.G = ((Byte)paramObject).byteValue();
      eo.a(4, g, "onSettingUpdate, Gender = " + this.G);
      return;
    }
    if (paramString.equals("UserId"))
    {
      this.F = ((String)paramObject);
      eo.a(4, g, "onSettingUpdate, UserId = " + this.F);
      return;
    }
    if (paramString.equals("LogEvents"))
    {
      this.E = ((Boolean)paramObject).booleanValue();
      eo.a(4, g, "onSettingUpdate, LogEvents = " + this.E);
      return;
    }
    if (paramString.equals("Age"))
    {
      this.H = ((Long)paramObject).longValue();
      eo.a(4, g, "onSettingUpdate, Birthdate = " + this.H);
      return;
    }
    if (paramString.equals("ContinueSessionMillis"))
    {
      this.I = ((Long)paramObject).longValue();
      eo.a(4, g, "onSettingUpdate, ContinueSessionMillis = " + this.I);
      return;
    }
    eo.a(6, g, "onSettingUpdate internal error!");
  }

  public void a(String paramString1, String paramString2, String paramString3, Throwable paramThrowable)
  {
    if (paramString1 != null);
    while (true)
    {
      int i2;
      try
      {
        int i1;
        if ("uncaught".equals(paramString1))
        {
          i1 = 1;
          this.O = (1 + this.O);
          if (this.N.size() < e)
          {
            Long localLong2 = Long.valueOf(System.currentTimeMillis());
            da localda3 = new da(H(), localLong2.longValue(), paramString1, paramString2, paramString3, paramThrowable);
            this.N.add(localda3);
            eo.d(g, "Error logged: " + localda3.c());
          }
        }
        else
        {
          i1 = 0;
          continue;
        }
        if (i1 == 0)
          break label247;
        i2 = 0;
        if (i2 >= this.N.size())
          continue;
        da localda1 = (da)this.N.get(i2);
        if ((localda1.c() != null) && (!"uncaught".equals(localda1.c())))
        {
          Long localLong1 = Long.valueOf(System.currentTimeMillis());
          da localda2 = new da(H(), localLong1.longValue(), paramString1, paramString2, paramString3, paramThrowable);
          this.N.set(i2, localda2);
          continue;
        }
      }
      finally
      {
      }
      i2++;
      continue;
      label247: eo.d(g, "Max errors logged. No more errors logged.");
    }
  }

  public void a(String paramString, Map<String, String> paramMap)
  {
    while (true)
    {
      db localdb;
      HashMap localHashMap;
      try
      {
        Iterator localIterator = this.K.iterator();
        int i1;
        if (localIterator.hasNext())
        {
          localdb = (db)localIterator.next();
          if (!localdb.a(paramString))
            continue;
          long l1 = SystemClock.elapsedRealtime() - this.x;
          if ((paramMap != null) && (paramMap.size() > 0) && (this.M < d))
          {
            i1 = this.M - localdb.d();
            localHashMap = new HashMap(localdb.c());
            localdb.a(paramMap);
            if (i1 + localdb.d() > d)
              break label211;
            if (localdb.c().size() <= b)
              continue;
            eo.d(g, "MaxEventParams exceeded on endEvent: " + localdb.c().size());
            localdb.b(localHashMap);
          }
          localdb.a(l1);
        }
        return;
        this.M = (i1 + localdb.d());
        continue;
      }
      finally
      {
      }
      label211: localdb.b(localHashMap);
      this.L = false;
      this.M = d;
      eo.d(g, "Event Log size exceeded. No more event details logged.");
    }
  }

  public void a(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    while (true)
    {
      long l1;
      String str;
      cx.a locala1;
      Object localObject2;
      try
      {
        l1 = SystemClock.elapsedRealtime() - this.x;
        str = fe.a(paramString);
        int i1 = str.length();
        if (i1 == 0)
          return;
        locala1 = (cx.a)this.J.get(str);
        if (locala1 != null)
          break label251;
        if (this.J.size() < a)
        {
          cx.a locala2 = new cx.a();
          locala2.a = 1;
          this.J.put(str, locala2);
          eo.d(g, "Event count started: " + str);
          if ((!this.E) || (this.K.size() >= c) || (this.M >= d))
            break label382;
          if (paramMap != null)
            break label390;
          localObject2 = Collections.emptyMap();
          if (((Map)localObject2).size() <= b)
            break label293;
          eo.d(g, "MaxEventParams exceeded: " + ((Map)localObject2).size());
          continue;
        }
      }
      finally
      {
      }
      eo.d(g, "Too many different events. Event not counted: " + str);
      continue;
      label251: locala1.a = (1 + locala1.a);
      eo.d(g, "Event count incremented: " + str);
      continue;
      label293: db localdb = new db(G(), str, (Map)localObject2, l1, paramBoolean);
      if (localdb.d() + this.M <= d)
      {
        this.K.add(localdb);
        this.M += localdb.d();
      }
      else
      {
        this.M = d;
        this.L = false;
        eo.d(g, "Event Log size exceeded. No more event details logged.");
        continue;
        label382: this.L = false;
        continue;
        label390: localObject2 = paramMap;
      }
    }
  }

  public void b()
  {
    this.q = true;
  }

  public void b(Context paramContext)
  {
    try
    {
      boolean bool = this.U;
      if (!bool);
      while (true)
      {
        return;
        eo.d(g, "Start session with context: " + paramContext + " count:" + g());
        this.m = new WeakReference(paramContext);
        if (this.S.b())
          this.S.a();
        D();
        dz.a().c();
        this.D = dz.a().f();
        ep.a().b(this, paramContext);
      }
    }
    finally
    {
    }
  }

  public void c()
  {
    try
    {
      boolean bool = this.U;
      if (!bool);
      while (true)
      {
        return;
        eo.d(g, "Finalize session");
        if (this.S.b())
          this.S.a();
        if (g() != 0)
          eo.a(6, g, "Session with apiKey = " + j() + " was ended while getSessionCount() is not 0");
        this.T = 0;
        x();
        ep.a().a(this);
        a(new ff()
        {
          public void a()
          {
            dl.a().a(dj.this.j());
          }
        });
        dp.a().b("Gender", this);
        dp.a().b("UserId", this);
        dp.a().b("Age", this);
        dp.a().b("LogEvents", this);
        dp.a().b("ContinueSessionMillis", this);
      }
    }
    finally
    {
    }
  }

  public void c(Context paramContext)
  {
    try
    {
      boolean bool = this.U;
      if (!bool);
      while (true)
      {
        return;
        ep.a().c(this, paramContext);
        this.D = dz.a().f();
        z();
        E();
        eo.d(g, "End session with context: " + paramContext + " count:" + g());
        this.y = (SystemClock.elapsedRealtime() - this.x);
        a(this.y);
        w();
        if (g() == 0)
          this.S.a(this.I);
      }
    }
    finally
    {
    }
  }

  dh d()
  {
    try
    {
      di localdi = new di();
      localdi.a(this.l);
      localdi.a(this.w);
      localdi.b(this.y);
      localdi.c(this.z);
      localdi.b(k());
      localdi.c(l());
      localdi.a(this.C);
      localdi.d(h());
      localdi.a(this.D);
      localdi.b(f());
      localdi.a(this.G);
      localdi.a(Long.valueOf(this.H));
      localdi.a(t());
      localdi.a(r());
      localdi.a(this.L);
      localdi.b(s());
      localdi.c(this.O);
      try
      {
        localdh = new dh(localdi);
        if (localdh == null)
          eo.d(g, "New session report wasn't created");
        return localdh;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          localIOException.printStackTrace();
          dh localdh = null;
        }
      }
    }
    finally
    {
    }
  }

  public void e()
  {
    try
    {
      this.P = (1 + this.P);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  int f()
  {
    return this.P;
  }

  int g()
  {
    return this.T;
  }

  String h()
  {
    if (this.F == null)
      return "";
    return this.F;
  }

  public String i()
  {
    return this.v;
  }

  public String j()
  {
    return this.k;
  }

  public String k()
  {
    return this.A;
  }

  public String l()
  {
    return this.B;
  }

  public long m()
  {
    return this.w;
  }

  public long n()
  {
    return this.x;
  }

  public boolean o()
  {
    return (this.t == null) || (!this.t.isLimitAdTrackingEnabled());
  }

  public Map<dr, ByteBuffer> p()
  {
    return new HashMap(this.p);
  }

  public void q()
  {
    c();
  }

  List<db> r()
  {
    return this.K;
  }

  List<da> s()
  {
    return this.N;
  }

  Map<String, cx.a> t()
  {
    return this.J;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dj
 * JD-Core Version:    0.6.2
 */