package textnow.ay;

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
import textnow.ax.ah;
import textnow.ax.aj;
import textnow.ax.ao;
import textnow.ax.as;
import textnow.ax.at;
import textnow.ax.au;
import textnow.ax.e;
import textnow.ax.m;
import textnow.ax.y;

public final class t extends at
{
  private RelativeLayout.LayoutParams a;
  private boolean b = true;
  private String q = "";
  private String r = "";
  private String s = "";
  private String t = "";
  private String u = "";

  public t(ao paramao)
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
      String str;
      try
      {
        Enumeration localEnumeration = paramZipFile.entries();
        if (localEnumeration.hasMoreElements())
        {
          localZipEntry = (ZipEntry)localEnumeration.nextElement();
          if (!localZipEntry.getName().startsWith(this.r))
            continue;
          str = this.t;
          if (!localZipEntry.isDirectory())
            break label115;
          a(new File(str, localZipEntry.getName()));
          continue;
        }
      }
      catch (Exception localException1)
      {
        r.a(localException1);
      }
      return;
      label115: File localFile = new File(str, localZipEntry.getName());
      if (!localFile.getParentFile().exists())
        a(localFile.getParentFile());
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
  }

  public final void a(aj paramaj, long paramLong)
  {
  }

  public final void a(as paramas, int paramInt)
  {
    ah localah = b(paramas, 0L);
    int i = Math.round(paramas.a() / 2.0F + localah.a + this.c);
    int j = Math.round(localah.b + this.d + paramas.b() / 2.0F);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(Math.round(localah.f), Math.round(localah.g));
    localLayoutParams.leftMargin = i;
    localLayoutParams.topMargin = j;
    String str = "file://" + this.t + "/" + this.q;
    r.d("localWebURL=" + str);
    r.d("_pageParams=" + this.u);
    this.i.e().a(str, this.u, paramInt);
    this.i.e().a(localLayoutParams, paramInt);
    this.a = localLayoutParams;
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
    u localu1 = (u)localau.a;
    u localu2 = (u)localau.b;
    float f = localau.c;
    this.m = localu1.k;
    if (localu1.k)
    {
      ah localah = b(paramas, paramLong);
      int i = Math.round(paramas.a() / 2.0F + localah.a + this.c);
      int j = Math.round(localah.b + this.d + paramas.b() / 2.0F);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(Math.round(localah.f), Math.round(localah.g));
      localLayoutParams.leftMargin = i;
      localLayoutParams.topMargin = j;
      this.b = true;
      this.i.e().a(localLayoutParams, f());
      this.a = localLayoutParams;
      int k = m.a(localu1.i, localu2.i, localu1.j, localu2.j, f);
      this.i.e().a(k, f());
      return;
    }
    if (this.b == true)
      this.i.e().c(f());
    this.b = false;
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      String str = paramy.c();
      if (str.length() > 0)
      {
        JSONObject localJSONObject = new JSONObject(str);
        if ((localJSONObject.has("zip_path")) && (localJSONObject.has("index_file")))
        {
          this.q = (localJSONObject.getString("zip_path") + localJSONObject.getString("index_file"));
          this.r = this.q.substring(0, 1 + this.q.indexOf("/"));
          this.i.e().a(this.r);
        }
        if (localJSONObject.has("params"))
          this.u = localJSONObject.getString("params");
      }
      this.j = false;
      this.k = false;
      return;
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
      u localu1 = (u)localau.a;
      u localu2 = (u)localau.b;
      float f1 = localau.c;
      float f2 = m.b(localu1.a, localu2.a, localu1.b, localu2.b, f1);
      float f3 = m.b(localu1.c, localu2.c, localu1.d, localu2.d, f1);
      float f4 = m.b(localu1.e, localu2.e, localu1.f, localu2.f, f1);
      float f5 = m.b(localu1.g, localu2.g, localu1.h, localu2.h, f1);
      PointF localPointF = textnow.ax.t.a(f4, f5, this.e.c());
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
        Point localPoint = textnow.ax.t.a(Math.round(localah.f), Math.round(localah.g), this.e.b());
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.t
 * JD-Core Version:    0.6.2
 */