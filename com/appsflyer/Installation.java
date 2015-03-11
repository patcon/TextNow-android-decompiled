package com.appsflyer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.UUID;

public class Installation
{
  private static final String INSTALLATION = "AF_INSTALLATION";
  private static String sID = null;

  public static String id(Context paramContext)
  {
    try
    {
      File localFile;
      if (sID == null)
        localFile = new File(paramContext.getFilesDir(), "AF_INSTALLATION");
      try
      {
        if (!localFile.exists())
          writeInstallationFile(localFile, paramContext);
        sID = readInstallationFile(localFile);
        String str = sID;
        return str;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    finally
    {
    }
  }

  private static String readInstallationFile(File paramFile)
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "r");
    byte[] arrayOfByte = new byte[(int)localRandomAccessFile.length()];
    localRandomAccessFile.readFully(arrayOfByte);
    localRandomAccessFile.close();
    return new String(arrayOfByte);
  }

  private static void writeInstallationFile(File paramFile, Context paramContext)
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
    if (Build.VERSION.SDK_INT >= 9);
    for (String str = localPackageInfo.firstInstallTime + "-" + Math.abs(new Random().nextLong()); ; str = UUID.randomUUID().toString())
    {
      localFileOutputStream.write(str.getBytes());
      localFileOutputStream.close();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.Installation
 * JD-Core Version:    0.6.2
 */