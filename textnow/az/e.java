package textnow.az;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import textnow.be.m;

public final class e
{
  private File a;
  private String b;
  private String c;
  private long d;
  private int e;
  private List<ba> f;
  private File g;
  private File h;
  private l i;

  public e(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getString("xml-url");
    this.c = paramJSONObject.getString("template-url");
    if (paramJSONObject.has("template-crc32"))
    {
      this.d = paramJSONObject.getLong("template-crc32");
      if (!paramJSONObject.has("auto-skip-seconds"))
        break label97;
      this.e = (1000 * paramJSONObject.getInt("auto-skip-seconds"));
      label68: if (paramJSONObject.has("events"))
        break label105;
      this.f = new ArrayList();
    }
    while (true)
    {
      return;
      this.d = 0L;
      break;
      label97: this.e = 0;
      break label68;
      label105: JSONArray localJSONArray = paramJSONObject.getJSONArray("events");
      this.f = new ArrayList(localJSONArray.length());
      while (j < localJSONArray.length())
      {
        this.f.add(new ba(localJSONArray.getJSONObject(j)));
        j++;
      }
    }
  }

  public final int a()
  {
    return this.e;
  }

  public final ba a(bc parambc)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      ba localba = (ba)localIterator.next();
      if (localba.a() == parambc)
        return localba;
    }
    return null;
  }

  public final ba a(String paramString)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      ba localba = (ba)localIterator.next();
      if (localba.a().toString().equals(paramString))
        return localba;
    }
    return null;
  }

  public final void a(Context paramContext)
  {
    FileInputStream localFileInputStream;
    ZipInputStream localZipInputStream;
    while (true)
    {
      String str1;
      String str2;
      try
      {
        localFileInputStream = new FileInputStream(this.h);
        localZipInputStream = new ZipInputStream(new BufferedInputStream(localFileInputStream));
        this.a = new File(paramContext.getFilesDir() + "/" + "BuyItNow");
        if (this.a.exists())
          m.a(this.a);
        this.a.mkdir();
        str1 = this.a.getAbsolutePath() + "/";
        ZipEntry localZipEntry = localZipInputStream.getNextEntry();
        if (localZipEntry == null)
          break;
        str2 = localZipEntry.getName();
        if (localZipEntry.isDirectory())
        {
          File localFile1 = new File(str1 + str2);
          if (localFile1.isDirectory())
            continue;
          localFile1.mkdirs();
          continue;
        }
      }
      catch (IOException localIOException)
      {
        r.a(localIOException);
        return;
      }
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      File localFile2 = new File(str1 + str2);
      if (!localFile2.exists())
        localFile2.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(str1 + str2);
      while (true)
      {
        int j = localZipInputStream.read(arrayOfByte);
        if (j == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, j);
        localByteArrayOutputStream.toByteArray();
        localFileOutputStream.write(localByteArrayOutputStream.toByteArray());
        localByteArrayOutputStream.reset();
      }
      localFileOutputStream.close();
      localZipInputStream.closeEntry();
      localByteArrayOutputStream.close();
    }
    localZipInputStream.close();
    localFileInputStream.close();
  }

  public final void a(Context paramContext, n paramn)
  {
    this.i = new l(paramContext, paramn);
    File localFile = new File(this.a.getAbsolutePath() + "/index.html");
    WebSettings localWebSettings = this.i.getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setAllowFileAccess(true);
    if (Build.VERSION.SDK_INT >= 16)
      localWebSettings.setAllowFileAccessFromFileURLs(true);
    this.i.loadUrl("file://" + localFile.getAbsolutePath());
  }

  public final void a(File paramFile)
  {
    this.g = paramFile;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(File paramFile)
  {
    this.h = paramFile;
  }

  public final String c()
  {
    return this.c;
  }

  public final Long d()
  {
    return Long.valueOf(this.d);
  }

  public final void e()
  {
    File localFile = new File(this.a + "/source.xml");
    FileInputStream localFileInputStream;
    FileOutputStream localFileOutputStream;
    try
    {
      localFileInputStream = new FileInputStream(this.g);
      localFileOutputStream = new FileOutputStream(localFile);
      byte[] arrayOfByte = new byte[1048576];
      while (true)
      {
        int j = localFileInputStream.read(arrayOfByte, 0, 1048576);
        if (j == -1)
          break;
        localFileOutputStream.write(arrayOfByte, 0, j);
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    localFileInputStream.close();
    localFileOutputStream.close();
  }

  public final void f()
  {
    if (this.i != null)
    {
      this.i.destroy();
      this.i = null;
      System.gc();
    }
  }

  public final void g()
  {
    m.a(this.a);
    f();
  }

  public final File h()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.az.e
 * JD-Core Version:    0.6.2
 */