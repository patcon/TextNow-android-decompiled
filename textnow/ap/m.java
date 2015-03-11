package textnow.ap;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import textnow.am.e;
import textnow.am.q;
import textnow.am.s;
import textnow.am.t;
import textnow.ar.b;
import textnow.ar.c;

public final class m extends s<java.sql.Date>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() == java.sql.Date.class)
        return new m();
      return null;
    }
  };
  private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

  private void a(c paramc, java.sql.Date paramDate)
  {
    Object localObject2;
    if (paramDate == null)
      localObject2 = null;
    try
    {
      while (true)
      {
        paramc.b((String)localObject2);
        return;
        String str = this.b.format(paramDate);
        localObject2 = str;
      }
    }
    finally
    {
    }
  }

  private java.sql.Date b(textnow.ar.a parama)
  {
    try
    {
      java.sql.Date localDate;
      if (parama.f() == b.i)
      {
        parama.j();
        localDate = null;
      }
      while (true)
      {
        return localDate;
        try
        {
          localDate = new java.sql.Date(this.b.parse(parama.h()).getTime());
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
 * Qualified Name:     textnow.ap.m
 * JD-Core Version:    0.6.2
 */