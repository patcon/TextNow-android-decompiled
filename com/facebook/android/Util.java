package com.facebook.android;

import android.os.Bundle;
import com.facebook.internal.Utility;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public final class Util
{
  private static final String UTF8 = "UTF-8";

  @Deprecated
  public static Bundle decodeUrl(String paramString)
  {
    int i = 0;
    Bundle localBundle = new Bundle();
    String[] arrayOfString1;
    int j;
    if (paramString != null)
    {
      arrayOfString1 = paramString.split("&");
      j = arrayOfString1.length;
    }
    while (true)
    {
      if (i < j)
      {
        String[] arrayOfString2 = arrayOfString1[i].split("=");
        try
        {
          if (arrayOfString2.length == 2)
            localBundle.putString(URLDecoder.decode(arrayOfString2[0], "UTF-8"), URLDecoder.decode(arrayOfString2[1], "UTF-8"));
          else if (arrayOfString2.length == 1)
            localBundle.putString(URLDecoder.decode(arrayOfString2[0], "UTF-8"), "");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
        }
      }
      else
      {
        return localBundle;
      }
      i++;
    }
  }

  @Deprecated
  public static String encodePostBody(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if ((localObject instanceof String))
      {
        localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n" + (String)localObject);
        localStringBuilder.append("\r\n--" + paramString + "\r\n");
      }
    }
    return localStringBuilder.toString();
  }

  @Deprecated
  public static String encodeUrl(Bundle paramBundle)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((paramBundle.get(str) instanceof String))
      {
        if (i != 0)
          i = 0;
        while (true)
        {
          localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
          break;
          localStringBuilder.append("&");
        }
      }
    }
    return localStringBuilder.toString();
  }

  @Deprecated
  public static String openUrl(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2.equals("GET"))
      paramString1 = paramString1 + "?" + encodeUrl(paramBundle);
    Utility.logd("Facebook-Util", paramString2 + " URL: " + paramString1);
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString1).openConnection();
    localHttpURLConnection.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
    if (!paramString2.equals("GET"))
    {
      Bundle localBundle = new Bundle();
      Iterator localIterator1 = paramBundle.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str3 = (String)localIterator1.next();
        Object localObject2 = paramBundle.get(str3);
        if ((localObject2 instanceof byte[]))
          localBundle.putByteArray(str3, (byte[])localObject2);
      }
      if (!paramBundle.containsKey("method"))
        paramBundle.putString("method", paramString2);
      if (paramBundle.containsKey("access_token"))
        paramBundle.putString("access_token", URLDecoder.decode(paramBundle.getString("access_token")));
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.setRequestProperty("Connection", "Keep-Alive");
      localHttpURLConnection.connect();
      BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
      try
      {
        localBufferedOutputStream.write(("--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
        localBufferedOutputStream.write(encodePostBody(paramBundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
        localBufferedOutputStream.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
        if (!localBundle.isEmpty())
        {
          Iterator localIterator2 = localBundle.keySet().iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            localBufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + str2 + "\"" + "\r\n").getBytes());
            localBufferedOutputStream.write(("Content-Type: content/unknown" + "\r\n" + "\r\n").getBytes());
            localBufferedOutputStream.write(localBundle.getByteArray(str2));
            localBufferedOutputStream.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
          }
        }
      }
      finally
      {
        localBufferedOutputStream.close();
      }
      localBufferedOutputStream.flush();
      localBufferedOutputStream.close();
    }
    try
    {
      String str1 = read(localHttpURLConnection.getInputStream());
      return str1;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return read(localHttpURLConnection.getErrorStream());
  }

  @Deprecated
  public static Bundle parseUrl(String paramString)
  {
    String str = paramString.replace("fbconnect", "http");
    try
    {
      URL localURL = new URL(str);
      Bundle localBundle = decodeUrl(localURL.getQuery());
      localBundle.putAll(decodeUrl(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new Bundle();
  }

  @Deprecated
  private static String read(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 1000);
    for (String str = localBufferedReader.readLine(); str != null; str = localBufferedReader.readLine())
      localStringBuilder.append(str);
    paramInputStream.close();
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.android.Util
 * JD-Core Version:    0.6.2
 */