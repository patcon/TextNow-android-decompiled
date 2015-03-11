package textnow.z;

import java.io.IOException;
import textnow.ac.f;
import textnow.ae.a;
import textnow.ae.c;

public abstract class y<T>
{
  public abstract T a(a parama);

  public final m a(T paramT)
  {
    try
    {
      f localf = new f();
      a(localf, paramT);
      m localm = localf.a();
      return localm;
    }
    catch (IOException localIOException)
    {
      throw new n(localIOException);
    }
  }

  public abstract void a(c paramc, T paramT);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.y
 * JD-Core Version:    0.6.2
 */