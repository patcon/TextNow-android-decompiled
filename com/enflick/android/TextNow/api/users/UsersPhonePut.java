package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="PUT")
@d(a="users/{0}/phone")
@g(a="Ljava/lang/String;")
public class UsersPhonePut extends TNHttpCommand
{
  public UsersPhonePut(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.UsersPhonePut
 * JD-Core Version:    0.6.2
 */