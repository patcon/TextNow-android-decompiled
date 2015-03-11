package com.enflick.android.TextNow.activities.phone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.tasks.c;
import textnow.k.a;

public final class r extends ao
  implements f, textnow.k.d
{
  private d a = d.a();
  private ListView b;
  private a g;

  public final void a()
  {
  }

  public final void a(long paramLong)
  {
  }

  public final void a(s params)
  {
    this.a.c(params.a());
  }

  public final void a(String paramString, e parame)
  {
  }

  public final void a(String paramString, textnow.u.f paramf, boolean paramBoolean)
  {
    s locals = this.a.F();
    this.g.remove(locals);
    if (!this.a.J())
      this.e.onBackPressed();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
  }

  protected final String k()
  {
    return "/Manage_Conference_Fragment";
  }

  protected final String l()
  {
    return this.e.getString(2131493039);
  }

  public final int m()
  {
    return 2131165537;
  }

  protected final boolean n()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.g = new a(this.e, 2130903074, this.a, this);
    this.a.a(this);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903137, null);
    this.b = ((ListView)localView.findViewById(2131165546));
    this.b.setAdapter(this.g);
    return localView;
  }

  public final void onDestroy()
  {
    super.onDestroy();
    this.a.b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.r
 * JD-Core Version:    0.6.2
 */