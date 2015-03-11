package com.appsflyer;

import java.util.ArrayList;
import java.util.List;

public class DebugLogQueue
{
  private static DebugLogQueue ourInstance = new DebugLogQueue();
  List<DebugLogQueue.Item> queue = new ArrayList();

  public static DebugLogQueue getInstance()
  {
    return ourInstance;
  }

  public DebugLogQueue.Item pop()
  {
    if (this.queue.size() == 0)
      return null;
    DebugLogQueue.Item localItem = (DebugLogQueue.Item)this.queue.get(0);
    this.queue.remove(0);
    return localItem;
  }

  public void push(String paramString)
  {
    this.queue.add(new DebugLogQueue.Item(paramString));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.DebugLogQueue
 * JD-Core Version:    0.6.2
 */