package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.responsemodel.Billing;
import com.enflick.android.TextNow.api.users.BillingGet;
import com.enflick.android.TextNow.api.users.a;
import textnow.x.i;
import textnow.z.s;

public class GetBillingInfoTask extends c
{
  private String d;

  public GetBillingInfoTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    a locala = new a(this.d);
    i locali = new BillingGet(this.a).runSync(locala);
    if (a(locali));
    Billing localBilling;
    do
    {
      return;
      localBilling = (Billing)locali.c();
    }
    while (localBilling == null);
    new s(this.a).a(localBilling);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetBillingInfoTask
 * JD-Core Version:    0.6.2
 */