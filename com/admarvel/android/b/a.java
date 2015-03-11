package com.admarvel.android.b;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import com.admarvel.android.ads.AdMarvelAd;
import com.admarvel.android.ads.AdMarvelUtils;
import com.admarvel.android.util.Logging;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class a
{
  private final Handler a = null;
  private WeakReference<Context> b = null;

  public static com.admarvel.android.b.a.a a(String[] paramArrayOfString)
  {
    com.admarvel.android.b.a.a locala = new com.admarvel.android.b.a.a();
    if (paramArrayOfString.length >= 10)
    {
      locala.b(Integer.valueOf(paramArrayOfString[3]).intValue());
      locala.a(Integer.valueOf(paramArrayOfString[5]).intValue());
      locala.a(Float.valueOf(paramArrayOfString[6]).floatValue());
      locala.c(Integer.valueOf(paramArrayOfString[7]).intValue());
      locala.a(b(paramArrayOfString[8]));
      locala.b(b(paramArrayOfString[9]));
      Object localObject1 = "";
      try
      {
        String str2 = URLDecoder.decode(paramArrayOfString[10], "UTF-8");
        localObject1 = str2;
        String[] arrayOfString1 = ((String)localObject1).split("&");
        if (arrayOfString1.length > 0)
        {
          localObject2 = new HashMap();
          int i = arrayOfString1.length;
          int j = 0;
          while (true)
          {
            if (j >= i)
              break label334;
            str1 = arrayOfString1[j];
            arrayOfString2 = str1.split(";");
            if (arrayOfString2.length <= 2)
              break label328;
            if (((HashMap)localObject2).containsKey(arrayOfString2[0]))
              break;
            ArrayList localArrayList1 = new ArrayList();
            localArrayList1.add(str1.substring(1 + str1.indexOf(";")).split(";"));
            ((HashMap)localObject2).put(arrayOfString2[0], localArrayList1);
            localObject3 = localObject2;
            j++;
            localObject2 = localObject3;
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object localObject2;
        while (true)
        {
          String str1;
          String[] arrayOfString2;
          Logging.log("Offline SDK:" + localUnsupportedEncodingException.getMessage());
          continue;
          ArrayList localArrayList2 = (ArrayList)((HashMap)localObject2).get(arrayOfString2[0]);
          localArrayList2.add(str1.substring(1 + str1.indexOf(";")).split(";"));
          ((HashMap)localObject2).put(arrayOfString2[0], localArrayList2);
          Object localObject3 = localObject2;
          continue;
          label328: localObject3 = null;
        }
        label334: locala.a((HashMap)localObject2);
      }
    }
    return locala;
  }

  public static FileInputStream a(String paramString)
  {
    paramString.substring(0, paramString.lastIndexOf("/"));
    paramString.substring(1 + paramString.lastIndexOf("/"));
    File localFile = new File(paramString);
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      return localFileInputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Logging.log("Offline SDK:read file" + localFileNotFoundException.getMessage());
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        Logging.log("Offline SDK:read file" + localNullPointerException.getMessage());
    }
    catch (Exception localException)
    {
      while (true)
        Logging.log("Offline SDK:read file" + localException.getMessage());
    }
  }

  // ERROR //
  public static Object a(String paramString1, String paramString2, Context paramContext)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 173
    //   3: iconst_0
    //   4: invokevirtual 179	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   7: astore_3
    //   8: aload_0
    //   9: ifnonnull +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 152	java/io/File
    //   17: dup
    //   18: aload_3
    //   19: aload_0
    //   20: invokespecial 182	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: astore 4
    //   25: aload 4
    //   27: invokevirtual 186	java/io/File:exists	()Z
    //   30: ifne +5 -> 35
    //   33: aconst_null
    //   34: areturn
    //   35: new 188	java/io/ObjectInputStream
    //   38: dup
    //   39: new 156	java/io/FileInputStream
    //   42: dup
    //   43: aload 4
    //   45: invokespecial 159	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   48: invokespecial 191	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   51: astore 5
    //   53: aload_1
    //   54: ldc 193
    //   56: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +36 -> 95
    //   62: aload 5
    //   64: invokevirtual 200	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   67: checkcast 202	com/admarvel/android/b/a/b
    //   70: astore 25
    //   72: aload 5
    //   74: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   77: aload 5
    //   79: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   82: aload 25
    //   84: areturn
    //   85: astore 26
    //   87: aload 26
    //   89: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   92: aload 25
    //   94: areturn
    //   95: aload_1
    //   96: ldc 210
    //   98: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   101: ifeq +36 -> 137
    //   104: aload 5
    //   106: invokevirtual 200	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   109: checkcast 90	java/util/ArrayList
    //   112: astore 23
    //   114: aload 5
    //   116: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   119: aload 5
    //   121: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   124: aload 23
    //   126: areturn
    //   127: astore 24
    //   129: aload 24
    //   131: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   134: aload 23
    //   136: areturn
    //   137: aload_1
    //   138: ldc 212
    //   140: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   143: ifeq +36 -> 179
    //   146: aload 5
    //   148: invokevirtual 200	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   151: checkcast 81	java/util/HashMap
    //   154: astore 21
    //   156: aload 5
    //   158: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   161: aload 5
    //   163: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   166: aload 21
    //   168: areturn
    //   169: astore 22
    //   171: aload 22
    //   173: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   176: aload 21
    //   178: areturn
    //   179: aload_1
    //   180: ldc 214
    //   182: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifeq +36 -> 221
    //   188: aload 5
    //   190: invokevirtual 200	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   193: checkcast 81	java/util/HashMap
    //   196: astore 19
    //   198: aload 5
    //   200: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   203: aload 5
    //   205: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   208: aload 19
    //   210: areturn
    //   211: astore 20
    //   213: aload 20
    //   215: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   218: aload 19
    //   220: areturn
    //   221: aload_1
    //   222: ldc 216
    //   224: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   227: ifeq +36 -> 263
    //   230: aload 5
    //   232: invokevirtual 200	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   235: checkcast 81	java/util/HashMap
    //   238: astore 17
    //   240: aload 5
    //   242: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   245: aload 5
    //   247: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   250: aload 17
    //   252: areturn
    //   253: astore 18
    //   255: aload 18
    //   257: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   260: aload 17
    //   262: areturn
    //   263: aload 5
    //   265: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   268: aconst_null
    //   269: areturn
    //   270: astore 16
    //   272: aload 16
    //   274: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   277: goto -9 -> 268
    //   280: astore 6
    //   282: aconst_null
    //   283: astore 5
    //   285: new 108	java/lang/StringBuilder
    //   288: dup
    //   289: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   292: ldc 111
    //   294: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: aload 6
    //   299: invokestatic 222	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   302: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   308: invokestatic 128	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   311: aload 5
    //   313: ifnull -45 -> 268
    //   316: aload 5
    //   318: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   321: goto -53 -> 268
    //   324: astore 9
    //   326: aload 9
    //   328: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   331: goto -63 -> 268
    //   334: astore 10
    //   336: aconst_null
    //   337: astore 5
    //   339: new 108	java/lang/StringBuilder
    //   342: dup
    //   343: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   346: ldc 111
    //   348: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: aload 10
    //   353: invokestatic 222	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   356: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: invokestatic 128	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   365: aload 5
    //   367: ifnull -99 -> 268
    //   370: aload 5
    //   372: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   375: goto -107 -> 268
    //   378: astore 11
    //   380: aload 11
    //   382: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   385: goto -117 -> 268
    //   388: astore 12
    //   390: aconst_null
    //   391: astore 5
    //   393: new 108	java/lang/StringBuilder
    //   396: dup
    //   397: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   400: ldc 111
    //   402: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: aload 12
    //   407: invokestatic 222	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   410: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   416: invokestatic 128	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   419: aload 5
    //   421: ifnull -153 -> 268
    //   424: aload 5
    //   426: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   429: goto -161 -> 268
    //   432: astore 13
    //   434: aload 13
    //   436: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   439: goto -171 -> 268
    //   442: astore 14
    //   444: aconst_null
    //   445: astore 5
    //   447: new 108	java/lang/StringBuilder
    //   450: dup
    //   451: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   454: ldc 111
    //   456: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: aload 14
    //   461: invokestatic 222	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   464: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: invokestatic 128	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   473: aload 5
    //   475: ifnull -207 -> 268
    //   478: aload 5
    //   480: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   483: goto -215 -> 268
    //   486: astore 15
    //   488: aload 15
    //   490: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   493: goto -225 -> 268
    //   496: astore 7
    //   498: aconst_null
    //   499: astore 5
    //   501: aload 5
    //   503: ifnull +8 -> 511
    //   506: aload 5
    //   508: invokevirtual 205	java/io/ObjectInputStream:close	()V
    //   511: aload 7
    //   513: athrow
    //   514: astore 8
    //   516: aload 8
    //   518: invokevirtual 208	java/io/IOException:printStackTrace	()V
    //   521: goto -10 -> 511
    //   524: astore 7
    //   526: goto -25 -> 501
    //   529: astore 14
    //   531: goto -84 -> 447
    //   534: astore 12
    //   536: goto -143 -> 393
    //   539: astore 10
    //   541: goto -202 -> 339
    //   544: astore 6
    //   546: goto -261 -> 285
    //
    // Exception table:
    //   from	to	target	type
    //   77	82	85	java/io/IOException
    //   119	124	127	java/io/IOException
    //   161	166	169	java/io/IOException
    //   203	208	211	java/io/IOException
    //   245	250	253	java/io/IOException
    //   263	268	270	java/io/IOException
    //   35	53	280	java/io/StreamCorruptedException
    //   316	321	324	java/io/IOException
    //   35	53	334	java/io/FileNotFoundException
    //   370	375	378	java/io/IOException
    //   35	53	388	java/io/IOException
    //   424	429	432	java/io/IOException
    //   35	53	442	java/lang/ClassNotFoundException
    //   478	483	486	java/io/IOException
    //   35	53	496	finally
    //   506	511	514	java/io/IOException
    //   53	77	524	finally
    //   95	119	524	finally
    //   137	161	524	finally
    //   179	203	524	finally
    //   221	245	524	finally
    //   285	311	524	finally
    //   339	365	524	finally
    //   393	419	524	finally
    //   447	473	524	finally
    //   53	77	529	java/lang/ClassNotFoundException
    //   95	119	529	java/lang/ClassNotFoundException
    //   137	161	529	java/lang/ClassNotFoundException
    //   179	203	529	java/lang/ClassNotFoundException
    //   221	245	529	java/lang/ClassNotFoundException
    //   53	77	534	java/io/IOException
    //   95	119	534	java/io/IOException
    //   137	161	534	java/io/IOException
    //   179	203	534	java/io/IOException
    //   221	245	534	java/io/IOException
    //   53	77	539	java/io/FileNotFoundException
    //   95	119	539	java/io/FileNotFoundException
    //   137	161	539	java/io/FileNotFoundException
    //   179	203	539	java/io/FileNotFoundException
    //   221	245	539	java/io/FileNotFoundException
    //   53	77	544	java/io/StreamCorruptedException
    //   95	119	544	java/io/StreamCorruptedException
    //   137	161	544	java/io/StreamCorruptedException
    //   179	203	544	java/io/StreamCorruptedException
    //   221	245	544	java/io/StreamCorruptedException
  }

  public static String a(FileInputStream paramFileInputStream, String paramString)
  {
    File localFile1 = new File(Environment.getExternalStorageDirectory() + "/" + ".admfiles");
    if (!localFile1.exists())
      localFile1.mkdirs();
    File localFile2 = new File(localFile1.getAbsolutePath() + "/" + paramString);
    byte[] arrayOfByte;
    if (!localFile2.exists())
      arrayOfByte = new byte[16384];
    try
    {
      localFile2.createNewFile();
      localFileOutputStream = new FileOutputStream(localFile2);
      while (true)
      {
        int i = paramFileInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localFileOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      FileOutputStream localFileOutputStream;
      localFileNotFoundException.printStackTrace();
      while (true)
      {
        return localFile2.getAbsolutePath();
        localFileOutputStream.close();
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public static String a(String paramString1, String paramString2)
  {
    File localFile = new File(paramString1, paramString2);
    BufferedReader localBufferedReader;
    ArrayList localArrayList;
    int j;
    if (localFile.exists())
    {
      Logging.log("Offline: readData- file exist");
      try
      {
        localBufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(localFile)));
        localArrayList = new ArrayList();
        int i = 8192;
        j = 0;
        while (i != -1)
        {
          char[] arrayOfChar1 = new char[8192];
          i = localBufferedReader.read(arrayOfChar1, 0, 8192);
          if (i > 0)
          {
            a.a locala1 = new a.a(null);
            locala1.a = arrayOfChar1;
            locala1.b = i;
            j += i;
            localArrayList.add(locala1);
          }
        }
      }
      catch (Exception localException)
      {
        Logging.log("error" + localException.getMessage());
      }
    }
    do
    {
      return "";
      Logging.log("Offline: readData- file doesn't exist");
      break;
      localBufferedReader.close();
    }
    while (j <= 0);
    char[] arrayOfChar2 = new char[j];
    int k = 0;
    int m = 0;
    while (k < localArrayList.size())
    {
      a.a locala2 = (a.a)localArrayList.get(k);
      System.arraycopy(locala2.a, 0, arrayOfChar2, m, locala2.b);
      m += locala2.b;
      k++;
    }
    String str = new String(arrayOfChar2);
    return str;
  }

  public static void a(File paramFile, Object paramObject, String paramString)
  {
    if (paramObject == null)
      return;
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(new File(paramFile, paramString));
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localFileOutputStream);
      localObjectOutputStream.writeObject(paramObject);
      localObjectOutputStream.close();
      localFileOutputStream.close();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Logging.log("Offline SDK:" + localFileNotFoundException.getMessage());
      return;
    }
    catch (IOException localIOException)
    {
      Logging.log("Offline SDK:" + localIOException.getMessage());
    }
  }

  public static void a(File paramFile, String paramString)
  {
    b localb;
    HashMap localHashMap;
    try
    {
      localFileInputStream = new FileInputStream(paramString);
      localb = new b(new InputStreamReader(localFileInputStream));
      ArrayList localArrayList1 = localb.c();
      ArrayList localArrayList2 = new ArrayList();
      localHashMap = new HashMap();
      if (localArrayList1 != null)
      {
        Iterator localIterator = localArrayList1.iterator();
        while (localIterator.hasNext())
        {
          String[] arrayOfString = (String[])localIterator.next();
          String str = arrayOfString[0] + "_" + arrayOfString[1];
          localArrayList2.add(str);
          localHashMap.put(arrayOfString[0], str);
        }
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        Logging.log("Offline SDK:" + localFileNotFoundException.getMessage());
        FileInputStream localFileInputStream = null;
      }
    }
    try
    {
      localb.b();
      a(paramFile, localHashMap, "/banner_folder_map");
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public static long b(String paramString)
  {
    try
    {
      String str = URLDecoder.decode(paramString, "UTF-8");
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
      long l = localSimpleDateFormat.parse(str).getTime();
      return l;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Logging.log("Offline SDK:" + localUnsupportedEncodingException.getMessage());
      return 0L;
    }
    catch (ParseException localParseException)
    {
      while (true)
        Logging.log("Offline SDK:" + localParseException.getMessage());
    }
  }

  public static void b(File paramFile, String paramString)
  {
    try
    {
      localFileInputStream = new FileInputStream(paramString);
      ArrayList localArrayList1 = new b(new InputStreamReader(localFileInputStream)).c();
      localHashMap1 = new HashMap();
      localHashMap2 = new HashMap();
      Iterator localIterator = localArrayList1.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label217;
        arrayOfString = (String[])localIterator.next();
        com.admarvel.android.b.a.a locala = a(arrayOfString);
        localHashMap1.put(Integer.valueOf(locala.f()), locala);
        if (localHashMap2.containsKey(arrayOfString[1]))
          break;
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.add(arrayOfString[3]);
        localHashMap2.put(arrayOfString[1], localArrayList2);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      HashMap localHashMap1;
      HashMap localHashMap2;
      while (true)
      {
        String[] arrayOfString;
        Logging.log("Offline SDK:" + localFileNotFoundException.getMessage());
        FileInputStream localFileInputStream = null;
        continue;
        ArrayList localArrayList3 = (ArrayList)localHashMap2.get(arrayOfString[1]);
        localArrayList3.add(arrayOfString[3]);
        localHashMap2.put(arrayOfString[1], localArrayList3);
      }
      label217: a(paramFile, localHashMap1, "/ad_link_object");
      a(paramFile, localHashMap2, "/site_id_banner_map");
    }
  }

  public void a(Context paramContext)
  {
    ArrayList localArrayList = (ArrayList)a("/pixel_fire_list", "/pixel_fire_list", paramContext);
    if (localArrayList != null)
    {
      if (localArrayList.size() > 50)
        for (int i = 0; i < 50; i++)
        {
          String str2 = ((String)localArrayList.get(0)).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
          new AdMarvelUtils(paramContext).firePixelUsingHTTP(str2, this.a);
          localArrayList.remove(0);
          Logging.log("Offline SDK:fire pixel url :- " + str2);
        }
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str1 = ((String)localIterator.next()).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
        new AdMarvelUtils(paramContext).firePixelUsingHTTP(str1, this.a);
        Logging.log("Offline SDK:fire pixel url :- " + str1);
      }
      localArrayList.clear();
      a(paramContext.getDir("Admarvel", 0), localArrayList, "/pixel_fire_list");
    }
  }

  public void a(AdMarvelAd paramAdMarvelAd, Context paramContext, Handler paramHandler)
  {
    if (AdMarvelUtils.isNetworkAvailable(paramContext))
    {
      ArrayList localArrayList2 = (ArrayList)a("/pixel_fire_list", "/pixel_fire_list", paramContext);
      if (localArrayList2 != null)
      {
        if (localArrayList2.size() > 50)
          for (int i = 0; i < 50; i++)
          {
            String str3 = ((String)localArrayList2.get(0)).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
            new AdMarvelUtils(paramContext).firePixelUsingHTTP(str3, paramHandler);
            Logging.log("Offline SDK:fire pixel url :- " + str3);
            localArrayList2.remove(0);
          }
        Iterator localIterator2 = localArrayList2.iterator();
        while (localIterator2.hasNext())
        {
          String str2 = ((String)localIterator2.next()).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
          new AdMarvelUtils(paramContext).firePixelUsingHTTP(str2, paramHandler);
          Logging.log("Offline SDK:fire pixel url :- " + str2);
        }
        localArrayList2.clear();
      }
      AdMarvelUtils localAdMarvelUtils = new AdMarvelUtils(paramContext);
      Iterator localIterator1 = paramAdMarvelAd.getPixels().iterator();
      while (localIterator1.hasNext())
      {
        String str1 = ((String)localIterator1.next()).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
        localAdMarvelUtils.firePixelUsingHTTP(str1, paramHandler);
        Logging.log("Offline SDK:fire pixel url :- " + str1);
      }
      a(paramContext.getDir("Admarvel", 0), localArrayList2, "/pixel_fire_list");
      return;
    }
    Logging.log("Offline SDK:No Internet available so saving pixel url in file ");
    List localList = paramAdMarvelAd.getPixels();
    File localFile = paramContext.getDir("Admarvel", 0);
    ArrayList localArrayList1 = (ArrayList)a("/pixel_fire_list", "/pixel_fire_list", paramContext);
    if (localArrayList1 != null)
      localArrayList1.addAll(localList);
    while (true)
    {
      a(localFile, localArrayList1, "/pixel_fire_list");
      return;
      localArrayList1 = new ArrayList();
      localArrayList1.addAll(localList);
    }
  }

  public void a(String paramString, Context paramContext, Handler paramHandler)
  {
    if (AdMarvelUtils.isNetworkAvailable(paramContext))
    {
      ArrayList localArrayList2 = (ArrayList)a("/pixel_fire_list", "/pixel_fire_list", paramContext);
      if (localArrayList2 != null)
      {
        if (localArrayList2.size() > 50)
          for (int i = 0; i < 50; i++)
          {
            String str2 = ((String)localArrayList2.get(0)).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
            new AdMarvelUtils(paramContext).firePixelUsingHTTP(str2, paramHandler);
            Logging.log("Offline SDK:fire pixel url :- " + str2);
            localArrayList2.remove(0);
          }
        Iterator localIterator = localArrayList2.iterator();
        while (localIterator.hasNext())
        {
          String str1 = ((String)localIterator.next()).replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis()));
          new AdMarvelUtils(paramContext).firePixelUsingHTTP(str1, paramHandler);
          Logging.log("Offline SDK:fire pixel url :- " + str1);
        }
        localArrayList2.clear();
      }
      new AdMarvelUtils(paramContext).firePixelUsingHTTP(paramString.replaceAll("\\{timestamp\\}", String.valueOf(System.currentTimeMillis())), paramHandler);
      a(paramContext.getDir("Admarvel", 0), localArrayList2, "/pixel_fire_list");
      return;
    }
    File localFile = paramContext.getDir("Admarvel", 0);
    ArrayList localArrayList1 = (ArrayList)a("/pixel_fire_list", "/pixel_fire_list", paramContext);
    Logging.log("Offline SDK:No Internet available so saving pixel url in file ");
    if (localArrayList1 != null)
      localArrayList1.add(paramString);
    while (true)
    {
      a(localFile, localArrayList1, "/pixel_fire_list");
      return;
      localArrayList1 = new ArrayList();
      localArrayList1.add(paramString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.b.a
 * JD-Core Version:    0.6.2
 */