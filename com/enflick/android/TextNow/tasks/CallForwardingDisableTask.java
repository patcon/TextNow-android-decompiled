package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPhoneVoiceForwardDelete;
import com.enflick.android.TextNow.api.users.aa;
import textnow.u.r;

public class CallForwardingDisableTask extends c
{
  private String d;

  public CallForwardingDisableTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    aa localaa = new aa(this.d);
    if (a(new UsersPhoneVoiceForwardDelete(this.a).runSync(localaa)))
      return;
    r localr = new r(this.a);
    localr.w("");
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CallForwardingDisableTask
 * JD-Core Version:    0.6.2
 */