package textnow.aq;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import textnow.bb.k;

@TargetApi(9)
public class m
{
  private static final String C = m.class.getName();
  public static String a = "TrustDefender Mobile: 1.2.4-3";
  ArrayList<String> A = null;
  ArrayList<Thread> B = new ArrayList();
  private Context D = null;
  private Thread E = null;
  private g F = null;
  private String G;
  private ReentrantLock H = new ReentrantLock();
  private ReentrantLock I = new ReentrantLock();
  private volatile boolean J;
  private volatile n K = n.b;
  private volatile boolean L;
  private f M;
  private l N = new l();
  String b = null;
  int c = 10000;
  String d = null;
  Socket e = null;
  String f = null;
  String g = null;
  String h = null;
  int i = 0;
  int j = 0;
  int k = 0;
  int l = 0;
  String m = null;
  String n = null;
  String o = null;
  String p = "0";
  String q = null;
  String r = null;
  int s = 0;
  String t = null;
  String u = null;
  String v = null;
  int w = 0;
  String x = null;
  String y = null;
  boolean z = false;

  private String a(int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("w=");
    localStringBuilder.append(this.d);
    if ((paramInt & 0x8) != 0)
    {
      localStringBuilder.append("&c=");
      localStringBuilder.append(this.i);
      localStringBuilder.append("&z=");
      localStringBuilder.append(this.j);
    }
    if ((paramInt & 0x10) != 0)
    {
      localStringBuilder.append("&f=");
      localStringBuilder.append(this.k);
      localStringBuilder.append("x");
      localStringBuilder.append(this.l);
    }
    Object localObject2;
    if ((this.m != null) && (this.m.length() > 0))
      localObject2 = "";
    try
    {
      String str10 = URLEncoder.encode(this.m, "utf-8");
      localObject2 = str10;
      localStringBuilder.append("&lh=");
      if (((String)localObject2).length() > 255)
        localObject2 = ((String)localObject2).substring(0, 255);
      localStringBuilder.append((String)localObject2);
      localObject1 = "";
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      try
      {
        String str9 = URLEncoder.encode(this.n, "utf-8");
        Object localObject1 = str9;
        localStringBuilder.append("&dr=");
        if (((String)localObject1).length() > 255)
          localObject1 = ((String)localObject1).substring(0, 255);
        localStringBuilder.append((String)localObject1);
        if (((paramInt & 0x20) != 0) && (this.p != null) && (!this.p.equals("0")) && (this.q != null))
        {
          localStringBuilder.append("&p=");
          if (this.o == null)
          {
            str6 = "";
            localStringBuilder.append(str6);
            localStringBuilder.append("&pl=");
            if (this.p != null)
              break label817;
            str7 = "";
            localStringBuilder.append(str7);
            localStringBuilder.append("&ph=");
            if (this.q != null)
              break label826;
            str8 = "";
            localStringBuilder.append(str8);
          }
        }
        else
        {
          localStringBuilder.append("&hh=");
          localStringBuilder.append(b(paramString + this.b));
          if (((paramInt & 0x4) != 0) && (this.s > 0))
          {
            localStringBuilder.append("&mt=");
            if (this.t != null)
              break label838;
            str5 = "";
            localStringBuilder.append(str5);
            localStringBuilder.append("&mn=");
            localStringBuilder.append(this.s);
          }
          localStringBuilder.append("&mdf=");
          if (this.u != null)
            break label850;
          str1 = "";
          localStringBuilder.append(str1);
          localStringBuilder.append("&mds=");
          if (this.v != null)
            break label859;
          str2 = "";
          localStringBuilder.append(str2);
          localStringBuilder.append("&imei=");
          if (this.G != null)
            break label868;
          str3 = "";
          localStringBuilder.append(str3);
          Location localLocation = this.N.b();
          if (localLocation != null)
          {
            localStringBuilder.append("&tdlat=");
            localStringBuilder.append(Double.valueOf(localLocation.getLatitude()).toString());
            localStringBuilder.append("&tdlon=");
            localStringBuilder.append(Double.valueOf(localLocation.getLongitude()).toString());
            localStringBuilder.append("&tdlacc=");
            localStringBuilder.append(Double.valueOf(localLocation.getAccuracy()).toString());
            new StringBuilder("Got lat/long/acc = ").append(localLocation.getLatitude()).append("/").append(localLocation.getLongitude()).append("/").append(localLocation.getAccuracy());
          }
          if ((this.A != null) && (this.A.size() > 0))
          {
            Iterator localIterator = this.A.iterator();
            i1 = 0;
            if (localIterator.hasNext())
            {
              String str4 = (String)localIterator.next();
              localStringBuilder.append("&aca");
              i2 = i1 + 1;
              localStringBuilder.append(i1);
              localStringBuilder.append("=");
              if (str4.length() > 255)
                str4 = str4.substring(0, 255);
              localStringBuilder.append(str4);
              if (i2 < 5)
                break label886;
            }
          }
          localStringBuilder.append("&at=agent_mobile&av=");
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        while (true)
        {
          int i2;
          try
          {
            localStringBuilder.append(URLEncoder.encode(a, "utf-8"));
            return a(localStringBuilder.toString().toLowerCase(), this.b);
            localUnsupportedEncodingException3 = localUnsupportedEncodingException3;
            continue;
            localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
            continue;
            String str6 = this.o;
            continue;
            label817: String str7 = this.p;
            continue;
            label826: String str8 = b(this.q);
            continue;
            label838: String str5 = b(this.t);
            continue;
            label850: String str1 = this.u;
            continue;
            label859: String str2 = this.v;
            continue;
            label868: String str3 = this.G;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException2)
          {
            continue;
          }
          label886: int i1 = i2;
        }
      }
    }
  }

  static String a(String paramString)
  {
    int i1 = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString.charAt(0) != '\\')
      return paramString;
    int i2 = 1;
    while (true)
      if (i2 < i1)
      {
        int i3 = paramString.indexOf("\\", i2 + 1);
        String str;
        int i4;
        if (i3 > 0)
        {
          str = paramString.substring(i2, i3);
          i4 = i2 + str.length();
        }
        try
        {
          localStringBuilder.append(Character.toChars(Integer.parseInt(str, 8)));
          label82: i2 = i4 + 1;
          continue;
          str = paramString.substring(i2);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          break label82;
        }
      }
    return localStringBuilder.toString();
  }

  private static String a(String paramString1, String paramString2)
  {
    String str = paramString1.length() + "&" + paramString1;
    int i1 = str.length();
    StringBuilder localStringBuilder = new StringBuilder();
    Formatter localFormatter = new Formatter(localStringBuilder);
    int i2 = paramString2.length();
    char[] arrayOfChar = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    int i3 = 0;
    int i6;
    for (int i4 = 0; i3 < i1; i4 = i6)
    {
      int i5 = str.charAt(i3);
      i6 = i4 + 1;
      int i7 = (char)(i5 ^ 0xA & paramString2.charAt(i4));
      if (i6 >= i2)
        i6 = 0;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Character.valueOf(arrayOfChar[(0xF & i7 >> 4)]);
      localFormatter.format("%c", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Character.valueOf(arrayOfChar[(i7 & 0xF)]);
      localFormatter.format("%c", arrayOfObject2);
      i3++;
    }
    localFormatter.close();
    return localStringBuilder.toString();
  }

  private static String a(String paramString1, String paramString2, ArrayList<HashMap<String, String>> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    HashMap localHashMap;
    while (true)
      if (localIterator.hasNext())
      {
        localHashMap = (HashMap)localIterator.next();
        if (((String)localHashMap.get("name")).toLowerCase().indexOf(paramString1.toLowerCase()) != -1)
        {
          if (localHashMap == null)
            break label127;
          str = ((String)localHashMap.get("name")).replace("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY -]", "");
          if (str.isEmpty())
            break;
        }
      }
    label127: for (String str = "true"; ; str = "false")
    {
      return paramString2 + "^" + str + "!";
      localHashMap = null;
      break;
    }
  }

  // ERROR //
  private static String a(String paramString, List<String> paramList)
  {
    // Byte code:
    //   0: new 165	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: new 404	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 405	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: invokevirtual 408	java/io/File:exists	()Z
    //   21: ifeq +129 -> 150
    //   24: new 410	java/io/BufferedReader
    //   27: dup
    //   28: new 412	java/io/FileReader
    //   31: dup
    //   32: new 404	java/io/File
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 405	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: invokespecial 415	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   43: invokespecial 418	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore 4
    //   48: aload 4
    //   50: invokevirtual 421	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   53: astore 13
    //   55: aload 13
    //   57: ifnull +98 -> 155
    //   60: aload 13
    //   62: ldc_w 423
    //   65: invokevirtual 427	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   68: astore 14
    //   70: aload 14
    //   72: arraylength
    //   73: ifeq -25 -> 48
    //   76: aload 14
    //   78: iconst_0
    //   79: aaload
    //   80: invokevirtual 430	java/lang/String:trim	()Ljava/lang/String;
    //   83: astore 15
    //   85: aload 15
    //   87: invokevirtual 188	java/lang/String:length	()I
    //   90: ifeq -42 -> 48
    //   93: ldc 190
    //   95: astore 16
    //   97: aload 14
    //   99: arraylength
    //   100: iconst_1
    //   101: if_icmple +12 -> 113
    //   104: aload 14
    //   106: iconst_1
    //   107: aaload
    //   108: invokevirtual 430	java/lang/String:trim	()Ljava/lang/String;
    //   111: astore 16
    //   113: aload_1
    //   114: aload 15
    //   116: invokeinterface 435 2 0
    //   121: ifeq -73 -> 48
    //   124: aload_2
    //   125: aload 16
    //   127: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: goto -83 -> 48
    //   134: astore 9
    //   136: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   139: pop
    //   140: aload 4
    //   142: ifnull +8 -> 150
    //   145: aload 4
    //   147: invokevirtual 436	java/io/BufferedReader:close	()V
    //   150: aload_2
    //   151: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: areturn
    //   155: aload 4
    //   157: invokevirtual 436	java/io/BufferedReader:close	()V
    //   160: goto -10 -> 150
    //   163: astore 18
    //   165: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   168: pop
    //   169: goto -19 -> 150
    //   172: astore 11
    //   174: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   177: pop
    //   178: goto -28 -> 150
    //   181: astore 6
    //   183: aload_3
    //   184: ifnull +7 -> 191
    //   187: aload_3
    //   188: invokevirtual 436	java/io/BufferedReader:close	()V
    //   191: aload 6
    //   193: athrow
    //   194: astore 7
    //   196: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   199: pop
    //   200: goto -9 -> 191
    //   203: astore 5
    //   205: aload 4
    //   207: astore_3
    //   208: aload 5
    //   210: astore 6
    //   212: goto -29 -> 183
    //   215: astore 20
    //   217: aconst_null
    //   218: astore 4
    //   220: goto -84 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   48	55	134	java/io/IOException
    //   60	93	134	java/io/IOException
    //   97	113	134	java/io/IOException
    //   113	131	134	java/io/IOException
    //   155	160	163	java/io/IOException
    //   145	150	172	java/io/IOException
    //   24	48	181	finally
    //   187	191	194	java/io/IOException
    //   48	55	203	finally
    //   60	93	203	finally
    //   97	113	203	finally
    //   113	131	203	finally
    //   136	140	203	finally
    //   24	48	215	java/io/IOException
  }

  private n a(String paramString1, String paramString2, String paramString3, int paramInt, StringBuilder paramStringBuilder)
  {
    b localb = new b(paramString1, paramString2, paramString3, paramInt, paramStringBuilder);
    while (true)
    {
      Thread localThread;
      try
      {
        localThread = new Thread(localb);
        this.H.lockInterruptibly();
        try
        {
          localThread.start();
          this.B.add(localThread);
          localThread.join(paramInt);
          if (!localThread.isAlive())
            break label275;
          localThread.interrupt();
          localObject2 = null;
          this.B.remove(localObject2);
          this.H.unlock();
          if ((paramStringBuilder != null) && (paramStringBuilder.length() > 0))
          {
            new StringBuilder("Fetched ").append(paramStringBuilder.toString());
            return n.b;
          }
        }
        finally
        {
          this.B.remove(localThread);
          this.H.unlock();
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
      catch (InterruptedException localInterruptedException)
      {
        if (this.L)
          throw new InterruptedException();
        new StringBuilder("Failed to fetch W: ").append(localb.g.toString());
        if (localb.g != n.b)
          return localb.g;
        return n.c;
      }
      new StringBuilder("Failed to fetch w: ").append(localb.g.toString()).toString();
      if (localb.g != n.b)
        return localb.g;
      return n.c;
      label275: Object localObject2 = localThread;
    }
  }

  private void a(Context paramContext, f paramf)
  {
    boolean bool1 = true;
    if (Thread.currentThread().isInterrupted());
    while (true)
    {
      return;
      boolean bool2;
      label25: e locale;
      label61: String str1;
      String str2;
      if ((0x26 & this.w) != 0)
      {
        bool2 = bool1;
        locale = new e(paramContext, paramf, bool2);
        locale.c();
        if (Thread.currentThread().isInterrupted())
          continue;
        if ((0x2 & this.w) == 0)
          break label229;
        this.r = locale.a(bool1, paramContext);
        StringBuilder localStringBuilder = new StringBuilder("getBrowserInfo: ");
        if (this.r != null)
          break label234;
        str1 = "null";
        localStringBuilder.append(str1);
        if ((0x20 & this.w) != 0)
        {
          String str3 = locale.a("(function () { var plugins_string='', i=0; for (p=navigator.plugins[0]; i< navigator.plugins.length;p=navigator.plugins[i++]) {  plugins_string += p.name + '<FIELD_SEP>' + p.description + '<FIELD_SEP>' + p.filename + '<FIELD_SEP>' + p.length.toString() + '<REC_SEP>'; } return plugins_string;})();");
          if (str3 != null)
            c(str3);
        }
        if ((Thread.currentThread().isInterrupted()) || ((0x4 & this.w) == 0))
          continue;
        str2 = locale.a("navigator.mimeTypes.length");
        if (str2 == null);
      }
      try
      {
        this.s = Integer.parseInt(str2);
        label181: this.t = locale.a("(function () { var mime_string='', i=0; for (var m=navigator.mimeTypes[0]; i< navigator.mimeTypes.length;m=navigator.mimeTypes[i++]) {  mime_string += m.type; } return mime_string;})();");
        if (this.t == null)
          continue;
        new StringBuilder("Got:").append(this.t);
        return;
        bool2 = false;
        break label25;
        label229: bool1 = false;
        break label61;
        label234: str1 = this.r;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        break label181;
      }
    }
  }

  private void a(f paramf)
  {
    int i1;
    if (((0x20 & this.w) != 0) && (paramf.c.size() > 0))
    {
      String str2 = (String)paramf.c.get(0);
      i1 = 1;
      if (str2 != null)
        c(str2);
    }
    while (true)
    {
      String str1;
      int i2;
      if ((!Thread.currentThread().isInterrupted()) && ((0x4 & this.w) != 0) && (paramf.c.size() > i1))
      {
        str1 = (String)paramf.c.get(i1);
        i2 = i1 + 1;
        if (str1 == null)
          break label181;
      }
      while (true)
      {
        try
        {
          this.s = Integer.parseInt(str1);
          if ((this.s > 0) && (paramf.c.size() > i2))
            this.t = ((String)paramf.c.get(i2));
          new StringBuilder("Got mime ").append(this.s).append(":").append(this.t);
          return;
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
        label181: this.s = 0;
      }
      i1 = 0;
    }
  }

  private static String b(String paramString)
  {
    int i1 = 0;
    if ((paramString == null) || (paramString.isEmpty()))
      return "";
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      Formatter localFormatter = new Formatter(localStringBuffer);
      int i2 = arrayOfByte.length;
      while (i1 < i2)
      {
        byte b1 = arrayOfByte[i1];
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Byte.valueOf(b1);
        localFormatter.format("%02x", arrayOfObject);
        i1++;
      }
      localFormatter.close();
      String str = localStringBuffer.toString();
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return "";
  }

  private void c(String paramString)
  {
    this.q = paramString.replaceAll("(<FIELD_SEP>|<REC_SEP>)", "");
    ArrayList localArrayList = new ArrayList();
    for (String str : paramString.split("<REC_SEP>"))
    {
      if (Thread.currentThread().isInterrupted())
        return;
      HashMap localHashMap = new HashMap();
      String[] arrayOfString2 = str.split("<FIELD_SEP>");
      if (arrayOfString2.length == 4)
      {
        localHashMap.put("name", arrayOfString2[0]);
        localHashMap.put("description", arrayOfString2[1]);
        localHashMap.put("filename", arrayOfString2[2]);
        localHashMap.put("length", arrayOfString2[3]);
        localArrayList.add(localHashMap);
      }
    }
    this.p = Integer.toString(localArrayList.size());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a("QuickTime Plug-in", "plugin_quicktime", localArrayList));
    localStringBuilder.append(a("Adobe Acrobat", "plugin_adobe_acrobat", localArrayList));
    localStringBuilder.append(a("Java", "plugin_java", localArrayList));
    localStringBuilder.append(a("SVG Viewer", "plugin_svg_viewer", localArrayList));
    localStringBuilder.append(a("Flash", "plugin_flash", localArrayList));
    localStringBuilder.append(a("Windows Media Player", "plugin_windows_media_player", localArrayList));
    localStringBuilder.append(a("Silverlight", "plugin_silverlight", localArrayList));
    localStringBuilder.append(a("Real Player", "plugin_realplayer", localArrayList));
    localStringBuilder.append(a("ShockWave Director", "plugin_shockwave", localArrayList));
    localStringBuilder.append(a("VLC", "plugin_vlc_player", localArrayList));
    localStringBuilder.append(a("DevalVR", "plugin_devalvr", localArrayList));
    this.o = localStringBuilder.toString();
    new StringBuilder("Got").append(this.p).append(":").append(this.o);
  }

  private static String d(String paramString)
  {
    if (paramString == null)
      paramString = null;
    while (paramString.length() == 32)
      return paramString;
    if (paramString.length() < 32);
    for (String str = paramString + b(paramString).substring(0, 32 - paramString.length()); ; str = b(paramString))
      return str;
  }

  private static List<String> f()
  {
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile = new File("/system/fonts/").listFiles();
    if (arrayOfFile == null);
    while (true)
    {
      return localArrayList;
      int i1 = arrayOfFile.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        String str = arrayOfFile[i2].getName();
        if (str.endsWith(".ttf"))
          localArrayList.add(str.subSequence(0, str.lastIndexOf(".ttf")).toString());
      }
    }
  }

  private static k g()
  {
    k localk = new k();
    StringBuilder localStringBuilder1 = new StringBuilder();
    Formatter localFormatter = new Formatter(localStringBuilder1);
    Random localRandom = new Random();
    List localList = f();
    StringBuilder localStringBuilder2 = new StringBuilder();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
      localStringBuilder2.append((String)localIterator.next());
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(localRandom.nextInt(10000));
    localFormatter.format("%04d", arrayOfObject1);
    localk.a("nu", localStringBuilder1.toString());
    localStringBuilder1.setLength(0);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(localList.size());
    localFormatter.format("%d", arrayOfObject2);
    localk.a("ftsn", localStringBuilder1.toString());
    localStringBuilder1.setLength(0);
    localk.a("v", Build.VERSION.RELEASE.toLowerCase());
    localk.a("o", Build.BRAND.toLowerCase());
    localk.a("mf", Build.MODEL.toLowerCase());
    localk.a("l", Locale.getDefault().getLanguage().toLowerCase());
    localk.a("fts", b(localStringBuilder2.toString()).toLowerCase());
    new StringBuilder("getFlashProperties: ").append(localk.a());
    localFormatter.close();
    return localk;
  }

  public final String a()
  {
    return this.b;
  }

  public final n a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    try
    {
      this.H.lockInterruptibly();
      new StringBuilder("starting profile request using - ").append(a).append(" with options ").append(25);
      if (this.J)
      {
        n localn5 = n.a;
        return localn5;
      }
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      this.q = null;
      this.p = "0";
      this.q = null;
      this.r = null;
      this.s = 0;
      this.t = null;
      this.u = null;
      this.v = null;
      this.d = null;
      if (this.N != null)
        this.N.a();
      this.L = false;
      this.K = n.a;
      if (this.B.size() > 0)
        d();
      this.B.clear();
      if (paramString2 == null)
        paramString2 = "h.online-metrix.net";
      if ((paramString1 == null) || (paramString1.length() != 8))
      {
        n localn2 = n.i;
        return localn2;
      }
      this.J = true;
      if ((this.z) || (this.b == null))
        this.b = UUID.randomUUID().toString().toLowerCase().replaceAll("-", "");
      this.z = true;
      this.n = ("http://" + paramContext.getPackageName());
      if ((paramString3 != null) && (paramString3.length() > 0))
      {
        this.m = paramString3;
        if (paramString3.compareToIgnoreCase(this.n) != 0);
      }
      for (this.m = (paramString3 + "mobile"); ; this.m = ("http://" + paramContext.getPackageName() + "/mobile"))
      {
        this.w = 25;
        this.x = paramString1;
        this.y = paramString2;
        this.D = paramContext;
        if ((0x1 & this.w) != 0)
          break;
        c();
        n localn4 = this.K;
        return localn4;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      if (this.E != null)
        this.E.interrupt();
      this.J = false;
      n localn1 = n.h;
      return localn1;
      this.E = new Thread(new a(this, null));
      this.E.start();
      n localn3 = n.b;
      return localn3;
    }
    finally
    {
      this.H.unlock();
    }
  }

  public final void a(int paramInt)
  {
    this.c = 10000;
  }

  public final void a(g paramg)
  {
    try
    {
      this.I.lockInterruptibly();
      this.F = paramg;
      return;
    }
    finally
    {
      if (this.I.isHeldByCurrentThread())
        this.I.unlock();
    }
  }

  final void a(n paramn)
  {
    this.K = paramn;
  }

  public final n b()
  {
    new StringBuilder("getStatus returns: ").append(this.K.toString());
    return this.K;
  }

  // ERROR //
  public final void c()
  {
    // Byte code:
    //   0: new 165	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_0
    //   10: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   13: aload_0
    //   14: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   17: aload_0
    //   18: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   21: aload_0
    //   22: getfield 81	textnow/aq/m:c	I
    //   25: aload_1
    //   26: invokespecial 800	textnow/aq/m:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/StringBuilder;)Ltextnow/aq/n;
    //   29: astore 15
    //   31: aload 15
    //   33: getstatic 153	textnow/aq/n:b	Ltextnow/aq/n;
    //   36: if_acmpne +116 -> 152
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: putfield 83	textnow/aq/m:d	Ljava/lang/String;
    //   47: aload_0
    //   48: getfield 481	textnow/aq/m:L	Z
    //   51: ifne +12 -> 63
    //   54: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   57: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   60: ifeq +163 -> 223
    //   63: new 441	java/lang/InterruptedException
    //   66: dup
    //   67: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   70: athrow
    //   71: astore 8
    //   73: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   76: pop
    //   77: aload_0
    //   78: getstatic 802	textnow/aq/n:f	Ltextnow/aq/n;
    //   81: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   84: aload_0
    //   85: getfield 481	textnow/aq/m:L	Z
    //   88: ifeq +14 -> 102
    //   91: aload_0
    //   92: getstatic 783	textnow/aq/n:h	Ltextnow/aq/n;
    //   95: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   98: invokestatic 805	java/lang/Thread:interrupted	()Z
    //   101: pop
    //   102: aload_0
    //   103: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   106: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   109: aload_0
    //   110: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   113: ifnull +12 -> 125
    //   116: aload_0
    //   117: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   120: invokeinterface 810 1 0
    //   125: aload_0
    //   126: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   129: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   132: ifeq +14 -> 146
    //   135: aload_0
    //   136: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   139: astore 13
    //   141: aload 13
    //   143: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   146: aload_0
    //   147: iconst_0
    //   148: putfield 744	textnow/aq/m:J	Z
    //   151: return
    //   152: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   155: pop
    //   156: aload_0
    //   157: aload 15
    //   159: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   162: aload_0
    //   163: getfield 481	textnow/aq/m:L	Z
    //   166: ifeq +14 -> 180
    //   169: aload_0
    //   170: getstatic 783	textnow/aq/n:h	Ltextnow/aq/n;
    //   173: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   176: invokestatic 805	java/lang/Thread:interrupted	()Z
    //   179: pop
    //   180: aload_0
    //   181: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   184: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   187: aload_0
    //   188: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   191: ifnull +12 -> 203
    //   194: aload_0
    //   195: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   198: invokeinterface 810 1 0
    //   203: aload_0
    //   204: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   207: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   210: ifeq -64 -> 146
    //   213: aload_0
    //   214: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   217: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   220: goto -74 -> 146
    //   223: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   226: pop
    //   227: aload_0
    //   228: getfield 481	textnow/aq/m:L	Z
    //   231: ifne +12 -> 243
    //   234: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   237: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   240: ifeq +81 -> 321
    //   243: new 441	java/lang/InterruptedException
    //   246: dup
    //   247: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   250: athrow
    //   251: astore_2
    //   252: aload_0
    //   253: getfield 481	textnow/aq/m:L	Z
    //   256: ifeq +14 -> 270
    //   259: aload_0
    //   260: getstatic 783	textnow/aq/n:h	Ltextnow/aq/n;
    //   263: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   266: invokestatic 805	java/lang/Thread:interrupted	()Z
    //   269: pop
    //   270: aload_0
    //   271: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   274: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   277: aload_0
    //   278: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   281: ifnull +12 -> 293
    //   284: aload_0
    //   285: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   288: invokeinterface 810 1 0
    //   293: aload_0
    //   294: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   297: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   300: ifeq +14 -> 314
    //   303: aload_0
    //   304: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   307: astore 6
    //   309: aload 6
    //   311: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   314: aload_0
    //   315: iconst_0
    //   316: putfield 744	textnow/aq/m:J	Z
    //   319: aload_2
    //   320: athrow
    //   321: iconst_1
    //   322: aload_0
    //   323: getfield 123	textnow/aq/m:w	I
    //   326: iand
    //   327: ifeq +13 -> 340
    //   330: bipush 38
    //   332: aload_0
    //   333: getfield 123	textnow/aq/m:w	I
    //   336: iand
    //   337: ifne +39 -> 376
    //   340: aload_0
    //   341: aload_0
    //   342: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   345: aconst_null
    //   346: invokespecial 540	textnow/aq/m:a	(Landroid/content/Context;Ltextnow/aq/f;)V
    //   349: aconst_null
    //   350: astore 22
    //   352: aload_0
    //   353: getfield 481	textnow/aq/m:L	Z
    //   356: ifne +12 -> 368
    //   359: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   362: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   365: ifeq +258 -> 623
    //   368: new 441	java/lang/InterruptedException
    //   371: dup
    //   372: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   375: athrow
    //   376: invokestatic 812	textnow/aq/e:b	()Z
    //   379: ifne +3941 -> 4320
    //   382: invokestatic 814	textnow/aq/e:a	()Z
    //   385: ifeq +3941 -> 4326
    //   388: goto +3932 -> 4320
    //   391: iconst_1
    //   392: istore 188
    //   394: iload 187
    //   396: ifeq +3917 -> 4313
    //   399: bipush 32
    //   401: aload_0
    //   402: getfield 123	textnow/aq/m:w	I
    //   405: iand
    //   406: ifeq +6 -> 412
    //   409: iconst_2
    //   410: istore 188
    //   412: iconst_4
    //   413: aload_0
    //   414: getfield 123	textnow/aq/m:w	I
    //   417: iand
    //   418: ifeq +3895 -> 4313
    //   421: iload 188
    //   423: iconst_2
    //   424: iadd
    //   425: istore 189
    //   427: new 816	java/util/concurrent/CountDownLatch
    //   430: dup
    //   431: iload 189
    //   433: invokespecial 818	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   436: astore 190
    //   438: new 820	android/os/Handler
    //   441: dup
    //   442: invokestatic 826	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   445: invokespecial 829	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   448: astore 191
    //   450: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   453: pop
    //   454: new 165	java/lang/StringBuilder
    //   457: dup
    //   458: ldc_w 831
    //   461: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   464: aload 190
    //   466: invokevirtual 834	java/lang/Object:hashCode	()I
    //   469: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   472: ldc_w 836
    //   475: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: iload 189
    //   480: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   483: pop
    //   484: iload 187
    //   486: ifeq +3846 -> 4332
    //   489: aload 190
    //   491: astore 194
    //   493: aload_0
    //   494: new 530	textnow/aq/f
    //   497: dup
    //   498: aload 194
    //   500: invokespecial 839	textnow/aq/f:<init>	(Ljava/util/concurrent/CountDownLatch;)V
    //   503: putfield 577	textnow/aq/m:M	Ltextnow/aq/f;
    //   506: aload 191
    //   508: new 841	textnow/aq/m$1
    //   511: dup
    //   512: aload_0
    //   513: aload_0
    //   514: aload 190
    //   516: invokespecial 844	textnow/aq/m$1:<init>	(Ltextnow/aq/m;Ltextnow/aq/m;Ljava/util/concurrent/CountDownLatch;)V
    //   519: invokevirtual 848	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   522: pop
    //   523: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   526: pop
    //   527: new 165	java/lang/StringBuilder
    //   530: dup
    //   531: ldc_w 850
    //   534: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   537: aload 190
    //   539: invokevirtual 854	java/util/concurrent/CountDownLatch:getCount	()J
    //   542: invokevirtual 857	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   545: ldc_w 859
    //   548: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   551: aload 190
    //   553: invokevirtual 834	java/lang/Object:hashCode	()I
    //   556: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   559: pop
    //   560: iload 187
    //   562: ifeq +3776 -> 4338
    //   565: aload 190
    //   567: ldc2_w 860
    //   570: getstatic 867	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   573: invokevirtual 871	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   576: ifeq +18 -> 594
    //   579: aload_0
    //   580: aload_0
    //   581: getfield 577	textnow/aq/m:M	Ltextnow/aq/f;
    //   584: invokespecial 873	textnow/aq/m:a	(Ltextnow/aq/f;)V
    //   587: aload 190
    //   589: astore 22
    //   591: goto -239 -> 352
    //   594: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   597: pop
    //   598: new 165	java/lang/StringBuilder
    //   601: dup
    //   602: ldc_w 875
    //   605: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   608: aload 190
    //   610: invokevirtual 834	java/lang/Object:hashCode	()I
    //   613: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   616: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   619: pop
    //   620: goto +3718 -> 4338
    //   623: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   626: pop
    //   627: bipush 8
    //   629: aload_0
    //   630: getfield 123	textnow/aq/m:w	I
    //   633: iand
    //   634: ifeq +74 -> 708
    //   637: invokestatic 880	java/util/TimeZone:getDefault	()Ljava/util/TimeZone;
    //   640: astore 183
    //   642: aload 183
    //   644: ifnull +105 -> 749
    //   647: aload_0
    //   648: aload 183
    //   650: invokevirtual 883	java/util/TimeZone:getRawOffset	()I
    //   653: ldc_w 884
    //   656: idiv
    //   657: putfield 93	textnow/aq/m:i	I
    //   660: aload_0
    //   661: aload 183
    //   663: invokevirtual 887	java/util/TimeZone:getDSTSavings	()I
    //   666: ldc_w 884
    //   669: idiv
    //   670: putfield 95	textnow/aq/m:j	I
    //   673: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   676: pop
    //   677: new 165	java/lang/StringBuilder
    //   680: dup
    //   681: ldc_w 889
    //   684: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   687: aload_0
    //   688: getfield 95	textnow/aq/m:j	I
    //   691: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   694: ldc_w 891
    //   697: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   700: aload_0
    //   701: getfield 93	textnow/aq/m:i	I
    //   704: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   707: pop
    //   708: aload_0
    //   709: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   712: ldc_w 893
    //   715: iconst_0
    //   716: invokevirtual 897	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   719: astore 24
    //   721: aload 24
    //   723: ldc_w 893
    //   726: aconst_null
    //   727: invokeinterface 902 3 0
    //   732: astore 25
    //   734: aload_0
    //   735: getfield 481	textnow/aq/m:L	Z
    //   738: ifeq +18 -> 756
    //   741: new 441	java/lang/InterruptedException
    //   744: dup
    //   745: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   748: athrow
    //   749: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   752: pop
    //   753: goto -45 -> 708
    //   756: aload 25
    //   758: ifnonnull +75 -> 833
    //   761: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   764: pop
    //   765: new 904	java/math/BigInteger
    //   768: dup
    //   769: bipush 64
    //   771: new 906	java/security/SecureRandom
    //   774: dup
    //   775: invokespecial 907	java/security/SecureRandom:<init>	()V
    //   778: invokespecial 910	java/math/BigInteger:<init>	(ILjava/util/Random;)V
    //   781: bipush 16
    //   783: invokevirtual 911	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   786: astore 25
    //   788: aload 24
    //   790: invokeinterface 915 1 0
    //   795: astore 27
    //   797: aload 27
    //   799: ldc_w 893
    //   802: aload 25
    //   804: invokeinterface 921 3 0
    //   809: pop
    //   810: aload 27
    //   812: invokeinterface 924 1 0
    //   817: pop
    //   818: aload_0
    //   819: getfield 481	textnow/aq/m:L	Z
    //   822: ifeq +11 -> 833
    //   825: new 441	java/lang/InterruptedException
    //   828: dup
    //   829: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   832: athrow
    //   833: aload_0
    //   834: aload_0
    //   835: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   838: invokevirtual 928	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   841: ldc_w 930
    //   844: invokestatic 935	android/provider/Settings$Secure:getString	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   847: putfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   850: aload_0
    //   851: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   854: ifnull +28 -> 882
    //   857: aload_0
    //   858: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   861: ldc_w 937
    //   864: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   867: ifne +15 -> 882
    //   870: aload_0
    //   871: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   874: invokevirtual 188	java/lang/String:length	()I
    //   877: bipush 15
    //   879: if_icmpge +205 -> 1084
    //   882: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   885: pop
    //   886: aload_0
    //   887: aconst_null
    //   888: putfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   891: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   894: pop
    //   895: new 165	java/lang/StringBuilder
    //   898: dup
    //   899: ldc_w 939
    //   902: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   905: aload 25
    //   907: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: pop
    //   911: aload_0
    //   912: aload 25
    //   914: putfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   917: aload_0
    //   918: aload_0
    //   919: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   922: ldc_w 941
    //   925: invokevirtual 945	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   928: checkcast 947	android/telephony/TelephonyManager
    //   931: invokevirtual 950	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   934: putfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   937: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   940: pop
    //   941: new 165	java/lang/StringBuilder
    //   944: dup
    //   945: ldc_w 952
    //   948: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   951: aload_0
    //   952: getfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   955: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: pop
    //   959: getstatic 955	android/os/Build:SERIAL	Ljava/lang/String;
    //   962: ifnonnull +156 -> 1118
    //   965: ldc 190
    //   967: astore 35
    //   969: aload_0
    //   970: getfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   973: ifnull +153 -> 1126
    //   976: aload_0
    //   977: getfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   980: invokevirtual 391	java/lang/String:isEmpty	()Z
    //   983: ifne +143 -> 1126
    //   986: aload_0
    //   987: getfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   990: ldc_w 957
    //   993: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   996: ifne +130 -> 1126
    //   999: new 165	java/lang/StringBuilder
    //   1002: dup
    //   1003: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   1006: aload 35
    //   1008: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1011: astore 36
    //   1013: aload_0
    //   1014: getfield 236	textnow/aq/m:G	Ljava/lang/String;
    //   1017: astore 37
    //   1019: aload 36
    //   1021: aload 37
    //   1023: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1026: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1029: astore 38
    //   1031: aload_0
    //   1032: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   1035: ifnonnull +25 -> 1060
    //   1038: aload 38
    //   1040: ifnull +153 -> 1193
    //   1043: aload 38
    //   1045: invokevirtual 391	java/lang/String:isEmpty	()Z
    //   1048: ifne +145 -> 1193
    //   1051: aload_0
    //   1052: aload 38
    //   1054: invokestatic 224	textnow/aq/m:b	(Ljava/lang/String;)Ljava/lang/String;
    //   1057: putfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   1060: aload_0
    //   1061: getfield 481	textnow/aq/m:L	Z
    //   1064: ifne +12 -> 1076
    //   1067: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1070: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1073: ifeq +127 -> 1200
    //   1076: new 441	java/lang/InterruptedException
    //   1079: dup
    //   1080: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1083: athrow
    //   1084: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1087: pop
    //   1088: new 165	java/lang/StringBuilder
    //   1091: dup
    //   1092: ldc_w 959
    //   1095: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1098: aload_0
    //   1099: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   1102: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1105: pop
    //   1106: goto -215 -> 891
    //   1109: astore 33
    //   1111: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1114: pop
    //   1115: goto -156 -> 959
    //   1118: getstatic 955	android/os/Build:SERIAL	Ljava/lang/String;
    //   1121: astore 35
    //   1123: goto -154 -> 969
    //   1126: aload_0
    //   1127: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   1130: ifnull +26 -> 1156
    //   1133: new 165	java/lang/StringBuilder
    //   1136: dup
    //   1137: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   1140: aload 35
    //   1142: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1145: astore 36
    //   1147: aload_0
    //   1148: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   1151: astore 37
    //   1153: goto -134 -> 1019
    //   1156: new 165	java/lang/StringBuilder
    //   1159: dup
    //   1160: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   1163: aload 35
    //   1165: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: astore 36
    //   1170: aload_0
    //   1171: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   1174: ifnonnull +10 -> 1184
    //   1177: ldc 190
    //   1179: astore 37
    //   1181: goto -162 -> 1019
    //   1184: aload_0
    //   1185: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   1188: astore 37
    //   1190: goto -171 -> 1019
    //   1193: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1196: pop
    //   1197: goto -137 -> 1060
    //   1200: aload_0
    //   1201: aload_0
    //   1202: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   1205: invokestatic 961	textnow/aq/m:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1208: putfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   1211: aload_0
    //   1212: getfield 481	textnow/aq/m:L	Z
    //   1215: ifne +12 -> 1227
    //   1218: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1221: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1224: ifeq +11 -> 1235
    //   1227: new 441	java/lang/InterruptedException
    //   1230: dup
    //   1231: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1234: athrow
    //   1235: aload_0
    //   1236: aload_0
    //   1237: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   1240: invokestatic 961	textnow/aq/m:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1243: putfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   1246: aload_0
    //   1247: getfield 481	textnow/aq/m:L	Z
    //   1250: ifne +12 -> 1262
    //   1253: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1256: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1259: ifeq +11 -> 1270
    //   1262: new 441	java/lang/InterruptedException
    //   1265: dup
    //   1266: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1269: athrow
    //   1270: aload_0
    //   1271: aload_0
    //   1272: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   1275: invokestatic 961	textnow/aq/m:d	(Ljava/lang/String;)Ljava/lang/String;
    //   1278: putfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   1281: aload_0
    //   1282: getfield 481	textnow/aq/m:L	Z
    //   1285: ifne +12 -> 1297
    //   1288: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1291: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1294: ifeq +11 -> 1305
    //   1297: new 441	java/lang/InterruptedException
    //   1300: dup
    //   1301: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1304: athrow
    //   1305: bipush 16
    //   1307: aload_0
    //   1308: getfield 123	textnow/aq/m:w	I
    //   1311: iand
    //   1312: ifeq +41 -> 1353
    //   1315: aload_0
    //   1316: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   1319: ldc_w 963
    //   1322: invokevirtual 945	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1325: checkcast 965	android/view/WindowManager
    //   1328: invokeinterface 969 1 0
    //   1333: astore 178
    //   1335: aload_0
    //   1336: aload 178
    //   1338: invokevirtual 974	android/view/Display:getWidth	()I
    //   1341: putfield 97	textnow/aq/m:k	I
    //   1344: aload_0
    //   1345: aload 178
    //   1347: invokevirtual 977	android/view/Display:getHeight	()I
    //   1350: putfield 99	textnow/aq/m:l	I
    //   1353: aload_0
    //   1354: getfield 481	textnow/aq/m:L	Z
    //   1357: ifne +12 -> 1369
    //   1360: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1363: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1366: ifeq +11 -> 1377
    //   1369: new 441	java/lang/InterruptedException
    //   1372: dup
    //   1373: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1376: athrow
    //   1377: new 165	java/lang/StringBuilder
    //   1380: dup
    //   1381: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   1384: astore 40
    //   1386: new 979	textnow/aq/j
    //   1389: dup
    //   1390: invokestatic 985	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   1393: invokevirtual 988	java/io/File:getPath	()Ljava/lang/String;
    //   1396: invokespecial 989	textnow/aq/j:<init>	(Ljava/lang/String;)V
    //   1399: astore 41
    //   1401: aload 41
    //   1403: invokevirtual 991	textnow/aq/j:a	()J
    //   1406: lstore 42
    //   1408: aload 41
    //   1410: invokevirtual 993	textnow/aq/j:b	()J
    //   1413: lstore 44
    //   1415: fconst_1
    //   1416: fstore 46
    //   1418: lload 44
    //   1420: lload 42
    //   1422: lmul
    //   1423: lconst_0
    //   1424: lcmp
    //   1425: ifeq +24 -> 1449
    //   1428: lload 44
    //   1430: l2f
    //   1431: lload 42
    //   1433: l2f
    //   1434: fmul
    //   1435: ldc_w 994
    //   1438: fdiv
    //   1439: ldc_w 994
    //   1442: fdiv
    //   1443: ldc_w 994
    //   1446: fdiv
    //   1447: fstore 46
    //   1449: aload 40
    //   1451: fload 46
    //   1453: invokevirtual 278	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   1456: pop
    //   1457: aload 40
    //   1459: ldc_w 859
    //   1462: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1465: pop
    //   1466: aload 40
    //   1468: invokestatic 999	java/lang/System:currentTimeMillis	()J
    //   1471: invokestatic 1004	android/os/SystemClock:elapsedRealtime	()J
    //   1474: lsub
    //   1475: ldc2_w 1005
    //   1478: ldiv
    //   1479: invokestatic 1011	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1482: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1485: pop
    //   1486: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1489: pop
    //   1490: new 165	java/lang/StringBuilder
    //   1493: dup
    //   1494: ldc_w 1013
    //   1497: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1500: aload 40
    //   1502: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1505: invokestatic 224	textnow/aq/m:b	(Ljava/lang/String;)Ljava/lang/String;
    //   1508: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1511: pop
    //   1512: aload_0
    //   1513: aload 40
    //   1515: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1518: invokestatic 224	textnow/aq/m:b	(Ljava/lang/String;)Ljava/lang/String;
    //   1521: putfield 121	textnow/aq/m:v	Ljava/lang/String;
    //   1524: aload_0
    //   1525: getfield 481	textnow/aq/m:L	Z
    //   1528: ifne +12 -> 1540
    //   1531: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1534: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1537: ifeq +11 -> 1548
    //   1540: new 441	java/lang/InterruptedException
    //   1543: dup
    //   1544: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1547: athrow
    //   1548: aload_0
    //   1549: getfield 133	textnow/aq/m:D	Landroid/content/Context;
    //   1552: astore 52
    //   1554: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1557: pop
    //   1558: new 165	java/lang/StringBuilder
    //   1561: dup
    //   1562: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   1565: astore 54
    //   1567: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1570: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1573: ifeq +37 -> 1610
    //   1576: ldc 190
    //   1578: astore 55
    //   1580: aload_0
    //   1581: aload 55
    //   1583: putfield 119	textnow/aq/m:u	Ljava/lang/String;
    //   1586: aload_0
    //   1587: getfield 481	textnow/aq/m:L	Z
    //   1590: ifne +12 -> 1602
    //   1593: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   1596: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   1599: ifeq +409 -> 2008
    //   1602: new 441	java/lang/InterruptedException
    //   1605: dup
    //   1606: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   1609: athrow
    //   1610: aload 52
    //   1612: ldc_w 941
    //   1615: invokevirtual 945	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1618: checkcast 947	android/telephony/TelephonyManager
    //   1621: astore 151
    //   1623: ldc_w 1015
    //   1626: astore 152
    //   1628: aload 151
    //   1630: invokevirtual 1018	android/telephony/TelephonyManager:getPhoneType	()I
    //   1633: iconst_1
    //   1634: if_icmpne +10 -> 1644
    //   1637: aload 151
    //   1639: invokevirtual 1021	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   1642: astore 152
    //   1644: aload 54
    //   1646: aload 152
    //   1648: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1651: pop
    //   1652: aload 54
    //   1654: aload 151
    //   1656: invokevirtual 1024	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   1659: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1662: pop
    //   1663: new 1026	android/os/StatFs
    //   1666: dup
    //   1667: invokestatic 985	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   1670: invokevirtual 988	java/io/File:getPath	()Ljava/lang/String;
    //   1673: invokespecial 1027	android/os/StatFs:<init>	(Ljava/lang/String;)V
    //   1676: astore 155
    //   1678: aload 155
    //   1680: invokevirtual 1030	android/os/StatFs:getBlockSize	()I
    //   1683: i2l
    //   1684: lstore 156
    //   1686: aload 54
    //   1688: aload 155
    //   1690: invokevirtual 1033	android/os/StatFs:getBlockCount	()I
    //   1693: i2l
    //   1694: l2f
    //   1695: lload 156
    //   1697: l2f
    //   1698: fmul
    //   1699: ldc_w 994
    //   1702: fdiv
    //   1703: ldc_w 994
    //   1706: fdiv
    //   1707: ldc_w 994
    //   1710: fdiv
    //   1711: invokevirtual 278	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   1714: pop
    //   1715: aload 52
    //   1717: ldc_w 963
    //   1720: invokevirtual 945	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1723: checkcast 965	android/view/WindowManager
    //   1726: invokeinterface 969 1 0
    //   1731: astore 159
    //   1733: aload 54
    //   1735: aload 159
    //   1737: invokevirtual 974	android/view/Display:getWidth	()I
    //   1740: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1743: ldc 182
    //   1745: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1748: aload 159
    //   1750: invokevirtual 977	android/view/Display:getHeight	()I
    //   1753: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1756: pop
    //   1757: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1760: pop
    //   1761: new 139	java/util/ArrayList
    //   1764: dup
    //   1765: invokespecial 140	java/util/ArrayList:<init>	()V
    //   1768: astore 162
    //   1770: aload 162
    //   1772: iconst_4
    //   1773: anewarray 184	java/lang/String
    //   1776: dup
    //   1777: iconst_0
    //   1778: ldc_w 1035
    //   1781: aastore
    //   1782: dup
    //   1783: iconst_1
    //   1784: ldc_w 1037
    //   1787: aastore
    //   1788: dup
    //   1789: iconst_2
    //   1790: ldc_w 1039
    //   1793: aastore
    //   1794: dup
    //   1795: iconst_3
    //   1796: ldc_w 1041
    //   1799: aastore
    //   1800: invokestatic 1047	java/util/Collections:addAll	(Ljava/util/Collection;[Ljava/lang/Object;)Z
    //   1803: pop
    //   1804: ldc_w 1049
    //   1807: aload 162
    //   1809: invokestatic 1051	textnow/aq/m:a	(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   1812: astore 164
    //   1814: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1817: pop
    //   1818: new 165	java/lang/StringBuilder
    //   1821: dup
    //   1822: ldc_w 1053
    //   1825: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1828: aload 164
    //   1830: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1833: pop
    //   1834: aload 54
    //   1836: aload 164
    //   1838: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1841: pop
    //   1842: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1845: pop
    //   1846: new 139	java/util/ArrayList
    //   1849: dup
    //   1850: invokespecial 140	java/util/ArrayList:<init>	()V
    //   1853: astore 169
    //   1855: aload 169
    //   1857: iconst_1
    //   1858: anewarray 184	java/lang/String
    //   1861: dup
    //   1862: iconst_0
    //   1863: ldc_w 1055
    //   1866: aastore
    //   1867: invokestatic 1047	java/util/Collections:addAll	(Ljava/util/Collection;[Ljava/lang/Object;)Z
    //   1870: pop
    //   1871: ldc_w 1057
    //   1874: aload 169
    //   1876: invokestatic 1051	textnow/aq/m:a	(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    //   1879: astore 171
    //   1881: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1884: pop
    //   1885: new 165	java/lang/StringBuilder
    //   1888: dup
    //   1889: ldc_w 1059
    //   1892: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1895: aload 171
    //   1897: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1900: pop
    //   1901: aload 54
    //   1903: aload 171
    //   1905: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1908: pop
    //   1909: aload 54
    //   1911: getstatic 1062	android/os/Build:DEVICE	Ljava/lang/String;
    //   1914: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1917: ldc_w 1064
    //   1920: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1923: getstatic 721	android/os/Build:MODEL	Ljava/lang/String;
    //   1926: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1929: ldc_w 1064
    //   1932: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1935: getstatic 1067	android/os/Build:PRODUCT	Ljava/lang/String;
    //   1938: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1941: ldc_w 1064
    //   1944: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1947: getstatic 1070	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   1950: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1953: ldc_w 1064
    //   1956: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1959: getstatic 710	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   1962: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1965: pop
    //   1966: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   1969: pop
    //   1970: new 165	java/lang/StringBuilder
    //   1973: dup
    //   1974: ldc_w 1072
    //   1977: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1980: aload 54
    //   1982: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1985: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1988: ldc_w 1074
    //   1991: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1994: pop
    //   1995: aload 54
    //   1997: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2000: invokestatic 224	textnow/aq/m:b	(Ljava/lang/String;)Ljava/lang/String;
    //   2003: astore 55
    //   2005: goto -425 -> 1580
    //   2008: aload_0
    //   2009: aload_0
    //   2010: getfield 123	textnow/aq/m:w	I
    //   2013: aload_0
    //   2014: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2017: invokespecial 1076	textnow/aq/m:a	(ILjava/lang/String;)Ljava/lang/String;
    //   2020: astore 56
    //   2022: aload 22
    //   2024: ifnull +23 -> 2047
    //   2027: aload 22
    //   2029: aload_0
    //   2030: getfield 81	textnow/aq/m:c	I
    //   2033: i2l
    //   2034: getstatic 1079	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   2037: invokevirtual 871	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   2040: ifne +7 -> 2047
    //   2043: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   2046: pop
    //   2047: new 165	java/lang/StringBuilder
    //   2050: dup
    //   2051: ldc_w 1081
    //   2054: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2057: astore 57
    //   2059: aload_0
    //   2060: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   2063: ifnonnull +939 -> 3002
    //   2066: ldc 190
    //   2068: astore 58
    //   2070: aload 57
    //   2072: aload 58
    //   2074: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2077: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2080: aload_0
    //   2081: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2084: invokestatic 306	textnow/aq/m:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2087: astore 59
    //   2089: new 373	java/util/HashMap
    //   2092: dup
    //   2093: invokespecial 585	java/util/HashMap:<init>	()V
    //   2096: astore 60
    //   2098: aload_0
    //   2099: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   2102: ifnull +48 -> 2150
    //   2105: aload_0
    //   2106: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   2109: invokevirtual 391	java/lang/String:isEmpty	()Z
    //   2112: ifne +38 -> 2150
    //   2115: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   2118: pop
    //   2119: new 165	java/lang/StringBuilder
    //   2122: dup
    //   2123: ldc_w 1083
    //   2126: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2129: aload_0
    //   2130: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   2133: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2136: pop
    //   2137: aload 60
    //   2139: ldc_w 1085
    //   2142: aload_0
    //   2143: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   2146: invokevirtual 591	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2149: pop
    //   2150: aload_0
    //   2151: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   2154: ifnonnull +857 -> 3011
    //   2157: aload 60
    //   2159: ldc_w 1087
    //   2162: ldc_w 1089
    //   2165: invokevirtual 591	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2168: pop
    //   2169: aload 60
    //   2171: ldc_w 1091
    //   2174: aload_0
    //   2175: getfield 103	textnow/aq/m:n	Ljava/lang/String;
    //   2178: invokevirtual 591	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2181: pop
    //   2182: bipush 64
    //   2184: aload_0
    //   2185: getfield 123	textnow/aq/m:w	I
    //   2188: iand
    //   2189: ifeq +1228 -> 3417
    //   2192: new 674	textnow/bb/k
    //   2195: dup
    //   2196: invokespecial 675	textnow/bb/k:<init>	()V
    //   2199: ldc_w 1093
    //   2202: aload_0
    //   2203: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2206: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2209: ldc_w 1095
    //   2212: aload_0
    //   2213: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2216: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2219: ldc_w 1096
    //   2222: ldc_w 1098
    //   2225: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2228: astore 102
    //   2230: new 674	textnow/bb/k
    //   2233: dup
    //   2234: invokespecial 675	textnow/bb/k:<init>	()V
    //   2237: ldc_w 1093
    //   2240: aload_0
    //   2241: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2244: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2247: ldc_w 1095
    //   2250: aload_0
    //   2251: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2254: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2257: ldc_w 1096
    //   2260: ldc_w 1100
    //   2263: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2266: astore 103
    //   2268: sipush 128
    //   2271: aload_0
    //   2272: getfield 123	textnow/aq/m:w	I
    //   2275: iand
    //   2276: ifne +25 -> 2301
    //   2279: aload 102
    //   2281: ldc_w 1101
    //   2284: ldc 107
    //   2286: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2289: pop
    //   2290: aload 103
    //   2292: ldc_w 1101
    //   2295: ldc 107
    //   2297: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2300: pop
    //   2301: aload_0
    //   2302: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2305: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   2308: aload_0
    //   2309: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   2312: new 448	java/lang/Thread
    //   2315: dup
    //   2316: new 1103	textnow/aq/d
    //   2319: dup
    //   2320: ldc_w 1105
    //   2323: aload_0
    //   2324: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   2327: ldc_w 1107
    //   2330: aload 102
    //   2332: aload_0
    //   2333: getfield 81	textnow/aq/m:c	I
    //   2336: aload 60
    //   2338: aload_0
    //   2339: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   2342: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   2345: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2348: pop
    //   2349: aload_0
    //   2350: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   2353: new 448	java/lang/Thread
    //   2356: dup
    //   2357: new 1103	textnow/aq/d
    //   2360: dup
    //   2361: ldc_w 1105
    //   2364: aload_0
    //   2365: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   2368: ldc_w 1107
    //   2371: aload 103
    //   2373: aload_0
    //   2374: getfield 81	textnow/aq/m:c	I
    //   2377: aload 60
    //   2379: aload_0
    //   2380: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   2383: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   2386: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2389: pop
    //   2390: aload_0
    //   2391: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2394: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   2397: ifeq +10 -> 2407
    //   2400: aload_0
    //   2401: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2404: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   2407: new 674	textnow/bb/k
    //   2410: dup
    //   2411: invokespecial 675	textnow/bb/k:<init>	()V
    //   2414: astore 107
    //   2416: aload 107
    //   2418: ldc_w 1093
    //   2421: aload_0
    //   2422: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2425: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2428: pop
    //   2429: aload 107
    //   2431: ldc_w 1095
    //   2434: aload_0
    //   2435: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2438: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2441: pop
    //   2442: aload 107
    //   2444: ldc_w 1101
    //   2447: ldc_w 1098
    //   2450: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2453: pop
    //   2454: new 165	java/lang/StringBuilder
    //   2457: dup
    //   2458: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   2461: astore 111
    //   2463: new 339	java/util/Formatter
    //   2466: dup
    //   2467: aload 111
    //   2469: invokespecial 342	java/util/Formatter:<init>	(Ljava/lang/Appendable;)V
    //   2472: astore 112
    //   2474: iconst_2
    //   2475: anewarray 4	java/lang/Object
    //   2478: astore 113
    //   2480: aload 113
    //   2482: iconst_0
    //   2483: aload_0
    //   2484: getfield 83	textnow/aq/m:d	Ljava/lang/String;
    //   2487: aastore
    //   2488: aload 113
    //   2490: iconst_1
    //   2491: aload_0
    //   2492: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   2495: aastore
    //   2496: aload 112
    //   2498: ldc_w 1112
    //   2501: aload 113
    //   2503: invokevirtual 367	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   2506: pop
    //   2507: aload 112
    //   2509: invokevirtual 370	java/util/Formatter:close	()V
    //   2512: aload 107
    //   2514: new 674	textnow/bb/k
    //   2517: dup
    //   2518: invokespecial 675	textnow/bb/k:<init>	()V
    //   2521: ldc_w 1114
    //   2524: aload 111
    //   2526: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2529: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2532: invokevirtual 1118	textnow/bb/k:putAll	(Ljava/util/Map;)V
    //   2535: aload_0
    //   2536: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2539: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   2542: aload_0
    //   2543: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   2546: new 448	java/lang/Thread
    //   2549: dup
    //   2550: new 1103	textnow/aq/d
    //   2553: dup
    //   2554: ldc_w 1105
    //   2557: aload_0
    //   2558: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   2561: ldc_w 1107
    //   2564: aload 107
    //   2566: aload_0
    //   2567: getfield 81	textnow/aq/m:c	I
    //   2570: aload 60
    //   2572: aload_0
    //   2573: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   2576: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   2579: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2582: pop
    //   2583: aload_0
    //   2584: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2587: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   2590: ifeq +10 -> 2600
    //   2593: aload_0
    //   2594: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2597: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   2600: new 674	textnow/bb/k
    //   2603: dup
    //   2604: invokespecial 675	textnow/bb/k:<init>	()V
    //   2607: astore 117
    //   2609: aload 117
    //   2611: ldc_w 1093
    //   2614: aload_0
    //   2615: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2618: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2621: pop
    //   2622: aload 117
    //   2624: ldc_w 1095
    //   2627: aload_0
    //   2628: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2631: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2634: pop
    //   2635: aload 117
    //   2637: ldc_w 1120
    //   2640: aload 56
    //   2642: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2645: pop
    //   2646: aload 117
    //   2648: ldc_w 1122
    //   2651: aload 59
    //   2653: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2656: pop
    //   2657: aload_0
    //   2658: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2661: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   2664: aload_0
    //   2665: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   2668: new 448	java/lang/Thread
    //   2671: dup
    //   2672: new 1103	textnow/aq/d
    //   2675: dup
    //   2676: ldc_w 1105
    //   2679: aload_0
    //   2680: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   2683: ldc_w 1107
    //   2686: aload 117
    //   2688: aload_0
    //   2689: getfield 81	textnow/aq/m:c	I
    //   2692: aload 60
    //   2694: aload_0
    //   2695: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   2698: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   2701: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2704: pop
    //   2705: aload_0
    //   2706: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2709: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   2712: ifeq +10 -> 2722
    //   2715: aload_0
    //   2716: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2719: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   2722: aload_0
    //   2723: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   2726: ifnull +252 -> 2978
    //   2729: new 674	textnow/bb/k
    //   2732: dup
    //   2733: invokespecial 675	textnow/bb/k:<init>	()V
    //   2736: astore 124
    //   2738: aload 124
    //   2740: ldc_w 1093
    //   2743: aload_0
    //   2744: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   2747: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2750: pop
    //   2751: aload 124
    //   2753: ldc_w 1095
    //   2756: aload_0
    //   2757: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   2760: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2763: pop
    //   2764: new 165	java/lang/StringBuilder
    //   2767: dup
    //   2768: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   2771: astore 127
    //   2773: new 674	textnow/bb/k
    //   2776: dup
    //   2777: invokespecial 675	textnow/bb/k:<init>	()V
    //   2780: astore 128
    //   2782: new 677	java/util/Random
    //   2785: dup
    //   2786: invokespecial 678	java/util/Random:<init>	()V
    //   2789: astore 129
    //   2791: new 339	java/util/Formatter
    //   2794: dup
    //   2795: aload 127
    //   2797: invokespecial 342	java/util/Formatter:<init>	(Ljava/lang/Appendable;)V
    //   2800: astore 130
    //   2802: iconst_1
    //   2803: anewarray 4	java/lang/Object
    //   2806: astore 131
    //   2808: aload 131
    //   2810: iconst_0
    //   2811: aload 129
    //   2813: sipush 10000
    //   2816: invokevirtual 685	java/util/Random:nextInt	(I)I
    //   2819: invokestatic 688	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2822: aastore
    //   2823: aload 130
    //   2825: ldc_w 690
    //   2828: aload 131
    //   2830: invokevirtual 367	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   2833: pop
    //   2834: aload 128
    //   2836: ldc_w 692
    //   2839: aload 127
    //   2841: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2844: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2847: pop
    //   2848: aload 127
    //   2850: iconst_0
    //   2851: invokevirtual 699	java/lang/StringBuilder:setLength	(I)V
    //   2854: iconst_2
    //   2855: anewarray 4	java/lang/Object
    //   2858: astore 134
    //   2860: aload 134
    //   2862: iconst_0
    //   2863: aload_0
    //   2864: getfield 83	textnow/aq/m:d	Ljava/lang/String;
    //   2867: aastore
    //   2868: aload 134
    //   2870: iconst_1
    //   2871: aload_0
    //   2872: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   2875: aastore
    //   2876: aload 130
    //   2878: ldc_w 1112
    //   2881: aload 134
    //   2883: invokevirtual 367	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   2886: pop
    //   2887: aload 128
    //   2889: ldc_w 1124
    //   2892: aload 127
    //   2894: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2897: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   2900: pop
    //   2901: aload 130
    //   2903: invokevirtual 370	java/util/Formatter:close	()V
    //   2906: aload 124
    //   2908: aload 128
    //   2910: invokevirtual 1118	textnow/bb/k:putAll	(Ljava/util/Map;)V
    //   2913: aload_0
    //   2914: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2917: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   2920: aload_0
    //   2921: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   2924: new 448	java/lang/Thread
    //   2927: dup
    //   2928: new 1103	textnow/aq/d
    //   2931: dup
    //   2932: ldc_w 1105
    //   2935: aload_0
    //   2936: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   2939: ldc_w 1107
    //   2942: aload 124
    //   2944: aload_0
    //   2945: getfield 81	textnow/aq/m:c	I
    //   2948: aload 60
    //   2950: aload_0
    //   2951: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   2954: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   2957: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2960: pop
    //   2961: aload_0
    //   2962: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2965: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   2968: ifeq +10 -> 2978
    //   2971: aload_0
    //   2972: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   2975: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   2978: aload_0
    //   2979: getfield 481	textnow/aq/m:L	Z
    //   2982: ifne +12 -> 2994
    //   2985: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   2988: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   2991: ifeq +140 -> 3131
    //   2994: new 441	java/lang/InterruptedException
    //   2997: dup
    //   2998: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   3001: athrow
    //   3002: aload_0
    //   3003: getfield 113	textnow/aq/m:r	Ljava/lang/String;
    //   3006: astore 58
    //   3008: goto -938 -> 2070
    //   3011: aload 60
    //   3013: ldc_w 1087
    //   3016: new 165	java/lang/StringBuilder
    //   3019: dup
    //   3020: ldc_w 1089
    //   3023: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3026: aload_0
    //   3027: getfield 91	textnow/aq/m:h	Ljava/lang/String;
    //   3030: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3033: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3036: invokevirtual 591	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3039: pop
    //   3040: goto -871 -> 2169
    //   3043: astore 104
    //   3045: aload_0
    //   3046: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3049: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3052: ifeq +10 -> 3062
    //   3055: aload_0
    //   3056: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3059: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3062: aload 104
    //   3064: athrow
    //   3065: astore 115
    //   3067: aload_0
    //   3068: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3071: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3074: ifeq +10 -> 3084
    //   3077: aload_0
    //   3078: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3081: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3084: aload 115
    //   3086: athrow
    //   3087: astore 122
    //   3089: aload_0
    //   3090: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3093: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3096: ifeq +10 -> 3106
    //   3099: aload_0
    //   3100: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3103: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3106: aload 122
    //   3108: athrow
    //   3109: astore 137
    //   3111: aload_0
    //   3112: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3115: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3118: ifeq +10 -> 3128
    //   3121: aload_0
    //   3122: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3125: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3128: aload 137
    //   3130: athrow
    //   3131: new 674	textnow/bb/k
    //   3134: dup
    //   3135: invokespecial 675	textnow/bb/k:<init>	()V
    //   3138: astore 139
    //   3140: aload 139
    //   3142: ldc_w 1093
    //   3145: aload_0
    //   3146: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   3149: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3152: pop
    //   3153: aload 139
    //   3155: ldc_w 1095
    //   3158: aload_0
    //   3159: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   3162: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3165: pop
    //   3166: aload 139
    //   3168: invokestatic 1126	textnow/aq/m:g	()Ltextnow/bb/k;
    //   3171: invokevirtual 1118	textnow/bb/k:putAll	(Ljava/util/Map;)V
    //   3174: aload_0
    //   3175: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3178: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3181: aload_0
    //   3182: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3185: new 448	java/lang/Thread
    //   3188: dup
    //   3189: new 1103	textnow/aq/d
    //   3192: dup
    //   3193: ldc_w 1105
    //   3196: aload_0
    //   3197: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   3200: ldc_w 1107
    //   3203: aload 139
    //   3205: aload_0
    //   3206: getfield 81	textnow/aq/m:c	I
    //   3209: aload 60
    //   3211: aload_0
    //   3212: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   3215: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   3218: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3221: pop
    //   3222: aload_0
    //   3223: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3226: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3229: ifeq +10 -> 3239
    //   3232: aload_0
    //   3233: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3236: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3239: aload_0
    //   3240: getfield 123	textnow/aq/m:w	I
    //   3243: istore 77
    //   3245: iload 77
    //   3247: bipush 64
    //   3249: iand
    //   3250: ifeq +70 -> 3320
    //   3253: aload_0
    //   3254: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3257: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3260: aload_0
    //   3261: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3264: new 448	java/lang/Thread
    //   3267: dup
    //   3268: new 1128	textnow/aq/h
    //   3271: dup
    //   3272: aload_0
    //   3273: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   3276: aload_0
    //   3277: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   3280: aload_0
    //   3281: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   3284: aload_0
    //   3285: getfield 83	textnow/aq/m:d	Ljava/lang/String;
    //   3288: aload_0
    //   3289: getfield 81	textnow/aq/m:c	I
    //   3292: aload_0
    //   3293: invokespecial 1131	textnow/aq/h:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtextnow/aq/m;)V
    //   3296: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   3299: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3302: pop
    //   3303: aload_0
    //   3304: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3307: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3310: ifeq +10 -> 3320
    //   3313: aload_0
    //   3314: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3317: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3320: aload_0
    //   3321: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3324: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3327: aload_0
    //   3328: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3331: invokevirtual 285	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   3334: astore 79
    //   3336: aload 79
    //   3338: invokeinterface 291 1 0
    //   3343: ifeq +498 -> 3841
    //   3346: aload 79
    //   3348: invokeinterface 295 1 0
    //   3353: checkcast 448	java/lang/Thread
    //   3356: astore 92
    //   3358: aload_0
    //   3359: getfield 481	textnow/aq/m:L	Z
    //   3362: ifne +479 -> 3841
    //   3365: aload 92
    //   3367: invokevirtual 457	java/lang/Thread:start	()V
    //   3370: goto -34 -> 3336
    //   3373: astore 78
    //   3375: aload_0
    //   3376: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3379: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3382: ifeq +10 -> 3392
    //   3385: aload_0
    //   3386: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3389: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3392: aload 78
    //   3394: athrow
    //   3395: astore 142
    //   3397: aload_0
    //   3398: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3401: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3404: ifeq +10 -> 3414
    //   3407: aload_0
    //   3408: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3411: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3414: aload 142
    //   3416: athrow
    //   3417: new 165	java/lang/StringBuilder
    //   3420: dup
    //   3421: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   3424: astore 63
    //   3426: invokestatic 1126	textnow/aq/m:g	()Ltextnow/bb/k;
    //   3429: invokevirtual 1135	textnow/bb/k:entrySet	()Ljava/util/Set;
    //   3432: invokeinterface 1138 1 0
    //   3437: astore 64
    //   3439: iconst_1
    //   3440: istore 65
    //   3442: aload 64
    //   3444: invokeinterface 291 1 0
    //   3449: ifeq +94 -> 3543
    //   3452: aload_0
    //   3453: getfield 481	textnow/aq/m:L	Z
    //   3456: ifne +12 -> 3468
    //   3459: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   3462: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   3465: ifeq +11 -> 3476
    //   3468: new 441	java/lang/InterruptedException
    //   3471: dup
    //   3472: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   3475: athrow
    //   3476: aload 64
    //   3478: invokeinterface 295 1 0
    //   3483: checkcast 1140	java/util/Map$Entry
    //   3486: astore 99
    //   3488: iload 65
    //   3490: ifne +12 -> 3502
    //   3493: aload 63
    //   3495: ldc_w 337
    //   3498: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3501: pop
    //   3502: aload 63
    //   3504: aload 99
    //   3506: invokeinterface 1143 1 0
    //   3511: checkcast 184	java/lang/String
    //   3514: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3517: ldc_w 299
    //   3520: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3523: aload 99
    //   3525: invokeinterface 1146 1 0
    //   3530: checkcast 184	java/lang/String
    //   3533: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3536: pop
    //   3537: iconst_0
    //   3538: istore 65
    //   3540: goto -98 -> 3442
    //   3543: new 165	java/lang/StringBuilder
    //   3546: dup
    //   3547: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   3550: astore 66
    //   3552: aload 66
    //   3554: aload 63
    //   3556: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3559: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3562: pop
    //   3563: aload_0
    //   3564: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   3567: ifnull +22 -> 3589
    //   3570: aload 66
    //   3572: ldc_w 1148
    //   3575: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3578: pop
    //   3579: aload 66
    //   3581: aload_0
    //   3582: getfield 89	textnow/aq/m:g	Ljava/lang/String;
    //   3585: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3588: pop
    //   3589: aload_0
    //   3590: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   3593: ifnull +22 -> 3615
    //   3596: aload 66
    //   3598: ldc_w 1150
    //   3601: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3604: pop
    //   3605: aload 66
    //   3607: aload_0
    //   3608: getfield 87	textnow/aq/m:f	Ljava/lang/String;
    //   3611: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3614: pop
    //   3615: aload_0
    //   3616: getfield 481	textnow/aq/m:L	Z
    //   3619: ifne +12 -> 3631
    //   3622: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   3625: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   3628: ifeq +11 -> 3639
    //   3631: new 441	java/lang/InterruptedException
    //   3634: dup
    //   3635: invokespecial 482	java/lang/InterruptedException:<init>	()V
    //   3638: athrow
    //   3639: new 674	textnow/bb/k
    //   3642: dup
    //   3643: invokespecial 675	textnow/bb/k:<init>	()V
    //   3646: astore 68
    //   3648: aload 68
    //   3650: ldc_w 1093
    //   3653: aload_0
    //   3654: getfield 125	textnow/aq/m:x	Ljava/lang/String;
    //   3657: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3660: pop
    //   3661: aload 68
    //   3663: ldc_w 1095
    //   3666: aload_0
    //   3667: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   3670: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3673: pop
    //   3674: aload 68
    //   3676: ldc_w 1120
    //   3679: aload 56
    //   3681: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3684: pop
    //   3685: aload 68
    //   3687: ldc_w 1122
    //   3690: aload 59
    //   3692: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3695: pop
    //   3696: aload 68
    //   3698: ldc_w 1152
    //   3701: aload 66
    //   3703: invokevirtual 221	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3706: aload_0
    //   3707: getfield 79	textnow/aq/m:b	Ljava/lang/String;
    //   3710: invokestatic 306	textnow/aq/m:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3713: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3716: pop
    //   3717: aload 68
    //   3719: ldc_w 1101
    //   3722: ldc_w 1098
    //   3725: invokevirtual 695	textnow/bb/k:a	(Ljava/lang/String;Ljava/lang/String;)Ltextnow/bb/k;
    //   3728: pop
    //   3729: aload_0
    //   3730: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3733: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3736: aload_0
    //   3737: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3740: new 448	java/lang/Thread
    //   3743: dup
    //   3744: new 1103	textnow/aq/d
    //   3747: dup
    //   3748: ldc_w 1105
    //   3751: aload_0
    //   3752: getfield 127	textnow/aq/m:y	Ljava/lang/String;
    //   3755: ldc_w 1107
    //   3758: aload 68
    //   3760: aload_0
    //   3761: getfield 81	textnow/aq/m:c	I
    //   3764: aload 60
    //   3766: aload_0
    //   3767: invokespecial 1110	textnow/aq/d:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltextnow/bb/k;ILjava/util/Map;Ltextnow/aq/m;)V
    //   3770: invokespecial 451	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   3773: invokevirtual 460	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   3776: pop
    //   3777: aload_0
    //   3778: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3781: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3784: ifeq -545 -> 3239
    //   3787: aload_0
    //   3788: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3791: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3794: goto -555 -> 3239
    //   3797: astore 75
    //   3799: aload_0
    //   3800: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3803: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3806: ifeq +10 -> 3816
    //   3809: aload_0
    //   3810: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3813: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3816: aload 75
    //   3818: athrow
    //   3819: astore 93
    //   3821: aload_0
    //   3822: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3825: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3828: ifeq +10 -> 3838
    //   3831: aload_0
    //   3832: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3835: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3838: aload 93
    //   3840: athrow
    //   3841: aload_0
    //   3842: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3845: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3848: ifeq +10 -> 3858
    //   3851: aload_0
    //   3852: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3855: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3858: aload_0
    //   3859: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3862: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3865: aload_0
    //   3866: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3869: invokevirtual 285	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   3872: astore 81
    //   3874: aload 81
    //   3876: invokeinterface 291 1 0
    //   3881: ifeq +70 -> 3951
    //   3884: aload 81
    //   3886: invokeinterface 295 1 0
    //   3891: checkcast 448	java/lang/Thread
    //   3894: astore 88
    //   3896: aload_0
    //   3897: getfield 481	textnow/aq/m:L	Z
    //   3900: ifne +51 -> 3951
    //   3903: invokestatic 496	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   3906: invokevirtual 499	java/lang/Thread:isInterrupted	()Z
    //   3909: istore 89
    //   3911: iload 89
    //   3913: ifne +38 -> 3951
    //   3916: aload 88
    //   3918: invokevirtual 1154	java/lang/Thread:join	()V
    //   3921: goto -47 -> 3874
    //   3924: astore 90
    //   3926: aload_0
    //   3927: getfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   3930: getstatic 746	textnow/aq/n:a	Ltextnow/aq/n;
    //   3933: if_acmpne +10 -> 3943
    //   3936: aload_0
    //   3937: getstatic 489	textnow/aq/n:c	Ltextnow/aq/n;
    //   3940: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   3943: aload_0
    //   3944: invokevirtual 750	textnow/aq/m:d	()V
    //   3947: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   3950: pop
    //   3951: aload_0
    //   3952: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3955: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   3958: ifeq +10 -> 3968
    //   3961: aload_0
    //   3962: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3965: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   3968: aload_0
    //   3969: getfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   3972: getstatic 746	textnow/aq/n:a	Ltextnow/aq/n;
    //   3975: if_acmpne +10 -> 3985
    //   3978: aload_0
    //   3979: getstatic 153	textnow/aq/n:b	Ltextnow/aq/n;
    //   3982: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   3985: aload_0
    //   3986: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   3989: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   3992: aload_0
    //   3993: getfield 142	textnow/aq/m:B	Ljava/util/ArrayList;
    //   3996: invokevirtual 753	java/util/ArrayList:clear	()V
    //   3999: aload_0
    //   4000: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4003: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4006: ifeq +10 -> 4016
    //   4009: aload_0
    //   4010: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4013: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4016: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   4019: pop
    //   4020: aload_0
    //   4021: getfield 481	textnow/aq/m:L	Z
    //   4024: ifeq +14 -> 4038
    //   4027: aload_0
    //   4028: getstatic 783	textnow/aq/n:h	Ltextnow/aq/n;
    //   4031: putfield 155	textnow/aq/m:K	Ltextnow/aq/n;
    //   4034: invokestatic 805	java/lang/Thread:interrupted	()Z
    //   4037: pop
    //   4038: aload_0
    //   4039: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4042: invokevirtual 454	java/util/concurrent/locks/ReentrantLock:lockInterruptibly	()V
    //   4045: aload_0
    //   4046: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   4049: ifnull +12 -> 4061
    //   4052: aload_0
    //   4053: getfield 137	textnow/aq/m:F	Ltextnow/aq/g;
    //   4056: invokeinterface 810 1 0
    //   4061: aload_0
    //   4062: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4065: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4068: ifeq -3922 -> 146
    //   4071: aload_0
    //   4072: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4075: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4078: goto -3932 -> 146
    //   4081: astore 80
    //   4083: aload_0
    //   4084: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4087: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4090: ifeq +10 -> 4100
    //   4093: aload_0
    //   4094: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4097: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4100: aload 80
    //   4102: athrow
    //   4103: astore 82
    //   4105: aload_0
    //   4106: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4109: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4112: ifeq +10 -> 4122
    //   4115: aload_0
    //   4116: getfield 147	textnow/aq/m:H	Ljava/util/concurrent/locks/ReentrantLock;
    //   4119: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4122: aload 82
    //   4124: athrow
    //   4125: astore 4
    //   4127: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   4130: pop
    //   4131: aload_0
    //   4132: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4135: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4138: ifeq -3824 -> 314
    //   4141: aload_0
    //   4142: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4145: astore 6
    //   4147: goto -3838 -> 309
    //   4150: astore_3
    //   4151: aload_0
    //   4152: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4155: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4158: ifeq +10 -> 4168
    //   4161: aload_0
    //   4162: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4165: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4168: aload_3
    //   4169: athrow
    //   4170: astore 11
    //   4172: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   4175: pop
    //   4176: aload_0
    //   4177: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4180: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4183: ifeq -4037 -> 146
    //   4186: aload_0
    //   4187: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4190: astore 13
    //   4192: goto -4051 -> 141
    //   4195: astore 10
    //   4197: aload_0
    //   4198: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4201: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4204: ifeq +10 -> 4214
    //   4207: aload_0
    //   4208: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4211: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4214: aload 10
    //   4216: athrow
    //   4217: astore 85
    //   4219: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   4222: pop
    //   4223: aload_0
    //   4224: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4227: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4230: ifeq -4084 -> 146
    //   4233: aload_0
    //   4234: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4237: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4240: goto -4094 -> 146
    //   4243: astore 84
    //   4245: aload_0
    //   4246: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4249: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4252: ifeq +10 -> 4262
    //   4255: aload_0
    //   4256: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4259: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4262: aload 84
    //   4264: athrow
    //   4265: astore 18
    //   4267: getstatic 70	textnow/aq/m:C	Ljava/lang/String;
    //   4270: pop
    //   4271: aload_0
    //   4272: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4275: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4278: ifeq -4132 -> 146
    //   4281: aload_0
    //   4282: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4285: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4288: goto -4142 -> 146
    //   4291: astore 17
    //   4293: aload_0
    //   4294: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4297: invokevirtual 792	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   4300: ifeq +10 -> 4310
    //   4303: aload_0
    //   4304: getfield 149	textnow/aq/m:I	Ljava/util/concurrent/locks/ReentrantLock;
    //   4307: invokevirtual 476	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   4310: aload 17
    //   4312: athrow
    //   4313: iload 188
    //   4315: istore 189
    //   4317: goto -3890 -> 427
    //   4320: iconst_1
    //   4321: istore 187
    //   4323: goto -3932 -> 391
    //   4326: iconst_0
    //   4327: istore 187
    //   4329: goto -3938 -> 391
    //   4332: aconst_null
    //   4333: astore 194
    //   4335: goto -3842 -> 493
    //   4338: aload 190
    //   4340: astore 22
    //   4342: goto -3990 -> 352
    //
    // Exception table:
    //   from	to	target	type
    //   0	63	71	java/lang/InterruptedException
    //   63	71	71	java/lang/InterruptedException
    //   152	162	71	java/lang/InterruptedException
    //   223	243	71	java/lang/InterruptedException
    //   243	251	71	java/lang/InterruptedException
    //   321	340	71	java/lang/InterruptedException
    //   340	349	71	java/lang/InterruptedException
    //   352	368	71	java/lang/InterruptedException
    //   368	376	71	java/lang/InterruptedException
    //   376	388	71	java/lang/InterruptedException
    //   399	409	71	java/lang/InterruptedException
    //   412	421	71	java/lang/InterruptedException
    //   427	484	71	java/lang/InterruptedException
    //   493	560	71	java/lang/InterruptedException
    //   565	587	71	java/lang/InterruptedException
    //   594	620	71	java/lang/InterruptedException
    //   623	642	71	java/lang/InterruptedException
    //   647	708	71	java/lang/InterruptedException
    //   708	749	71	java/lang/InterruptedException
    //   749	753	71	java/lang/InterruptedException
    //   761	833	71	java/lang/InterruptedException
    //   833	882	71	java/lang/InterruptedException
    //   882	891	71	java/lang/InterruptedException
    //   891	917	71	java/lang/InterruptedException
    //   917	959	71	java/lang/InterruptedException
    //   959	965	71	java/lang/InterruptedException
    //   969	1019	71	java/lang/InterruptedException
    //   1019	1038	71	java/lang/InterruptedException
    //   1043	1060	71	java/lang/InterruptedException
    //   1060	1076	71	java/lang/InterruptedException
    //   1076	1084	71	java/lang/InterruptedException
    //   1084	1106	71	java/lang/InterruptedException
    //   1111	1115	71	java/lang/InterruptedException
    //   1118	1123	71	java/lang/InterruptedException
    //   1126	1153	71	java/lang/InterruptedException
    //   1156	1177	71	java/lang/InterruptedException
    //   1184	1190	71	java/lang/InterruptedException
    //   1193	1197	71	java/lang/InterruptedException
    //   1200	1227	71	java/lang/InterruptedException
    //   1227	1235	71	java/lang/InterruptedException
    //   1235	1262	71	java/lang/InterruptedException
    //   1262	1270	71	java/lang/InterruptedException
    //   1270	1297	71	java/lang/InterruptedException
    //   1297	1305	71	java/lang/InterruptedException
    //   1305	1353	71	java/lang/InterruptedException
    //   1353	1369	71	java/lang/InterruptedException
    //   1369	1377	71	java/lang/InterruptedException
    //   1377	1415	71	java/lang/InterruptedException
    //   1428	1449	71	java/lang/InterruptedException
    //   1449	1540	71	java/lang/InterruptedException
    //   1540	1548	71	java/lang/InterruptedException
    //   1548	1576	71	java/lang/InterruptedException
    //   1580	1602	71	java/lang/InterruptedException
    //   1602	1610	71	java/lang/InterruptedException
    //   1610	1623	71	java/lang/InterruptedException
    //   1628	1644	71	java/lang/InterruptedException
    //   1644	2005	71	java/lang/InterruptedException
    //   2008	2022	71	java/lang/InterruptedException
    //   2027	2047	71	java/lang/InterruptedException
    //   2047	2066	71	java/lang/InterruptedException
    //   2070	2150	71	java/lang/InterruptedException
    //   2150	2169	71	java/lang/InterruptedException
    //   2169	2301	71	java/lang/InterruptedException
    //   2390	2407	71	java/lang/InterruptedException
    //   2407	2535	71	java/lang/InterruptedException
    //   2583	2600	71	java/lang/InterruptedException
    //   2600	2657	71	java/lang/InterruptedException
    //   2705	2722	71	java/lang/InterruptedException
    //   2722	2913	71	java/lang/InterruptedException
    //   2961	2978	71	java/lang/InterruptedException
    //   2978	2994	71	java/lang/InterruptedException
    //   2994	3002	71	java/lang/InterruptedException
    //   3002	3008	71	java/lang/InterruptedException
    //   3011	3040	71	java/lang/InterruptedException
    //   3045	3062	71	java/lang/InterruptedException
    //   3062	3065	71	java/lang/InterruptedException
    //   3067	3084	71	java/lang/InterruptedException
    //   3084	3087	71	java/lang/InterruptedException
    //   3089	3106	71	java/lang/InterruptedException
    //   3106	3109	71	java/lang/InterruptedException
    //   3111	3128	71	java/lang/InterruptedException
    //   3128	3131	71	java/lang/InterruptedException
    //   3131	3174	71	java/lang/InterruptedException
    //   3222	3239	71	java/lang/InterruptedException
    //   3239	3245	71	java/lang/InterruptedException
    //   3303	3320	71	java/lang/InterruptedException
    //   3375	3392	71	java/lang/InterruptedException
    //   3392	3395	71	java/lang/InterruptedException
    //   3397	3414	71	java/lang/InterruptedException
    //   3414	3417	71	java/lang/InterruptedException
    //   3417	3439	71	java/lang/InterruptedException
    //   3442	3468	71	java/lang/InterruptedException
    //   3468	3476	71	java/lang/InterruptedException
    //   3476	3488	71	java/lang/InterruptedException
    //   3493	3502	71	java/lang/InterruptedException
    //   3502	3537	71	java/lang/InterruptedException
    //   3543	3589	71	java/lang/InterruptedException
    //   3589	3615	71	java/lang/InterruptedException
    //   3615	3631	71	java/lang/InterruptedException
    //   3631	3639	71	java/lang/InterruptedException
    //   3639	3729	71	java/lang/InterruptedException
    //   3777	3794	71	java/lang/InterruptedException
    //   3799	3816	71	java/lang/InterruptedException
    //   3816	3819	71	java/lang/InterruptedException
    //   3821	3838	71	java/lang/InterruptedException
    //   3838	3841	71	java/lang/InterruptedException
    //   3841	3858	71	java/lang/InterruptedException
    //   3951	3968	71	java/lang/InterruptedException
    //   3968	3985	71	java/lang/InterruptedException
    //   3999	4016	71	java/lang/InterruptedException
    //   4016	4020	71	java/lang/InterruptedException
    //   4083	4100	71	java/lang/InterruptedException
    //   4100	4103	71	java/lang/InterruptedException
    //   4105	4122	71	java/lang/InterruptedException
    //   4122	4125	71	java/lang/InterruptedException
    //   0	63	251	finally
    //   63	71	251	finally
    //   73	84	251	finally
    //   152	162	251	finally
    //   223	243	251	finally
    //   243	251	251	finally
    //   321	340	251	finally
    //   340	349	251	finally
    //   352	368	251	finally
    //   368	376	251	finally
    //   376	388	251	finally
    //   399	409	251	finally
    //   412	421	251	finally
    //   427	484	251	finally
    //   493	560	251	finally
    //   565	587	251	finally
    //   594	620	251	finally
    //   623	642	251	finally
    //   647	708	251	finally
    //   708	749	251	finally
    //   749	753	251	finally
    //   761	833	251	finally
    //   833	882	251	finally
    //   882	891	251	finally
    //   891	917	251	finally
    //   917	959	251	finally
    //   959	965	251	finally
    //   969	1019	251	finally
    //   1019	1038	251	finally
    //   1043	1060	251	finally
    //   1060	1076	251	finally
    //   1076	1084	251	finally
    //   1084	1106	251	finally
    //   1111	1115	251	finally
    //   1118	1123	251	finally
    //   1126	1153	251	finally
    //   1156	1177	251	finally
    //   1184	1190	251	finally
    //   1193	1197	251	finally
    //   1200	1227	251	finally
    //   1227	1235	251	finally
    //   1235	1262	251	finally
    //   1262	1270	251	finally
    //   1270	1297	251	finally
    //   1297	1305	251	finally
    //   1305	1353	251	finally
    //   1353	1369	251	finally
    //   1369	1377	251	finally
    //   1377	1415	251	finally
    //   1428	1449	251	finally
    //   1449	1540	251	finally
    //   1540	1548	251	finally
    //   1548	1576	251	finally
    //   1580	1602	251	finally
    //   1602	1610	251	finally
    //   1610	1623	251	finally
    //   1628	1644	251	finally
    //   1644	2005	251	finally
    //   2008	2022	251	finally
    //   2027	2047	251	finally
    //   2047	2066	251	finally
    //   2070	2150	251	finally
    //   2150	2169	251	finally
    //   2169	2301	251	finally
    //   2390	2407	251	finally
    //   2407	2535	251	finally
    //   2583	2600	251	finally
    //   2600	2657	251	finally
    //   2705	2722	251	finally
    //   2722	2913	251	finally
    //   2961	2978	251	finally
    //   2978	2994	251	finally
    //   2994	3002	251	finally
    //   3002	3008	251	finally
    //   3011	3040	251	finally
    //   3045	3062	251	finally
    //   3062	3065	251	finally
    //   3067	3084	251	finally
    //   3084	3087	251	finally
    //   3089	3106	251	finally
    //   3106	3109	251	finally
    //   3111	3128	251	finally
    //   3128	3131	251	finally
    //   3131	3174	251	finally
    //   3222	3239	251	finally
    //   3239	3245	251	finally
    //   3303	3320	251	finally
    //   3375	3392	251	finally
    //   3392	3395	251	finally
    //   3397	3414	251	finally
    //   3414	3417	251	finally
    //   3417	3439	251	finally
    //   3442	3468	251	finally
    //   3468	3476	251	finally
    //   3476	3488	251	finally
    //   3493	3502	251	finally
    //   3502	3537	251	finally
    //   3543	3589	251	finally
    //   3589	3615	251	finally
    //   3615	3631	251	finally
    //   3631	3639	251	finally
    //   3639	3729	251	finally
    //   3777	3794	251	finally
    //   3799	3816	251	finally
    //   3816	3819	251	finally
    //   3821	3838	251	finally
    //   3838	3841	251	finally
    //   3841	3858	251	finally
    //   3951	3968	251	finally
    //   3968	3985	251	finally
    //   3999	4016	251	finally
    //   4016	4020	251	finally
    //   4083	4100	251	finally
    //   4100	4103	251	finally
    //   4105	4122	251	finally
    //   4122	4125	251	finally
    //   917	959	1109	java/lang/SecurityException
    //   2301	2390	3043	finally
    //   2535	2583	3065	finally
    //   2657	2705	3087	finally
    //   2913	2961	3109	finally
    //   3320	3336	3373	finally
    //   3336	3370	3373	finally
    //   3174	3222	3395	finally
    //   3729	3777	3797	finally
    //   3253	3303	3819	finally
    //   3916	3921	3924	java/lang/InterruptedException
    //   3858	3874	4081	finally
    //   3874	3911	4081	finally
    //   3916	3921	4081	finally
    //   3926	3943	4081	finally
    //   3943	3951	4081	finally
    //   3985	3999	4103	finally
    //   270	293	4125	java/lang/InterruptedException
    //   270	293	4150	finally
    //   4127	4131	4150	finally
    //   102	125	4170	java/lang/InterruptedException
    //   102	125	4195	finally
    //   4172	4176	4195	finally
    //   4038	4061	4217	java/lang/InterruptedException
    //   4038	4061	4243	finally
    //   4219	4223	4243	finally
    //   180	203	4265	java/lang/InterruptedException
    //   180	203	4291	finally
    //   4267	4271	4291	finally
  }

  final void d()
  {
    try
    {
      Iterator localIterator = this.B.iterator();
      while (localIterator.hasNext())
      {
        Thread localThread = (Thread)localIterator.next();
        new StringBuilder("sending interrupt to TID: ").append(localThread.getId());
        localThread.interrupt();
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.m
 * JD-Core Version:    0.6.2
 */