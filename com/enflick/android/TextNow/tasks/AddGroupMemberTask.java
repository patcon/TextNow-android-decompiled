package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.users.GroupsPatchContactValueMember;
import textnow.ac.b;
import textnow.z.u;

public class AddGroupMemberTask extends c
{
  private String d;
  private String e;
  private String f;

  public AddGroupMemberTask(String paramString1, String paramString2, String paramString3)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
  }

  public void run()
  {
    com.enflick.android.TextNow.api.users.k localk = new com.enflick.android.TextNow.api.users.k(new u(this.a).b(), this.d, this.e, this.f);
    if (a(new GroupsPatchContactValueMember(this.a).runSync(localk)))
      return;
    String str = textnow.v.k.b(g().getContentResolver(), this.e);
    b.a(this.a.getContentResolver(), this.d, this.e, this.f, str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.AddGroupMemberTask
 * JD-Core Version:    0.6.2
 */