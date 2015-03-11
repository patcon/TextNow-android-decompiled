package com.enflick.android.TextNow.activities.account;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.c;
import textnow.q.b;
import textnow.u.q;

public final class j extends ao
{
  private q a;
  private TextView b;
  private ProgressBar g;
  private TextView h;

  public static j a()
  {
    return new j();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final String k()
  {
    return "/View_Plan_Data";
  }

  public final String l()
  {
    return this.e.getString(2131493436);
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
    View localView = paramLayoutInflater.inflate(2130903194, null);
    this.b = ((TextView)localView.findViewById(2131165535));
    this.g = ((ProgressBar)localView.findViewById(2131165536));
    this.h = ((TextView)localView.findViewById(2131165696));
    ((Button)localView.findViewById(2131165697)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        j.a(j.this).a(e.a());
      }
    });
    return localView;
  }

  public final void onResume()
  {
    super.onResume();
    Plan localPlan = this.a.b();
    int i;
    Rect localRect;
    if (localPlan != null)
    {
      TextView localTextView1 = this.b;
      MainActivity localMainActivity1 = this.e;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = (b.a(this.a.c()) + " / " + b.a(localPlan.data));
      localTextView1.setText(localMainActivity1.getString(2131493451, arrayOfObject1));
      TextView localTextView2 = this.h;
      MainActivity localMainActivity2 = this.e;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = b.a(localPlan.data);
      arrayOfObject2[1] = localPlan.name;
      arrayOfObject2[2] = b.a(this.a.e(), "MMM d, yyyy");
      localTextView2.setText(localMainActivity2.getString(2131493458, arrayOfObject2));
      i = Math.min(100, 100 * this.a.c() / localPlan.data);
      localRect = this.g.getProgressDrawable().getBounds();
      if (i < 95)
        break label243;
      this.g.setProgressDrawable(getResources().getDrawable(2130837839));
    }
    while (true)
    {
      this.g.getProgressDrawable().setBounds(localRect);
      this.g.setProgress(i + 1);
      this.g.setProgress(i);
      return;
      label243: this.g.setProgressDrawable(getResources().getDrawable(2130837838));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.j
 * JD-Core Version:    0.6.2
 */