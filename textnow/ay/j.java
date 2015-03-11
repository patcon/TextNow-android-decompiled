package textnow.ay;

import android.os.Bundle;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public final class j
{
  public static Bundle a(String paramString)
  {
    String str = paramString.replace("fbconnect", "http");
    try
    {
      URL localURL = new URL(str);
      Bundle localBundle = b(localURL.getQuery());
      localBundle.putAll(b(localURL.getRef()));
      return localBundle;
    }
    catch (MalformedURLException localMalformedURLException)
    {
    }
    return new Bundle();
  }

  public static String a(Bundle paramBundle)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (i != 0)
        i = 0;
      while (true)
      {
        localStringBuilder.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(paramBundle.getString(str)));
        break;
        localStringBuilder.append("&");
      }
    }
    return localStringBuilder.toString();
  }

  private static String a(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramBundle.getByteArray(str) == null)
      {
        localStringBuilder.append("Content-Disposition: form-data; name=\"" + str + "\"\r\n\r\n" + paramBundle.getString(str));
        localStringBuilder.append("\r\n--" + paramString + "\r\n");
      }
    }
    return localStringBuilder.toString();
  }

  private static String a(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 1000);
    for (String str = localBufferedReader.readLine(); str != null; str = localBufferedReader.readLine())
      localStringBuilder.append(str);
    paramInputStream.close();
    return localStringBuilder.toString();
  }

  public static String a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2.equals("GET"))
      paramString1 = paramString1 + "?" + a(paramBundle);
    new StringBuilder().append(paramString2).append(" URL: ").append(paramString1).toString();
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString1).openConnection();
    localHttpURLConnection.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
    localHttpURLConnection.setConnectTimeout(3000);
    localHttpURLConnection.setReadTimeout(3000);
    if (!paramString2.equals("GET"))
    {
      Bundle localBundle = new Bundle();
      Iterator localIterator1 = paramBundle.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str3 = (String)localIterator1.next();
        if (paramBundle.getByteArray(str3) != null)
          localBundle.putByteArray(str3, paramBundle.getByteArray(str3));
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
      localBufferedOutputStream.write(("--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
      localBufferedOutputStream.write(a(paramBundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
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
      localBufferedOutputStream.flush();
    }
    try
    {
      String str1 = a(localHttpURLConnection.getInputStream());
      return str1;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
    return a(localHttpURLConnection.getErrorStream());
  }

  private static Bundle b(String paramString)
  {
    Bundle localBundle = new Bundle();
    if (paramString != null)
    {
      String[] arrayOfString1 = paramString.split("&");
      int i = arrayOfString1.length;
      for (int j = 0; j < i; j++)
      {
        String[] arrayOfString2 = arrayOfString1[j].split("=");
        localBundle.putString(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
      }
    }
    return localBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ay.j
 * JD-Core Version:    0.6.2
 */