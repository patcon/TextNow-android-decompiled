package com.enflick.android.TextNow.chatheads;

import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.at.a;
import textnow.at.b;
import textnow.at.o;
import textnow.at.q;

public final class c
{
  private static String a = "ChatHeadAnimationManager";
  private static c i = null;
  private Interpolator b = new OvershootInterpolator(2.0F);
  private Interpolator c = new AccelerateInterpolator();
  private View d = null;
  private int e = -1;
  private f f;
  private Map<View, ArrayList<Integer>> g = new HashMap();
  private ArrayList<e> h = new ArrayList();

  private c(f paramf)
  {
    this.f = paramf;
  }

  public static c a(f paramf)
  {
    if (i == null)
    {
      c localc = new c(paramf);
      i = localc;
      return localc;
    }
    return i;
  }

  private void a(View paramView, o paramo)
  {
    ArrayList localArrayList2;
    if (this.g.containsKey(paramView))
    {
      localArrayList2 = (ArrayList)this.g.get(paramView);
      if (localArrayList2 == null)
      {
        localArrayList2 = new ArrayList();
        localArrayList2.add(Integer.valueOf(paramo.d()));
        this.g.put(paramView, localArrayList2);
      }
    }
    while (true)
    {
      new StringBuilder().append("animation qty for view ").append(paramView.getId()).append(" = ").append(((ArrayList)this.g.get(paramView)).size()).toString();
      return;
      localArrayList2.add(Integer.valueOf(paramo.d()));
      break;
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.add(Integer.valueOf(paramo.d()));
      this.g.put(paramView, localArrayList1);
    }
  }

  public final void a(final View paramView, final d paramd)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(paramView.getContext(), 2130968590);
    localAnimation.setFillAfter(true);
    localAnimation.setDuration(200L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        c.a(c.this, paramView, paramd, 9);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    paramView.startAnimation(localAnimation);
  }

  public final void a(final View paramView, final d paramd, float paramFloat1, float paramFloat2)
  {
    final o localo = o.a(new float[] { paramFloat1, paramFloat2 });
    localo.a(5);
    a(paramView, localo);
    localo.a(new q()
    {
      public final void a(o paramAnonymouso)
      {
        if ((c.a(c.this) == 5) && (c.b(c.this) == paramView))
        {
          c.a();
          localo.b();
          c.a(c.this, -1);
          c.a(c.this, null);
          return;
        }
        paramView.setBackgroundColor(Color.argb((int)(255.0F * ((Float)paramAnonymouso.e()).floatValue()), 0, 0, 0));
      }
    });
    localo.a(new b()
    {
      public final void a(a paramAnonymousa)
      {
      }

      public final void b(a paramAnonymousa)
      {
        c.a(c.this, paramView, paramd, 5);
      }

      public final void c(a paramAnonymousa)
      {
      }

      public final void d(a paramAnonymousa)
      {
      }
    });
    localo.a(200L);
    localo.a(this.c);
    localo.a();
  }

  public final void a(View paramView, d paramd, int paramInt1, int paramInt2)
  {
    this.h.add(new e(this, paramView, paramd, paramInt1, paramInt2));
  }

  public final void a(View paramView, d paramd, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    new StringBuilder().append("starting animation ").append(paramInt3).toString();
    int j = 500;
    if ((paramInt3 == 7) || (paramInt3 == 6) || (paramInt3 == 4))
      j = 200;
    a(paramView, paramd, paramInt1, paramInt2);
    a(paramBoolean, j, paramInt3);
  }

  public final void a(boolean paramBoolean, int paramInt1, final int paramInt2)
  {
    Interpolator localInterpolator1 = this.b;
    if (paramBoolean);
    for (Interpolator localInterpolator2 = this.c; ; localInterpolator2 = localInterpolator1)
    {
      final o localo = o.a(new float[] { 0.0F, 1.0F });
      localo.a(paramInt2);
      final ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        e locale = (e)localIterator.next();
        a(locale.e, localo);
        localArrayList.add(locale);
      }
      this.h.clear();
      localo.a(new q()
      {
        public final void a(o paramAnonymouso)
        {
          float f = ((Float)paramAnonymouso.e()).floatValue();
          Iterator localIterator = localArrayList.iterator();
          while (true)
          {
            e locale;
            if (localIterator.hasNext())
            {
              locale = (e)localIterator.next();
              if (paramInt2 == c.a(c.this))
              {
                c.a();
                new StringBuilder().append("cancelling animation ").append(paramInt2).toString();
                localo.b();
                c.a(c.this, -1);
              }
            }
            else
            {
              return;
            }
            c.a(c.this, locale.e, Integer.valueOf((int)(f * locale.c + locale.a)), Integer.valueOf((int)(f * locale.d + paramInt2)), null, null);
          }
        }
      });
      localo.a(new b()
      {
        public final void a(a paramAnonymousa)
        {
        }

        public final void b(a paramAnonymousa)
        {
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            e locale = (e)localIterator.next();
            c.a(c.this, locale.e, locale.f, paramInt2);
          }
          localArrayList.clear();
        }

        public final void c(a paramAnonymousa)
        {
        }

        public final void d(a paramAnonymousa)
        {
        }
      });
      localo.a(paramInt1);
      localo.a(localInterpolator2);
      localo.a();
      return;
    }
  }

  public final boolean a(int paramInt)
  {
    Iterator localIterator = this.g.entrySet().iterator();
    while (true)
    {
      boolean bool1 = localIterator.hasNext();
      boolean bool2 = false;
      ArrayList localArrayList;
      if (bool1)
        localArrayList = (ArrayList)((Map.Entry)localIterator.next()).getValue();
      for (int j = 0; j < localArrayList.size(); j++)
        if (((Integer)localArrayList.get(j)).intValue() == 8)
        {
          bool2 = true;
          return bool2;
        }
      localIterator.remove();
    }
  }

  public final boolean a(View paramView, int paramInt)
  {
    if (!this.g.containsKey(paramView))
      return false;
    Iterator localIterator = ((ArrayList)this.g.get(paramView)).iterator();
    while (localIterator.hasNext())
      if (((Integer)localIterator.next()).intValue() == 8)
        return true;
    return false;
  }

  public final void b(int paramInt)
  {
    this.e = 8;
  }

  public final void b(final View paramView, final d paramd)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(paramView.getContext(), 2130968589);
    localAnimation.setFillAfter(true);
    localAnimation.setDuration(200L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        c.a(c.this, paramView, paramd, 10);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    paramView.startAnimation(localAnimation);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.c
 * JD-Core Version:    0.6.2
 */