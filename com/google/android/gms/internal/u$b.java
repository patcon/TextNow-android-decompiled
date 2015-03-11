package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import java.util.List;

@ez
class u$b
{
  public final String lA;
  public final Context lB;
  public final k lC;
  public final gt lD;
  public bc lE;
  public gg lF;
  public gg lG;
  public ay lH;
  public fz lI;
  public fz.a lJ;
  public ga lK;
  public bf lL;
  public el lM;
  public eh lN;
  public et lO;
  public eu lP;
  public bt lQ;
  public bu lR;
  public List<String> lS;
  public ee lT;
  public ge lU = null;
  public View lV = null;
  public int lW = 0;
  public boolean lX = false;
  private HashSet<ga> lY = null;
  public final u.a lz;

  public u$b(Context paramContext, ay paramay, String paramString, gt paramgt)
  {
    if (paramay.og)
      this.lz = null;
    while (true)
    {
      this.lH = paramay;
      this.lA = paramString;
      this.lB = paramContext;
      this.lD = paramgt;
      this.lC = new k(new w(this));
      return;
      this.lz = new u.a(paramContext);
      this.lz.setMinimumWidth(paramay.widthPixels);
      this.lz.setMinimumHeight(paramay.heightPixels);
      this.lz.setVisibility(4);
    }
  }

  public void a(HashSet<ga> paramHashSet)
  {
    this.lY = paramHashSet;
  }

  public HashSet<ga> au()
  {
    return this.lY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.b
 * JD-Core Version:    0.6.2
 */