package com.mopub.common.util;

public class Numbers
{
  public static Double parseDouble(Object paramObject)
  {
    if ((paramObject instanceof Number))
      return Double.valueOf(((Number)paramObject).doubleValue());
    if ((paramObject instanceof String))
      try
      {
        Double localDouble = Double.valueOf((String)paramObject);
        return localDouble;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new ClassCastException("Unable to parse " + paramObject + " as double.");
      }
    throw new ClassCastException("Unable to parse " + paramObject + " as double.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Numbers
 * JD-Core Version:    0.6.2
 */