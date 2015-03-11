package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import com.admarvel.android.util.Logging;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.util.ByteArrayBuffer;

class k extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<Context> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private final File c;

  public k(Context paramContext, AdMarvelInternalWebView paramAdMarvelInternalWebView, File paramFile)
  {
    this.a = new WeakReference(paramContext);
    this.c = paramFile;
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  private void a(String paramString, File paramFile)
  {
    URL localURL = new URL(paramString);
    long l = System.currentTimeMillis();
    Logging.log("download begining");
    Logging.log("download url:" + localURL);
    Logging.log("downloaded file name:" + paramFile.getName());
    URLConnection localURLConnection = localURL.openConnection();
    if (isCancelled());
    ByteArrayBuffer localByteArrayBuffer;
    do
    {
      do
      {
        return;
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(localURLConnection.getInputStream());
        localByteArrayBuffer = new ByteArrayBuffer(50);
        do
        {
          int i = localBufferedInputStream.read();
          if (i == -1)
            break;
          localByteArrayBuffer.append((byte)i);
        }
        while (!isCancelled());
        return;
        Logging.log(Environment.getExternalStorageState());
      }
      while (isCancelled());
      paramFile.getParentFile().mkdirs();
    }
    while (isCancelled());
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    localFileOutputStream.write(localByteArrayBuffer.toByteArray());
    localFileOutputStream.close();
    Logging.log("download ready in" + (System.currentTimeMillis() - l) / 1000L + " sec");
  }

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    Context localContext = (Context)this.a.get();
    if (localContext == null);
    String str1;
    String str2;
    AdMarvelInternalWebView localAdMarvelInternalWebView1;
    do
      while (true)
      {
        return null;
        str1 = (String)paramArrayOfObject[0];
        str2 = (String)paramArrayOfObject[1];
        int i = ((Integer)paramArrayOfObject[2]).intValue();
        try
        {
          String str3 = new URL(str1).getFile().split("\\?")[0];
          localFile1 = new File(this.c, "/data/com.admarvel.android.admarvelcachedads/cachedads" + str3);
          localFile2 = new File(this.c, "/data/com.admarvel.android.admarvelcachedads/cachedads" + str3 + ".tmp");
          Logging.log("file: " + localFile1.getAbsolutePath());
          Logging.log("tmpfile: " + localFile2.getAbsolutePath());
          if (localFile1.exists())
          {
            if (System.currentTimeMillis() - localFile1.lastModified() > i)
            {
              localFile1.delete();
              if (localFile2.exists())
                localFile2.delete();
              a(str1, localFile2);
              localFile2.renameTo(localFile1);
            }
            AdMarvelInternalWebView localAdMarvelInternalWebView4 = (AdMarvelInternalWebView)this.b.get();
            if (localAdMarvelInternalWebView4 == null)
              continue;
            String str4 = "content://" + localContext.getPackageName() + ".AdMarvelLocalFileContentProvider" + "/cachedads" + str3;
            localAdMarvelInternalWebView4.loadUrl("javascript:" + str2 + "(true,\"" + str1 + "\", \"" + str4 + "\")");
            return null;
          }
        }
        catch (RuntimeException localRuntimeException)
        {
          while (true)
          {
            File localFile1;
            File localFile2;
            AdMarvelInternalWebView localAdMarvelInternalWebView3 = (AdMarvelInternalWebView)this.b.get();
            if (localAdMarvelInternalWebView3 == null)
              break;
            localAdMarvelInternalWebView3.loadUrl("javascript:" + str2 + "(false,\"" + str1 + "\", \"\")");
            return null;
            if (localFile2.exists())
              localFile2.delete();
            a(str1, localFile2);
            localFile2.renameTo(localFile1);
          }
        }
        catch (IOException localIOException)
        {
          AdMarvelInternalWebView localAdMarvelInternalWebView2 = (AdMarvelInternalWebView)this.b.get();
          if (localAdMarvelInternalWebView2 != null)
          {
            localAdMarvelInternalWebView2.loadUrl("javascript:" + str2 + "(false,\"" + str1 + "\", \"\")");
            return null;
          }
        }
        catch (Exception localException)
        {
          localAdMarvelInternalWebView1 = (AdMarvelInternalWebView)this.b.get();
        }
      }
    while (localAdMarvelInternalWebView1 == null);
    localAdMarvelInternalWebView1.loadUrl("javascript:" + str2 + "(false,\"" + str1 + "\", \"\")");
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.k
 * JD-Core Version:    0.6.2
 */