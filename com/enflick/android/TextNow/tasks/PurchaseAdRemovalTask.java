package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersExpiryPost;
import com.enflick.android.TextNow.api.users.u;
import textnow.u.r;

public class PurchaseAdRemovalTask extends c
{
  private String d;
  private String e;
  private String f;
  private String g;

  public PurchaseAdRemovalTask(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
  }

  public void run()
  {
    r localr = new r(this.a);
    u localu = new u(localr.b(), this.d, this.e, this.f, this.g);
    if (a(new UsersExpiryPost(this.a).runSync(localu)))
      return;
    new GetUserInfoTask(localr.b()).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.PurchaseAdRemovalTask
 * JD-Core Version:    0.6.2
 */