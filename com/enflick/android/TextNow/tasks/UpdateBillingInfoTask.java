package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.BillingPut;

public class UpdateBillingInfoTask extends c
{
  private String d;
  private String e;

  public UpdateBillingInfoTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    com.enflick.android.TextNow.api.users.c localc = new com.enflick.android.TextNow.api.users.c(this.d, this.e);
    if (a(new BillingPut(this.a).runSync(localc)))
      return;
    new GetBillingInfoTask(this.d).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateBillingInfoTask
 * JD-Core Version:    0.6.2
 */