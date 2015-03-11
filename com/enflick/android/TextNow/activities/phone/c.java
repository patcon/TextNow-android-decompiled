package com.enflick.android.TextNow.activities.phone;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import textnow.v.b;
import textnow.v.k;
import textnow.z.f;

public final class c extends av
  implements aa<Cursor>, AdapterView.OnItemClickListener
{
  private f a;
  private ListView b;
  private textnow.p.e f;

  public static c a(f paramf)
  {
    c localc = new c();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("extra_contact", paramf);
    localc.setArguments(localBundle);
    return localc;
  }

  public final String A()
  {
    String str;
    if (this.a.b() == 2)
      if (k.a(this.a.a()))
        str = "Unknown Number";
    int i;
    do
    {
      return str;
      return b.f(this.a.a());
      if (this.a.b() == 1)
        return this.a.a() + "@textnow.me";
      i = this.a.b();
      str = null;
    }
    while (i == 5);
    return this.a.a();
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    return false;
  }

  protected final String l()
  {
    return "/Call_Details";
  }

  protected final String m()
  {
    if (this.a != null)
      return this.a.g();
    return getString(2131296418);
  }

  public final int n()
  {
    return 2131558817;
  }

  protected final boolean o()
  {
    return true;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.a != null)
      getLoaderManager().a(0, null, this);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
    this.a = ((f)getArguments().getSerializable("extra_contact"));
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return textnow.z.e.a(this.d, this.a.a(), false);
  }

  public final void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755008, paramMenu);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903078, null);
    this.f = new textnow.p.e(this.d, null);
    this.b = ((ListView)localView.findViewById(2131558550));
    this.b.setAdapter(this.f);
    this.b.setOnItemClickListener(this);
    return localView;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public final void onLoaderReset(j<Cursor> paramj)
  {
    this.f.a(null);
  }

  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131559048:
      this.d.a(this.a, false, true);
      return true;
    case 2131558907:
    }
    Intent localIntent = new Intent(this.d, MainActivity.class);
    localIntent.putExtra("extra_msg_view_type", 2);
    localIntent.putExtra("extra_selected_cv", this.a.a());
    localIntent.putExtra("extra_selected_ct", this.a.b());
    startActivity(localIntent);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.c
 * JD-Core Version:    0.6.2
 */