package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class be
  implements bf
{
  private final List<bf> a;

  public be()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bd());
    localArrayList.add(new bi());
    localArrayList.add(new bb());
    localArrayList.add(new bh());
    this.a = Collections.unmodifiableList(localArrayList);
  }

  public final boolean a(Context paramContext, bj parambj)
  {
    if ((paramContext == null) || (parambj == null))
    {
      bool1 = false;
      return bool1;
    }
    Iterator localIterator = this.a.iterator();
    boolean bool1 = true;
    label25: if (localIterator.hasNext())
      if (((bf)localIterator.next()).a(paramContext, parambj))
        break label64;
    label64: for (boolean bool2 = false; ; bool2 = bool1)
    {
      bool1 = bool2;
      break label25;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.be
 * JD-Core Version:    0.6.2
 */