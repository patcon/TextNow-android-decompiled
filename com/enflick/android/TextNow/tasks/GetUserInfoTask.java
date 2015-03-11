package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.api.responsemodel.User;
import com.enflick.android.TextNow.api.responsemodel.User.Features;
import com.enflick.android.TextNow.api.responsemodel.User.SIP;
import com.enflick.android.TextNow.api.users.UsersGet;
import com.enflick.android.TextNow.api.users.v;
import textnow.s.i;
import textnow.u.r;

public class GetUserInfoTask extends c
{
  private String d;

  public GetUserInfoTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    r localr = new r(this.a);
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
      localr.a(localUser.username);
    localr.A(localUser.expiry);
    localr.d(localUser.phoneExpiry);
    localr.e(localUser.email);
    boolean bool1;
    if (localUser.emailVerified == 1)
    {
      bool1 = true;
      label122: localr.a(bool1);
      localr.g(localUser.firstName);
      localr.j(localUser.lastName);
      localr.c(localUser.areaCode);
      localr.k(localUser.lastUpdate);
      if (localUser.forwardMessages != 1)
        break label565;
    }
    label565: for (boolean bool2 = true; ; bool2 = false)
    {
      localr.b(bool2);
      localr.b(localUser.phoneNumber);
      localr.m(localUser.signature);
      localr.d(localUser.credits);
      User.SIP localSIP = localUser.sip;
      int i = 0;
      if (localSIP != null)
      {
        String str2 = localr.D();
        String str3 = localr.E();
        String str4 = localr.F();
        String str5 = localr.G();
        String str6 = localr.H();
        localr.q(localUser.sip.host);
        localr.r(localUser.sip.username);
        localr.s(localUser.sip.password);
        localr.t(localUser.sip.stun);
        localr.u(localUser.sip.proxy);
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
      localr.e(localUser.hasPassword);
      localr.v(localUser.forwardingExpiry);
      localr.w(localUser.forwardingNumber);
      if (localUser.forwardingStatus != null)
        localr.f(Integer.valueOf(localUser.forwardingStatus).intValue());
      localr.x(localUser.voicemail);
      if (localUser.features != null)
        localr.j(localUser.features.cdma_fallback);
      localr.n();
      String str1 = localr.P();
      if ((localUser.sip != null) && (localUser.voicemailTimestamp != null) && (str1.compareTo(localUser.voicemailTimestamp) < 0))
        new DownloadVoicemailTask(localUser.sip.voicemailUrl, localUser.voicemailTimestamp).b(this.a);
      if (i == 0)
        break;
      d.f();
      return;
      bool1 = false;
      break label122;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetUserInfoTask
 * JD-Core Version:    0.6.2
 */