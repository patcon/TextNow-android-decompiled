package com.enflick.android.TextNow.activities.account;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import textnow.v.b;

public class SubscriptionPlanView extends LinearLayout
  implements CompoundButton.OnCheckedChangeListener
{
  private TextView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private RadioButton e;
  private Plan f;
  private m g;
  private boolean h = true;

  public SubscriptionPlanView(Context paramContext)
  {
    super(paramContext);
  }

  public SubscriptionPlanView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SubscriptionPlanView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(m paramm)
  {
    this.g = paramm;
  }

  public final void a(Plan paramPlan, boolean paramBoolean)
  {
    this.f = paramPlan;
    this.a.setText(paramPlan.name);
    TextView localTextView1 = this.b;
    Resources localResources1 = getResources();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Double.valueOf(paramPlan.price / 100.0D);
    localTextView1.setText(localResources1.getString(2131296858, arrayOfObject1));
    TextView localTextView2 = this.c;
    Resources localResources2 = getResources();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = b.b(paramPlan.data);
    localTextView2.setText(localResources2.getString(2131296859, arrayOfObject2));
    TextView localTextView3 = this.d;
    Resources localResources3 = getResources();
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(paramPlan.credits);
    localTextView3.setText(localResources3.getString(2131296860, arrayOfObject3));
    RadioButton localRadioButton = this.e;
    int i = 0;
    if (paramBoolean);
    while (true)
    {
      localRadioButton.setVisibility(i);
      return;
      i = 8;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.e.setChecked(paramBoolean);
  }

  public final boolean a()
  {
    return this.e.isChecked();
  }

  public final Plan b()
  {
    return this.f;
  }

  public final void b(boolean paramBoolean)
  {
    this.e.setEnabled(paramBoolean);
    setEnabled(paramBoolean);
    this.h = paramBoolean;
  }

  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.g != null))
      this.g.a(this);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131558591));
    this.b = ((TextView)findViewById(2131558592));
    this.c = ((TextView)findViewById(2131559007));
    this.d = ((TextView)findViewById(2131559008));
    this.e = ((RadioButton)findViewById(2131559009));
    this.e.setOnCheckedChangeListener(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.SubscriptionPlanView
 * JD-Core Version:    0.6.2
 */