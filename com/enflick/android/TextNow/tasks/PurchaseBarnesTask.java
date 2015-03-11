package com.enflick.android.TextNow.tasks;

import textnow.z.u;

public class PurchaseBarnesTask extends c
{
  public void run()
  {
    new GetUserInfoTask(new u(this.a).b()).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.PurchaseBarnesTask
 * JD-Core Version:    0.6.2
 */