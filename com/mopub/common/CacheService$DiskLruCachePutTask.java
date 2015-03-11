package com.mopub.common;

import android.os.AsyncTask;

class CacheService$DiskLruCachePutTask extends AsyncTask<Void, Void, Void>
{
  private final byte[] mContent;
  private final String mKey;

  CacheService$DiskLruCachePutTask(String paramString, byte[] paramArrayOfByte)
  {
    this.mKey = paramString;
    this.mContent = paramArrayOfByte;
  }

  protected Void doInBackground(Void[] paramArrayOfVoid)
  {
    CacheService.putToDiskCache(this.mKey, this.mContent);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.CacheService.DiskLruCachePutTask
 * JD-Core Version:    0.6.2
 */