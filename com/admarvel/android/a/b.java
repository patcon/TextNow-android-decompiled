package com.admarvel.android.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.webkit.WebView;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class b extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<Context> a;
  private final StringBuilder b;

  public b(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
    this.b = new StringBuilder();
  }

  private boolean a(Context paramContext, ArrayList<String> paramArrayList)
  {
    if (paramArrayList != null)
      try
      {
        Iterator localIterator = paramArrayList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          this.b.append("<img src=\"").append(str).append("\" />");
        }
      }
      catch (Exception localException)
      {
        Log.getStackTraceString(localException);
        return false;
      }
    if ((this.b != null) && (this.b.length() > 0))
      if (Thread.currentThread().getName().equalsIgnoreCase("main"))
      {
        WebView localWebView = new WebView(paramContext.getApplicationContext());
        Logging.log("Firing Install Tracking Pixels: " + this.b.toString());
        localWebView.loadDataWithBaseURL(null, this.b.toString(), "text/html", "utf-8", null);
      }
      else
      {
        Thread local1 = new Thread()
        {
          public void run()
          {
            if (b.a(b.this) != null)
            {
              Context localContext = (Context)b.a(b.this).get();
              if (localContext != null)
              {
                WebView localWebView = new WebView(localContext.getApplicationContext());
                Logging.log("Firing Install Tracking Pixels: " + b.b(b.this).toString());
                localWebView.loadDataWithBaseURL(null, b.b(b.this).toString(), "text/html", "utf-8", null);
              }
            }
          }
        };
        if ((paramContext instanceof Activity))
          ((Activity)paramContext).runOnUiThread(local1);
      }
    return true;
  }

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    int i = 0;
    try
    {
      if (this.a != null)
      {
        Context localContext = (Context)this.a.get();
        if (localContext != null)
        {
          SharedPreferences localSharedPreferences = localContext.getSharedPreferences(e.a("admarvel"), 0);
          if (!localSharedPreferences.getBoolean(e.a("registered_tracking_event"), false))
          {
            String str = localContext.getPackageName();
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
              File localFile3 = new File(Environment.getExternalStorageDirectory(), "/" + e.a("adm_tracker_dir") + "/" + e.a(str));
              if (localFile3.exists())
              {
                Object localObject2 = new ObjectInputStream(new FileInputStream(localFile3)).readObject();
                if (((localObject2 instanceof ArrayList)) && (a(localContext, (ArrayList)localObject2)))
                {
                  SharedPreferences.Editor localEditor = localSharedPreferences.edit();
                  localEditor.putBoolean(e.a("registered_tracking_event"), true);
                  localEditor.commit();
                  localFile3.delete();
                }
              }
            }
          }
          File localFile1 = new File(Environment.getExternalStorageDirectory(), "/" + e.a("adm_tracker_dir"));
          if ((localFile1.exists()) && (localFile1.isDirectory()))
          {
            File[] arrayOfFile = localFile1.listFiles();
            while (i < arrayOfFile.length)
            {
              File localFile2 = arrayOfFile[i];
              if ((localFile2.isFile()) && (e.a(localContext, e.b(localFile2.getName()))))
              {
                Object localObject1 = new ObjectInputStream(new FileInputStream(localFile2)).readObject();
                if (((localObject1 instanceof ArrayList)) && (a(localContext, (ArrayList)localObject1)))
                  localFile2.delete();
              }
              i++;
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.a.b
 * JD-Core Version:    0.6.2
 */