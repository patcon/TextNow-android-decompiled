package textnow.ag;

import java.io.IOException;
import textnow.aj.f;
import textnow.al.a;
import textnow.al.c;

public abstract class s<T>
{
  public abstract T a(a parama);

  public final j a(T paramT)
  {
    try
    {
      f localf = new f();
      a(localf, paramT);
      j localj = localf.a();
      return localj;
    }
    catch (IOException localIOException)
    {
      throw new k(localIOException);
    }
  }

  public abstract void a(c paramc, T paramT);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ag.s
 * JD-Core Version:    0.6.2
 */