package textnow.bo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import textnow.bm.a;

public final class b extends AsyncTask<String, Integer, Boolean>
{
  private Context a;
  private a b;
  private String c;
  private String d;
  private String e;
  private ProgressDialog f;

  public b(Context paramContext, String paramString, a parama)
  {
    this.a = paramContext;
    this.c = paramString;
    this.d = (UUID.randomUUID() + ".apk");
    this.e = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
    this.b = parama;
  }

  private Boolean b()
  {
    URLConnection localURLConnection;
    int i;
    File localFile1;
    try
    {
      localURLConnection = new URL(this.c + "&type=apk").openConnection();
      localURLConnection.setRequestProperty("connection", "close");
      localURLConnection.connect();
      i = localURLConnection.getContentLength();
      localFile1 = new File(this.e);
      if ((!localFile1.mkdirs()) && (!localFile1.exists()))
        throw new IOException("Could not create the dir(s):" + localFile1.getAbsolutePath());
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return Boolean.valueOf(false);
    }
    File localFile2 = new File(localFile1, this.d);
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localURLConnection.getInputStream());
    FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
    byte[] arrayOfByte = new byte[1024];
    long l = 0L;
    while (true)
    {
      int j = localBufferedInputStream.read(arrayOfByte);
      if (j == -1)
        break;
      l += j;
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf((int)(100L * l / i));
      publishProgress(arrayOfInteger);
      localFileOutputStream.write(arrayOfByte, 0, j);
    }
    localFileOutputStream.flush();
    localFileOutputStream.close();
    localBufferedInputStream.close();
    if (l > 0L);
    for (boolean bool = true; ; bool = false)
    {
      Boolean localBoolean = Boolean.valueOf(bool);
      return localBoolean;
    }
  }

  public final void a()
  {
    this.a = null;
    this.f = null;
  }

  public final void a(Context paramContext)
  {
    this.a = paramContext;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bo.b
 * JD-Core Version:    0.6.2
 */