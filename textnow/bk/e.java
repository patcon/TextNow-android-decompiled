package textnow.bk;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@SuppressLint({"NewApi"})
final class e
  implements aw
{
  private long a = 20971520L;
  private volatile long b = 0L;
  private final Map<t, Bitmap> c = new HashMap();
  private final Set<t> d = new LinkedHashSet();

  private void b()
  {
    try
    {
      while (true)
      {
        long l1 = this.b;
        long l2 = this.a;
        if (l1 <= l2)
          break;
        try
        {
          Iterator localIterator = this.d.iterator();
          boolean bool = localIterator.hasNext();
          t localt = null;
          if (bool)
            localt = (t)localIterator.next();
          if (localt != null)
            this.d.remove(localt);
          Bitmap localBitmap = (Bitmap)this.c.remove(localt);
          this.b -= localBitmap.getByteCount();
        }
        catch (NoSuchElementException localNoSuchElementException)
        {
          this.b = 0L;
        }
      }
    }
    finally
    {
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
      this.b += paramBitmap.getByteCount();
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
 * Qualified Name:     textnow.bk.e
 * JD-Core Version:    0.6.2
 */