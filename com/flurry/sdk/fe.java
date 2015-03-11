package com.flurry.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fe
{
  private static final String a = fe.class.getSimpleName();

  public static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[1024];
    int i;
    for (long l = 0L; ; l += i)
    {
      i = paramInputStream.read(arrayOfByte);
      if (i < 0)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    return l;
  }

  public static String a(String paramString)
  {
    return a(paramString, 255);
  }

  public static String a(String paramString, int paramInt)
  {
    if (paramString == null)
      paramString = "";
    while (paramString.length() <= paramInt)
      return paramString;
    return paramString.substring(0, paramInt);
  }

  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(2 * paramArrayOfByte.length);
    char[] arrayOfChar = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte[j];
      int m = (byte)(k & 0xF);
      localStringBuilder.append(arrayOfChar[((byte)((k & 0xF0) >> 4))]);
      localStringBuilder.append(arrayOfChar[m]);
    }
    return localStringBuilder.toString();
  }

  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static boolean a(long paramLong)
  {
    boolean bool1;
    if (paramLong != 0L)
    {
      boolean bool2 = System.currentTimeMillis() < paramLong;
      bool1 = false;
      if (bool2);
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }

  public static boolean a(Intent paramIntent)
  {
    return do.a().c().queryIntentActivities(paramIntent, 65536).size() > 0;
  }

  public static String b(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      eo.a(5, a, "Cannot encode '" + paramString + "'");
    }
    return "";
  }

  public static boolean b(Intent paramIntent)
  {
    boolean bool = false;
    if (paramIntent != null)
    {
      ComponentName localComponentName = paramIntent.resolveActivity(do.a().c());
      bool = do.a().b().getPackageName().equals(localComponentName.getPackageName());
    }
    return bool;
  }

  public static String c(String paramString)
  {
    try
    {
      String str = URLDecoder.decode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      eo.a(5, a, "Cannot decode '" + paramString + "'");
    }
    return "";
  }

  public static byte[] d(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramString.getBytes(), 0, paramString.length());
      byte[] arrayOfByte = localMessageDigest.digest();
      return arrayOfByte;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      eo.a(6, a, "Unsupported SHA1: " + localNoSuchAlgorithmException.getMessage());
    }
    return null;
  }

  public static String e(String paramString)
  {
    return paramString.replace("'", "\\'").replace("\\n", "").replace("\\r", "").replace("\\t", "");
  }

  public static Map<String, String> f(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString))
    {
      String[] arrayOfString1 = paramString.split("&");
      int i = arrayOfString1.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=");
        if (!arrayOfString2[0].equals("event"))
          localHashMap.put(c(arrayOfString2[0]), c(arrayOfString2[1]));
      }
    }
    return localHashMap;
  }

  public static long g(String paramString)
  {
    long l1;
    if (paramString == null)
      l1 = 0L;
    while (true)
    {
      return l1;
      int i = paramString.length();
      l1 = 1125899906842597L;
      int j = 0;
      while (j < i)
      {
        long l2 = l1 * 31L + paramString.charAt(j);
        j++;
        l1 = l2;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fe
 * JD-Core Version:    0.6.2
 */