package com.enflick.android.TextNow.api.responsemodel;

import textnow.y.c;

public class Message
{

  @c(a="contact_name")
  public String contactName;

  @c(a="contact_type")
  public int contactType;

  @c(a="contact_value")
  public String contactValue;

  @c(a="date")
  public String date;

  @c(a="id")
  public long id;

  @c(a="message")
  public String message;

  @c(a="message_direction")
  public int messageDirection;

  @c(a="message_type")
  public int messageType;

  @c(a="read")
  public boolean read;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Message
 * JD-Core Version:    0.6.2
 */