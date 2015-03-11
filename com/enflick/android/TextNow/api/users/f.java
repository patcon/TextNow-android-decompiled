package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import textnow.y.a;
import textnow.y.e;

public final class f extends c
{

  @e(a=0)
  public String a;

  @e(a=1)
  public String b;

  @a(a="read", b="true")
  public String c = "true";

  @textnow.y.f(a="latest_message_id", b="0")
  public long d = 0L;

  public f(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.f
 * JD-Core Version:    0.6.2
 */