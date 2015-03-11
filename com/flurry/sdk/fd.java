package com.flurry.sdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;

public final class fd
{
  private static String a = fd.class.getSimpleName();

  public static File a(boolean paramBoolean)
  {
    Context localContext = do.a().b();
    File localFile = null;
    if (paramBoolean)
    {
      boolean bool = "mounted".equals(Environment.getExternalStorageState());
      localFile = null;
      if (bool)
        if (Build.VERSION.SDK_INT < 19)
        {
          int i = localContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
          localFile = null;
          if (i != 0);
        }
        else
        {
          localFile = localContext.getExternalFilesDir(null);
        }
    }
    if (localFile == null)
      localFile = localContext.getFilesDir();
    return localFile;
  }

  // ERROR //
  @java.lang.Deprecated
  public static void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +13 -> 14
    //   4: iconst_4
    //   5: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   8: ldc 70
    //   10: invokestatic 75	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   13: return
    //   14: aload_1
    //   15: ifnonnull +38 -> 53
    //   18: iconst_4
    //   19: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   22: new 77	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   29: ldc 80
    //   31: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_0
    //   35: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 75	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   47: aload_0
    //   48: invokevirtual 96	java/io/File:delete	()Z
    //   51: pop
    //   52: return
    //   53: iconst_4
    //   54: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   57: new 77	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   64: ldc 98
    //   66: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_0
    //   70: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   73: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 75	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   82: new 100	java/io/FileOutputStream
    //   85: dup
    //   86: aload_0
    //   87: invokespecial 103	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   90: astore_2
    //   91: aload_2
    //   92: aload_1
    //   93: invokevirtual 107	java/lang/String:getBytes	()[B
    //   96: invokevirtual 111	java/io/FileOutputStream:write	([B)V
    //   99: aload_2
    //   100: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   103: return
    //   104: astore_3
    //   105: aconst_null
    //   106: astore_2
    //   107: bipush 6
    //   109: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   112: ldc 118
    //   114: aload_3
    //   115: invokestatic 121	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aload_2
    //   119: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   122: return
    //   123: astore 4
    //   125: aconst_null
    //   126: astore_2
    //   127: aload_2
    //   128: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   131: aload 4
    //   133: athrow
    //   134: astore 4
    //   136: goto -9 -> 127
    //   139: astore_3
    //   140: goto -33 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   82	91	104	java/lang/Throwable
    //   82	91	123	finally
    //   91	99	134	finally
    //   107	118	134	finally
    //   91	99	139	java/lang/Throwable
  }

  public static boolean a(File paramFile)
  {
    if (paramFile == null);
    while (paramFile.getAbsoluteFile() == null)
      return false;
    File localFile = paramFile.getParentFile();
    if (localFile == null)
      return true;
    if ((!localFile.mkdirs()) && (!localFile.isDirectory()))
    {
      eo.a(6, a, "Unable to create persistent dir: " + localFile);
      return false;
    }
    return true;
  }

  public static File b(boolean paramBoolean)
  {
    Context localContext = do.a().b();
    File localFile = null;
    if (paramBoolean)
    {
      boolean bool = "mounted".equals(Environment.getExternalStorageState());
      localFile = null;
      if (bool)
        if (Build.VERSION.SDK_INT < 19)
        {
          int i = localContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
          localFile = null;
          if (i != 0);
        }
        else
        {
          localFile = localContext.getExternalCacheDir();
        }
    }
    if (localFile == null)
      localFile = localContext.getCacheDir();
    return localFile;
  }

  public static boolean b(File paramFile)
  {
    if ((paramFile != null) && (paramFile.isDirectory()))
    {
      String[] arrayOfString = paramFile.list();
      for (int i = 0; i < arrayOfString.length; i++)
        if (!b(new File(paramFile, arrayOfString[i])))
          return false;
    }
    return paramFile.delete();
  }

  // ERROR //
  @java.lang.Deprecated
  public static String c(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 158	java/io/File:exists	()Z
    //   8: ifne +14 -> 22
    //   11: iconst_4
    //   12: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   15: ldc 160
    //   17: invokestatic 75	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   20: aconst_null
    //   21: areturn
    //   22: iconst_4
    //   23: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   26: new 77	java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   33: ldc 162
    //   35: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_0
    //   39: invokevirtual 89	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   42: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 75	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   51: new 164	java/io/FileInputStream
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 165	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   59: astore_1
    //   60: new 77	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   67: astore_2
    //   68: sipush 1024
    //   71: newarray byte
    //   73: astore 5
    //   75: aload_1
    //   76: aload 5
    //   78: invokevirtual 169	java/io/FileInputStream:read	([B)I
    //   81: istore 6
    //   83: iload 6
    //   85: ifle +52 -> 137
    //   88: aload_2
    //   89: new 38	java/lang/String
    //   92: dup
    //   93: aload 5
    //   95: iconst_0
    //   96: iload 6
    //   98: invokespecial 172	java/lang/String:<init>	([BII)V
    //   101: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: goto -30 -> 75
    //   108: astore 4
    //   110: bipush 6
    //   112: getstatic 16	com/flurry/sdk/fd:a	Ljava/lang/String;
    //   115: ldc 174
    //   117: aload 4
    //   119: invokestatic 121	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   122: aload_1
    //   123: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   126: aconst_null
    //   127: astore_2
    //   128: aload_2
    //   129: ifnull -109 -> 20
    //   132: aload_2
    //   133: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: areturn
    //   137: aload_1
    //   138: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   141: goto -13 -> 128
    //   144: astore 8
    //   146: aconst_null
    //   147: astore_1
    //   148: aload 8
    //   150: astore_3
    //   151: aload_1
    //   152: invokestatic 116	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   155: aload_3
    //   156: athrow
    //   157: astore_3
    //   158: goto -7 -> 151
    //   161: astore 4
    //   163: aconst_null
    //   164: astore_1
    //   165: goto -55 -> 110
    //
    // Exception table:
    //   from	to	target	type
    //   60	75	108	java/lang/Throwable
    //   75	83	108	java/lang/Throwable
    //   88	105	108	java/lang/Throwable
    //   51	60	144	finally
    //   60	75	157	finally
    //   75	83	157	finally
    //   88	105	157	finally
    //   110	122	157	finally
    //   51	60	161	java/lang/Throwable
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fd
 * JD-Core Version:    0.6.2
 */