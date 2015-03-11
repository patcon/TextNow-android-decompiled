package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.FacebookSessionPost;
import com.enflick.android.TextNow.api.d;
import com.enflick.android.TextNow.api.responsemodel.Session;
import textnow.v.b;
import textnow.x.i;
import textnow.z.u;

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
    u localu1 = new u(this.a);
    d locald = new d(this.d, this.e, b.i(this.a));
    i locali = new FacebookSessionPost(this.a).runSync(locald);
    if (a(locali))
    {
      new StringBuilder().append("error ").append(j()).toString();
      return;
    }
    String str1 = ((Session)locali.c()).sessionId;
    String str2 = ((Session)locali.c()).userName;
    new StringBuilder().append("SessionPost success sessionId:").append(str1).toString();
    String str3 = localu1.b();
    if ((!TextUtils.isEmpty(str3)) && (!str2.equals(str3)))
    {
      localu1.a();
      localu1.B();
    }
    for (u localu2 = new u(this.a); ; localu2 = localu1)
    {
      localu2.f(this.d);
      if (!TextUtils.isEmpty(str2))
        localu2.a(str2);
      localu2.l(str1);
      localu2.c(true);
      localu2.B();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.FacebookSessionTask
 * JD-Core Version:    0.6.2
 */