package com.enflick.android.TextNow.views;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.facebook.FacebookRequestError;
import com.facebook.Request.Callback;
import com.facebook.Response;
import textnow.q.b;
import textnow.u.q;
import textnow.u.r;

public class MainDrawerView extends AbsDrawerView
  implements View.OnClickListener
{
  r a;
  q b;
  private View c;
  private View d;
  private View e;
  private View f;
  private View g;
  private View h;
  private View i;
  private View j;
  private TextView k;
  private TextView l;
  private View m;
  private View n;
  private View o;
  private ProgressBar p;
  private TextView q;
  private View r;
  private Request.Callback s = new Request.Callback()
  {
    public final void onCompleted(Response paramAnonymousResponse)
    {
      boolean bool = true;
      if (paramAnonymousResponse != null)
      {
        paramAnonymousResponse.toString();
        if (paramAnonymousResponse.getError() != null);
        while (true)
        {
          int i = 0;
          if (bool)
            i = paramAnonymousResponse.getError().getErrorCode();
          MainDrawerView.a(MainDrawerView.this, bool, i, null);
          return;
          bool = false;
        }
      }
      MainDrawerView.a(MainDrawerView.this, bool, -1, null);
    }
  };

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

  private void c()
  {
    int i1 = this.a.C();
    if (this.k != null)
    {
      this.k.setText(String.valueOf(i1));
      this.l.setText(getResources().getQuantityString(2131689474, i1));
    }
  }

  private void d()
  {
    Plan localPlan = this.b.b();
    if (localPlan != null)
    {
      this.i.setVisibility(8);
      if (this.r.getVisibility() == 8)
      {
        this.r.setVisibility(0);
        this.h.setVisibility(0);
      }
      TextView localTextView = this.q;
      Context localContext = getContext();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = (b.a(this.b.c()) + "/" + b.a(localPlan.data));
      localTextView.setText(localContext.getString(2131493451, arrayOfObject));
      int i1 = Math.min(100, 100 * this.b.c() / localPlan.data);
      Rect localRect = this.p.getProgressDrawable().getBounds();
      if (i1 >= 95)
      {
        this.p.setProgressDrawable(getResources().getDrawable(2130837839));
        this.p.getProgressDrawable().setBounds(localRect);
        this.p.setProgress(i1 + 1);
        this.p.setProgress(i1);
      }
    }
    do
    {
      return;
      this.p.setProgressDrawable(getResources().getDrawable(2130837838));
      break;
      this.r.setVisibility(8);
      this.h.setVisibility(8);
    }
    while ((!textnow.q.a.a) && (b.c(getContext())));
    this.i.setVisibility(0);
  }

  public final void a(int paramInt)
  {
    boolean bool1 = true;
    View localView1 = this.c;
    boolean bool2;
    boolean bool3;
    label39: boolean bool4;
    label69: boolean bool5;
    label92: boolean bool6;
    label122: boolean bool7;
    label145: View localView7;
    if (paramInt == 2131165537)
    {
      bool2 = bool1;
      localView1.setSelected(bool2);
      View localView2 = this.d;
      if (paramInt != 2131165538)
        break label178;
      bool3 = bool1;
      localView2.setSelected(bool3);
      View localView3 = this.e;
      if ((paramInt != 2131165539) && (paramInt != 2131165531))
        break label184;
      bool4 = bool1;
      localView3.setSelected(bool4);
      View localView4 = this.f;
      if (paramInt != 2131165542)
        break label190;
      bool5 = bool1;
      localView4.setSelected(bool5);
      View localView5 = this.h;
      if ((paramInt != 2131165540) && (paramInt != 2131165534))
        break label196;
      bool6 = bool1;
      localView5.setSelected(bool6);
      View localView6 = this.j;
      if (paramInt != 2131165272)
        break label202;
      bool7 = bool1;
      localView6.setSelected(bool7);
      localView7 = this.i;
      if (paramInt != 2131165541)
        break label208;
    }
    while (true)
    {
      localView7.setSelected(bool1);
      return;
      bool2 = false;
      break;
      label178: bool3 = false;
      break label39;
      label184: bool4 = false;
      break label69;
      label190: bool5 = false;
      break label92;
      label196: bool6 = false;
      break label122;
      label202: bool7 = false;
      break label145;
      label208: bool1 = false;
    }
  }

  public final void b()
  {
    super.b();
    c();
    d();
  }

  public void onClick(View paramView)
  {
    int i1 = paramView.getId();
    switch (i1)
    {
    default:
    case 2131165531:
    case 2131165539:
    case 2131165537:
    case 2131165538:
    case 2131165542:
    case 2131165272:
    case 2131165540:
    case 2131165541:
    case 2131165534:
    }
    while (true)
    {
      a(i1);
      b(i1);
      return;
      if (!d.d())
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(getContext());
        localBuilder.setTitle(2131493308).setMessage(2131493309).setNeutralButton(2131493020, null);
        localBuilder.create().show();
        return;
      }
      com.enflick.android.TextNow.ads.a.b("tap_store_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_home_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_profile_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_settings_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_search_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_account_nav");
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_tn_phone_nav");
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setData(Uri.parse("https://www.textnow.com/wireless?ref=android"));
      getContext().startActivity(localIntent);
      continue;
      com.enflick.android.TextNow.ads.a.b("tap_data_usage");
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = new r(getContext());
    this.b = new q(getContext());
    this.p = ((ProgressBar)findViewById(2131165536));
    this.r = findViewById(2131165534);
    this.r.setOnClickListener(this);
    this.q = ((TextView)findViewById(2131165535));
    this.c = findViewById(2131165537);
    this.c.setOnClickListener(this);
    this.d = findViewById(2131165538);
    this.d.setOnClickListener(this);
    this.e = findViewById(2131165539);
    this.e.setOnClickListener(this);
    this.g = findViewById(2131165531);
    this.g.setOnClickListener(this);
    this.k = ((TextView)findViewById(2131165532));
    this.l = ((TextView)findViewById(2131165533));
    this.g.setOnClickListener(this);
    this.f = findViewById(2131165542);
    this.f.setOnClickListener(this);
    this.j = findViewById(2131165272);
    this.j.setOnClickListener(this);
    this.h = findViewById(2131165540);
    this.h.setOnClickListener(this);
    this.i = findViewById(2131165541);
    this.i.setOnClickListener(this);
    this.m = findViewById(2131165543);
    this.m.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        MainDrawerView.a(MainDrawerView.this);
      }
    });
    this.n = findViewById(2131165544);
    this.n.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        MainDrawerView.b(MainDrawerView.this);
      }
    });
    this.o = findViewById(2131165545);
    this.o.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        MainDrawerView.c(MainDrawerView.this);
      }
    });
    c();
    d();
    ((TextView)findViewById(2131165530)).setText(b.f(this.a.c()));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.MainDrawerView
 * JD-Core Version:    0.6.2
 */