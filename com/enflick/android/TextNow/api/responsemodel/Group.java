package com.enflick.android.TextNow.api.responsemodel;

import textnow.v.b;
import textnow.y.c;

public class Group
{

  @c(a="contact_value")
  public String contact_value;

  @c(a="members")
  public Group.GroupMember[] members;

  @c(a="title")
  public String title;

  public String toString()
  {
    String str = "null";
    if (this.members != null)
      str = "{" + b.a(this.members, ",") + "}";
    return "title=[" + this.title + "] contact_value=[" + this.contact_value + "] members=[" + str + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Group
 * JD-Core Version:    0.6.2
 */