package com.enflick.android.TextNow.activities.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.c;
import textnow.v.b;
import textnow.z.s;

public final class l extends av
{
  private s a;
  private TextView b;
  private SubscriptionPlanView f;
  private SubscriptionPlanView g;
  private View h;
  private TextView i;
  private TextView j;
  private Button k;
  private Button l;

  public static l a()
  {
    return new l();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final String l()
  {
    return "/View_Plan";
  }

  public final String m()
  {
    return this.d.getString(2131296827);
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
    View localView = paramLayoutInflater.inflate(2130903213, null);
    this.f = ((SubscriptionPlanView)localView.findViewById(2131559001));
    this.b = ((TextView)localView.findViewById(2131559003));
    this.g = ((SubscriptionPlanView)localView.findViewById(2131559005));
    this.h = localView.findViewById(2131559004);
    this.i = ((TextView)localView.findViewById(2131559002));
    this.j = ((TextView)localView.findViewById(2131559000));
    this.k = ((Button)localView.findViewById(2131558999));
    this.k.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        l.a(l.this).a(e.a());
      }
    });
    this.l = ((Button)localView.findViewById(2131559006));
    this.l.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        l.b(l.this).c(false);
      }
    });
    return localView;
  }

  public final void onResume()
  {
    super.onResume();
    if ("EXPIRED".equalsIgnoreCase(this.a.f()))
    {
      this.l.setVisibility(0);
      this.k.setVisibility(8);
      this.h.setVisibility(8);
      this.b.setVisibility(8);
      this.j.setText(2131296976);
    }
    while (true)
    {
      Plan localPlan1 = this.a.c();
      if (localPlan1 != null)
      {
        this.f.a(localPlan1, false);
        TextView localTextView1 = this.b;
        MainActivity localMainActivity1 = this.d;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = b.a(this.a.g(), "MMM d, yyyy");
        localTextView1.setText(localMainActivity1.getString(2131296837, arrayOfObject1));
        TextView localTextView2 = this.i;
        MainActivity localMainActivity2 = this.d;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.a.f().toUpperCase();
        localTextView2.setText(localMainActivity2.getString(2131296838, arrayOfObject2));
        Plan localPlan2 = this.a.d();
        if ((localPlan2 == null) || (localPlan2.id == localPlan1.id))
          break;
        this.g.a(localPlan2, false);
        this.h.setVisibility(0);
      }
      return;
      this.l.setVisibility(8);
      this.k.setVisibility(0);
      this.k.setEnabled(true);
      this.h.setVisibility(0);
      this.b.setVisibility(0);
      this.j.setText(2131296836);
    }
    this.h.setVisibility(8);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.l
 * JD-Core Version:    0.6.2
 */