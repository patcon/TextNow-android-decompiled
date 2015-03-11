package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.responsemodel.Subscription;
import com.enflick.android.TextNow.api.users.SubscriptionsGet;
import com.enflick.android.TextNow.api.users.p;
import textnow.s.i;
import textnow.u.q;

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
    i locali = new SubscriptionsGet(this.a).runSync(localp);
    if (a(locali));
    while (true)
    {
      return;
      Subscription[] arrayOfSubscription = (Subscription[])locali.c();
      if (arrayOfSubscription != null)
      {
        if (arrayOfSubscription.length > 0);
        for (Subscription localSubscription = arrayOfSubscription[0]; localSubscription != null; localSubscription = null)
        {
          new q(this.a).a(localSubscription);
          return;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetSubscriptionTask
 * JD-Core Version:    0.6.2
 */