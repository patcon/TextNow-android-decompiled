package com.flurry.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class aa
{
  private static final String a = aa.class.getSimpleName();
  private boolean b;
  private Bitmap c;
  private Bitmap d;
  private Bitmap e;
  private Bitmap f;

  private Bitmap a(InputStream paramInputStream, boolean paramBoolean)
  {
    if (paramInputStream == null)
      return null;
    Bitmap localBitmap = BitmapFactory.decodeStream(paramInputStream);
    if (localBitmap != null)
      if (!paramBoolean)
        break label32;
    label32: for (int i = 320; ; i = 160)
    {
      localBitmap.setDensity(i);
      return localBitmap;
    }
  }

  private Bitmap a(String paramString)
  {
    if (paramString == null);
    byte[] arrayOfByte;
    do
    {
      return null;
      arrayOfByte = Base64.decode(paramString, 0);
    }
    while (arrayOfByte == null);
    return a(new ByteArrayInputStream(arrayOfByte), false);
  }

  private void a(InputStream paramInputStream, String paramString)
  {
    if (paramInputStream == null);
    do
    {
      do
      {
        return;
        if (!g())
          break;
        if ("closeX_retina.png".equals(paramString))
        {
          this.c = a(paramInputStream, true);
          return;
        }
        if ("pause_button_retina.png".equals(paramString))
        {
          this.d = a(paramInputStream, true);
          return;
        }
        if ("play_button_retina.png".equals(paramString))
        {
          this.e = a(paramInputStream, true);
          return;
        }
      }
      while (!"more_info_retina.png".equals(paramString));
      this.f = a(paramInputStream, true);
      return;
      if ("closeX.png".equals(paramString))
      {
        this.c = a(paramInputStream, false);
        return;
      }
      if ("pause_button.png".equals(paramString))
      {
        this.d = a(paramInputStream, false);
        return;
      }
      if ("play_button.png".equals(paramString))
      {
        this.e = a(paramInputStream, false);
        return;
      }
    }
    while (!"more_info.png".equals(paramString));
    this.f = a(paramInputStream, false);
  }

  private boolean g()
  {
    return fc.d() >= 1.5F;
  }

  public boolean a()
  {
    return (this.c != null) && (this.d != null) && (this.e != null) && (this.f != null);
  }

  public Bitmap b()
  {
    return this.c;
  }

  public Bitmap c()
  {
    return this.d;
  }

  public Bitmap d()
  {
    return this.e;
  }

  public Bitmap e()
  {
    return this.f;
  }

  // ERROR //
  public void f()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 101	com/flurry/sdk/aa:b	Z
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: invokestatic 107	com/flurry/android/impl/ads/FlurryAdModule:getInstance	()Lcom/flurry/android/impl/ads/FlurryAdModule;
    //   13: invokevirtual 110	com/flurry/android/impl/ads/FlurryAdModule:e	()Lcom/flurry/sdk/t;
    //   16: invokevirtual 115	com/flurry/sdk/t:c	()Ljava/io/File;
    //   19: astore_2
    //   20: aload_2
    //   21: ifnull +107 -> 128
    //   24: new 117	java/io/BufferedInputStream
    //   27: dup
    //   28: new 119	java/io/FileInputStream
    //   31: dup
    //   32: aload_2
    //   33: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: invokespecial 125	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_3
    //   40: new 127	java/util/zip/ZipInputStream
    //   43: dup
    //   44: new 117	java/io/BufferedInputStream
    //   47: dup
    //   48: aload_3
    //   49: invokespecial 125	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   52: invokespecial 128	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: astore 4
    //   57: aload 4
    //   59: invokevirtual 132	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   62: astore 12
    //   64: aload 12
    //   66: ifnull +172 -> 238
    //   69: aload_0
    //   70: aload 4
    //   72: aload 12
    //   74: invokevirtual 137	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   77: invokespecial 139	com/flurry/sdk/aa:a	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   80: goto -23 -> 57
    //   83: astore 9
    //   85: aload_3
    //   86: astore 10
    //   88: iconst_3
    //   89: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   92: ldc 141
    //   94: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   97: aload 4
    //   99: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   102: aload 10
    //   104: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   107: aload_0
    //   108: invokevirtual 153	com/flurry/sdk/aa:a	()Z
    //   111: ifne +17 -> 128
    //   114: iconst_3
    //   115: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   118: ldc 155
    //   120: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   123: aload_2
    //   124: invokevirtual 160	java/io/File:delete	()Z
    //   127: pop
    //   128: aload_0
    //   129: getfield 68	com/flurry/sdk/aa:c	Landroid/graphics/Bitmap;
    //   132: ifnonnull +22 -> 154
    //   135: iconst_3
    //   136: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   139: ldc 162
    //   141: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   144: aload_0
    //   145: aload_0
    //   146: ldc 164
    //   148: invokespecial 166	com/flurry/sdk/aa:a	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   151: putfield 68	com/flurry/sdk/aa:c	Landroid/graphics/Bitmap;
    //   154: aload_0
    //   155: getfield 72	com/flurry/sdk/aa:d	Landroid/graphics/Bitmap;
    //   158: ifnonnull +22 -> 180
    //   161: iconst_3
    //   162: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   165: ldc 168
    //   167: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   170: aload_0
    //   171: aload_0
    //   172: ldc 170
    //   174: invokespecial 166	com/flurry/sdk/aa:a	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   177: putfield 72	com/flurry/sdk/aa:d	Landroid/graphics/Bitmap;
    //   180: aload_0
    //   181: getfield 76	com/flurry/sdk/aa:e	Landroid/graphics/Bitmap;
    //   184: ifnonnull +22 -> 206
    //   187: iconst_3
    //   188: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   191: ldc 172
    //   193: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   196: aload_0
    //   197: aload_0
    //   198: ldc 174
    //   200: invokespecial 166	com/flurry/sdk/aa:a	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   203: putfield 76	com/flurry/sdk/aa:e	Landroid/graphics/Bitmap;
    //   206: aload_0
    //   207: getfield 80	com/flurry/sdk/aa:f	Landroid/graphics/Bitmap;
    //   210: ifnonnull +22 -> 232
    //   213: iconst_3
    //   214: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   217: ldc 176
    //   219: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   222: aload_0
    //   223: aload_0
    //   224: ldc 178
    //   226: invokespecial 166	com/flurry/sdk/aa:a	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   229: putfield 80	com/flurry/sdk/aa:f	Landroid/graphics/Bitmap;
    //   232: aload_0
    //   233: iconst_1
    //   234: putfield 101	com/flurry/sdk/aa:b	Z
    //   237: return
    //   238: aload 4
    //   240: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   243: aload_3
    //   244: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   247: goto -140 -> 107
    //   250: astore 16
    //   252: aconst_null
    //   253: astore_3
    //   254: iconst_3
    //   255: getstatic 23	com/flurry/sdk/aa:a	Ljava/lang/String;
    //   258: ldc 180
    //   260: invokestatic 146	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   263: aload_1
    //   264: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   267: aload_3
    //   268: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   271: goto -164 -> 107
    //   274: astore 6
    //   276: aconst_null
    //   277: astore_3
    //   278: aload_1
    //   279: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   282: aload_3
    //   283: invokestatic 151	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   286: aload 6
    //   288: athrow
    //   289: astore 6
    //   291: goto -13 -> 278
    //   294: astore 8
    //   296: aload 4
    //   298: astore_1
    //   299: aload 8
    //   301: astore 6
    //   303: goto -25 -> 278
    //   306: astore 11
    //   308: aload 10
    //   310: astore_3
    //   311: aload 4
    //   313: astore_1
    //   314: aload 11
    //   316: astore 6
    //   318: goto -40 -> 278
    //   321: astore 14
    //   323: aconst_null
    //   324: astore_1
    //   325: goto -71 -> 254
    //   328: astore 5
    //   330: aload 4
    //   332: astore_1
    //   333: goto -79 -> 254
    //   336: astore 15
    //   338: aconst_null
    //   339: astore 4
    //   341: aconst_null
    //   342: astore 10
    //   344: goto -256 -> 88
    //   347: astore 13
    //   349: aload_3
    //   350: astore 10
    //   352: aconst_null
    //   353: astore 4
    //   355: goto -267 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   57	64	83	java/io/FileNotFoundException
    //   69	80	83	java/io/FileNotFoundException
    //   24	40	250	java/io/IOException
    //   24	40	274	finally
    //   40	57	289	finally
    //   254	263	289	finally
    //   57	64	294	finally
    //   69	80	294	finally
    //   88	97	306	finally
    //   40	57	321	java/io/IOException
    //   57	64	328	java/io/IOException
    //   69	80	328	java/io/IOException
    //   24	40	336	java/io/FileNotFoundException
    //   40	57	347	java/io/FileNotFoundException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aa
 * JD-Core Version:    0.6.2
 */