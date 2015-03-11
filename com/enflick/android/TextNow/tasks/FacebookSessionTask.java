package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.FacebookSessionPost;
import com.enflick.android.TextNow.api.d;
import com.enflick.android.TextNow.api.responsemodel.Session;
import textnow.q.b;
import textnow.s.i;
import textnow.u.r;

public class FacebookSessionTask extends c
{
  private String d;
  private String e;

  public FacebookSessionTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    r localr1 = new r(this.a);
    d locald = new d(this.d, this.e, b.j(this.a));
    i locali = new FacebookSessionPost(this.a).runSync(locald);
    if (a(locali))
    {
      new StringBuilder().append("error ").append(j()).toString();
      return;
    }
    String str1 = ((Session)locali.c()).sessionId;
    String str2 = ((Session)locali.c()).userName;
    new StringBuilder().append("SessionPost success sessionId:").append(str1).toString();
    String str3 = localr1.b();
    if ((!TextUtils.isEmpty(str3)) && (!str2.equals(str3)))
    {
      localr1.a();
      localr1.n();
    }
    for (r localr2 = new r(this.a); ; localr2 = localr1)
    {
      localr2.f(this.d);
      if (!TextUtils.isEmpty(str2))
        localr2.a(str2);
      localr2.l(str1);
      localr2.c(true);
      localr2.n();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.FacebookSessionTask
 * JD-Core Version:    0.6.2
 */