package textnow.aj;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import textnow.ag.e;
import textnow.ag.q;
import textnow.ag.s;
import textnow.ag.t;
import textnow.al.b;
import textnow.al.c;

public final class m extends s<java.sql.Date>
{
  public static final t a = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.ak.a<T> paramAnonymousa)
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

  private java.sql.Date b(textnow.al.a parama)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.m
 * JD-Core Version:    0.6.2
 */