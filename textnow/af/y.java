package textnow.af;

import java.io.IOException;
import textnow.ai.f;
import textnow.ak.a;
import textnow.ak.c;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.y
 * JD-Core Version:    0.6.2
 */