package com.admarvel.android.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class c
{
  private String[] a;
  private String b;

  public c(String[] paramArrayOfString, String paramString)
  {
    this.a = paramArrayOfString;
    this.b = paramString;
  }

  public void a()
  {
    ZipOutputStream localZipOutputStream;
    for (int i = 0; ; i++)
    {
      BufferedInputStream localBufferedInputStream;
      try
      {
        localZipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(this.b)));
        byte[] arrayOfByte = new byte[2048];
        if (i >= this.a.length)
          break;
        localBufferedInputStream = new BufferedInputStream(new FileInputStream(this.a[i]), 2048);
        localZipOutputStream.putNextEntry(new ZipEntry(this.a[i].substring(1 + this.a[i].lastIndexOf("/"))));
        while (true)
        {
          int j = localBufferedInputStream.read(arrayOfByte, 0, 2048);
          if (j == -1)
            break;
          localZipOutputStream.write(arrayOfByte, 0, j);
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      localBufferedInputStream.close();
    }
    localZipOutputStream.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.c
 * JD-Core Version:    0.6.2
 */