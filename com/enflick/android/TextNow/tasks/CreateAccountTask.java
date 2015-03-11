package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.api.responsemodel.Session;
import com.enflick.android.TextNow.api.users.UsersPut;
import com.enflick.android.TextNow.api.users.ah;
import java.util.Calendar;
import textnow.s.i;
import textnow.u.r;

public class CreateAccountTask extends c
{
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private int i;
  private int j;

  public CreateAccountTask(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramInt1;
    this.j = paramInt2;
  }

  public void run()
  {
    ah localah = new ah(this.d, this.f, this.e, this.g, this.h);
    int k = Calendar.getInstance().get(1) - this.i;
    localah.g = (k + "-01-01");
    localah.f = this.j;
    i locali = new UsersPut(this.a).runSync(localah);
    if (a(locali))
      return;
    String str1 = ((Session)locali.c()).sessionId;
    r localr = new r(this.a);
    String str2 = localr.b();
    if ((!TextUtils.isEmpty(str2)) && (!this.d.equals(str2)))
    {
      localr.a();
      localr.n();
      localr = new r(this.a);
    }
    localr.e(this.e);
    if (!TextUtils.isEmpty(this.d))
      localr.a(this.d);
    localr.g(this.g);
    localr.j(this.h);
    localr.c(this.j);
    localr.b(k);
    localr.l(str1);
    localr.c(true);
    localr.I();
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CreateAccountTask
 * JD-Core Version:    0.6.2
 */