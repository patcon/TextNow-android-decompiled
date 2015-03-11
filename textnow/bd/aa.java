package textnow.bd;

import android.content.Context;
import android.os.Environment;
import java.io.File;

final class aa
{
  private final String a;
  private final Context b;
  private File c;

  public aa(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.b = paramContext;
  }

  private void a(File paramFile)
  {
    for (File localFile : paramFile.listFiles())
    {
      if (localFile.isDirectory())
        a(localFile);
      localFile.delete();
    }
  }

  private File b()
  {
    int i = 0;
    int j = 0;
    if (i != 0);
    while (true)
    {
      try
      {
        Thread.sleep(50L);
        try
        {
          if ((this.c == null) || (!this.c.exists()))
          {
            if (("mounted".equals(Environment.getExternalStorageState())) && (this.b.getExternalCacheDir() != null))
            {
              this.c = new File(this.b.getExternalCacheDir().getAbsolutePath() + File.separatorChar + this.a);
              if (this.c == null)
                continue;
              if (this.c.exists())
                break label239;
              if (!this.c.mkdirs())
                continue;
              break label239;
            }
          }
          else
          {
            k = i + 1;
            if ((i < 3) && (j == 0))
              continue;
            if (k != 3)
              continue;
            throw new RuntimeException("Was unable to create the cache directory!");
          }
          this.c = new File(this.b.getCacheDir().getAbsolutePath() + File.separatorChar + this.a);
          continue;
        }
        finally
        {
        }
        j = 0;
        continue;
        return this.c;
      }
      catch (InterruptedException localInterruptedException)
      {
        int k;
        continue;
        i = k;
      }
      break;
      label239: j = 1;
    }
  }

  public final File a(String paramString)
  {
    return new File(b(), paramString);
  }

  public final void a()
  {
    a(b());
  }

  // ERROR //
  public final void a(java.io.InputStream paramInputStream, String paramString)
  {
    // Byte code:
    //   0: new 22	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 107	textnow/bd/aa:b	()Ljava/io/File;
    //   8: aload_2
    //   9: invokespecial 110	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   12: astore_3
    //   13: new 117	java/io/FileOutputStream
    //   16: dup
    //   17: aload_3
    //   18: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   21: astore 4
    //   23: sipush 1024
    //   26: newarray byte
    //   28: astore 12
    //   30: aload_1
    //   31: aload 12
    //   33: invokevirtual 125	java/io/InputStream:read	([B)I
    //   36: istore 13
    //   38: iload 13
    //   40: ifle +49 -> 89
    //   43: aload 4
    //   45: aload 12
    //   47: iconst_0
    //   48: iload 13
    //   50: invokevirtual 129	java/io/FileOutputStream:write	([BII)V
    //   53: goto -23 -> 30
    //   56: astore 10
    //   58: aload_3
    //   59: invokevirtual 35	java/io/File:delete	()Z
    //   62: pop
    //   63: aload 10
    //   65: athrow
    //   66: astore 7
    //   68: aload 4
    //   70: ifnull +8 -> 78
    //   73: aload 4
    //   75: invokevirtual 132	java/io/FileOutputStream:close	()V
    //   78: aload_1
    //   79: ifnull +7 -> 86
    //   82: aload_1
    //   83: invokevirtual 133	java/io/InputStream:close	()V
    //   86: aload 7
    //   88: athrow
    //   89: aload 4
    //   91: invokevirtual 132	java/io/FileOutputStream:close	()V
    //   94: aload_1
    //   95: ifnull +7 -> 102
    //   98: aload_1
    //   99: invokevirtual 133	java/io/InputStream:close	()V
    //   102: return
    //   103: astore 14
    //   105: aload 14
    //   107: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   110: goto -16 -> 94
    //   113: astore 15
    //   115: aload 15
    //   117: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   120: return
    //   121: astore 5
    //   123: aconst_null
    //   124: astore 4
    //   126: aload_3
    //   127: invokevirtual 35	java/io/File:delete	()Z
    //   130: pop
    //   131: aload 5
    //   133: athrow
    //   134: astore 9
    //   136: aload 9
    //   138: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   141: goto -63 -> 78
    //   144: astore 8
    //   146: aload 8
    //   148: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   151: goto -65 -> 86
    //   154: astore 7
    //   156: aconst_null
    //   157: astore 4
    //   159: goto -91 -> 68
    //   162: astore 5
    //   164: goto -38 -> 126
    //   167: astore 10
    //   169: aconst_null
    //   170: astore 4
    //   172: goto -114 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   23	30	56	java/io/IOException
    //   30	38	56	java/io/IOException
    //   43	53	56	java/io/IOException
    //   23	30	66	finally
    //   30	38	66	finally
    //   43	53	66	finally
    //   58	66	66	finally
    //   126	134	66	finally
    //   89	94	103	java/io/IOException
    //   98	102	113	java/io/IOException
    //   13	23	121	java/lang/OutOfMemoryError
    //   73	78	134	java/io/IOException
    //   82	86	144	java/io/IOException
    //   13	23	154	finally
    //   23	30	162	java/lang/OutOfMemoryError
    //   30	38	162	java/lang/OutOfMemoryError
    //   43	53	162	java/lang/OutOfMemoryError
    //   13	23	167	java/io/IOException
  }

  public final void b(String paramString)
  {
    File localFile = a(paramString);
    if (!localFile.isDirectory())
    {
      localFile.delete();
      return;
    }
    a(localFile);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.aa
 * JD-Core Version:    0.6.2
 */