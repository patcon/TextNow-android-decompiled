package com.mopub.nativeads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class TaskManager<T>
{
  protected final AtomicInteger mCompletedCount;
  protected final AtomicBoolean mFailed;
  protected final TaskManager.TaskManagerListener<T> mImageTaskManagerListener;
  protected final Map<String, T> mResults;
  protected final int mSize;

  TaskManager(List<String> paramList, TaskManager.TaskManagerListener<T> paramTaskManagerListener)
  {
    if (paramList == null)
      throw new IllegalArgumentException("Urls list cannot be null");
    if (paramList.contains(null))
      throw new IllegalArgumentException("Urls list cannot contain null");
    if (paramTaskManagerListener == null)
      throw new IllegalArgumentException("ImageTaskManagerListener cannot be null");
    this.mSize = paramList.size();
    this.mImageTaskManagerListener = paramTaskManagerListener;
    this.mCompletedCount = new AtomicInteger(0);
    this.mFailed = new AtomicBoolean(false);
    this.mResults = Collections.synchronizedMap(new HashMap(this.mSize));
  }

  abstract void execute();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.TaskManager
 * JD-Core Version:    0.6.2
 */