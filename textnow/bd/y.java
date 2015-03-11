package textnow.bd;

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

final class y
  implements al
{
  private long a = 52428800L;
  private final aa b;
  private final w c;
  private am d;
  private final Map<String, v> e = new bc(34, 25);
  private final x f = new x()
  {
    public final void a()
    {
      y.c(y.this).a();
    }

    public final void a(String paramAnonymousString)
    {
      y.c(y.this).b(y.a(paramAnonymousString));
    }
  };

  public y(Context paramContext, am paramam)
  {
    this.b = new aa("img", paramContext);
    this.c = new w(paramContext, this.f);
    this.d = paramam;
  }

  // ERROR //
  private static v a(File paramFile)
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
    //   29: new 89	textnow/bd/v
    //   32: dup
    //   33: aload_2
    //   34: getfield 93	android/graphics/BitmapFactory$Options:outWidth	I
    //   37: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: aload_2
    //   41: getfield 102	android/graphics/BitmapFactory$Options:outHeight	I
    //   44: invokestatic 99	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   47: invokespecial 105	textnow/bd/v:<init>	(Ljava/lang/Integer;Ljava/lang/Integer;)V
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
  public final Bitmap a(p paramp, s params)
  {
    // Byte code:
    //   0: aload_2
    //   1: getfield 136	textnow/bd/s:a	Ljava/lang/String;
    //   4: astore_3
    //   5: aload_2
    //   6: getfield 138	textnow/bd/s:b	I
    //   9: istore 4
    //   11: aload_2
    //   12: getfield 141	textnow/bd/s:c	Landroid/graphics/Bitmap$Config;
    //   15: astore 5
    //   17: aload_1
    //   18: invokevirtual 146	textnow/bd/p:f	()Z
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
    //   104: new 169	textnow/bd/z
    //   107: dup
    //   108: invokespecial 170	textnow/bd/z:<init>	()V
    //   111: athrow
    //   112: astore 12
    //   114: new 67	java/io/FileNotFoundException
    //   117: dup
    //   118: ldc 172
    //   120: invokespecial 173	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   123: athrow
    //   124: aload_0
    //   125: aload_3
    //   126: invokespecial 175	textnow/bd/y:b	(Ljava/lang/String;)Ljava/io/File;
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

  public final bo a(final p paramp, final s params, final ba paramba)
  {
    return new u(paramp, new bu(params))
    {
      public final void d()
      {
        Object localObject = null;
        int i = 0;
        try
        {
          Bitmap localBitmap2 = y.this.a(paramp, params);
          localBitmap1 = localBitmap2;
          if (i == 0)
          {
            y.a(y.this).a(params, localBitmap1, paramba);
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
        catch (z localz)
        {
          while (true)
          {
            String str1 = "FileFormatException -- Disk decode failed with error message: " + localz.getMessage();
            i = 1;
            localObject = str1;
            Bitmap localBitmap1 = null;
          }
          if (paramp.f())
          {
            y.b(y.this).remove(params.a);
            y.a(y.this).a(params, localObject);
            return;
          }
          y.c(y.this).b(y.a(params.a));
          y.d(y.this).c(params.a);
          y.a(y.this).a(params, localObject);
        }
      }
    };
  }

  public final void a(String paramString, InputStream paramInputStream)
  {
    this.b.a(paramInputStream, c(paramString));
  }

  public final boolean a(p paramp)
  {
    String str = paramp.a();
    if (paramp.f())
    {
      boolean bool = this.e.containsKey(str);
      if (bool)
        this.e.get(str);
      return bool;
    }
    return this.c.b(str);
  }

  public final int b(p paramp)
  {
    String str = paramp.a();
    v localv;
    if (paramp.f())
      localv = (v)this.e.get(str);
    while (localv == null)
    {
      return -1;
      ac localac = this.c.a(str);
      if (localac != null)
        localv = localac.c();
      else
        localv = null;
    }
    return bv.a(paramp, localv);
  }

  public final bo c(final p paramp)
  {
    return new u(paramp, new bu(paramp.a()))
    {
      public final void d()
      {
        y.this.d(paramp);
      }
    };
  }

  final void d(p paramp)
  {
    String str1 = paramp.a();
    try
    {
      String str2 = paramp.a();
      File localFile;
      v localv;
      if (paramp.f())
      {
        localFile = new File(new URI(str2.replace(" ", "%20")).getPath());
        localv = a(localFile);
        if (!paramp.f())
          break label96;
        this.e.put(str2, localv);
      }
      while (true)
      {
        this.d.a(str1);
        return;
        localFile = b(str2);
        break;
        label96: this.c.a(str2, localFile.length(), localv.a.intValue(), localv.b.intValue());
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.y
 * JD-Core Version:    0.6.2
 */