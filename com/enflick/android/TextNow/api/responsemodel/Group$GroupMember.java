package com.enflick.android.TextNow.api.responsemodel;

import textnow.t.c;

public class Group$GroupMember
{

  @c(a="contact_type")
  public String contact_type;

  @c(a="contact_value")
  public String contact_value;

  public String toString()
  {
    return "contact_value=[" + this.contact_value + "] contact_type=[" + this.contact_type + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Group.GroupMember
 * JD-Core Version:    0.6.2
 */