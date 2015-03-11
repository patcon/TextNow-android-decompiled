package textnow.bb;

import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

public abstract class a
{
  protected String a = "";
  protected m b = new e();
  protected final l c;
  protected int d = 2000;
  protected int e = 8000;
  private Map<String, String> f = new TreeMap();
  private boolean g;

  static
  {
    if (CookieHandler.getDefault() == null)
      CookieHandler.setDefault(new CookieManager());
  }

  public a(String paramString, l paraml)
  {
    this.a = paramString;
    this.c = paraml;
  }

  private int a(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    OutputStream localOutputStream = null;
    int i;
    try
    {
      localOutputStream = paramHttpURLConnection.getOutputStream();
      if (localOutputStream != null)
        this.c.a(localOutputStream, paramArrayOfByte);
      i = paramHttpURLConnection.getResponseCode();
      if (localOutputStream == null);
    }
    finally
    {
      try
      {
        localOutputStream.close();
        return i;
        localObject = finally;
        if (localOutputStream != null);
        try
        {
          localOutputStream.close();
          label49: throw localObject;
        }
        catch (Exception localException1)
        {
          break label49;
        }
      }
      catch (Exception localException2)
      {
      }
    }
    return i;
  }

  private HttpURLConnection a(String paramString)
  {
    String str = this.a + paramString;
    try
    {
      new URL(str);
      return this.c.a(str);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new IllegalArgumentException(str + " is not a valid URL", localMalformedURLException);
    }
  }

  // ERROR //
  private j a(String paramString1, g paramg, String paramString2, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: iconst_0
    //   5: putfield 111	textnow/bb/a:g	Z
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial 112	textnow/bb/a:a	(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   13: astore 18
    //   15: aload 18
    //   17: astore 8
    //   19: aload 8
    //   21: aload_0
    //   22: getfield 53	textnow/bb/a:d	I
    //   25: invokevirtual 116	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   28: aload 8
    //   30: aload_0
    //   31: getfield 55	textnow/bb/a:e	I
    //   34: invokevirtual 119	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   37: aload_0
    //   38: getfield 57	textnow/bb/a:c	Ltextnow/bb/l;
    //   41: aload 8
    //   43: aload_2
    //   44: aload_3
    //   45: invokeinterface 122 4 0
    //   50: aload_0
    //   51: getfield 51	textnow/bb/a:f	Ljava/util/Map;
    //   54: invokeinterface 128 1 0
    //   59: invokeinterface 134 1 0
    //   64: astore 20
    //   66: aload 20
    //   68: invokeinterface 140 1 0
    //   73: ifeq +110 -> 183
    //   76: aload 20
    //   78: invokeinterface 144 1 0
    //   83: checkcast 146	java/lang/String
    //   86: astore 23
    //   88: aload 8
    //   90: aload 23
    //   92: aload_0
    //   93: getfield 51	textnow/bb/a:f	Ljava/util/Map;
    //   96: aload 23
    //   98: invokeinterface 150 2 0
    //   103: checkcast 146	java/lang/String
    //   106: invokevirtual 154	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: goto -43 -> 66
    //   112: astore 19
    //   114: aload 19
    //   116: astore 7
    //   118: aload_0
    //   119: aload 8
    //   121: invokespecial 157	textnow/bb/a:b	(Ljava/net/HttpURLConnection;)Ltextnow/bb/j;
    //   124: astore 14
    //   126: aload 14
    //   128: astore 15
    //   130: aload 15
    //   132: ifnull +342 -> 474
    //   135: aload 15
    //   137: invokevirtual 161	textnow/bb/j:a	()I
    //   140: istore 17
    //   142: iload 17
    //   144: ifle +330 -> 474
    //   147: aload_0
    //   148: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   151: invokeinterface 165 1 0
    //   156: ifeq +14 -> 170
    //   159: aload_0
    //   160: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   163: aload 15
    //   165: invokeinterface 168 2 0
    //   170: aload 8
    //   172: ifnull +8 -> 180
    //   175: aload 8
    //   177: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   180: aload 15
    //   182: areturn
    //   183: aload_0
    //   184: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   187: invokeinterface 165 1 0
    //   192: ifeq +16 -> 208
    //   195: aload_0
    //   196: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   199: aload 8
    //   201: aload 4
    //   203: invokeinterface 174 3 0
    //   208: aload 8
    //   210: invokevirtual 177	java/net/HttpURLConnection:connect	()V
    //   213: aload_0
    //   214: iconst_1
    //   215: putfield 111	textnow/bb/a:g	Z
    //   218: aload 8
    //   220: invokevirtual 180	java/net/HttpURLConnection:getDoOutput	()Z
    //   223: ifeq +17 -> 240
    //   226: aload 4
    //   228: ifnull +12 -> 240
    //   231: aload_0
    //   232: aload 8
    //   234: aload 4
    //   236: invokespecial 182	textnow/bb/a:a	(Ljava/net/HttpURLConnection;[B)I
    //   239: pop
    //   240: aload 8
    //   242: invokevirtual 185	java/net/HttpURLConnection:getDoInput	()Z
    //   245: ifeq +46 -> 291
    //   248: aload_0
    //   249: aload 8
    //   251: invokespecial 187	textnow/bb/a:a	(Ljava/net/HttpURLConnection;)Ltextnow/bb/j;
    //   254: astore 22
    //   256: aload 22
    //   258: astore 15
    //   260: aload_0
    //   261: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   264: invokeinterface 165 1 0
    //   269: ifeq +14 -> 283
    //   272: aload_0
    //   273: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   276: aload 15
    //   278: invokeinterface 168 2 0
    //   283: aload 8
    //   285: ifnull -105 -> 180
    //   288: goto -113 -> 175
    //   291: new 159	textnow/bb/j
    //   294: dup
    //   295: aload 8
    //   297: aconst_null
    //   298: invokespecial 190	textnow/bb/j:<init>	(Ljava/net/HttpURLConnection;[B)V
    //   301: astore 15
    //   303: goto -43 -> 260
    //   306: astore 10
    //   308: aload_0
    //   309: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   312: invokeinterface 165 1 0
    //   317: ifeq +14 -> 331
    //   320: aload_0
    //   321: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   324: aload 5
    //   326: invokeinterface 168 2 0
    //   331: aload 8
    //   333: ifnull +8 -> 341
    //   336: aload 8
    //   338: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   341: aload 10
    //   343: athrow
    //   344: astore 12
    //   346: aload 7
    //   348: invokevirtual 193	java/lang/Exception:printStackTrace	()V
    //   351: iconst_0
    //   352: ifeq +111 -> 463
    //   355: aconst_null
    //   356: invokevirtual 161	textnow/bb/j:a	()I
    //   359: istore 13
    //   361: iload 13
    //   363: ifle +100 -> 463
    //   366: aload_0
    //   367: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   370: invokeinterface 165 1 0
    //   375: ifeq +13 -> 388
    //   378: aload_0
    //   379: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   382: aconst_null
    //   383: invokeinterface 168 2 0
    //   388: aload 8
    //   390: ifnull +8 -> 398
    //   393: aload 8
    //   395: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   398: aconst_null
    //   399: areturn
    //   400: astore 9
    //   402: iconst_0
    //   403: ifeq +49 -> 452
    //   406: aconst_null
    //   407: invokevirtual 161	textnow/bb/j:a	()I
    //   410: istore 11
    //   412: iload 11
    //   414: ifle +38 -> 452
    //   417: aload_0
    //   418: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   421: invokeinterface 165 1 0
    //   426: ifeq +13 -> 439
    //   429: aload_0
    //   430: getfield 46	textnow/bb/a:b	Ltextnow/bb/m;
    //   433: aconst_null
    //   434: invokeinterface 168 2 0
    //   439: aload 8
    //   441: ifnull -43 -> 398
    //   444: aload 8
    //   446: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   449: goto -51 -> 398
    //   452: new 195	textnow/bb/i
    //   455: dup
    //   456: aload 7
    //   458: aconst_null
    //   459: invokespecial 198	textnow/bb/i:<init>	(Ljava/lang/Exception;Ltextnow/bb/j;)V
    //   462: athrow
    //   463: new 195	textnow/bb/i
    //   466: dup
    //   467: aload 7
    //   469: aconst_null
    //   470: invokespecial 198	textnow/bb/i:<init>	(Ljava/lang/Exception;Ltextnow/bb/j;)V
    //   473: athrow
    //   474: new 195	textnow/bb/i
    //   477: dup
    //   478: aload 7
    //   480: aload 15
    //   482: invokespecial 198	textnow/bb/i:<init>	(Ljava/lang/Exception;Ltextnow/bb/j;)V
    //   485: athrow
    //   486: astore 16
    //   488: aload 15
    //   490: astore 5
    //   492: aload 16
    //   494: astore 10
    //   496: goto -188 -> 308
    //   499: astore 10
    //   501: aconst_null
    //   502: astore 5
    //   504: aconst_null
    //   505: astore 8
    //   507: goto -199 -> 308
    //   510: astore 6
    //   512: aload 6
    //   514: astore 7
    //   516: aconst_null
    //   517: astore 8
    //   519: goto -401 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   19	66	112	java/lang/Exception
    //   66	109	112	java/lang/Exception
    //   183	208	112	java/lang/Exception
    //   208	226	112	java/lang/Exception
    //   231	240	112	java/lang/Exception
    //   240	256	112	java/lang/Exception
    //   291	303	112	java/lang/Exception
    //   19	66	306	finally
    //   66	109	306	finally
    //   183	208	306	finally
    //   208	226	306	finally
    //   231	240	306	finally
    //   240	256	306	finally
    //   291	303	306	finally
    //   355	361	306	finally
    //   406	412	306	finally
    //   452	463	306	finally
    //   463	474	306	finally
    //   118	126	344	java/lang/Exception
    //   118	126	400	finally
    //   346	351	400	finally
    //   135	142	486	finally
    //   474	486	486	finally
    //   3	15	499	finally
    //   3	15	510	java/lang/Exception
  }

  // ERROR //
  private j a(HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 202	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   4: astore 5
    //   6: aload 5
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_3
    //   13: ifnull +15 -> 28
    //   16: aload_0
    //   17: getfield 57	textnow/bb/a:c	Ltextnow/bb/l;
    //   20: aload_3
    //   21: invokeinterface 205 2 0
    //   26: astore 6
    //   28: new 159	textnow/bb/j
    //   31: dup
    //   32: aload_1
    //   33: aload 6
    //   35: invokespecial 190	textnow/bb/j:<init>	(Ljava/net/HttpURLConnection;[B)V
    //   38: astore 7
    //   40: aload_3
    //   41: ifnull +7 -> 48
    //   44: aload_3
    //   45: invokevirtual 208	java/io/InputStream:close	()V
    //   48: aload 7
    //   50: areturn
    //   51: astore_2
    //   52: aconst_null
    //   53: astore_3
    //   54: aload_3
    //   55: ifnull +7 -> 62
    //   58: aload_3
    //   59: invokevirtual 208	java/io/InputStream:close	()V
    //   62: aload_2
    //   63: athrow
    //   64: astore 4
    //   66: goto -4 -> 62
    //   69: astore 8
    //   71: aload 7
    //   73: areturn
    //   74: astore_2
    //   75: goto -21 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	51	finally
    //   58	62	64	java/lang/Exception
    //   44	48	69	java/lang/Exception
    //   16	28	74	finally
    //   28	40	74	finally
  }

  private j a(h paramh)
  {
    try
    {
      j localj = a(paramh.a(), paramh.b(), paramh.c(), paramh.d());
      return localj;
    }
    catch (i locali)
    {
      this.c.a(locali);
      return null;
    }
    catch (Exception localException)
    {
      this.c.a(new i(localException, null));
    }
    return null;
  }

  public static k a()
  {
    return new k();
  }

  // ERROR //
  private j b(HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 233	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   4: astore 5
    //   6: aload 5
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_3
    //   13: ifnull +15 -> 28
    //   16: aload_0
    //   17: getfield 57	textnow/bb/a:c	Ltextnow/bb/l;
    //   20: aload_3
    //   21: invokeinterface 205 2 0
    //   26: astore 6
    //   28: new 159	textnow/bb/j
    //   31: dup
    //   32: aload_1
    //   33: aload 6
    //   35: invokespecial 190	textnow/bb/j:<init>	(Ljava/net/HttpURLConnection;[B)V
    //   38: astore 7
    //   40: aload_3
    //   41: ifnull +7 -> 48
    //   44: aload_3
    //   45: invokevirtual 208	java/io/InputStream:close	()V
    //   48: aload 7
    //   50: areturn
    //   51: astore_2
    //   52: aconst_null
    //   53: astore_3
    //   54: aload_3
    //   55: ifnull +7 -> 62
    //   58: aload_3
    //   59: invokevirtual 208	java/io/InputStream:close	()V
    //   62: aload_2
    //   63: athrow
    //   64: astore 4
    //   66: goto -4 -> 62
    //   69: astore 8
    //   71: aload 7
    //   73: areturn
    //   74: astore_2
    //   75: goto -21 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	51	finally
    //   58	62	64	java/lang/Exception
    //   44	48	69	java/lang/Exception
    //   16	28	74	finally
    //   28	40	74	finally
  }

  public final a a(String paramString1, String paramString2)
  {
    this.f.put(paramString1, paramString2);
    return this;
  }

  public final j a(String paramString, k paramk)
  {
    return a(new f(paramString, paramk));
  }

  public final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(m paramm)
  {
    this.b = paramm;
  }

  public final void b(int paramInt)
  {
    this.e = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bb.a
 * JD-Core Version:    0.6.2
 */