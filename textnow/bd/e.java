package textnow.bd;

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
  implements av
{
  private long a = 20971520L;
  private volatile long b = 0L;
  private final Map<s, Bitmap> c = new HashMap();
  private final Set<s> d = new LinkedHashSet();

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
          s locals = null;
          if (bool)
            locals = (s)localIterator.next();
          if (locals != null)
            this.d.remove(locals);
          Bitmap localBitmap = (Bitmap)this.c.remove(locals);
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

  private void b(s params)
  {
    try
    {
      if (this.d.contains(params))
      {
        this.d.remove(params);
        this.d.add(params);
      }
      while (true)
      {
        return;
        this.d.add(params);
        b();
      }
    }
    finally
    {
    }
  }

  public final Bitmap a(s params)
  {
    try
    {
      Bitmap localBitmap = (Bitmap)this.c.get(params);
      if (localBitmap != null)
        b(params);
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

  public final void a(Bitmap paramBitmap, s params)
  {
    try
    {
      this.c.put(params, paramBitmap);
      this.b += paramBitmap.getByteCount();
      b(params);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.e
 * JD-Core Version:    0.6.2
 */