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
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.c;
import textnow.p.af;
import textnow.v.y;
import textnow.z.u;

public final class aw extends av
  implements View.OnClickListener
{
  private ListView a = null;
  private View b;
  private Parcelable f;

  public aw(Parcelable paramParcelable)
  {
    this.f = paramParcelable;
  }

  private void a()
  {
    this.d.finish();
    MainActivity.a(this.d, this.a.onSaveInstanceState());
    this.d.overridePendingTransition(0, 0);
  }

  public final boolean C()
  {
    b.a("theme_selected", "name", y.c(this.d, this.c.ab().intValue()));
    return super.C();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  protected final String l()
  {
    return "/Theme_Fragment";
  }

  protected final String m()
  {
    return this.d.getString(2131296906);
  }

  public final int n()
  {
    return 2131558837;
  }

  protected final boolean o()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    Integer localInteger = this.c.ab();
    switch (paramView.getId())
    {
    default:
    case 2131559013:
      do
        return;
      while (localInteger.intValue() <= 100);
      this.c.a(Integer.valueOf(-100 + localInteger.intValue()));
    case 2131559014:
    }
    while (true)
    {
      this.c.B();
      a();
      return;
      if ((localInteger.intValue() <= 0) || (localInteger.intValue() >= 100))
        break;
      this.c.a(Integer.valueOf(100 + localInteger.intValue()));
    }
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.b = paramLayoutInflater.inflate(2130903217, paramViewGroup, false);
    this.a = ((ListView)this.b.findViewById(2131559015));
    int i = this.c.ab().intValue();
    Resources localResources = this.d.getResources();
    if (y.a(i));
    for (int j = 2131623938; ; j = 2131623939)
    {
      int[] arrayOfInt = localResources.getIntArray(j);
      af localaf = new af(this.d, 2130903216, arrayOfInt);
      this.a.setAdapter(localaf);
      this.a.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          if ((Integer)paramAnonymousView.getTag() == aw.this.c.ab())
            return;
          aw.this.c.a((Integer)paramAnonymousView.getTag());
          aw.this.c.B();
          aw.a(aw.this);
        }
      });
      if (this.f == null)
        break;
      this.a.onRestoreInstanceState(this.f);
      ((ImageButton)this.b.findViewById(2131559014)).setOnClickListener(this);
      ((ImageButton)this.b.findViewById(2131559013)).setOnClickListener(this);
      return this.b;
    }
    ListView localListView;
    int k;
    if (i == 0)
    {
      localListView = this.a;
      k = 0;
    }
    while (true)
    {
      localListView.setSelection(k);
      break;
      localListView = this.a;
      if (y.a(i))
        k = i - 1;
      else
        k = i - 101;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aw
 * JD-Core Version:    0.6.2
 */