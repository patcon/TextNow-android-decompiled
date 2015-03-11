package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersPhoneVoicePut;
import com.enflick.android.TextNow.api.users.ac;
import textnow.u.r;

public class PurchaseCallForwardingTask extends c
{
  private String d;
  private String e;
  private String f;
  private String g;

  public PurchaseCallForwardingTask(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
  }

  public void run()
  {
    r localr = new r(this.a);
    ac localac = new ac(localr.b(), this.d, this.e, this.f, this.g);
    if (a(new UsersPhoneVoicePut(this.a).runSync(localac)))
      return;
    new GetUserInfoTask(localr.b()).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.PurchaseCallForwardingTask
 * JD-Core Version:    0.6.2
 */