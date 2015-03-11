package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPhoneVoiceVoicemailDelete;
import com.enflick.android.TextNow.api.users.ad;
import textnow.z.u;

public class VoicemailDisableTask extends c
{
  public void run()
  {
    u localu = new u(this.a);
    ad localad = new ad(localu.b());
    if (a(new UsersPhoneVoiceVoicemailDelete(this.a).runSync(localad)))
      return;
    localu.x("0");
    localu.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.VoicemailDisableTask
 * JD-Core Version:    0.6.2
 */