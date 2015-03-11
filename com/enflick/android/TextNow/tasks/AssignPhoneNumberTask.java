package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.api.users.UsersPhonePut;
import com.enflick.android.TextNow.api.users.z;
import textnow.q.b;
import textnow.s.i;
import textnow.u.r;

public class AssignPhoneNumberTask extends c
{
  private String d;

  public AssignPhoneNumberTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    r localr = new r(this.a);
    z localz = new z(localr.b(), this.d);
    i locali = new UsersPhonePut(this.a).runSync(localz);
    if (a(locali))
      return;
    String str = b.e((String)locali.c());
    if (!TextUtils.isEmpty(str))
    {
      localr.c(this.d);
      localr.b(str);
      localr.n();
    }
    a.b("get_phone_number");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.AssignPhoneNumberTask
 * JD-Core Version:    0.6.2
 */