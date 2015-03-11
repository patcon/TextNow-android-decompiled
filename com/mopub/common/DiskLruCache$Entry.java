package com.mopub.common;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class DiskLruCache$Entry
{
  private DiskLruCache.Editor currentEditor;
  private final String key;
  private final long[] lengths;
  private boolean readable;
  private long sequenceNumber;

  private DiskLruCache$Entry(DiskLruCache paramDiskLruCache, String paramString)
  {
    this.key = paramString;
    this.lengths = new long[DiskLruCache.access$1800(paramDiskLruCache)];
  }

  private IOException invalidLengths(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }

  private void setLengths(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != DiskLruCache.access$1800(this.this$0))
      throw invalidLengths(paramArrayOfString);
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        this.lengths[i] = Long.parseLong(paramArrayOfString[i]);
        i++;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw invalidLengths(paramArrayOfString);
    }
  }

  public final File getCleanFile(int paramInt)
  {
    return new File(DiskLruCache.access$1900(this.this$0), this.key + "." + paramInt);
  }

  public final File getDirtyFile(int paramInt)
  {
    return new File(DiskLruCache.access$1900(this.this$0), this.key + "." + paramInt + ".tmp");
  }

  public final String getLengths()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.lengths)
      localStringBuilder.append(' ').append(l);
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.DiskLruCache.Entry
 * JD-Core Version:    0.6.2
 */