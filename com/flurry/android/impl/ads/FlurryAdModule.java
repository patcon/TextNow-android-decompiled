package com.flurry.android.impl.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdListener;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryFullscreenTakeoverActivity;
import com.flurry.android.ICustomAdNetworkHandler;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdReportedId;
import com.flurry.android.impl.ads.avro.protocol.v10.AdReportedId.Builder;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.Callback;
import com.flurry.android.impl.ads.avro.protocol.v10.FrequencyCapInfo;
import com.flurry.android.impl.ads.avro.protocol.v10.FrequencyCapInfo.Builder;
import com.flurry.android.impl.ads.avro.protocol.v10.Location.Builder;
import com.flurry.android.impl.ads.avro.protocol.v10.SdkLogRequest;
import com.flurry.android.impl.ads.avro.protocol.v10.SdkLogRequest.Builder;
import com.flurry.sdk.a;
import com.flurry.sdk.ac;
import com.flurry.sdk.ad;
import com.flurry.sdk.ae;
import com.flurry.sdk.ah;
import com.flurry.sdk.ai;
import com.flurry.sdk.ak;
import com.flurry.sdk.am;
import com.flurry.sdk.ap;
import com.flurry.sdk.c;
import com.flurry.sdk.cd;
import com.flurry.sdk.cg;
import com.flurry.sdk.ci;
import com.flurry.sdk.co;
import com.flurry.sdk.cp;
import com.flurry.sdk.cx;
import com.flurry.sdk.dj;
import com.flurry.sdk.dl;
import com.flurry.sdk.dn;
import com.flurry.sdk.do;
import com.flurry.sdk.dr;
import com.flurry.sdk.du;
import com.flurry.sdk.du.a;
import com.flurry.sdk.dv;
import com.flurry.sdk.dz;
import com.flurry.sdk.e;
import com.flurry.sdk.eo;
import com.flurry.sdk.et;
import com.flurry.sdk.ev;
import com.flurry.sdk.ev.a;
import com.flurry.sdk.fe;
import com.flurry.sdk.ff;
import com.flurry.sdk.g;
import com.flurry.sdk.j;
import com.flurry.sdk.k;
import com.flurry.sdk.l;
import com.flurry.sdk.n.e;
import com.flurry.sdk.o;
import com.flurry.sdk.p;
import com.flurry.sdk.q;
import com.flurry.sdk.r;
import com.flurry.sdk.s;
import com.flurry.sdk.t;
import com.flurry.sdk.u;
import com.flurry.sdk.x;
import com.flurry.sdk.y;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FlurryAdModule
  implements ae, du, et
{
  private static FlurryAdModule L;
  private static List<Integer> p;
  private static final String q = FlurryAdModule.class.getSimpleName();
  private AdUnit A;
  private e B;
  private AdUnit C;
  private final k D;
  private final ak E;
  private WeakReference<FlurryAdListener> F = new WeakReference(null);
  private CharSequence G;
  private final List<Activity> H;
  private final List<e> I = new ArrayList();
  private final Map<String, String> J;
  private final Set<String> K;
  private boolean M;
  private ac N;
  private s O;
  private r P;
  private u Q = new u(this);
  private t R = new t(this);
  volatile Map<String, String> a;
  volatile TreeMap<String, Integer> b;
  long c;
  long d;
  long e;
  y f = y.a();
  ap g = ap.a();
  public ICustomAdNetworkHandler h;
  int i;
  volatile Map<String, e> j = new HashMap();
  volatile Map<String, ci> k = new HashMap();
  volatile Map<String, am> l = new HashMap();
  volatile List<String> m = new ArrayList();
  volatile boolean n = false;
  Map<String, String> o;
  private File r = null;
  private File s = null;
  private File t = null;
  private String u;
  private String v;
  private String w;
  private volatile String x = null;
  private volatile String y = null;
  private e z;

  public FlurryAdModule()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("playVideo", "directOpen");
    localHashMap.put("open", "directOpen");
    localHashMap.put("expand", "doExpand");
    localHashMap.put("collapse", "doCollapse");
    this.J = Collections.unmodifiableMap(localHashMap);
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(Arrays.asList(new String[] { "notifyUser", "nextFrame", "closeAd", "expandAd", "collapseAd", "verifyURL" }));
    this.K = Collections.unmodifiableSet(localHashSet);
    this.P = new r(this);
    Integer[] arrayOfInteger = new Integer[6];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    arrayOfInteger[2] = Integer.valueOf(2);
    arrayOfInteger[3] = Integer.valueOf(3);
    arrayOfInteger[4] = Integer.valueOf(4);
    arrayOfInteger[5] = Integer.valueOf(5);
    p = Arrays.asList(arrayOfInteger);
    this.u = Build.VERSION.RELEASE;
    this.v = Build.DEVICE;
    this.a = new HashMap();
    this.D = new o();
    this.E = new p();
    this.H = new ArrayList();
    this.b = new TreeMap();
  }

  private SdkLogRequest a(List<e> paramList)
  {
    List localList1 = cd.a(paramList);
    if (localList1.isEmpty())
    {
      eo.a(3, q, "List of adLogs is empty");
      return null;
    }
    String str = j();
    if (TextUtils.isEmpty(str))
    {
      eo.a(3, q, "ApiKey is null.");
      return null;
    }
    List localList2 = E();
    SdkLogRequest localSdkLogRequest = SdkLogRequest.b().a(str).a(localList2).b(localList1).a(false).a(System.currentTimeMillis()).b(Integer.toString(dn.a().b())).a();
    eo.a(3, q, "Got ad log request:" + localSdkLogRequest.toString());
    return localSdkLogRequest;
  }

  private void ad()
  {
    try
    {
      SdkLogRequest localSdkLogRequest = a(this.I);
      this.I.clear();
      this.O.a(localSdkLogRequest, D(), j(), "" + dn.a().b());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private void ae()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: iconst_4
    //   5: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   8: ldc_w 385
    //   11: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 102	com/flurry/android/impl/ads/FlurryAdModule:r	Ljava/io/File;
    //   18: invokestatic 390	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   21: istore 8
    //   23: iload 8
    //   25: ifne +14 -> 39
    //   28: aconst_null
    //   29: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   32: aconst_null
    //   33: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: new 397	java/io/FileOutputStream
    //   42: dup
    //   43: aload_0
    //   44: getfield 102	com/flurry/android/impl/ads/FlurryAdModule:r	Ljava/io/File;
    //   47: invokespecial 400	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   50: astore 5
    //   52: new 402	java/io/DataOutputStream
    //   55: dup
    //   56: aload 5
    //   58: invokespecial 405	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   61: astore 7
    //   63: aload_0
    //   64: getfield 148	com/flurry/android/impl/ads/FlurryAdModule:I	Ljava/util/List;
    //   67: aload 7
    //   69: invokestatic 410	com/flurry/sdk/d:a	(Ljava/util/List;Ljava/io/DataOutput;)V
    //   72: aload 7
    //   74: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   77: aload 5
    //   79: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   82: goto -46 -> 36
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    //   90: astore 6
    //   92: aconst_null
    //   93: astore 7
    //   95: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   98: ldc_w 412
    //   101: aload 6
    //   103: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   106: aload 7
    //   108: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   111: aload_1
    //   112: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   115: goto -79 -> 36
    //   118: aload 4
    //   120: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   123: aload 5
    //   125: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   128: aload_3
    //   129: athrow
    //   130: astore_3
    //   131: aconst_null
    //   132: astore 4
    //   134: goto -16 -> 118
    //   137: astore_3
    //   138: aload 7
    //   140: astore 4
    //   142: goto -24 -> 118
    //   145: astore_3
    //   146: aload_1
    //   147: astore 5
    //   149: aload 7
    //   151: astore 4
    //   153: goto -35 -> 118
    //   156: astore 6
    //   158: aload 5
    //   160: astore_1
    //   161: aconst_null
    //   162: astore 7
    //   164: goto -69 -> 95
    //   167: astore 6
    //   169: aload 5
    //   171: astore_1
    //   172: goto -77 -> 95
    //   175: astore_3
    //   176: aconst_null
    //   177: astore 4
    //   179: aconst_null
    //   180: astore 5
    //   182: goto -64 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   4	14	85	finally
    //   28	36	85	finally
    //   72	82	85	finally
    //   106	115	85	finally
    //   118	130	85	finally
    //   14	23	90	java/lang/Exception
    //   39	52	90	java/lang/Exception
    //   52	63	130	finally
    //   63	72	137	finally
    //   95	106	145	finally
    //   52	63	156	java/lang/Exception
    //   63	72	167	java/lang/Exception
    //   14	23	175	finally
    //   39	52	175	finally
  }

  // ERROR //
  private void af()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: iconst_4
    //   5: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   8: ldc_w 417
    //   11: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 102	com/flurry/android/impl/ads/FlurryAdModule:r	Ljava/io/File;
    //   18: invokevirtual 422	java/io/File:exists	()Z
    //   21: istore_3
    //   22: iload_3
    //   23: ifeq +129 -> 152
    //   26: new 424	java/io/FileInputStream
    //   29: dup
    //   30: aload_0
    //   31: getfield 102	com/flurry/android/impl/ads/FlurryAdModule:r	Ljava/io/File;
    //   34: invokespecial 425	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: astore 4
    //   39: new 427	java/io/DataInputStream
    //   42: dup
    //   43: aload 4
    //   45: invokespecial 430	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   48: astore 5
    //   50: aload_0
    //   51: getfield 148	com/flurry/android/impl/ads/FlurryAdModule:I	Ljava/util/List;
    //   54: aload 5
    //   56: invokestatic 433	com/flurry/sdk/d:a	(Ljava/io/DataInput;)Ljava/util/List;
    //   59: invokeinterface 434 2 0
    //   64: pop
    //   65: iconst_1
    //   66: istore 8
    //   68: aload 5
    //   70: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   73: aload 4
    //   75: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   78: iload 8
    //   80: ifne +21 -> 101
    //   83: iconst_3
    //   84: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   87: ldc_w 436
    //   90: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   93: aload_0
    //   94: getfield 102	com/flurry/android/impl/ads/FlurryAdModule:r	Ljava/io/File;
    //   97: invokevirtual 439	java/io/File:delete	()Z
    //   100: pop
    //   101: aload_0
    //   102: monitorexit
    //   103: return
    //   104: astore 6
    //   106: aconst_null
    //   107: astore 5
    //   109: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   112: ldc_w 441
    //   115: aload 6
    //   117: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   120: aload 5
    //   122: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   125: aload_1
    //   126: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   129: iconst_0
    //   130: istore 8
    //   132: goto -54 -> 78
    //   135: aload 5
    //   137: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   140: aload_1
    //   141: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   144: aload 7
    //   146: athrow
    //   147: astore_2
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_2
    //   151: athrow
    //   152: iconst_3
    //   153: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   156: ldc_w 443
    //   159: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   162: goto -61 -> 101
    //   165: astore 7
    //   167: aload 4
    //   169: astore_1
    //   170: aconst_null
    //   171: astore 5
    //   173: goto -38 -> 135
    //   176: astore 7
    //   178: aload 4
    //   180: astore_1
    //   181: goto -46 -> 135
    //   184: astore 7
    //   186: goto -51 -> 135
    //   189: astore 6
    //   191: aload 4
    //   193: astore_1
    //   194: aconst_null
    //   195: astore 5
    //   197: goto -88 -> 109
    //   200: astore 6
    //   202: aload 4
    //   204: astore_1
    //   205: goto -96 -> 109
    //   208: astore 7
    //   210: aconst_null
    //   211: astore 5
    //   213: aconst_null
    //   214: astore_1
    //   215: goto -80 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   26	39	104	java/lang/Exception
    //   4	22	147	finally
    //   68	78	147	finally
    //   83	101	147	finally
    //   120	129	147	finally
    //   135	147	147	finally
    //   152	162	147	finally
    //   39	50	165	finally
    //   50	65	176	finally
    //   109	120	184	finally
    //   39	50	189	java/lang/Exception
    //   50	65	200	java/lang/Exception
    //   26	39	208	finally
  }

  public static FlurryAdModule getInstance()
  {
    try
    {
      if (L == null)
        L = new FlurryAdModule();
      FlurryAdModule localFlurryAdModule = L;
      return localFlurryAdModule;
    }
    finally
    {
    }
  }

  public static boolean i()
  {
    return ((KeyguardManager)do.a().b().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
  }

  public void A()
  {
    this.o = null;
  }

  public Map<String, String> B()
  {
    Map localMap = z();
    if (this.N != null)
    {
      String str = this.N.a();
      if (!TextUtils.isEmpty(str))
        localMap.put("appCloudUserId", str);
    }
    return localMap;
  }

  public void C()
  {
    try
    {
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.e(FlurryAdModule.this);
        }
      });
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String D()
  {
    return x() + "/v2/postAdLog.do";
  }

  public List<AdReportedId> E()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = dn.a().l().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add(AdReportedId.b().a((ByteBuffer)localEntry.getValue()).a(((dr)localEntry.getKey()).d).a());
    }
    return localArrayList;
  }

  public List<FrequencyCapInfo> F()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.f.c().iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      localArrayList.add(FrequencyCapInfo.b().a(localx.b()).b(localx.h()).b(localx.e()).c(localx.f()).d(localx.g()).a(localx.i()).a(localx.c()).a());
    }
    return localArrayList;
  }

  // ERROR //
  public void G()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_4
    //   3: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   6: ldc_w 599
    //   9: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 124	com/flurry/android/impl/ads/FlurryAdModule:f	Lcom/flurry/sdk/y;
    //   16: invokevirtual 601	com/flurry/sdk/y:d	()V
    //   19: aload_0
    //   20: getfield 104	com/flurry/android/impl/ads/FlurryAdModule:s	Ljava/io/File;
    //   23: invokestatic 390	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   26: istore 7
    //   28: iload 7
    //   30: ifne +14 -> 44
    //   33: aconst_null
    //   34: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   37: aconst_null
    //   38: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: new 397	java/io/FileOutputStream
    //   47: dup
    //   48: aload_0
    //   49: getfield 104	com/flurry/android/impl/ads/FlurryAdModule:s	Ljava/io/File;
    //   52: invokespecial 400	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   55: astore 6
    //   57: new 402	java/io/DataOutputStream
    //   60: dup
    //   61: aload 6
    //   63: invokespecial 405	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 124	com/flurry/android/impl/ads/FlurryAdModule:f	Lcom/flurry/sdk/y;
    //   71: invokevirtual 553	com/flurry/sdk/y:c	()Ljava/util/List;
    //   74: invokeinterface 554 1 0
    //   79: astore 8
    //   81: aload 8
    //   83: invokeinterface 513 1 0
    //   88: ifeq +61 -> 149
    //   91: aload 8
    //   93: invokeinterface 517 1 0
    //   98: checkcast 556	com/flurry/sdk/x
    //   101: astore 9
    //   103: aload_3
    //   104: iconst_1
    //   105: invokevirtual 605	java/io/DataOutputStream:writeShort	(I)V
    //   108: aload 9
    //   110: aload_3
    //   111: invokevirtual 608	com/flurry/sdk/x:a	(Ljava/io/DataOutput;)V
    //   114: goto -33 -> 81
    //   117: astore_2
    //   118: aload 6
    //   120: astore 4
    //   122: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   125: ldc_w 610
    //   128: aload_2
    //   129: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: aload_3
    //   133: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   136: aload 4
    //   138: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   141: goto -100 -> 41
    //   144: astore_1
    //   145: aload_0
    //   146: monitorexit
    //   147: aload_1
    //   148: athrow
    //   149: aload_3
    //   150: iconst_0
    //   151: invokevirtual 605	java/io/DataOutputStream:writeShort	(I)V
    //   154: aload_3
    //   155: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   158: aload 6
    //   160: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   163: goto -122 -> 41
    //   166: aload_3
    //   167: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   170: aload 6
    //   172: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   175: aload 5
    //   177: athrow
    //   178: astore 5
    //   180: aconst_null
    //   181: astore_3
    //   182: goto -16 -> 166
    //   185: astore 5
    //   187: goto -21 -> 166
    //   190: astore 5
    //   192: aload 4
    //   194: astore 6
    //   196: goto -30 -> 166
    //   199: astore_2
    //   200: aconst_null
    //   201: astore_3
    //   202: aconst_null
    //   203: astore 4
    //   205: goto -83 -> 122
    //   208: astore_2
    //   209: aload 6
    //   211: astore 4
    //   213: aconst_null
    //   214: astore_3
    //   215: goto -93 -> 122
    //   218: astore 5
    //   220: aconst_null
    //   221: astore_3
    //   222: aconst_null
    //   223: astore 6
    //   225: goto -59 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   67	81	117	java/lang/Exception
    //   81	114	117	java/lang/Exception
    //   149	154	117	java/lang/Exception
    //   2	19	144	finally
    //   33	41	144	finally
    //   132	141	144	finally
    //   154	163	144	finally
    //   166	178	144	finally
    //   57	67	178	finally
    //   67	81	185	finally
    //   81	114	185	finally
    //   149	154	185	finally
    //   122	132	190	finally
    //   19	28	199	java/lang/Exception
    //   44	57	199	java/lang/Exception
    //   57	67	208	java/lang/Exception
    //   19	28	218	finally
    //   44	57	218	finally
  }

  // ERROR //
  void H()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_4
    //   3: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   6: ldc_w 612
    //   9: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 104	com/flurry/android/impl/ads/FlurryAdModule:s	Ljava/io/File;
    //   16: invokevirtual 422	java/io/File:exists	()Z
    //   19: istore_2
    //   20: iload_2
    //   21: ifeq +146 -> 167
    //   24: new 424	java/io/FileInputStream
    //   27: dup
    //   28: aload_0
    //   29: getfield 104	com/flurry/android/impl/ads/FlurryAdModule:s	Ljava/io/File;
    //   32: invokespecial 425	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: astore_3
    //   36: new 427	java/io/DataInputStream
    //   39: dup
    //   40: aload_3
    //   41: invokespecial 430	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   44: astore 4
    //   46: aload 4
    //   48: invokevirtual 616	java/io/DataInputStream:readShort	()S
    //   51: ifeq +77 -> 128
    //   54: aload_0
    //   55: getfield 124	com/flurry/android/impl/ads/FlurryAdModule:f	Lcom/flurry/sdk/y;
    //   58: new 556	com/flurry/sdk/x
    //   61: dup
    //   62: aload 4
    //   64: invokespecial 619	com/flurry/sdk/x:<init>	(Ljava/io/DataInput;)V
    //   67: invokevirtual 622	com/flurry/sdk/y:a	(Lcom/flurry/sdk/x;)V
    //   70: goto -24 -> 46
    //   73: astore 6
    //   75: aload_3
    //   76: astore 7
    //   78: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   81: ldc_w 624
    //   84: aload 6
    //   86: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   89: aload 4
    //   91: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   94: aload 7
    //   96: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   99: iconst_0
    //   100: istore 8
    //   102: iload 8
    //   104: ifne +21 -> 125
    //   107: iconst_3
    //   108: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   111: ldc_w 626
    //   114: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   117: aload_0
    //   118: getfield 104	com/flurry/android/impl/ads/FlurryAdModule:s	Ljava/io/File;
    //   121: invokevirtual 439	java/io/File:delete	()Z
    //   124: pop
    //   125: aload_0
    //   126: monitorexit
    //   127: return
    //   128: iconst_1
    //   129: istore 8
    //   131: aload 4
    //   133: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   136: aload_3
    //   137: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   140: goto -38 -> 102
    //   143: astore_1
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_1
    //   147: athrow
    //   148: astore 5
    //   150: aconst_null
    //   151: astore 4
    //   153: aconst_null
    //   154: astore_3
    //   155: aload 4
    //   157: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   160: aload_3
    //   161: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   164: aload 5
    //   166: athrow
    //   167: iconst_3
    //   168: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   171: ldc_w 628
    //   174: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   177: goto -52 -> 125
    //   180: astore 5
    //   182: aconst_null
    //   183: astore 4
    //   185: goto -30 -> 155
    //   188: astore 5
    //   190: goto -35 -> 155
    //   193: astore 5
    //   195: aload 7
    //   197: astore_3
    //   198: goto -43 -> 155
    //   201: astore 6
    //   203: aconst_null
    //   204: astore 4
    //   206: aconst_null
    //   207: astore 7
    //   209: goto -131 -> 78
    //   212: astore 6
    //   214: aload_3
    //   215: astore 7
    //   217: aconst_null
    //   218: astore 4
    //   220: goto -142 -> 78
    //
    // Exception table:
    //   from	to	target	type
    //   46	70	73	java/lang/Exception
    //   2	20	143	finally
    //   89	99	143	finally
    //   107	125	143	finally
    //   131	140	143	finally
    //   155	167	143	finally
    //   167	177	143	finally
    //   24	36	148	finally
    //   36	46	180	finally
    //   46	70	188	finally
    //   78	89	193	finally
    //   24	36	201	java/lang/Exception
    //   36	46	212	java/lang/Exception
  }

  public void I()
  {
    try
    {
      this.g.c();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void J()
  {
    try
    {
      this.g.d();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void K()
  {
    try
    {
      this.g.e();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void L()
  {
    try
    {
      this.g.f();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public void M()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 129	com/flurry/sdk/ap:a	()Lcom/flurry/sdk/ap;
    //   5: invokevirtual 637	com/flurry/sdk/ap:b	()Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifne +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: iconst_4
    //   17: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   20: ldc_w 639
    //   23: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 106	com/flurry/android/impl/ads/FlurryAdModule:t	Ljava/io/File;
    //   30: invokestatic 390	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   33: istore 6
    //   35: iload 6
    //   37: ifne +15 -> 52
    //   40: aconst_null
    //   41: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   44: goto -31 -> 13
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    //   52: new 397	java/io/FileOutputStream
    //   55: dup
    //   56: aload_0
    //   57: getfield 106	com/flurry/android/impl/ads/FlurryAdModule:t	Ljava/io/File;
    //   60: invokespecial 400	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   63: astore 4
    //   65: invokestatic 129	com/flurry/sdk/ap:a	()Lcom/flurry/sdk/ap;
    //   68: aload 4
    //   70: invokevirtual 641	com/flurry/sdk/ap:a	(Ljava/io/OutputStream;)V
    //   73: aload 4
    //   75: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   78: goto -65 -> 13
    //   81: astore 5
    //   83: aconst_null
    //   84: astore 4
    //   86: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   89: ldc_w 643
    //   92: aload 5
    //   94: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: aload 4
    //   99: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   102: goto -89 -> 13
    //   105: aload 4
    //   107: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   110: aload_3
    //   111: athrow
    //   112: astore_3
    //   113: goto -8 -> 105
    //   116: astore 5
    //   118: goto -32 -> 86
    //   121: astore_3
    //   122: aconst_null
    //   123: astore 4
    //   125: goto -20 -> 105
    //
    // Exception table:
    //   from	to	target	type
    //   2	9	47	finally
    //   16	26	47	finally
    //   40	44	47	finally
    //   73	78	47	finally
    //   97	102	47	finally
    //   105	112	47	finally
    //   26	35	81	java/lang/Exception
    //   52	65	81	java/lang/Exception
    //   65	73	112	finally
    //   86	97	112	finally
    //   65	73	116	java/lang/Exception
    //   26	35	121	finally
    //   52	65	121	finally
  }

  // ERROR //
  void N()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 129	com/flurry/sdk/ap:a	()Lcom/flurry/sdk/ap;
    //   5: invokevirtual 637	com/flurry/sdk/ap:b	()Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifne +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: iconst_4
    //   17: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   20: ldc_w 645
    //   23: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 106	com/flurry/android/impl/ads/FlurryAdModule:t	Ljava/io/File;
    //   30: invokevirtual 422	java/io/File:exists	()Z
    //   33: istore_3
    //   34: iload_3
    //   35: ifeq +110 -> 145
    //   38: new 424	java/io/FileInputStream
    //   41: dup
    //   42: aload_0
    //   43: getfield 106	com/flurry/android/impl/ads/FlurryAdModule:t	Ljava/io/File;
    //   46: invokespecial 425	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: astore 4
    //   51: invokestatic 129	com/flurry/sdk/ap:a	()Lcom/flurry/sdk/ap;
    //   54: aload 4
    //   56: invokevirtual 647	com/flurry/sdk/ap:a	(Ljava/io/InputStream;)V
    //   59: iconst_1
    //   60: istore 7
    //   62: aconst_null
    //   63: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   66: aload 4
    //   68: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   71: iload 7
    //   73: ifne -60 -> 13
    //   76: iconst_3
    //   77: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   80: ldc_w 649
    //   83: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield 106	com/flurry/android/impl/ads/FlurryAdModule:t	Ljava/io/File;
    //   90: invokevirtual 439	java/io/File:delete	()Z
    //   93: pop
    //   94: goto -81 -> 13
    //   97: astore_1
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    //   102: astore 5
    //   104: aconst_null
    //   105: astore 4
    //   107: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   110: ldc_w 651
    //   113: aload 5
    //   115: invokestatic 415	com/flurry/sdk/eo:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aconst_null
    //   119: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   122: aload 4
    //   124: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   127: iconst_0
    //   128: istore 7
    //   130: goto -59 -> 71
    //   133: aconst_null
    //   134: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   137: aload 4
    //   139: invokestatic 395	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   142: aload 6
    //   144: athrow
    //   145: iconst_3
    //   146: getstatic 97	com/flurry/android/impl/ads/FlurryAdModule:q	Ljava/lang/String;
    //   149: ldc_w 653
    //   152: invokestatic 289	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   155: goto -142 -> 13
    //   158: astore 6
    //   160: goto -27 -> 133
    //   163: astore 5
    //   165: goto -58 -> 107
    //   168: astore 6
    //   170: aconst_null
    //   171: astore 4
    //   173: goto -40 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   2	9	97	finally
    //   16	34	97	finally
    //   62	71	97	finally
    //   76	94	97	finally
    //   118	127	97	finally
    //   133	145	97	finally
    //   145	155	97	finally
    //   38	51	102	java/lang/Exception
    //   51	59	158	finally
    //   107	118	158	finally
    //   51	59	163	java/lang/Exception
    //   38	51	168	finally
  }

  public e O()
  {
    return a(a(null), "unfilled", true, null);
  }

  public e P()
  {
    return this.z;
  }

  public AdUnit Q()
  {
    return this.A;
  }

  public e R()
  {
    return this.B;
  }

  public AdUnit S()
  {
    return this.C;
  }

  public ev.a T()
  {
    return ev.a().e();
  }

  public boolean U()
  {
    return (this.G != null) && (this.G.length() > 0);
  }

  public CharSequence V()
  {
    return this.G;
  }

  public y W()
  {
    return this.f;
  }

  public List<Integer> X()
  {
    return p;
  }

  public boolean Y()
  {
    return this.n;
  }

  public String Z()
  {
    return this.u;
  }

  Intent a(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return (Intent)paramIntent.getParcelableExtra("targetIntent");
  }

  public ah a(Context paramContext, AdUnit paramAdUnit, String paramString, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize)
  {
    if (paramAdUnit == null);
    List localList;
    do
    {
      return null;
      localList = paramAdUnit.d();
    }
    while ((localList == null) || (localList.isEmpty()));
    AdFrame localAdFrame = (AdFrame)localList.get(0);
    String str1 = localAdFrame.e().e().toString();
    String str2 = localAdFrame.g().toString();
    e locale1 = (e)this.j.get(str2);
    if (locale1 == null);
    for (e locale2 = a(str2); ; locale2 = locale1)
    {
      a(new q("filled", Collections.emptyMap(), paramContext, paramAdUnit, locale2, 0), this.P, 1);
      if (str1.equals("takeover"))
      {
        eo.a(3, q, "prepareAd: first frame of AdUnit is a takeover");
        return new ai(this, paramAdUnit, locale2);
      }
      eo.a(3, q, "prepareAd: first frame of AdUnit is a banner");
      return new j(this, paramAdUnit, locale2);
    }
  }

  c a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    try
    {
      c localc = new c(paramString, paramBoolean, o(), paramMap);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public ci a(String paramString, ci paramci)
  {
    synchronized (this.k)
    {
      ci localci = (ci)this.k.put(paramString, paramci);
      return localci;
    }
  }

  public e a(e parame, String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    try
    {
      eo.a(3, q, "changeAdState(" + parame + ", " + paramString + ", " + paramBoolean + ", " + paramMap + ")");
      try
      {
        if (!this.I.contains(parame))
        {
          this.I.add(parame);
          eo.a(3, q, "changeAdState added adLog = " + parame);
        }
        parame.a(a(paramString, paramBoolean, paramMap));
        return parame;
      }
      finally
      {
      }
    }
    finally
    {
    }
  }

  public e a(String paramString)
  {
    try
    {
      e locale = (e)this.j.get(paramString);
      if (locale == null)
      {
        locale = new e(h(), paramString, o());
        if (this.I.size() < 32767)
        {
          this.I.add(locale);
          this.j.put(locale.b(), locale);
        }
      }
      return locale;
    }
    finally
    {
    }
  }

  public l a(Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    return this.Q.a(this, paramContext, paramViewGroup, paramString);
  }

  public r a()
  {
    return this.P;
  }

  public List<a> a(AdFrame paramAdFrame, q paramq)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = paramAdFrame.f();
    String str1 = paramq.a;
    Iterator localIterator1 = localList.iterator();
    while (localIterator1.hasNext())
    {
      Callback localCallback = (Callback)localIterator1.next();
      if (localCallback.b().toString().equals(str1))
      {
        Iterator localIterator2 = localCallback.c().iterator();
        while (localIterator2.hasNext())
        {
          CharSequence localCharSequence = (CharSequence)localIterator2.next();
          HashMap localHashMap = new HashMap();
          Object localObject = localCharSequence.toString();
          int i1 = ((String)localObject).indexOf('?');
          if (i1 != -1)
          {
            String str2 = ((String)localObject).substring(0, i1);
            String str3 = ((String)localObject).substring(i1 + 1);
            if (str3.contains("%{eventParams}"))
            {
              str3 = str3.replace("%{eventParams}", "");
              localHashMap.putAll(paramq.b);
            }
            localHashMap.putAll(fe.f(str3));
            localObject = str2;
          }
          localArrayList.add(new a((String)localObject, localHashMap, paramq));
        }
      }
    }
    return localArrayList;
  }

  public void a(long paramLong1, long paramLong2)
  {
    try
    {
      boolean bool = this.g.b();
      if (bool);
      while (true)
      {
        return;
        Context localContext = do.a().b();
        eo.a(3, q, "Precaching: initing from FlurryAdModule");
        this.g.a(paramLong1, paramLong2);
        this.g.c();
        this.t = localContext.getFileStreamPath(v());
        b(new ff()
        {
          public void a()
          {
            FlurryAdModule.this.N();
          }
        });
      }
    }
    finally
    {
    }
  }

  void a(Activity paramActivity)
  {
    int i1 = 1;
    Activity localActivity;
    AdUnit localAdUnit2;
    int i2;
    AdUnit localAdUnit1;
    if (i1 == this.H.size())
    {
      localActivity = (Activity)this.H.get(0);
      if (!(localActivity instanceof FlurryFullscreenTakeoverActivity))
        break label149;
      FlurryFullscreenTakeoverActivity localFlurryFullscreenTakeoverActivity = (FlurryFullscreenTakeoverActivity)localActivity;
      localAdUnit2 = localFlurryFullscreenTakeoverActivity.getAdUnit();
      g localg = localFlurryFullscreenTakeoverActivity.getAdUnityView();
      if (localg == null)
        break label139;
      i2 = localg.getAdFrameIndex();
      localAdUnit1 = localAdUnit2;
    }
    while (true)
    {
      if ((localAdUnit1 != null) && ((localAdUnit1.e().intValue() != i1) || (i2 > 0)))
        if ((paramActivity != null) && ((paramActivity instanceof FlurryFullscreenTakeoverActivity)))
          if (((FlurryFullscreenTakeoverActivity)paramActivity).getResult() == n.e.b)
            break label133;
      label133: for (int i3 = i1; ; i3 = 0)
      {
        i1 = i3;
        if (i1 != 0)
          localActivity.finish();
        return;
      }
      label139: i2 = -1;
      localAdUnit1 = localAdUnit2;
      continue;
      label149: i2 = -1;
      localAdUnit1 = null;
    }
  }

  public void a(Activity paramActivity, Bundle paramBundle)
  {
    if (paramActivity == null);
    final String str;
    final FlurryAdListener localFlurryAdListener;
    do
    {
      Intent localIntent;
      do
      {
        return;
        this.H.add(paramActivity);
        localIntent = paramActivity.getIntent();
        str = b(localIntent);
        a(paramActivity, str);
      }
      while (a(localIntent) == null);
      localFlurryAdListener = ac();
      eo.a(3, q, "Firing onApplicationExit, listener=" + localFlurryAdListener);
    }
    while (localFlurryAdListener == null);
    do.a().a(new ff()
    {
      public void a()
      {
        localFlurryAdListener.onApplicationExit(str);
      }
    });
  }

  public void a(Activity paramActivity, du.a parama)
  {
    this.Q.a(paramActivity, parama);
  }

  public void a(Context paramContext, AdUnit paramAdUnit, ah paramah)
  {
    if ("takeover".equals(((AdFrame)paramAdUnit.d().get(0)).e().e().toString()))
      K();
    e locale = (e)this.j.get(((AdFrame)paramAdUnit.d().get(0)).g().toString());
    a(new q("requested", Collections.emptyMap(), paramContext, paramah.c(), locale, 0), this.P, 0);
  }

  public void a(Context paramContext, final String paramString)
  {
    this.i = (1 + this.i);
    if (1 == this.i)
    {
      final FlurryAdListener localFlurryAdListener = ac();
      eo.a(3, q, "Firing onAdOpened, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.onAdOpened(paramString);
          }
        });
    }
  }

  public void a(FlurryAdListener paramFlurryAdListener)
  {
    this.F = new WeakReference(paramFlurryAdListener);
  }

  public void a(ICustomAdNetworkHandler paramICustomAdNetworkHandler)
  {
    this.h = paramICustomAdNetworkHandler;
  }

  public void a(AdUnit paramAdUnit)
  {
    this.A = paramAdUnit;
  }

  public void a(dj paramdj)
  {
    C();
  }

  public void a(dj paramdj, Context paramContext)
  {
    this.N = new ac();
    if (this.O == null)
      this.O = new s();
    this.c = paramdj.m();
    this.d = paramdj.n();
    this.e = 0L;
    this.w = cg.a(paramContext);
  }

  public void a(e parame)
  {
    this.z = parame;
  }

  public void a(ff paramff)
  {
    do.a().a(paramff);
  }

  public void a(final q paramq, ad paramad, int paramInt)
  {
    int i1 = 1;
    eo.a(3, q, "onEvent:event=" + paramq.a + ",params=" + paramq.b);
    a(paramq.a, i1);
    List localList1 = a(paramq.b(), paramq);
    if (localList1.isEmpty())
    {
      Iterator localIterator20 = this.J.entrySet().iterator();
      while (localIterator20.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator20.next();
        if (((String)localEntry2.getKey()).equals(paramq.a))
          localList1.add(new a((String)localEntry2.getValue(), paramq.b, paramq));
      }
    }
    if (paramq.a.equals("sendUrlStatusResult"))
    {
      eo.a(3, q, "sendUrlStatusResult event");
      localList1.add(new a("logEvent", paramq.b, paramq));
    }
    if (paramq.a.equals("adWillClose"))
    {
      ci localci8 = (ci)this.k.get(paramq.b().g().toString());
      if (localci8 != null)
      {
        List localList8 = localci8.a(co.q);
        if (localList8 != null)
        {
          Iterator localIterator18 = localList8.iterator();
          while (localIterator18.hasNext())
          {
            String str9 = (String)localIterator18.next();
            if (str9 != null)
            {
              eo.a(3, q, "Close Tracking URL: " + str9);
              Iterator localIterator19 = localList1.iterator();
              while (localIterator19.hasNext())
              {
                a locala11 = (a)localIterator19.next();
                if ("logEvent".equals(locala11.a))
                  this.P.b(locala11, str9);
              }
            }
          }
        }
      }
    }
    if (paramq.a.equals("renderFailed"))
      if ((String)paramq.b.remove("binding_3rd_party") == null)
        break label2659;
    label2638: label2639: label2657: label2659: int i4;
    for (int i3 = i1; ; i4 = 0)
    {
      if (((AdFrame)paramq.c.d().get(0)).b().intValue() == 4)
        i3 = i1;
      if ((paramq.b.remove("preRender") == null) && (i3 != i1))
      {
        final FlurryAdListener localFlurryAdListener4 = ac();
        eo.a(3, q, "Firing renderFailed, listener=" + localFlurryAdListener4);
        if (localFlurryAdListener4 != null)
          do.a().a(new ff()
          {
            public void a()
            {
              localFlurryAdListener4.onRenderFailed(paramq.c.b().toString());
            }
          });
      }
      while (true)
      {
        ci localci7 = (ci)this.k.get(paramq.b().g().toString());
        if (localci7 != null)
        {
          List localList7 = localci7.g();
          if (localList7 != null)
          {
            Iterator localIterator16 = localList7.iterator();
            while (localIterator16.hasNext())
            {
              String str8 = (String)localIterator16.next();
              if (str8 != null)
              {
                eo.a(3, q, "Error Tracking URL: " + str8);
                Iterator localIterator17 = localList1.iterator();
                while (localIterator17.hasNext())
                {
                  a locala10 = (a)localIterator17.next();
                  if ("logEvent".equals(locala10.a))
                    this.P.b(locala10, str8);
                }
                continue;
                Iterator localIterator15 = localList1.iterator();
                do
                  if (!localIterator15.hasNext())
                    break;
                while (!"nextAdUnit".equals(((a)localIterator15.next()).a));
              }
            }
          }
        }
        int i2;
        for (int i5 = 0; ; i5 = i2)
        {
          if (i5 == 0)
            break label2657;
          final FlurryAdListener localFlurryAdListener3 = ac();
          eo.a(3, q, "Firing spaceDidFailToReceiveAd, listener=" + localFlurryAdListener3);
          if (localFlurryAdListener3 == null)
            break;
          do.a().a(new ff()
          {
            public void a()
            {
              localFlurryAdListener3.spaceDidFailToReceiveAd(paramq.c.b().toString());
            }
          });
          break;
          a(null);
          d(paramq.b().g().toString());
          ap.a().f(paramq.c);
          L();
          b(new ff()
          {
            public void a()
            {
              String str = paramq.c.b().toString();
              FlurryAdModule.this.g.b(str, FlurryAdModule.c(FlurryAdModule.this).e(str));
            }
          });
          if (paramq.a.equals("clicked"))
          {
            final FlurryAdListener localFlurryAdListener2 = ac();
            eo.a(3, q, "Firing onAdClicked, listener=" + localFlurryAdListener2);
            if (localFlurryAdListener2 != null)
              do.a().a(new ff()
              {
                public void a()
                {
                  localFlurryAdListener2.onAdClicked(paramq.c.b().toString());
                }
              });
            ci localci6 = (ci)this.k.get(paramq.b().g().toString());
            if (localci6 != null)
            {
              am localam = c(paramq.b().g().toString());
              String str6 = localci6.a(cp.b);
              if (str6 != null)
              {
                localam.g(i1);
                this.P.a(paramq.a(), str6, i1, paramq.c, paramq.b().g().toString());
              }
              if (localam.f())
                break label2638;
              localam.e(i1);
              String str7 = localci6.a(cp.c);
              if (str7 != null)
              {
                eo.a(3, q, "ClickThrough Tracking URL: " + str7);
                Iterator localIterator14 = localList1.iterator();
                while (localIterator14.hasNext())
                {
                  a locala9 = (a)localIterator14.next();
                  if ("logEvent".equals(locala9.a))
                    this.P.b(locala9, str7);
                }
              }
            }
          }
          if (paramq.a.equals("videoStart"))
          {
            ci localci5 = (ci)this.k.get(paramq.b().g().toString());
            if (localci5 != null)
            {
              List localList6 = localci5.h();
              if (localList6 != null)
              {
                Iterator localIterator12 = localList6.iterator();
                while (localIterator12.hasNext())
                {
                  String str5 = (String)localIterator12.next();
                  if (str5 != null)
                  {
                    eo.a(3, q, "Impression Tracking URL: " + str5);
                    Iterator localIterator13 = localList1.iterator();
                    while (localIterator13.hasNext())
                    {
                      a locala8 = (a)localIterator13.next();
                      if ("logEvent".equals(locala8.a))
                        this.P.b(locala8, str5);
                    }
                  }
                }
              }
            }
            c(paramq.b().g().toString()).a(i1);
          }
          if (paramq.a.equals("videoFirstQuartile"))
          {
            ci localci4 = (ci)this.k.get(paramq.b().g().toString());
            if (localci4 != null)
            {
              List localList5 = localci4.a(co.e);
              if (localList5 != null)
              {
                Iterator localIterator10 = localList5.iterator();
                while (localIterator10.hasNext())
                {
                  String str4 = (String)localIterator10.next();
                  if (str4 != null)
                  {
                    eo.a(3, q, "First Quartile Tracking URL: " + str4);
                    Iterator localIterator11 = localList1.iterator();
                    while (localIterator11.hasNext())
                    {
                      a locala7 = (a)localIterator11.next();
                      if ("logEvent".equals(locala7.a))
                        this.P.b(locala7, str4);
                    }
                  }
                }
              }
            }
            c(paramq.b().g().toString()).b(i1);
          }
          if (paramq.a.equals("videoMidpoint"))
          {
            ci localci3 = (ci)this.k.get(paramq.b().g().toString());
            if (localci3 != null)
            {
              List localList4 = localci3.a(co.d);
              if (localList4 != null)
              {
                Iterator localIterator8 = localList4.iterator();
                while (localIterator8.hasNext())
                {
                  String str3 = (String)localIterator8.next();
                  if (str3 != null)
                  {
                    eo.a(3, q, "Midpoint Tracking URL: " + str3);
                    Iterator localIterator9 = localList1.iterator();
                    while (localIterator9.hasNext())
                    {
                      a locala6 = (a)localIterator9.next();
                      if ("logEvent".equals(locala6.a))
                        this.P.b(locala6, str3);
                    }
                  }
                }
              }
            }
            c(paramq.b().g().toString()).c(i1);
          }
          if (paramq.a.equals("videoThirdQuartile"))
          {
            ci localci2 = (ci)this.k.get(paramq.b().g().toString());
            if (localci2 != null)
            {
              List localList3 = localci2.a(co.f);
              if (localList3 != null)
              {
                Iterator localIterator6 = localList3.iterator();
                while (localIterator6.hasNext())
                {
                  String str2 = (String)localIterator6.next();
                  if (str2 != null)
                  {
                    eo.a(3, q, "Third Quartile Tracking URL: " + str2);
                    Iterator localIterator7 = localList1.iterator();
                    while (localIterator7.hasNext())
                    {
                      a locala5 = (a)localIterator7.next();
                      if ("logEvent".equals(locala5.a))
                        this.P.b(locala5, str2);
                    }
                  }
                }
              }
            }
            c(paramq.b().g().toString()).d(i1);
          }
          if (paramq.a.equals("videoCompleted"))
          {
            if (paramq.c.n().booleanValue())
            {
              eo.a(3, q, "Ad unit is rewardable, onVideoCompleted listener will fire");
              final FlurryAdListener localFlurryAdListener1 = ac();
              eo.a(3, q, "Firing onVideoCompleted, listener=" + localFlurryAdListener1);
              if (localFlurryAdListener1 != null)
                do.a().a(new ff()
                {
                  public void a()
                  {
                    localFlurryAdListener1.onVideoCompleted(paramq.c.b().toString());
                  }
                });
            }
            while (true)
            {
              ci localci1 = (ci)this.k.get(paramq.b().g().toString());
              if (localci1 == null)
                break;
              List localList2 = localci1.a(co.g);
              if (localList2 == null)
                break;
              Iterator localIterator4 = localList2.iterator();
              while (localIterator4.hasNext())
              {
                String str1 = (String)localIterator4.next();
                if (str1 != null)
                {
                  eo.a(3, q, "Complete Tracking URL: " + str1);
                  Iterator localIterator5 = localList1.iterator();
                  while (localIterator5.hasNext())
                  {
                    a locala4 = (a)localIterator5.next();
                    if ("logEvent".equals(locala4.a))
                      this.P.b(locala4, str1);
                  }
                }
              }
              eo.a(3, q, "Ad unit is not rewardable, onVideoCompleted listener will not fire");
            }
          }
          if ((paramq.a.equals("adWillClose")) || (paramq.a.equals("videoCompleted")) || (paramq.a.equals("userConfirmed")))
          {
            Iterator localIterator1 = localList1.iterator();
            a locala3;
            do
            {
              if (!localIterator1.hasNext())
                break;
              locala3 = (a)localIterator1.next();
            }
            while (!this.K.contains(locala3.a));
          }
          while (true)
          {
            if (i1 == 0)
              localList1.add(0, new a("closeAd", Collections.emptyMap(), paramq));
            if ((i1 == 0) || (paramq.a.equals("videoCompleted")) || (paramq.a.equals("userConfirmed")))
            {
              d(paramq.b().g().toString());
              L();
              b(new ff()
              {
                public void a()
                {
                  String str = paramq.c.b().toString();
                  FlurryAdModule.this.g.b(str, FlurryAdModule.c(FlurryAdModule.this).e(str));
                }
              });
            }
            Iterator localIterator2 = localList1.iterator();
            Object localObject1 = null;
            a locala2;
            if (localIterator2.hasNext())
            {
              locala2 = (a)localIterator2.next();
              if (!locala2.a.equals("logEvent"))
                break label2639;
              locala2.b.put("__sendToServer", "true");
            }
            for (Object localObject2 = locala2; ; localObject2 = localObject1)
            {
              if (locala2.a.equals("loadAdComponents"))
              {
                Iterator localIterator3 = locala2.c.b.entrySet().iterator();
                while (localIterator3.hasNext())
                {
                  Map.Entry localEntry1 = (Map.Entry)localIterator3.next();
                  locala2.b.put(((String)localEntry1.getKey()).toString(), ((String)localEntry1.getValue()).toString());
                }
              }
              eo.c(q, locala2.toString());
              paramad.a(locala2, this, paramInt + 1);
              localObject1 = localObject2;
              break;
              if (localObject1 == null)
              {
                HashMap localHashMap = new HashMap();
                localHashMap.put("__sendToServer", "false");
                a locala1 = new a("logEvent", localHashMap, paramq);
                paramad.a(locala1, this, paramInt + 1);
                eo.c(q, locala1.toString());
              }
              return;
            }
            i2 = 0;
          }
        }
      }
    }
  }

  public void a(String paramString, int paramInt)
  {
    synchronized (this.b)
    {
      Integer localInteger = (Integer)this.b.get(paramString);
      TreeMap localTreeMap2 = this.b;
      if (localInteger != null)
        paramInt += localInteger.intValue();
      localTreeMap2.put(paramString, Integer.valueOf(paramInt));
      return;
    }
  }

  public void a(String paramString, CharSequence paramCharSequence)
  {
    this.G = paramCharSequence;
    this.Q.d(paramString);
  }

  public void a(final String paramString, final List<AdUnit> paramList)
  {
    try
    {
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.c(FlurryAdModule.this).a(paramString, paramList);
        }
      });
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.this.g.a(paramString, paramList);
        }
      });
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString, List<AdUnit> paramList, int paramInt)
  {
    e().a(paramString, paramList, paramInt);
  }

  public void a(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0))
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((localEntry.getKey() != null) && (localEntry.getValue() != null))
          this.a.put(localEntry.getKey(), localEntry.getValue());
        else
          eo.d(q, "User cookie keys and values may not be null.");
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public String aa()
  {
    return this.v;
  }

  public String ab()
  {
    return this.w;
  }

  public FlurryAdListener ac()
  {
    return (FlurryAdListener)this.F.get();
  }

  public ci b(String paramString)
  {
    synchronized (this.k)
    {
      ci localci = (ci)this.k.get(paramString);
      return localci;
    }
  }

  public k b()
  {
    return this.D;
  }

  String b(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return paramIntent.getStringExtra("adSpaceName");
  }

  public void b(Activity paramActivity)
  {
    if (paramActivity == null)
      return;
    b(paramActivity, b(paramActivity.getIntent()));
    this.H.remove(paramActivity);
    a(paramActivity);
  }

  public void b(Context paramContext, final String paramString)
  {
    this.i = (-1 + this.i);
    if (this.i == 0)
    {
      final FlurryAdListener localFlurryAdListener = ac();
      eo.a(3, q, "Firing onAdClosed, listener=" + localFlurryAdListener);
      if (localFlurryAdListener != null)
        do.a().a(new ff()
        {
          public void a()
          {
            localFlurryAdListener.onAdClosed(paramString);
          }
        });
    }
  }

  public void b(AdUnit paramAdUnit)
  {
    this.C = paramAdUnit;
  }

  public void b(dj paramdj, Context paramContext)
  {
    f();
    dz.a().c();
    this.f.d();
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.b(FlurryAdModule.this).a();
      }
    });
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.this.I();
      }
    });
  }

  public void b(e parame)
  {
    this.B = parame;
  }

  public void b(ff paramff)
  {
    do.a().c(paramff);
  }

  public void b(Map<String, String> paramMap)
  {
    if ((paramMap == this.o) || ((paramMap != null) && (paramMap.equals(this.o))));
    for (int i1 = 1; ; i1 = 0)
    {
      this.o = paramMap;
      if (i1 != 0)
        this.Q.b();
      return;
    }
  }

  public ak c()
  {
    return this.E;
  }

  public am c(String paramString)
  {
    synchronized (this.l)
    {
      am localam = (am)this.l.get(paramString);
      if (localam == null)
      {
        localam = new am();
        this.l.put(paramString, localam);
      }
      return localam;
    }
  }

  public void c(dj paramdj, final Context paramContext)
  {
    dz.a().d();
    if (!dv.a().b())
      a(new ff()
      {
        public void a()
        {
          FlurryAdModule.c(FlurryAdModule.this).a(paramContext);
        }
      });
    if (dl.a().b() == 0)
    {
      this.Q.a();
      this.R.b();
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.this.J();
        }
      });
    }
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.d(FlurryAdModule.this);
      }
    });
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.this.G();
      }
    });
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.this.M();
      }
    });
  }

  public u d()
  {
    return this.Q;
  }

  public void d(String paramString)
  {
    synchronized (this.l)
    {
      this.l.remove(paramString);
      return;
    }
  }

  public t e()
  {
    return this.R;
  }

  public void e(String paramString)
  {
    this.x = paramString;
  }

  public void f()
  {
    while (true)
    {
      try
      {
        boolean bool = this.M;
        if (bool)
          return;
        if (dl.a().c() == null)
          throw new RuntimeException("Flurry Session wasn't started");
      }
      finally
      {
      }
      Context localContext = do.a().b();
      dv.a().a(this);
      this.r = localContext.getFileStreamPath(t());
      this.s = localContext.getFileStreamPath(u());
      this.P.a();
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.a(FlurryAdModule.this);
        }
      });
      b(new ff()
      {
        public void a()
        {
          FlurryAdModule.this.H();
        }
      });
      this.M = true;
    }
  }

  public void f(String paramString)
  {
    this.y = paramString;
  }

  public void g(final String paramString)
  {
    L();
    b(new ff()
    {
      public void a()
      {
        FlurryAdModule.this.g.b(paramString, FlurryAdModule.c(FlurryAdModule.this).e(paramString));
      }
    });
  }

  public boolean g()
  {
    return this.i != 0;
  }

  public long h()
  {
    return this.c;
  }

  public String j()
  {
    return dn.a().h();
  }

  public List<CharSequence> k()
  {
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = cx.a().b();
    if ((localHashMap != null) && (!localHashMap.isEmpty()))
    {
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
        localArrayList.add((String)localIterator.next());
    }
    return localArrayList;
  }

  public String l()
  {
    return dn.a().i();
  }

  public String m()
  {
    return dn.a().j();
  }

  public com.flurry.android.impl.ads.avro.protocol.v10.Location n()
  {
    android.location.Location localLocation = dz.a().f();
    float f2;
    float f1;
    if (localLocation != null)
    {
      f2 = (float)localLocation.getLatitude();
      f1 = (float)localLocation.getLongitude();
    }
    while (true)
    {
      return com.flurry.android.impl.ads.avro.protocol.v10.Location.b().a(f2).b(f1).a();
      f1 = 0.0F;
      f2 = 0.0F;
    }
  }

  public long o()
  {
    try
    {
      long l1 = SystemClock.elapsedRealtime() - this.d;
      if (l1 > this.e);
      while (true)
      {
        this.e = l1;
        long l2 = this.e;
        return l2;
        l1 = 1L + this.e;
        this.e = l1;
      }
    }
    finally
    {
    }
  }

  public void p()
  {
    eo.a(3, q, "========== PRINT COUNTERS ==========");
    synchronized (this.b)
    {
      Iterator localIterator = this.b.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        eo.a(3, q, (String)localEntry.getKey() + " " + localEntry.getValue());
      }
    }
    eo.a(3, q, "========== END PRINT COUNTERS ==========");
  }

  public ICustomAdNetworkHandler q()
  {
    return this.h;
  }

  public boolean r()
  {
    return this.o != null;
  }

  public Map<CharSequence, CharSequence> s()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.o.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      if (str1 == null)
        str1 = "";
      if (str2 == null)
        str2 = "";
      localHashMap.put(str1, str2);
    }
    return localHashMap;
  }

  String t()
  {
    return ".flurryadlog." + Integer.toString(j().hashCode(), 16);
  }

  String u()
  {
    return ".flurryfreqcap." + Integer.toString(j().hashCode(), 16);
  }

  String v()
  {
    return ".flurrycachedasset." + Integer.toString(j().hashCode(), 16);
  }

  public String w()
  {
    if (this.x != null)
      return this.x + "/v10/getAds.do";
    if (FlurryAgent.getUseHttps())
      return "https://ads.flurry.com/v10/getAds.do";
    return "http://ads.flurry.com/v10/getAds.do";
  }

  String x()
  {
    if (this.y != null)
      return this.y;
    if (FlurryAgent.getUseHttps())
      return "https://adlog.flurry.com";
    return "http://adlog.flurry.com";
  }

  public void y()
  {
    this.a.clear();
  }

  public Map<String, String> z()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.impl.ads.FlurryAdModule
 * JD-Core Version:    0.6.2
 */