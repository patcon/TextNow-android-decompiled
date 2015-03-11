package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;

@b(a="POST")
@d(a="users/{0}/credits")
public class UsersCreditsPost extends TNHttpCommand
{
  public UsersCreditsPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.UsersCreditsPost
 * JD-Core Version:    0.6.2
 */