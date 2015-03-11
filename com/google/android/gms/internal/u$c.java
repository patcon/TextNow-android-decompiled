package com.google.android.gms.internal;

import android.content.Context;
import java.util.HashSet;

final class u$c
{
  public final u.a kM;
  public final String kN;
  public final Context kO;
  public final k kP;
  public final ev kQ;
  public ap kR;
  public em kS;
  public al kT;
  public ef kU;
  public eg kV;
  public as kW;
  public dg kX;
  public dc kY;
  public cz kZ;
  public ek la = null;
  public boolean lb = false;
  private HashSet<eg> lc = null;

  public u$c(Context paramContext, al paramal, String paramString, ev paramev)
  {
    if (paramal.mf)
      this.kM = null;
    while (true)
    {
      this.kT = paramal;
      this.kN = paramString;
      this.kO = paramContext;
      this.kQ = paramev;
      this.kP = new k(new u.b(this));
      return;
      this.kM = new u.a(paramContext);
      this.kM.setMinimumWidth(paramal.widthPixels);
      this.kM.setMinimumHeight(paramal.heightPixels);
      this.kM.setVisibility(4);
    }
  }

  public final void a(HashSet<eg> paramHashSet)
  {
    this.lc = paramHashSet;
  }

  public final HashSet<eg> aq()
  {
    return this.lc;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.c
 * JD-Core Version:    0.6.2
 */