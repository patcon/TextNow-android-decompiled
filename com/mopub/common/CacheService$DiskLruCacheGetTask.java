package com.mopub.common;

import android.os.AsyncTask;

class CacheService$DiskLruCacheGetTask extends AsyncTask<Void, Void, byte[]>
{
  private final CacheService.DiskLruCacheGetListener mDiskLruCacheGetListener;
  private final String mKey;

  CacheService$DiskLruCacheGetTask(String paramString, CacheService.DiskLruCacheGetListener paramDiskLruCacheGetListener)
  {
    this.mDiskLruCacheGetListener = paramDiskLruCacheGetListener;
    this.mKey = paramString;
  }

  protected byte[] doInBackground(Void[] paramArrayOfVoid)
  {
    return CacheService.getFromDiskCache(this.mKey);
  }

  protected void onCancelled()
  {
    if (this.mDiskLruCacheGetListener != null)
      this.mDiskLruCacheGetListener.onComplete(this.mKey, null);
  }

  protected void onPostExecute(byte[] paramArrayOfByte)
  {
    if (isCancelled())
      onCancelled();
    while (this.mDiskLruCacheGetListener == null)
      return;
    this.mDiskLruCacheGetListener.onComplete(this.mKey, paramArrayOfByte);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.CacheService.DiskLruCacheGetTask
 * JD-Core Version:    0.6.2
 */