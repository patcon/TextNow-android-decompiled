package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

@ez
public final class er extends es.a
{
  private final aa sM;
  private final String sN;
  private final String sO;

  public er(aa paramaa, String paramString1, String paramString2)
  {
    this.sM = paramaa;
    this.sN = paramString1;
    this.sO = paramString2;
  }

  public final void ar()
  {
    this.sM.ar();
  }

  public final void as()
  {
    this.sM.as();
  }

  public final void c(d paramd)
  {
    if (paramd == null)
      return;
    this.sM.b((View)e.f(paramd));
  }

  public final String cu()
  {
    return this.sN;
  }

  public final String cv()
  {
    return this.sO;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.er
 * JD-Core Version:    0.6.2
 */