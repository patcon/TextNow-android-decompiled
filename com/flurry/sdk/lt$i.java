package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.UUID;

public class lt$i extends lt<UUID>
{
  public lt$i()
  {
    super(UUID.class);
  }

  protected UUID b(Object paramObject, iz paramiz)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      if (arrayOfByte.length != 16)
        paramiz.b("Can only construct UUIDs from 16 byte arrays; got " + arrayOfByte.length + " bytes");
      DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
      return new UUID(localDataInputStream.readLong(), localDataInputStream.readLong());
    }
    super.a(paramObject, paramiz);
    return null;
  }

  protected UUID b(String paramString, iz paramiz)
  {
    return UUID.fromString(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lt.i
 * JD-Core Version:    0.6.2
 */