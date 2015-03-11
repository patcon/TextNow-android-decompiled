package textnow.bd;

import java.util.HashMap;

final class cb<T, U>
{
  private final HashMap<T, U> a = new HashMap();
  private final HashMap<U, T> b = new HashMap();

  public final U a(T paramT)
  {
    try
    {
      Object localObject2 = this.a.remove(paramT);
      if (localObject2 != null)
        this.b.remove(localObject2);
      while (true)
      {
        return localObject2;
        localObject2 = null;
      }
    }
    finally
    {
    }
  }

  public final void a(T paramT, U paramU)
  {
    if (paramT != null);
    try
    {
      this.a.put(paramT, paramU);
      if (paramU != null)
        this.b.put(paramU, paramT);
      return;
    }
    finally
    {
    }
  }

  public final T b(U paramU)
  {
    try
    {
      Object localObject2 = this.b.remove(paramU);
      if (localObject2 != null)
        this.a.remove(localObject2);
      while (true)
      {
        return localObject2;
        localObject2 = null;
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.cb
 * JD-Core Version:    0.6.2
 */