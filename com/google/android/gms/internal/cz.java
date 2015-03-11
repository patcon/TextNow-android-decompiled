package com.google.android.gms.internal;

import android.content.Intent;

public class cz
{
  private final String mz;

  public cz(String paramString)
  {
    this.mz = paramString;
  }

  public boolean a(String paramString, int paramInt, Intent paramIntent)
  {
    if ((paramString == null) || (paramIntent == null));
    String str1;
    String str2;
    do
    {
      return false;
      str1 = cy.d(paramIntent);
      str2 = cy.e(paramIntent);
    }
    while ((str1 == null) || (str2 == null));
    if (!paramString.equals(cy.p(str1)))
    {
      eu.D("Developer payload not match.");
      return false;
    }
    if ((this.mz != null) && (!da.b(this.mz, str1, str2)))
    {
      eu.D("Fail to verify signature.");
      return false;
    }
    return true;
  }

  public String bm()
  {
    return eo.bT();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cz
 * JD-Core Version:    0.6.2
 */