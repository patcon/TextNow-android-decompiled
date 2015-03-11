package com.admarvel.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.admarvel.android.ads.AdMarvelUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static volatile a b;
  private static WeakReference<Context> f;
  PrintWriter a = null;
  private int c = 20;
  private File d;
  private File e;
  private String g = "admarvel_adHistory";

  private a(Context paramContext)
  {
    if (paramContext == null)
      f = null;
    while (true)
    {
      return;
      WeakReference localWeakReference = new WeakReference(paramContext);
      f = localWeakReference;
      Context localContext = (Context)localWeakReference.get();
      try
      {
        this.d = localContext.getDir("Admarvel", 0);
        this.e = new File(this.d, this.g);
        if (this.e == null)
          continue;
        if (this.e.mkdir())
          a(localContext, 0);
        File[] arrayOfFile = this.e.listFiles(new FilenameFilter()
        {
          public boolean accept(File paramAnonymousFile, String paramAnonymousString)
          {
            return paramAnonymousString.toLowerCase().endsWith(".zip");
          }
        });
        if ((arrayOfFile == null) || (arrayOfFile.length <= 0))
          continue;
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
          arrayOfFile[j].delete();
      }
      catch (Exception localException)
      {
        while (true)
          localException.printStackTrace();
      }
    }
  }

  private void a(Context paramContext, int paramInt)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("Ad_history_counter", 0).edit();
      localEditor.putInt("ad_dump_count", paramInt);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private void a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 56	java/io/File
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 119	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: new 121	com/admarvel/android/util/l
    //   12: dup
    //   13: aload_1
    //   14: ldc 123
    //   16: invokespecial 125	com/admarvel/android/util/l:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: astore 4
    //   21: aload 4
    //   23: ldc 127
    //   25: aload_3
    //   26: invokevirtual 130	com/admarvel/android/util/l:a	(Ljava/lang/String;Ljava/io/File;)V
    //   29: aload 4
    //   31: invokevirtual 133	com/admarvel/android/util/l:a	()Ljava/util/List;
    //   34: pop
    //   35: aload_3
    //   36: invokevirtual 80	java/io/File:delete	()Z
    //   39: ifne +8 -> 47
    //   42: ldc 135
    //   44: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   47: return
    //   48: astore 5
    //   50: aconst_null
    //   51: astore_3
    //   52: aload 5
    //   54: invokestatic 146	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   57: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   60: aload_3
    //   61: ifnull -14 -> 47
    //   64: aload_3
    //   65: invokevirtual 80	java/io/File:delete	()Z
    //   68: ifne -21 -> 47
    //   71: ldc 135
    //   73: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   76: return
    //   77: astore 6
    //   79: aconst_null
    //   80: astore_3
    //   81: aload_3
    //   82: ifnull +15 -> 97
    //   85: aload_3
    //   86: invokevirtual 80	java/io/File:delete	()Z
    //   89: ifne +8 -> 97
    //   92: ldc 135
    //   94: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   97: aload 6
    //   99: athrow
    //   100: astore 6
    //   102: goto -21 -> 81
    //   105: astore 5
    //   107: goto -55 -> 52
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	48	java/lang/Exception
    //   0	9	77	finally
    //   9	35	100	finally
    //   52	60	100	finally
    //   9	35	105	java/lang/Exception
  }

  private double b()
  {
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
      String str1 = localRandomAccessFile.readLine();
      Matcher localMatcher = Pattern.compile("(\\d+)").matcher(str1);
      for (String str2 = ""; localMatcher.find(); str2 = localMatcher.group(1));
      localRandomAccessFile.close();
      double d1 = Double.parseDouble(str2);
      return d1;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return 0.0D;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0.0D;
  }

  public static a b(Context paramContext)
  {
    if ((b == null) && (paramContext != null))
      b = new a(paramContext);
    f = new WeakReference(paramContext);
    return b;
  }

  private void b(int paramInt)
  {
    try
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("/sse_");
      localStringBuilder1.append(paramInt);
      localStringBuilder1.append(".jpg");
      File localFile1 = new File(this.e.getAbsolutePath() + localStringBuilder1);
      if (localFile1.exists())
        localFile1.delete();
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("/ssr_");
      localStringBuilder2.append(paramInt);
      localStringBuilder2.append(".jpg");
      File localFile2 = new File(this.e.getAbsolutePath() + localStringBuilder2);
      if (localFile2.exists())
        localFile2.delete();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  private int c(Context paramContext)
  {
    try
    {
      int i = paramContext.getSharedPreferences("Ad_history_counter", 0).getInt("ad_dump_count", 0);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean d(Context paramContext)
  {
    try
    {
      double d2 = b();
      if (d2 > 0.0D)
      {
        d1 = d2 / 1024.0D;
        if ((d1 == -1.0D) || (d1 >= 450.0D))
          break label50;
        return true;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        double d1 = -1.0D;
      }
    }
    label50: return false;
  }

  private boolean e(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 10)
      return true;
    return d(paramContext);
  }

  public int a(Context paramContext)
  {
    try
    {
      SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("Ad_history_counter", 0);
      int i = 1 + localSharedPreferences.getInt("ad_dump_count", 0) % this.c;
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putInt("ad_dump_count", i);
      localEditor.commit();
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String a(int paramInt)
  {
    String str = UUID.randomUUID().toString();
    if (AdMarvelUtils.getAndroidSDKVersion() >= 11)
    {
      f.a().b().execute(new a.a(this, str, paramInt));
      return str;
    }
    a.b localb = new a.b(this, str);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(paramInt);
    localb.execute(arrayOfInteger);
    return str;
  }

  // ERROR //
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 35	com/admarvel/android/util/a:f	Ljava/lang/ref/WeakReference;
    //   5: invokevirtual 44	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   8: checkcast 46	android/content/Context
    //   11: astore_3
    //   12: aload_3
    //   13: instanceof 300
    //   16: ifeq +17 -> 33
    //   19: aload_0
    //   20: aload_3
    //   21: invokespecial 302	com/admarvel/android/util/a:e	(Landroid/content/Context;)Z
    //   24: ifeq +12 -> 36
    //   27: ldc_w 304
    //   30: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: aload_3
    //   37: checkcast 300	android/app/Activity
    //   40: invokevirtual 308	android/app/Activity:getWindow	()Landroid/view/Window;
    //   43: invokevirtual 314	android/view/Window:getDecorView	()Landroid/view/View;
    //   46: ldc_w 315
    //   49: invokevirtual 321	android/view/View:findViewById	(I)Landroid/view/View;
    //   52: ldc_w 315
    //   55: invokevirtual 321	android/view/View:findViewById	(I)Landroid/view/View;
    //   58: invokevirtual 324	android/view/View:getRootView	()Landroid/view/View;
    //   61: astore 9
    //   63: aload 9
    //   65: ifnull -32 -> 33
    //   68: aload 9
    //   70: invokevirtual 327	android/view/View:isDrawingCacheEnabled	()Z
    //   73: invokestatic 332	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   76: astore 10
    //   78: aload 9
    //   80: iconst_1
    //   81: invokevirtual 336	android/view/View:setDrawingCacheEnabled	(Z)V
    //   84: new 338	java/io/FileOutputStream
    //   87: dup
    //   88: new 202	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   95: aload_0
    //   96: getfield 61	com/admarvel/android/util/a:e	Ljava/io/File;
    //   99: invokevirtual 217	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   102: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_1
    //   106: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: invokevirtual 223	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokespecial 339	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   115: astore 11
    //   117: aload_3
    //   118: checkcast 300	android/app/Activity
    //   121: invokevirtual 343	android/app/Activity:getResources	()Landroid/content/res/Resources;
    //   124: invokevirtual 349	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   127: getfield 355	android/util/DisplayMetrics:density	F
    //   130: fconst_1
    //   131: fcmpl
    //   132: ifle +77 -> 209
    //   135: aload 9
    //   137: invokevirtual 359	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   140: getstatic 365	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   143: bipush 15
    //   145: aload 11
    //   147: invokevirtual 371	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   150: ifne +9 -> 159
    //   153: ldc_w 373
    //   156: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   159: aload 11
    //   161: invokevirtual 376	java/io/FileOutputStream:flush	()V
    //   164: aload 11
    //   166: invokevirtual 377	java/io/FileOutputStream:close	()V
    //   169: aload 10
    //   171: invokevirtual 380	java/lang/Boolean:booleanValue	()Z
    //   174: ifne -141 -> 33
    //   177: aload 9
    //   179: iconst_0
    //   180: invokevirtual 336	android/view/View:setDrawingCacheEnabled	(Z)V
    //   183: goto -150 -> 33
    //   186: astore 8
    //   188: aload 8
    //   190: invokevirtual 383	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   193: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   196: goto -163 -> 33
    //   199: astore 5
    //   201: aload 5
    //   203: athrow
    //   204: astore_2
    //   205: aload_0
    //   206: monitorexit
    //   207: aload_2
    //   208: athrow
    //   209: aload 9
    //   211: invokevirtual 359	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   214: getstatic 365	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   217: bipush 60
    //   219: aload 11
    //   221: invokevirtual 371	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   224: ifne -65 -> 159
    //   227: ldc_w 373
    //   230: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   233: goto -74 -> 159
    //   236: astore 7
    //   238: aload 7
    //   240: invokevirtual 384	java/io/IOException:getMessage	()Ljava/lang/String;
    //   243: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   246: goto -213 -> 33
    //   249: astore 6
    //   251: aload 6
    //   253: invokevirtual 83	java/lang/Exception:printStackTrace	()V
    //   256: goto -223 -> 33
    //   259: astore 4
    //   261: aload 4
    //   263: invokevirtual 385	java/lang/OutOfMemoryError:printStackTrace	()V
    //   266: invokestatic 388	com/admarvel/android/ads/AdMarvelUtils:disableLogDump	()V
    //   269: goto -236 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   36	63	186	java/io/FileNotFoundException
    //   68	159	186	java/io/FileNotFoundException
    //   159	183	186	java/io/FileNotFoundException
    //   209	233	186	java/io/FileNotFoundException
    //   36	63	199	finally
    //   68	159	199	finally
    //   159	183	199	finally
    //   188	196	199	finally
    //   209	233	199	finally
    //   238	246	199	finally
    //   251	256	199	finally
    //   261	269	199	finally
    //   2	33	204	finally
    //   201	204	204	finally
    //   36	63	236	java/io/IOException
    //   68	159	236	java/io/IOException
    //   159	183	236	java/io/IOException
    //   209	233	236	java/io/IOException
    //   36	63	249	java/lang/Exception
    //   68	159	249	java/lang/Exception
    //   159	183	249	java/lang/Exception
    //   209	233	249	java/lang/Exception
    //   36	63	259	java/lang/OutOfMemoryError
    //   68	159	259	java/lang/OutOfMemoryError
    //   159	183	259	java/lang/OutOfMemoryError
    //   209	233	259	java/lang/OutOfMemoryError
  }

  public void a(String paramString, int paramInt)
  {
    StringBuilder localStringBuilder1;
    if ((f != null) && (f.get() != null))
    {
      localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("/log_");
      localStringBuilder1.append(paramInt);
      localStringBuilder1.append(".txt");
    }
    try
    {
      this.a = new PrintWriter(this.e.getAbsolutePath() + localStringBuilder1.toString(), "UTF-8");
      if (this.a != null)
      {
        this.a.print(paramString);
        this.a.close();
      }
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("/ss_");
      localStringBuilder2.append(paramInt);
      localStringBuilder2.append(".jpg");
      a(localStringBuilder2.toString());
      b(paramInt);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        localFileNotFoundException.printStackTrace();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        localUnsupportedEncodingException.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a
 * JD-Core Version:    0.6.2
 */