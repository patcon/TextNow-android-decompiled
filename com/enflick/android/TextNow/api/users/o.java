package com.enflick.android.TextNow.api.users;

import textnow.t.a;
import textnow.t.e;

public final class o extends com.enflick.android.TextNow.api.common.c
{

  @e
  public String a;

  @a(a="from_name")
  public String b;

  @a(a="contact_type")
  public int c;

  @a(a="contact_value")
  public String d;

  @a(a="message")
  public String e;

  @a(a="to_name")
  public String f;
  public textnow.u.c g;

  public o(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, textnow.u.c paramc)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt;
    this.d = paramString3;
    if (paramc == null)
      this.e = paramString4;
    this.g = paramc;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.o
 * JD-Core Version:    0.6.2
 */