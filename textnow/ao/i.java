package textnow.ao;

import java.math.BigInteger;

public final class i extends Number
{
  private final String a;

  public i(String paramString)
  {
    this.a = paramString;
  }

  public final double doubleValue()
  {
    return Double.parseDouble(this.a);
  }

  public final float floatValue()
  {
    return Float.parseFloat(this.a);
  }

  public final int intValue()
  {
    try
    {
      int i = Integer.parseInt(this.a);
      return i;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        long l = Long.parseLong(this.a);
        return (int)l;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
      }
    }
    return new BigInteger(this.a).intValue();
  }

  public final long longValue()
  {
    try
    {
      long l = Long.parseLong(this.a);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return new BigInteger(this.a).longValue();
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.i
 * JD-Core Version:    0.6.2
 */