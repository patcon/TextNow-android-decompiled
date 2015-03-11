package com.flurry.sdk;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fh
  implements Closeable
{
  static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
  private static final OutputStream p = new OutputStream()
  {
    public final void write(int paramAnonymousInt)
    {
    }
  };
  final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File c;
  private final File d;
  private final File e;
  private final File f;
  private final int g;
  private long h;
  private final int i;
  private long j = 0L;
  private Writer k;
  private final LinkedHashMap<String, fh.b> l = new LinkedHashMap(0, 0.75F, true);
  private int m;
  private long n = 0L;
  private final Callable<Void> o = new Callable()
  {
    public Void a()
    {
      synchronized (fh.this)
      {
        if (fh.a(fh.this) == null)
          return null;
        fh.b(fh.this);
        if (fh.c(fh.this))
        {
          fh.d(fh.this);
          fh.a(fh.this, 0);
        }
        return null;
      }
    }
  };

  private fh(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.c = paramFile;
    this.g = paramInt1;
    this.d = new File(paramFile, "journal");
    this.e = new File(paramFile, "journal.tmp");
    this.f = new File(paramFile, "journal.bkp");
    this.i = paramInt2;
    this.h = paramLong;
  }

  private fh.a a(String paramString, long paramLong)
  {
    while (true)
    {
      fh.b localb1;
      fh.a locala2;
      fh.b localb2;
      try
      {
        g();
        e(paramString);
        localb1 = (fh.b)this.l.get(paramString);
        if (paramLong != -1L)
          if (localb1 != null)
          {
            long l1 = fh.b.e(localb1);
            if (l1 == paramLong);
          }
          else
          {
            locala2 = null;
            return locala2;
          }
        if (localb1 == null)
        {
          fh.b localb3 = new fh.b(this, paramString, null);
          this.l.put(paramString, localb3);
          localb2 = localb3;
          locala2 = new fh.a(this, localb2, null);
          fh.b.a(localb2, locala2);
          this.k.write("DIRTY " + paramString + '\n');
          this.k.flush();
          continue;
        }
      }
      finally
      {
      }
      fh.a locala1 = fh.b.a(localb1);
      if (locala1 != null)
        locala2 = null;
      else
        localb2 = localb1;
    }
  }

  public static fh a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L)
      throw new IllegalArgumentException("maxSize <= 0");
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("valueCount <= 0");
    File localFile1 = new File(paramFile, "journal.bkp");
    File localFile2;
    if (localFile1.exists())
    {
      localFile2 = new File(paramFile, "journal");
      if (!localFile2.exists())
        break label148;
      localFile1.delete();
    }
    while (true)
    {
      fh localfh1 = new fh(paramFile, paramInt1, paramInt2, paramLong);
      if (localfh1.d.exists())
        try
        {
          localfh1.c();
          localfh1.d();
          localfh1.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localfh1.d, true), fj.a));
          return localfh1;
          label148: a(localFile1, localFile2, false);
        }
        catch (IOException localIOException)
        {
          System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
          localfh1.a();
        }
    }
    paramFile.mkdirs();
    fh localfh2 = new fh(paramFile, paramInt1, paramInt2, paramLong);
    localfh2.e();
    return localfh2;
  }

  private void a(fh.a parama, boolean paramBoolean)
  {
    fh.b localb;
    try
    {
      localb = fh.a.a(parama);
      if (fh.b.a(localb) != parama)
        throw new IllegalStateException();
    }
    finally
    {
    }
    int i1 = 0;
    if (paramBoolean)
    {
      boolean bool = fh.b.d(localb);
      i1 = 0;
      if (!bool)
        for (int i2 = 0; ; i2++)
        {
          int i3 = this.i;
          i1 = 0;
          if (i2 >= i3)
            break;
          if (fh.a.b(parama)[i2] == 0)
          {
            parama.b();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
          }
          if (!localb.b(i2).exists())
          {
            parama.b();
            return;
          }
        }
    }
    while (true)
    {
      if (i1 < this.i)
      {
        File localFile1 = localb.b(i1);
        if (paramBoolean)
        {
          if (localFile1.exists())
          {
            File localFile2 = localb.a(i1);
            localFile1.renameTo(localFile2);
            long l2 = fh.b.b(localb)[i1];
            long l3 = localFile2.length();
            fh.b.b(localb)[i1] = l3;
            this.j = (l3 + (this.j - l2));
          }
        }
        else
          a(localFile1);
      }
      else
      {
        this.m = (1 + this.m);
        fh.b.a(localb, null);
        if ((paramBoolean | fh.b.d(localb)))
        {
          fh.b.a(localb, true);
          this.k.write("CLEAN " + fh.b.c(localb) + localb.a() + '\n');
          if (paramBoolean)
          {
            long l1 = this.n;
            this.n = (1L + l1);
            fh.b.a(localb, l1);
          }
        }
        while (true)
        {
          this.k.flush();
          if ((this.j <= this.h) && (!f()))
            break;
          this.b.submit(this.o);
          break;
          this.l.remove(fh.b.c(localb));
          this.k.write("REMOVE " + fh.b.c(localb) + '\n');
        }
      }
      i1++;
    }
  }

  private static void a(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete()))
      throw new IOException();
  }

  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean)
      a(paramFile2);
    if (!paramFile1.renameTo(paramFile2))
      throw new IOException();
  }

  // ERROR //
  private void c()
  {
    // Byte code:
    //   0: new 333	com/flurry/sdk/fi
    //   3: dup
    //   4: new 335	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 104	com/flurry/sdk/fh:d	Ljava/io/File;
    //   12: invokespecial 337	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: getstatic 218	com/flurry/sdk/fj:a	Ljava/nio/charset/Charset;
    //   18: invokespecial 340	com/flurry/sdk/fi:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   43: astore 6
    //   45: aload_1
    //   46: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   49: astore 7
    //   51: ldc_w 343
    //   54: aload_3
    //   55: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +55 -> 113
    //   61: ldc_w 351
    //   64: aload 4
    //   66: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +44 -> 113
    //   72: aload_0
    //   73: getfield 95	com/flurry/sdk/fh:g	I
    //   76: invokestatic 356	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   79: aload 5
    //   81: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifeq +29 -> 113
    //   87: aload_0
    //   88: getfield 114	com/flurry/sdk/fh:i	I
    //   91: invokestatic 356	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   94: aload 6
    //   96: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifeq +14 -> 113
    //   102: ldc_w 358
    //   105: aload 7
    //   107: invokevirtual 349	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifne +77 -> 187
    //   113: new 183	java/io/IOException
    //   116: dup
    //   117: new 155	java/lang/StringBuilder
    //   120: dup
    //   121: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   124: ldc_w 360
    //   127: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: aload_3
    //   131: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: ldc_w 362
    //   137: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload 4
    //   142: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc_w 362
    //   148: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 6
    //   153: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc_w 362
    //   159: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload 7
    //   164: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: ldc_w 364
    //   170: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokespecial 365	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   179: athrow
    //   180: astore_2
    //   181: aload_1
    //   182: invokestatic 368	com/flurry/sdk/fj:a	(Ljava/io/Closeable;)V
    //   185: aload_2
    //   186: athrow
    //   187: iconst_0
    //   188: istore 8
    //   190: aload_0
    //   191: aload_1
    //   192: invokevirtual 341	com/flurry/sdk/fi:a	()Ljava/lang/String;
    //   195: invokespecial 370	com/flurry/sdk/fh:d	(Ljava/lang/String;)V
    //   198: iinc 8 1
    //   201: goto -11 -> 190
    //   204: astore 9
    //   206: aload_0
    //   207: iload 8
    //   209: aload_0
    //   210: getfield 64	com/flurry/sdk/fh:l	Ljava/util/LinkedHashMap;
    //   213: invokevirtual 374	java/util/LinkedHashMap:size	()I
    //   216: isub
    //   217: putfield 119	com/flurry/sdk/fh:m	I
    //   220: aload_1
    //   221: invokestatic 368	com/flurry/sdk/fj:a	(Ljava/io/Closeable;)V
    //   224: return
    //
    // Exception table:
    //   from	to	target	type
    //   22	113	180	finally
    //   113	180	180	finally
    //   190	198	180	finally
    //   206	220	180	finally
    //   190	198	204	java/io/EOFException
  }

  private void d()
  {
    a(this.e);
    Iterator localIterator = this.l.values().iterator();
    while (localIterator.hasNext())
    {
      fh.b localb = (fh.b)localIterator.next();
      if (fh.b.a(localb) == null)
      {
        for (int i2 = 0; i2 < this.i; i2++)
          this.j += fh.b.b(localb)[i2];
      }
      else
      {
        fh.b.a(localb, null);
        for (int i1 = 0; i1 < this.i; i1++)
        {
          a(localb.a(i1));
          a(localb.b(i1));
        }
        localIterator.remove();
      }
    }
  }

  private void d(String paramString)
  {
    int i1 = paramString.indexOf(' ');
    if (i1 == -1)
      throw new IOException("unexpected journal line: " + paramString);
    int i2 = i1 + 1;
    int i3 = paramString.indexOf(' ', i2);
    String str2;
    if (i3 == -1)
    {
      str2 = paramString.substring(i2);
      if ((i1 != "REMOVE".length()) || (!paramString.startsWith("REMOVE")))
        break label312;
      this.l.remove(str2);
    }
    label312: for (String str1 = paramString.substring(i2, i3); ; str1 = str2)
    {
      fh.b localb = (fh.b)this.l.get(str1);
      if (localb == null)
      {
        localb = new fh.b(this, str1, null);
        this.l.put(str1, localb);
      }
      if ((i3 != -1) && (i1 == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        String[] arrayOfString = paramString.substring(i3 + 1).split(" ");
        fh.b.a(localb, true);
        fh.b.a(localb, null);
        fh.b.a(localb, arrayOfString);
        return;
      }
      if ((i3 == -1) && (i1 == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        fh.b.a(localb, new fh.a(this, localb, null));
        return;
      }
      if ((i3 == -1) && (i1 == "READ".length()) && (paramString.startsWith("READ")))
        break;
      throw new IOException("unexpected journal line: " + paramString);
    }
  }

  private void e()
  {
    BufferedWriter localBufferedWriter;
    while (true)
    {
      fh.b localb;
      try
      {
        if (this.k != null)
          this.k.close();
        localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), fj.a));
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.g));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.i));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.l.values().iterator();
          if (!localIterator.hasNext())
            break;
          localb = (fh.b)localIterator.next();
          if (fh.b.a(localb) != null)
          {
            localBufferedWriter.write("DIRTY " + fh.b.c(localb) + '\n');
            continue;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
      }
      finally
      {
      }
      localBufferedWriter.write("CLEAN " + fh.b.c(localb) + localb.a() + '\n');
    }
    localBufferedWriter.close();
    if (this.d.exists())
      a(this.d, this.f, true);
    a(this.e, this.d, false);
    this.f.delete();
    this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), fj.a));
  }

  private void e(String paramString)
  {
    if (!a.matcher(paramString).matches())
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
  }

  private boolean f()
  {
    return (this.m >= 2000) && (this.m >= this.l.size());
  }

  private void g()
  {
    if (this.k == null)
      throw new IllegalStateException("cache is closed");
  }

  private void h()
  {
    while (this.j > this.h)
      c((String)((Map.Entry)this.l.entrySet().iterator().next()).getKey());
  }

  public final fh.c a(String paramString)
  {
    try
    {
      g();
      e(paramString);
      fh.b localb = (fh.b)this.l.get(paramString);
      fh.c localc = null;
      if (localb == null);
      while (true)
      {
        return localc;
        boolean bool = fh.b.d(localb);
        localc = null;
        if (bool)
        {
          InputStream[] arrayOfInputStream = new InputStream[this.i];
          int i1 = 0;
          while (true)
          {
            int i2;
            int i3;
            try
            {
              if (i1 >= this.i)
                break label144;
              arrayOfInputStream[i1] = new FileInputStream(localb.a(i1));
              i1++;
              continue;
            }
            catch (FileNotFoundException localFileNotFoundException)
            {
              i2 = 0;
              i3 = this.i;
              localc = null;
            }
            if (i2 >= i3)
              break;
            InputStream localInputStream = arrayOfInputStream[i2];
            localc = null;
            if (localInputStream == null)
              break;
            fj.a(arrayOfInputStream[i2]);
            i2++;
          }
          label144: this.m = (1 + this.m);
          this.k.append("READ " + paramString + '\n');
          if (f())
            this.b.submit(this.o);
          localc = new fh.c(this, paramString, fh.b.e(localb), arrayOfInputStream, fh.b.b(localb), null);
        }
      }
    }
    finally
    {
    }
  }

  public final void a()
  {
    close();
    fj.a(this.c);
  }

  public final fh.a b(String paramString)
  {
    return a(paramString, -1L);
  }

  public final boolean c(String paramString)
  {
    while (true)
    {
      try
      {
        g();
        e(paramString);
        fh.b localb = (fh.b)this.l.get(paramString);
        int i1;
        if (localb != null)
        {
          fh.a locala = fh.b.a(localb);
          i1 = 0;
          if (locala == null);
        }
        else
        {
          bool = false;
          return bool;
          this.j -= fh.b.b(localb)[i1];
          fh.b.b(localb)[i1] = 0L;
          i1++;
        }
        if (i1 < this.i)
        {
          File localFile = localb.a(i1);
          if ((!localFile.exists()) || (localFile.delete()))
            continue;
          throw new IOException("failed to delete " + localFile);
        }
      }
      finally
      {
      }
      this.m = (1 + this.m);
      this.k.append("REMOVE " + paramString + '\n');
      this.l.remove(paramString);
      if (f())
        this.b.submit(this.o);
      boolean bool = true;
    }
  }

  public final void close()
  {
    while (true)
    {
      try
      {
        Writer localWriter = this.k;
        if (localWriter == null)
          return;
        Iterator localIterator = new ArrayList(this.l.values()).iterator();
        if (localIterator.hasNext())
        {
          fh.b localb = (fh.b)localIterator.next();
          if (fh.b.a(localb) == null)
            continue;
          fh.b.a(localb).b();
          continue;
        }
      }
      finally
      {
      }
      h();
      this.k.close();
      this.k = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fh
 * JD-Core Version:    0.6.2
 */