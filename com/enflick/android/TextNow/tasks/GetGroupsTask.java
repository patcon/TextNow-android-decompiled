package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.Group;
import com.enflick.android.TextNow.api.users.GroupsGet;
import com.enflick.android.TextNow.api.users.h;
import textnow.ac.b;
import textnow.x.i;
import textnow.z.u;

public class GetGroupsTask extends c
{
  public void run()
  {
    h localh = new h(new u(this.a).b());
    i locali = new GroupsGet(this.a).runSync(localh);
    if (a(locali))
      return;
    Group[] arrayOfGroup = (Group[])locali.c();
    b.a(this.a.getContentResolver(), arrayOfGroup);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetGroupsTask
 * JD-Core Version:    0.6.2
 */