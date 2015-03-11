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
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.GetPlansTask;
import com.enflick.android.TextNow.tasks.UpdateSubscriptionPlanTask;
import com.enflick.android.TextNow.tasks.c;
import textnow.z.s;

public final class e extends av
  implements j
{
  private s a;
  private ProgressBar b;
  private View f;
  private Button g;
  private PlanSelectionView h;
  private AlertDialog i;

  public static e a()
  {
    return new e();
  }

  public final void a(SubscriptionPlanView paramSubscriptionPlanView)
  {
    Plan localPlan = this.a.d();
    Button localButton = this.g;
    if ((localPlan == null) || (paramSubscriptionPlanView.b().id != localPlan.id));
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
      this.d.v();
      if ((this.i != null) && (this.i.isShowing()))
        this.i.dismiss();
      if (localUpdateSubscriptionPlanTask.h())
        this.d.b(2131296866);
    }
    do
    {
      return true;
      this.d.onBackPressed();
      this.d.b(2131296865);
      return true;
      if (paramc.getClass() != GetPlansTask.class)
        break label156;
      boolean bool = paramc.h();
      this.b.setVisibility(8);
      if (!bool)
        break;
    }
    while (this.a.a(5) != null);
    this.d.b(2131296868);
    return true;
    this.f.setVisibility(0);
    this.h.c();
    this.h.b();
    return true;
    label156: return false;
  }

  public final String l()
  {
    return "/Change_Plan";
  }

  public final String m()
  {
    return this.d.getString(2131296842);
  }

  public final int n()
  {
    return 2131558831;
  }

  public final boolean o()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new s(this.d);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903085, null);
    this.b = ((ProgressBar)localView.findViewById(2131558582));
    this.f = localView.findViewById(2131558583);
    this.h = ((PlanSelectionView)localView.findViewById(2131558584));
    this.h.a(this);
    this.g = ((Button)localView.findViewById(2131558585));
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SubscriptionPlanView localSubscriptionPlanView = e.a(e.this).a();
        if (localSubscriptionPlanView != null)
          e.a(e.this, localSubscriptionPlanView);
      }
    });
    if (this.a.a(5) != null)
    {
      this.h.c();
      this.b.setVisibility(8);
      this.f.setVisibility(0);
    }
    while (true)
    {
      new GetPlansTask().b(this.d);
      return localView;
      this.b.setVisibility(0);
      this.f.setVisibility(8);
    }
  }

  public final void onResume()
  {
    super.onResume();
    this.h.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.e
 * JD-Core Version:    0.6.2
 */