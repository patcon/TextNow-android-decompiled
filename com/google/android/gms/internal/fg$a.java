package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

@ez
public final class fg$a extends fg
{
  private final Context mContext;

  public fg$a(Context paramContext, fi paramfi, ff.a parama)
  {
    super(paramfi, parama);
    this.mContext = paramContext;
  }

  public final void cC()
  {
  }

  public final fm cD()
  {
    Bundle localBundle = gb.bD();
    bm localbm = new bm(localBundle.getString("gads:sdk_core_location"), localBundle.getString("gads:sdk_core_experiment_id"), localBundle.getString("gads:block_autoclicks_experiment_id"));
    return fr.a(this.mContext, localbm, new cj(), new fy());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fg.a
 * JD-Core Version:    0.6.2
 */