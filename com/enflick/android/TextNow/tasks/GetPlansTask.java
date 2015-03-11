package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.PlansGet;
import com.enflick.android.TextNow.api.g;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import textnow.x.i;
import textnow.z.s;

public class GetPlansTask extends c
{
  public void run()
  {
    g localg = new g();
    i locali = new PlansGet(this.a).runSync(localg);
    if (a(locali))
      return;
    Plan[] arrayOfPlan = (Plan[])locali.c();
    s locals = new s(this.a);
    int i = arrayOfPlan.length;
    for (int j = 0; j < i; j++)
      locals.a(arrayOfPlan[j]);
    locals.B();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetPlansTask
 * JD-Core Version:    0.6.2
 */