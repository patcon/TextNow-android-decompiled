package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.BillingPatch;
import com.enflick.android.TextNow.api.users.b;

public class UpdateBillingAddressTask extends c
{
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;

  public UpdateBillingAddressTask(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramString7;
    this.k = paramString8;
  }

  public void run()
  {
    b localb = new b(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    if (a(new BillingPatch(this.a).runSync(localb)))
      return;
    new GetBillingInfoTask(this.d).c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateBillingAddressTask
 * JD-Core Version:    0.6.2
 */