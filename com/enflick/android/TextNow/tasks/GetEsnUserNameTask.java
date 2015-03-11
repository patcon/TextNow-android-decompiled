package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.EsnUserNameGet;
import com.enflick.android.TextNow.api.responsemodel.EsnUserName;
import textnow.x.i;
import textnow.z.u;

public class GetEsnUserNameTask extends c
{
  private String d;

  public GetEsnUserNameTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    u localu = new u(this.a);
    com.enflick.android.TextNow.api.c localc = new com.enflick.android.TextNow.api.c(this.d);
    i locali = new EsnUserNameGet(this.a).runSync(localc);
    if (a(locali));
    EsnUserName localEsnUserName;
    do
    {
      return;
      localEsnUserName = (EsnUserName)locali.c();
    }
    while ((localEsnUserName == null) || (TextUtils.isEmpty(localEsnUserName.username)));
    localu.a(localEsnUserName.username);
    localu.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetEsnUserNameTask
 * JD-Core Version:    0.6.2
 */