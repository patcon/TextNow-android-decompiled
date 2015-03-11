package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.responsemodel.Billing;
import com.enflick.android.TextNow.api.users.BillingGet;
import com.enflick.android.TextNow.api.users.a;
import textnow.s.i;
import textnow.u.q;

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
    new q(this.a).a(localBilling);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetBillingInfoTask
 * JD-Core Version:    0.6.2
 */