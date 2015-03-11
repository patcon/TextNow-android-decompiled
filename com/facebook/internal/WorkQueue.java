package com.facebook.internal;

import com.facebook.Settings;
import java.util.concurrent.Executor;

class WorkQueue
{
  public static final int DEFAULT_MAX_CONCURRENT = 8;
  private final Executor executor;
  private final int maxConcurrent;
  private WorkQueue.WorkNode pendingJobs;
  private int runningCount = 0;
  private WorkQueue.WorkNode runningJobs = null;
  private final Object workLock = new Object();

  static
  {
    if (!WorkQueue.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  WorkQueue()
  {
    this(8);
  }

  WorkQueue(int paramInt)
  {
    this(paramInt, Settings.getExecutor());
  }

  WorkQueue(int paramInt, Executor paramExecutor)
  {
    this.maxConcurrent = paramInt;
    this.executor = paramExecutor;
  }

  private void execute(final WorkQueue.WorkNode paramWorkNode)
  {
    this.executor.execute(new Runnable()
    {
      public void run()
      {
        try
        {
          paramWorkNode.getCallback().run();
          return;
        }
        finally
        {
          WorkQueue.this.finishItemAndStartNew(paramWorkNode);
        }
      }
    });
  }

  private void finishItemAndStartNew(WorkQueue.WorkNode paramWorkNode)
  {
    Object localObject1 = this.workLock;
    if (paramWorkNode != null);
    try
    {
      this.runningJobs = paramWorkNode.removeFromList(this.runningJobs);
      this.runningCount = (-1 + this.runningCount);
      int i = this.runningCount;
      int j = this.maxConcurrent;
      WorkQueue.WorkNode localWorkNode = null;
      if (i < j)
      {
        localWorkNode = this.pendingJobs;
        if (localWorkNode != null)
        {
          this.pendingJobs = localWorkNode.removeFromList(this.pendingJobs);
          this.runningJobs = localWorkNode.addToList(this.runningJobs, false);
          this.runningCount = (1 + this.runningCount);
          localWorkNode.setIsRunning(true);
        }
      }
      if (localWorkNode != null)
        execute(localWorkNode);
      return;
    }
    finally
    {
    }
  }

  private void startItem()
  {
    finishItemAndStartNew(null);
  }

  WorkQueue.WorkItem addActiveWorkItem(Runnable paramRunnable)
  {
    return addActiveWorkItem(paramRunnable, true);
  }

  WorkQueue.WorkItem addActiveWorkItem(Runnable paramRunnable, boolean paramBoolean)
  {
    WorkQueue.WorkNode localWorkNode = new WorkQueue.WorkNode(this, paramRunnable);
    synchronized (this.workLock)
    {
      this.pendingJobs = localWorkNode.addToList(this.pendingJobs, paramBoolean);
      finishItemAndStartNew(null);
      return localWorkNode;
    }
  }

  void validate()
  {
    synchronized (this.workLock)
    {
      WorkQueue.WorkNode localWorkNode1 = this.runningJobs;
      int i = 0;
      if (localWorkNode1 != null)
      {
        WorkQueue.WorkNode localWorkNode2 = this.runningJobs;
        do
        {
          localWorkNode2.verify(true);
          i++;
          localWorkNode2 = localWorkNode2.getNext();
        }
        while (localWorkNode2 != this.runningJobs);
      }
      if ((!$assertionsDisabled) && (this.runningCount != i))
        throw new AssertionError();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WorkQueue
 * JD-Core Version:    0.6.2
 */