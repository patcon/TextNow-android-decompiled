package textnow.be;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.webkit.WebView;
import com.tremorvideo.sdk.android.videoad.dn;
import com.tremorvideo.sdk.android.videoad.eb;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import textnow.bf.t;

public final class aj
{
  k[] a = new k[0];
  public boolean b = false;
  private long c;
  private ao d;
  private ak e;
  private as f;
  private aq g;
  private dn h;
  private a i;
  private aa j;
  private at k;
  private boolean l = false;

  public aj(ak paramak, e parame, Context paramContext, boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.e = paramak;
    this.f = new as();
    this.f.f = parame.r().a();
    this.h = null;
    this.i = new a(paramContext);
    a locala = this.i;
    locala.d = false;
    String str1 = "<html><head><script type=\"text/javascript\">\n" + parame.h();
    String str2 = str1 + "</script></head></html>";
    locala.a.loadData(str2, "text/html", "UTF-8");
    locala.c = parame;
    locala.b = this;
  }

  private static float a(ah paramah1, ah paramah2)
  {
    float f1 = paramah1.a + paramah1.f / 2.0F;
    float f2 = paramah1.b + paramah1.g / 2.0F;
    float f3 = paramah2.a + paramah2.f / 2.0F;
    float f4 = paramah2.b + paramah2.g / 2.0F;
    float f5 = f1 - f3;
    float f6 = f2 - f4;
    return (float)Math.sqrt(f5 * f5 + f6 * f6);
  }

  private static boolean b(ah paramah1, ah paramah2)
  {
    float f1 = paramah1.a + paramah1.f / 2.0F;
    float f2 = paramah1.b + paramah1.g / 2.0F;
    float f3 = paramah2.a + paramah2.f / 2.0F;
    float f4 = paramah2.b + paramah2.g / 2.0F;
    float f5 = f1 - f3;
    float f6 = f2 - f4;
    return Math.abs(f5) > Math.abs(f6);
  }

  private at o()
  {
    if (!this.l)
      return null;
    Iterator localIterator = this.d.c().iterator();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject4;
    Object localObject3;
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      ac localac = localat.g().a(ae.d);
      if ((localac != null) && (localac.c() != ad.u))
      {
        ah localah = localat.c(this.f, 0L);
        if ((localah.f != 0.0F) && (localah.g != 0.0F))
          if (localObject2 == null)
          {
            localObject1 = localah;
            localObject2 = localat;
          }
          else if (localah.b == localObject1.b)
          {
            if (localah.a >= localObject1.a)
              break label187;
            localObject1 = localah;
            localObject2 = localat;
          }
          else
          {
            if (localah.b >= localObject1.b)
              break label187;
            localObject4 = localat;
            localObject3 = localah;
          }
      }
    }
    while (true)
    {
      localObject2 = localObject4;
      localObject1 = localObject3;
      break;
      return localObject2;
      label187: localObject3 = localObject1;
      localObject4 = localObject2;
    }
  }

  public final ah a(at paramat, long paramLong)
  {
    ah localah = paramat.c(this.f, paramLong);
    localah.a += this.f.a() / 2.0F;
    localah.b += this.f.b() / 2.0F;
    return localah;
  }

  public final void a()
  {
    this.i.a();
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int m = -4;
    eb localeb1 = this.e.g();
    eb localeb2 = eb.e;
    int n = 0;
    int i1;
    int i2;
    eb localeb4;
    int i3;
    int i4;
    int i9;
    int i6;
    int i5;
    int i8;
    int i7;
    if (localeb1 != localeb2)
    {
      eb localeb3 = eb.f;
      n = 0;
      if (localeb1 != localeb3)
      {
        i1 = (int)this.f.a();
        i2 = (int)this.f.b();
        localeb4 = this.e.g();
        Bitmap localBitmap = this.d.e().d();
        i3 = localBitmap.getWidth();
        i4 = localBitmap.getHeight();
        if (localeb4 != eb.a)
          break label376;
        i9 = i1 / 2 - (i3 + 4);
        i6 = 14;
        int i11 = 2 + i2 / -2;
        i5 = 2;
        i8 = i11;
        i7 = -10;
      }
    }
    while (true)
    {
      RectF localRectF = new RectF();
      localRectF.left = (m + i9);
      localRectF.top = (i8 + i7);
      localRectF.right = (i6 + (i9 + i3));
      localRectF.bottom = (i5 + (i8 + i4));
      localRectF.left -= 15.0F;
      localRectF.right = (15.0F + localRectF.right);
      localRectF.top -= 15.0F;
      localRectF.bottom = (15.0F + localRectF.bottom);
      boolean bool = localRectF.contains(paramInt1, paramInt2);
      n = 0;
      if (bool)
      {
        this.e.a("adchoices");
        n = 1;
      }
      if (n == 0)
      {
        ac localac = this.d.a(this.f, paramInt1, paramInt2, this.c);
        if (localac != null)
          this.e.a(localac);
        if ((this.j != null) && (this.j.c(this.f, paramInt1, paramInt2)))
        {
          this.j.a(this.f, paramInt1, paramInt2, this.c);
          this.j.a = true;
        }
      }
      return;
      label376: if (localeb4 == eb.b)
      {
        i9 = 4 + i1 / -2;
        i6 = 4;
        int i10 = 2 + i2 / -2;
        i5 = 2;
        i7 = -10;
        i8 = i10;
        m = -14;
      }
      else if (localeb4 == eb.d)
      {
        i9 = 4 + i1 / -2;
        i6 = 4;
        i8 = 2 + (i2 / 2 - i4);
        i5 = 12;
        i7 = -2;
        m = -14;
      }
      else if (localeb4 == eb.c)
      {
        i9 = i1 / 2 - (i3 + 4);
        i6 = 14;
        i8 = i2 / 2 - (i4 + 2);
        i7 = -2;
        i5 = 12;
      }
      else
      {
        i5 = 0;
        i6 = 0;
        m = 0;
        i7 = 0;
        i8 = 0;
        i9 = 0;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d.e().a(new GregorianCalendar(paramInt1, paramInt2, paramInt3));
  }

  public final void a(long paramLong)
  {
    while (true)
    {
      int m;
      try
      {
        if (this.d != null)
        {
          if (this.j != null)
            this.j.a(paramLong);
          if ((this.g == aq.a) && (!this.b))
          {
            m = 0;
            if (m < this.d.g().a())
            {
              ac localac = this.d.g().a(m);
              if (localac.b() != ae.p)
                break label181;
              int n = ((Integer)localac.e()).intValue();
              if (n / 100 != this.c / 100L)
                break label181;
              this.b = true;
              this.c = n;
              break label181;
            }
            this.d.a(this, paramLong);
            this.c = (paramLong + this.c);
            if (this.c >= this.d.b())
            {
              this.c = 0L;
              a(ae.g);
            }
          }
        }
        return;
      }
      catch (Exception localException)
      {
        r.a(localException);
        return;
      }
      label181: m++;
    }
  }

  public final void a(Canvas paramCanvas)
  {
    eb localeb;
    Bitmap localBitmap;
    int m;
    int n;
    int i6;
    int i2;
    int i3;
    int i5;
    int i4;
    int i1;
    if (this.d != null)
    {
      paramCanvas.save();
      this.f.a(this.e, paramCanvas, this.d.e().l(), this.d.e().m());
      this.f.g = this.e.f();
      this.d.c(this.f, this.c, this.j);
      localeb = this.e.g();
      if ((localeb != eb.e) && (localeb != eb.f))
      {
        localBitmap = this.d.e().d();
        m = localBitmap.getWidth();
        n = localBitmap.getHeight();
        if (localeb != eb.a)
          break label525;
        i6 = paramCanvas.getWidth() / 2 - (m + 4);
        i2 = 14;
        i3 = -4;
        i5 = 2 + paramCanvas.getHeight() / -2;
        i4 = -10;
        i1 = 2;
      }
    }
    while (true)
    {
      RectF localRectF2 = new RectF();
      localRectF2.left = (i3 + i6);
      localRectF2.top = (i5 + i4);
      localRectF2.right = (i2 + (i6 + m));
      localRectF2.bottom = (i1 + (i5 + n));
      Paint localPaint2 = new Paint();
      localPaint2.setAntiAlias(true);
      localPaint2.setColor(Color.argb(179, 255, 255, 255));
      paramCanvas.drawRoundRect(localRectF2, 10.0F, 10.0F, localPaint2);
      paramCanvas.drawBitmap(localBitmap, i6, i5, null);
      if (this.j != null)
        this.j.a(this.f);
      if (this.k != null)
      {
        ah localah = this.k.c(this.f, this.c);
        RectF localRectF1 = new RectF();
        localRectF1.left = (localah.a - 10.0F);
        localRectF1.right = (10.0F + (localah.a + localah.f));
        localRectF1.top = (localah.b - 10.0F);
        localRectF1.bottom = (10.0F + (localah.b + localah.g));
        Paint localPaint1 = new Paint();
        localPaint1.setColor(Color.argb(128, 20, 20, 200));
        localPaint1.setStrokeWidth(5.0F);
        localPaint1.setStyle(Paint.Style.STROKE);
        paramCanvas.drawRoundRect(localRectF1, 5.0F, 5.0F, localPaint1);
        localPaint1.setColor(Color.argb(128, 200, 200, 255));
        localPaint1.setStrokeWidth(1.0F);
        localPaint1.setStyle(Paint.Style.STROKE);
        paramCanvas.drawRoundRect(localRectF1, 5.0F, 5.0F, localPaint1);
      }
      paramCanvas.restore();
      return;
      label525: if (localeb == eb.b)
      {
        i6 = 4 + paramCanvas.getWidth() / -2;
        i3 = -14;
        i2 = 4;
        i5 = 2 + paramCanvas.getHeight() / -2;
        i4 = -10;
        i1 = 2;
      }
      else if (localeb == eb.d)
      {
        i6 = 4 + paramCanvas.getWidth() / -2;
        i3 = -14;
        i2 = 4;
        i5 = paramCanvas.getHeight() / 2 - (n + 2);
        i4 = -2;
        i1 = 12;
      }
      else if (localeb == eb.c)
      {
        i6 = paramCanvas.getWidth() / 2 - (m + 4);
        i2 = 14;
        i3 = -4;
        i5 = paramCanvas.getHeight() / 2 - (n + 2);
        i4 = -2;
        i1 = 12;
      }
      else
      {
        i1 = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
      }
    }
  }

  public final void a(dn paramdn)
  {
    this.h = paramdn;
  }

  public final void a(String paramString)
  {
    this.d.e().b(paramString);
  }

  // ERROR //
  public final void a(org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +15 -> 16
    //   4: aload_0
    //   5: getfield 133	textnow/be/aj:d	Ltextnow/be/ao;
    //   8: invokevirtual 207	textnow/be/ao:e	()Ltextnow/be/e;
    //   11: aconst_null
    //   12: invokevirtual 405	textnow/be/e:a	([Ltextnow/be/k;)V
    //   15: return
    //   16: new 407	java/util/ArrayList
    //   19: dup
    //   20: invokespecial 408	java/util/ArrayList:<init>	()V
    //   23: astore_2
    //   24: new 410	java/text/SimpleDateFormat
    //   27: dup
    //   28: ldc_w 412
    //   31: invokespecial 414	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   34: astore_3
    //   35: new 410	java/text/SimpleDateFormat
    //   38: dup
    //   39: ldc_w 416
    //   42: invokespecial 414	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   45: astore 4
    //   47: aload_1
    //   48: ldc_w 418
    //   51: invokevirtual 424	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   54: ldc_w 426
    //   57: invokevirtual 430	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   60: astore 6
    //   62: new 74	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   69: astore 7
    //   71: new 407	java/util/ArrayList
    //   74: dup
    //   75: invokespecial 408	java/util/ArrayList:<init>	()V
    //   78: astore 8
    //   80: iconst_0
    //   81: istore 9
    //   83: aconst_null
    //   84: astore 10
    //   86: iload 9
    //   88: aload 6
    //   90: invokevirtual 435	org/json/JSONArray:length	()I
    //   93: if_icmpge +510 -> 603
    //   96: aload 8
    //   98: invokevirtual 438	java/util/ArrayList:clear	()V
    //   101: aload 6
    //   103: iload 9
    //   105: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   108: astore 15
    //   110: aload 7
    //   112: iconst_0
    //   113: invokevirtual 444	java/lang/StringBuilder:setLength	(I)V
    //   116: aload 7
    //   118: aload 15
    //   120: ldc_w 446
    //   123: invokevirtual 450	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 7
    //   132: ldc_w 452
    //   135: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload 8
    //   141: new 34	textnow/be/k
    //   144: dup
    //   145: aload 7
    //   147: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: getstatic 457	textnow/be/l:b	Ltextnow/be/l;
    //   153: invokespecial 460	textnow/be/k:<init>	(Ljava/lang/String;Ltextnow/be/l;)V
    //   156: invokevirtual 464	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   159: pop
    //   160: aload 15
    //   162: ldc_w 466
    //   165: invokevirtual 430	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   168: astore 19
    //   170: aload 19
    //   172: iconst_0
    //   173: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   176: ldc_w 468
    //   179: invokevirtual 430	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   182: iconst_0
    //   183: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   186: ldc_w 470
    //   189: invokevirtual 430	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   192: astore 20
    //   194: aload 10
    //   196: ifnonnull +133 -> 329
    //   199: aload 19
    //   201: iconst_0
    //   202: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   205: ldc_w 472
    //   208: invokevirtual 450	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   211: ldc_w 474
    //   214: invokevirtual 480	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   217: astore 21
    //   219: aload 21
    //   221: iconst_0
    //   222: aaload
    //   223: invokestatic 484	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   226: invokevirtual 308	java/lang/Integer:intValue	()I
    //   229: istore 22
    //   231: aload 21
    //   233: iconst_1
    //   234: aaload
    //   235: invokestatic 484	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   238: invokevirtual 308	java/lang/Integer:intValue	()I
    //   241: istore 23
    //   243: aload 21
    //   245: iconst_2
    //   246: aaload
    //   247: invokestatic 484	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   250: invokevirtual 308	java/lang/Integer:intValue	()I
    //   253: istore 24
    //   255: new 274	java/util/GregorianCalendar
    //   258: dup
    //   259: iload 22
    //   261: iload 23
    //   263: iconst_1
    //   264: isub
    //   265: iload 24
    //   267: invokespecial 276	java/util/GregorianCalendar:<init>	(III)V
    //   270: astore 25
    //   272: new 410	java/text/SimpleDateFormat
    //   275: dup
    //   276: ldc_w 486
    //   279: invokespecial 414	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   282: aload 25
    //   284: invokevirtual 490	java/util/GregorianCalendar:getTime	()Ljava/util/Date;
    //   287: invokevirtual 494	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   290: astore 10
    //   292: aload 8
    //   294: new 34	textnow/be/k
    //   297: dup
    //   298: new 74	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   305: aload 10
    //   307: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: ldc_w 496
    //   313: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: getstatic 498	textnow/be/l:a	Ltextnow/be/l;
    //   322: invokespecial 460	textnow/be/k:<init>	(Ljava/lang/String;Ltextnow/be/l;)V
    //   325: invokevirtual 464	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   328: pop
    //   329: aload 10
    //   331: astore 13
    //   333: iconst_0
    //   334: istore 27
    //   336: iload 27
    //   338: aload 20
    //   340: invokevirtual 435	org/json/JSONArray:length	()I
    //   343: if_icmpge +194 -> 537
    //   346: aload 20
    //   348: iload 27
    //   350: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   353: ldc_w 500
    //   356: invokevirtual 450	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   359: ldc_w 502
    //   362: invokevirtual 480	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   365: iconst_1
    //   366: aaload
    //   367: astore 31
    //   369: aload 4
    //   371: aload 31
    //   373: invokevirtual 508	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   376: astore 32
    //   378: aload 7
    //   380: iconst_0
    //   381: invokevirtual 444	java/lang/StringBuilder:setLength	(I)V
    //   384: aload 7
    //   386: aload_3
    //   387: aload 32
    //   389: invokevirtual 509	java/text/DateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   392: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: iload 27
    //   398: iconst_m1
    //   399: aload 20
    //   401: invokevirtual 435	org/json/JSONArray:length	()I
    //   404: iadd
    //   405: if_icmpge +103 -> 508
    //   408: aload 7
    //   410: ldc_w 511
    //   413: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: pop
    //   417: aload 20
    //   419: iload 27
    //   421: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   424: ldc_w 513
    //   427: invokevirtual 517	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   430: istore 35
    //   432: aconst_null
    //   433: astore 36
    //   435: iload 35
    //   437: ifeq +42 -> 479
    //   440: new 74	java/lang/StringBuilder
    //   443: dup
    //   444: invokespecial 75	java/lang/StringBuilder:<init>	()V
    //   447: aload 20
    //   449: iload 27
    //   451: invokevirtual 441	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   454: ldc_w 513
    //   457: invokevirtual 450	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   460: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: ldc_w 519
    //   466: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: aload 31
    //   471: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   477: astore 36
    //   479: aload 8
    //   481: new 34	textnow/be/k
    //   484: dup
    //   485: aload 7
    //   487: invokevirtual 87	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   490: aload 36
    //   492: getstatic 521	textnow/be/l:c	Ltextnow/be/l;
    //   495: invokespecial 524	textnow/be/k:<init>	(Ljava/lang/String;Ljava/lang/String;Ltextnow/be/l;)V
    //   498: invokevirtual 464	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   501: pop
    //   502: iinc 27 1
    //   505: goto -169 -> 336
    //   508: aload 7
    //   510: ldc_w 526
    //   513: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: goto -100 -> 417
    //   520: astore 14
    //   522: aload 14
    //   524: invokestatic 326	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   527: iinc 9 1
    //   530: aload 13
    //   532: astore 10
    //   534: goto -448 -> 86
    //   537: iload 9
    //   539: iconst_m1
    //   540: aload 6
    //   542: invokevirtual 435	org/json/JSONArray:length	()I
    //   545: iadd
    //   546: if_icmpge +22 -> 568
    //   549: aload 8
    //   551: new 34	textnow/be/k
    //   554: dup
    //   555: ldc_w 528
    //   558: getstatic 498	textnow/be/l:a	Ltextnow/be/l;
    //   561: invokespecial 460	textnow/be/k:<init>	(Ljava/lang/String;Ltextnow/be/l;)V
    //   564: invokevirtual 464	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   567: pop
    //   568: aload 8
    //   570: invokevirtual 529	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   573: astore 28
    //   575: aload 28
    //   577: invokeinterface 150 1 0
    //   582: ifeq -55 -> 527
    //   585: aload_2
    //   586: aload 28
    //   588: invokeinterface 154 1 0
    //   593: checkcast 34	textnow/be/k
    //   596: invokevirtual 464	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   599: pop
    //   600: goto -25 -> 575
    //   603: aload_0
    //   604: aload_2
    //   605: invokevirtual 532	java/util/ArrayList:size	()I
    //   608: anewarray 34	textnow/be/k
    //   611: putfield 36	textnow/be/aj:a	[Ltextnow/be/k;
    //   614: iconst_0
    //   615: istore 11
    //   617: iload 11
    //   619: aload_0
    //   620: getfield 36	textnow/be/aj:a	[Ltextnow/be/k;
    //   623: arraylength
    //   624: if_icmpge +25 -> 649
    //   627: aload_0
    //   628: getfield 36	textnow/be/aj:a	[Ltextnow/be/k;
    //   631: iload 11
    //   633: aload_2
    //   634: iload 11
    //   636: invokevirtual 536	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   639: checkcast 34	textnow/be/k
    //   642: aastore
    //   643: iinc 11 1
    //   646: goto -29 -> 617
    //   649: aload_0
    //   650: getfield 133	textnow/be/aj:d	Ltextnow/be/ao;
    //   653: invokevirtual 207	textnow/be/ao:e	()Ltextnow/be/e;
    //   656: aload_0
    //   657: getfield 36	textnow/be/aj:a	[Ltextnow/be/k;
    //   660: invokevirtual 405	textnow/be/e:a	([Ltextnow/be/k;)V
    //   663: return
    //   664: astore 5
    //   666: aload 5
    //   668: invokestatic 326	com/tremorvideo/sdk/android/videoad/r:a	(Ljava/lang/Throwable;)V
    //   671: return
    //   672: astore 12
    //   674: aload 10
    //   676: astore 13
    //   678: aload 12
    //   680: astore 14
    //   682: goto -160 -> 522
    //
    // Exception table:
    //   from	to	target	type
    //   336	417	520	java/lang/Exception
    //   417	432	520	java/lang/Exception
    //   440	479	520	java/lang/Exception
    //   479	502	520	java/lang/Exception
    //   508	517	520	java/lang/Exception
    //   537	568	520	java/lang/Exception
    //   568	575	520	java/lang/Exception
    //   575	600	520	java/lang/Exception
    //   24	80	664	java/lang/Exception
    //   86	101	664	java/lang/Exception
    //   522	527	664	java/lang/Exception
    //   603	614	664	java/lang/Exception
    //   617	643	664	java/lang/Exception
    //   649	663	664	java/lang/Exception
    //   101	194	672	java/lang/Exception
    //   199	329	672	java/lang/Exception
  }

  public final void a(ac paramac)
  {
    if ((paramac != null) && (paramac.d() != null))
    {
      a locala = this.i;
      String str = paramac.d();
      if ((str != "") && (str != null))
      {
        r.d("Calling Function: " + str);
        locala.a.loadUrl("javascript:" + str + "();");
      }
    }
  }

  public final void a(ae paramae)
  {
    ac localac = this.d.a(paramae);
    if (localac != null)
      this.e.a(localac);
  }

  public final void a(ao paramao)
  {
    this.c = 0L;
    this.b = false;
    if (this.d != null)
      this.d.e().w();
    this.d = paramao;
    this.g = paramao.d();
    this.d.a();
    at localat2;
    if (paramao.f() != -1)
    {
      this.j = new aa(this.d.a(paramao.f()));
      at localat1 = this.k;
      if ((!this.l) || (localat1 == null))
        break label271;
      int m = localat1.g().a(ae.d).a();
      Iterator localIterator2 = this.d.c().iterator();
      while (localIterator2.hasNext())
      {
        localat2 = (at)localIterator2.next();
        ac localac = localat2.g().a(ae.d);
        if ((localac != null) && (localac.a() == m))
        {
          label170: this.k = localat2;
          textnow.bg.a locala = this.d.h();
          if (locala == null)
            break label276;
          locala.a(this.f);
        }
      }
    }
    while (true)
    {
      ArrayList localArrayList = paramao.i();
      if ((localArrayList == null) || (localArrayList.isEmpty()))
        break label289;
      Iterator localIterator1 = localArrayList.iterator();
      while (localIterator1.hasNext())
      {
        t localt = (t)localIterator1.next();
        localt.a(this.f, localt.f());
      }
      this.j = null;
      break;
      label271: localat2 = null;
      break label170;
      label276: this.d.e().v();
    }
    label289: this.d.e().w();
    a(ae.f);
  }

  public final void a(aq paramaq)
  {
    this.g = paramaq;
  }

  public final ao b()
  {
    return this.d;
  }

  public final void b(int paramInt1, int paramInt2)
  {
    if ((this.j != null) && (this.j.a))
    {
      this.j.a(this.f, paramInt1, paramInt2);
      this.d.b(this.f, paramInt1, paramInt2, this.c);
    }
  }

  public final void b(long paramLong)
  {
    this.c = paramLong;
    if ((paramLong == 0L) && (this.g == aq.a))
      a(ae.f);
    if (this.c == this.d.b())
      a(ae.g);
  }

  public final void b(Canvas paramCanvas)
  {
    if (this.d != null)
    {
      paramCanvas.save();
      this.f.a(this.e, paramCanvas, this.d.e().l(), this.d.e().m());
      this.f.g = this.e.f();
      this.d.b(this.f, this.c, this.j);
      paramCanvas.restore();
    }
  }

  public final void b(ac paramac)
  {
    if (paramac != null)
      this.e.a(paramac);
  }

  public final void c()
  {
    Iterator localIterator = this.d.c().iterator();
    while (localIterator.hasNext())
    {
      ac localac = ((at)localIterator.next()).g().a(ae.d);
      if ((localac != null) && (localac.c() == ad.u))
        this.e.a(localac);
    }
  }

  public final void c(int paramInt1, int paramInt2)
  {
    ac localac = this.d.d(this.f, paramInt1, paramInt2, this.c);
    if (localac != null)
      this.e.a(localac);
    if ((this.j != null) && (this.j.a))
    {
      this.j.b(this.f, paramInt1, paramInt2);
      this.j.a = false;
      if (localac == null)
        this.d.c(this.f, paramInt1, paramInt2, this.c);
    }
  }

  public final void d()
  {
    if (this.k == null)
      return;
    ac localac1 = this.k.k();
    if (localac1 != null)
    {
      this.e.a(localac1);
      return;
    }
    ac localac2 = this.k.a(true);
    this.e.a(localac2);
  }

  public final void e()
  {
    if (this.k == null)
    {
      this.k = o();
      return;
    }
    ah localah1 = this.k.c(this.f, this.c);
    Iterator localIterator = this.d.c().iterator();
    Object localObject1 = null;
    float f1 = 3.4028235E+38F;
    label52: Object localObject2;
    float f2;
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.i()) && (localat != this.k))
      {
        ah localah2 = localat.c(this.f, 0L);
        if ((localah2.f != 0.0F) && (localah2.g != 0.0F))
        {
          if ((localah2.a >= localah1.a) || (!b(localah2, localah1)))
            break label201;
          float f3 = a(localah1, localah2);
          if (localObject1 == null)
          {
            f1 = f3;
            localObject1 = localat;
          }
          else
          {
            if (f3 >= f1)
              break label201;
            localObject2 = localat;
            f2 = f3;
          }
        }
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      f1 = f2;
      break label52;
      if (localObject1 == null)
        break;
      this.k = localObject1;
      return;
      label201: f2 = f1;
      localObject2 = localObject1;
    }
  }

  public final void f()
  {
    if (this.k == null)
    {
      this.k = o();
      return;
    }
    ah localah1 = this.k.c(this.f, this.c);
    Iterator localIterator = this.d.c().iterator();
    Object localObject1 = null;
    float f1 = 3.4028235E+38F;
    label52: Object localObject2;
    float f2;
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.i()) && (localat != this.k))
      {
        ah localah2 = localat.c(this.f, 0L);
        if ((localah2.f != 0.0F) && (localah2.g != 0.0F))
        {
          if ((localah2.a <= localah1.a) || (!b(localah2, localah1)))
            break label201;
          float f3 = a(localah1, localah2);
          if (localObject1 == null)
          {
            f1 = f3;
            localObject1 = localat;
          }
          else
          {
            if (f3 >= f1)
              break label201;
            localObject2 = localat;
            f2 = f3;
          }
        }
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      f1 = f2;
      break label52;
      if (localObject1 == null)
        break;
      this.k = localObject1;
      return;
      label201: f2 = f1;
      localObject2 = localObject1;
    }
  }

  public final void g()
  {
    if (this.k == null)
    {
      this.k = o();
      return;
    }
    ah localah1 = this.k.c(this.f, this.c);
    Iterator localIterator = this.d.c().iterator();
    Object localObject1 = null;
    float f1 = 3.4028235E+38F;
    label52: Object localObject2;
    float f2;
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.i()) && (localat != this.k))
      {
        ah localah2 = localat.c(this.f, 0L);
        if ((localah2.f != 0.0F) && (localah2.g != 0.0F))
        {
          if ((localah2.b >= localah1.b) || (b(localah2, localah1)))
            break label201;
          float f3 = a(localah1, localah2);
          if (localObject1 == null)
          {
            f1 = f3;
            localObject1 = localat;
          }
          else
          {
            if (f3 >= f1)
              break label201;
            localObject2 = localat;
            f2 = f3;
          }
        }
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      f1 = f2;
      break label52;
      if (localObject1 == null)
        break;
      this.k = localObject1;
      return;
      label201: f2 = f1;
      localObject2 = localObject1;
    }
  }

  public final void h()
  {
    if (this.k == null)
    {
      this.k = o();
      return;
    }
    ah localah1 = this.k.c(this.f, this.c);
    Iterator localIterator = this.d.c().iterator();
    Object localObject1 = null;
    float f1 = 3.4028235E+38F;
    label52: Object localObject2;
    float f2;
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.i()) && (localat != this.k))
      {
        ah localah2 = localat.c(this.f, 0L);
        if ((localah2.f != 0.0F) && (localah2.g != 0.0F))
        {
          if ((localah2.b <= localah1.b) || (b(localah2, localah1)))
            break label201;
          float f3 = a(localah1, localah2);
          if (localObject1 == null)
          {
            f1 = f3;
            localObject1 = localat;
          }
          else
          {
            if (f3 >= f1)
              break label201;
            localObject2 = localat;
            f2 = f3;
          }
        }
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      f1 = f2;
      break label52;
      if (localObject1 == null)
        break;
      this.k = localObject1;
      return;
      label201: f2 = f1;
      localObject2 = localObject1;
    }
  }

  public final long i()
  {
    return this.c;
  }

  public final void j()
  {
    try
    {
      if (this.j != null)
        this.j.a();
      if (this.d != null)
      {
        Iterator localIterator = this.d.c().iterator();
        while (localIterator.hasNext())
          ((at)localIterator.next()).a();
      }
    }
    catch (Exception localException)
    {
      r.d("Exception Player onRotate=" + localException);
    }
  }

  public final void k()
  {
    ac localac = this.d.a(ae.i);
    if (localac != null)
      this.e.a(localac);
  }

  public final boolean l()
  {
    return this.i.d;
  }

  public final void m()
  {
    if (this.h != null)
      this.h.h();
  }

  public final boolean n()
  {
    return (this.f != null) && (this.f.j == true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.aj
 * JD-Core Version:    0.6.2
 */