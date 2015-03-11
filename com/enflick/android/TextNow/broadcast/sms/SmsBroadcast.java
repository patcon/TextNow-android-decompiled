package com.enflick.android.TextNow.broadcast.sms;

import java.io.Serializable;
import java.util.Date;

public class SmsBroadcast
  implements Serializable
{
  private static final long serialVersionUID = -6483681082273176611L;
  private String mContents;
  private String mSender;
  private long mTime;

  public SmsBroadcast(String paramString1, String paramString2)
  {
    this.mSender = paramString1;
    this.mContents = paramString2;
    this.mTime = new Date().getTime();
  }

  public String getContents()
  {
    return this.mContents;
  }

  public String getSender()
  {
    return this.mSender;
  }

  public long getTime()
  {
    return this.mTime;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.broadcast.sms.SmsBroadcast
 * JD-Core Version:    0.6.2
 */