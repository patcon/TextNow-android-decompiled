package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public abstract class i extends h
{
  private static Method jS;
  private static Method jT;
  private static Method jU;
  private static Method jV;
  private static Method jW;
  private static Method jX;
  private static Method jY;
  private static Method jZ;
  private static String ka;
  private static o kb;
  static boolean kc = false;
  private static long startTime = 0L;

  protected i(Context paramContext, m paramm, n paramn)
  {
    super(paramContext, paramm, paramn);
  }

  static String a(Context paramContext, m paramm)
  {
    if (jV == null)
      throw new i.a();
    try
    {
      localByteBuffer = (ByteBuffer)jV.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null)
        throw new i.a();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ByteBuffer localByteBuffer;
      throw new i.a(localIllegalAccessException);
      String str = paramm.a(localByteBuffer.array(), true);
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  static ArrayList<Long> a(MotionEvent paramMotionEvent, DisplayMetrics paramDisplayMetrics)
  {
    if ((jW == null) || (paramMotionEvent == null))
      throw new i.a();
    try
    {
      ArrayList localArrayList = (ArrayList)jW.invoke(null, new Object[] { paramMotionEvent, paramDisplayMetrics });
      return localArrayList;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  // ERROR //
  protected static void a(String paramString, Context paramContext, m paramm)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 27	com/google/android/gms/internal/i:kc	Z
    //   6: istore 4
    //   8: iload 4
    //   10: ifne +36 -> 46
    //   13: new 75	com/google/android/gms/internal/o
    //   16: dup
    //   17: aload_2
    //   18: aconst_null
    //   19: invokespecial 78	com/google/android/gms/internal/o:<init>	(Lcom/google/android/gms/internal/m;Ljava/security/SecureRandom;)V
    //   22: putstatic 80	com/google/android/gms/internal/i:kb	Lcom/google/android/gms/internal/o;
    //   25: aload_0
    //   26: putstatic 82	com/google/android/gms/internal/i:ka	Ljava/lang/String;
    //   29: aload_1
    //   30: invokestatic 86	com/google/android/gms/internal/i:h	(Landroid/content/Context;)V
    //   33: invokestatic 90	com/google/android/gms/internal/i:w	()Ljava/lang/Long;
    //   36: invokevirtual 96	java/lang/Long:longValue	()J
    //   39: putstatic 25	com/google/android/gms/internal/i:startTime	J
    //   42: iconst_1
    //   43: putstatic 27	com/google/android/gms/internal/i:kc	Z
    //   46: ldc 2
    //   48: monitorexit
    //   49: return
    //   50: astore_3
    //   51: ldc 2
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    //   56: astore 6
    //   58: goto -12 -> 46
    //   61: astore 5
    //   63: goto -17 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   3	8	50	finally
    //   13	46	50	finally
    //   13	46	56	java/lang/UnsupportedOperationException
    //   13	46	61	com/google/android/gms/internal/i$a
  }

  static String b(Context paramContext, m paramm)
  {
    if (jY == null)
      throw new i.a();
    try
    {
      localByteBuffer = (ByteBuffer)jY.invoke(null, new Object[] { paramContext });
      if (localByteBuffer == null)
        throw new i.a();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ByteBuffer localByteBuffer;
      throw new i.a(localIllegalAccessException);
      String str = paramm.a(localByteBuffer.array(), true);
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  private static String b(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      String str = new String(kb.c(paramArrayOfByte, paramString), "UTF-8");
      return str;
    }
    catch (o.a locala)
    {
      throw new i.a(locala);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new i.a(localUnsupportedEncodingException);
    }
  }

  static String f(Context paramContext)
  {
    if (jX == null)
      throw new i.a();
    String str;
    try
    {
      str = (String)jX.invoke(null, new Object[] { paramContext });
      if (str == null)
        throw new i.a();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
    return str;
  }

  static ArrayList<Long> g(Context paramContext)
  {
    if (jZ == null)
      throw new i.a();
    ArrayList localArrayList;
    try
    {
      localArrayList = (ArrayList)jZ.invoke(null, new Object[] { paramContext });
      if ((localArrayList == null) || (localArrayList.size() != 2))
        throw new i.a();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
    return localArrayList;
  }

  private static void h(Context paramContext)
  {
    try
    {
      arrayOfByte1 = kb.b(q.getKey());
      arrayOfByte2 = kb.c(arrayOfByte1, q.B());
      localFile1 = paramContext.getCacheDir();
      if (localFile1 == null)
      {
        localFile1 = paramContext.getDir("dex", 0);
        if (localFile1 == null)
          throw new i.a();
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      File localFile1;
      throw new i.a(localFileNotFoundException);
      File localFile2 = localFile1;
      File localFile3 = File.createTempFile("ads", ".jar", localFile2);
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile3);
      localFileOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      localFileOutputStream.close();
      try
      {
        DexClassLoader localDexClassLoader = new DexClassLoader(localFile3.getAbsolutePath(), localFile2.getAbsolutePath(), null, paramContext.getClassLoader());
        Class localClass1 = localDexClassLoader.loadClass(b(arrayOfByte1, q.C()));
        Class localClass2 = localDexClassLoader.loadClass(b(arrayOfByte1, q.O()));
        Class localClass3 = localDexClassLoader.loadClass(b(arrayOfByte1, q.I()));
        Class localClass4 = localDexClassLoader.loadClass(b(arrayOfByte1, q.G()));
        Class localClass5 = localDexClassLoader.loadClass(b(arrayOfByte1, q.Q()));
        Class localClass6 = localDexClassLoader.loadClass(b(arrayOfByte1, q.E()));
        Class localClass7 = localDexClassLoader.loadClass(b(arrayOfByte1, q.M()));
        Class localClass8 = localDexClassLoader.loadClass(b(arrayOfByte1, q.K()));
        jS = localClass1.getMethod(b(arrayOfByte1, q.D()), new Class[0]);
        jT = localClass2.getMethod(b(arrayOfByte1, q.P()), new Class[0]);
        jU = localClass3.getMethod(b(arrayOfByte1, q.J()), new Class[0]);
        jV = localClass4.getMethod(b(arrayOfByte1, q.H()), new Class[] { Context.class });
        jW = localClass5.getMethod(b(arrayOfByte1, q.R()), new Class[] { MotionEvent.class, DisplayMetrics.class });
        jX = localClass6.getMethod(b(arrayOfByte1, q.F()), new Class[] { Context.class });
        jY = localClass7.getMethod(b(arrayOfByte1, q.N()), new Class[] { Context.class });
        jZ = localClass8.getMethod(b(arrayOfByte1, q.L()), new Class[] { Context.class });
        String str2;
        return;
      }
      finally
      {
        String str1 = localFile3.getName();
        localFile3.delete();
        new File(localFile2, str1.replace(".jar", ".dex")).delete();
      }
    }
    catch (IOException localIOException)
    {
      throw new i.a(localIOException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new i.a(localClassNotFoundException);
    }
    catch (o.a locala)
    {
      throw new i.a(locala);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new i.a(localNoSuchMethodException);
    }
    catch (NullPointerException localNullPointerException)
    {
      throw new i.a(localNullPointerException);
    }
  }

  static String v()
  {
    if (ka == null)
      throw new i.a();
    return ka;
  }

  static Long w()
  {
    if (jS == null)
      throw new i.a();
    try
    {
      Long localLong = (Long)jS.invoke(null, new Object[0]);
      return localLong;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  static String x()
  {
    if (jU == null)
      throw new i.a();
    try
    {
      String str = (String)jU.invoke(null, new Object[0]);
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  static Long y()
  {
    if (jT == null)
      throw new i.a();
    try
    {
      Long localLong = (Long)jT.invoke(null, new Object[0]);
      return localLong;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new i.a(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new i.a(localInvocationTargetException);
    }
  }

  // ERROR //
  protected void c(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokestatic 285	com/google/android/gms/internal/i:x	()Ljava/lang/String;
    //   5: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   8: aload_0
    //   9: iconst_2
    //   10: invokestatic 290	com/google/android/gms/internal/i:v	()Ljava/lang/String;
    //   13: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   16: aload_0
    //   17: bipush 25
    //   19: invokestatic 90	com/google/android/gms/internal/i:w	()Ljava/lang/Long;
    //   22: invokevirtual 96	java/lang/Long:longValue	()J
    //   25: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   28: aload_1
    //   29: invokestatic 295	com/google/android/gms/internal/i:g	(Landroid/content/Context;)Ljava/util/ArrayList;
    //   32: astore 8
    //   34: aload_0
    //   35: bipush 31
    //   37: aload 8
    //   39: iconst_0
    //   40: invokevirtual 299	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   43: checkcast 92	java/lang/Long
    //   46: invokevirtual 96	java/lang/Long:longValue	()J
    //   49: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   52: aload_0
    //   53: bipush 32
    //   55: aload 8
    //   57: iconst_1
    //   58: invokevirtual 299	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   61: checkcast 92	java/lang/Long
    //   64: invokevirtual 96	java/lang/Long:longValue	()J
    //   67: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   70: aload_0
    //   71: bipush 33
    //   73: invokestatic 301	com/google/android/gms/internal/i:y	()Ljava/lang/Long;
    //   76: invokevirtual 96	java/lang/Long:longValue	()J
    //   79: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   82: return
    //   83: astore 7
    //   85: return
    //   86: astore 6
    //   88: return
    //   89: astore 5
    //   91: goto -21 -> 70
    //   94: astore 4
    //   96: goto -68 -> 28
    //   99: astore_3
    //   100: goto -84 -> 16
    //   103: astore_2
    //   104: goto -96 -> 8
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	83	java/io/IOException
    //   8	16	83	java/io/IOException
    //   16	28	83	java/io/IOException
    //   28	70	83	java/io/IOException
    //   70	82	83	java/io/IOException
    //   70	82	86	com/google/android/gms/internal/i$a
    //   28	70	89	com/google/android/gms/internal/i$a
    //   16	28	94	com/google/android/gms/internal/i$a
    //   8	16	99	com/google/android/gms/internal/i$a
    //   0	8	103	com/google/android/gms/internal/i$a
  }

  // ERROR //
  protected void e(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_2
    //   2: invokestatic 290	com/google/android/gms/internal/i:v	()Ljava/lang/String;
    //   5: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   8: aload_0
    //   9: iconst_1
    //   10: invokestatic 285	com/google/android/gms/internal/i:x	()Ljava/lang/String;
    //   13: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   16: invokestatic 90	com/google/android/gms/internal/i:w	()Ljava/lang/Long;
    //   19: invokevirtual 96	java/lang/Long:longValue	()J
    //   22: lstore 10
    //   24: aload_0
    //   25: bipush 25
    //   27: lload 10
    //   29: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   32: getstatic 25	com/google/android/gms/internal/i:startTime	J
    //   35: lconst_0
    //   36: lcmp
    //   37: ifeq +24 -> 61
    //   40: aload_0
    //   41: bipush 17
    //   43: lload 10
    //   45: getstatic 25	com/google/android/gms/internal/i:startTime	J
    //   48: lsub
    //   49: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   52: aload_0
    //   53: bipush 23
    //   55: getstatic 25	com/google/android/gms/internal/i:startTime	J
    //   58: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   61: aload_0
    //   62: getfield 306	com/google/android/gms/internal/i:jO	Landroid/view/MotionEvent;
    //   65: aload_0
    //   66: getfield 310	com/google/android/gms/internal/i:jP	Landroid/util/DisplayMetrics;
    //   69: invokestatic 312	com/google/android/gms/internal/i:a	(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;
    //   72: astore 9
    //   74: aload_0
    //   75: bipush 14
    //   77: aload 9
    //   79: iconst_0
    //   80: invokevirtual 299	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   83: checkcast 92	java/lang/Long
    //   86: invokevirtual 96	java/lang/Long:longValue	()J
    //   89: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   92: aload_0
    //   93: bipush 15
    //   95: aload 9
    //   97: iconst_1
    //   98: invokevirtual 299	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   101: checkcast 92	java/lang/Long
    //   104: invokevirtual 96	java/lang/Long:longValue	()J
    //   107: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   110: aload 9
    //   112: invokevirtual 127	java/util/ArrayList:size	()I
    //   115: iconst_3
    //   116: if_icmplt +21 -> 137
    //   119: aload_0
    //   120: bipush 16
    //   122: aload 9
    //   124: iconst_2
    //   125: invokevirtual 299	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   128: checkcast 92	java/lang/Long
    //   131: invokevirtual 96	java/lang/Long:longValue	()J
    //   134: invokevirtual 293	com/google/android/gms/internal/i:a	(IJ)V
    //   137: aload_0
    //   138: bipush 27
    //   140: aload_1
    //   141: aload_0
    //   142: getfield 316	com/google/android/gms/internal/i:jQ	Lcom/google/android/gms/internal/m;
    //   145: invokestatic 318	com/google/android/gms/internal/i:a	(Landroid/content/Context;Lcom/google/android/gms/internal/m;)Ljava/lang/String;
    //   148: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   151: aload_0
    //   152: bipush 29
    //   154: aload_1
    //   155: aload_0
    //   156: getfield 316	com/google/android/gms/internal/i:jQ	Lcom/google/android/gms/internal/m;
    //   159: invokestatic 320	com/google/android/gms/internal/i:b	(Landroid/content/Context;Lcom/google/android/gms/internal/m;)Ljava/lang/String;
    //   162: invokevirtual 288	com/google/android/gms/internal/i:a	(ILjava/lang/String;)V
    //   165: return
    //   166: astore 8
    //   168: return
    //   169: astore 7
    //   171: return
    //   172: astore 6
    //   174: goto -23 -> 151
    //   177: astore 5
    //   179: goto -42 -> 137
    //   182: astore 4
    //   184: goto -123 -> 61
    //   187: astore_3
    //   188: goto -172 -> 16
    //   191: astore_2
    //   192: goto -184 -> 8
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	166	java/io/IOException
    //   8	16	166	java/io/IOException
    //   16	61	166	java/io/IOException
    //   61	137	166	java/io/IOException
    //   137	151	166	java/io/IOException
    //   151	165	166	java/io/IOException
    //   151	165	169	com/google/android/gms/internal/i$a
    //   137	151	172	com/google/android/gms/internal/i$a
    //   61	137	177	com/google/android/gms/internal/i$a
    //   16	61	182	com/google/android/gms/internal/i$a
    //   8	16	187	com/google/android/gms/internal/i$a
    //   0	8	191	com/google/android/gms/internal/i$a
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.i
 * JD-Core Version:    0.6.2
 */