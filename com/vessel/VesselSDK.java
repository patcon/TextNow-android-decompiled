package com.vessel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.vessel.a.a;
import com.vessel.a.b;
import com.vessel.errors.VesselError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONObject;
import textnow.b.c;
import textnow.b.d;
import textnow.b.h;

public class VesselSDK
{
  public static final String SDK_VERSION = "VesselSDK 1.9.1";
  public static final String VESSEL_INSTALL_DATE = "vessel_install_date";
  public static final String VESSEL_VERSION_CODE = "version_code";
  protected static long a = 1800L;
  protected static Map<String, String> f = null;
  static final Object g = new Object();
  private static int h = 10000;
  private static VesselSDK m;
  JSONObject b = null;
  boolean c = false;
  volatile boolean d = false;
  volatile boolean e = false;
  private long i = 0L;
  private Context j;
  private String k;
  private String l;

  private VesselSDK(Context paramContext, final String paramString1, String paramString2)
  {
    if (paramContext == null)
      return;
    this.j = paramContext;
    this.l = h.b(paramString2);
    try
    {
      if (TextUtils.isEmpty(paramString1))
        return;
    }
    finally
    {
    }
    if (paramString1.equalsIgnoreCase(this.k))
      return;
    final String str = h.b(this.j);
    if (h.b(this.j, str + "blocked", false))
      return;
    if (!h.b(this.j, "android.permission.INTERNET"))
      return;
    if (TextUtils.isEmpty(str))
      return;
    new Thread(new Runnable()
    {
      public final void run()
      {
        String str1 = VesselSDK.a(VesselSDK.this);
        VesselAB.a(VesselSDK.e(), VesselSDK.b(VesselSDK.this));
        if (h.f(VesselSDK.b(VesselSDK.this)))
          new StringBuilder("To add as test device,visit https://vessel.io/testdevice/activate/").append(str1).toString();
        String str2 = h.a(VesselSDK.b(VesselSDK.this), "version_code");
        String str3 = h.a(VesselSDK.b(VesselSDK.this), "secret_key");
        if ((TextUtils.isEmpty(str2)) || (!str3.equalsIgnoreCase(paramString1)))
        {
          Context localContext = VesselSDK.b(VesselSDK.this);
          if ((localContext != null) && (!TextUtils.isEmpty("secret_key")))
          {
            SharedPreferences.Editor localEditor = localContext.getSharedPreferences("zubhium-sdk", 0).edit();
            localEditor.remove("secret_key");
            localEditor.commit();
          }
          h.b(VesselSDK.b(VesselSDK.this), "vessel_install_date", System.currentTimeMillis() / 1000L);
          h.a(VesselSDK.b(VesselSDK.this), "new_user", true);
          VesselSDK.this.a(true, str, paramString1);
          return;
        }
        if (!str2.equalsIgnoreCase(str))
        {
          h.a(VesselSDK.b(VesselSDK.this), "new_user", false);
          VesselSDK.this.a(true, str, paramString1);
          return;
        }
        VesselSDK.this.a(false, str, str3);
      }
    }
    , "initialize_sdk").start();
  }

  private List<Header> a(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(7);
    localArrayList.add(new BasicHeader("p", "android"));
    localArrayList.add(new BasicHeader("sec", this.k));
    localArrayList.add(new BasicHeader("zv", "1.9.1"));
    if (this.j == null);
    for (String str = ""; ; str = this.j.getPackageName())
    {
      localArrayList.add(new BasicHeader("appid", str));
      localArrayList.add(new BasicHeader("appvc", h.b(this.j)));
      localArrayList.add(new BasicHeader("appver", h.a(this.j)));
      localArrayList.add(new BasicHeader("uuid", f()));
      if (paramBoolean)
        localArrayList.add(new BasicHeader("If-None-Match", h.a(this.j, "initETag")));
      return localArrayList;
    }
  }

  private JSONObject a(Context paramContext, JSONObject paramJSONObject)
  {
    if (paramJSONObject != null);
    try
    {
      if (paramJSONObject.optBoolean("blocked", false))
      {
        String str = h.b(paramContext);
        h.a(paramContext, str + "blocked", true);
      }
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("features");
      if (localJSONObject2 != null)
      {
        h.a(paramContext, "vessel.kill_switch", localJSONObject2.optBoolean("kill_switch", true));
        h.a(paramContext, "vessel.crash_reporting", localJSONObject2.optBoolean("crash_reporting", true));
        h.a(paramContext, "vessel.handled_exception", localJSONObject2.optBoolean("handled_exception", true));
        h.a(paramContext, "vessel.logcat", localJSONObject2.optBoolean("logcat", true));
      }
      JSONObject localJSONObject3 = paramJSONObject.optJSONObject("config");
      if (localJSONObject3 != null)
        h.b(paramContext, "vessel.syncTimeOut", localJSONObject3.optLong("syncTimeOut", a));
      JSONObject localJSONObject4 = paramJSONObject.optJSONObject("response");
      localJSONObject1 = localJSONObject4;
      return localJSONObject1;
    }
    catch (Exception localException)
    {
      while (true)
        JSONObject localJSONObject1 = null;
    }
    finally
    {
    }
  }

  private String f()
  {
    String str = h.a(this.j, "uuid");
    if (TextUtils.isEmpty(str))
    {
      new c(this.j);
      str = c.a();
      if (!TextUtils.isEmpty(str))
        h.a(this.j, "uuid", str);
    }
    return str;
  }

  private void g()
  {
    try
    {
      if (this.j != null)
        h.b(this.j, "vessel.lastSync", System.nanoTime());
      return;
    }
    finally
    {
    }
  }

  public static Map<String, String> getCustomFilterProperties()
  {
    return f;
  }

  public static VesselSDK getInstance()
  {
    if ((m != null) && (m.a()))
      return m;
    throw new NullPointerException();
  }

  public static int getNetworkTimeout()
  {
    return h;
  }

  public static String getUserId()
  {
    if (m != null)
      return m.l;
    return null;
  }

  private boolean h()
  {
    boolean bool = true;
    long l1;
    try
    {
      if (h.f(this.j))
        return bool;
      l1 = h.a(this.j, "vessel.lastSync", Long.valueOf(0L).longValue());
      if (l1 == 0L)
        return bool;
    }
    finally
    {
    }
    long l2 = System.nanoTime() - l1;
    if (TimeUnit.SECONDS.convert(l2, TimeUnit.NANOSECONDS) > h.a(this.j, "vessel.syncTimeOut", a));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static VesselSDK initialize(Context paramContext, String paramString)
  {
    synchronized (g)
    {
      if (m == null)
        m = new VesselSDK(paramContext, paramString, null);
      return m;
    }
  }

  public static VesselSDK initialize(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (g)
    {
      if (m == null)
        m = new VesselSDK(paramContext, paramString1, paramString2);
      return m;
    }
  }

  public static void setCustomFilterProperties(Map<String, String> paramMap)
  {
    f = paramMap;
  }

  public static void setNetworkTimeout(int paramInt)
  {
    h = paramInt;
  }

  public static void setUserId(String paramString)
  {
    if (m != null)
      m.l = h.b(paramString);
  }

  // ERROR //
  protected final void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   6: astore 5
    //   8: aload 5
    //   10: ifnonnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: iload_1
    //   17: ifeq +359 -> 376
    //   20: aload_0
    //   21: invokespecial 127	com/vessel/VesselSDK:f	()Ljava/lang/String;
    //   24: astore 11
    //   26: aload 11
    //   28: bipush 252
    //   30: aload 11
    //   32: invokevirtual 302	java/lang/String:length	()I
    //   35: iadd
    //   36: invokevirtual 306	java/lang/String:substring	(I)Ljava/lang/String;
    //   39: bipush 16
    //   41: invokestatic 312	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
    //   44: sipush 1000
    //   47: irem
    //   48: istore 12
    //   50: iconst_2
    //   51: anewarray 4	java/lang/Object
    //   54: astore 13
    //   56: aload 13
    //   58: iconst_0
    //   59: aload_3
    //   60: aastore
    //   61: aload 13
    //   63: iconst_1
    //   64: iload 12
    //   66: i2l
    //   67: invokestatic 315	java/lang/Long:toString	(J)Ljava/lang/String;
    //   70: aastore
    //   71: ldc_w 317
    //   74: aload 13
    //   76: invokestatic 321	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   79: aload_0
    //   80: iconst_1
    //   81: invokespecial 323	com/vessel/VesselSDK:a	(Z)Ljava/util/List;
    //   84: invokestatic 328	textnow/b/d:a	(Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;
    //   87: astore 14
    //   89: aload_0
    //   90: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   93: ifnull +35 -> 128
    //   96: aload_0
    //   97: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   100: invokestatic 333	textnow/a/a:a	(Landroid/content/Context;)Lorg/json/JSONObject;
    //   103: invokestatic 338	com/vessel/a/c:a	(Lorg/json/JSONObject;)Ljava/lang/String;
    //   106: astore 18
    //   108: aload 18
    //   110: invokestatic 77	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   113: ifne +15 -> 128
    //   116: aload_0
    //   117: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   120: invokestatic 343	com/vessel/a/b:a	(Landroid/content/Context;)Lcom/vessel/a/b;
    //   123: aload 18
    //   125: invokevirtual 345	com/vessel/a/b:b	(Ljava/lang/String;)V
    //   128: aload_0
    //   129: aload_3
    //   130: putfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   133: getstatic 229	com/vessel/VesselSDK:m	Lcom/vessel/VesselSDK;
    //   136: aload_0
    //   137: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   140: invokestatic 350	com/vessel/VesselAB:a	(Lcom/vessel/VesselSDK;Landroid/content/Context;)Lcom/vessel/VesselAB;
    //   143: astore 15
    //   145: aload 14
    //   147: ifnull +75 -> 222
    //   150: aload 14
    //   152: ldc_w 352
    //   155: invokevirtual 355	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   158: ifeq +20 -> 178
    //   161: aload_0
    //   162: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   165: ldc 168
    //   167: aload 14
    //   169: ldc_w 352
    //   172: invokevirtual 358	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   175: invokestatic 238	textnow/b/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload 14
    //   180: ldc_w 360
    //   183: invokevirtual 364	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   186: astore 16
    //   188: aload 16
    //   190: ifnull +32 -> 222
    //   193: aload 16
    //   195: invokevirtual 367	org/json/JSONArray:length	()I
    //   198: ifle +24 -> 222
    //   201: aload_0
    //   202: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   205: invokestatic 343	com/vessel/a/b:a	(Landroid/content/Context;)Lcom/vessel/a/b;
    //   208: aload 16
    //   210: invokevirtual 370	com/vessel/a/b:a	(Lorg/json/JSONArray;)V
    //   213: aload_0
    //   214: invokespecial 372	com/vessel/VesselSDK:g	()V
    //   217: aload 15
    //   219: invokevirtual 374	com/vessel/VesselAB:b	()V
    //   222: aload 15
    //   224: invokevirtual 376	com/vessel/VesselAB:a	()V
    //   227: aload_0
    //   228: aload_0
    //   229: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   232: aload 14
    //   234: invokespecial 378	com/vessel/VesselSDK:a	(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   237: pop
    //   238: aload_0
    //   239: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   242: ldc 240
    //   244: invokestatic 246	java/lang/System:nanoTime	()J
    //   247: invokestatic 223	textnow/b/h:b	(Landroid/content/Context;Ljava/lang/String;J)V
    //   250: aload_0
    //   251: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   254: ldc_w 380
    //   257: aload_0
    //   258: getfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   261: invokestatic 238	textnow/b/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   268: ldc 14
    //   270: aload_2
    //   271: invokestatic 238	textnow/b/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   274: goto -261 -> 13
    //   277: astore 9
    //   279: getstatic 229	com/vessel/VesselSDK:m	Lcom/vessel/VesselSDK;
    //   282: aload_0
    //   283: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   286: invokestatic 350	com/vessel/VesselAB:a	(Lcom/vessel/VesselSDK;Landroid/content/Context;)Lcom/vessel/VesselAB;
    //   289: invokevirtual 376	com/vessel/VesselAB:a	()V
    //   292: aload_0
    //   293: ldc 154
    //   295: putfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   298: new 90	java/lang/StringBuilder
    //   301: dup
    //   302: ldc_w 382
    //   305: invokespecial 384	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   308: aload 9
    //   310: invokevirtual 387	com/vessel/errors/VesselError:getMessage	()Ljava/lang/String;
    //   313: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: pop
    //   320: goto -307 -> 13
    //   323: astore 4
    //   325: aload_0
    //   326: monitorexit
    //   327: aload 4
    //   329: athrow
    //   330: astore 7
    //   332: getstatic 229	com/vessel/VesselSDK:m	Lcom/vessel/VesselSDK;
    //   335: aload_0
    //   336: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   339: invokestatic 350	com/vessel/VesselAB:a	(Lcom/vessel/VesselSDK;Landroid/content/Context;)Lcom/vessel/VesselAB;
    //   342: invokevirtual 376	com/vessel/VesselAB:a	()V
    //   345: aload_0
    //   346: ldc 154
    //   348: putfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   351: new 90	java/lang/StringBuilder
    //   354: dup
    //   355: ldc_w 382
    //   358: invokespecial 384	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   361: aload 7
    //   363: invokevirtual 388	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   366: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   372: pop
    //   373: goto -360 -> 13
    //   376: aload_0
    //   377: aload_3
    //   378: putfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   381: getstatic 229	com/vessel/VesselSDK:m	Lcom/vessel/VesselSDK;
    //   384: aload_0
    //   385: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   388: invokestatic 350	com/vessel/VesselAB:a	(Lcom/vessel/VesselSDK;Landroid/content/Context;)Lcom/vessel/VesselAB;
    //   391: astore 6
    //   393: aload 6
    //   395: invokevirtual 374	com/vessel/VesselAB:b	()V
    //   398: aload 6
    //   400: invokevirtual 376	com/vessel/VesselAB:a	()V
    //   403: aload_0
    //   404: invokevirtual 389	com/vessel/VesselSDK:b	()V
    //   407: goto -394 -> 13
    //
    // Exception table:
    //   from	to	target	type
    //   20	128	277	com/vessel/errors/VesselError
    //   128	145	277	com/vessel/errors/VesselError
    //   150	178	277	com/vessel/errors/VesselError
    //   178	188	277	com/vessel/errors/VesselError
    //   193	222	277	com/vessel/errors/VesselError
    //   222	274	277	com/vessel/errors/VesselError
    //   2	8	323	finally
    //   20	128	323	finally
    //   128	145	323	finally
    //   150	178	323	finally
    //   178	188	323	finally
    //   193	222	323	finally
    //   222	274	323	finally
    //   279	320	323	finally
    //   332	373	323	finally
    //   376	407	323	finally
    //   20	128	330	java/lang/Exception
    //   128	145	330	java/lang/Exception
    //   150	178	330	java/lang/Exception
    //   178	188	330	java/lang/Exception
    //   193	222	330	java/lang/Exception
    //   222	274	330	java/lang/Exception
  }

  final boolean a()
  {
    return !TextUtils.isEmpty(this.k);
  }

  // ERROR //
  protected final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 60	com/vessel/VesselSDK:d	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 60	com/vessel/VesselSDK:d	Z
    //   15: aload_0
    //   16: invokespecial 391	com/vessel/VesselSDK:h	()Z
    //   19: ifeq +162 -> 181
    //   22: aload_0
    //   23: monitorenter
    //   24: aload_0
    //   25: invokespecial 127	com/vessel/VesselSDK:f	()Ljava/lang/String;
    //   28: astore 6
    //   30: aload 6
    //   32: bipush 252
    //   34: aload 6
    //   36: invokevirtual 302	java/lang/String:length	()I
    //   39: iadd
    //   40: invokevirtual 306	java/lang/String:substring	(I)Ljava/lang/String;
    //   43: bipush 16
    //   45: invokestatic 312	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
    //   48: sipush 1000
    //   51: irem
    //   52: istore 7
    //   54: iconst_2
    //   55: anewarray 4	java/lang/Object
    //   58: astore 8
    //   60: aload 8
    //   62: iconst_0
    //   63: aload_0
    //   64: getfield 79	com/vessel/VesselSDK:k	Ljava/lang/String;
    //   67: aastore
    //   68: aload 8
    //   70: iconst_1
    //   71: iload 7
    //   73: i2l
    //   74: invokestatic 315	java/lang/Long:toString	(J)Ljava/lang/String;
    //   77: aastore
    //   78: ldc_w 317
    //   81: aload 8
    //   83: invokestatic 321	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   86: aload_0
    //   87: iconst_1
    //   88: invokespecial 323	com/vessel/VesselSDK:a	(Z)Ljava/util/List;
    //   91: invokestatic 328	textnow/b/d:a	(Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;
    //   94: astore 9
    //   96: aload 9
    //   98: ifnull +70 -> 168
    //   101: aload 9
    //   103: ldc_w 352
    //   106: invokevirtual 355	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   109: ifeq +20 -> 129
    //   112: aload_0
    //   113: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   116: ldc 168
    //   118: aload 9
    //   120: ldc_w 352
    //   123: invokevirtual 358	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokestatic 238	textnow/b/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload 9
    //   131: ldc_w 360
    //   134: invokevirtual 364	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   137: astore 10
    //   139: aload_0
    //   140: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   143: invokestatic 343	com/vessel/a/b:a	(Landroid/content/Context;)Lcom/vessel/a/b;
    //   146: aload 10
    //   148: invokevirtual 370	com/vessel/a/b:a	(Lorg/json/JSONArray;)V
    //   151: aload_0
    //   152: invokespecial 372	com/vessel/VesselSDK:g	()V
    //   155: getstatic 229	com/vessel/VesselSDK:m	Lcom/vessel/VesselSDK;
    //   158: aload_0
    //   159: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   162: invokestatic 350	com/vessel/VesselAB:a	(Lcom/vessel/VesselSDK;Landroid/content/Context;)Lcom/vessel/VesselAB;
    //   165: invokevirtual 374	com/vessel/VesselAB:b	()V
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 64	com/vessel/VesselSDK:j	Landroid/content/Context;
    //   173: aload 9
    //   175: invokespecial 378	com/vessel/VesselSDK:a	(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   178: pop
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_0
    //   182: invokevirtual 393	com/vessel/VesselSDK:d	()V
    //   185: aload_0
    //   186: iconst_0
    //   187: putfield 60	com/vessel/VesselSDK:d	Z
    //   190: aload_0
    //   191: monitorexit
    //   192: return
    //   193: astore_1
    //   194: aload_0
    //   195: monitorexit
    //   196: aload_1
    //   197: athrow
    //   198: astore 4
    //   200: new 90	java/lang/StringBuilder
    //   203: dup
    //   204: ldc_w 395
    //   207: invokespecial 384	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: aload 4
    //   212: invokevirtual 387	com/vessel/errors/VesselError:getMessage	()Ljava/lang/String;
    //   215: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: pop
    //   222: goto -43 -> 179
    //   225: astore_2
    //   226: aload_2
    //   227: athrow
    //   228: astore_3
    //   229: aload_0
    //   230: monitorexit
    //   231: aload_3
    //   232: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   10	24	193	finally
    //   181	192	193	finally
    //   229	233	193	finally
    //   24	96	198	com/vessel/errors/VesselError
    //   101	129	198	com/vessel/errors/VesselError
    //   129	168	198	com/vessel/errors/VesselError
    //   168	179	198	com/vessel/errors/VesselError
    //   24	96	225	finally
    //   101	129	225	finally
    //   129	168	225	finally
    //   168	179	225	finally
    //   200	222	225	finally
    //   179	181	228	finally
    //   226	228	228	finally
  }

  protected final void c()
  {
    if (this.d)
      return;
    try
    {
      new Thread(new Runnable()
      {
        public final void run()
        {
          VesselSDK.this.b();
        }
      }).start();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void d()
  {
    int n = 1;
    if (this.e)
      return;
    while (true)
    {
      try
      {
        this.e = true;
        if ((h.f(this.j)) || (this.c))
        {
          if (n != 0)
            break;
          return;
        }
      }
      finally
      {
      }
      long l1 = this.i;
      long l2 = System.currentTimeMillis();
      if (l1 >= l2 - 300000L)
        n = 0;
    }
    try
    {
      b localb = b.a(this.j);
      a locala = localb.b();
      if (locala != null)
      {
        int i1 = locala.a.length;
        if (i1 != 0);
      }
      else
      {
        this.e = false;
        return;
      }
      if (d.a("/report/events/", locala.b, a(false)).optBoolean("success"))
        localb.a(locala.a);
      try
      {
        this.i = System.currentTimeMillis();
        h.b(this.j, "last_report", this.i);
        this.e = false;
        return;
      }
      finally
      {
        localObject3 = finally;
        throw localObject3;
      }
    }
    catch (VesselError localVesselError)
    {
      while (true)
        this.e = false;
    }
    finally
    {
      this.e = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.VesselSDK
 * JD-Core Version:    0.6.2
 */