package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.UUID;

public class df
{
  private static final String d = df.class.getSimpleName();
  String a = null;
  long b = -1L;
  int c = -1;
  private File e = null;

  public df()
  {
    this.a = UUID.randomUUID().toString();
    this.e = do.a().b().getFileStreamPath(".flurrydatasenderblock." + this.a);
  }

  public df(String paramString)
  {
    this.a = paramString;
    this.e = do.a().b().getFileStreamPath(".flurrydatasenderblock." + this.a);
  }

  public String a()
  {
    return this.a;
  }

  // ERROR //
  public boolean a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic 79	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   5: invokestatic 82	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   8: if_acmpne +13 -> 21
    //   11: bipush 6
    //   13: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   16: ldc 84
    //   18: invokestatic 89	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   21: iconst_4
    //   22: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   25: new 55	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   32: ldc 91
    //   34: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: aload_0
    //   38: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   41: invokevirtual 96	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   44: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 89	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   53: aload_0
    //   54: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   57: invokestatic 101	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   60: istore 6
    //   62: iload 6
    //   64: ifne +9 -> 73
    //   67: aconst_null
    //   68: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   71: iconst_0
    //   72: ireturn
    //   73: new 108	java/io/DataOutputStream
    //   76: dup
    //   77: new 110	java/io/FileOutputStream
    //   80: dup
    //   81: aload_0
    //   82: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   85: invokespecial 113	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   88: invokespecial 116	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   91: astore 4
    //   93: aload_1
    //   94: arraylength
    //   95: istore 7
    //   97: aload 4
    //   99: iload 7
    //   101: invokevirtual 120	java/io/DataOutputStream:writeShort	(I)V
    //   104: aload 4
    //   106: aload_1
    //   107: invokevirtual 124	java/io/DataOutputStream:write	([B)V
    //   110: aload 4
    //   112: iconst_0
    //   113: invokevirtual 120	java/io/DataOutputStream:writeShort	(I)V
    //   116: iconst_1
    //   117: istore_2
    //   118: aload_0
    //   119: iload 7
    //   121: putfield 34	com/flurry/sdk/df:c	I
    //   124: aload_0
    //   125: invokestatic 130	java/lang/System:currentTimeMillis	()J
    //   128: putfield 32	com/flurry/sdk/df:b	J
    //   131: aload 4
    //   133: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   136: iload_2
    //   137: ireturn
    //   138: astore 5
    //   140: aconst_null
    //   141: astore 4
    //   143: bipush 6
    //   145: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   148: ldc 132
    //   150: aload 5
    //   152: invokestatic 135	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   155: aload 4
    //   157: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   160: iload_2
    //   161: ireturn
    //   162: astore_3
    //   163: aconst_null
    //   164: astore 4
    //   166: aload 4
    //   168: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   171: aload_3
    //   172: athrow
    //   173: astore_3
    //   174: goto -8 -> 166
    //   177: astore 5
    //   179: goto -36 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   53	62	138	java/lang/Throwable
    //   73	93	138	java/lang/Throwable
    //   53	62	162	finally
    //   73	93	162	finally
    //   93	116	173	finally
    //   118	131	173	finally
    //   143	155	173	finally
    //   93	116	177	java/lang/Throwable
    //   118	131	177	java/lang/Throwable
  }

  // ERROR //
  public byte[] b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 79	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   5: invokestatic 82	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   8: if_acmpne +13 -> 21
    //   11: bipush 6
    //   13: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   16: ldc 138
    //   18: invokestatic 89	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   25: invokevirtual 142	java/io/File:exists	()Z
    //   28: ifeq +127 -> 155
    //   31: iconst_4
    //   32: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   35: new 55	java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   42: ldc 144
    //   44: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_0
    //   48: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   51: invokevirtual 96	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   54: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokestatic 89	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   63: new 146	java/io/DataInputStream
    //   66: dup
    //   67: new 148	java/io/FileInputStream
    //   70: dup
    //   71: aload_0
    //   72: getfield 36	com/flurry/sdk/df:e	Ljava/io/File;
    //   75: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   78: invokespecial 152	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   81: astore_2
    //   82: aload_2
    //   83: invokevirtual 156	java/io/DataInputStream:readUnsignedShort	()I
    //   86: istore 5
    //   88: iload 5
    //   90: ifne +9 -> 99
    //   93: aload_2
    //   94: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   97: aconst_null
    //   98: areturn
    //   99: iload 5
    //   101: newarray byte
    //   103: astore_1
    //   104: aload_2
    //   105: aload_1
    //   106: invokevirtual 159	java/io/DataInputStream:readFully	([B)V
    //   109: aload_2
    //   110: invokevirtual 156	java/io/DataInputStream:readUnsignedShort	()I
    //   113: pop
    //   114: aload_2
    //   115: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   118: aload_1
    //   119: areturn
    //   120: astore_3
    //   121: aconst_null
    //   122: astore_2
    //   123: bipush 6
    //   125: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   128: ldc 161
    //   130: aload_3
    //   131: invokestatic 135	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: aload_2
    //   135: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   138: aload_1
    //   139: areturn
    //   140: astore 7
    //   142: aconst_null
    //   143: astore_2
    //   144: aload 7
    //   146: astore 4
    //   148: aload_2
    //   149: invokestatic 106	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   152: aload 4
    //   154: athrow
    //   155: iconst_4
    //   156: getstatic 23	com/flurry/sdk/df:d	Ljava/lang/String;
    //   159: ldc 163
    //   161: invokestatic 89	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   164: aconst_null
    //   165: areturn
    //   166: astore 4
    //   168: goto -20 -> 148
    //   171: astore_3
    //   172: goto -49 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   63	82	120	java/lang/Throwable
    //   63	82	140	finally
    //   82	88	166	finally
    //   99	114	166	finally
    //   123	134	166	finally
    //   82	88	171	java/lang/Throwable
    //   99	114	171	java/lang/Throwable
  }

  public boolean c()
  {
    if (this.e.exists())
    {
      if (this.e.delete())
      {
        eo.a(4, d, "Deleted persistence file");
        this.b = -1L;
        this.c = -1;
        return true;
      }
      eo.a(6, d, "Cannot delete persistence file");
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.df
 * JD-Core Version:    0.6.2
 */