package textnow.ai;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import textnow.af.f;
import textnow.af.u;
import textnow.af.y;
import textnow.af.z;
import textnow.ak.b;
import textnow.ak.c;

public final class n extends y<Time>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
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

  private Time b(textnow.ak.a parama)
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
          throw new u(localParseException);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.n
 * JD-Core Version:    0.6.2
 */