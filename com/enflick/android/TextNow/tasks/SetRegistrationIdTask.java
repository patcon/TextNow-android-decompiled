package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.SessionPut;
import com.enflick.android.TextNow.api.j;
import com.google.android.gcm.a;
import textnow.q.b;
import textnow.u.r;

public class SetRegistrationIdTask extends c
{
  private String d;

  public SetRegistrationIdTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    String str = b.j(this.a);
    j localj = new j(this.d, str);
    if (a(new SessionPut(this.a).runSync(localj)))
      return;
    r localr = new r(this.a);
    if (TextUtils.isEmpty(this.d))
    {
      a.a(this.a, false);
      localr.i(false);
    }
    while (true)
    {
      localr.n();
      return;
      a.a(this.a, true);
      localr.i(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SetRegistrationIdTask
 * JD-Core Version:    0.6.2
 */