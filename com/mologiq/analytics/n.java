package com.mologiq.analytics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class n
{
  private final File a;
  private final File b;

  n(File paramFile)
  {
    this.a = paramFile;
    this.b = new File(paramFile.getPath() + ".bak");
  }

  final FileOutputStream a()
  {
    if (this.a.exists())
    {
      if (this.b.exists())
        break label85;
      if (!this.a.renameTo(this.b))
        ak.a("Couldn't rename file " + this.a + " to backup file " + this.b);
    }
    try
    {
      while (true)
      {
        FileOutputStream localFileOutputStream1 = new FileOutputStream(this.a);
        return localFileOutputStream1;
        label85: this.a.delete();
      }
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      File localFile = this.a.getParentFile();
      if (!localFile.mkdir())
        throw new IOException("Couldn't create directory " + this.a);
      FileUtils.setPermissions(localFile.getPath(), 505, -1, -1);
      try
      {
        FileOutputStream localFileOutputStream2 = new FileOutputStream(this.a);
        return localFileOutputStream2;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
      }
    }
    throw new IOException("Couldn't create " + this.a);
  }

  final void a(FileOutputStream paramFileOutputStream)
  {
    if (paramFileOutputStream != null);
    try
    {
      paramFileOutputStream.close();
      this.b.delete();
      return;
    }
    catch (IOException localIOException)
    {
      ak.a("finishWrite: Got exception:" + localIOException.getStackTrace().toString());
    }
  }

  final byte[] b()
  {
    int i = 0;
    if (this.b.exists())
    {
      this.a.delete();
      this.b.renameTo(this.a);
    }
    FileInputStream localFileInputStream = new FileInputStream(this.a);
    while (true)
    {
      Object localObject2;
      try
      {
        localObject2 = new byte[localFileInputStream.available()];
        int j = localFileInputStream.read((byte[])localObject2, i, localObject2.length - i);
        if (j <= 0)
          return localObject2;
        int k = j + i;
        int m = localFileInputStream.available();
        if (m > localObject2.length - k)
        {
          localObject3 = new byte[m + k];
          System.arraycopy(localObject2, 0, localObject3, 0, k);
          localObject2 = localObject3;
          i = k;
          continue;
        }
      }
      finally
      {
        localFileInputStream.close();
      }
      Object localObject3 = localObject2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.n
 * JD-Core Version:    0.6.2
 */