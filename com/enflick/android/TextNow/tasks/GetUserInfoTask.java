package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.api.responsemodel.User;
import com.enflick.android.TextNow.api.responsemodel.User.Features;
import com.enflick.android.TextNow.api.responsemodel.User.SIP;
import com.enflick.android.TextNow.api.users.UsersGet;
import com.enflick.android.TextNow.api.users.v;
import textnow.x.i;
import textnow.z.u;

public class GetUserInfoTask extends c
{
  private String d;

  public GetUserInfoTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    u localu = new u(this.a);
    v localv = new v(this.d);
    i locali = new UsersGet(this.a).runSync(localv);
    if (a(locali));
    User localUser;
    do
    {
      return;
      localUser = (User)locali.c();
    }
    while (localUser == null);
    if (!TextUtils.isEmpty(localUser.username))
      localu.a(localUser.username);
    localu.A(localUser.expiry);
    localu.d(localUser.phoneExpiry);
    localu.e(localUser.email);
    boolean bool1;
    if (localUser.emailVerified == 1)
    {
      bool1 = true;
      label122: localu.a(bool1);
      localu.g(localUser.firstName);
      localu.j(localUser.lastName);
      localu.c(localUser.areaCode);
      localu.k(localUser.lastUpdate);
      if (localUser.forwardMessages != 1)
        break label565;
    }
    label565: for (boolean bool2 = true; ; bool2 = false)
    {
      localu.b(bool2);
      localu.b(localUser.phoneNumber);
      localu.m(localUser.signature);
      localu.d(localUser.credits);
      User.SIP localSIP = localUser.sip;
      int i = 0;
      if (localSIP != null)
      {
        String str2 = localu.F();
        String str3 = localu.G();
        String str4 = localu.H();
        String str5 = localu.I();
        String str6 = localu.J();
        localu.q(localUser.sip.host);
        localu.r(localUser.sip.username);
        localu.s(localUser.sip.password);
        localu.t(localUser.sip.stun);
        localu.u(localUser.sip.proxy);
        if ((str2.equals(localUser.sip.host)) && (str3.equals(localUser.sip.username)) && (str4.equals(localUser.sip.password)) && (str5.equals(localUser.sip.stun)))
        {
          boolean bool3 = str6.equals(localUser.sip.proxy);
          i = 0;
          if (bool3);
        }
        else
        {
          i = 1;
        }
      }
      localu.e(localUser.hasPassword);
      localu.v(localUser.forwardingExpiry);
      localu.w(localUser.forwardingNumber);
      if (localUser.forwardingStatus != null)
        localu.e(Integer.valueOf(localUser.forwardingStatus).intValue());
      localu.x(localUser.voicemail);
      if (localUser.features != null)
        localu.j(localUser.features.cdma_fallback);
      localu.B();
      String str1 = localu.R();
      if ((localUser.sip != null) && (localUser.voicemailTimestamp != null) && (str1.compareTo(localUser.voicemailTimestamp) < 0))
        new DownloadVoicemailTask(localUser.sip.voicemailUrl, localUser.voicemailTimestamp).b(this.a);
      if (i == 0)
        break;
      h.f();
      return;
      bool1 = false;
      break label122;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetUserInfoTask
 * JD-Core Version:    0.6.2
 */