package com.enflick.android.TextNow.api.users.activation;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

@b(a="POST")
@d(a="users/{0}/activate")
@g(a="Ljava/lang/String;")
public class Activate extends TNHttpCommand
{
  public Activate(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.activation.Activate
 * JD-Core Version:    0.6.2
 */