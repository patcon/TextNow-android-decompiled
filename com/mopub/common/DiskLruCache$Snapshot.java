package com.mopub.common;

import java.io.Closeable;
import java.io.InputStream;

public final class DiskLruCache$Snapshot
  implements Closeable
{
  private final InputStream[] ins;
  private final String key;
  private final long[] lengths;
  private final long sequenceNumber;

  private DiskLruCache$Snapshot(DiskLruCache paramDiskLruCache, String paramString, long paramLong, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
  {
    this.key = paramString;
    this.sequenceNumber = paramLong;
    this.ins = paramArrayOfInputStream;
    this.lengths = paramArrayOfLong;
  }

  public final void close()
  {
    InputStream[] arrayOfInputStream = this.ins;
    int i = arrayOfInputStream.length;
    for (int j = 0; j < i; j++)
      DiskLruCacheUtil.closeQuietly(arrayOfInputStream[j]);
  }

  public final DiskLruCache.Editor edit()
  {
    return DiskLruCache.access$1600(this.this$0, this.key, this.sequenceNumber);
  }

  public final InputStream getInputStream(int paramInt)
  {
    return this.ins[paramInt];
  }

  public final long getLength(int paramInt)
  {
    return this.lengths[paramInt];
  }

  public final String getString(int paramInt)
  {
    return DiskLruCache.access$1700(getInputStream(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.DiskLruCache.Snapshot
 * JD-Core Version:    0.6.2
 */