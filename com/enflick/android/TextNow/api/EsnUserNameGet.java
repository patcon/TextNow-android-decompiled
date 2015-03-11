package com.enflick.android.TextNow.api;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="GET")
@d(a="users/username/{0}")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/EsnUserName;")
public class EsnUserNameGet extends TNHttpCommand
{
  public EsnUserNameGet(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.EsnUserNameGet
 * JD-Core Version:    0.6.2
 */