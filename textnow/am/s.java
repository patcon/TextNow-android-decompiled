package textnow.am;

import java.io.IOException;
import textnow.ap.f;
import textnow.ar.a;
import textnow.ar.c;

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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.am.s
 * JD-Core Version:    0.6.2
 */