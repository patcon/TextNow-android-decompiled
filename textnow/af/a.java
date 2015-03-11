package textnow.af;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class a
  implements l<Date>, t<Date>
{
  private final DateFormat a;
  private final DateFormat b;
  private final DateFormat c;

  a()
  {
    this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
  }

  public a(int paramInt1, int paramInt2)
  {
    this(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US), DateFormat.getDateTimeInstance(paramInt1, paramInt2));
  }

  a(String paramString)
  {
    this(new SimpleDateFormat(paramString, Locale.US), new SimpleDateFormat(paramString));
  }

  private a(DateFormat paramDateFormat1, DateFormat paramDateFormat2)
  {
    this.a = paramDateFormat1;
    this.b = paramDateFormat2;
    this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
  }

  private Date a(m paramm)
  {
    synchronized (this.b)
    {
      try
      {
        Date localDate3 = this.b.parse(paramm.c());
        return localDate3;
      }
      catch (ParseException localParseException1)
      {
      }
    }
    try
    {
      Date localDate2 = this.a.parse(paramm.c());
      return localDate2;
      localObject = finally;
      throw localObject;
    }
    catch (ParseException localParseException2)
    {
      try
      {
        Date localDate1 = this.c.parse(paramm.c());
        return localDate1;
      }
      catch (ParseException localParseException3)
      {
        throw new u(paramm.c(), localParseException3);
      }
    }
  }

  private m a(Date paramDate)
  {
    synchronized (this.b)
    {
      r localr = new r(this.a.format(paramDate));
      return localr;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.a
 * JD-Core Version:    0.6.2
 */