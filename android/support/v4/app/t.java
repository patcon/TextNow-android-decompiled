package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class t
{
  public static Object a(Object paramObject)
  {
    if (paramObject != null)
      paramObject = ((Transition)paramObject).clone();
    return paramObject;
  }

  public static Object a(Object paramObject, View paramView, ArrayList<View> paramArrayList, Map<String, View> paramMap)
  {
    if (paramObject != null)
    {
      b(paramArrayList, paramView);
      if (paramMap != null)
        paramArrayList.removeAll(paramMap.values());
      if (paramArrayList.isEmpty())
        paramObject = null;
    }
    else
    {
      return paramObject;
    }
    b((Transition)paramObject, paramArrayList);
    return paramObject;
  }

  public static void a(Object paramObject, View paramView)
  {
    ((Transition)paramObject).setEpicenterCallback(new Transition.EpicenterCallback()
    {
      public final Rect onGetEpicenter(Transition paramAnonymousTransition)
      {
        return t.this;
      }
    });
  }

  public static void a(Object paramObject, View paramView, boolean paramBoolean)
  {
    ((Transition)paramObject).excludeTarget(paramView, paramBoolean);
  }

  public static void a(Object paramObject1, Object paramObject2, View paramView1, final v paramv, View paramView2, u paramu, final Map<String, String> paramMap, final ArrayList<View> paramArrayList1, final Map<String, View> paramMap1, ArrayList<View> paramArrayList2)
  {
    if ((paramObject1 != null) || (paramObject2 != null))
    {
      final Transition localTransition = (Transition)paramObject1;
      if (localTransition != null)
        localTransition.addTarget(paramView2);
      if (paramObject2 != null)
        b((Transition)paramObject2, paramArrayList2);
      if (paramv != null)
        paramView1.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            t.this.getViewTreeObserver().removeOnPreDrawListener(this);
            View localView1 = paramv.a();
            if (localView1 != null)
            {
              if (!paramMap.isEmpty())
              {
                t.a(paramMap1, localView1);
                paramMap1.keySet().retainAll(paramMap.values());
                Iterator localIterator = paramMap.entrySet().iterator();
                while (localIterator.hasNext())
                {
                  Map.Entry localEntry = (Map.Entry)localIterator.next();
                  String str = (String)localEntry.getValue();
                  View localView2 = (View)paramMap1.get(str);
                  if (localView2 != null)
                    localView2.setTransitionName((String)localEntry.getKey());
                }
              }
              if (localTransition != null)
              {
                t.a(paramArrayList1, localView1);
                paramArrayList1.removeAll(paramMap1.values());
                t.b(localTransition, paramArrayList1);
              }
            }
            return true;
          }
        });
      if (localTransition != null)
        localTransition.setEpicenterCallback(new Transition.EpicenterCallback()
        {
          private Rect b;

          public final Rect onGetEpicenter(Transition paramAnonymousTransition)
          {
            if ((this.b == null) && (t.this.a != null))
              this.b = t.a(t.this.a);
            return this.b;
          }
        });
    }
  }

  public static void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    Transition localTransition = (Transition)paramObject;
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      localTransition.removeTarget((View)paramArrayList.get(j));
  }

  public static void a(Map<String, View> paramMap, View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null)
        paramMap.put(str, paramView);
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int i = localViewGroup.getChildCount();
        for (int j = 0; j < i; j++)
          a(paramMap, localViewGroup.getChildAt(j));
      }
    }
  }

  private static Rect b(View paramView)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    localRect.set(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + paramView.getWidth(), arrayOfInt[1] + paramView.getHeight());
    return localRect;
  }

  public static void b(Object paramObject, ArrayList<View> paramArrayList)
  {
    Transition localTransition = (Transition)paramObject;
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
      localTransition.addTarget((View)paramArrayList.get(j));
  }

  private static void b(ArrayList<View> paramArrayList, View paramView)
  {
    ViewGroup localViewGroup;
    if (paramView.getVisibility() == 0)
    {
      if (!(paramView instanceof ViewGroup))
        break label65;
      localViewGroup = (ViewGroup)paramView;
      if (!localViewGroup.isTransitionGroup())
        break label33;
      paramArrayList.add(localViewGroup);
    }
    while (true)
    {
      return;
      label33: int i = localViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
        b(paramArrayList, localViewGroup.getChildAt(j));
    }
    label65: paramArrayList.add(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.t
 * JD-Core Version:    0.6.2
 */