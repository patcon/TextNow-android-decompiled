package com.mopub.nativeads;

import android.os.SystemClock;

class TimestampWrapper<T>
{
  long mCreatedTimestamp;
  final T mInstance;

  TimestampWrapper(T paramT)
  {
    this.mInstance = paramT;
    this.mCreatedTimestamp = SystemClock.uptimeMillis();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.TimestampWrapper
 * JD-Core Version:    0.6.2
 */