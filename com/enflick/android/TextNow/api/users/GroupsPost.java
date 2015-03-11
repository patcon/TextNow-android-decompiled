package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;
import textnow.t.g;

@b(a="POST")
@d(a="users/{0}/groups")
@g(a="Lcom/enflick/android/TextNow/api/responsemodel/Group;")
public class GroupsPost extends TNHttpCommand
{
  public GroupsPost(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.GroupsPost
 * JD-Core Version:    0.6.2
 */