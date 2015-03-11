package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.ContactProxy;
import com.enflick.android.TextNow.api.users.ContactProxyNumberGet;
import com.enflick.android.TextNow.api.users.d;
import textnow.v.b;
import textnow.x.i;
import textnow.z.f;
import textnow.z.n;

public class GetContactProxyTask extends c
{
  private String d;
  private String e;
  private String f;
  private f g;

  public GetContactProxyTask(String paramString, f paramf)
  {
    this.g = paramf;
    this.e = paramf.a();
    if (paramf.b() == 2)
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

  public final f b()
  {
    return this.g;
  }

  public void run()
  {
    d locald = new d(this.d, this.e);
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
    n.a(this.a.getContentResolver(), this.g.a(), this.f);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetContactProxyTask
 * JD-Core Version:    0.6.2
 */