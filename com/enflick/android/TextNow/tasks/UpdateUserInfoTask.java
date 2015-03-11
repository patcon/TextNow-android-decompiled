package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPatch;
import com.enflick.android.TextNow.api.users.x;
import java.util.HashMap;
import textnow.z.u;

public class UpdateUserInfoTask extends c
{
  private HashMap<String, Object> d;

  public UpdateUserInfoTask(HashMap<String, Object> paramHashMap)
  {
    this.d = paramHashMap;
  }

  public void run()
  {
    u localu = new u(this.a);
    x localx = new x(localu.b());
    localx.b = ((String)this.d.get("userinfo_firstname"));
    localx.c = ((String)this.d.get("userinfo_lastname"));
    localx.d = ((String)this.d.get("userinfo_email"));
    localx.g = ((String)this.d.get("userinfo_signature"));
    if (this.d.containsKey("userinfo_forward_messages"))
      if (!((Boolean)this.d.get("userinfo_forward_messages")).booleanValue())
        break label148;
    label148: for (int i = 1; ; i = 0)
    {
      localx.h = i;
      if (!a(new UsersPatch(this.a).runSync(localx)))
        break;
      return;
    }
    localu.a(this.d);
    localu.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateUserInfoTask
 * JD-Core Version:    0.6.2
 */