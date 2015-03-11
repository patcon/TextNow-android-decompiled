package com.google.android.gms.internal;

import android.view.View;
import java.util.Collection;
import java.util.List;

public final class gy
{
  private final View DJ;
  private final gy.a FU;

  public gy(String paramString1, Collection<String> paramCollection, int paramInt, View paramView, String paramString2)
  {
    this.FU = new gy.a(paramString1, paramCollection, paramInt, paramString2);
    this.DJ = paramView;
  }

  public final String fj()
  {
    return this.FU.fj();
  }

  public final int fk()
  {
    return this.FU.fk();
  }

  public final List<String> fl()
  {
    return this.FU.fl();
  }

  public final String[] fm()
  {
    return (String[])this.FU.fl().toArray(new String[0]);
  }

  public final String fn()
  {
    return this.FU.fn();
  }

  public final View fo()
  {
    return this.DJ;
  }

  public final String getAccountName()
  {
    return this.FU.getAccountName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gy
 * JD-Core Version:    0.6.2
 */