package com.enflick.android.TextNow.activities.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import textnow.z.s;

public class PlanSelectionView extends LinearLayout
  implements View.OnClickListener, m
{
  private SubscriptionPlanView a;
  private SubscriptionPlanView b;
  private SubscriptionPlanView c;
  private SubscriptionPlanView d;
  private List<SubscriptionPlanView> e = new ArrayList();
  private j f;
  private s g;

  public PlanSelectionView(Context paramContext)
  {
    super(paramContext);
    this.g = new s(paramContext);
  }

  public PlanSelectionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g = new s(paramContext);
  }

  public PlanSelectionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = new s(paramContext);
  }

  public final SubscriptionPlanView a()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      SubscriptionPlanView localSubscriptionPlanView = (SubscriptionPlanView)localIterator.next();
      if (localSubscriptionPlanView.a())
        return localSubscriptionPlanView;
    }
    return null;
  }

  public final void a(SubscriptionPlanView paramSubscriptionPlanView)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      SubscriptionPlanView localSubscriptionPlanView = (SubscriptionPlanView)localIterator.next();
      if (paramSubscriptionPlanView != localSubscriptionPlanView)
        localSubscriptionPlanView.a(false);
    }
    if (this.f != null)
      this.f.a(paramSubscriptionPlanView);
  }

  public final void a(j paramj)
  {
    this.f = paramj;
  }

  public final void a(boolean paramBoolean)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((SubscriptionPlanView)localIterator.next()).b(paramBoolean);
  }

  public final void b()
  {
    Plan localPlan1 = this.g.d();
    if (localPlan1 == null);
    for (Plan localPlan2 = this.g.c(); ; localPlan2 = localPlan1)
    {
      if (localPlan2 != null)
      {
        Iterator localIterator = this.e.iterator();
        while (localIterator.hasNext())
        {
          SubscriptionPlanView localSubscriptionPlanView = (SubscriptionPlanView)localIterator.next();
          if ((localSubscriptionPlanView.b() != null) && (localSubscriptionPlanView.b().id == localPlan2.id))
            localSubscriptionPlanView.a(true);
        }
      }
      return;
    }
  }

  public final void c()
  {
    this.a.a(this.g.a(5), true);
    this.b.a(this.g.a(6), true);
    this.c.a(this.g.a(7), true);
    this.d.a(this.g.a(8), true);
  }

  public void onClick(View paramView)
  {
    if ((paramView instanceof SubscriptionPlanView))
      ((SubscriptionPlanView)paramView).a(true);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((SubscriptionPlanView)findViewById(2131558895));
    this.b = ((SubscriptionPlanView)findViewById(2131558896));
    this.c = ((SubscriptionPlanView)findViewById(2131558897));
    this.d = ((SubscriptionPlanView)findViewById(2131558898));
    this.e.add(this.a);
    this.e.add(this.b);
    this.e.add(this.c);
    this.e.add(this.d);
    this.a.a(this);
    this.a.setOnClickListener(this);
    this.b.a(this);
    this.b.setOnClickListener(this);
    this.c.a(this);
    this.c.setOnClickListener(this);
    this.d.a(this);
    this.d.setOnClickListener(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.PlanSelectionView
 * JD-Core Version:    0.6.2
 */