package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.y.b;
import textnow.y.d;
import textnow.y.g;

@b(a="GET")
@d(a="users/{0}/groups")
@g(a="[Lcom/enflick/android/TextNow/api/responsemodel/Group;")
public class GroupsGet extends TNHttpCommand
{
  public GroupsGet(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.GroupsGet
 * JD-Core Version:    0.6.2
 */