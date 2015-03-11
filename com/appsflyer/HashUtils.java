package com.appsflyer;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;

public class HashUtils
{
  private static String byteToHex(byte[] paramArrayOfByte)
  {
    Formatter localFormatter = new Formatter();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      byte b = paramArrayOfByte[j];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Byte.valueOf(b);
      localFormatter.format("%02x", arrayOfObject);
    }
    String str = localFormatter.toString();
    localFormatter.close();
    return str;
  }

  public static String toSHA1(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.reset();
      localMessageDigest.update(paramString.getBytes("UTF-8"));
      String str = byteToHex(localMessageDigest.digest());
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
      return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return null;
  }

  public String getHashCode(Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("appsflyerKey");
    String str2 = (String)paramMap.get("af_timestamp");
    String str3 = (String)paramMap.get("uid");
    return toSHA1(str1.substring(0, 7) + str3.substring(0, 7) + str2.substring(-7 + str2.length()));
  }

  public native String getNativeCode(String paramString1, String paramString2, String paramString3);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.HashUtils
 * JD-Core Version:    0.6.2
 */