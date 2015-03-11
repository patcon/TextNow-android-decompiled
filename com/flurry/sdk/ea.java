package com.flurry.sdk;

import android.content.Context;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class ea
{
  private static final String a = ea.class.getSimpleName();
  private static final Set<String> b = i();
  private static String c;

  public static String a()
  {
    try
    {
      if (Looper.getMainLooper().getThread() == Thread.currentThread())
        throw new IllegalStateException("Must be called from a background thread!");
    }
    finally
    {
    }
    if (TextUtils.isEmpty(c))
      c = g();
    String str = c;
    return str;
  }

  private static String a(DataInput paramDataInput)
  {
    if (1 != paramDataInput.readInt())
      return null;
    return paramDataInput.readUTF();
  }

  private static void a(String paramString, DataOutput paramDataOutput)
  {
    paramDataOutput.writeInt(1);
    paramDataOutput.writeUTF(paramString);
  }

  // ERROR //
  static void a(String paramString, File paramFile)
  {
    // Byte code:
    //   0: new 87	java/io/DataOutputStream
    //   3: dup
    //   4: new 89	java/io/FileOutputStream
    //   7: dup
    //   8: aload_1
    //   9: invokespecial 92	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   12: invokespecial 95	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   15: astore_2
    //   16: aload_0
    //   17: aload_2
    //   18: invokestatic 97	com/flurry/sdk/ea:a	(Ljava/lang/String;Ljava/io/DataOutput;)V
    //   21: aload_2
    //   22: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   25: return
    //   26: astore_3
    //   27: aconst_null
    //   28: astore_2
    //   29: bipush 6
    //   31: getstatic 20	com/flurry/sdk/ea:a	Ljava/lang/String;
    //   34: ldc 104
    //   36: aload_3
    //   37: invokestatic 109	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   40: aload_2
    //   41: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   44: return
    //   45: astore 4
    //   47: aconst_null
    //   48: astore_2
    //   49: aload_2
    //   50: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   53: aload 4
    //   55: athrow
    //   56: astore 4
    //   58: goto -9 -> 49
    //   61: astore_3
    //   62: goto -33 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   0	16	26	java/lang/Throwable
    //   0	16	45	finally
    //   16	21	56	finally
    //   29	40	56	finally
    //   16	21	61	java/lang/Throwable
  }

  static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (c(paramString.toLowerCase(Locale.US)))
      return false;
    return true;
  }

  static String b()
  {
    String str = Settings.Secure.getString(do.a().b().getContentResolver(), "android_id");
    if (!a(str))
      return null;
    return "AND" + str;
  }

  private static String b(DataInput paramDataInput)
  {
    if (46586 != paramDataInput.readUnsignedShort());
    while (2 != paramDataInput.readUnsignedShort())
      return null;
    paramDataInput.readUTF();
    return paramDataInput.readUTF();
  }

  static void b(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    File localFile;
    do
    {
      return;
      localFile = do.a().b().getFileStreamPath(h());
    }
    while (!fd.a(localFile));
    a(paramString, localFile);
  }

  static String c()
  {
    String str = e();
    if (TextUtils.isEmpty(str))
    {
      str = f();
      if (TextUtils.isEmpty(str))
        str = d();
      b(str);
    }
    return str;
  }

  private static boolean c(String paramString)
  {
    return b.contains(paramString);
  }

  static String d()
  {
    long l = Double.doubleToLongBits(Math.random()) + 37L * (System.nanoTime() + 37 * dx.c(do.a().b()).hashCode());
    return "ID" + Long.toString(l, 16);
  }

  // ERROR //
  static String e()
  {
    // Byte code:
    //   0: invokestatic 129	com/flurry/sdk/do:a	()Lcom/flurry/sdk/do;
    //   3: invokevirtual 132	com/flurry/sdk/do:b	()Landroid/content/Context;
    //   6: invokestatic 167	com/flurry/sdk/ea:h	()Ljava/lang/String;
    //   9: invokevirtual 171	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   12: astore_0
    //   13: aload_0
    //   14: ifnull +10 -> 24
    //   17: aload_0
    //   18: invokevirtual 236	java/io/File:exists	()Z
    //   21: ifne +5 -> 26
    //   24: aconst_null
    //   25: areturn
    //   26: new 238	java/io/DataInputStream
    //   29: dup
    //   30: new 240	java/io/FileInputStream
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 241	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: invokespecial 244	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: astore_1
    //   42: aload_1
    //   43: invokestatic 246	com/flurry/sdk/ea:a	(Ljava/io/DataInput;)Ljava/lang/String;
    //   46: astore 4
    //   48: aload_1
    //   49: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   52: aload 4
    //   54: areturn
    //   55: astore_2
    //   56: aconst_null
    //   57: astore_1
    //   58: bipush 6
    //   60: getstatic 20	com/flurry/sdk/ea:a	Ljava/lang/String;
    //   63: ldc 248
    //   65: aload_2
    //   66: invokestatic 109	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   69: aload_1
    //   70: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   73: aconst_null
    //   74: areturn
    //   75: astore 5
    //   77: aconst_null
    //   78: astore_1
    //   79: aload 5
    //   81: astore_3
    //   82: aload_1
    //   83: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   86: aload_3
    //   87: athrow
    //   88: astore_3
    //   89: goto -7 -> 82
    //   92: astore_2
    //   93: goto -35 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   26	42	55	java/lang/Throwable
    //   26	42	75	finally
    //   42	48	88	finally
    //   58	69	88	finally
    //   42	48	92	java/lang/Throwable
  }

  // ERROR //
  static String f()
  {
    // Byte code:
    //   0: invokestatic 129	com/flurry/sdk/do:a	()Lcom/flurry/sdk/do;
    //   3: invokevirtual 132	com/flurry/sdk/do:b	()Landroid/content/Context;
    //   6: invokevirtual 252	android/content/Context:getFilesDir	()Ljava/io/File;
    //   9: astore_0
    //   10: aload_0
    //   11: ifnonnull +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_0
    //   17: new 254	com/flurry/sdk/ea$1
    //   20: dup
    //   21: invokespecial 255	com/flurry/sdk/ea$1:<init>	()V
    //   24: invokevirtual 259	java/io/File:list	(Ljava/io/FilenameFilter;)[Ljava/lang/String;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull -15 -> 14
    //   32: aload_1
    //   33: arraylength
    //   34: ifeq -20 -> 14
    //   37: aload_1
    //   38: iconst_0
    //   39: aaload
    //   40: astore_2
    //   41: invokestatic 129	com/flurry/sdk/do:a	()Lcom/flurry/sdk/do;
    //   44: invokevirtual 132	com/flurry/sdk/do:b	()Landroid/content/Context;
    //   47: aload_2
    //   48: invokevirtual 171	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -39 -> 14
    //   56: aload_3
    //   57: invokevirtual 236	java/io/File:exists	()Z
    //   60: ifeq -46 -> 14
    //   63: new 238	java/io/DataInputStream
    //   66: dup
    //   67: new 240	java/io/FileInputStream
    //   70: dup
    //   71: aload_3
    //   72: invokespecial 241	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   75: invokespecial 244	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   78: astore 4
    //   80: aload 4
    //   82: invokestatic 261	com/flurry/sdk/ea:b	(Ljava/io/DataInput;)Ljava/lang/String;
    //   85: astore 7
    //   87: aload 4
    //   89: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   92: aload 7
    //   94: areturn
    //   95: astore 5
    //   97: aconst_null
    //   98: astore 4
    //   100: bipush 6
    //   102: getstatic 20	com/flurry/sdk/ea:a	Ljava/lang/String;
    //   105: ldc 248
    //   107: aload 5
    //   109: invokestatic 109	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   112: aload 4
    //   114: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   117: aconst_null
    //   118: areturn
    //   119: astore 8
    //   121: aconst_null
    //   122: astore 4
    //   124: aload 8
    //   126: astore 6
    //   128: aload 4
    //   130: invokestatic 102	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   133: aload 6
    //   135: athrow
    //   136: astore 6
    //   138: goto -10 -> 128
    //   141: astore 5
    //   143: goto -43 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   63	80	95	java/lang/Throwable
    //   63	80	119	finally
    //   80	87	136	finally
    //   100	112	136	finally
    //   80	87	141	java/lang/Throwable
  }

  private static String g()
  {
    String str = b();
    if (!TextUtils.isEmpty(str))
      return str;
    return c();
  }

  private static String h()
  {
    return ".flurryb.";
  }

  private static Set<String> i()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("null");
    localHashSet.add("9774d56d682e549c");
    localHashSet.add("dead00beef");
    return Collections.unmodifiableSet(localHashSet);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ea
 * JD-Core Version:    0.6.2
 */