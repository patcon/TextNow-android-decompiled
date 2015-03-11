package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;

public class ed extends MessageDigest
{
  private CRC32 a = new CRC32();

  public ed()
  {
    super("CRC");
  }

  public byte[] a()
  {
    return engineDigest();
  }

  public int b()
  {
    return ByteBuffer.wrap(engineDigest()).getInt();
  }

  protected byte[] engineDigest()
  {
    long l = this.a.getValue();
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = ((byte)(int)((0xFF000000 & l) >> 24));
    arrayOfByte[1] = ((byte)(int)((0xFF0000 & l) >> 16));
    arrayOfByte[2] = ((byte)(int)((0xFF00 & l) >> 8));
    arrayOfByte[3] = ((byte)(int)((l & 0xFF) >> 0));
    return arrayOfByte;
  }

  protected void engineReset()
  {
    this.a.reset();
  }

  protected void engineUpdate(byte paramByte)
  {
    this.a.update(paramByte);
  }

  protected void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ed
 * JD-Core Version:    0.6.2
 */