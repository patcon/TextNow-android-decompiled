package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

final class x
{
  private PublicKey a;
  private Cipher b;

  x()
  {
    try
    {
      X509EncodedKeySpec localX509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJHz5rYyjP4OdTotQP4QUKHHk0YP+YM/axTmaG2FO+AS0WG9vtLijYptdMACMeIvPANrey0HmQBqYmsCCFY7HO8CAwEAAQ==", 0));
      this.a = KeyFactory.getInstance("RSA").generatePublic(localX509EncodedKeySpec);
      this.b = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  @SuppressLint({"NewApi"})
  final String a(String paramString)
  {
    try
    {
      if ((this.b != null) && (this.a != null))
      {
        this.b.init(1, this.a);
        String str = Base64.encodeToString(this.b.doFinal(paramString.getBytes()), 0);
        return str;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.x
 * JD-Core Version:    0.6.2
 */