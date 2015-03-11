package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersHead;
import com.enflick.android.TextNow.api.users.w;

public class CheckUsernameAvailabilityTask extends c
{
  private String d;

  public CheckUsernameAvailabilityTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    w localw = new w(this.d);
    if (a(new UsersHead(this.a).runSync(localw)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CheckUsernameAvailabilityTask
 * JD-Core Version:    0.6.2
 */