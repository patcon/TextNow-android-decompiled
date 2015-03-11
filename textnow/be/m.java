package textnow.be;

import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

public final class m
{
  public static int a = 0;

  private static float a(int paramInt1, int paramInt2, float paramFloat)
  {
    if ((paramInt1 & 0x2) == 2)
      if ((paramInt2 & 0x1) == 1)
        paramFloat = (float)(1.0D - Math.cos(3.141592653589793D * paramFloat)) / 2.0F;
    while ((paramInt2 & 0x1) != 1)
    {
      return paramFloat;
      return (float)-Math.cos(1.570796326794897D + 1.570796326794897D * paramFloat);
    }
    return 1.0F - (float)Math.cos(3.141592653589793D * paramFloat / 2.0D);
  }

  public static int a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3)
  {
    float f = a(paramInt1, paramInt2, paramFloat3);
    return Math.round(paramFloat1 * (1.0F - f) + f * paramFloat2);
  }

  public static int a(String paramString)
  {
    int i = 5381;
    for (int j = 0; j < paramString.length(); j++)
      i = i + (i << 5) + paramString.charAt(j);
    return i;
  }

  public static String a(String paramString, boolean paramBoolean)
  {
    Object localObject = Boolean.valueOf(false);
    try
    {
      String str = new URI(paramString).getHost();
      if ((str != null) && (str.toLowerCase().contains("scanscout.com")))
      {
        Boolean localBoolean = Boolean.valueOf(true);
        localObject = localBoolean;
      }
      switch (a)
      {
      default:
      case 0:
        do
          return null;
        while ((!paramBoolean) && (!((Boolean)localObject).booleanValue()));
        return r.w();
      case 1:
        if ((paramBoolean) || (((Boolean)localObject).booleanValue()))
          return r.w();
        return r.v();
      case 2:
        label45: return r.v();
      case 3:
      }
      return r.w();
    }
    catch (URISyntaxException localURISyntaxException)
    {
      break label45;
    }
  }

  public static String a(ZipFile paramZipFile, String paramString)
  {
    String str;
    while (true)
    {
      ZipEntry localZipEntry;
      try
      {
        str = paramZipFile.getName();
        if (str.contains(".zip"))
          str = str.replace(".zip", "");
        Enumeration localEnumeration = paramZipFile.entries();
        if (!localEnumeration.hasMoreElements())
          break;
        localZipEntry = (ZipEntry)localEnumeration.nextElement();
        if (!localZipEntry.getName().startsWith(paramString))
          continue;
        if (localZipEntry.isDirectory())
        {
          c(new File(str, localZipEntry.getName()));
          continue;
        }
      }
      catch (Exception localException1)
      {
        r.a(localException1);
        return null;
      }
      File localFile = new File(str, localZipEntry.getName());
      if (!localFile.getParentFile().exists())
        c(localFile.getParentFile());
      r.d("GenericObjec extracting: " + localZipEntry);
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramZipFile.getInputStream(localZipEntry));
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(localFile));
      try
      {
        byte[] arrayOfByte = new byte[1024];
        while (true)
        {
          int i = localBufferedInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          localBufferedOutputStream.write(arrayOfByte, 0, i);
        }
      }
      catch (Exception localException2)
      {
        r.a(localException2);
        localBufferedOutputStream.close();
        localBufferedInputStream.close();
        continue;
        localBufferedOutputStream.close();
        localBufferedInputStream.close();
      }
      finally
      {
        localBufferedOutputStream.close();
        localBufferedInputStream.close();
      }
    }
    return str;
  }

  public static void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        a(arrayOfFile[j]);
    }
    paramFile.delete();
  }

  public static void a(HttpGet paramHttpGet, String paramString)
  {
    String str = a(paramString, false);
    if (str != null)
      paramHttpGet.setHeader("User-Agent", str);
  }

  public static void a(HttpPost paramHttpPost, String paramString)
  {
    String str = a(paramString, false);
    if (str != null)
      paramHttpPost.setHeader("User-Agent", str);
  }

  public static float b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3)
  {
    float f = a(paramInt1, paramInt2, paramFloat3);
    return paramFloat1 * (1.0F - f) + f * paramFloat2;
  }

  public static String b(File paramFile)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    BufferedReader localBufferedReader;
    try
    {
      localBufferedReader = new BufferedReader(new FileReader(paramFile));
      try
      {
        while (true)
        {
          String str = localBufferedReader.readLine();
          if (str == null)
            break;
          localStringBuilder.append(str);
          localStringBuilder.append(System.getProperty("line.separator"));
        }
      }
      finally
      {
        localBufferedReader.close();
      }
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
    while (true)
    {
      return localStringBuilder.toString();
      localBufferedReader.close();
    }
  }

  // ERROR //
  public static String b(String paramString)
  {
    // Byte code:
    //   0: new 122	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 238	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_1
    //   9: aload_1
    //   10: invokevirtual 139	java/io/File:exists	()Z
    //   13: ifne +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: new 141	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   25: astore_2
    //   26: new 217	java/io/BufferedReader
    //   29: dup
    //   30: new 219	java/io/FileReader
    //   33: dup
    //   34: aload_1
    //   35: invokespecial 220	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   38: invokespecial 223	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   41: astore_3
    //   42: aload_3
    //   43: invokevirtual 226	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   46: astore 8
    //   48: aload 8
    //   50: ifnull +33 -> 83
    //   53: aload_2
    //   54: aload 8
    //   56: invokevirtual 149	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: goto -18 -> 42
    //   63: astore 6
    //   65: aload 6
    //   67: invokevirtual 241	java/lang/Exception:printStackTrace	()V
    //   70: aload_3
    //   71: ifnull +7 -> 78
    //   74: aload_3
    //   75: invokevirtual 235	java/io/BufferedReader:close	()V
    //   78: aload_2
    //   79: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: areturn
    //   83: aload_3
    //   84: invokevirtual 235	java/io/BufferedReader:close	()V
    //   87: goto -9 -> 78
    //   90: astore 10
    //   92: aload 10
    //   94: invokevirtual 242	java/io/IOException:printStackTrace	()V
    //   97: goto -19 -> 78
    //   100: astore 7
    //   102: aload 7
    //   104: invokevirtual 242	java/io/IOException:printStackTrace	()V
    //   107: goto -29 -> 78
    //   110: astore 12
    //   112: aconst_null
    //   113: astore_3
    //   114: aload 12
    //   116: astore 4
    //   118: aload_3
    //   119: ifnull +7 -> 126
    //   122: aload_3
    //   123: invokevirtual 235	java/io/BufferedReader:close	()V
    //   126: aload 4
    //   128: athrow
    //   129: astore 5
    //   131: aload 5
    //   133: invokevirtual 242	java/io/IOException:printStackTrace	()V
    //   136: goto -10 -> 126
    //   139: astore 4
    //   141: goto -23 -> 118
    //   144: astore 11
    //   146: aload 11
    //   148: astore 6
    //   150: aconst_null
    //   151: astore_3
    //   152: goto -87 -> 65
    //
    // Exception table:
    //   from	to	target	type
    //   42	48	63	java/lang/Exception
    //   53	60	63	java/lang/Exception
    //   83	87	90	java/io/IOException
    //   74	78	100	java/io/IOException
    //   26	42	110	finally
    //   122	126	129	java/io/IOException
    //   42	48	139	finally
    //   53	60	139	finally
    //   65	70	139	finally
    //   26	42	144	java/lang/Exception
  }

  public static String c(String paramString)
  {
    return a(paramString, false);
  }

  private static void c(File paramFile)
  {
    if (paramFile.exists());
    while (paramFile.mkdirs())
      return;
    throw new RuntimeException("Can not create dir " + paramFile);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.m
 * JD-Core Version:    0.6.2
 */