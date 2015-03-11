package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.Group;
import com.enflick.android.TextNow.api.users.GroupsGet;
import com.enflick.android.TextNow.api.users.h;
import textnow.s.i;
import textnow.u.r;
import textnow.w.b;

public class GetGroupsTask extends c
{
  public void run()
  {
    h localh = new h(new r(this.a).b());
    i locali = new GroupsGet(this.a).runSync(localh);
    if (a(locali))
      return;
    Group[] arrayOfGroup = (Group[])locali.c();
    b.a(this.a.getContentResolver(), arrayOfGroup);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetGroupsTask
 * JD-Core Version:    0.6.2
 */