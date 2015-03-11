package com.flurry.sdk;

import android.content.Context;
import android.view.ViewGroup;
import com.flurry.android.impl.ads.FlurryAdModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class m
{
  private static final String a = m.class.getSimpleName();
  private Map<String, Stack<WeakReference<l>>> b = new HashMap();

  private void a(String paramString, l paraml)
  {
    Stack localStack = (Stack)this.b.get(paramString);
    if (localStack == null)
    {
      localStack = new Stack();
      this.b.put(paramString, localStack);
    }
    localStack.push(new WeakReference(paraml));
  }

  public final l a(FlurryAdModule paramFlurryAdModule, Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    try
    {
      l locall = a(paramString);
      if (locall != null)
      {
        boolean bool = locall.getContext().equals(paramContext);
        if (!bool);
      }
      while (true)
      {
        return locall;
        locall = new l(paramFlurryAdModule, paramContext, paramString, paramViewGroup);
        a(paramString, locall);
      }
    }
    finally
    {
    }
  }

  public final l a(String paramString)
  {
    try
    {
      if (this.b.containsKey(paramString))
      {
        Stack localStack = (Stack)this.b.get(paramString);
        if (localStack.size() > 0);
        for (locall = (l)((WeakReference)localStack.peek()).get(); ; locall = null)
          return locall;
      }
      l locall = null;
    }
    finally
    {
    }
  }

  public final List<l> a(Context paramContext)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      Iterator localIterator1 = this.b.values().iterator();
      while (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((Stack)localIterator1.next()).iterator();
        while (localIterator2.hasNext())
        {
          l locall = (l)((WeakReference)localIterator2.next()).get();
          if ((locall != null) && ((paramContext == null) || (paramContext == locall.getContext())))
            localArrayList.add(locall);
        }
      }
    }
    finally
    {
    }
    return localArrayList;
  }

  public final void a(l paraml)
  {
    if (paraml == null);
    while (true)
    {
      return;
      try
      {
        String str = paraml.getAdSpace();
        Stack localStack = (Stack)this.b.get(str);
        if (localStack == null)
          continue;
        Iterator localIterator = localStack.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          if (paraml == localWeakReference.get())
            if (localStack.remove(localWeakReference))
              eo.a(3, a, "removed banner holder for adSpaceName: " + paraml.getAdSpace());
        }
        if (localStack.size() != 0)
          continue;
        this.b.remove(str);
      }
      finally
      {
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.m
 * JD-Core Version:    0.6.2
 */