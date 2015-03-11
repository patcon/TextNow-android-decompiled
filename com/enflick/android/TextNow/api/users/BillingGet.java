package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

@b(a="GET")
@d(a="users/{0}/billing")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/Billing;")
public class BillingGet extends TNHttpCommand
{
  public BillingGet(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.BillingGet
 * JD-Core Version:    0.6.2
 */