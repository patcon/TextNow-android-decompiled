package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseArray;
import textnow.u.r;

public final class al extends ak
{
  private static SparseArray<Pair<Float, Integer>> c;

  static
  {
    SparseArray localSparseArray = new SparseArray();
    c = localSparseArray;
    localSparseArray.put(2131493393, new Pair(Float.valueOf(1.0F), Integer.valueOf(2131493394)));
  }

  private al(float paramFloat, String paramString1, String paramString2)
  {
    super(paramFloat, paramString1, paramString2);
  }

  public static al a(int paramInt, Resources paramResources)
  {
    Pair localPair = (Pair)c.get(paramInt);
    if (localPair == null)
      return new al(0.0F, paramResources.getString(paramInt), "");
    return new al(((Float)localPair.first).floatValue(), paramResources.getString(paramInt), paramResources.getString(((Integer)localPair.second).intValue()));
  }

  public final Drawable a(Context paramContext)
  {
    if (new r(paramContext).ac().intValue() == 0)
      return paramContext.getResources().getDrawable(2130837625);
    return paramContext.getResources().getDrawable(2131296328);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.al
 * JD-Core Version:    0.6.2
 */