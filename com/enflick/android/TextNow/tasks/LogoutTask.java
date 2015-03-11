package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.api.SessionDelete;
import com.enflick.android.TextNow.api.h;
import com.facebook.Session;
import textnow.aa.a;

public class LogoutTask extends c
{
  public void run()
  {
    h localh = new h();
    if (a(new SessionDelete(this.a).runSync(localh)))
      return;
    if (Session.getActiveSession() != null)
      Session.getActiveSession().closeAndClearTokenInformation();
    TextNowApp.b();
    a.a(this.a).e();
    a.a(this.a).d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.LogoutTask
 * JD-Core Version:    0.6.2
 */