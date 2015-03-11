package textnow.aw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.tremorvideo.sdk.android.videoad.bd;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import textnow.ax.m;

public final class a
{
  public String a;
  private bd b;
  private Context c;
  private boolean d = false;
  private boolean e = false;

  public a(Context paramContext)
  {
    this.c = paramContext;
    if (this.c.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.c.getApplicationContext().getPackageName()) == 0);
    for (this.e = true; ; this.e = false)
    {
      File localFile1 = Environment.getExternalStorageDirectory();
      this.a = (localFile1.getAbsolutePath() + "/tremor/mraid/");
      File localFile2 = new File(this.a);
      if (!localFile2.exists())
        localFile2.mkdirs();
      return;
    }
  }

  private void a(File paramFile)
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

  private String d(String paramString)
  {
    String str1;
    if ("mounted".equals(Environment.getExternalStorageState()))
    {
      this.d = true;
      if ((!this.d) || (!this.e));
    }
    else
    {
      FileInputStream localFileInputStream;
      ZipInputStream localZipInputStream;
      while (true)
      {
        String str2;
        try
        {
          localFileInputStream = new FileInputStream(paramString);
          localZipInputStream = new ZipInputStream(new BufferedInputStream(localFileInputStream));
          str1 = null;
          ZipEntry localZipEntry = localZipInputStream.getNextEntry();
          if (localZipEntry == null)
            break label320;
          str2 = localZipEntry.getName();
          if (!str2.equals("main.js"))
            break label172;
          str1 = "main.html";
          if (!localZipEntry.isDirectory())
            break label188;
          String str3 = this.a;
          File localFile = new File(str3 + str2);
          if (localFile.isDirectory())
            continue;
          localFile.mkdirs();
          continue;
        }
        catch (IOException localIOException)
        {
          r.a(localIOException);
          this.d = false;
          return null;
        }
        this.d = false;
        break;
        label172: if (str2.equals("main.html"))
        {
          str1 = "main.html";
          continue;
          label188: ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          byte[] arrayOfByte = new byte[1024];
          StringBuilder localStringBuilder = new StringBuilder().append(this.a);
          if (str2.equals("main.js"))
            str2 = "main.html";
          FileOutputStream localFileOutputStream = new FileOutputStream(str2);
          while (true)
          {
            int i = localZipInputStream.read(arrayOfByte);
            if (i == -1)
              break;
            localByteArrayOutputStream.write(arrayOfByte, 0, i);
            localByteArrayOutputStream.toByteArray();
            localFileOutputStream.write(localByteArrayOutputStream.toByteArray());
            localByteArrayOutputStream.reset();
          }
          localFileOutputStream.close();
          localZipInputStream.closeEntry();
          localByteArrayOutputStream.close();
        }
      }
      label320: localZipInputStream.close();
      localFileInputStream.close();
    }
    while (true)
    {
      return str1;
      str1 = null;
    }
  }

  public final String a(String paramString)
  {
    return d(paramString);
  }

  public final void a()
  {
    a(new File(this.a));
  }

  public final void a(bd parambd)
  {
    this.b = parambd;
  }

  public final String b(String paramString)
  {
    String str = paramString.substring(1 + paramString.lastIndexOf("/"));
    if (str.endsWith(".js"))
      str = str.replace(".js", ".html");
    File localFile = new File(this.a + str);
    if (localFile.exists())
      localFile.delete();
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    ByteArrayOutputStream localByteArrayOutputStream;
    FileOutputStream localFileOutputStream;
    try
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      localFileOutputStream = new FileOutputStream(localFile);
      HttpGet localHttpGet = new HttpGet(paramString);
      m.a(localHttpGet, paramString);
      HttpEntity localHttpEntity = localDefaultHttpClient.execute(localHttpGet).getEntity();
      if (localHttpEntity != null)
      {
        InputStream localInputStream = localHttpEntity.getContent();
        byte[] arrayOfByte = new byte[4096];
        while (true)
        {
          int i = localInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
          localByteArrayOutputStream.toByteArray();
          localFileOutputStream.write(localByteArrayOutputStream.toByteArray());
          localByteArrayOutputStream.reset();
        }
      }
    }
    catch (Exception localException)
    {
      r.a(localException);
      return str;
    }
    localFileOutputStream.close();
    localByteArrayOutputStream.close();
    return str;
  }

  public final boolean b()
  {
    return (this.d) && (this.e);
  }

  public final void c(String paramString)
  {
    d(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aw.a
 * JD-Core Version:    0.6.2
 */