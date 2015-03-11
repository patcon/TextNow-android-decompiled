package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

public class PullToRefreshListView extends PullToRefreshAdapterViewBase<ListView>
{
  private textnow.al.d b;
  private textnow.al.d c;
  private FrameLayout d;
  private boolean e;
  private Animation f;
  private Animation g;

  public PullToRefreshListView(Context paramContext)
  {
    super(paramContext);
    x();
  }

  public PullToRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    x();
  }

  public PullToRefreshListView(Context paramContext, e parame)
  {
    super(paramContext, parame);
    x();
  }

  public PullToRefreshListView(Context paramContext, e parame, d paramd)
  {
    super(paramContext, parame, paramd);
    x();
  }

  private void x()
  {
    this.f = AnimationUtils.loadAnimation(getContext(), 2130968582);
    this.f.setDuration(200L);
    this.f.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        PullToRefreshListView.this.setVisibility(0);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    this.g = AnimationUtils.loadAnimation(getContext(), 2130968584);
    this.g.setDuration(200L);
    this.g.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        PullToRefreshListView.this.setVisibility(4);
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    if (getVisibility() != 0)
      startAnimation(this.f);
  }

  protected final void a(TypedArray paramTypedArray)
  {
    super.a(paramTypedArray);
    this.e = paramTypedArray.getBoolean(14, true);
    if (this.e)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
      FrameLayout localFrameLayout = new FrameLayout(getContext());
      this.b = a(getContext(), e.b, paramTypedArray);
      this.b.setVisibility(8);
      localFrameLayout.addView(this.b, localLayoutParams);
      ((ListView)this.a).addHeaderView(localFrameLayout, null, false);
      this.d = new FrameLayout(getContext());
      this.c = a(getContext(), e.c, paramTypedArray);
      this.c.setVisibility(8);
      this.d.addView(this.c, localLayoutParams);
      if (!paramTypedArray.hasValue(13))
        c(true);
    }
  }

  protected final b b(boolean paramBoolean1, boolean paramBoolean2)
  {
    b localb = super.b(paramBoolean1, paramBoolean2);
    if (this.e)
    {
      e locale = h();
      if ((paramBoolean1) && (locale.c()))
        localb.a(this.b);
      if ((paramBoolean2) && (locale.d()))
        localb.a(this.c);
    }
    return localb;
  }

  protected final void b(boolean paramBoolean)
  {
    ListAdapter localListAdapter = ((ListView)this.a).getAdapter();
    if ((!this.e) || (!j()) || (localListAdapter == null) || (localListAdapter.isEmpty()))
    {
      super.b(paramBoolean);
      return;
    }
    super.b(false);
    textnow.al.d locald1;
    int n;
    Object localObject;
    int k;
    switch (3.a[g().ordinal()])
    {
    default:
      locald1 = t();
      textnow.al.d locald3 = this.c;
      n = -u();
      localObject = locald3;
      k = 0;
    case 1:
    case 2:
    }
    int j;
    for (int m = n; ; m = j)
    {
      locald1.h();
      ((textnow.al.d)localObject).setVisibility(8);
      if (!paramBoolean)
        break;
      q();
      ((ListView)this.a).setSelection(k);
      b(m);
      return;
      locald1 = r();
      textnow.al.d locald2 = this.b;
      int i = -1 + ((ListView)this.a).getCount();
      j = s();
      localObject = locald2;
      k = i;
    }
  }

  protected final void c()
  {
    int i = 0;
    int j = 1;
    if (!this.e)
    {
      super.c();
      return;
    }
    textnow.al.d locald3;
    textnow.al.d locald4;
    int i2;
    switch (3.a[g().ordinal()])
    {
    default:
      locald3 = t();
      locald4 = this.b;
      i2 = -u();
      if (Math.abs(0 + ((ListView)this.a).getFirstVisiblePosition()) > j)
        break;
    case 1:
    case 2:
    }
    while (true)
    {
      int n = j;
      int i1 = i2;
      Object localObject1 = locald4;
      Object localObject2 = locald3;
      if (((textnow.al.d)localObject1).getVisibility() == 0)
      {
        ((textnow.al.d)localObject2).k();
        ((textnow.al.d)localObject1).setVisibility(8);
        if ((n != 0) && (k() != m.e))
        {
          ((ListView)this.a).setSelection(i);
          a(i1);
        }
      }
      super.c();
      return;
      textnow.al.d locald1 = r();
      textnow.al.d locald2 = this.c;
      int k = -1 + ((ListView)this.a).getCount();
      int m = s();
      if (Math.abs(((ListView)this.a).getLastVisiblePosition() - k) <= j);
      for (n = j; ; n = 0)
      {
        i = k;
        i1 = m;
        localObject1 = locald2;
        localObject2 = locald1;
        break;
      }
      j = 0;
    }
  }

  public final void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((ListView)this.a).setTranscriptMode(2);
      return;
    }
    ((ListView)this.a).setTranscriptMode(0);
  }

  public final k p()
  {
    return k.a;
  }

  public final boolean w()
  {
    return ((ListView)this.a).getTranscriptMode() == 2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.PullToRefreshListView
 * JD-Core Version:    0.6.2
 */