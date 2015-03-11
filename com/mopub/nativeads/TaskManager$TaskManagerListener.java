package com.mopub.nativeads;

import java.util.Map;

abstract interface TaskManager$TaskManagerListener<T>
{
  public abstract void onFail();

  public abstract void onSuccess(Map<String, T> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.TaskManager.TaskManagerListener
 * JD-Core Version:    0.6.2
 */