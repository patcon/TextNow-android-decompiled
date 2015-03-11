package textnow.at;

import android.os.AsyncTask;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import textnow.ax.m;

final class i extends AsyncTask<String, Void, String>
{
  i(f paramf)
  {
  }

  private static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        localStringBuilder.append(str + "\n");
      }
    }
    catch (IOException localIOException2)
    {
      localIOException2 = localIOException2;
      localIOException2.printStackTrace();
      try
      {
        paramInputStream.close();
        while (true)
        {
          return localStringBuilder.toString();
          try
          {
            paramInputStream.close();
          }
          catch (IOException localIOException4)
          {
            localIOException4.printStackTrace();
          }
        }
      }
      catch (IOException localIOException3)
      {
        while (true)
          localIOException3.printStackTrace();
      }
    }
    finally
    {
    }
    try
    {
      paramInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        localIOException1.printStackTrace();
    }
  }

  private String a(String[] paramArrayOfString)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    try
    {
      HttpGet localHttpGet = new HttpGet(new URI(paramArrayOfString[0]));
      m.a(localHttpGet, paramArrayOfString[0]);
      HttpEntity localHttpEntity = localDefaultHttpClient.execute(localHttpGet).getEntity();
      if (localHttpEntity != null)
      {
        InputStream localInputStream = localHttpEntity.getContent();
        String str = a(localInputStream);
        localInputStream.close();
        return str;
      }
    }
    catch (Exception localException)
    {
      r.a(localException);
      return null;
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.at.i
 * JD-Core Version:    0.6.2
 */