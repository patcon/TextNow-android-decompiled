package com.enflick.android.TextNow.api.users.activation;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;

@b(a="GET")
@d(a="users/{0}/check-esn")
public class CheckESN extends TNHttpCommand
{
  public CheckESN(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.activation.CheckESN
 * JD-Core Version:    0.6.2
 */