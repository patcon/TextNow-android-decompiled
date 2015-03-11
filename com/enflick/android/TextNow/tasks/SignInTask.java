package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.SessionPost;
import com.enflick.android.TextNow.api.responsemodel.Session;
import textnow.v.b;
import textnow.z.u;

public class SignInTask extends c
{
  private String d;
  private String e;

  public SignInTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    u localu1 = new u(this.a);
    com.enflick.android.TextNow.api.i locali = new com.enflick.android.TextNow.api.i(this.d, this.e, b.i(this.a));
    textnow.x.i locali1 = new SessionPost(this.a).runSync(locali);
    if (a(locali1))
    {
      if (i() != 404)
        i();
      return;
    }
    String str1 = ((Session)locali1.c()).sessionId;
    new StringBuilder().append("SessionPost success sessionId:").append(str1).toString();
    String str2 = localu1.b();
    if ((!TextUtils.isEmpty(str2)) && (!this.d.equals(str2)))
    {
      localu1.a();
      localu1.B();
    }
    for (u localu2 = new u(this.a); ; localu2 = localu1)
    {
      if (!TextUtils.isEmpty(this.d))
        localu2.a(this.d);
      localu2.l(str1);
      localu2.c(true);
      localu2.B();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SignInTask
 * JD-Core Version:    0.6.2
 */