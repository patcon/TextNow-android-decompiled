package textnow.aj;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import textnow.ag.e;
import textnow.ag.q;
import textnow.ag.s;
import textnow.ag.t;
import textnow.al.b;
import textnow.al.c;

public final class n extends s<Time>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.ak.a<T> paramAnonymousa)
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

  private Time b(textnow.al.a parama)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.n
 * JD-Core Version:    0.6.2
 */