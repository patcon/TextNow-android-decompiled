package textnow.bd;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

final class bx
  implements av
{
  private long a = 6291456L;
  private long b = 0L;
  private final HashMap<s, Bitmap> c = new HashMap();
  private final Set<s> d = new LinkedHashSet();

  private static long b(Bitmap paramBitmap, s params)
  {
    int i = 4;
    Bitmap.Config localConfig = params.c;
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
            locals = (s)localIterator.next();
            if (locals != null)
              this.d.remove(locals);
            Bitmap localBitmap = (Bitmap)this.c.remove(locals);
            this.b -= b(localBitmap, locals);
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
      label121: s locals = null;
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
      this.b += b(paramBitmap, params);
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
 * Qualified Name:     textnow.bd.bx
 * JD-Core Version:    0.6.2
 */