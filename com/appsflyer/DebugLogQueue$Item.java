package com.appsflyer;

import java.util.Date;

public class DebugLogQueue$Item
{
  private String msg;
  private long timestamp;

  public DebugLogQueue$Item(String paramString)
  {
    this.msg = paramString;
    this.timestamp = new Date().getTime();
  }

  public String getMsg()
  {
    return this.msg;
  }

  public long getTimestamp()
  {
    return this.timestamp;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.DebugLogQueue.Item
 * JD-Core Version:    0.6.2
 */