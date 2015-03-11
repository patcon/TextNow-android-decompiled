package textnow.bk;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Map;

final class z
  implements am
{
  private long a = 52428800L;
  private final ab b;
  private final x c;
  private an d;
  private final Map<String, w> e = new bd(34, 25);
  private final y f = new y()
  {
    public final void a()
    {
      z.c(z.this).a();
    }

    public final void a(String paramAnonymousString)
    {
      z.c(z.this).b(z.a(paramAnonymousString));
    }
  };

  public z(Context paramContext, an paraman)
  {
    this.b = new ab("img", paramContext);
    this.c = new x(paramContext, this.f);
    this.d = paraman;
  }

  // ERROR //
  private static w a(File paramFile)
  {
    // Byte code:
    //   0: new 71	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 74	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_1
    //   9: new 76	android/graphics/BitmapFactory$Options
    //   12: dup
    //   13: invokespecial 77	android/graphics/BitmapFactory$Options:<init>	()V
    //   16: astore_2
    //   17: aload_2
    //   18: iconst_1
    //   19: putfield 81	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   22: aload_1
    //   23: aconst_null
    //   24: aload_2
    //   25: invokestatic 87	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   28: pop
    //   29: new 89	textnow/bk/w
    //   32: dup
    //   33: aload_2
    //   34: getfield 93	android/graphics/BitmapFactory$Options:outWidth	I
    //   37: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: aload_2
    //   41: getfield 102	android/graphics/BitmapFactory$Options:outHeight	I
    //   44: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   47: invokespecial 105	textnow/bk/w:<init>	(Ljava/lang/Integer;Ljava/lang/Integer;)V
    //   50: astore 7
    //   52: aload_1
    //   53: invokevirtual 108	java/io/FileInputStream:close	()V
    //   56: aload 7
    //   58: areturn
    //   59: astore_3
    //   60: aconst_null
    //   61: astore_1
    //   62: aload_3
    //   63: invokevirtual 111	java/io/FileNotFoundException:printStackTrace	()V
    //   66: aload_3
    //   67: athrow
    //   68: astore 4
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 108	java/io/FileInputStream:close	()V
    //   78: aload 4
    //   80: athrow
    //   81: astore 8
    //   83: aload 7
    //   85: areturn
    //   86: astore 5
    //   88: goto -10 -> 78
    //   91: astore 4
    //   93: aconst_null
    //   94: astore_1
    //   95: goto -25 -> 70
    //   98: astore_3
    //   99: goto -37 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   0	9	59	java/io/FileNotFoundException
    //   9	52	68	finally
    //   62	68	68	finally
    //   52	56	81	java/io/IOException
    //   74	78	86	java/io/IOException
    //   0	9	91	finally
    //   9	52	98	java/io/FileNotFoundException
  }

  private File b(String paramString)
  {
    return this.b.a(c(paramString));
  }

  private static String c(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return null;
  }

  // ERROR //
  public final Bitmap a(q paramq, t paramt)
  {
    // Byte code:
    //   0: aload_2
    //   1: getfield 136	textnow/bk/t:a	Ljava/lang/String;
    //   4: astore_3
    //   5: aload_2
    //   6: getfield 138	textnow/bk/t:b	I
    //   9: istore 4
    //   11: aload_2
    //   12: getfield 141	textnow/bk/t:c	Landroid/graphics/Bitmap$Config;
    //   15: astore 5
    //   17: aload_1
    //   18: invokevirtual 146	textnow/bk/q:f	()Z
    //   21: ifeq +103 -> 124
    //   24: new 148	java/io/File
    //   27: dup
    //   28: new 150	java/net/URI
    //   31: dup
    //   32: aload_3
    //   33: invokespecial 153	java/net/URI:<init>	(Ljava/lang/String;)V
    //   36: invokevirtual 157	java/net/URI:getPath	()Ljava/lang/String;
    //   39: invokespecial 158	java/io/File:<init>	(Ljava/lang/String;)V
    //   42: astore 6
    //   44: new 71	java/io/FileInputStream
    //   47: dup
    //   48: aload 6
    //   50: invokespecial 74	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   53: astore 7
    //   55: new 76	android/graphics/BitmapFactory$Options
    //   58: dup
    //   59: invokespecial 77	android/graphics/BitmapFactory$Options:<init>	()V
    //   62: astore 8
    //   64: aload 8
    //   66: iload 4
    //   68: putfield 161	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   71: aload 8
    //   73: aload 5
    //   75: putfield 164	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   78: aload 7
    //   80: aconst_null
    //   81: aload 8
    //   83: invokestatic 87	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   86: astore 9
    //   88: aload 7
    //   90: invokevirtual 108	java/io/FileInputStream:close	()V
    //   93: aload 9
    //   95: ifnonnull +49 -> 144
    //   98: aload 6
    //   100: invokevirtual 167	java/io/File:delete	()Z
    //   103: pop
    //   104: new 169	textnow/bk/aa
    //   107: dup
    //   108: invokespecial 170	textnow/bk/aa:<init>	()V
    //   111: athrow
    //   112: astore 12
    //   114: new 67	java/io/FileNotFoundException
    //   117: dup
    //   118: ldc 172
    //   120: invokespecial 173	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   123: athrow
    //   124: aload_0
    //   125: aload_3
    //   126: invokespecial 175	textnow/bk/z:b	(Ljava/lang/String;)Ljava/io/File;
    //   129: astore 6
    //   131: goto -87 -> 44
    //   134: astore 10
    //   136: aload 10
    //   138: invokevirtual 176	java/io/IOException:printStackTrace	()V
    //   141: goto -48 -> 93
    //   144: aload 9
    //   146: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   24	44	112	java/net/URISyntaxException
    //   88	93	134	java/io/IOException
  }

  public final bq a(final q paramq, final t paramt, final bb parambb)
  {
    return new v(paramq, new bw(paramt))
    {
      public final void d()
      {
        Object localObject = null;
        int i = 0;
        try
        {
          Bitmap localBitmap2 = z.this.a(paramq, paramt);
          localBitmap1 = localBitmap2;
          if (i == 0)
          {
            z.a(z.this).a(paramt, localBitmap1, parambb);
            return;
          }
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          while (true)
          {
            String str2 = "FileNotFoundException -- Disk decode failed with error message: " + localFileNotFoundException.getMessage();
            i = 1;
            localObject = str2;
            localBitmap1 = null;
          }
        }
        catch (aa localaa)
        {
          while (true)
          {
            String str1 = "FileFormatException -- Disk decode failed with error message: " + localaa.getMessage();
            i = 1;
            localObject = str1;
            Bitmap localBitmap1 = null;
          }
          if (paramq.f())
          {
            z.b(z.this).remove(paramt.a);
            z.a(z.this).a(paramt, localObject);
            return;
          }
          z.c(z.this).b(z.a(paramt.a));
          z.d(z.this).c(paramt.a);
          z.a(z.this).a(paramt, localObject);
        }
      }
    };
  }

  public final void a(String paramString, InputStream paramInputStream)
  {
    this.b.a(paramInputStream, c(paramString));
  }

  public final boolean a(q paramq)
  {
    String str = paramq.a();
    if (paramq.f())
    {
      boolean bool = this.e.containsKey(str);
      if (bool)
        this.e.get(str);
      return bool;
    }
    return this.c.b(str);
  }

  public final int b(q paramq)
  {
    String str = paramq.a();
    w localw;
    if (paramq.f())
      localw = (w)this.e.get(str);
    while (localw == null)
    {
      return -1;
      ad localad = this.c.a(str);
      if (localad != null)
        localw = localad.c();
      else
        localw = null;
    }
    return bx.a(paramq, localw);
  }

  public final bq c(final q paramq)
  {
    return new v(paramq, new bw(paramq.a()))
    {
      public final void d()
      {
        z.this.d(paramq);
      }
    };
  }

  final void d(q paramq)
  {
    String str1 = paramq.a();
    try
    {
      String str2 = paramq.a();
      File localFile;
      w localw;
      if (paramq.f())
      {
        localFile = new File(new URI(str2.replace(" ", "%20")).getPath());
        localw = a(localFile);
        if (!paramq.f())
          break label96;
        this.e.put(str2, localw);
      }
      while (true)
      {
        this.d.a(str1);
        return;
        localFile = b(str2);
        break;
        label96: this.c.a(str2, localFile.length(), localw.a.intValue(), localw.b.intValue());
        this.c.a(this.a);
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      this.d.a(str1, "URISyntaxException caught when attempting to retrieve image details. URI: " + str1);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      this.d.a(str1, "Image file not found. URI: " + str1);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.z
 * JD-Core Version:    0.6.2
 */