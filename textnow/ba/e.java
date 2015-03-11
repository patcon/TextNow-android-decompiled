package textnow.ba;

import android.content.Context;
import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.ei;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import textnow.be.m;

public final class e
{
  public String a = "";
  public String b = "";
  protected int c = 1;
  private File d;
  private String e;
  private String f;
  private long g;
  private int h;
  private List<ba> i;
  private File j;

  public e(JSONObject paramJSONObject, ei paramei)
  {
    this.e = paramJSONObject.getString("tms-xml-url");
    if (this.e.contains("http://data.tmsapi.com/v1/") == true)
      this.c = 2;
    if ((paramei != null) && (paramei.d != null) && (paramei.d.length() > 0))
      this.a = paramei.d;
    Object localObject1 = new Date();
    String str;
    if (paramJSONObject.has("movie-date"))
    {
      str = paramJSONObject.getString("movie-date");
      if ((str == null) || (str.length() <= 0));
    }
    try
    {
      localObject2 = new SimpleDateFormat("yyyy-MM-dd").parse(str);
      boolean bool = ((Date)localObject2).after((Date)localObject1);
      if (bool == true)
      {
        localObject1 = localObject2;
        if (this.c == 2)
        {
          this.b = new SimpleDateFormat("yyyy-MM-dd").format((Date)localObject1);
          this.f = paramJSONObject.getString("template-url");
          if (!paramJSONObject.has("template-crc32"))
            break label295;
          this.g = paramJSONObject.getLong("template-crc32");
          if (!paramJSONObject.has("auto-skip-seconds"))
            break label303;
          this.h = (1000 * paramJSONObject.getInt("auto-skip-seconds"));
          if (paramJSONObject.has("events"))
            break label311;
          this.i = new ArrayList();
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        r.d("Invalid TMS date: " + str);
        continue;
        this.b = new SimpleDateFormat("yyyyMMdd").format((Date)localObject1);
        continue;
        label295: this.g = 0L;
        continue;
        label303: this.h = 0;
        continue;
        label311: JSONArray localJSONArray = paramJSONObject.getJSONArray("events");
        this.i = new ArrayList(localJSONArray.length());
        for (int k = 0; k < localJSONArray.length(); k++)
          this.i.add(new ba(localJSONArray.getJSONObject(k)));
        Object localObject2 = localObject1;
      }
    }
  }

  public final int a()
  {
    return this.h;
  }

  public final ba a(bc parambc)
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      ba localba = (ba)localIterator.next();
      if (localba.a() == parambc)
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
        localFileInputStream = new FileInputStream(this.j);
        localZipInputStream = new ZipInputStream(new BufferedInputStream(localFileInputStream));
        this.d = new File(paramContext.getFilesDir() + "/" + "MovieBoard");
        if (this.d.exists())
          m.a(this.d);
        this.d.mkdir();
        str1 = this.d.getAbsolutePath() + "/";
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
        int k = localZipInputStream.read(arrayOfByte);
        if (k == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, k);
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

  public final void a(File paramFile)
  {
    this.j = paramFile;
  }

  public final String b()
  {
    return this.e;
  }

  public final String c()
  {
    return this.f;
  }

  public final Long d()
  {
    return Long.valueOf(this.g);
  }

  public final void e()
  {
    m.a(this.d);
  }

  public final File f()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ba.e
 * JD-Core Version:    0.6.2
 */