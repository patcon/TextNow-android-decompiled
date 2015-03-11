package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class o
{
  private final SecureRandom kW;
  private final m ky;

  public o(m paramm, SecureRandom paramSecureRandom)
  {
    this.ky = paramm;
    this.kW = paramSecureRandom;
  }

  static void c(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)(0x44 ^ paramArrayOfByte[i]));
  }

  public byte[] b(String paramString)
  {
    byte[] arrayOfByte1;
    try
    {
      arrayOfByte1 = this.ky.a(paramString, false);
      if (arrayOfByte1.length != 32)
        throw new o.a(this);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new o.a(this, localIllegalArgumentException);
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte1, 4, 16);
    byte[] arrayOfByte2 = new byte[16];
    localByteBuffer.get(arrayOfByte2);
    c(arrayOfByte2);
    return arrayOfByte2;
  }

  public byte[] c(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != 16)
      throw new o.a(this);
    try
    {
      arrayOfByte1 = this.ky.a(paramString, false);
      if (arrayOfByte1.length <= 16)
        throw new o.a(this);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte1;
      throw new o.a(this, localNoSuchAlgorithmException);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);
      localByteBuffer.flip();
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[-16 + arrayOfByte1.length];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get(arrayOfByte3);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec, new IvParameterSpec(arrayOfByte2));
      byte[] arrayOfByte4 = localCipher.doFinal(arrayOfByte3);
      return arrayOfByte4;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new o.a(this, localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new o.a(this, localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new o.a(this, localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      throw new o.a(this, localBadPaddingException);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      throw new o.a(this, localInvalidAlgorithmParameterException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new o.a(this, localIllegalArgumentException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.o
 * JD-Core Version:    0.6.2
 */