package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.api.users.UsersPhoneDelete;
import com.enflick.android.TextNow.api.users.y;
import textnow.u.r;

public class ReleasePhoneNumberTask extends c
{
  public void run()
  {
    r localr = new r(this.a);
    y localy = new y(localr.b());
    if (a(new UsersPhoneDelete(this.a).runSync(localy)))
      return;
    localr.b("");
    localr.c("");
    localr.n();
    d.g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ReleasePhoneNumberTask
 * JD-Core Version:    0.6.2
 */