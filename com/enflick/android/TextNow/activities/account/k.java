package com.enflick.android.TextNow.activities.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.c;
import textnow.q.b;
import textnow.u.q;

public final class k extends ao
{
  private q a;
  private TextView b;
  private SubscriptionPlanView g;
  private TextView h;

  public static k a()
  {
    return new k();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final String k()
  {
    return "/View_Plan";
  }

  public final String l()
  {
    return this.e.getString(2131493435);
  }

  public final int m()
  {
    return 2131165540;
  }

  public final boolean n()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new q(this.e);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903195, null);
    this.g = ((SubscriptionPlanView)localView.findViewById(2131165698));
    this.b = ((TextView)localView.findViewById(2131165699));
    this.h = ((TextView)localView.findViewById(2131165700));
    ((Button)localView.findViewById(2131165697)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        k.a(k.this).a(e.a());
      }
    });
    return localView;
  }

  public final void onResume()
  {
    super.onResume();
    Plan localPlan = this.a.b();
    if (localPlan != null)
    {
      this.g.a(localPlan, false);
      TextView localTextView1 = this.b;
      MainActivity localMainActivity1 = this.e;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = b.a(this.a.e(), "MMM d, yyyy");
      localTextView1.setText(localMainActivity1.getString(2131493449, arrayOfObject1));
      TextView localTextView2 = this.h;
      MainActivity localMainActivity2 = this.e;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.a.d().toUpperCase();
      localTextView2.setText(localMainActivity2.getString(2131493450, arrayOfObject2));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.k
 * JD-Core Version:    0.6.2
 */