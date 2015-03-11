package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseArray;
import textnow.z.u;

public final class as extends ar
{
  private static SparseArray<Pair<Float, Integer>> c;

  static
  {
    SparseArray localSparseArray = new SparseArray();
    c = localSparseArray;
    localSparseArray.put(2131296790, new Pair(Float.valueOf(1.0F), Integer.valueOf(2131296791)));
  }

  private as(float paramFloat, String paramString1, String paramString2, aq paramaq)
  {
    super("error", paramFloat, paramString1, paramString2, paramaq);
  }

  public static as a(int paramInt, Resources paramResources, aq paramaq)
  {
    Pair localPair = (Pair)c.get(paramInt);
    if (localPair == null)
      return new as(0.0F, paramResources.getString(paramInt), "", paramaq);
    return new as(((Float)localPair.first).floatValue(), paramResources.getString(paramInt), paramResources.getString(((Integer)localPair.second).intValue()), paramaq);
  }

  public final Drawable a(Context paramContext)
  {
    if (new u(paramContext).ab().intValue() == 0)
      return paramContext.getResources().getDrawable(2130837580);
    return paramContext.getResources().getDrawable(2131230849);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.as
 * JD-Core Version:    0.6.2
 */