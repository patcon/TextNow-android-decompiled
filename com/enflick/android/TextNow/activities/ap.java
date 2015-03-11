package com.enflick.android.TextNow.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.c;
import textnow.k.y;
import textnow.q.ab;
import textnow.u.r;

public final class ap extends ao
  implements View.OnClickListener
{
  private ListView a = null;
  private View b;
  private Parcelable g;

  public ap(Parcelable paramParcelable)
  {
    this.g = paramParcelable;
  }

  private void a()
  {
    this.e.finish();
    MainActivity.a(this.e, this.a.onSaveInstanceState());
    this.e.overridePendingTransition(0, 0);
  }

  public final boolean B()
  {
    a.a("theme_selected", "name", ab.b(this.e, this.c.ac().intValue()));
    return super.B();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  protected final String k()
  {
    return "/Theme_Fragment";
  }

  protected final String l()
  {
    return this.e.getString(2131493532);
  }

  protected final boolean n()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    Integer localInteger = this.c.ac();
    switch (paramView.getId())
    {
    default:
    case 2131165710:
      do
        return;
      while (localInteger.intValue() <= 100);
      this.c.a(Integer.valueOf(-100 + localInteger.intValue()));
    case 2131165711:
    }
    while (true)
    {
      this.c.n();
      a();
      return;
      if ((localInteger.intValue() <= 0) || (localInteger.intValue() >= 100))
        break;
      this.c.a(Integer.valueOf(100 + localInteger.intValue()));
    }
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.b = paramLayoutInflater.inflate(2130903199, paramViewGroup, false);
    this.a = ((ListView)this.b.findViewById(2131165712));
    int i = this.c.ac().intValue();
    Resources localResources = this.e.getResources();
    if (ab.a(i));
    int[] arrayOfInt;
    for (int j = 2131623938; ; j = 2131623939)
    {
      arrayOfInt = localResources.getIntArray(j);
      y localy = new y(this.e, 2130903198, arrayOfInt);
      this.a.setAdapter(localy);
      this.a.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          if ((Integer)paramAnonymousView.getTag() == ap.this.c.ac())
            return;
          ap.this.c.a((Integer)paramAnonymousView.getTag());
          ap.this.c.n();
          ap.a(ap.this);
        }
      });
      if (this.g == null)
        break;
      this.a.onRestoreInstanceState(this.g);
      ((ImageButton)this.b.findViewById(2131165711)).setOnClickListener(this);
      ((ImageButton)this.b.findViewById(2131165710)).setOnClickListener(this);
      return this.b;
    }
    ListView localListView;
    int k;
    if (i == 0)
    {
      localListView = this.a;
      k = -1 + arrayOfInt.length;
    }
    while (true)
    {
      localListView.setSelection(k);
      break;
      localListView = this.a;
      if (ab.a(i))
        k = i - 1;
      else
        k = i - 101;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ap
 * JD-Core Version:    0.6.2
 */