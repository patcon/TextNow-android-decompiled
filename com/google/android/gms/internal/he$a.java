package com.google.android.gms.internal;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public class he$a
{
  private List<hi> BV;
  private String BW;
  private boolean BX;
  private Account BY;

  public a D(boolean paramBoolean)
  {
    this.BX = paramBoolean;
    return this;
  }

  public a a(hi paramhi)
  {
    if (this.BV == null)
      this.BV = new ArrayList();
    this.BV.add(paramhi);
    return this;
  }

  public a ar(String paramString)
  {
    this.BW = paramString;
    return this;
  }

  public he fj()
  {
    String str = this.BW;
    boolean bool = this.BX;
    Account localAccount = this.BY;
    if (this.BV != null);
    for (hi[] arrayOfhi = (hi[])this.BV.toArray(new hi[this.BV.size()]); ; arrayOfhi = null)
      return new he(str, bool, localAccount, arrayOfhi);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.he.a
 * JD-Core Version:    0.6.2
 */