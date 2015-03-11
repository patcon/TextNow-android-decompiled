package com.admarvel.android.a;

import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;

public class c extends AsyncTask<Object, Object, Object>
{
  private static long a = 864000000L;

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        File localFile1 = new File(Environment.getExternalStorageDirectory(), "/" + e.a("adm_tracker_dir"));
        if (localFile1.exists())
          for (File localFile2 : localFile1.listFiles())
            if (System.currentTimeMillis() - localFile2.lastModified() > a)
              localFile2.delete();
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
 * Qualified Name:     com.admarvel.android.a.c
 * JD-Core Version:    0.6.2
 */