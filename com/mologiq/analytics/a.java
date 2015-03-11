package com.mologiq.analytics;

import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  private SecretKey a;

  public static String a(String paramString1, String paramString2)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(Base64.decode(paramString1, 0), "AES");
      Cipher localCipher = Cipher.getInstance("AES");
      localCipher.init(2, localSecretKeySpec);
      String str = new String(localCipher.doFinal(Base64.decode(paramString2, 0)));
      return str;
    }
    catch (Exception localException)
    {
      af.a("Error");
    }
    return null;
  }

  public final String a()
  {
    return new String(Base64.encode(this.a.getEncoded(), 0));
  }

  public final String a(String paramString)
  {
    SecureRandom localSecureRandom = new SecureRandom();
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    localKeyGenerator.init(128, localSecureRandom);
    this.a = localKeyGenerator.generateKey();
    Cipher localCipher = Cipher.getInstance("AES");
    localCipher.init(1, this.a);
    return Base64.encodeToString(localCipher.doFinal(paramString.getBytes()), 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.a
 * JD-Core Version:    0.6.2
 */