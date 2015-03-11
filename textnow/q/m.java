package textnow.q;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class m
{
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString2);
      localMessageDigest.update(paramString1.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        for (String str2 = Integer.toHexString(0xFF & arrayOfByte[i]); str2.length() < 2; str2 = "0" + str2);
        localStringBuffer.append(str2);
      }
      String str1 = localStringBuffer.toString();
      return str1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Log.getStackTraceString(localNoSuchAlgorithmException);
    }
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.m
 * JD-Core Version:    0.6.2
 */