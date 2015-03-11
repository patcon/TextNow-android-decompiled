package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.ContactProxy;
import com.enflick.android.TextNow.api.users.ContactProxyNumberGet;
import textnow.q.b;
import textnow.s.i;
import textnow.u.l;

public class GetContactProxyTask extends c
{
  private String d;
  private String e;
  private String f;
  private textnow.u.d g;

  public GetContactProxyTask(String paramString, textnow.u.d paramd)
  {
    this.g = paramd;
    this.e = paramd.a();
    if (paramd.b() == 2)
    {
      String str = b.b(this.e);
      if (str != null)
        this.e = ("+1" + str);
    }
    this.d = paramString;
  }

  public final String a()
  {
    return this.f;
  }

  public final textnow.u.d b()
  {
    return this.g;
  }

  public void run()
  {
    com.enflick.android.TextNow.api.users.d locald = new com.enflick.android.TextNow.api.users.d(this.d, this.e);
    i locali = new ContactProxyNumberGet(this.a).runSync(locald);
    if (a(locali))
      new StringBuilder().append("fail to get proxy number for ").append(this.e).toString();
    ContactProxy localContactProxy;
    do
    {
      return;
      localContactProxy = (ContactProxy)locali.c();
    }
    while (localContactProxy == null);
    new StringBuilder().append("get proxy sucess for contact: ").append(this.e).append(" proxy number is: ").append(localContactProxy.proxyNumber).toString();
    this.f = localContactProxy.proxyNumber;
    l.a(this.a.getContentResolver(), this.g.a(), this.f);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetContactProxyTask
 * JD-Core Version:    0.6.2
 */