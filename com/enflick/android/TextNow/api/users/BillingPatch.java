package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;

@b(a="PATCH")
@d(a="users/{0}/billing")
public class BillingPatch extends TNHttpCommand
{
  public BillingPatch(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.BillingPatch
 * JD-Core Version:    0.6.2
 */