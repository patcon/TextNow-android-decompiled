package com.admarvel.android.ads;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;

class d extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<Context> a;
  private final File b;

  public d(Context paramContext, File paramFile)
  {
    this.a = new WeakReference(paramContext);
    this.b = paramFile;
  }

  void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        a(arrayOfFile[j]);
    }
    if (System.currentTimeMillis() - paramFile.lastModified() > 2592000L)
      paramFile.delete();
  }

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    if ((Context)this.a.get() == null);
    while (true)
    {
      return null;
      try
      {
        File localFile = new File(this.b, "/data/com.admarvel.android.admarvelcachedads/cachedads");
        if (localFile.exists())
        {
          File[] arrayOfFile = localFile.listFiles();
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            a(arrayOfFile[j]);
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d
 * JD-Core Version:    0.6.2
 */