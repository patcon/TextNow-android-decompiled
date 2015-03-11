package com.enflick.android.TextNow.activities.account;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.c;
import textnow.v.b;
import textnow.v.y;
import textnow.z.s;

public class k extends av
{
  private s a;
  private TextView b;
  private ProgressBar f;
  private TextView g;

  public static k a()
  {
    return new k();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final String l()
  {
    return "/View_Plan_Data";
  }

  public final String m()
  {
    return this.d.getString(2131296828);
  }

  public final int n()
  {
    return 2131558831;
  }

  public final boolean o()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new s(this.d);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903212, null);
    this.b = ((TextView)localView.findViewById(2131558812));
    this.f = ((ProgressBar)localView.findViewById(2131558813));
    this.g = ((TextView)localView.findViewById(2131558998));
    Button localButton = (Button)localView.findViewById(2131558999);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        k.a(k.this).a(e.a());
      }
    });
    localButton.setEnabled("ACTIVE".equalsIgnoreCase(this.a.f()));
    return localView;
  }

  public void onResume()
  {
    super.onResume();
    Plan localPlan = this.a.c();
    int i;
    Rect localRect;
    Drawable localDrawable;
    if (localPlan != null)
    {
      TextView localTextView1 = this.b;
      MainActivity localMainActivity1 = this.d;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = (b.b(this.a.e()) + " / " + b.b(localPlan.data));
      localTextView1.setText(localMainActivity1.getString(2131296839, arrayOfObject1));
      TextView localTextView2 = this.g;
      MainActivity localMainActivity2 = this.d;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = b.b(localPlan.data);
      arrayOfObject2[1] = localPlan.name;
      arrayOfObject2[2] = b.a(this.a.g(), "MMM d, yyyy");
      localTextView2.setText(localMainActivity2.getString(2131296845, arrayOfObject2));
      i = Math.min(100, 100 * this.a.e() / localPlan.data);
      localRect = this.f.getProgressDrawable().getBounds();
      localDrawable = ((LayerDrawable)this.f.getProgressDrawable()).getDrawable(1);
      if (i < 95)
        break label260;
      localDrawable.setColorFilter(y.b(getActivity(), 2130772070), PorterDuff.Mode.MULTIPLY);
    }
    while (true)
    {
      this.f.getProgressDrawable().setBounds(localRect);
      this.f.setProgress(i + 1);
      this.f.setProgress(i);
      return;
      label260: localDrawable.setColorFilter(y.b(getActivity(), 2130772068), PorterDuff.Mode.MULTIPLY);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.k
 * JD-Core Version:    0.6.2
 */