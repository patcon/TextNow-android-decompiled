package com.enflick.android.TextNow.api.responsemodel;

import textnow.t.c;

public class Messages$Status
{

  @c(a="latest_announcement_id")
  public int latest_announcement_id;

  @c(a="latest_message_id")
  public long latest_message_id;

  @c(a="num_devices")
  public int numDevices;

  @c(a="settings_version")
  public String settingsVersion;

  @c(a="user_timestamp")
  public String userTimestamp;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Messages.Status
 * JD-Core Version:    0.6.2
 */