package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g
  implements AdMarvelNetworkHandler
{
  public String executeNetworkCall(AdMarvelHttpPost paramAdMarvelHttpPost)
  {
    int i = 0;
    HttpURLConnection localHttpURLConnection;
    try
    {
      localHttpURLConnection = (HttpURLConnection)new URL(paramAdMarvelHttpPost.getEndpointUrl()).openConnection();
      localHttpURLConnection.setRequestMethod("POST");
      localHttpURLConnection.setDoOutput(true);
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.setUseCaches(false);
      Iterator localIterator = paramAdMarvelHttpPost.getHttpHeaders().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        localHttpURLConnection.setRequestProperty(str2, (String)paramAdMarvelHttpPost.getHttpHeaders().get(str2));
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return null;
    }
    localHttpURLConnection.setRequestProperty("Content-Length", Integer.toString(paramAdMarvelHttpPost.getPostString().length()));
    localHttpURLConnection.setConnectTimeout(2000);
    localHttpURLConnection.setReadTimeout(10000);
    localHttpURLConnection.getOutputStream().write(paramAdMarvelHttpPost.getPostString().getBytes());
    int j = localHttpURLConnection.getResponseCode();
    int k = localHttpURLConnection.getContentLength();
    Logging.log("Connection Status Code: " + j);
    Logging.log("Content Length: " + k);
    byte[] arrayOfByte2;
    if (j == 200)
    {
      InputStream localInputStream = (InputStream)localHttpURLConnection.getContent();
      ArrayList localArrayList = new ArrayList();
      int m = 8192;
      int n = 0;
      while (m != -1)
      {
        byte[] arrayOfByte1 = new byte[8192];
        m = localInputStream.read(arrayOfByte1, 0, 8192);
        if (m > 0)
        {
          g.a locala1 = new g.a(null);
          locala1.a = arrayOfByte1;
          locala1.b = m;
          n += m;
          localArrayList.add(locala1);
        }
      }
      localInputStream.close();
      if (n > 0)
      {
        arrayOfByte2 = new byte[n];
        for (int i1 = 0; i1 < localArrayList.size(); i1++)
        {
          g.a locala2 = (g.a)localArrayList.get(i1);
          System.arraycopy(locala2.a, 0, arrayOfByte2, i, locala2.b);
          i += locala2.b;
        }
      }
    }
    for (String str1 = new String(arrayOfByte2); ; str1 = "")
      return str1.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.g
 * JD-Core Version:    0.6.2
 */