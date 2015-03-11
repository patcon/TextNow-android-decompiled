package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.enflick.android.TextNow.tasks.DownloadToFileTask;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.n;
import com.enflick.android.TextNow.views.o;
import java.util.List;
import textnow.bk.ar;
import textnow.v.g;
import textnow.v.h;

public class l extends av
{
  private an a;
  private String b;
  private long f;
  private List<textnow.z.m> g;
  private textnow.z.m h;
  private ar i;
  private ViewPager j;
  private TextView k;
  private com.enflick.android.TextNow.views.m l;

  public static l a(textnow.z.m paramm)
  {
    l locall = new l();
    Bundle localBundle = new Bundle();
    localBundle.putString("contact_value", paramm.b());
    localBundle.putLong("msg_id", paramm.f());
    locall.setArguments(localBundle);
    return locall;
  }

  private textnow.z.m a()
  {
    if (this.j == null);
    int m;
    do
    {
      return null;
      m = this.j.b();
    }
    while ((m < 0) || (m >= this.g.size()));
    return (textnow.z.m)this.g.get(m);
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int m = paramc.i();
    if (localClass == DownloadToFileTask.class)
    {
      DownloadToFileTask localDownloadToFileTask = (DownloadToFileTask)paramc;
      String str1 = localDownloadToFileTask.a();
      h localh = localDownloadToFileTask.c();
      String str2 = localDownloadToFileTask.b();
      this.a.v();
      if (bool)
        if (localh == h.a)
          if (m == 404)
            this.a.b(2131296572);
      while (true)
      {
        return true;
        this.a.b(2131296571);
        continue;
        this.a.b(2131296797);
        continue;
        if (TextUtils.isEmpty(str2))
        {
          this.a.b(2131296797);
        }
        else
        {
          if ((this.h != null) && (str1 != null) && (str1.equals(this.h.a())))
            this.h.a(str2);
          this.h = null;
          this.a.supportInvalidateOptionsMenu();
        }
      }
    }
    return false;
  }

  protected final String l()
  {
    return "/Image_Preview";
  }

  protected final String m()
  {
    return this.a.getString(2131296756);
  }

  public final int n()
  {
    return 2131558814;
  }

  protected final boolean o()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = ((an)getActivity());
    Bundle localBundle = getArguments();
    this.b = localBundle.getString("contact_value");
    this.f = localBundle.getLong("msg_id");
    this.g = textnow.z.m.a(this.a, this.b, 0, false);
    this.i = ar.a(this);
    this.l = new com.enflick.android.TextNow.views.m(this.a, this.g, this.i);
    this.a.D();
    this.a.i(true);
    setHasOptionsMenu(true);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755016, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903142, null);
    this.j = ((ViewPager)localView.findViewById(2131558766));
    this.j.a(false, new n(o.a));
    this.j.a(this.l);
    int m = 0;
    if (m < this.g.size())
      if (((textnow.z.m)this.g.get(m)).f() != this.f);
    while (true)
    {
      this.j.a(m);
      this.k = ((TextView)localView.findViewById(2131558767));
      TextView localTextView = this.k;
      int n = this.g.size();
      int i1 = 0;
      if (n > 1);
      while (true)
      {
        localTextView.setVisibility(i1);
        return localView;
        m++;
        break;
        i1 = 8;
      }
      m = 0;
    }
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (getActivity() != null)
    {
      this.a.E();
      this.a.i(false);
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = super.onOptionsItemSelected(paramMenuItem);
    case 2131559088:
    }
    textnow.z.m localm;
    String str1;
    String str2;
    do
    {
      do
      {
        return bool;
        localm = a();
      }
      while (localm == null);
      str1 = localm.e();
      str2 = localm.a();
    }
    while ((TextUtils.isEmpty(str1)) || (str2 == null));
    this.h = localm;
    this.a.a(2131296429, bool);
    new DownloadToFileTask(str2, str1, h.a).b(this.a);
    return bool;
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    super.onPrepareOptionsMenu(paramMenu);
    textnow.z.m localm = a();
    if (localm != null)
    {
      String str = localm.k();
      if ((TextUtils.isEmpty(str)) || (!g.b(this.a, str)));
    }
    for (int m = 1; ; m = 0)
    {
      if (m != 0)
        new u(paramMenu).a(2131559088);
      if (this.j != null)
      {
        int n = 1 + this.j.b();
        int i1 = this.g.size();
        this.k.setText(n + " / " + i1);
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.l
 * JD-Core Version:    0.6.2
 */