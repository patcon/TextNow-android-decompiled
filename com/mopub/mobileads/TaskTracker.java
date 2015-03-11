package com.mopub.mobileads;

public class TaskTracker
{
  private long mCurrentTaskId = -1L;
  private long mLastCompletedTaskId;

  public long getCurrentTaskId()
  {
    return this.mCurrentTaskId;
  }

  public boolean isMostCurrentTask(long paramLong)
  {
    return paramLong >= this.mLastCompletedTaskId;
  }

  public void markTaskCompleted(long paramLong)
  {
    if (paramLong > this.mLastCompletedTaskId)
      this.mLastCompletedTaskId = paramLong;
  }

  public void newTaskStarted()
  {
    this.mCurrentTaskId = (1L + this.mCurrentTaskId);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.TaskTracker
 * JD-Core Version:    0.6.2
 */