package textnow.bg;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;
import textnow.be.ah;
import textnow.be.aj;
import textnow.be.ao;
import textnow.be.as;
import textnow.be.at;
import textnow.be.au;
import textnow.be.e;
import textnow.be.m;
import textnow.be.t;
import textnow.be.y;

public final class a extends at
{
  private RelativeLayout.LayoutParams a;
  private boolean b = true;
  private String q = "";
  private String r = "";
  private String s = "";
  private String t = "";
  private String u = "";

  public a(ao paramao)
  {
    super(paramao);
  }

  private static void a(File paramFile)
  {
    if (paramFile.exists());
    while (paramFile.mkdirs())
      return;
    throw new RuntimeException("Can not create dir " + paramFile);
  }

  private void a(ZipFile paramZipFile, ZipEntry paramZipEntry, String paramString, boolean paramBoolean)
  {
    if (paramZipEntry.isDirectory())
      a(new File(paramString, paramZipEntry.getName()));
    File localFile;
    do
    {
      return;
      localFile = new File(paramString, paramZipEntry.getName());
    }
    while ((!paramBoolean) && (localFile.exists()));
    if (!localFile.getParentFile().exists())
      a(localFile.getParentFile());
    r.d("TwitterObjec extracting: " + paramZipEntry);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramZipFile.getInputStream(paramZipEntry));
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
    catch (Exception localException)
    {
      r.a(localException);
      return;
      return;
    }
    finally
    {
      localBufferedOutputStream.close();
      localBufferedInputStream.close();
    }
  }

  private void b(File paramFile)
  {
    if (paramFile.exists())
      return;
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        b(arrayOfFile[j]);
    }
    paramFile.delete();
  }

  public final void a()
  {
  }

  public final void a(ZipFile paramZipFile)
  {
    this.t = paramZipFile.getName();
    if (this.t.contains(".zip"))
      this.t = this.t.replace(".zip", "");
    while (true)
    {
      ZipEntry localZipEntry;
      try
      {
        Enumeration localEnumeration = paramZipFile.entries();
        if (localEnumeration.hasMoreElements())
        {
          localZipEntry = (ZipEntry)localEnumeration.nextElement();
          if (!localZipEntry.getName().startsWith(this.s))
            break label96;
          a(paramZipFile, localZipEntry, this.t, false);
          continue;
        }
      }
      catch (Exception localException)
      {
        r.a(localException);
      }
      return;
      label96: if (localZipEntry.getName().startsWith(this.r))
        a(paramZipFile, localZipEntry, this.t, true);
    }
  }

  public final void a(aj paramaj, long paramLong)
  {
  }

  public final void a(as paramas)
  {
    ah localah = b(paramas, 0L);
    int i = Math.round(paramas.a() / 2.0F + localah.a + this.c);
    int j = Math.round(localah.b + this.d + paramas.b() / 2.0F);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(Math.round(localah.f), Math.round(localah.g));
    localLayoutParams.leftMargin = i;
    localLayoutParams.topMargin = j;
    this.i.e().a(localLayoutParams);
    this.a = localLayoutParams;
    this.i.e().a("file://" + this.t + "/" + this.q, this.u);
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    au localau;
    do
    {
      return;
      localau = a(paramLong);
    }
    while (localau == null);
    ah localah = b(paramas, paramLong);
    b localb1 = (b)localau.a;
    b localb2 = (b)localau.b;
    this.m = localb1.k;
    float f = localau.c;
    if (!localb1.k)
    {
      if (this.b == true)
        this.i.e().u();
      this.b = false;
    }
    while (true)
    {
      int k = m.a(localb1.i, localb2.i, localb1.j, localb2.j, f);
      this.i.e().a(k);
      return;
      int i = Math.round(paramas.a() / 2.0F + localah.a + this.c);
      int j = Math.round(localah.b + this.d + paramas.b() / 2.0F);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(Math.round(localah.f), Math.round(localah.g));
      localLayoutParams.leftMargin = i;
      localLayoutParams.topMargin = j;
      if ((this.a == null) || (!this.b) || (localLayoutParams.leftMargin != this.a.leftMargin) || (localLayoutParams.topMargin != this.a.topMargin) || (localLayoutParams.width != this.a.width) || (localLayoutParams.height != this.a.height))
      {
        this.b = true;
        this.i.e().a(localLayoutParams);
        this.a = localLayoutParams;
      }
    }
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      String str1 = paramy.c();
      JSONObject localJSONObject;
      StringBuilder localStringBuilder;
      if (str1.length() > 0)
      {
        localJSONObject = new JSONObject(str1);
        if (localJSONObject.has("main_page"))
          this.q = localJSONObject.getString("main_page");
        if (localJSONObject.has("path"))
        {
          this.r = localJSONObject.getString("path");
          this.s = this.r;
          if (this.s.endsWith("/"))
            this.s = this.s.substring(0, -1 + this.s.length());
          localStringBuilder = new StringBuilder();
          if (!this.s.contains("/"))
            break label208;
        }
      }
      label208: for (String str2 = this.s.substring(0, this.s.lastIndexOf("/")); ; str2 = this.s)
      {
        this.s = (str2 + "/common");
        if (localJSONObject.has("params"))
          this.u = localJSONObject.getString("params");
        this.j = false;
        this.k = false;
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      b localb1 = (b)localau.a;
      b localb2 = (b)localau.b;
      float f1 = localau.c;
      float f2 = m.b(localb1.a, localb2.a, localb1.b, localb2.b, f1);
      float f3 = m.b(localb1.c, localb2.c, localb1.d, localb2.d, f1);
      float f4 = m.b(localb1.e, localb2.e, localb1.f, localb2.f, f1);
      float f5 = m.b(localb1.g, localb2.g, localb1.h, localb2.h, f1);
      PointF localPointF = t.a(f4, f5, this.e.c());
      paramas.a(f2 - localPointF.x, f3 - localPointF.y, f4, f5, this.n, this.e.c());
      float f6 = paramas.c();
      float f7 = paramas.d();
      float f8 = paramas.e();
      float f9 = paramas.f();
      if (this.e.a() != null)
      {
        ah localah = this.e.a().c(paramas, paramLong);
        float f10 = f6 + localah.a;
        float f11 = f7 + localah.b;
        Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b());
        f6 = f10 + localPoint.x;
        f7 = f11 + localPoint.y;
      }
      RectF localRectF = a(paramas, paramLong, new RectF(f6, f7, f8 + f6, f9 + f7));
      return new ah(localRectF.left, localRectF.top, localRectF.right - localRectF.left, localRectF.bottom - localRectF.top, 1.0F, 1.0F, 0.0F);
    }
    return ah.h;
  }

  public final void b()
  {
    super.b();
    this.b = true;
  }

  public final void c()
  {
    String str = this.r.substring(0, this.r.indexOf("/"));
    b(new File(this.t + "/" + str));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bg.a
 * JD-Core Version:    0.6.2
 */