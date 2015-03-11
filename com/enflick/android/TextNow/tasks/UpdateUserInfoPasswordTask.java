package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.users.UsersPatch;
import com.enflick.android.TextNow.api.users.x;
import textnow.u.r;

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
    r localr = new r(this.a);
    x localx = new x(localr.b());
    if (!TextUtils.isEmpty(this.d))
      localx.e = this.d;
    localx.f = this.e;
    if (a(new UsersPatch(this.a).runSync(localx)))
      return;
    localr.e(true);
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateUserInfoPasswordTask
 * JD-Core Version:    0.6.2
 */