package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.users.UsersPhonePut;
import com.enflick.android.TextNow.api.users.z;
import textnow.x.i;
import textnow.z.u;

public class AssignPhoneNumberTask extends c
{
  private String d;

  public AssignPhoneNumberTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    u localu = new u(this.a);
    z localz = new z(localu.b(), this.d);
    i locali = new UsersPhonePut(this.a).runSync(localz);
    if (a(locali))
      return;
    String str = textnow.v.b.e((String)locali.c());
    if (!TextUtils.isEmpty(str))
    {
      localu.c(this.d);
      localu.b(str);
      localu.B();
    }
    com.enflick.android.TextNow.ads.b.b("get_phone_number");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.AssignPhoneNumberTask
 * JD-Core Version:    0.6.2
 */