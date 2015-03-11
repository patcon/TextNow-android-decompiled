package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;

@b(a="PUT")
@d(a="users/{0}/billing")
public class BillingPut extends TNHttpCommand
{
  public BillingPut(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.BillingPut
 * JD-Core Version:    0.6.2
 */