package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import textnow.t.a;
import textnow.t.e;

public final class s extends c
{

  @e
  public String a;

  @a(a="amount")
  public int b;

  @a(a="receipt")
  public String c;

  @a(a="signature")
  public String d;

  @a(a="amazon_user_id")
  public String e;

  public s(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.s
 * JD-Core Version:    0.6.2
 */