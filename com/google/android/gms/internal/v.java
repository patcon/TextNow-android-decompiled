package com.google.android.gms.internal;

import android.os.Bundle;

@ez
public class v
{
  private v.a lZ;
  private boolean ma;
  private boolean mb;

  public v()
  {
    Bundle localBundle = gb.bD();
    boolean bool1 = false;
    if (localBundle != null)
    {
      boolean bool2 = localBundle.getBoolean("gads:block_autoclicks", false);
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    this.mb = bool1;
  }

  public v(boolean paramBoolean)
  {
    this.mb = paramBoolean;
  }

  public void a(v.a parama)
  {
    this.lZ = parama;
  }

  public void ar()
  {
    this.ma = true;
  }

  public boolean av()
  {
    return (!this.mb) || (this.ma);
  }

  public void d(String paramString)
  {
    gs.S("Action was blocked because no click was detected.");
    if (this.lZ != null)
      this.lZ.e(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v
 * JD-Core Version:    0.6.2
 */