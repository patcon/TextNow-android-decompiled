package com.admarvel.android.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

class ab$d extends AsyncTask<Void, Void, Boolean>
{
  private String b;

  public ab$d(ab paramab, String paramString)
  {
    this.b = paramString;
  }

  protected Boolean a(Void[] paramArrayOfVoid)
  {
    try
    {
      Context localContext = (Context)ab.a(this.a).get();
      if (localContext == null)
        return Boolean.valueOf(false);
      if (((ConnectivityManager)localContext.getSystemService("connectivity")).getActiveNetworkInfo().isConnected())
      {
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.b).openConnection();
        localHttpURLConnection.setReadTimeout(10000);
        localHttpURLConnection.setConnectTimeout(5000);
        localHttpURLConnection.connect();
        if (localHttpURLConnection.getResponseCode() == 200)
          return Boolean.valueOf(true);
        Boolean localBoolean = Boolean.valueOf(false);
        return localBoolean;
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return Boolean.valueOf(false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ab.d
 * JD-Core Version:    0.6.2
 */