package textnow.ac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import textnow.ad.a;
import textnow.ae.c;
import textnow.z.f;
import textnow.z.u;
import textnow.z.y;
import textnow.z.z;

public final class d extends y<Date>
{
  public static final z a = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() == Date.class)
        return new d();
      return null;
    }
  };
  private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
  private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
  private final DateFormat d;

  public d()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    this.d = localSimpleDateFormat;
  }

  private Date a(String paramString)
  {
    try
    {
      Date localDate3 = this.c.parse(paramString);
      localObject2 = localDate3;
      return localObject2;
    }
    catch (ParseException localParseException1)
    {
      try
      {
        Date localDate2 = this.b.parse(paramString);
        localObject2 = localDate2;
      }
      catch (ParseException localParseException2)
      {
        try
        {
          Date localDate1 = this.d.parse(paramString);
          Object localObject2 = localDate1;
        }
        catch (ParseException localParseException3)
        {
          throw new u(paramString, localParseException3);
        }
      }
    }
    finally
    {
    }
  }

  private void a(c paramc, Date paramDate)
  {
    if (paramDate == null);
    try
    {
      paramc.f();
      while (true)
      {
        return;
        paramc.b(this.b.format(paramDate));
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ac.d
 * JD-Core Version:    0.6.2
 */