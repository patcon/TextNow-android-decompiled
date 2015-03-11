package com.enflick.android.TextNow.activities.account;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.GetPlansTask;
import com.enflick.android.TextNow.tasks.UpdateSubscriptionPlanTask;
import com.enflick.android.TextNow.tasks.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import textnow.u.q;

public final class e extends ao
  implements View.OnClickListener, l
{
  private q a;
  private ProgressBar b;
  private SubscriptionPlanView g;
  private SubscriptionPlanView h;
  private SubscriptionPlanView i;
  private View j;
  private Button k;
  private List<SubscriptionPlanView> l = new ArrayList(3);
  private AlertDialog m;

  public static e a()
  {
    return new e();
  }

  private void b()
  {
    Plan localPlan = this.a.b();
    if (localPlan != null)
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext())
      {
        SubscriptionPlanView localSubscriptionPlanView = (SubscriptionPlanView)localIterator.next();
        if (localSubscriptionPlanView.c() != null)
          if (localSubscriptionPlanView.c().id == localPlan.id)
            localSubscriptionPlanView.a(true);
          else if (localSubscriptionPlanView.c().data < localPlan.data)
            localSubscriptionPlanView.b(false);
      }
    }
  }

  private void c()
  {
    this.g.a(this.a.a(5), true);
    this.h.a(this.a.a(6), true);
    this.i.a(this.a.a(7), true);
  }

  public final void a(SubscriptionPlanView paramSubscriptionPlanView)
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
    {
      SubscriptionPlanView localSubscriptionPlanView = (SubscriptionPlanView)localIterator.next();
      if (paramSubscriptionPlanView != localSubscriptionPlanView)
        localSubscriptionPlanView.a(false);
    }
    Plan localPlan = this.a.b();
    Button localButton = this.k;
    if ((localPlan == null) || (paramSubscriptionPlanView.c().id != localPlan.id));
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == UpdateSubscriptionPlanTask.class)
    {
      UpdateSubscriptionPlanTask localUpdateSubscriptionPlanTask = (UpdateSubscriptionPlanTask)paramc;
      this.e.r();
      if ((this.m != null) && (this.m.isShowing()))
        this.m.dismiss();
      if (localUpdateSubscriptionPlanTask.h())
        this.e.c(2131493492);
    }
    do
    {
      return true;
      this.e.onBackPressed();
      this.e.c(2131493491);
      return true;
      if (paramc.getClass() != GetPlansTask.class)
        break label150;
      boolean bool = paramc.h();
      this.b.setVisibility(8);
      if (!bool)
        break;
    }
    while (this.a.a(5) != null);
    this.e.c(2131493494);
    return true;
    this.j.setVisibility(0);
    c();
    b();
    return true;
    label150: return false;
  }

  public final String k()
  {
    return "/Change_Plan";
  }

  public final String l()
  {
    return this.e.getString(2131493455);
  }

  public final int m()
  {
    return 2131165540;
  }

  public final boolean n()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    if ((paramView instanceof SubscriptionPlanView))
    {
      if (!((SubscriptionPlanView)paramView).b())
        this.e.c(2131493495);
    }
    else
      return;
    ((SubscriptionPlanView)paramView).a(true);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new q(this.e);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903077, null);
    this.b = ((ProgressBar)localView.findViewById(2131165328));
    this.j = localView.findViewById(2131165329);
    this.g = ((SubscriptionPlanView)localView.findViewById(2131165330));
    this.h = ((SubscriptionPlanView)localView.findViewById(2131165331));
    this.i = ((SubscriptionPlanView)localView.findViewById(2131165332));
    this.l.add(this.g);
    this.l.add(this.h);
    this.l.add(this.i);
    this.g.a(this);
    this.g.setOnClickListener(this);
    this.h.a(this);
    this.h.setOnClickListener(this);
    this.i.a(this);
    this.i.setOnClickListener(this);
    this.k = ((Button)localView.findViewById(2131165333));
    this.k.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SubscriptionPlanView localSubscriptionPlanView = e.a(e.this);
        if (localSubscriptionPlanView != null)
          e.a(e.this, localSubscriptionPlanView);
      }
    });
    if (this.a.a(5) != null)
    {
      c();
      this.b.setVisibility(8);
      this.j.setVisibility(0);
    }
    while (true)
    {
      new GetPlansTask().b(this.e);
      return localView;
      this.b.setVisibility(0);
      this.j.setVisibility(8);
    }
  }

  public final void onResume()
  {
    super.onResume();
    b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.e
 * JD-Core Version:    0.6.2
 */