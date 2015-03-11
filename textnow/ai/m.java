package textnow.ai;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import textnow.af.f;
import textnow.af.u;
import textnow.af.y;
import textnow.af.z;
import textnow.ak.b;
import textnow.ak.c;

public final class m extends y<java.sql.Date>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
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

  private java.sql.Date b(textnow.ak.a parama)
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
 * Qualified Name:     textnow.ai.m
 * JD-Core Version:    0.6.2
 */