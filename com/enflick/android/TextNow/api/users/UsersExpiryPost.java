package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;

@b(a="POST")
@d(a="users/{0}/expiry")
public class UsersExpiryPost extends TNHttpCommand
{
  public UsersExpiryPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.UsersExpiryPost
 * JD-Core Version:    0.6.2
 */