package com.admarvel.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.admarvel.android.ads.AdMarvelUtils;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class AdMarvelBitmapDrawableUtils
{
  public static final String ADMARVEL_CUSTOM_BACK_BUTTON = "rd2KvT4Zi0NK9A0CejrW35pciQ002l";
  public static final String ADMARVEL_CUSTOM_BACK_DISABLE_BUTTON = "MKlWddpjgeIrBuZxnd37tVjz7OM7fu";
  public static final String ADMARVEL_CUSTOM_CLOSE_BUTTON = "OCkD4Sjg8bN0h8bDad6gWa5t51Zy5I";
  public static final String ADMARVEL_CUSTOM_DONE_BUTTON = "USuSmQSCwrDx1CXCp4oqplFBGTQAZM";
  public static final String ADMARVEL_CUSTOM_MUTE_BUTTON = "u2nfwuKbaKzVwGmUNmk7wFVXHwzy7S";
  public static final String ADMARVEL_CUSTOM_OPEN_URL_BUTTON = "nRdOcYYrMLotmPFqlTcjFIf7isxM5t";
  public static final String ADMARVEL_CUSTOM_OPEN_URL_DISABLED_BUTTON = "H2GFZHEOwlzVJk4cBatArzxlb2XOJH";
  public static final String ADMARVEL_CUSTOM_PAUSE_BUTTON = "d2UpTWfkssmtbKnAqIR6WGdcMl4Gg8";
  public static final String ADMARVEL_CUSTOM_PLAY_BUTTON = "aSrZSorTa7PztrNZ4FuMvViHEaGfDV";
  public static final String ADMARVEL_CUSTOM_REPLAY_BUTTON = "ej5yqIooDTRYYsXEJuN4eJOh7buHJI";
  public static final String ADMARVEL_CUSTOM_RESUME_BUTTON = "UPuOOqinUE2sqnnpe8MYG7PzHVVl5p";
  public static final String ADMARVEL_CUSTOM_RESUME_DISABLE_BUTTON = "NCLuZlSXjDualh2uti1kSm8vWlELL9";
  public static final String ADMARVEL_CUSTOM_STOP_BUTTON = "yz6T5xsau00Hqg556ez5NwTY2IsOW1";
  public static final String ADMARVEL_CUSTOM_TIME_BUTTON = "I9Kg1IJB4gtPeHhlB0pvKW5yqcRf2o";
  public static final String ADMARVEL_CUSTOM_UNMUTE_BUTTON = "kOy0RFIzirRqTweJUasQ2qaqYyPhm4";

  // ERROR //
  public static BitmapDrawable bitmapFromJar(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: new 60	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   7: ldc 63
    //   9: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_0
    //   13: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 69
    //   18: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: aload_1
    //   26: ifnonnull +5 -> 31
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 79	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   35: aload_2
    //   36: invokevirtual 85	java/lang/ClassLoader:getResource	(Ljava/lang/String;)Ljava/net/URL;
    //   39: invokevirtual 90	java/net/URL:getFile	()Ljava/lang/String;
    //   42: astore 9
    //   44: aload 9
    //   46: ldc 92
    //   48: invokevirtual 98	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   51: ifeq +11 -> 62
    //   54: aload 9
    //   56: iconst_5
    //   57: invokevirtual 102	java/lang/String:substring	(I)Ljava/lang/String;
    //   60: astore 9
    //   62: aload 9
    //   64: ldc 104
    //   66: invokevirtual 108	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   69: istore 10
    //   71: iload 10
    //   73: ifle +13 -> 86
    //   76: aload 9
    //   78: iconst_0
    //   79: iload 10
    //   81: invokevirtual 111	java/lang/String:substring	(II)Ljava/lang/String;
    //   84: astore 9
    //   86: new 113	java/util/jar/JarFile
    //   89: dup
    //   90: aload 9
    //   92: invokespecial 116	java/util/jar/JarFile:<init>	(Ljava/lang/String;)V
    //   95: astore 11
    //   97: aload 11
    //   99: aload 11
    //   101: aload_2
    //   102: invokevirtual 120	java/util/jar/JarFile:getJarEntry	(Ljava/lang/String;)Ljava/util/jar/JarEntry;
    //   105: invokevirtual 124	java/util/jar/JarFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   108: astore 12
    //   110: aload 12
    //   112: astore 4
    //   114: aload 4
    //   116: invokestatic 130	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   119: astore 13
    //   121: new 132	android/graphics/drawable/BitmapDrawable
    //   124: dup
    //   125: aload_1
    //   126: invokevirtual 136	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   129: aload 13
    //   131: invokespecial 139	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   134: astore 14
    //   136: aload 4
    //   138: ifnull +8 -> 146
    //   141: aload 4
    //   143: invokevirtual 144	java/io/InputStream:close	()V
    //   146: aload 14
    //   148: areturn
    //   149: astore 7
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 7
    //   156: invokevirtual 147	java/lang/Exception:printStackTrace	()V
    //   159: aload 4
    //   161: ifnull -132 -> 29
    //   164: aload 4
    //   166: invokevirtual 144	java/io/InputStream:close	()V
    //   169: aconst_null
    //   170: areturn
    //   171: astore 8
    //   173: aconst_null
    //   174: areturn
    //   175: astore_3
    //   176: aconst_null
    //   177: astore 4
    //   179: aload_3
    //   180: astore 5
    //   182: aload 4
    //   184: ifnull +8 -> 192
    //   187: aload 4
    //   189: invokevirtual 144	java/io/InputStream:close	()V
    //   192: aload 5
    //   194: athrow
    //   195: astore 15
    //   197: goto -51 -> 146
    //   200: astore 6
    //   202: goto -10 -> 192
    //   205: astore 5
    //   207: goto -25 -> 182
    //   210: astore 7
    //   212: goto -58 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   31	62	149	java/lang/Exception
    //   62	71	149	java/lang/Exception
    //   76	86	149	java/lang/Exception
    //   86	110	149	java/lang/Exception
    //   164	169	171	java/lang/Exception
    //   31	62	175	finally
    //   62	71	175	finally
    //   76	86	175	finally
    //   86	110	175	finally
    //   141	146	195	java/lang/Exception
    //   187	192	200	java/lang/Exception
    //   114	136	205	finally
    //   154	159	205	finally
    //   114	136	210	java/lang/Exception
  }

  public static String convertBitmapTobyteArray(int paramInt, Context paramContext)
  {
    Bitmap localBitmap = BitmapFactory.decodeResource(paramContext.getResources(), paramInt);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < -1 + arrayOfByte.length; i++)
    {
      localStringBuilder.append(arrayOfByte[i]);
      localStringBuilder.append(",");
    }
    localStringBuilder.append(arrayOfByte[(-1 + arrayOfByte.length)]);
    return localStringBuilder.toString();
  }

  public static String convertBitmapTobyteArray(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < -1 + arrayOfByte.length; i++)
    {
      localStringBuilder.append(arrayOfByte[i]);
      localStringBuilder.append(",");
    }
    localStringBuilder.append(arrayOfByte[(-1 + arrayOfByte.length)]);
    return localStringBuilder.toString();
  }

  private static BitmapDrawable getBackwardDisableDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("MKlWddpjgeIrBuZxnd37tVjz7OM7fu") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.a.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("MKlWddpjgeIrBuZxnd37tVjz7OM7fu"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for back_disable");
        return bitmapFromJar("backward_disable", paramContext);
      }
    return bitmapFromJar("backward_disable", paramContext);
  }

  private static BitmapDrawable getBackwardDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("rd2KvT4Zi0NK9A0CejrW35pciQ002l") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.b.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("rd2KvT4Zi0NK9A0CejrW35pciQ002l"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for back ");
        return bitmapFromJar("backward", paramContext);
      }
    return bitmapFromJar("backward", paramContext);
  }

  public static BitmapDrawable getBitMapDrawable(String paramString, Context paramContext)
  {
    if (paramString.equals("backward_disable"))
      return getBackwardDisableDrawable(paramContext);
    if (paramString.equals("backward"))
      return getBackwardDrawable(paramContext);
    if (paramString.equals("close"))
      return getCloseDrawable(paramContext);
    if (paramString.equals("done"))
      return getDoneDrawable(paramContext);
    if (paramString.equals("mute"))
      return getMuteDrawable(paramContext);
    if (paramString.equals("open_url_disabled"))
      return getOpenUrlDisabledDrawable(paramContext);
    if (paramString.equals("open_url"))
      return getOpenUrlDrawable(paramContext);
    if (paramString.equals("pause"))
      return getPauseDrawable(paramContext);
    if (paramString.equals("play_movie"))
      return getPlayDrawable(paramContext);
    if (paramString.equals("replay"))
      return getReplayDrawable(paramContext);
    if (paramString.equals("resume_disable"))
      return getResumeDisableDrawable(paramContext);
    if (paramString.equals("resume"))
      return getResumeDrawable(paramContext);
    if (paramString.equals("stop"))
      return getStopDrawable(paramContext);
    if (paramString.equals("time"))
      return getTimeDrawable(paramContext);
    if (paramString.equals("unmute"))
      return getUnmuteDrawable(paramContext);
    return null;
  }

  private static BitmapDrawable getCloseDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("OCkD4Sjg8bN0h8bDad6gWa5t51Zy5I") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.c.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("OCkD4Sjg8bN0h8bDad6gWa5t51Zy5I"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for close ");
        return bitmapFromJar("close", paramContext);
      }
    return bitmapFromJar("close", paramContext);
  }

  private static BitmapDrawable getDoneDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("USuSmQSCwrDx1CXCp4oqplFBGTQAZM") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.d.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("USuSmQSCwrDx1CXCp4oqplFBGTQAZM"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for done ");
        return bitmapFromJar("done", paramContext);
      }
    return bitmapFromJar("done", paramContext);
  }

  private static BitmapDrawable getMuteDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("u2nfwuKbaKzVwGmUNmk7wFVXHwzy7S") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.e.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("u2nfwuKbaKzVwGmUNmk7wFVXHwzy7S"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for mute ");
        return bitmapFromJar("mute", paramContext);
      }
    return bitmapFromJar("mute", paramContext);
  }

  private static BitmapDrawable getOpenUrlDisabledDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("H2GFZHEOwlzVJk4cBatArzxlb2XOJH") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.n.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("H2GFZHEOwlzVJk4cBatArzxlb2XOJH"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for open_url_disabled ");
        return bitmapFromJar("open_url_disabled", paramContext);
      }
    return bitmapFromJar("open_url_disabled", paramContext);
  }

  private static BitmapDrawable getOpenUrlDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("nRdOcYYrMLotmPFqlTcjFIf7isxM5t") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.o.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("nRdOcYYrMLotmPFqlTcjFIf7isxM5t"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for open_url  ");
        return bitmapFromJar("open_url", paramContext);
      }
    return bitmapFromJar("open_url", paramContext);
  }

  private static BitmapDrawable getPauseDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("d2UpTWfkssmtbKnAqIR6WGdcMl4Gg8") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.f.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("d2UpTWfkssmtbKnAqIR6WGdcMl4Gg8"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for pause  ");
        return bitmapFromJar("pause", paramContext);
      }
    return bitmapFromJar("pause", paramContext);
  }

  private static BitmapDrawable getPlayDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("aSrZSorTa7PztrNZ4FuMvViHEaGfDV") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.g.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("aSrZSorTa7PztrNZ4FuMvViHEaGfDV"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for play  ");
        return bitmapFromJar("play_movie", paramContext);
      }
    return bitmapFromJar("play_movie", paramContext);
  }

  private static BitmapDrawable getReplayDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("ej5yqIooDTRYYsXEJuN4eJOh7buHJI") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.h.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("ej5yqIooDTRYYsXEJuN4eJOh7buHJI"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for replay  ");
        return bitmapFromJar("replay", paramContext);
      }
    return bitmapFromJar("replay", paramContext);
  }

  private static BitmapDrawable getResumeDisableDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("NCLuZlSXjDualh2uti1kSm8vWlELL9") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.i.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("NCLuZlSXjDualh2uti1kSm8vWlELL9"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for resume disable  ");
        return bitmapFromJar("resume_disable", paramContext);
      }
    return bitmapFromJar("resume_disable", paramContext);
  }

  private static BitmapDrawable getResumeDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("UPuOOqinUE2sqnnpe8MYG7PzHVVl5p") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.j.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("UPuOOqinUE2sqnnpe8MYG7PzHVVl5p"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for resume  ");
        return bitmapFromJar("resume", paramContext);
      }
    return bitmapFromJar("resume", paramContext);
  }

  private static BitmapDrawable getStopDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("yz6T5xsau00Hqg556ez5NwTY2IsOW1") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.k.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("yz6T5xsau00Hqg556ez5NwTY2IsOW1"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for resume  ");
        return bitmapFromJar("stop", paramContext);
      }
    return bitmapFromJar("stop", paramContext);
  }

  private static BitmapDrawable getTimeDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("I9Kg1IJB4gtPeHhlB0pvKW5yqcRf2o") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.l.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("I9Kg1IJB4gtPeHhlB0pvKW5yqcRf2o"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for resume  ");
        return bitmapFromJar("time", paramContext);
      }
    return bitmapFromJar("time", paramContext);
  }

  private static BitmapDrawable getUnmuteDrawable(Context paramContext)
  {
    if ((AdMarvelUtils.getAdMarvelOptionalFlags() != null) && (AdMarvelUtils.getAdMarvelOptionalFlags().get("kOy0RFIzirRqTweJUasQ2qaqYyPhm4") != null))
      try
      {
        BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.a.m.a(paramContext, (String)AdMarvelUtils.getAdMarvelOptionalFlags().get("kOy0RFIzirRqTweJUasQ2qaqYyPhm4"));
        return localBitmapDrawable;
      }
      catch (Exception localException)
      {
        Logging.log("Error in setting custom bitmap for unmute  ");
        return bitmapFromJar("unmute", paramContext);
      }
    return bitmapFromJar("unmute", paramContext);
  }

  // ERROR //
  public static void writeByteArrayFromBitMap(int paramInt, Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 136	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   4: iload_0
    //   5: invokestatic 153	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   8: astore_3
    //   9: new 155	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 156	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore 4
    //   18: aload_3
    //   19: getstatic 162	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   22: bipush 100
    //   24: aload 4
    //   26: invokevirtual 168	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   29: pop
    //   30: aload 4
    //   32: invokevirtual 172	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   35: astore 6
    //   37: new 60	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   44: astore 7
    //   46: new 362	java/io/File
    //   49: dup
    //   50: invokestatic 368	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   53: ldc_w 370
    //   56: invokespecial 373	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   59: astore 8
    //   61: aload 8
    //   63: invokevirtual 377	java/io/File:exists	()Z
    //   66: ifne +9 -> 75
    //   69: aload 8
    //   71: invokevirtual 380	java/io/File:mkdir	()Z
    //   74: pop
    //   75: new 362	java/io/File
    //   78: dup
    //   79: aload 8
    //   81: new 60	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   88: aload_2
    //   89: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: ldc_w 382
    //   95: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokespecial 373	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   104: astore 10
    //   106: aload 10
    //   108: invokevirtual 385	java/io/File:createNewFile	()Z
    //   111: pop
    //   112: aload 10
    //   114: ifnonnull +69 -> 183
    //   117: return
    //   118: astore 11
    //   120: aconst_null
    //   121: astore 10
    //   123: getstatic 391	java/lang/System:out	Ljava/io/PrintStream;
    //   126: new 60	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   133: ldc_w 393
    //   136: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload 11
    //   141: invokevirtual 396	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokevirtual 401	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   150: goto -38 -> 112
    //   153: astore 9
    //   155: getstatic 391	java/lang/System:out	Ljava/io/PrintStream;
    //   158: new 60	java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   165: ldc_w 403
    //   168: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload 9
    //   173: invokevirtual 396	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokevirtual 401	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   182: return
    //   183: new 405	java/io/PrintWriter
    //   186: dup
    //   187: aload 10
    //   189: invokevirtual 408	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   192: ldc_w 410
    //   195: invokespecial 413	java/io/PrintWriter:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: astore 12
    //   200: aload 12
    //   202: astore 13
    //   204: aload 13
    //   206: ifnull -89 -> 117
    //   209: aload 7
    //   211: ldc_w 415
    //   214: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload 13
    //   220: ldc_w 415
    //   223: invokevirtual 418	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   226: iconst_0
    //   227: istore 15
    //   229: iload 15
    //   231: aload 6
    //   233: arraylength
    //   234: if_icmpge +71 -> 305
    //   237: aload 7
    //   239: aload 6
    //   241: iload 15
    //   243: baload
    //   244: invokevirtual 175	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload 7
    //   250: ldc 177
    //   252: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload 13
    //   258: aload 6
    //   260: iload 15
    //   262: baload
    //   263: invokevirtual 421	java/io/PrintWriter:print	(I)V
    //   266: aload 13
    //   268: ldc 177
    //   270: invokevirtual 418	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   273: iinc 15 1
    //   276: goto -47 -> 229
    //   279: astore 20
    //   281: aload 20
    //   283: invokevirtual 422	java/io/FileNotFoundException:printStackTrace	()V
    //   286: aconst_null
    //   287: astore 13
    //   289: goto -85 -> 204
    //   292: astore 19
    //   294: aload 19
    //   296: invokevirtual 423	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   299: aconst_null
    //   300: astore 13
    //   302: goto -98 -> 204
    //   305: aload 13
    //   307: ldc_w 425
    //   310: invokevirtual 418	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   313: aload 7
    //   315: ldc_w 425
    //   318: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload 13
    //   324: ifnull -207 -> 117
    //   327: aload 13
    //   329: invokevirtual 426	java/io/PrintWriter:close	()V
    //   332: return
    //   333: astore 11
    //   335: goto -212 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   75	106	118	java/lang/Exception
    //   46	75	153	java/lang/Exception
    //   123	150	153	java/lang/Exception
    //   183	200	279	java/io/FileNotFoundException
    //   183	200	292	java/io/UnsupportedEncodingException
    //   106	112	333	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.AdMarvelBitmapDrawableUtils
 * JD-Core Version:    0.6.2
 */