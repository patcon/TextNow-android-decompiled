package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.Group;
import com.enflick.android.TextNow.api.users.GroupsGetContactValue;
import textnow.ac.b;
import textnow.z.u;

public class GetGroupTask extends c
{
  private String d;

  public GetGroupTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    com.enflick.android.TextNow.api.users.i locali = new com.enflick.android.TextNow.api.users.i(new u(this.a).b(), this.d);
    textnow.x.i locali1 = new GroupsGetContactValue(this.a).runSync(locali);
    if (a(locali1))
      return;
    Group localGroup = (Group)locali1.c();
    b.a(this.a.getContentResolver(), localGroup);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetGroupTask
 * JD-Core Version:    0.6.2
 */