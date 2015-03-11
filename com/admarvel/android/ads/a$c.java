package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class a$c extends AsyncTask<Void, Void, Boolean>
{
  private final String a;
  private final String b;
  private FileOutputStream c;
  private int d = 0;

  public a$c(String paramString1, String paramString2, int paramInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramInt;
  }

  protected Boolean a(Void[] paramArrayOfVoid)
  {
    if (isCancelled())
      return Boolean.valueOf(false);
    File localFile1 = new File(this.b + ".PROCESSING");
    if (localFile1.exists())
      return Boolean.valueOf(true);
    localFile1.deleteOnExit();
    InputStream localInputStream;
    try
    {
      if (isCancelled())
      {
        if (localFile1.exists())
          localFile1.delete();
        return Boolean.valueOf(false);
      }
      URLConnection localURLConnection = new URL(this.a).openConnection();
      localURLConnection.setConnectTimeout(3000);
      localURLConnection.setReadTimeout(10000);
      localURLConnection.connect();
      if (isCancelled())
      {
        if (localFile1.exists())
          localFile1.delete();
        return Boolean.valueOf(false);
      }
      localInputStream = localURLConnection.getInputStream();
      if (localInputStream == null)
        throw new RuntimeException("stream is null");
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      if (localFile1.exists())
        localFile1.delete();
      return Boolean.valueOf(false);
    }
    if (isCancelled())
    {
      if (localFile1.exists())
        localFile1.delete();
      return Boolean.valueOf(false);
    }
    if (localFile1.exists())
      return Boolean.valueOf(true);
    this.c = new FileOutputStream(localFile1);
    byte[] arrayOfByte = new byte[4096];
    while (!isCancelled())
    {
      int i = localInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      this.c.write(arrayOfByte, 0, i);
    }
    if (isCancelled())
    {
      if (localFile1.exists())
        localFile1.delete();
      return Boolean.valueOf(false);
    }
    File localFile2 = new File(this.b);
    if (localFile2.exists())
      localFile2.delete();
    localFile1.renameTo(localFile2);
    if (localFile1.exists())
      localFile1.delete();
    localInputStream.close();
    this.c.flush();
    this.c = null;
    return Boolean.valueOf(true);
  }

  protected void a(Boolean paramBoolean)
  {
    if ((!paramBoolean.booleanValue()) && (this.d <= 0))
    {
      if (Version.getAndroidSDKVersion() < 11)
        break label60;
      Logging.log("#### onPostExecute");
      new c(this.a, this.b, 1).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
    while (true)
    {
      super.onPostExecute(paramBoolean);
      return;
      label60: new c(this.a, this.b, 1).execute(new Void[0]);
    }
  }

  protected void onCancelled()
  {
    File localFile = new File(this.b);
    if (localFile.exists())
      localFile.delete();
    super.onCancelled();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.a.c
 * JD-Core Version:    0.6.2
 */