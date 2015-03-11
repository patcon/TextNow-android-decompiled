package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.SessionPut;
import com.enflick.android.TextNow.api.j;
import com.google.android.gcm.a;
import textnow.v.b;
import textnow.z.u;

public class SetRegistrationIdTask extends c
{
  private String d;

  public SetRegistrationIdTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    String str = b.i(this.a);
    j localj = new j(this.d, str);
    if (a(new SessionPut(this.a).runSync(localj)))
      return;
    u localu = new u(this.a);
    if (TextUtils.isEmpty(this.d))
    {
      a.a(this.a, false);
      localu.i(false);
    }
    while (true)
    {
      localu.B();
      return;
      a.a(this.a, true);
      localu.i(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SetRegistrationIdTask
 * JD-Core Version:    0.6.2
 */