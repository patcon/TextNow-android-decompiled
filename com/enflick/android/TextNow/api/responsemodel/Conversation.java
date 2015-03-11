package com.enflick.android.TextNow.api.responsemodel;

import textnow.y.c;

public class Conversation
{

  @c(a="contact_name")
  public String contactName;

  @c(a="contact_type")
  public int contactType;

  @c(a="contact_value")
  public String contactValue;

  @c(a="latest_message")
  public Message latestMessage;

  @c(a="message_count")
  public int messageCount;

  @c(a="unread_count")
  public int unreadCount;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Conversation
 * JD-Core Version:    0.6.2
 */