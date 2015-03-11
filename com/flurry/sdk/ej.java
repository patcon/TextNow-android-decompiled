package com.flurry.sdk;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class ej
  implements X509TrustManager
{
  private X509TrustManager a = null;

  public ej(KeyStore paramKeyStore)
  {
    TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    localTrustManagerFactory.init(paramKeyStore);
    TrustManager[] arrayOfTrustManager = localTrustManagerFactory.getTrustManagers();
    if (arrayOfTrustManager.length == 0)
      throw new NoSuchAlgorithmException("no trust manager found");
    this.a = ((X509TrustManager)arrayOfTrustManager[0]);
  }

  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }

  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    if ((paramArrayOfX509Certificate != null) && (paramArrayOfX509Certificate.length == 1))
    {
      paramArrayOfX509Certificate[0].checkValidity();
      return;
    }
    this.a.checkServerTrusted(paramArrayOfX509Certificate, paramString);
  }

  public X509Certificate[] getAcceptedIssuers()
  {
    return this.a.getAcceptedIssuers();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ej
 * JD-Core Version:    0.6.2
 */