package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class v
{
  private static final String a = v.class.getSimpleName();
  private static gg b = new gg();

  public static <A extends gw> A a(byte[] paramArrayOfByte, Class<A> paramClass)
  {
    if (paramArrayOfByte == null);
    try
    {
      eo.a(6, a, "convertBytesToResponse: bytes array is null");
      gw localgw;
      for (Object localObject2 = null; ; localObject2 = localgw)
      {
        return localObject2;
        localgw = b(paramArrayOfByte, paramClass);
      }
    }
    finally
    {
    }
  }

  public static <A extends gw> byte[] a(A paramA, Class<A> paramClass)
  {
    byte[] arrayOfByte = null;
    if (paramA == null);
    try
    {
      eo.a(6, a, "convertRequestToByte: Request is null");
      while (true)
      {
        return arrayOfByte;
        gu localgu = new gu(paramClass);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        gc localgc = gj.a().b(localByteArrayOutputStream, null);
        try
        {
          localgu.a(paramA, localgc);
          localgc.flush();
          arrayOfByte = localByteArrayOutputStream.toByteArray();
        }
        catch (IOException localIOException)
        {
          eo.a(6, a, "Error generating adlog request" + localIOException.getMessage());
          arrayOfByte = null;
        }
      }
    }
    finally
    {
    }
  }

  private static <A extends gw> A b(byte[] paramArrayOfByte, Class<A> paramClass)
  {
    gb localgb = b.a(new ByteArrayInputStream(paramArrayOfByte), null);
    try
    {
      gw localgw = (gw)new gt(paramClass).a(null, localgb);
      return localgw;
    }
    catch (ClassCastException localClassCastException)
    {
      eo.a(6, a, "ClassCastException in parseAvroBinary:" + localClassCastException.getMessage());
      eo.a(3, a, "ClassCastException in parseAvroBinary: bytes = " + paramArrayOfByte + " type = " + paramClass.getSimpleName());
      return null;
    }
    catch (IOException localIOException)
    {
      eo.a(6, a, "IOException in parseAvroBinary:" + localIOException.getMessage());
      eo.a(3, a, "IOException in parseAvroBinary: bytes = " + paramArrayOfByte + " type = " + paramClass.getSimpleName());
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.v
 * JD-Core Version:    0.6.2
 */