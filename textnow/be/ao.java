package textnow.be;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;
import textnow.bf.t;
import textnow.bg.a;

public final class ao
{
  private int a;
  private long b;
  private ab c;
  private List<at> d;
  private e e;
  private ar f;
  private ap g;
  private Object h;
  private int i;
  private aq j;

  public ao(e parame)
  {
    this.e = parame;
    this.c = new ab();
  }

  private void a(as paramas, at paramat, long paramLong, aa paramaa)
  {
    if ((!paramas.g) && (paramat.e()));
    while (!a(paramat))
      return;
    if ((paramaa != null) && (paramat == paramaa.b()))
    {
      paramaa.a(paramas);
      return;
    }
    paramat.a(paramas, paramLong);
  }

  private boolean a(at paramat)
  {
    return (this.e.t()) || (!(paramat instanceof br));
  }

  private int k()
  {
    for (int k = 0; ; k++)
    {
      int m = this.d.size();
      int n = 0;
      if (k < m)
      {
        if ((this.d.get(k) instanceof i))
          n = k + 1;
      }
      else
        return n;
    }
  }

  public final Rect a(as paramas, long paramLong)
  {
    Rect localRect = new Rect(0, 0, 0, 0);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      ah localah = ((at)localIterator.next()).c(paramas, paramLong);
      localRect.left = Math.min(localRect.left, Math.round(localah.a));
      localRect.top = Math.min(localRect.top, Math.round(localah.b));
      localRect.right = Math.max(localRect.right, Math.round(localah.a + localah.f));
      localRect.bottom = Math.max(localRect.bottom, Math.round(localah.b + localah.g));
    }
    return localRect;
  }

  public final ac a(ae paramae)
  {
    return this.c.a(paramae);
  }

  public final ac a(as paramas, int paramInt1, int paramInt2, long paramLong)
  {
    int k;
    int m;
    label38: int n;
    if (this.e.g() > 1)
    {
      k = -1;
      if (this.e.g() <= 1)
        break label215;
      m = -1 + this.d.size();
      if (this.e.g() <= 1)
        break label221;
      n = -1;
    }
    while (true)
    {
      if (m == n)
        break label251;
      at localat = (at)this.d.get(m);
      if ((localat.i()) && (a(localat)) && (localat.d(localat.m) == true))
      {
        ah localah = localat.c(paramas, paramLong);
        if ((localah.a < paramInt1) && (localah.b < paramInt2) && (localah.f + localah.a >= paramInt1) && (localah.g + localah.b >= paramInt2))
        {
          int i1 = Math.round(paramInt1 - localah.a);
          Math.round(paramInt2 - localah.b);
          if (localat.a(i1))
          {
            return null;
            k = 1;
            break;
            label215: m = 0;
            break label38;
            label221: n = this.d.size();
            continue;
          }
          return localat.k();
        }
      }
      m += k;
    }
    label251: return null;
  }

  public final at a(int paramInt)
  {
    if (paramInt == 254)
      return this.e.n();
    return (at)this.d.get(paramInt);
  }

  public final void a()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((at)localIterator.next()).b();
  }

  public final void a(aj paramaj, long paramLong)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      ((at)localIterator.next()).a(paramaj, paramLong);
  }

  public final void a(as paramas, long paramLong, aa paramaa)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
      a(paramas, (at)localIterator.next(), paramLong, null);
  }

  public final void a(y paramy, ZipFile paramZipFile)
  {
    int n;
    while (true)
    {
      Object localObject;
      try
      {
        this.a = paramy.a();
        this.f = ar.values()[paramy.a.readUnsignedByte()];
        this.b = paramy.a();
        this.j = aq.values()[paramy.a.readUnsignedByte()];
        this.i = paramy.a.readUnsignedByte();
        if (this.i == 255)
          this.i = -1;
        this.g = ap.values()[paramy.a.readUnsignedByte()];
        if (this.g == ap.b)
        {
          this.h = new Integer(paramy.a());
          this.c.a(paramy, this.e.g());
          int k = paramy.a.readUnsignedByte();
          this.d = new ArrayList(k);
          int m = 0;
          if (m < k)
          {
            n = paramy.a();
            if (n != 308075814)
              break label297;
            localObject = new bi(this);
            ((at)localObject).a(paramy);
            if ((localObject instanceof a))
              ((a)localObject).a(paramZipFile);
            if ((localObject instanceof t))
              ((t)localObject).a(paramZipFile);
            this.d.add(localObject);
            m++;
            continue;
          }
        }
        else
        {
          if (this.g != ap.c)
            continue;
          this.h = new Integer(paramy.a.readUnsignedByte());
          continue;
        }
      }
      catch (Exception localException)
      {
        r.d("Scene:load Exception =" + localException);
      }
      return;
      label297: if (n == 1441378760)
      {
        localObject = new f(this);
      }
      else if (n == 1430499683)
      {
        localObject = new az(this);
      }
      else if (n == 1440879594)
      {
        localObject = new bf(this);
      }
      else if (n == 319580241)
      {
        localObject = new bk(this);
      }
      else if (n == 1312804287)
      {
        localObject = new aw(this);
      }
      else if (n == 323352250)
      {
        localObject = new i(this);
      }
      else if (n == 2057701471)
      {
        localObject = new bc(this);
      }
      else if (n == 1654336090)
      {
        localObject = new br(this);
      }
      else if (n == 964050621)
      {
        localObject = new a(this);
      }
      else if (n == 2756143)
      {
        localObject = new t(this);
      }
      else if (n == 14608462)
      {
        localObject = new bn(this);
      }
      else
      {
        if (n != 2570398)
          break;
        localObject = new t(this);
      }
    }
    throw new Exception("Loading Scene Object: Unknown type: " + n);
  }

  public final long b()
  {
    return this.b;
  }

  public final RectF b(as paramas, long paramLong)
  {
    RectF localRectF = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      ah localah = ((at)localIterator.next()).c(paramas, paramLong);
      localRectF.left = Math.min(localRectF.left, localah.a);
      localRectF.top = Math.min(localRectF.top, localah.b);
      localRectF.right = Math.max(localRectF.right, localah.a + localah.f);
      localRectF.bottom = Math.max(localRectF.bottom, localah.b + localah.g);
    }
    return localRectF;
  }

  public final ac b(as paramas, int paramInt1, int paramInt2, long paramLong)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.j()) && (localat.d(localat.m) == true))
      {
        ah localah = localat.c(paramas, paramLong);
        boolean bool1 = localah.a < paramInt1;
        boolean bool2 = false;
        if (bool1)
        {
          boolean bool3 = localah.b < paramInt2;
          bool2 = false;
          if (bool3)
          {
            boolean bool4 = localah.f + localah.a < paramInt1;
            bool2 = false;
            if (!bool4)
            {
              boolean bool5 = localah.g + localah.b < paramInt2;
              bool2 = false;
              if (!bool5)
                bool2 = true;
            }
          }
        }
        localat.b(bool2);
      }
    }
    return null;
  }

  public final void b(as paramas, long paramLong, aa paramaa)
  {
    if (this.g == ap.b)
    {
      Paint localPaint1 = new Paint();
      localPaint1.setColor(((Integer)this.h).intValue());
      int k = Math.round(paramas.a() / -2.0F);
      int m = Math.round(paramas.b() / -2.0F);
      int n = -k;
      int i1 = -m;
      paramas.a.drawRect(k, m, n, i1, localPaint1);
    }
    while (true)
    {
      int i2 = k();
      for (int i3 = 0; i3 < i2; i3++)
        a(paramas, (at)this.d.get(i3), paramLong, paramaa);
      if (this.g == ap.c)
      {
        Bitmap localBitmap = this.e.r().a(((Integer)this.h).intValue());
        Rect localRect1 = new Rect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
        Rect localRect2 = new Rect(Math.round(paramas.a() / -2.0F), Math.round(paramas.b() / -2.0F), Math.round(paramas.a() / 2.0F), Math.round(paramas.b() / 2.0F));
        Paint localPaint2 = new Paint();
        localPaint2.setFilterBitmap(true);
        paramas.a.drawBitmap(localBitmap, localRect1, localRect2, localPaint2);
      }
    }
  }

  public final List<at> c()
  {
    return this.d;
  }

  public final ac c(as paramas, int paramInt1, int paramInt2, long paramLong)
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat.j()) && (localat.d(localat.m) == true))
      {
        ah localah = localat.c(paramas, paramLong);
        boolean bool1 = localah.a < paramInt1;
        boolean bool2 = false;
        if (bool1)
        {
          boolean bool3 = localah.b < paramInt2;
          bool2 = false;
          if (bool3)
          {
            boolean bool4 = localah.f + localah.a < paramInt1;
            bool2 = false;
            if (!bool4)
            {
              boolean bool5 = localah.g + localah.b < paramInt2;
              bool2 = false;
              if (!bool5)
                bool2 = true;
            }
          }
        }
        localat.c(bool2);
      }
    }
    return null;
  }

  public final void c(as paramas, long paramLong, aa paramaa)
  {
    for (int k = k(); k < this.d.size(); k++)
      a(paramas, (at)this.d.get(k), paramLong, paramaa);
  }

  public final ac d(as paramas, int paramInt1, int paramInt2, long paramLong)
  {
    int k;
    int m;
    label38: int n;
    label52: int i1;
    label56: at localat;
    if (this.e.g() > 1)
    {
      k = -1;
      if (this.e.g() <= 1)
        break label201;
      m = -1 + this.d.size();
      if (this.e.g() <= 1)
        break label207;
      n = -1;
      i1 = m;
      if (i1 == n)
        break label231;
      localat = (at)this.d.get(i1);
      if ((!localat.i()) || (!a(localat)) || (!localat.d(localat.m)))
        break label221;
      ah localah = localat.c(paramas, paramLong);
      if ((localah.a >= paramInt1) || (localah.b >= paramInt2) || (localah.f + localah.a < paramInt1) || (localah.g + localah.b < paramInt2))
        break label233;
    }
    label201: label207: label221: label231: label233: for (boolean bool = true; ; bool = false)
    {
      ac localac = localat.a(bool);
      if (localac != null)
      {
        return localac;
        k = 1;
        break;
        m = 0;
        break label38;
        n = this.d.size();
        break label52;
      }
      i1 += k;
      break label56;
      return null;
    }
  }

  public final aq d()
  {
    return this.j;
  }

  public final e e()
  {
    return this.e;
  }

  public final int f()
  {
    return this.i;
  }

  public final ab g()
  {
    return this.c;
  }

  public final a h()
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat instanceof a))
        return (a)localat;
    }
    return null;
  }

  public final ArrayList<t> i()
  {
    ArrayList localArrayList = new ArrayList(2);
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      at localat = (at)localIterator.next();
      if ((localat instanceof t))
        localArrayList.add((t)localat);
    }
    return localArrayList;
  }

  public final t j()
  {
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        at localat = (at)localIterator.next();
        if ((localat instanceof t))
          return (t)localat;
      }
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.ao
 * JD-Core Version:    0.6.2
 */