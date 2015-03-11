package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.net.Uri;
import com.enflick.android.TextNow.api.responsemodel.Group;
import com.enflick.android.TextNow.api.responsemodel.Group.GroupMember;
import com.enflick.android.TextNow.api.users.GroupsPost;
import com.enflick.android.TextNow.api.users.l;
import java.util.Map;
import textnow.ac.b;
import textnow.x.i;
import textnow.z.u;

public class CreateGroupTask extends c
{
  private String d;
  private Map<String, Integer> e;
  private Group f;
  private i g;
  private Uri h;
  private boolean i = false;

  public CreateGroupTask(String paramString, Map<String, Integer> paramMap)
  {
    this.d = paramString;
    this.e = paramMap;
  }

  public final i a()
  {
    return this.g;
  }

  public final Group b()
  {
    return this.f;
  }

  public final boolean d_()
  {
    return this.i;
  }

  public void run()
  {
    int j = 0;
    l locall = new l(new u(this.a).b(), this.d, this.e);
    i locali = new GroupsPost(this.a).runSync(locall);
    this.g = locali;
    if (a(locali))
    {
      this.i = false;
      return;
    }
    Group localGroup1 = (Group)locali.c();
    if (localGroup1 == null)
    {
      a(true);
      this.i = false;
      return;
    }
    Group localGroup2 = new Group();
    localGroup2.contact_value = localGroup1.contact_value;
    localGroup2.title = localGroup1.title;
    localGroup2.members = new Group.GroupMember[localGroup1.members.length];
    for (Group.GroupMember localGroupMember : localGroup1.members)
    {
      localGroup2.members[j] = new Group.GroupMember();
      localGroup2.members[j].contact_type = localGroupMember.contact_type;
      localGroup2.members[j].contact_value = localGroupMember.contact_value;
      j++;
    }
    this.h = b.a(this.a.getContentResolver(), localGroup2);
    this.i = true;
    this.f = localGroup2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CreateGroupTask
 * JD-Core Version:    0.6.2
 */