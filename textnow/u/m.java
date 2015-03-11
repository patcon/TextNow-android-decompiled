package textnow.u;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public final class m
{
  private static PublicKey a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = a.a(paramString);
      PublicKey localPublicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrayOfByte));
      return localPublicKey;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      throw new IllegalArgumentException(localInvalidKeySpecException);
    }
    catch (b localb)
    {
      throw new IllegalArgumentException(localb);
    }
  }

  public static boolean a(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2 == null);
    while ((!TextUtils.isEmpty(paramString3)) && (!a(a(paramString1), paramString2, paramString3)))
      return false;
    return true;
  }

  private static boolean a(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    try
    {
      Signature localSignature = Signature.getInstance("SHA1withRSA");
      localSignature.initVerify(paramPublicKey);
      localSignature.update(paramString1.getBytes());
      boolean bool = localSignature.verify(a.a(paramString2));
      return bool;
    }
    catch (b localb)
    {
      return false;
    }
    catch (SignatureException localSignatureException)
    {
      return false;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      return false;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.u.m
 * JD-Core Version:    0.6.2
 */