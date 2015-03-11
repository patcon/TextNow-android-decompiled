package com.mopub.mobileads.util;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

public class HttpClients
{
  public static void safeShutdown(HttpClient paramHttpClient)
  {
    new Thread(new Runnable()
    {
      public final void run()
      {
        if ((HttpClients.this != null) && (HttpClients.this.getConnectionManager() != null))
          HttpClients.this.getConnectionManager().shutdown();
      }
    }).start();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.HttpClients
 * JD-Core Version:    0.6.2
 */