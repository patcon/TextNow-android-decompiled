package com.enflick.android.TextNow.api.responsemodel;

import textnow.q.b;

public class Groups
{
  public Group[] groups;

  public String toString()
  {
    String str = "null";
    if (this.groups != null)
      str = "{" + b.a(this.groups, ",") + "}";
    return "groups=[" + str + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Groups
 * JD-Core Version:    0.6.2
 */