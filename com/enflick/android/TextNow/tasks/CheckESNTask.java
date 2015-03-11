package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.activation.CheckESN;
import com.enflick.android.TextNow.api.users.activation.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import textnow.z.s;
import textnow.z.t;
import textnow.z.u;

public class CheckESNTask extends c
{
  private String d;

  public CheckESNTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    b localb = new b(new u(this.a).b(), this.d);
    a(new CheckESN(this.a).runSync(localb));
    s locals = new s(this.a);
    t localt = t.a;
    if (i() == 200)
      localt = t.c;
    while (true)
    {
      locals.a(localt);
      locals.b(localt);
      locals.B();
      new StringBuilder().append("schedule next esn check on ").append(new SimpleDateFormat().format(new Date(locals.r()))).toString();
      return;
      String str = j();
      if ("NOT_SPRINT_DEVICE".equals(str))
        localt = t.b;
      else if ("ALREADY_ACTIVE".equals(str))
        localt = t.d;
      else if ("ESN_NOT_VALID".equals(str))
        localt = t.e;
      else if ("NOT_TRANSFERRABLE".equals(str))
        localt = t.f;
      else if ("CHARGE_DECLINED".equals(str))
        localt = t.g;
      else if ("ICCID_MISSING".equals(str))
        localt = t.g;
      else if ("INVALID_ICCID".equals(str))
        localt = t.h;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CheckESNTask
 * JD-Core Version:    0.6.2
 */