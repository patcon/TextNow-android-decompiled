package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPhoneVoiceVoicemailDelete;
import com.enflick.android.TextNow.api.users.ad;
import textnow.u.r;

public class VoicemailDisableTask extends c
{
  public void run()
  {
    r localr = new r(this.a);
    ad localad = new ad(localr.b());
    if (a(new UsersPhoneVoiceVoicemailDelete(this.a).runSync(localad)))
      return;
    localr.x("0");
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.VoicemailDisableTask
 * JD-Core Version:    0.6.2
 */