package com.flurry.sdk;

import java.util.Comparator;

public class ee
  implements Comparator<Runnable>
{
  private static final String a = ee.class.getSimpleName();

  private int a(Runnable paramRunnable)
  {
    int i = 2147483647;
    fg localfg;
    if (paramRunnable != null)
    {
      if (!(paramRunnable instanceof ef))
        break label40;
      localfg = (fg)((ef)paramRunnable).a();
      if (localfg == null)
        break label90;
    }
    label40: label90: for (int j = localfg.i(); ; j = i)
    {
      i = j;
      return i;
      if ((paramRunnable instanceof fg))
        return ((fg)paramRunnable).i();
      eo.a(6, a, "Unknown runnable class: " + paramRunnable.getClass().getName());
      return i;
    }
  }

  public int a(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    int i = a(paramRunnable1);
    int j = a(paramRunnable2);
    if (i < j)
      return -1;
    if (i > j)
      return 1;
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ee
 * JD-Core Version:    0.6.2
 */