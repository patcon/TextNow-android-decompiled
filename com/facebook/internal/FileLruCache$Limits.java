package com.facebook.internal;

import java.security.InvalidParameterException;

public final class FileLruCache$Limits
{
  private int byteCount = 1048576;
  private int fileCount = 1024;

  final int getByteCount()
  {
    return this.byteCount;
  }

  final int getFileCount()
  {
    return this.fileCount;
  }

  final void setByteCount(int paramInt)
  {
    if (paramInt < 0)
      throw new InvalidParameterException("Cache byte-count limit must be >= 0");
    this.byteCount = paramInt;
  }

  final void setFileCount(int paramInt)
  {
    if (paramInt < 0)
      throw new InvalidParameterException("Cache file count limit must be >= 0");
    this.fileCount = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.Limits
 * JD-Core Version:    0.6.2
 */