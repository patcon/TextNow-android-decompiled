package com.admarvel.android.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.admarvel.android.ads.AdMarvelUtils;
import com.admarvel.android.util.Logging;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

public class c$b
  implements Runnable
{
  public boolean a = false;
  private URL c;
  private ArrayList<String> d;
  private String e;
  private Context f;

  public c$b(c paramc, URL paramURL, String paramString, Context paramContext)
  {
    this.c = paramURL;
    this.e = paramString;
    this.f = paramContext;
  }

  public c$b(c paramc, URL paramURL, String paramString, boolean paramBoolean, Context paramContext)
  {
    this.c = paramURL;
    this.e = paramString;
    this.f = paramContext;
  }

  public ArrayList<String> a()
  {
    return this.d;
  }

  public void run()
  {
    if ((this.c != null) && (AdMarvelUtils.isNetworkAvailable(this.f)));
    while (true)
    {
      BufferedInputStream localBufferedInputStream;
      FileOutputStream localFileOutputStream;
      try
      {
        URLConnection localURLConnection = this.c.openConnection();
        localURLConnection.connect();
        localBufferedInputStream = new BufferedInputStream(this.c.openStream());
        if (!"gzip".equals(localURLConnection.getContentEncoding()))
          break label431;
        localObject = new GZIPInputStream(localBufferedInputStream);
        localFileOutputStream = new FileOutputStream(this.e + "/tmp.zip");
        byte[] arrayOfByte = new byte[4096];
        int i = ((InputStream)localObject).read(arrayOfByte);
        if (i != -1)
        {
          localFileOutputStream.write(arrayOfByte, 0, i);
          continue;
        }
      }
      catch (IOException localIOException)
      {
        Logging.log("Offline SDK:" + Log.getStackTraceString(localIOException));
        this.a = false;
      }
      while (true)
      {
        this.a = true;
        do
        {
          return;
          localFileOutputStream.flush();
          localFileOutputStream.close();
          ((InputStream)localObject).close();
          this.d = d.a(this.e + "/tmp.zip", this.e);
        }
        while (c.a(this.b).get() == null);
        if (c.b(this.b) == null)
        {
          c.a(this.b, (ArrayList)a.a("/complete_ad_content_path_list", "/complete_ad_content_path_list", (Context)c.a(this.b).get()));
          if (c.b(this.b) == null)
            c.a(this.b, new ArrayList());
        }
        if (this.d != null)
          c.b(this.b).addAll(this.d);
      }
      this.a = false;
      if (c.a(this.b).get() != null);
      for (SharedPreferences localSharedPreferences = ((Activity)c.a(this.b).get()).getSharedPreferences("admarvel_preferences", 0); localSharedPreferences == null; localSharedPreferences = null)
      {
        Logging.log("Offline SDK:package cannot be downloaded shared preference is null ");
        c.a(false);
        c.b(false);
        return;
      }
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      c.a(this.b, localEditor, "-1");
      localEditor.commit();
      Logging.log("Offline SDK:package cannot be downloaded because internet is not available ");
      c.a(false);
      c.b(false);
      return;
      label431: Object localObject = localBufferedInputStream;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.b.c.b
 * JD-Core Version:    0.6.2
 */