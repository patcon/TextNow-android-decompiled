package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersEmailPost;
import com.enflick.android.TextNow.api.users.t;
import textnow.u.r;

public class SendEmailVerificationTask extends c
{
  public void run()
  {
    t localt = new t(new r(this.a).b());
    if (a(new UsersEmailPost(this.a).runSync(localt)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SendEmailVerificationTask
 * JD-Core Version:    0.6.2
 */