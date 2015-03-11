package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

@b(a="GET")
@d(a="contacts/{0}")
@g(a="Ljava/util/HashMap;")
public class ContactsGet extends TNHttpCommand
{
  public ContactsGet(Context paramContext)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.ContactsGet
 * JD-Core Version:    0.6.2
 */