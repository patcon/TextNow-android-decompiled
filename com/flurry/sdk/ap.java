package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ap
  implements ao.a
{
  private static final String b = ap.class.getSimpleName();
  private static final String[] c = new String[0];
  private static ap d;
  ao a;
  private long e;
  private long f;
  private boolean g;
  private boolean h;
  private final dt<ap.b> i = new dt();

  private ap.a a(ap.a parama, ar paramar)
  {
    if (parama == null)
      parama = ap.a.a;
    do
    {
      do
      {
        do
        {
          do
          {
            do
              return parama;
            while (paramar == null);
            if (ar.g.equals(paramar))
              return ap.a.f;
            if (!ar.f.equals(paramar))
              break;
          }
          while (parama.equals(ap.a.f));
          return ap.a.e;
          if ((!ar.a.equals(paramar)) && (!ar.e.equals(paramar)))
            break;
        }
        while ((parama.equals(ap.a.f)) || (parama.equals(ap.a.e)));
        return ap.a.c;
        if ((!ar.b.equals(paramar)) && (!ar.c.equals(paramar)))
          break;
      }
      while ((!ap.a.a.equals(parama)) && (!ap.a.d.equals(parama)));
      return ap.a.b;
    }
    while ((!ar.d.equals(paramar)) || (!ap.a.a.equals(parama)));
    return ap.a.d;
  }

  public static ap a()
  {
    try
    {
      if (d == null)
        d = new ap();
      ap localap = d;
      return localap;
    }
    finally
    {
    }
  }

  private String a(AdFrame paramAdFrame, String paramString)
  {
    if ((paramAdFrame == null) || (TextUtils.isEmpty(paramString)));
    String str;
    do
    {
      do
        return null;
      while (paramAdFrame.d() == null);
      str = a(paramAdFrame.d().toString(), paramString);
    }
    while (TextUtils.isEmpty(str));
    return str;
  }

  private String a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      localObject1 = null;
      return localObject1;
    }
    Object localObject1 = "";
    while (true)
    {
      Object localObject2;
      try
      {
        Iterator localIterator = Arrays.asList(paramString2.split("\\s*-\\s*")).iterator();
        localObject2 = paramString1;
        if (!localIterator.hasNext())
          break;
        String str1 = (String)localIterator.next();
        String str2 = new JSONObject((String)localObject2).getString(str1);
        boolean bool = TextUtils.isEmpty(str2);
        if (!bool)
        {
          localObject3 = str2;
          localObject2 = localObject3;
          localObject1 = str2;
          continue;
        }
      }
      catch (JSONException localJSONException)
      {
        return null;
      }
      Object localObject3 = localObject2;
    }
  }

  private boolean a(AdFrame paramAdFrame)
  {
    if (paramAdFrame == null);
    do
    {
      return false;
      if (FlurryAdModule.getInstance().b(paramAdFrame.g().toString()) != null)
        return true;
    }
    while (paramAdFrame.b().intValue() != 3);
    return true;
  }

  private boolean a(String paramString, long paramLong)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    ay localay = ay.a;
    String str = URLConnection.guessContentTypeFromName(paramString);
    if (str != null)
    {
      if (!str.startsWith("video"))
        break label78;
      eo.a(3, b, "Precaching: asset is a video: " + paramString);
      localay = ay.b;
    }
    while (true)
    {
      return this.a.a(paramString, localay, paramLong);
      label78: if (str.startsWith("image"))
      {
        eo.a(3, b, "Precaching: asset is an image: " + paramString);
        localay = ay.c;
      }
      else if (str.startsWith("text"))
      {
        eo.a(3, b, "Precaching: asset is text: " + paramString);
        localay = ay.d;
      }
      else
      {
        eo.a(5, b, "Precaching: could not identify media type for asset: " + paramString);
      }
    }
  }

  private boolean a(List<CharSequence> paramList, String paramString)
  {
    if (paramList == null)
      return false;
    if (TextUtils.isEmpty(paramString))
      return false;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      if (paramString.equals(((CharSequence)localIterator.next()).toString()))
        return true;
    return false;
  }

  private String b(AdFrame paramAdFrame)
  {
    ci localci = FlurryAdModule.getInstance().b(paramAdFrame.g().toString());
    if (localci != null)
      return localci.f();
    return null;
  }

  private String c(AdFrame paramAdFrame)
  {
    if (paramAdFrame == null);
    while ((paramAdFrame.c() == null) || (paramAdFrame.b().intValue() != 3))
      return null;
    return paramAdFrame.c().toString();
  }

  private boolean c(String paramString)
  {
    if (!this.h);
    do
    {
      do
        return false;
      while (TextUtils.isEmpty(paramString));
      eo.a(3, b, "Precaching: Saving local asset for adUnit.");
    }
    while (!ar.d.equals(this.a.b(paramString)));
    return e(paramString);
  }

  private void d(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    this.a.b(paramString);
  }

  // ERROR //
  private boolean e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 94	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +9 -> 15
    //   9: iconst_0
    //   10: istore 10
    //   12: iload 10
    //   14: ireturn
    //   15: new 246	java/io/File
    //   18: dup
    //   19: ldc 248
    //   21: invokestatic 253	com/flurry/sdk/ce:b	(Ljava/lang/String;)Ljava/io/File;
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial 255	com/flurry/sdk/ap:f	(Ljava/lang/String;)Ljava/lang/String;
    //   29: invokespecial 258	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 261	java/io/File:exists	()Z
    //   37: istore 12
    //   39: iload 12
    //   41: ifeq +31 -> 72
    //   44: aconst_null
    //   45: astore 13
    //   47: aload_2
    //   48: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   51: aload 13
    //   53: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   56: iconst_1
    //   57: istore 10
    //   59: iload 10
    //   61: ifne -49 -> 12
    //   64: aload_3
    //   65: invokevirtual 269	java/io/File:delete	()Z
    //   68: pop
    //   69: iload 10
    //   71: ireturn
    //   72: aload_3
    //   73: invokestatic 274	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   76: ifne +106 -> 182
    //   79: new 244	java/io/IOException
    //   82: dup
    //   83: new 186	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   90: ldc_w 276
    //   93: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_3
    //   97: invokevirtual 279	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   100: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokespecial 280	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: astore 8
    //   112: aconst_null
    //   113: astore 7
    //   115: aload 8
    //   117: astore 9
    //   119: aconst_null
    //   120: astore 6
    //   122: bipush 6
    //   124: getstatic 33	com/flurry/sdk/ap:b	Ljava/lang/String;
    //   127: new 186	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   134: ldc_w 282
    //   137: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload_1
    //   141: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc_w 284
    //   147: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload 9
    //   152: invokevirtual 287	java/io/IOException:getMessage	()Ljava/lang/String;
    //   155: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: aload 9
    //   163: invokestatic 290	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload 6
    //   168: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   171: aload 7
    //   173: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   176: iconst_0
    //   177: istore 10
    //   179: goto -120 -> 59
    //   182: new 292	java/io/FileOutputStream
    //   185: dup
    //   186: aload_3
    //   187: invokespecial 295	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   190: astore 13
    //   192: aload_0
    //   193: getfield 203	com/flurry/sdk/ap:a	Lcom/flurry/sdk/ao;
    //   196: aload_1
    //   197: invokevirtual 298	com/flurry/sdk/ao:c	(Ljava/lang/String;)Lcom/flurry/sdk/aw$b;
    //   200: astore 16
    //   202: aload 16
    //   204: astore_2
    //   205: aload_2
    //   206: ifnull +56 -> 262
    //   209: aload_2
    //   210: invokevirtual 303	com/flurry/sdk/aw$b:a	()Ljava/io/InputStream;
    //   213: aload 13
    //   215: invokestatic 306	com/flurry/sdk/fe:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   218: pop2
    //   219: iconst_3
    //   220: getstatic 33	com/flurry/sdk/ap:b	Ljava/lang/String;
    //   223: new 186	java/lang/StringBuilder
    //   226: dup
    //   227: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   230: ldc_w 308
    //   233: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: aload_1
    //   237: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: ldc_w 310
    //   243: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: aload_3
    //   247: invokevirtual 279	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   250: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: invokestatic 199	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   259: goto -212 -> 47
    //   262: iconst_3
    //   263: getstatic 33	com/flurry/sdk/ap:b	Ljava/lang/String;
    //   266: new 186	java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   273: ldc_w 312
    //   276: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: aload_1
    //   280: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   286: invokestatic 199	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   289: goto -242 -> 47
    //   292: astore 17
    //   294: aload 13
    //   296: astore 7
    //   298: aload_2
    //   299: astore 6
    //   301: aload 17
    //   303: astore 5
    //   305: aload 6
    //   307: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   310: aload 7
    //   312: invokestatic 266	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   315: aload 5
    //   317: athrow
    //   318: astore 4
    //   320: aload 4
    //   322: astore 5
    //   324: aconst_null
    //   325: astore 6
    //   327: aconst_null
    //   328: astore 7
    //   330: goto -25 -> 305
    //   333: astore 15
    //   335: aload 13
    //   337: astore 7
    //   339: aload 15
    //   341: astore 5
    //   343: aconst_null
    //   344: astore 6
    //   346: goto -41 -> 305
    //   349: astore 5
    //   351: goto -46 -> 305
    //   354: astore 14
    //   356: aload 13
    //   358: astore 7
    //   360: aload 14
    //   362: astore 9
    //   364: aconst_null
    //   365: astore 6
    //   367: goto -245 -> 122
    //   370: astore 18
    //   372: aload 13
    //   374: astore 7
    //   376: aload_2
    //   377: astore 6
    //   379: aload 18
    //   381: astore 9
    //   383: goto -261 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   33	39	110	java/io/IOException
    //   72	110	110	java/io/IOException
    //   182	192	110	java/io/IOException
    //   209	259	292	finally
    //   262	289	292	finally
    //   33	39	318	finally
    //   72	110	318	finally
    //   182	192	318	finally
    //   192	202	333	finally
    //   122	166	349	finally
    //   192	202	354	java/io/IOException
    //   209	259	370	java/io/IOException
    //   262	289	370	java/io/IOException
  }

  private String f(String paramString)
  {
    return ce.c(paramString);
  }

  private boolean g(AdUnit paramAdUnit)
  {
    if (paramAdUnit == null)
      return false;
    Iterator localIterator = paramAdUnit.d().iterator();
    while (localIterator.hasNext())
      if (a((AdFrame)localIterator.next()))
        return true;
    return false;
  }

  private void h(AdUnit paramAdUnit)
  {
    if (!this.h)
      return;
    while (paramAdUnit == null);
    Iterator localIterator1 = paramAdUnit.d().iterator();
    while (localIterator1.hasNext())
    {
      AdFrame localAdFrame = (AdFrame)localIterator1.next();
      ap.c localc = ap.c.a(localAdFrame.h().intValue());
      if ((ap.c.a.equals(localc)) || (!a(localAdFrame)))
        break;
      List localList1 = localAdFrame.j();
      List localList2 = localAdFrame.k();
      if ((localList1 != null) && (localList1.size() > 0))
      {
        Iterator localIterator2 = localList1.iterator();
        while (localIterator2.hasNext())
          d(((CharSequence)localIterator2.next()).toString());
      }
      else
      {
        String str1 = b(localAdFrame);
        if ((!TextUtils.isEmpty(str1)) && (!a(localList2, str1)))
          d(str1);
        String str2 = c(localAdFrame);
        if ((!TextUtils.isEmpty(str2)) && (!a(localList2, str2)))
          d(str2);
        String[] arrayOfString = c;
        int j = arrayOfString.length;
        for (int k = 0; k < j; k++)
        {
          String str3 = a(localAdFrame, arrayOfString[k]);
          if ((!TextUtils.isEmpty(str3)) && (!a(localList2, str3)))
            d(str3);
        }
      }
    }
  }

  private List<ap.b> i()
  {
    synchronized (this.i)
    {
      List localList = this.i.a();
      return localList;
    }
  }

  private void j()
  {
    try
    {
      File localFile = ce.b("fileStreamCacheDownloaderTmp");
      eo.a(3, b, "Precaching: Cleaning temp asset directory: " + localFile);
      fd.b(localFile);
      return;
    }
    catch (Exception localException)
    {
      eo.a(6, b, "Precaching: Error cleaning temp asset directory: " + localException.getMessage(), localException);
    }
  }

  public File a(String paramString)
  {
    if (!this.h);
    File localFile;
    do
    {
      do
        return null;
      while (TextUtils.isEmpty(paramString));
      localFile = new File(ce.b("fileStreamCacheDownloaderTmp"), f(paramString));
    }
    while (!localFile.exists());
    return localFile;
  }

  public void a(long paramLong1, long paramLong2)
  {
    try
    {
      boolean bool = this.g;
      if (bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Initializing AssetCacheManager.");
        this.e = paramLong1;
        this.f = paramLong2;
        this.g = true;
      }
    }
    finally
    {
    }
  }

  public void a(ap.b paramb)
  {
    synchronized (this.i)
    {
      this.i.a(paramb);
      return;
    }
  }

  public void a(InputStream paramInputStream)
  {
    if (!this.g)
      return;
    this.a.a(paramInputStream);
  }

  public void a(OutputStream paramOutputStream)
  {
    if (!this.g)
      return;
    this.a.a(paramOutputStream);
  }

  public void a(String paramString, ar paramar)
  {
    try
    {
      Iterator localIterator = i().iterator();
      while (localIterator.hasNext())
        ((ap.b)localIterator.next()).a(paramString, paramar);
    }
    catch (Throwable localThrowable)
    {
      eo.a(6, b, "", localThrowable);
    }
  }

  public void a(String paramString, List<AdUnit> paramList)
  {
    if (!this.h)
      break label7;
    label7: 
    while (paramList == null)
      return;
    eo.a(3, b, "Handling ad response");
    if (TextUtils.isEmpty(paramString))
    {
      if (this.f == 0L);
      for (int j = 5; ; j = (int)(this.e / this.f))
      {
        Iterator localIterator = paramList.iterator();
        int m;
        for (int k = 0; ; k = m)
        {
          if (!localIterator.hasNext())
            break label91;
          m = k + e((AdUnit)localIterator.next());
          if (m >= j)
            break;
        }
        label91: break label7;
      }
    }
    b(paramString, paramList);
  }

  public boolean a(AdUnit paramAdUnit)
  {
    if (!this.h)
      return false;
    if (paramAdUnit == null)
      return false;
    if (!g(paramAdUnit))
      return false;
    Iterator localIterator = paramAdUnit.d().iterator();
    while (localIterator.hasNext())
    {
      ap.c localc = ap.c.a(((AdFrame)localIterator.next()).h().intValue());
      if ((ap.c.b.equals(localc)) || (ap.c.c.equals(localc)))
        return true;
    }
    return false;
  }

  public void b(String paramString)
  {
    if (!this.h)
      return;
    this.a.a(paramString);
  }

  public void b(String paramString, List<AdUnit> paramList)
  {
    if (!this.h)
      break label7;
    label7: 
    while ((paramList == null) || (TextUtils.isEmpty(paramString)))
      return;
    for (int j = -1 + paramList.size(); j >= 0; j--)
      h((AdUnit)paramList.get(j));
    Iterator localIterator = paramList.iterator();
    int k = 0;
    label63: if (localIterator.hasNext())
      if (e((AdUnit)localIterator.next()) <= 0)
        break label113;
    label113: for (int m = 1; ; m = 0)
    {
      int n = m + k;
      if (n >= 2)
        break;
      k = n;
      break label63;
      break label7;
    }
  }

  public boolean b()
  {
    return this.g;
  }

  public boolean b(AdUnit paramAdUnit)
  {
    if (!this.h)
      return false;
    if (paramAdUnit == null)
      return false;
    if (!g(paramAdUnit))
      return false;
    Iterator localIterator = paramAdUnit.d().iterator();
    while (localIterator.hasNext())
    {
      ap.c localc = ap.c.a(((AdFrame)localIterator.next()).h().intValue());
      if ((g(paramAdUnit)) && (ap.c.b.equals(localc)))
        return true;
    }
    return false;
  }

  public boolean b(ap.b paramb)
  {
    synchronized (this.i)
    {
      boolean bool = this.i.b(paramb);
      return bool;
    }
  }

  public ap.a c(AdUnit paramAdUnit)
  {
    Object localObject;
    label12: Iterator localIterator;
    if (!this.h)
    {
      localObject = ap.a.f;
      break label52;
      return localObject;
    }
    else
    {
      if (paramAdUnit == null)
        return ap.a.d;
      if (!g(paramAdUnit))
        return ap.a.d;
      ap.a locala = ap.a.a;
      localIterator = paramAdUnit.d().iterator();
      localObject = locala;
    }
    while (true)
    {
      label52: if (!localIterator.hasNext())
        break label12;
      AdFrame localAdFrame = (AdFrame)localIterator.next();
      if (!a(localAdFrame))
        break;
      String str1 = b(localAdFrame);
      if (!TextUtils.isEmpty(str1))
        localObject = a((ap.a)localObject, this.a.b(str1));
      String str2 = c(localAdFrame);
      if (!TextUtils.isEmpty(str2))
        localObject = a((ap.a)localObject, this.a.b(str2));
      String[] arrayOfString = c;
      int j = arrayOfString.length;
      for (int k = 0; k < j; k++)
      {
        String str3 = a(localAdFrame, arrayOfString[k]);
        if (!TextUtils.isEmpty(str3))
          localObject = a((ap.a)localObject, this.a.b(str3));
      }
    }
  }

  public void c()
  {
    try
    {
      boolean bool = this.g;
      if (!bool);
      while (true)
      {
        return;
        if (!this.h)
        {
          eo.a(3, b, "Precaching: Starting AssetCacheManager.");
          this.a = new ao("fileStreamCacheDownloader", this.e, this.f, false);
          this.a.a(this);
          this.a.a();
          this.h = true;
        }
      }
    }
    finally
    {
    }
  }

  public void d()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Stopping AssetCacheManager.");
        this.a.b();
        this.h = false;
      }
    }
    finally
    {
    }
  }

  public boolean d(AdUnit paramAdUnit)
  {
    if (!this.h)
      return false;
    if (paramAdUnit == null)
      return false;
    eo.a(3, b, "Precaching: Saving local assets for adUnit.");
    j();
    Iterator localIterator = paramAdUnit.d().iterator();
    while (localIterator.hasNext())
    {
      AdFrame localAdFrame = (AdFrame)localIterator.next();
      if (a(localAdFrame))
      {
        String str1 = b(localAdFrame);
        if ((!TextUtils.isEmpty(str1)) && (!c(str1)))
          return false;
        String str2 = c(localAdFrame);
        if ((!TextUtils.isEmpty(str2)) && (!c(str2)))
          return false;
        String[] arrayOfString = c;
        int j = arrayOfString.length;
        for (int k = 0; k < j; k++)
        {
          String str3 = a(localAdFrame, arrayOfString[k]);
          if ((!TextUtils.isEmpty(str3)) && (!c(str3)))
            return false;
        }
      }
    }
    return true;
  }

  public int e(AdUnit paramAdUnit)
  {
    if (!this.h);
    while (paramAdUnit == null)
      return 0;
    Iterator localIterator1 = paramAdUnit.d().iterator();
    int j = 0;
    while (localIterator1.hasNext())
    {
      AdFrame localAdFrame = (AdFrame)localIterator1.next();
      ap.c localc = ap.c.a(localAdFrame.h().intValue());
      if ((!ap.c.a.equals(localc)) && (a(localAdFrame)))
      {
        List localList1 = localAdFrame.j();
        List localList2 = localAdFrame.k();
        long l = localAdFrame.i().longValue();
        if ((localList1 != null) && (localList1.size() > 0))
        {
          Iterator localIterator2 = localList1.iterator();
          while (localIterator2.hasNext())
            if (a(((CharSequence)localIterator2.next()).toString(), l))
              j++;
        }
        else
        {
          String str1 = b(localAdFrame);
          if ((!TextUtils.isEmpty(str1)) && (!a(localList2, str1)) && (a(str1, l)))
            j++;
          String str2 = c(localAdFrame);
          if ((!TextUtils.isEmpty(str2)) && (!a(localList2, str2)) && (a(str2, l)))
            j++;
          String[] arrayOfString = c;
          int k = arrayOfString.length;
          for (int m = 0; m < k; m++)
          {
            String str3 = a(localAdFrame, arrayOfString[m]);
            if ((!TextUtils.isEmpty(str3)) && (!a(localList2, str3)) && (a(str3, l)))
              j++;
          }
        }
      }
    }
    return j;
  }

  public void e()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Pausing AssetCacheManager.");
        this.a.c();
      }
    }
    finally
    {
    }
  }

  public void f()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Resuming AssetCacheManager.");
        this.a.d();
      }
    }
    finally
    {
    }
  }

  public void f(AdUnit paramAdUnit)
  {
    if (!this.h)
      return;
    while (paramAdUnit == null);
    Iterator localIterator1 = paramAdUnit.d().iterator();
    while (localIterator1.hasNext())
    {
      AdFrame localAdFrame = (AdFrame)localIterator1.next();
      ap.c localc = ap.c.a(localAdFrame.h().intValue());
      if ((ap.c.a.equals(localc)) || (!a(localAdFrame)))
        break;
      List localList1 = localAdFrame.j();
      List localList2 = localAdFrame.k();
      localAdFrame.i().longValue();
      if ((localList1 != null) && (localList1.size() > 0))
      {
        Iterator localIterator2 = localList1.iterator();
        while (localIterator2.hasNext())
          b(((CharSequence)localIterator2.next()).toString());
      }
      else
      {
        String str1 = b(localAdFrame);
        if ((!TextUtils.isEmpty(str1)) && (!a(localList2, str1)))
          b(str1.toString());
        String str2 = c(localAdFrame);
        if ((!TextUtils.isEmpty(str2)) && (!a(localList2, str2)))
          b(str2.toString());
        String[] arrayOfString = c;
        int j = arrayOfString.length;
        for (int k = 0; k < j; k++)
        {
          String str3 = a(localAdFrame, arrayOfString[k]);
          if ((!TextUtils.isEmpty(str3)) && (!a(localList2, str3)))
            b(str3.toString());
        }
      }
    }
  }

  public void g()
  {
    if (!this.h)
      return;
    this.a.e();
  }

  public List<aq> h()
  {
    if (!this.h)
      return Collections.emptyList();
    return this.a.h();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ap
 * JD-Core Version:    0.6.2
 */