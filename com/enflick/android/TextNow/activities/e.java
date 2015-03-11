package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.os.Bundle;
import android.support.v4.app.v;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.an;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.enflick.android.TextNow.activities.phone.s;
import com.enflick.android.TextNow.tasks.DeleteConversationTask;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import textnow.k.k;
import textnow.k.m;
import textnow.q.ad;
import textnow.q.q;
import textnow.u.r;

public class e extends ao
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, c, k
{
  private long a = -1L;
  private int b = -1;
  private boolean g;
  private boolean h;
  private boolean i = false;
  private boolean j = false;
  private ListView k;
  private LinearLayout l;
  private Button m;
  private textnow.k.j n;
  private b o;
  private af p;
  private SwipeRefreshLayout q;
  private f r;
  private ArrayList<String> s = new ArrayList();
  private int t;
  private int u;

  public static e a(f paramf)
  {
    e locale = new e();
    locale.r = paramf;
    return locale;
  }

  private void a(boolean paramBoolean)
  {
    if (!this.g)
      return;
    if (this.a == -1L)
    {
      this.k.clearChoices();
      return;
    }
    if ((this.b >= 0) && (this.b < this.k.getCount()) && (this.k.getItemIdAtPosition(this.b) == this.a))
    {
      if (!this.k.isItemChecked(this.b))
        this.k.setItemChecked(this.b, true);
      if (paramBoolean)
        this.k.smoothScrollToPosition(this.b);
      this.i = false;
      this.j = false;
      return;
    }
    int i1 = this.k.getCount();
    int i2 = 0;
    if (i2 < i1)
      if (this.k.getItemIdAtPosition(i2) == this.a)
      {
        if (this.b != i2)
        {
          this.b = i2;
          this.k.setItemChecked(this.b, true);
        }
        if (paramBoolean)
          this.k.smoothScrollToPosition(i2);
      }
    for (int i3 = 1; ; i3 = 0)
    {
      if (i3 != 0)
      {
        this.i = false;
        return;
        i2++;
        break;
      }
      this.i = true;
      return;
    }
  }

  private boolean a(View paramView, boolean paramBoolean)
  {
    paramView.invalidate();
    return this.n.a(paramView, paramBoolean);
  }

  private void o()
  {
    this.p.b();
    Iterator localIterator = this.s.iterator();
    label154: 
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ContentResolver localContentResolver = getActivity().getContentResolver();
      textnow.w.a.a(localContentResolver, str);
      if (textnow.w.b.d(localContentResolver, str))
        new DeleteGroupTask(str).b(getActivity());
      while (true)
      {
        while (true)
        {
          if (textnow.q.b.b(str) == null)
            break label154;
          try
          {
            s locals = com.enflick.android.TextNow.activities.phone.d.a().p();
            if ((!com.enflick.android.TextNow.activities.phone.d.c(com.enflick.android.TextNow.activities.phone.d.a().y())) || (locals == null) || (!str.equals(textnow.q.b.b(locals.b().a()))))
              break;
            com.enflick.android.TextNow.activities.phone.d.a().b(false);
          }
          catch (com.enflick.android.TextNow.activities.phone.j localj)
          {
          }
        }
        break;
        new DeleteConversationTask(str).b(getActivity());
      }
    }
    this.s.clear();
  }

  private void p()
  {
    if ((c() == 0) || (!this.g))
    {
      this.o.b();
      this.p.a(true);
      return;
    }
    this.p.a(false);
    if (this.o.a() == 2)
    {
      this.o.c();
      return;
    }
    this.o.d();
  }

  public final void a()
  {
    this.u = this.k.getChoiceMode();
    this.t = this.k.getTranscriptMode();
    this.k.setChoiceMode(2);
    this.k.setTranscriptMode(0);
  }

  public final void a(View paramView1, View paramView2)
  {
    int i1 = 1;
    m localm = (m)paramView1.getTag();
    d();
    if (paramView2.getId() == 2131165374)
    {
      locald = new textnow.u.d(localm.a.c(), localm.a.d(), localm.a.e(), localm.a.h(), i1);
      if (locald.j())
      {
        localMainActivity = this.e;
        if (localm.l)
          i1 = 0;
        localMainActivity.a(locald, false, i1);
        if (this.e.g())
          a(localm.a);
      }
      this.p.a();
    }
    while (paramView2.getId() != 2131165375)
    {
      textnow.u.d locald;
      MainActivity localMainActivity;
      return;
    }
    this.s.clear();
    this.s.add(localm.a.c());
    Bundle localBundle = new Bundle();
    localBundle.putInt("count", i1);
    this.e.showDialog(2, localBundle);
  }

  public final void a(textnow.u.f paramf)
  {
    if (paramf == null)
      return;
    this.a = paramf.a();
    if (this.h)
    {
      a(true);
      return;
    }
    this.j = true;
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131165753:
    }
    this.s.clear();
    if (this.o.a() == 1)
      this.s.add(this.n.d());
    while (true)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("count", this.s.size());
      getActivity().showDialog(2, localBundle);
      return true;
      HashMap localHashMap = this.n.c();
      this.s.addAll(localHashMap.values());
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = false;
    if (localClass == GetNewMessagesTask.class)
    {
      ListView localListView = this.k;
      bool = false;
      if (localListView != null)
      {
        this.q.a(false);
        bool = true;
      }
    }
    return bool;
  }

  public final void b()
  {
    this.k.setChoiceMode(this.u);
    this.k.setTranscriptMode(this.t);
    int i1 = this.k.getFirstVisiblePosition();
    View localView = this.k.getChildAt(0);
    int i2;
    if (localView == null)
    {
      i2 = 0;
      if (!(this.k.getAdapter() instanceof HeaderViewListAdapter))
        break label96;
      this.k.setAdapter(((HeaderViewListAdapter)this.k.getAdapter()).getWrappedAdapter());
    }
    while (true)
    {
      this.k.setSelectionFromTop(i1, i2);
      return;
      i2 = localView.getTop();
      break;
      label96: this.k.setAdapter(this.k.getAdapter());
    }
  }

  public final int c()
  {
    return this.n.c().size();
  }

  public final void d()
  {
    this.n.e();
    if (this.p != null)
      this.p.a(true);
    if ((this.k != null) && (this.k != null))
    {
      this.k.clearChoices();
      this.k.requestLayout();
    }
    if ((this.o != null) && (this.o.a() == 2))
      this.o.b();
  }

  public final void e()
  {
    getLoaderManager().b(1, null, new g(this));
  }

  public final void f()
  {
    new GetUserInfoTask(new r(this.e).b()).b(this.e);
    new GetNewMessagesTask(false, true).b(this.e);
  }

  public final void g()
  {
    p();
  }

  public final long h()
  {
    return this.a;
  }

  public final void i()
  {
    if (this.p != null)
      this.p.a();
  }

  public final void j()
  {
    d();
    if ((this.s.size() == 1) && (this.p.c() != -1))
    {
      this.p.a(new ag()
      {
        public final void a()
        {
          e.g(e.this);
        }
      });
      return;
    }
    o();
  }

  public final String k()
  {
    return "/Activity_Stream";
  }

  public final String l()
  {
    return this.e.getString(2131493012);
  }

  public final int m()
  {
    return 2131165537;
  }

  public final boolean n()
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.k.setOnItemClickListener(this);
    this.k.setOnScrollListener(this);
    this.k.setOnItemLongClickListener(this);
    this.k.setAdapter(this.n);
    this.k.setChoiceMode(1);
    this.k.setOnTouchListener(this.p);
    this.o = new b(this.e, 2131755008, 2131689472, this);
    android.support.v4.app.ag.a(true);
    getLoaderManager().a(1, null, new g(this));
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = a(paramMenuItem);
    if (!bool)
      bool = super.onContextItemSelected(paramMenuItem);
    return bool;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
    this.n = new textnow.k.j(this.e, null, 0, this);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    if (!ad.b(this.e))
      paramMenuInflater.inflate(2131755009, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    View localView = paramLayoutInflater.inflate(2130903096, null);
    this.k = ((ListView)localView.findViewById(2131165381));
    this.q = ((SwipeRefreshLayout)localView.findViewById(2131165380));
    this.q.a(new int[] { 2131296331, 2131296347, 2131296343, 2131296349 });
    this.q.a(new an()
    {
      public final void a()
      {
        e.this.f();
      }
    });
    this.p = new af(this.k, this.q, 2131165364, 2131165373);
    this.l = ((LinearLayout)localView.findViewById(2131165378));
    this.l.setVisibility(8);
    this.m = ((Button)localView.findViewById(2131165379));
    this.m.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (e.f(e.this) != null)
          e.f(e.this).a(1, null, MessageViewFragment.MessageViewState.a, null, null);
      }
    });
    this.g = true;
    return localView;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.k = null;
    this.n = null;
    this.o = null;
    this.l = null;
    this.m = null;
  }

  public void onDestroyView()
  {
    this.g = false;
    p();
    super.onDestroyView();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.o.a() == 2)
      this.k.setItemChecked(paramInt, a(paramView, true));
    m localm;
    do
    {
      do
      {
        return;
        localm = (m)paramView.getTag();
      }
      while (localm == null);
      if (!localm.l)
        break;
      d();
      this.e.a(new textnow.u.d(localm.a.c(), localm.a.d(), localm.a.e(), localm.a.h(), true));
    }
    while (!this.e.g());
    a(localm.a);
    return;
    textnow.u.f localf = localm.a;
    if (localf.d() == 5);
    for (String str = "group"; ; str = "1:1")
    {
      com.enflick.android.TextNow.ads.a.a("open_chat", "chat_type", str);
      if (this.r == null)
        break;
      d();
      this.r.a(2, localf, MessageViewFragment.MessageViewState.a, null, null);
      return;
    }
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i1 = 1;
    if (this.o.a() == i1)
    {
      a(paramView, false);
      this.k.setItemChecked(paramInt, i1);
      return false;
    }
    if (this.o.a() == 3)
      this.k.clearChoices();
    if (!this.n.a(paramView))
    {
      a(paramView, i1);
      this.k.setItemChecked(paramInt, i1);
    }
    while (true)
    {
      return i1;
      int i2 = 0;
    }
  }

  public void onPause()
  {
    super.onPause();
    this.h = false;
  }

  public void onResume()
  {
    super.onResume();
    this.h = true;
    if (this.j)
    {
      a(true);
      this.j = false;
    }
    com.enflick.android.TextNow.ads.a.b("view_activity_stream");
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i1 = 1;
    af localaf;
    if (paramInt == 2)
    {
      q.a(this.e).c();
      localaf = this.p;
      if (((this.o != null) && (this.o.a() != 3)) || (paramInt == i1))
        break label66;
    }
    while (true)
    {
      localaf.a(i1);
      return;
      q.a(this.e).d();
      break;
      label66: i1 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.e
 * JD-Core Version:    0.6.2
 */