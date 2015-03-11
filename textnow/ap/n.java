package textnow.ap;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import textnow.am.e;
import textnow.am.q;
import textnow.am.s;
import textnow.am.t;
import textnow.ar.b;
import textnow.ar.c;

public final class n extends s<Time>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() == Time.class)
        return new n();
      return null;
    }
  };
  private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

  private void a(c paramc, Time paramTime)
  {
    Object localObject2;
    if (paramTime == null)
      localObject2 = null;
    try
    {
      while (true)
      {
        paramc.b((String)localObject2);
        return;
        String str = this.b.format(paramTime);
        localObject2 = str;
      }
    }
    finally
    {
    }
  }

  private Time b(textnow.ar.a parama)
  {
    try
    {
      Time localTime;
      if (parama.f() == b.i)
      {
        parama.j();
        localTime = null;
      }
      while (true)
      {
        return localTime;
        try
        {
          localTime = new Time(this.b.parse(parama.h()).getTime());
        }
        catch (ParseException localParseException)
        {
          throw new q(localParseException);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.n
 * JD-Core Version:    0.6.2
 */