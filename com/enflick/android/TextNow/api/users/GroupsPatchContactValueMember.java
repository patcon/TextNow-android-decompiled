package com.enflick.android.TextNow.api.users;

import android.content.Context;
import com.enflick.android.TextNow.api.common.TNHttpCommand;
import textnow.t.b;
import textnow.t.d;

@b(a="PATCH")
@d(a="users/{0}/groups/{1}/members")
public class GroupsPatchContactValueMember extends TNHttpCommand
{
  public GroupsPatchContactValueMember(Context paramContext)
  {
    super(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.GroupsPatchContactValueMember
 * JD-Core Version:    0.6.2
 */