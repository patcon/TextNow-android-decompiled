package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.api.users.UsersPhoneDelete;
import com.enflick.android.TextNow.api.users.y;
import textnow.z.u;

public class ReleasePhoneNumberTask extends c
{
  public void run()
  {
    u localu = new u(this.a);
    y localy = new y(localu.b());
    if (a(new UsersPhoneDelete(this.a).runSync(localy)))
      return;
    localu.b("");
    localu.c("");
    localu.B();
    h.g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ReleasePhoneNumberTask
 * JD-Core Version:    0.6.2
 */