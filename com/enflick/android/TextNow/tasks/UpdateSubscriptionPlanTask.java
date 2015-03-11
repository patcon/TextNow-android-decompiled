package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.SubscriptionsPatch;
import com.enflick.android.TextNow.api.users.q;

public class UpdateSubscriptionPlanTask extends c
{
  private String d;
  private int e;
  private int f;

  public UpdateSubscriptionPlanTask(String paramString, int paramInt1, int paramInt2)
  {
    this.d = paramString;
    this.e = paramInt1;
    this.f = paramInt2;
  }

  public void run()
  {
    q localq = new q(this.d, this.e, this.f);
    if (a(new SubscriptionsPatch(this.a).runSync(localq)))
      return;
    new GetSubscriptionTask(this.d).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateSubscriptionPlanTask
 * JD-Core Version:    0.6.2
 */