package com.admarvel.android.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;

class AdMarvelWebView$aj
  implements Runnable
{
  String a;
  String b;
  InputStream c = null;
  Bitmap d = null;
  private final WeakReference<AdMarvelWebView> e;
  private final WeakReference<AdMarvelInternalWebView> f;

  public AdMarvelWebView$aj(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString1, String paramString2)
  {
    this.e = new WeakReference(paramAdMarvelWebView);
    this.f = new WeakReference(paramAdMarvelInternalWebView);
    this.a = paramString1;
    this.b = paramString2;
  }

  @TargetApi(14)
  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.e.get();
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.f.get();
    if ((localAdMarvelInternalWebView == null) || (localAdMarvelWebView == null));
    label432: 
    do
    {
      return;
      String str1 = Environment.getExternalStorageDirectory().toString() + "/Pictures/";
      while (true)
      {
        try
        {
          if (this.a.startsWith("/mnt/sdcard"))
          {
            if (new File(this.a).exists())
            {
              this.d = BitmapFactory.decodeFile(this.a);
              if ((this.d == null) && (this.c != null))
              {
                Thread localThread2 = new Thread(new Runnable()
                {
                  public void run()
                  {
                    AdMarvelWebView.aj.this.d = BitmapFactory.decodeStream(AdMarvelWebView.aj.this.c);
                  }
                });
                localThread2.start();
                localThread2.join();
              }
              if (this.d != null)
                break label432;
              localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"NO\")");
              return;
            }
            localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"NO\")");
            continue;
          }
        }
        catch (Exception localException)
        {
          localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"NO\")");
          Logging.log(Log.getStackTraceString(localException));
          return;
          if ((this.a.startsWith("http:")) || (this.a.startsWith("https:")))
          {
            this.a = ab.a(this.a, localAdMarvelWebView.getContext());
            Thread localThread1 = new Thread(new Runnable()
            {
              public void run()
              {
                try
                {
                  AdMarvelWebView.aj.this.c = new URL(AdMarvelWebView.aj.this.a).openStream();
                  return;
                }
                catch (MalformedURLException localMalformedURLException)
                {
                  localMalformedURLException.printStackTrace();
                  return;
                }
                catch (IOException localIOException)
                {
                  localIOException.printStackTrace();
                  return;
                }
                catch (Exception localException)
                {
                  localException.printStackTrace();
                }
              }
            });
            localThread1.start();
            localThread1.join();
            continue;
          }
        }
        finally
        {
          if (this.d != null)
          {
            this.d.recycle();
            this.d = null;
          }
        }
        if (this.a.startsWith("file:///android_asset/"))
        {
          int i = "file:///android_asset/".length();
          String str3 = this.a.substring(i);
          this.c = localAdMarvelWebView.getContext().getAssets().open(str3);
        }
      }
      File localFile = new File(str1);
      if (!localFile.exists())
        localFile.mkdirs();
      String str2 = str1 + System.currentTimeMillis() + ".jpg";
      FileOutputStream localFileOutputStream = new FileOutputStream(str2);
      if (this.d != null)
      {
        this.d.compress(Bitmap.CompressFormat.JPEG, 90, localFileOutputStream);
        localFileOutputStream.flush();
        localFileOutputStream.close();
      }
      Intent localIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
      localIntent.setData(Uri.fromFile(new File(str2)));
      localAdMarvelWebView.getContext().sendBroadcast(localIntent);
      localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"YES\")");
    }
    while (this.d == null);
    this.d.recycle();
    this.d = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.aj
 * JD-Core Version:    0.6.2
 */