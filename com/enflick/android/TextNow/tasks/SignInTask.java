package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.SessionPost;
import com.enflick.android.TextNow.api.responsemodel.Session;
import textnow.q.b;
import textnow.u.r;

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
    r localr1 = new r(this.a);
    com.enflick.android.TextNow.api.i locali = new com.enflick.android.TextNow.api.i(this.d, this.e, b.j(this.a));
    textnow.s.i locali1 = new SessionPost(this.a).runSync(locali);
    if (a(locali1))
    {
      if (i() != 404)
        i();
      return;
    }
    String str1 = ((Session)locali1.c()).sessionId;
    new StringBuilder().append("SessionPost success sessionId:").append(str1).toString();
    String str2 = localr1.b();
    if ((!TextUtils.isEmpty(str2)) && (!this.d.equals(str2)))
    {
      localr1.a();
      localr1.n();
    }
    for (r localr2 = new r(this.a); ; localr2 = localr1)
    {
      if (!TextUtils.isEmpty(this.d))
        localr2.a(this.d);
      localr2.l(str1);
      localr2.c(true);
      localr2.n();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SignInTask
 * JD-Core Version:    0.6.2
 */