package textnow.ax;

import android.graphics.Bitmap;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.bd;
import com.tremorvideo.sdk.android.videoad.cv;
import com.tremorvideo.sdk.android.videoad.ei;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import textnow.ay.i;
import textnow.ay.t;
import textnow.az.c;

public final class e
{
  public ei a;
  public boolean b = true;
  private w c = new w();
  private List<ao> d;
  private List<String> e;
  private bm f;
  private int g;
  private int h;
  private boolean i;
  private int j;
  private int k;
  private String l;
  private int m;
  private Bitmap n;
  private k[] o;
  private GregorianCalendar p;
  private String q;
  private bd r;
  private String s;
  private String t;
  private String u;
  private boolean v = false;
  private boolean w = true;
  private c x;
  private i y;

  public final String a()
  {
    return this.t;
  }

  public final String a(int paramInt)
  {
    return (String)this.e.get(paramInt);
  }

  public final void a(float paramFloat)
  {
    if (this.x != null)
      this.x.a(paramFloat);
  }

  public final void a(float paramFloat, int paramInt)
  {
    if (this.y != null)
      this.y.a(paramFloat, paramInt);
  }

  public final void a(RelativeLayout.LayoutParams paramLayoutParams)
  {
    try
    {
      if (this.x != null)
        this.x.a(paramLayoutParams);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(RelativeLayout.LayoutParams paramLayoutParams, int paramInt)
  {
    try
    {
      if (this.y != null)
        this.y.a(paramLayoutParams, paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bd parambd)
  {
    this.r = parambd;
  }

  public final void a(String paramString)
  {
    this.s = paramString;
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.x != null)
      this.x.a(paramString1, paramString2);
  }

  public final void a(String paramString1, String paramString2, int paramInt)
  {
    if (this.y != null)
      this.y.a(paramString1, paramString2, paramInt);
  }

  public final void a(GregorianCalendar paramGregorianCalendar)
  {
    this.p = paramGregorianCalendar;
  }

  public final void a(ZipFile paramZipFile, af paramaf, ei paramei, boolean paramBoolean)
  {
    int i1 = 1;
    ZipEntry localZipEntry1 = paramZipFile.getEntry("data");
    ZipEntry localZipEntry2 = paramZipFile.getEntry("code-android.js");
    if (paramZipFile.getEntry("compatibility") != null)
      this.w = false;
    if (localZipEntry2 == null);
    y localy;
    for (this.l = ""; ; this.l = r.a(paramZipFile.getInputStream(localZipEntry2)))
    {
      localy = new y(paramZipFile.getInputStream(localZipEntry1));
      this.m = localy.a();
      if ((this.m == 5) || (this.m == 4) || (this.m == 3) || (this.m == 2) || (this.m == i1))
        break;
      throw new Exception("Incompatible Version.");
    }
    if (localy.a.readUnsignedByte() == 0)
      i1 = 0;
    this.i = i1;
    localy.a.readUnsignedByte();
    this.j = localy.a.readUnsignedByte();
    this.k = localy.a.readUnsignedByte();
    this.g = localy.a();
    this.h = localy.a();
    this.b = paramBoolean;
    int i2 = localy.a.readUnsignedByte();
    this.e = new ArrayList(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      String str = localy.c();
      if (!this.b)
      {
        if (!str.contains("Ads by Tremor Video:"))
          break label298;
        str = str.replace("Ads by Tremor Video:", "");
      }
      while (true)
      {
        this.e.add(str);
        i3++;
        break;
        label298: if (str.contains("Ads by Tremor Video"))
          str = str.replace("Ads by Tremor Video", "");
      }
    }
    int i4 = paramaf.a(this.g, this.h);
    this.c.a(paramZipFile, paramaf, i4, localy);
    int i5 = localy.a.readUnsignedByte();
    this.d = new ArrayList(i5);
    for (int i6 = 0; i6 < i5; i6++)
    {
      ao localao = new ao(this);
      localao.a(localy, paramZipFile);
      this.d.add(localao);
    }
    this.f = new bm((ao)this.d.get(0));
    this.n = cv.a(textnow.av.a.a);
    this.a = paramei;
    if (this.s != null)
      this.t = m.a(paramZipFile, this.s);
    this.u = m.a(paramZipFile, "comps");
  }

  public final void a(i parami)
  {
    this.y = parami;
  }

  public final void a(c paramc)
  {
    this.x = paramc;
  }

  public final void a(k[] paramArrayOfk)
  {
    this.o = paramArrayOfk;
  }

  public final String b()
  {
    return this.u;
  }

  public final ao b(int paramInt)
  {
    return (ao)this.d.get(paramInt);
  }

  public final void b(String paramString)
  {
    this.q = paramString;
  }

  public final bd c()
  {
    return this.r;
  }

  public final void c(int paramInt)
  {
    try
    {
      if (this.y != null)
        this.y.a(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Bitmap d()
  {
    return this.n;
  }

  public final boolean e()
  {
    return this.w;
  }

  public final void f()
  {
    w localw = this.c;
    Iterator localIterator = localw.a.iterator();
    while (localIterator.hasNext())
      ((Bitmap)localIterator.next()).recycle();
    localw.a.clear();
  }

  public final int g()
  {
    return this.m;
  }

  public final String h()
  {
    return this.l;
  }

  public final boolean i()
  {
    return this.i;
  }

  public final ao j()
  {
    if (this.j == 255)
      return null;
    return (ao)this.d.get(this.j);
  }

  public final ao k()
  {
    if (this.k == 255)
      return null;
    return (ao)this.d.get(this.k);
  }

  public final int l()
  {
    return this.g;
  }

  public final int m()
  {
    return this.h;
  }

  public final bm n()
  {
    return this.f;
  }

  public final k[] o()
  {
    return this.o;
  }

  public final String p()
  {
    return this.q;
  }

  public final GregorianCalendar q()
  {
    return this.p;
  }

  public final w r()
  {
    return this.c;
  }

  public final void s()
  {
    this.v = true;
  }

  public final boolean t()
  {
    return this.v;
  }

  public final void u()
  {
    try
    {
      if (this.x != null)
        this.x.b();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void v()
  {
    if (this.x != null)
      this.x.a();
  }

  public final void w()
  {
    if (this.y != null)
      this.y.a();
  }

  public final void x()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      textnow.az.a locala = ((ao)localIterator.next()).h();
      if (locala != null)
        locala.c();
    }
  }

  public final void y()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      t localt = ((ao)localIterator.next()).j();
      if (localt != null)
        localt.c();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.e
 * JD-Core Version:    0.6.2
 */