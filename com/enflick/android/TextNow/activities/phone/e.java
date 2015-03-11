package com.enflick.android.TextNow.activities.phone;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.z;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.fab.FloatingActionButton;
import textnow.p.i;
import textnow.v.y;

public class e extends av
  implements bz, View.OnClickListener
{
  private ViewPager a;
  private i b;
  private ListView f;
  private ListView g;
  private View h;
  private View i;
  private FloatingActionButton j;
  private boolean k;

  public static e a(boolean paramBoolean)
  {
    e locale = new e();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("extra_delay_loading", paramBoolean);
    locale.setArguments(localBundle);
    return locale;
  }

  public final void a(int paramInt)
  {
    this.j.a();
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      this.i.setVisibility(0);
      paramInt2 = 0;
    }
    while (true)
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.h.getLayoutParams();
      localLayoutParams.leftMargin = (paramInt2 / 2);
      localLayoutParams.rightMargin = (-localLayoutParams.leftMargin);
      this.h.setLayoutParams(localLayoutParams);
      return;
      this.i.setVisibility(8);
    }
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b(int paramInt)
  {
  }

  protected final String l()
  {
    return "/Call_History";
  }

  protected final String m()
  {
    return this.d.getString(2131296988);
  }

  public final int n()
  {
    return 2131558817;
  }

  protected final boolean o()
  {
    return false;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131558565:
    case 2131558566:
    case 2131558567:
    default:
    case 2131558563:
    case 2131558564:
    case 2131558568:
    }
    do
    {
      return;
      this.a.a(0, true);
      return;
      this.a.a(1, true);
      return;
    }
    while (this.d == null);
    this.d.a(null, false, false);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    boolean bool1 = false;
    if (localBundle != null)
    {
      boolean bool2 = getArguments().getBoolean("extra_delay_loading", false);
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    this.k = bool1;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903081, paramViewGroup, false);
    this.f = new ListView(this.d);
    this.g = new ListView(this.d);
    this.b = new i(getActivity(), this.f, this.g);
    this.a = ((ViewPager)localView.findViewById(2131558567));
    this.a.a(this.b);
    this.a.a(this);
    localView.findViewById(2131558563).setOnClickListener(this);
    localView.findViewById(2131558564).setOnClickListener(this);
    this.h = localView.findViewById(2131558566);
    this.h.setBackgroundColor(y.b(this.d, 2130772068));
    this.i = localView.findViewById(2131558565);
    this.j = ((FloatingActionButton)localView.findViewById(2131558568));
    this.j.a(this.f);
    this.j.a(this.g);
    this.j.setOnClickListener(this);
    return localView;
  }

  public void onResume()
  {
    super.onResume();
    Handler localHandler = new Handler();
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        e.b(e.this).getSupportLoaderManager().b(0, null, e.a(e.this));
        e.c(e.this).getSupportLoaderManager().b(1, null, e.a(e.this));
      }
    };
    if (this.k);
    for (long l = 256L; ; l = 0L)
    {
      localHandler.postDelayed(local1, l);
      this.k = false;
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.e
 * JD-Core Version:    0.6.2
 */