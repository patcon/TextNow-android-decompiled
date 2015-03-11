package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.UsersCreditsPost;
import com.enflick.android.TextNow.api.users.s;
import textnow.u.r;

public class PurchaseCreditsTask extends c
{
  private int d;
  private String e;
  private String f;
  private String g;

  public PurchaseCreditsTask(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.d = paramInt;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
  }

  public void run()
  {
    s locals = new s(new r(this.a).b(), this.d, this.e, this.f, this.g);
    if (a(new UsersCreditsPost(this.a).runSync(locals)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.PurchaseCreditsTask
 * JD-Core Version:    0.6.2
 */