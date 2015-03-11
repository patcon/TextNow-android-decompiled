package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersExpiryPost;

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
    textnow.z.u localu = new textnow.z.u(this.a);
    com.enflick.android.TextNow.api.users.u localu1 = new com.enflick.android.TextNow.api.users.u(localu.b(), this.d, this.e, this.f, this.g);
    if (a(new UsersExpiryPost(this.a).runSync(localu1)))
      return;
    new GetUserInfoTask(localu.b()).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.PurchaseAdRemovalTask
 * JD-Core Version:    0.6.2
 */