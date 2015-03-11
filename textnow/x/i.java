package textnow.x;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class i
{
  private Object a;
  private Object b;
  private Object c;
  private int d;
  private boolean e;
  private int f = -2147483648;
  private Date g = new Date();

  public final Object a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(Object paramObject)
  {
    this.a = paramObject;
  }

  public final void a(String paramString)
  {
    try
    {
      this.g = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz").parse(paramString);
      return;
    }
    catch (ParseException localParseException)
    {
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public final Object b()
  {
    return this.b;
  }

  public final void b(int paramInt)
  {
    this.f = paramInt;
  }

  public final void b(Object paramObject)
  {
    this.b = paramObject;
  }

  public final Object c()
  {
    return this.c;
  }

  public final void c(Object paramObject)
  {
    this.c = paramObject;
  }

  public final int d()
  {
    return this.d;
  }

  public final boolean e()
  {
    return this.e;
  }

  public final Date f()
  {
    return this.g;
  }

  public final String toString()
  {
    return "Response statusCode:" + this.d + " isError:" + this.e + " result:" + this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.x.i
 * JD-Core Version:    0.6.2
 */