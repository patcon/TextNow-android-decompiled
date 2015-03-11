package textnow.ac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import textnow.ae.b;
import textnow.ae.c;
import textnow.z.f;
import textnow.z.u;
import textnow.z.y;
import textnow.z.z;

public final class m extends y<java.sql.Date>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.ad.a<T> paramAnonymousa)
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

  private java.sql.Date b(textnow.ae.a parama)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.m
 * JD-Core Version:    0.6.2
 */