package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.users.UsersPatch;
import com.enflick.android.TextNow.api.users.x;
import textnow.z.u;

public class UpdateUserInfoPasswordTask extends c
{
  String d;
  String e;

  public UpdateUserInfoPasswordTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    u localu = new u(this.a);
    x localx = new x(localu.b());
    if (!TextUtils.isEmpty(this.d))
      localx.e = this.d;
    localx.f = this.e;
    if (a(new UsersPatch(this.a).runSync(localx)))
      return;
    localu.e(true);
    localu.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateUserInfoPasswordTask
 * JD-Core Version:    0.6.2
 */