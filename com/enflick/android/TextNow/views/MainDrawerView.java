package com.enflick.android.TextNow.views;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import java.util.ArrayList;
import textnow.v.a;
import textnow.v.y;
import textnow.v.z;
import textnow.z.s;
import textnow.z.t;
import textnow.z.u;

public class MainDrawerView extends AbsDrawerView
  implements View.OnClickListener
{
  u a;
  s b;
  private final String c = "MainDrawerView";
  private View d;
  private View e;
  private View f;
  private View g;
  private View h;
  private View i;
  private View j;
  private View k;
  private View l;
  private View m;
  private View n;
  private ArrayList<Integer> o = new ArrayList();
  private ArrayList<TintedImageView> p = new ArrayList();
  private ArrayList<TextView> q = new ArrayList();
  private TextView r;
  private ProgressBar s;
  private TextView t;
  private View u;
  private TextView v;
  private TintedImageView w;
  private int x;
  private int y;
  private int z;

  public MainDrawerView(Context paramContext)
  {
    super(paramContext);
  }

  public MainDrawerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MainDrawerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    this.v.setText(this.a.g() + " " + this.a.h());
    int i1 = this.a.E();
    if (this.r != null)
      this.r.setText(String.valueOf(i1) + " " + getResources().getQuantityString(2131689474, i1));
    Plan localPlan = this.b.c();
    String str = this.b.f();
    if (localPlan != null)
    {
      this.j.setVisibility(8);
      this.i.setVisibility(0);
      if (("INACTIVE".equalsIgnoreCase(str)) || ("EXPIRED".equalsIgnoreCase(str)))
        this.u.setVisibility(8);
    }
    while (true)
    {
      t localt = this.b.q();
      if ((localt != t.d) && (localt != t.a) && (localt != t.b) && (localt != t.f))
        break;
      this.n.setVisibility(8);
      return;
      this.u.setVisibility(0);
      TextView localTextView = this.t;
      Context localContext = getContext();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = (textnow.v.b.b(this.b.e()) + "/" + textnow.v.b.b(localPlan.data));
      localTextView.setText(localContext.getString(2131296839, arrayOfObject));
      int i2 = Math.min(100, 100 * this.b.e() / localPlan.data);
      Rect localRect = this.s.getProgressDrawable().getBounds();
      Drawable localDrawable = ((LayerDrawable)this.s.getProgressDrawable()).getDrawable(1);
      if (i2 >= 95)
        localDrawable.setColorFilter(y.b(getContext(), 2130772070), PorterDuff.Mode.MULTIPLY);
      while (true)
      {
        this.s.getProgressDrawable().setBounds(localRect);
        this.s.setProgress(i2 + 1);
        this.s.setProgress(i2);
        break;
        localDrawable.setColorFilter(y.b(getContext(), 2130772068), PorterDuff.Mode.MULTIPLY);
      }
      this.u.setVisibility(8);
      this.i.setVisibility(8);
      if ((a.a) || (!textnow.v.b.c(getContext())))
        this.j.setVisibility(0);
    }
    this.n.setVisibility(0);
  }

  public final void a(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.p.size())
    {
      TextView localTextView = (TextView)this.q.get(i1);
      int i2;
      label49: TintedImageView localTintedImageView;
      if (paramInt == ((Integer)this.o.get(i1)).intValue())
      {
        i2 = this.z;
        localTextView.setTextColor(i2);
        localTintedImageView = (TintedImageView)this.p.get(i1);
        if (paramInt != ((Integer)this.o.get(i1)).intValue())
          break label114;
      }
      label114: for (int i3 = this.z; ; i3 = this.y)
      {
        localTintedImageView.a(i3);
        i1++;
        break;
        i2 = this.x;
        break label49;
      }
    }
  }

  public final void c()
  {
    super.c();
    a();
  }

  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    switch (i1)
    {
    default:
    case 2131558809:
    case 2131558810:
    case 2131558823:
    case 2131558814:
    case 2131558817:
    case 2131558820:
    case 2131558837:
    case 2131558500:
    case 2131558828:
    case 2131558831:
    case 2131558834:
    case 2131558811:
    case 2131558840:
    }
    while (true)
    {
      a(i1);
      b(i1);
      return;
      if (!h.d())
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
        localBuilder.setTitle(2131296711).setMessage(2131296712).setNeutralButton(2131296427, null);
        localBuilder.create().show();
        return;
      }
      com.enflick.android.TextNow.ads.b.b("tap_store_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_home_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_history_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_profile_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_settings_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_search_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_data_plans");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_account_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_tn_phone_nav");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_data_usage");
      continue;
      com.enflick.android.TextNow.ads.b.b("tap_share");
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = new u(getContext());
    this.b = new s(getContext());
    this.s = ((ProgressBar)findViewById(2131558813));
    this.u = findViewById(2131558811);
    this.u.setOnClickListener(this);
    this.t = ((TextView)findViewById(2131558812));
    this.d = findViewById(2131558814);
    this.o.add(Integer.valueOf(2131558814));
    this.p.add((TintedImageView)findViewById(2131558815));
    this.q.add((TextView)findViewById(2131558816));
    this.d.setOnClickListener(this);
    this.e = findViewById(2131558817);
    this.o.add(Integer.valueOf(2131558817));
    this.p.add((TintedImageView)findViewById(2131558818));
    this.q.add((TextView)findViewById(2131558819));
    this.e.setOnClickListener(this);
    this.f = findViewById(2131558820);
    this.o.add(Integer.valueOf(2131558820));
    this.p.add((TintedImageView)findViewById(2131558821));
    this.q.add((TextView)findViewById(2131558822));
    this.f.setOnClickListener(this);
    this.g = findViewById(2131558823);
    this.o.add(Integer.valueOf(2131558823));
    this.p.add((TintedImageView)findViewById(2131558824));
    this.q.add((TextView)findViewById(2131558825));
    this.g.setOnClickListener(this);
    this.m = findViewById(2131558809);
    this.m.setOnClickListener(this);
    this.r = ((TextView)findViewById(2131558810));
    this.h = findViewById(2131558837);
    this.o.add(Integer.valueOf(2131558837));
    this.p.add((TintedImageView)findViewById(2131558838));
    this.q.add((TextView)findViewById(2131558839));
    this.h.setOnClickListener(this);
    this.k = findViewById(2131558500);
    this.o.add(Integer.valueOf(2131558500));
    this.p.add((TintedImageView)findViewById(2131558826));
    this.q.add((TextView)findViewById(2131558827));
    this.k.setOnClickListener(this);
    this.n = findViewById(2131558828);
    this.o.add(Integer.valueOf(2131558828));
    this.p.add((TintedImageView)findViewById(2131558829));
    this.q.add((TextView)findViewById(2131558830));
    this.n.setOnClickListener(this);
    this.i = findViewById(2131558831);
    this.o.add(Integer.valueOf(2131558831));
    this.p.add((TintedImageView)findViewById(2131558832));
    this.q.add((TextView)findViewById(2131558833));
    this.i.setOnClickListener(this);
    this.j = findViewById(2131558834);
    this.o.add(Integer.valueOf(2131558834));
    this.p.add((TintedImageView)findViewById(2131558835));
    this.q.add((TextView)findViewById(2131558836));
    this.j.setOnClickListener(this);
    this.l = findViewById(2131558840);
    this.o.add(Integer.valueOf(2131558840));
    this.p.add((TintedImageView)findViewById(2131558841));
    this.q.add((TextView)findViewById(2131558842));
    this.l.setOnClickListener(this);
    this.w = ((TintedImageView)findViewById(2131558805));
    this.v = ((TextView)findViewById(2131558807));
    this.x = y.b(getContext(), 2130772278);
    this.y = y.b(getContext(), 2130772279);
    this.z = y.b(getContext(), 2130772068);
    a();
    ((TextView)findViewById(2131558808)).setText(textnow.v.b.f(this.a.c()));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = Math.min(z.a(getContext()) - z.a(getContext(), 56), z.a(getContext(), 320));
    if ((View.MeasureSpec.getSize(paramInt1) > i1) && (i1 > 0))
      paramInt1 = View.MeasureSpec.makeMeasureSpec(i1, View.MeasureSpec.getMode(paramInt1));
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.MainDrawerView
 * JD-Core Version:    0.6.2
 */