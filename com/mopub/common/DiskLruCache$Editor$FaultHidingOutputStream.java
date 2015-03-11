package com.mopub.common;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class DiskLruCache$Editor$FaultHidingOutputStream extends FilterOutputStream
{
  private DiskLruCache$Editor$FaultHidingOutputStream(DiskLruCache.Editor paramEditor, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  public void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$2302(this.this$1, true);
    }
  }

  public void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$2302(this.this$1, true);
    }
  }

  public void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$2302(this.this$1, true);
    }
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$2302(this.this$1, true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.DiskLruCache.Editor.FaultHidingOutputStream
 * JD-Core Version:    0.6.2
 */