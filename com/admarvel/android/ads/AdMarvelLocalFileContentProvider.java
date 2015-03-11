package com.admarvel.android.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class AdMarvelLocalFileContentProvider extends ContentProvider
{
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Not supported by this provider");
  }

  public String getType(Uri paramUri)
  {
    throw new UnsupportedOperationException("Not supported by this provider");
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("Not supported by this provider");
  }

  public boolean onCreate()
  {
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    int i = 0;
    String str1 = paramUri.getPath().replace("content://" + getContext().getPackageName() + ".AdMarvelLocalFileContentProvider", "");
    File localFile1;
    if ((str1 != null) && ((str1.equals("/mraid.js")) || (str1.equals("mraid.js"))))
    {
      localFile1 = getContext().getDir("adm_mraid_file", 0);
      if ((localFile1 == null) || (!localFile1.isDirectory()))
        break label640;
    }
    label640: for (File localFile2 = new File(localFile1.getAbsolutePath() + "/mraid.js"); ; localFile2 = null)
    {
      if ((localFile2 != null) && (localFile2.exists()))
      {
        try
        {
          Logging.log("Mraid loading from client");
          ParcelFileDescriptor localParcelFileDescriptor = ParcelFileDescriptor.open(localFile2, 268435456);
          return localParcelFileDescriptor;
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
        }
        return null;
      }
      while (true)
      {
        InputStream localInputStream;
        ArrayList localArrayList;
        int m;
        try
        {
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js").openConnection();
          localHttpURLConnection.setRequestMethod("GET");
          localHttpURLConnection.setDoOutput(false);
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setRequestProperty("Content-Length", "0");
          localHttpURLConnection.setConnectTimeout(2000);
          localHttpURLConnection.setReadTimeout(10000);
          int j = localHttpURLConnection.getResponseCode();
          int k = localHttpURLConnection.getContentLength();
          Logging.log("Mraid Connection Status Code: " + j);
          Logging.log("Mraid Content Length: " + k);
          if (j != 200)
            break;
          localInputStream = (InputStream)localHttpURLConnection.getContent();
          if ((!"gzip".equals(localHttpURLConnection.getContentEncoding())) || (Version.getAndroidSDKVersion() >= 9))
            break label633;
          localObject = new GZIPInputStream(localInputStream);
          localArrayList = new ArrayList();
          m = 0;
          int n = 8192;
          if (n == -1)
            break label455;
          byte[] arrayOfByte1 = new byte[8192];
          n = ((InputStream)localObject).read(arrayOfByte1, 0, 8192);
          if (n <= 0)
            continue;
          AdMarvelLocalFileContentProvider.a locala1 = new AdMarvelLocalFileContentProvider.a(null);
          locala1.a = arrayOfByte1;
          locala1.b = n;
          m += n;
          localArrayList.add(locala1);
          continue;
        }
        catch (IOException localIOException1)
        {
          localIOException1.printStackTrace();
        }
        break;
        label455: ((InputStream)localObject).close();
        byte[] arrayOfByte2;
        if (m > 0)
        {
          arrayOfByte2 = new byte[m];
          for (int i1 = 0; i1 < localArrayList.size(); i1++)
          {
            AdMarvelLocalFileContentProvider.a locala2 = (AdMarvelLocalFileContentProvider.a)localArrayList.get(i1);
            System.arraycopy(locala2.a, 0, arrayOfByte2, i, locala2.b);
            i += locala2.b;
          }
        }
        for (String str2 = new String(arrayOfByte2); ; str2 = "")
        {
          FileOutputStream localFileOutputStream = getContext().openFileOutput("admarvel_mraid.js", 0);
          try
          {
            localFileOutputStream.write(str2.getBytes());
            localFileOutputStream.close();
            return ParcelFileDescriptor.open(new File("/data/data/" + getContext().getPackageName() + "/files", "admarvel_mraid.js"), 268435456);
          }
          catch (IOException localIOException2)
          {
            while (true)
              localIOException2.printStackTrace();
          }
        }
        label633: Object localObject = localInputStream;
      }
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    throw new UnsupportedOperationException("Not supported by this provider");
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("Not supported by this provider");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelLocalFileContentProvider
 * JD-Core Version:    0.6.2
 */