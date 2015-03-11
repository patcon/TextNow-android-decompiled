package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import textnow.t.a;
import textnow.t.e;

public class ag extends c
{

  @e
  public String c;

  @a(a="first_name")
  public String d;

  @a(a="last_name")
  public String e;

  @a(a="gender", b="0")
  public int f = 0;

  @a(a="dob")
  public String g;

  @a(a="email")
  public String h;

  public ag(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.h = paramString4;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.ag
 * JD-Core Version:    0.6.2
 */