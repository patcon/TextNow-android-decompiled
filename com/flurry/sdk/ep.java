package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ep
  implements et
{
  private static ep a;
  private final List<et> b = b();

  public static ep a()
  {
    try
    {
      if (a == null)
        a = new ep();
      ep localep = a;
      return localep;
    }
    finally
    {
    }
  }

  private static List<et> b()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new eq("com.flurry.android.impl.analytics.FlurryAnalyticsModule", 10));
    localArrayList.add(new eq("com.flurry.android.impl.ads.FlurryAdModule", 10));
    return Collections.unmodifiableList(localArrayList);
  }

  public final void a(dj paramdj)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((et)localIterator.next()).a(paramdj);
  }

  public final void a(dj paramdj, Context paramContext)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((et)localIterator.next()).a(paramdj, paramContext);
  }

  public final void b(dj paramdj, Context paramContext)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((et)localIterator.next()).b(paramdj, paramContext);
  }

  public final void c(dj paramdj, Context paramContext)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((et)localIterator.next()).c(paramdj, paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ep
 * JD-Core Version:    0.6.2
 */