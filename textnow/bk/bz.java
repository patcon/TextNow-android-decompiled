package textnow.bk;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

final class bz
  implements aw
{
  private long a = 6291456L;
  private long b = 0L;
  private final HashMap<t, Bitmap> c = new HashMap();
  private final Set<t> d = new LinkedHashSet();

  private static long b(Bitmap paramBitmap, t paramt)
  {
    int i = 4;
    Bitmap.Config localConfig = paramt.c;
    if (localConfig != null)
      switch (1.a[localConfig.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      return i * (paramBitmap.getWidth() * paramBitmap.getHeight());
      i = 1;
      continue;
      i = 2;
    }
  }

  private void b()
  {
    while (true)
    {
      try
      {
        long l1 = this.b;
        long l2 = this.a;
        if (l1 > l2)
        {
          try
          {
            Iterator localIterator = this.d.iterator();
            if (!localIterator.hasNext())
              break label121;
            localt = (t)localIterator.next();
            if (localt != null)
              this.d.remove(localt);
            Bitmap localBitmap = (Bitmap)this.c.remove(localt);
            this.b -= b(localBitmap, localt);
          }
          catch (NoSuchElementException localNoSuchElementException)
          {
            this.b = 0L;
          }
          continue;
        }
      }
      finally
      {
      }
      return;
      label121: t localt = null;
    }
  }

  private void b(t paramt)
  {
    try
    {
      if (this.d.contains(paramt))
      {
        this.d.remove(paramt);
        this.d.add(paramt);
      }
      while (true)
      {
        return;
        this.d.add(paramt);
        b();
      }
    }
    finally
    {
    }
  }

  public final Bitmap a(t paramt)
  {
    try
    {
      Bitmap localBitmap = (Bitmap)this.c.get(paramt);
      if (localBitmap != null)
        b(paramt);
      while (true)
      {
        return localBitmap;
        localBitmap = null;
      }
    }
    finally
    {
    }
  }

  public final void a()
  {
    try
    {
      this.b = 0L;
      this.c.clear();
      this.d.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(Bitmap paramBitmap, t paramt)
  {
    try
    {
      this.c.put(paramt, paramBitmap);
      this.b += b(paramBitmap, paramt);
      b(paramt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bz
 * JD-Core Version:    0.6.2
 */