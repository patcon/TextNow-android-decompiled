package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.b;
import com.enflick.android.TextNow.api.common.c;
import com.enflick.android.TextNow.api.responsemodel.Group.GroupMember;
import org.json.JSONObject;
import textnow.t.a;
import textnow.t.e;

public final class k extends c
{

  @e(a=0)
  public String a;

  @e(a=1)
  public String b;

  @a(a="member")
  public JSONObject c;

  public k(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.b = paramString2;
    Group.GroupMember localGroupMember = new Group.GroupMember();
    localGroupMember.contact_value = paramString3;
    localGroupMember.contact_type = paramString4;
    this.c = b.b(localGroupMember);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.k
 * JD-Core Version:    0.6.2
 */