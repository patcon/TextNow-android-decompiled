package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.responsemodel.Subscription;
import com.enflick.android.TextNow.api.users.SubscriptionGet;
import com.enflick.android.TextNow.api.users.p;
import textnow.x.i;
import textnow.z.s;

public class GetSubscriptionTask extends c
{
  private String d;

  public GetSubscriptionTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    p localp = new p(this.d);
    i locali = new SubscriptionGet(this.a).runSync(localp);
    s locals = new s(this.a);
    if (a(locali))
    {
      if ("NOT_FOUND".equals(j()))
        locals.a();
      return;
    }
    Subscription localSubscription = (Subscription)locali.c();
    if (localSubscription == null)
    {
      locals.a();
      return;
    }
    locals.a(localSubscription);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetSubscriptionTask
 * JD-Core Version:    0.6.2
 */