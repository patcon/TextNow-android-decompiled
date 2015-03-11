package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="GET")
@d(a="users/{0}/contacts_proxy_numbers")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/ContactProxy;")
public class ContactProxyNumberGet extends TNHttpCommand
{
  public ContactProxyNumberGet(Context paramContext)
  {
    super(paramContext);
  }

  protected int getConnectionTimeOut()
  {
    return 5000;
  }

  protected int getSocketTimeOut()
  {
    return 5000;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.ContactProxyNumberGet
 * JD-Core Version:    0.6.2
 */