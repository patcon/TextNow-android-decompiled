package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPhoneVoiceForwardPut;
import com.enflick.android.TextNow.api.users.ab;
import textnow.u.r;

public class CallForwardingEnableTask extends c
{
  private String d;
  private String e;

  public CallForwardingEnableTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    ab localab = new ab(this.d, this.e);
    if (a(new UsersPhoneVoiceForwardPut(this.a).runSync(localab)))
      return;
    r localr = new r(this.a);
    localr.w(this.e);
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CallForwardingEnableTask
 * JD-Core Version:    0.6.2
 */