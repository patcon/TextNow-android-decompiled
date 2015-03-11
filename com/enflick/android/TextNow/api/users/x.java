package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import textnow.t.a;
import textnow.t.e;

public final class x extends c
{

  @e
  public String a;

  @a(a="first_name")
  public String b;

  @a(a="last_name")
  public String c;

  @a(a="email")
  public String d;

  @a(a="old_password")
  public String e;

  @a(a="password")
  public String f;

  @a(a="signature")
  public String g;

  @a(a="forward_messages", b="-1")
  public int h = -1;

  public x(String paramString)
  {
    this.a = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.x
 * JD-Core Version:    0.6.2
 */