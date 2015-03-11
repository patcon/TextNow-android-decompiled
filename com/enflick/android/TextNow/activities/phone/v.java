package com.enflick.android.TextNow.activities.phone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.c;
import textnow.p.a;
import textnow.p.d;

public final class v extends av
  implements j, d
{
  private h a = h.a();
  private ListView b;
  private a f;

  public final void a()
  {
  }

  public final void a(long paramLong)
  {
  }

  public final void a(w paramw)
  {
    this.a.c(paramw.a());
  }

  public final void a(String paramString, i parami)
  {
  }

  public final void a(String paramString, textnow.z.h paramh, boolean paramBoolean)
  {
    w localw = this.a.F();
    this.f.remove(localw);
    if (!this.a.K())
      this.d.onBackPressed();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
  }

  protected final String l()
  {
    return "/Manage_Conference_Fragment";
  }

  protected final String m()
  {
    return this.d.getString(2131296446);
  }

  public final int n()
  {
    return 2131558814;
  }

  protected final boolean o()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.f = new a(this.d, 2130903082, this.a, this);
    this.a.a(this);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903154, null);
    this.b = ((ListView)localView.findViewById(2131558843));
    this.b.setAdapter(this.f);
    return localView;
  }

  public final void onDestroy()
  {
    super.onDestroy();
    this.a.b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.v
 * JD-Core Version:    0.6.2
 */