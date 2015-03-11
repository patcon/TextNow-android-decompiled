package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dx extends dw.a
{
  private static final Object qp = new Object();
  private static dx qq;
  private final Context mContext;
  private final ed qr;
  private final bi qs;
  private final ay qt;

  dx(Context paramContext, ay paramay, bi parambi, ed paramed)
  {
    this.mContext = paramContext;
    this.qr = paramed;
    this.qs = parambi;
    this.qt = paramay;
  }

  private static du a(Context paramContext, ay paramay, bi parambi, ed paramed, final ds paramds)
  {
    eu.z("Starting ad request from service.");
    parambi.init();
    ec localec = new ec(paramContext);
    if (localec.rm == -1)
    {
      eu.z("Device is offline.");
      return new du(2);
    }
    final dz localdz = new dz(paramds.applicationInfo.packageName);
    if (paramds.pX.extras != null)
    {
      String str4 = paramds.pX.extras.getString("_ad");
      if (str4 != null)
        return dy.a(paramContext, paramds, str4);
    }
    Location localLocation = parambi.a(250L);
    final String str1 = paramay.aN();
    String str2 = dy.a(paramds, localec, localLocation, paramay.aO());
    if (str2 == null)
      return new du(0);
    final ey.a locala = s(str2);
    et.sv.post(new Runnable()
    {
      public final void run()
      {
        ex localex = ex.a(dx.this, new al(), false, false, null, paramds.kQ);
        localex.setWillNotDraw(true);
        localdz.b(localex);
        ey localey = localex.cb();
        localey.a("/invalidRequest", localdz.qD);
        localey.a("/loadAdURL", localdz.qE);
        localey.a("/log", bb.mZ);
        localey.a(locala);
        eu.z("Loading the JS library.");
        localex.loadUrl(str1);
      }
    });
    eb localeb = localdz.bx();
    if ((localeb == null) || (TextUtils.isEmpty(localeb.getUrl())))
      return new du(localdz.getErrorCode());
    boolean bool = localeb.bA();
    String str3 = null;
    if (bool)
      str3 = paramed.u(paramds.pY.packageName);
    return a(paramContext, paramds.kQ.sw, localeb.getUrl(), str3, localeb);
  }

  // ERROR //
  public static du a(Context paramContext, String paramString1, String paramString2, String paramString3, eb parameb)
  {
    // Byte code:
    //   0: new 194	com/google/android/gms/internal/ea
    //   3: dup
    //   4: invokespecial 195	com/google/android/gms/internal/ea:<init>	()V
    //   7: astore 5
    //   9: new 197	java/net/URL
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 198	java/net/URL:<init>	(Ljava/lang/String;)V
    //   17: astore 6
    //   19: invokestatic 204	android/os/SystemClock:elapsedRealtime	()J
    //   22: lstore 8
    //   24: aload 6
    //   26: astore 10
    //   28: iconst_0
    //   29: istore 11
    //   31: aload 10
    //   33: invokevirtual 208	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   36: checkcast 210	java/net/HttpURLConnection
    //   39: astore 12
    //   41: aload_0
    //   42: aload_1
    //   43: iconst_0
    //   44: aload 12
    //   46: invokestatic 215	com/google/android/gms/internal/eo:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   49: aload_3
    //   50: invokestatic 158	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: ifne +11 -> 64
    //   56: aload 12
    //   58: ldc 217
    //   60: aload_3
    //   61: invokevirtual 221	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: aload 4
    //   66: ifnull +64 -> 130
    //   69: aload 4
    //   71: invokevirtual 224	com/google/android/gms/internal/eb:bz	()Ljava/lang/String;
    //   74: invokestatic 158	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   77: ifne +53 -> 130
    //   80: aload 12
    //   82: iconst_1
    //   83: invokevirtual 228	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   86: aload 4
    //   88: invokevirtual 224	com/google/android/gms/internal/eb:bz	()Ljava/lang/String;
    //   91: invokevirtual 234	java/lang/String:getBytes	()[B
    //   94: astore 23
    //   96: aload 12
    //   98: aload 23
    //   100: arraylength
    //   101: invokevirtual 237	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   104: new 239	java/io/BufferedOutputStream
    //   107: dup
    //   108: aload 12
    //   110: invokevirtual 243	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   113: invokespecial 246	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   116: astore 24
    //   118: aload 24
    //   120: aload 23
    //   122: invokevirtual 250	java/io/BufferedOutputStream:write	([B)V
    //   125: aload 24
    //   127: invokevirtual 253	java/io/BufferedOutputStream:close	()V
    //   130: aload 12
    //   132: invokevirtual 256	java/net/HttpURLConnection:getResponseCode	()I
    //   135: istore 14
    //   137: aload 12
    //   139: invokevirtual 260	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   142: astore 15
    //   144: iload 14
    //   146: sipush 200
    //   149: if_icmplt +74 -> 223
    //   152: iload 14
    //   154: sipush 300
    //   157: if_icmpge +66 -> 223
    //   160: aload 10
    //   162: invokevirtual 263	java/net/URL:toString	()Ljava/lang/String;
    //   165: astore 20
    //   167: new 265	java/io/InputStreamReader
    //   170: dup
    //   171: aload 12
    //   173: invokevirtual 269	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   176: invokespecial 272	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   179: invokestatic 275	com/google/android/gms/internal/eo:a	(Ljava/lang/Readable;)Ljava/lang/String;
    //   182: astore 21
    //   184: aload 20
    //   186: aload 15
    //   188: aload 21
    //   190: iload 14
    //   192: invokestatic 278	com/google/android/gms/internal/dx:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   195: aload 5
    //   197: aload 20
    //   199: aload 15
    //   201: aload 21
    //   203: invokevirtual 281	com/google/android/gms/internal/ea:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //   206: aload 5
    //   208: lload 8
    //   210: invokevirtual 285	com/google/android/gms/internal/ea:i	(J)Lcom/google/android/gms/internal/du;
    //   213: astore 22
    //   215: aload 12
    //   217: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   220: aload 22
    //   222: areturn
    //   223: aload 10
    //   225: invokevirtual 263	java/net/URL:toString	()Ljava/lang/String;
    //   228: aload 15
    //   230: aconst_null
    //   231: iload 14
    //   233: invokestatic 278	com/google/android/gms/internal/dx:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   236: iload 14
    //   238: sipush 300
    //   241: if_icmplt +97 -> 338
    //   244: iload 14
    //   246: sipush 400
    //   249: if_icmpge +89 -> 338
    //   252: aload 12
    //   254: ldc_w 290
    //   257: invokevirtual 293	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   260: astore 17
    //   262: aload 17
    //   264: invokestatic 158	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   267: ifeq +27 -> 294
    //   270: ldc_w 295
    //   273: invokestatic 298	com/google/android/gms/internal/eu:D	(Ljava/lang/String;)V
    //   276: new 63	com/google/android/gms/internal/du
    //   279: dup
    //   280: iconst_0
    //   281: invokespecial 66	com/google/android/gms/internal/du:<init>	(I)V
    //   284: astore 19
    //   286: aload 12
    //   288: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   291: aload 19
    //   293: areturn
    //   294: new 197	java/net/URL
    //   297: dup
    //   298: aload 17
    //   300: invokespecial 198	java/net/URL:<init>	(Ljava/lang/String;)V
    //   303: astore 10
    //   305: iinc 11 1
    //   308: iload 11
    //   310: iconst_5
    //   311: if_icmple +69 -> 380
    //   314: ldc_w 300
    //   317: invokestatic 298	com/google/android/gms/internal/eu:D	(Ljava/lang/String;)V
    //   320: new 63	com/google/android/gms/internal/du
    //   323: dup
    //   324: iconst_0
    //   325: invokespecial 66	com/google/android/gms/internal/du:<init>	(I)V
    //   328: astore 18
    //   330: aload 12
    //   332: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   335: aload 18
    //   337: areturn
    //   338: new 302	java/lang/StringBuilder
    //   341: dup
    //   342: invokespecial 303	java/lang/StringBuilder:<init>	()V
    //   345: ldc_w 305
    //   348: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: iload 14
    //   353: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   356: invokevirtual 313	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   359: invokestatic 298	com/google/android/gms/internal/eu:D	(Ljava/lang/String;)V
    //   362: new 63	com/google/android/gms/internal/du
    //   365: dup
    //   366: iconst_0
    //   367: invokespecial 66	com/google/android/gms/internal/du:<init>	(I)V
    //   370: astore 16
    //   372: aload 12
    //   374: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   377: aload 16
    //   379: areturn
    //   380: aload 5
    //   382: aload 15
    //   384: invokevirtual 317	com/google/android/gms/internal/ea:d	(Ljava/util/Map;)V
    //   387: aload 12
    //   389: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   392: goto -361 -> 31
    //   395: astore 7
    //   397: new 302	java/lang/StringBuilder
    //   400: dup
    //   401: invokespecial 303	java/lang/StringBuilder:<init>	()V
    //   404: ldc_w 319
    //   407: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: aload 7
    //   412: invokevirtual 322	java/io/IOException:getMessage	()Ljava/lang/String;
    //   415: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: invokevirtual 313	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   421: invokestatic 298	com/google/android/gms/internal/eu:D	(Ljava/lang/String;)V
    //   424: new 63	com/google/android/gms/internal/du
    //   427: dup
    //   428: iconst_2
    //   429: invokespecial 66	com/google/android/gms/internal/du:<init>	(I)V
    //   432: areturn
    //   433: astore 13
    //   435: aload 12
    //   437: invokevirtual 288	java/net/HttpURLConnection:disconnect	()V
    //   440: aload 13
    //   442: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	24	395	java/io/IOException
    //   31	41	395	java/io/IOException
    //   215	220	395	java/io/IOException
    //   286	291	395	java/io/IOException
    //   330	335	395	java/io/IOException
    //   372	377	395	java/io/IOException
    //   387	392	395	java/io/IOException
    //   435	443	395	java/io/IOException
    //   41	64	433	finally
    //   69	130	433	finally
    //   130	144	433	finally
    //   160	215	433	finally
    //   223	236	433	finally
    //   252	286	433	finally
    //   294	305	433	finally
    //   314	330	433	finally
    //   338	372	433	finally
    //   380	387	433	finally
  }

  public static dx a(Context paramContext, ay paramay, bi parambi, ed paramed)
  {
    synchronized (qp)
    {
      if (qq == null)
        qq = new dx(paramContext.getApplicationContext(), paramay, parambi, paramed);
      dx localdx = qq;
      return localdx;
    }
  }

  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (eu.p(2))
    {
      eu.C("Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          eu.C("    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            eu.C("      " + str2);
          }
        }
      }
      eu.C("  Body:");
      if (paramString2 != null)
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000)
          eu.C(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
      eu.C("    null");
      eu.C("  Response Code:\n    " + paramInt + "\n}");
    }
  }

  private static ey.a s(String paramString)
  {
    return new ey.a()
    {
      public final void a(ex paramAnonymousex)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "AFMA_buildAdURL";
        arrayOfObject[1] = dx.this;
        String str = String.format("javascript:%s(%s);", arrayOfObject);
        eu.C("About to execute: " + str);
        paramAnonymousex.loadUrl(str);
      }
    };
  }

  public final du b(ds paramds)
  {
    return a(this.mContext, this.qt, this.qs, this.qr, paramds);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dx
 * JD-Core Version:    0.6.2
 */