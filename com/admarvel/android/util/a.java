package com.admarvel.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Handler;
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
    //   9: new 121	com/admarvel/android/util/f
    //   12: dup
    //   13: aload_1
    //   14: ldc 123
    //   16: invokespecial 125	com/admarvel/android/util/f:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: astore 4
    //   21: aload 4
    //   23: ldc 127
    //   25: aload_3
    //   26: invokevirtual 130	com/admarvel/android/util/f:a	(Ljava/lang/String;Ljava/io/File;)V
    //   29: aload 4
    //   31: invokevirtual 133	com/admarvel/android/util/f:a	()Ljava/util/List;
    //   34: pop
    //   35: aload_3
    //   36: ifnull +19 -> 55
    //   39: aload_3
    //   40: invokevirtual 80	java/io/File:delete	()Z
    //   43: ifne +12 -> 55
    //   46: ldc 135
    //   48: astore 7
    //   50: aload 7
    //   52: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   55: return
    //   56: astore 5
    //   58: aconst_null
    //   59: astore_3
    //   60: aload 5
    //   62: invokestatic 146	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   65: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   68: aload_3
    //   69: ifnull -14 -> 55
    //   72: aload_3
    //   73: invokevirtual 80	java/io/File:delete	()Z
    //   76: ifne -21 -> 55
    //   79: ldc 135
    //   81: astore 7
    //   83: goto -33 -> 50
    //   86: astore 6
    //   88: aconst_null
    //   89: astore_3
    //   90: aload_3
    //   91: ifnull +15 -> 106
    //   94: aload_3
    //   95: invokevirtual 80	java/io/File:delete	()Z
    //   98: ifne +8 -> 106
    //   101: ldc 135
    //   103: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   106: aload 6
    //   108: athrow
    //   109: astore 6
    //   111: goto -21 -> 90
    //   114: astore 5
    //   116: goto -56 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	56	java/lang/Exception
    //   0	9	86	finally
    //   9	35	109	finally
    //   60	68	109	finally
    //   9	35	114	java/lang/Exception
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
    double d1;
    try
    {
      if (Build.VERSION.SDK_INT > 15)
      {
        long l = a.b.a(paramContext);
        if (l > 0L)
        {
          d1 = l / 1048576.0D;
          break label69;
        }
      }
      else
      {
        double d2 = b();
        if (d2 > 0.0D)
          d1 = d2 / 1024.0D;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      d1 = -1.0D;
    }
    label69: 
    while ((d1 == -1.0D) || (d1 >= 450.0D))
      return false;
    return true;
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
      new Handler().post(new a.a(this, str, paramInt));
      return str;
    }
    a.c localc = new a.c(this, str);
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(paramInt);
    localc.execute(arrayOfInteger);
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
    //   13: instanceof 301
    //   16: ifeq +17 -> 33
    //   19: aload_0
    //   20: aload_3
    //   21: invokespecial 303	com/admarvel/android/util/a:e	(Landroid/content/Context;)Z
    //   24: ifeq +12 -> 36
    //   27: ldc_w 305
    //   30: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: aload_3
    //   37: checkcast 301	android/app/Activity
    //   40: invokevirtual 309	android/app/Activity:getWindow	()Landroid/view/Window;
    //   43: invokevirtual 315	android/view/Window:getDecorView	()Landroid/view/View;
    //   46: ldc_w 316
    //   49: invokevirtual 322	android/view/View:findViewById	(I)Landroid/view/View;
    //   52: ldc_w 316
    //   55: invokevirtual 322	android/view/View:findViewById	(I)Landroid/view/View;
    //   58: invokevirtual 325	android/view/View:getRootView	()Landroid/view/View;
    //   61: astore 9
    //   63: aload 9
    //   65: ifnull -32 -> 33
    //   68: aload 9
    //   70: invokevirtual 328	android/view/View:isDrawingCacheEnabled	()Z
    //   73: invokestatic 333	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   76: astore 10
    //   78: aload 9
    //   80: iconst_1
    //   81: invokevirtual 337	android/view/View:setDrawingCacheEnabled	(Z)V
    //   84: new 339	java/io/FileOutputStream
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
    //   112: invokespecial 340	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   115: astore 11
    //   117: aload_3
    //   118: checkcast 301	android/app/Activity
    //   121: invokevirtual 344	android/app/Activity:getResources	()Landroid/content/res/Resources;
    //   124: invokevirtual 350	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   127: getfield 356	android/util/DisplayMetrics:density	F
    //   130: fconst_1
    //   131: fcmpl
    //   132: ifle +77 -> 209
    //   135: aload 9
    //   137: invokevirtual 360	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   140: getstatic 366	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   143: bipush 15
    //   145: aload 11
    //   147: invokevirtual 372	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   150: ifne +9 -> 159
    //   153: ldc_w 374
    //   156: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   159: aload 11
    //   161: invokevirtual 377	java/io/FileOutputStream:flush	()V
    //   164: aload 11
    //   166: invokevirtual 378	java/io/FileOutputStream:close	()V
    //   169: aload 10
    //   171: invokevirtual 381	java/lang/Boolean:booleanValue	()Z
    //   174: ifne -141 -> 33
    //   177: aload 9
    //   179: iconst_0
    //   180: invokevirtual 337	android/view/View:setDrawingCacheEnabled	(Z)V
    //   183: goto -150 -> 33
    //   186: astore 8
    //   188: aload 8
    //   190: invokevirtual 384	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
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
    //   211: invokevirtual 360	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   214: getstatic 366	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   217: bipush 60
    //   219: aload 11
    //   221: invokevirtual 372	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   224: ifne -65 -> 159
    //   227: ldc_w 374
    //   230: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   233: goto -74 -> 159
    //   236: astore 7
    //   238: aload 7
    //   240: invokevirtual 385	java/io/IOException:getMessage	()Ljava/lang/String;
    //   243: invokestatic 140	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   246: goto -213 -> 33
    //   249: astore 6
    //   251: aload 6
    //   253: invokevirtual 83	java/lang/Exception:printStackTrace	()V
    //   256: goto -223 -> 33
    //   259: astore 4
    //   261: aload 4
    //   263: invokevirtual 386	java/lang/OutOfMemoryError:printStackTrace	()V
    //   266: invokestatic 389	com/admarvel/android/ads/AdMarvelUtils:disableLogDump	()V
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a
 * JD-Core Version:    0.6.2
 */