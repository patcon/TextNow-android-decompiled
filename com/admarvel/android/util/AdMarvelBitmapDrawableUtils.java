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
    localStringBuilder.toString().replaceAll("\\-", "-");
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
    localStringBuilder.toString().replaceAll("\\-", "-");
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
        return AdMarvelBitmapDrawableUtils.a.a.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.a.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.b.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.b.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.c.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.c.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.d.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.d.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.e.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.e.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.n.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.n.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.o.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.o.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.f.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.f.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.g.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.g.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.h.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.h.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.i.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.i.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.j.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.j.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.k.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.k.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.l.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.l.a(paramContext);
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
        return AdMarvelBitmapDrawableUtils.a.m.a(paramContext);
      }
    return AdMarvelBitmapDrawableUtils.a.m.a(paramContext);
  }

  // ERROR //
  public static void writeByteArrayFromBitMap(int paramInt, Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 62	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   4: iload_0
    //   5: invokestatic 68	android/graphics/BitmapFactory:decodeResource	(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   8: astore_3
    //   9: new 70	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 71	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore 4
    //   18: aload_3
    //   19: getstatic 77	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   22: bipush 100
    //   24: aload 4
    //   26: invokevirtual 83	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   29: pop
    //   30: aload 4
    //   32: invokevirtual 87	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   35: astore 6
    //   37: new 89	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   44: astore 7
    //   46: new 303	java/io/File
    //   49: dup
    //   50: invokestatic 309	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   53: ldc_w 311
    //   56: invokespecial 314	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   59: astore 8
    //   61: aload 8
    //   63: invokevirtual 318	java/io/File:exists	()Z
    //   66: ifne +9 -> 75
    //   69: aload 8
    //   71: invokevirtual 321	java/io/File:mkdir	()Z
    //   74: pop
    //   75: new 303	java/io/File
    //   78: dup
    //   79: aload 8
    //   81: new 89	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   88: aload_2
    //   89: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: ldc_w 323
    //   95: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokespecial 314	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   104: astore 10
    //   106: aload 10
    //   108: invokevirtual 326	java/io/File:createNewFile	()Z
    //   111: pop
    //   112: aload 10
    //   114: ifnonnull +69 -> 183
    //   117: return
    //   118: astore 11
    //   120: aconst_null
    //   121: astore 10
    //   123: getstatic 332	java/lang/System:out	Ljava/io/PrintStream;
    //   126: new 89	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   133: ldc_w 334
    //   136: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload 11
    //   141: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokevirtual 342	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   150: goto -38 -> 112
    //   153: astore 9
    //   155: getstatic 332	java/lang/System:out	Ljava/io/PrintStream;
    //   158: new 89	java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   165: ldc_w 344
    //   168: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload 9
    //   173: invokevirtual 337	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokevirtual 342	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   182: return
    //   183: new 346	java/io/PrintWriter
    //   186: dup
    //   187: aload 10
    //   189: invokevirtual 349	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   192: ldc_w 351
    //   195: invokespecial 354	java/io/PrintWriter:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: astore 12
    //   200: aload 12
    //   202: astore 13
    //   204: aload 13
    //   206: ifnull -89 -> 117
    //   209: aload 7
    //   211: ldc_w 356
    //   214: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload 13
    //   220: ldc_w 356
    //   223: invokevirtual 359	java/io/PrintWriter:print	(Ljava/lang/String;)V
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
    //   244: invokevirtual 94	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload 7
    //   250: ldc 96
    //   252: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload 13
    //   258: aload 6
    //   260: iload 15
    //   262: baload
    //   263: invokevirtual 362	java/io/PrintWriter:print	(I)V
    //   266: aload 13
    //   268: ldc 96
    //   270: invokevirtual 359	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   273: iinc 15 1
    //   276: goto -47 -> 229
    //   279: astore 20
    //   281: aload 20
    //   283: invokevirtual 365	java/io/FileNotFoundException:printStackTrace	()V
    //   286: aconst_null
    //   287: astore 13
    //   289: goto -85 -> 204
    //   292: astore 19
    //   294: aload 19
    //   296: invokevirtual 366	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   299: aconst_null
    //   300: astore 13
    //   302: goto -98 -> 204
    //   305: aload 13
    //   307: ldc_w 368
    //   310: invokevirtual 359	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   313: aload 7
    //   315: ldc_w 368
    //   318: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload 13
    //   324: ifnull -207 -> 117
    //   327: aload 13
    //   329: invokevirtual 370	java/io/PrintWriter:close	()V
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.AdMarvelBitmapDrawableUtils
 * JD-Core Version:    0.6.2
 */