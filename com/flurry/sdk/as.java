package com.flurry.sdk;

import java.io.OutputStream;
import java.util.List;
import java.util.Locale;

public abstract class as
{
  private static final String a = as.class.getSimpleName();
  private as.a b;
  private String c;
  private long d = 9223372036854775807L;
  private int e = 2147483647;
  private aw f;
  private long g;
  private boolean h;
  private int i;
  private long j = 102400L;
  private int k;
  private boolean l;
  private boolean m;

  private long a(en paramen)
  {
    List localList = paramen.b("Content-Length");
    if ((localList != null) && (!localList.isEmpty()))
      try
      {
        long l1 = Long.parseLong((String)localList.get(0));
        return l1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        eo.a(3, a, "Downloader: could not determine content length for url: " + this.c);
      }
    return -1L;
  }

  private String a(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    return String.format(localLocale, "%s__%03d", arrayOfObject);
  }

  private String b(int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "bytes";
    arrayOfObject[1] = Long.valueOf(paramInt * this.j);
    arrayOfObject[2] = Long.valueOf(Math.min(this.g, (paramInt + 1) * this.j) - 1L);
    return String.format("%s=%d-%d", arrayOfObject);
  }

  private void j()
  {
    if (b())
      return;
    eo.a(3, a, "Downloader: Requesting file from url: " + this.c);
    en localen = new en();
    localen.a(this.c);
    localen.a(en.a.b);
    localen.a(this.e);
    localen.a(new en.b()
    {
      public void a(en paramAnonymousen)
      {
        if (as.this.b())
          return;
        int i = paramAnonymousen.e();
        eo.a(3, as.i(), "Downloader: Download status code is:" + i + " for url: " + as.f(as.this));
        as.a(as.this, paramAnonymousen.c());
        do.a().c(new ff()
        {
          public void a()
          {
            if (!as.g(as.this))
              as.this.h();
            as.h(as.this);
          }
        });
      }

      // ERROR //
      public void a(en paramAnonymousen, java.io.InputStream paramAnonymousInputStream)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   4: invokevirtual 22	com/flurry/sdk/as:b	()Z
        //   7: ifeq +13 -> 20
        //   10: new 80	java/io/IOException
        //   13: dup
        //   14: ldc 82
        //   16: invokespecial 85	java/io/IOException:<init>	(Ljava/lang/String;)V
        //   19: athrow
        //   20: aload_0
        //   21: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   24: aload_0
        //   25: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   28: aload_1
        //   29: invokestatic 88	com/flurry/sdk/as:a	(Lcom/flurry/sdk/as;Lcom/flurry/sdk/en;)J
        //   32: invokestatic 91	com/flurry/sdk/as:a	(Lcom/flurry/sdk/as;J)J
        //   35: pop2
        //   36: aload_0
        //   37: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   40: invokestatic 95	com/flurry/sdk/as:d	(Lcom/flurry/sdk/as;)J
        //   43: aload_0
        //   44: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   47: invokestatic 97	com/flurry/sdk/as:e	(Lcom/flurry/sdk/as;)J
        //   50: lcmp
        //   51: ifle +51 -> 102
        //   54: new 80	java/io/IOException
        //   57: dup
        //   58: new 34	java/lang/StringBuilder
        //   61: dup
        //   62: invokespecial 35	java/lang/StringBuilder:<init>	()V
        //   65: ldc 99
        //   67: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   70: aload_0
        //   71: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   74: invokestatic 95	com/flurry/sdk/as:d	(Lcom/flurry/sdk/as;)J
        //   77: invokevirtual 102	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   80: ldc 104
        //   82: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   85: aload_0
        //   86: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   89: invokestatic 97	com/flurry/sdk/as:e	(Lcom/flurry/sdk/as;)J
        //   92: invokevirtual 102	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   95: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   98: invokespecial 85	java/io/IOException:<init>	(Ljava/lang/String;)V
        //   101: athrow
        //   102: new 106	com/flurry/sdk/az
        //   105: dup
        //   106: aload_2
        //   107: aload_0
        //   108: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   111: invokestatic 97	com/flurry/sdk/as:e	(Lcom/flurry/sdk/as;)J
        //   114: invokespecial 109	com/flurry/sdk/az:<init>	(Ljava/io/InputStream;J)V
        //   117: astore 5
        //   119: aload 5
        //   121: aload_0
        //   122: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   125: invokevirtual 112	com/flurry/sdk/as:f	()Ljava/io/OutputStream;
        //   128: invokestatic 117	com/flurry/sdk/fe:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
        //   131: pop2
        //   132: aload_0
        //   133: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   136: invokevirtual 120	com/flurry/sdk/as:g	()V
        //   139: aload 5
        //   141: invokestatic 123	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
        //   144: return
        //   145: astore 6
        //   147: aconst_null
        //   148: astore 5
        //   150: aload_0
        //   151: getfield 15	com/flurry/sdk/as$2:a	Lcom/flurry/sdk/as;
        //   154: invokevirtual 120	com/flurry/sdk/as:g	()V
        //   157: aload 5
        //   159: invokestatic 123	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
        //   162: aload 6
        //   164: athrow
        //   165: astore 6
        //   167: goto -17 -> 150
        //
        // Exception table:
        //   from	to	target	type
        //   102	119	145	finally
        //   119	132	165	finally
      }
    });
    em.a().a(this, localen);
  }

  private void k()
  {
    if (b())
      return;
    el localel = new el();
    localel.a(this.c);
    localel.a(en.a.f);
    localel.a(new el.a()
    {
      public void a(el<Void, Void> paramAnonymousel, Void paramAnonymousVoid)
      {
        if (as.this.b())
          return;
        int i = paramAnonymousel.e();
        eo.a(3, as.i(), "Downloader: HTTP HEAD status code is:" + i + " for url: " + as.f(as.this));
        if (paramAnonymousel.c())
        {
          as.a(as.this, as.a(as.this, paramAnonymousel));
          List localList = paramAnonymousel.b("Accept-Ranges");
          int j;
          if ((as.d(as.this) > 0L) && (localList != null) && (!localList.isEmpty()))
          {
            as.b(as.this, "bytes".equals(((String)localList.get(0)).trim()));
            as localas = as.this;
            long l = as.d(as.this) / as.i(as.this);
            if (as.d(as.this) % as.i(as.this) > 0L)
            {
              j = 1;
              as.a(localas, (int)(l + j));
            }
          }
          while (true)
          {
            if ((as.e(as.this) <= 0L) || (as.d(as.this) <= as.e(as.this)))
              break label316;
            eo.a(3, as.i(), "Downloader: Size limit exceeded -- limit: " + as.e(as.this) + ", content-length: " + as.d(as.this) + " bytes!");
            do.a().c(new ff()
            {
              public void a()
              {
                as.h(as.this);
              }
            });
            return;
            j = 0;
            break;
            as.a(as.this, 1);
          }
          label316: do.a().c(new ff()
          {
            public void a()
            {
              as.j(as.this);
            }
          });
          return;
        }
        do.a().c(new ff()
        {
          public void a()
          {
            as.h(as.this);
          }
        });
      }
    });
    eo.a(3, a, "Downloader: requesting HTTP HEAD for url: " + this.c);
    em.a().a(this, localel);
  }

  private void l()
  {
    if (b())
      return;
    if (q())
    {
      for (int n = 0; n < this.i; n++)
        this.f.d(a(n));
      m();
      return;
    }
    j();
  }

  private void m()
  {
    while (this.k < this.i)
    {
      if (b())
        return;
      final String str1 = a(this.k);
      final String str2 = b(this.k);
      if (this.f.d(str1))
      {
        eo.a(3, a, "Downloader: Skipping chunk with range:" + str2 + " for url: " + this.c + " chunk: " + this.k);
        this.k = (1 + this.k);
      }
      else
      {
        eo.a(3, a, "Downloader: Requesting chunk with range:" + str2 + " for url: " + this.c + " chunk: " + this.k);
        en localen = new en();
        localen.a(this.c);
        localen.a(en.a.b);
        localen.a(this.e);
        localen.a("Range", str2);
        localen.a(new en.b()
        {
          public void a(en paramAnonymousen)
          {
            if (as.this.b())
              return;
            int i = paramAnonymousen.e();
            eo.a(3, as.i(), "Downloader: Download status code is:" + i + " for url: " + as.f(as.this) + " chunk: " + as.l(as.this));
            List localList = paramAnonymousen.b("Content-Range");
            String str = null;
            if (localList != null)
            {
              boolean bool = localList.isEmpty();
              str = null;
              if (!bool)
              {
                str = (String)localList.get(0);
                eo.a(3, as.i(), "Downloader: Content range is:" + str + " for url: " + as.f(as.this) + " chunk: " + as.l(as.this));
              }
            }
            if ((paramAnonymousen.c()) && (i == 206) && (str != null) && (str.startsWith(str2.replaceAll("=", " "))))
            {
              as.m(as.this);
              do.a().c(new ff()
              {
                public void a()
                {
                  as.n(as.this);
                }
              });
              return;
            }
            do.a().c(new ff()
            {
              public void a()
              {
                as.h(as.this);
              }
            });
          }

          // ERROR //
          public void a(en paramAnonymousen, java.io.InputStream paramAnonymousInputStream)
          {
            // Byte code:
            //   0: aload_0
            //   1: getfield 18	com/flurry/sdk/as$4:c	Lcom/flurry/sdk/as;
            //   4: invokevirtual 28	com/flurry/sdk/as:b	()Z
            //   7: ifeq +13 -> 20
            //   10: new 123	java/io/IOException
            //   13: dup
            //   14: ldc 125
            //   16: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
            //   19: athrow
            //   20: aload_0
            //   21: getfield 18	com/flurry/sdk/as$4:c	Lcom/flurry/sdk/as;
            //   24: invokestatic 132	com/flurry/sdk/as:k	(Lcom/flurry/sdk/as;)Lcom/flurry/sdk/aw;
            //   27: aload_0
            //   28: getfield 20	com/flurry/sdk/as$4:a	Ljava/lang/String;
            //   31: invokevirtual 137	com/flurry/sdk/aw:b	(Ljava/lang/String;)Lcom/flurry/sdk/aw$c;
            //   34: astore_3
            //   35: aconst_null
            //   36: astore 4
            //   38: aload_3
            //   39: ifnull +39 -> 78
            //   42: new 139	com/flurry/sdk/az
            //   45: dup
            //   46: aload_2
            //   47: aload_0
            //   48: getfield 18	com/flurry/sdk/as$4:c	Lcom/flurry/sdk/as;
            //   51: invokestatic 142	com/flurry/sdk/as:e	(Lcom/flurry/sdk/as;)J
            //   54: invokespecial 145	com/flurry/sdk/az:<init>	(Ljava/io/InputStream;J)V
            //   57: astore 6
            //   59: aload 6
            //   61: aload_3
            //   62: invokevirtual 150	com/flurry/sdk/aw$c:a	()Ljava/io/OutputStream;
            //   65: invokestatic 155	com/flurry/sdk/fe:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
            //   68: pop2
            //   69: aload_3
            //   70: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   73: aload 6
            //   75: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   78: aload 4
            //   80: ifnull +56 -> 136
            //   83: aload_0
            //   84: getfield 18	com/flurry/sdk/as$4:c	Lcom/flurry/sdk/as;
            //   87: invokestatic 132	com/flurry/sdk/as:k	(Lcom/flurry/sdk/as;)Lcom/flurry/sdk/aw;
            //   90: aload_0
            //   91: getfield 20	com/flurry/sdk/as$4:a	Ljava/lang/String;
            //   94: invokevirtual 160	com/flurry/sdk/aw:c	(Ljava/lang/String;)Z
            //   97: pop
            //   98: aload 4
            //   100: athrow
            //   101: astore 7
            //   103: aconst_null
            //   104: astore 6
            //   106: aload_3
            //   107: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   110: aload 6
            //   112: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   115: aload 7
            //   117: astore 4
            //   119: goto -41 -> 78
            //   122: astore 8
            //   124: aload_3
            //   125: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   128: aload 4
            //   130: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
            //   133: aload 8
            //   135: athrow
            //   136: return
            //   137: astore 8
            //   139: aload 6
            //   141: astore 4
            //   143: goto -19 -> 124
            //   146: astore 7
            //   148: goto -42 -> 106
            //
            // Exception table:
            //   from	to	target	type
            //   42	59	101	java/io/IOException
            //   42	59	122	finally
            //   59	69	137	finally
            //   59	69	146	java/io/IOException
          }
        });
        em.a().a(this, localen);
        return;
      }
    }
    n();
  }

  // ERROR //
  private void n()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokevirtual 161	com/flurry/sdk/as:b	()Z
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: iconst_3
    //   11: getstatic 33	com/flurry/sdk/as:a	Ljava/lang/String;
    //   14: new 86	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   21: ldc_w 258
    //   24: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: getfield 95	com/flurry/sdk/as:c	Ljava/lang/String;
    //   31: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 103	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokevirtual 261	com/flurry/sdk/as:f	()Ljava/io/OutputStream;
    //   44: astore 6
    //   46: iconst_0
    //   47: istore 7
    //   49: iload 7
    //   51: aload_0
    //   52: getfield 50	com/flurry/sdk/as:i	I
    //   55: if_icmpge +180 -> 235
    //   58: aload_0
    //   59: invokevirtual 161	com/flurry/sdk/as:b	()Z
    //   62: ifeq +67 -> 129
    //   65: new 256	java/io/IOException
    //   68: dup
    //   69: ldc_w 263
    //   72: invokespecial 265	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   75: athrow
    //   76: astore_3
    //   77: aload_0
    //   78: invokevirtual 267	com/flurry/sdk/as:g	()V
    //   81: aload_3
    //   82: astore 4
    //   84: aload 4
    //   86: ifnonnull +159 -> 245
    //   89: iconst_3
    //   90: getstatic 33	com/flurry/sdk/as:a	Ljava/lang/String;
    //   93: new 86	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   100: ldc_w 269
    //   103: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: aload_0
    //   107: getfield 95	com/flurry/sdk/as:c	Ljava/lang/String;
    //   110: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokestatic 103	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   119: aload_0
    //   120: iconst_1
    //   121: putfield 131	com/flurry/sdk/as:l	Z
    //   124: aload_0
    //   125: invokespecial 159	com/flurry/sdk/as:o	()V
    //   128: return
    //   129: aload_0
    //   130: iload 7
    //   132: invokespecial 221	com/flurry/sdk/as:a	(I)Ljava/lang/String;
    //   135: astore 8
    //   137: aload_0
    //   138: getfield 198	com/flurry/sdk/as:f	Lcom/flurry/sdk/aw;
    //   141: aload 8
    //   143: invokevirtual 272	com/flurry/sdk/aw:a	(Ljava/lang/String;)Lcom/flurry/sdk/aw$b;
    //   146: astore 11
    //   148: aload 11
    //   150: astore 10
    //   152: aload 10
    //   154: ifnonnull +49 -> 203
    //   157: new 256	java/io/IOException
    //   160: dup
    //   161: new 86	java/lang/StringBuilder
    //   164: dup
    //   165: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   168: ldc_w 274
    //   171: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload 8
    //   176: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokespecial 265	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   185: athrow
    //   186: astore 9
    //   188: aload 10
    //   190: invokestatic 279	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   193: aload 9
    //   195: athrow
    //   196: astore_2
    //   197: aload_0
    //   198: invokevirtual 267	com/flurry/sdk/as:g	()V
    //   201: aload_2
    //   202: athrow
    //   203: aload 10
    //   205: invokevirtual 284	com/flurry/sdk/aw$b:a	()Ljava/io/InputStream;
    //   208: aload 6
    //   210: invokestatic 287	com/flurry/sdk/fe:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   213: pop2
    //   214: aload 10
    //   216: invokestatic 279	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   219: aload_0
    //   220: getfield 198	com/flurry/sdk/as:f	Lcom/flurry/sdk/aw;
    //   223: aload 8
    //   225: invokevirtual 289	com/flurry/sdk/aw:c	(Ljava/lang/String;)Z
    //   228: pop
    //   229: iinc 7 1
    //   232: goto -183 -> 49
    //   235: aload_0
    //   236: invokevirtual 267	com/flurry/sdk/as:g	()V
    //   239: aconst_null
    //   240: astore 4
    //   242: goto -158 -> 84
    //   245: iconst_3
    //   246: getstatic 33	com/flurry/sdk/as:a	Ljava/lang/String;
    //   249: new 86	java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   256: ldc_w 291
    //   259: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload_0
    //   263: getfield 95	com/flurry/sdk/as:c	Ljava/lang/String;
    //   266: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: ldc_w 293
    //   272: invokevirtual 93	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload 4
    //   277: invokevirtual 296	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokestatic 103	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   286: iload_1
    //   287: aload_0
    //   288: getfield 50	com/flurry/sdk/as:i	I
    //   291: if_icmpge +22 -> 313
    //   294: aload_0
    //   295: getfield 198	com/flurry/sdk/as:f	Lcom/flurry/sdk/aw;
    //   298: aload_0
    //   299: iload_1
    //   300: invokespecial 221	com/flurry/sdk/as:a	(I)Ljava/lang/String;
    //   303: invokevirtual 289	com/flurry/sdk/aw:c	(Ljava/lang/String;)Z
    //   306: pop
    //   307: iinc 1 1
    //   310: goto -24 -> 286
    //   313: aload_0
    //   314: invokevirtual 298	com/flurry/sdk/as:h	()V
    //   317: goto -193 -> 124
    //   320: astore 9
    //   322: aconst_null
    //   323: astore 10
    //   325: goto -137 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   40	46	76	java/io/IOException
    //   49	76	76	java/io/IOException
    //   129	137	76	java/io/IOException
    //   188	196	76	java/io/IOException
    //   214	229	76	java/io/IOException
    //   157	186	186	finally
    //   203	214	186	finally
    //   40	46	196	finally
    //   49	76	196	finally
    //   129	137	196	finally
    //   188	196	196	finally
    //   214	229	196	finally
    //   137	148	320	finally
  }

  private void o()
  {
    if (b());
    while (this.b == null)
      return;
    eo.a(3, a, "Downloader: finished -- success: " + this.l + " for url: " + this.c);
    this.b.a(this);
  }

  private boolean p()
  {
    return this.f != null;
  }

  private boolean q()
  {
    return (this.f != null) && (this.h) && (this.i > 1);
  }

  public void a(as.a parama)
  {
    this.b = parama;
  }

  public void a(aw paramaw)
  {
    this.f = paramaw;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public boolean a()
  {
    return this.l;
  }

  public boolean b()
  {
    return this.m;
  }

  public long c()
  {
    return this.g;
  }

  public void d()
  {
    do.a().c(new ff()
    {
      public void a()
      {
        if (as.a(as.this))
        {
          as.b(as.this);
          return;
        }
        as.c(as.this);
      }
    });
  }

  public void e()
  {
    this.m = true;
    em.a().a(this);
  }

  protected abstract OutputStream f();

  protected abstract void g();

  protected abstract void h();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.as
 * JD-Core Version:    0.6.2
 */