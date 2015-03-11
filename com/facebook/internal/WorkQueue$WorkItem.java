package com.facebook.internal;

abstract interface WorkQueue$WorkItem
{
  public abstract boolean cancel();

  public abstract boolean isRunning();

  public abstract void moveToFront();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue.WorkItem
 * JD-Core Version:    0.6.2
 */