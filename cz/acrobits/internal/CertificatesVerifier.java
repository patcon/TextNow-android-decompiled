package cz.acrobits.internal;

import cz.acrobits.ali.AndroidUtil;
import java.lang.reflect.Constructor;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class CertificatesVerifier
{
  public static final String CLASS = "org.apache.harmony.security.provider.cert.X509CertImpl";
  public static final String RSA = "RSA";
  public static final String TAG = "Certificates Verifier";
  protected static Constructor<? extends X509Certificate> mConstructor;
  protected static X509TrustManager mTrustManager;

  static
  {
    int i;
    int j;
    do
    {
      try
      {
        mConstructor = Class.forName("org.apache.harmony.security.provider.cert.X509CertImpl").asSubclass(X509Certificate.class).getConstructor(new Class[] { [B.class });
        TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance("X509");
        localTrustManagerFactory.init(null);
        TrustManager[] arrayOfTrustManager = localTrustManagerFactory.getTrustManagers();
        i = arrayOfTrustManager.length;
        j = 0;
        continue;
        TrustManager localTrustManager = arrayOfTrustManager[j];
        if ((localTrustManager instanceof X509TrustManager))
        {
          mTrustManager = (X509TrustManager)localTrustManager;
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        return;
      }
      j++;
    }
    while (j < i);
  }

  public boolean verify(String paramString, byte[][] paramArrayOfByte)
  {
    if (mTrustManager == null)
    {
      AndroidUtil.log("Certificates Verifier", "No trust manager, cannot verify");
      return false;
    }
    try
    {
      X509Certificate[] arrayOfX509Certificate = new X509Certificate[paramArrayOfByte.length];
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte.length)
        {
          mTrustManager.checkClientTrusted(arrayOfX509Certificate, "RSA");
          return true;
        }
        Constructor localConstructor = mConstructor;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramArrayOfByte[i];
        arrayOfX509Certificate[i] = ((X509Certificate)localConstructor.newInstance(arrayOfObject));
      }
    }
    catch (CertificateException localCertificateException)
    {
      AndroidUtil.log("Certificates Verifier", "Failed for " + paramString + ": " + localCertificateException.getMessage());
      return false;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.internal.CertificatesVerifier
 * JD-Core Version:    0.6.2
 */