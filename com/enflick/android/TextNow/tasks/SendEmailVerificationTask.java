package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersEmailPost;
import com.enflick.android.TextNow.api.users.t;
import textnow.z.u;

public class SendEmailVerificationTask extends c
{
  public void run()
  {
    t localt = new t(new u(this.a).b());
    if (a(new UsersEmailPost(this.a).runSync(localt)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SendEmailVerificationTask
 * JD-Core Version:    0.6.2
 */