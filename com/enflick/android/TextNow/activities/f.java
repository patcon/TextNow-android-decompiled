package com.enflick.android.TextNow.activities;

import android.content.ContentResolver;
import android.os.Bundle;
import android.support.v4.app.k;
import android.support.v4.widget.SwipeRefreshLayout;
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
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.tasks.DeleteConversationTask;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import textnow.ac.a;
import textnow.p.p;
import textnow.p.r;
import textnow.z.u;

public class f extends av
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, d, p
{
  private long a = -1L;
  private int b = -1;
  private boolean f;
  private boolean g;
  private boolean h = false;
  private boolean i = false;
  private ListView j;
  private LinearLayout k;
  private Button l;
  private textnow.p.o m;
  private c n;
  private al o;
  private SwipeRefreshLayout p;
  private g q;
  private ArrayList<String> r = new ArrayList();
  private int s;
  private int t;

  public static f a(g paramg)
  {
    f localf = new f();
    localf.q = paramg;
    return localf;
  }

  private void a(boolean paramBoolean)
  {
    if (!this.f)
      return;
    if (this.a == -1L)
    {
      this.j.clearChoices();
      return;
    }
    if ((this.b >= 0) && (this.b < this.j.getCount()) && (this.j.getItemIdAtPosition(this.b) == this.a))
    {
      if (!this.j.isItemChecked(this.b))
        this.j.setItemChecked(this.b, true);
      if (paramBoolean)
        this.j.smoothScrollToPosition(this.b);
      this.h = false;
      this.i = false;
      return;
    }
    int i1 = this.j.getCount();
    int i2 = 0;
    if (i2 < i1)
      if (this.j.getItemIdAtPosition(i2) == this.a)
      {
        if (this.b != i2)
        {
          this.b = i2;
          this.j.setItemChecked(this.b, true);
        }
        if (paramBoolean)
          this.j.smoothScrollToPosition(i2);
      }
    for (int i3 = 1; ; i3 = 0)
    {
      if (i3 != 0)
      {
        this.h = false;
        return;
        i2++;
        break;
      }
      this.h = true;
      return;
    }
  }

  private boolean a(View paramView, boolean paramBoolean)
  {
    paramView.invalidate();
    return this.m.a(paramView, paramBoolean);
  }

  private void p()
  {
    this.o.b();
    Iterator localIterator = this.r.iterator();
    label154: 
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ContentResolver localContentResolver = getActivity().getContentResolver();
      a.a(localContentResolver, str);
      if (textnow.ac.b.d(localContentResolver, str))
        new DeleteGroupTask(str).b(getActivity());
      while (true)
      {
        while (true)
        {
          if (textnow.v.b.b(str) == null)
            break label154;
          try
          {
            w localw = com.enflick.android.TextNow.activities.phone.h.a().p();
            if ((!com.enflick.android.TextNow.activities.phone.h.c(com.enflick.android.TextNow.activities.phone.h.a().y())) || (localw == null) || (!str.equals(textnow.v.b.b(localw.b().a()))))
              break;
            com.enflick.android.TextNow.activities.phone.h.a().b(false);
          }
          catch (n localn)
          {
          }
        }
        break;
        new DeleteConversationTask(str).b(getActivity());
      }
    }
    this.r.clear();
  }

  private void q()
  {
    if ((c() == 0) || (!this.f))
    {
      this.n.b();
      this.o.a(true);
      return;
    }
    this.o.a(false);
    if (this.n.a() == 2)
    {
      this.n.c();
      return;
    }
    this.n.d();
  }

  public final void a()
  {
    this.t = this.j.getChoiceMode();
    this.s = this.j.getTranscriptMode();
    this.j.setChoiceMode(2);
    this.j.setTranscriptMode(0);
  }

  public final void a(View paramView1, View paramView2)
  {
    int i1 = 1;
    r localr = (r)paramView1.getTag();
    d();
    if (paramView2.getId() == 2131558640)
    {
      localf = new textnow.z.f(localr.a.c(), localr.a.d(), localr.a.e(), localr.a.h(), i1);
      if ((localf.j()) && (this.d != null))
      {
        localMainActivity = this.d;
        if (localr.m)
          i1 = 0;
        localMainActivity.a(localf, false, i1);
        if (this.d.i())
          a(localr.a);
      }
      this.o.a();
    }
    while (paramView2.getId() != 2131558641)
    {
      textnow.z.f localf;
      MainActivity localMainActivity;
      return;
    }
    this.r.clear();
    this.r.add(localr.a.c());
    Bundle localBundle = new Bundle();
    localBundle.putInt("count", i1);
    this.d.showDialog(2, localBundle);
  }

  public final void a(textnow.z.h paramh)
  {
    if (paramh == null)
      return;
    this.a = paramh.a();
    if (this.g)
    {
      a(true);
      return;
    }
    this.i = true;
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131559058:
    }
    this.r.clear();
    if (this.n.a() == 1)
      this.r.add(this.m.d());
    while (true)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("count", this.r.size());
      getActivity().showDialog(2, localBundle);
      return true;
      HashMap localHashMap = this.m.c();
      this.r.addAll(localHashMap.values());
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = false;
    if (localClass == GetNewMessagesTask.class)
    {
      ListView localListView = this.j;
      bool = false;
      if (localListView != null)
      {
        if ("DB_ERROR".equals(paramc.j()))
          this.d.c(2131296942);
        this.p.a(false);
        bool = true;
      }
    }
    return bool;
  }

  public final void b()
  {
    this.j.setChoiceMode(this.t);
    this.j.setTranscriptMode(this.s);
    int i1 = this.j.getFirstVisiblePosition();
    View localView = this.j.getChildAt(0);
    int i2;
    if (localView == null)
    {
      i2 = 0;
      if (!(this.j.getAdapter() instanceof HeaderViewListAdapter))
        break label96;
      this.j.setAdapter(((HeaderViewListAdapter)this.j.getAdapter()).getWrappedAdapter());
    }
    while (true)
    {
      this.j.setSelectionFromTop(i1, i2);
      return;
      i2 = localView.getTop();
      break;
      label96: this.j.setAdapter(this.j.getAdapter());
    }
  }

  public final int c()
  {
    return this.m.c().size();
  }

  public final void c_()
  {
    getLoaderManager().b(1, null, new h(this));
  }

  public final void d()
  {
    if (this.m != null)
      this.m.e();
    if (this.o != null)
      this.o.a(true);
    if ((this.j != null) && (this.j != null))
    {
      this.j.clearChoices();
      this.j.requestLayout();
    }
    if ((this.n != null) && (this.n.a() == 2))
      this.n.b();
  }

  public final void f()
  {
    new GetUserInfoTask(new u(this.d).b()).b(this.d);
    new GetNewMessagesTask(false, true).b(this.d);
  }

  public final void g()
  {
    q();
  }

  public final long h()
  {
    return this.a;
  }

  public final void i()
  {
    if (this.o != null)
      this.o.a();
  }

  public final void j()
  {
    d();
    if ((this.r.size() == 1) && (this.o.c() != -1))
    {
      this.o.a(new am()
      {
        public final void a()
        {
          f.f(f.this);
        }
      });
      return;
    }
    p();
  }

  public final ArrayList<String> k()
  {
    return this.r;
  }

  public final String l()
  {
    return "/Activity_Stream";
  }

  public final String m()
  {
    return this.d.getString(2131296418);
  }

  public final int n()
  {
    return 2131558814;
  }

  public final boolean o()
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.j.setOnItemClickListener(this);
    this.j.setOnScrollListener(this);
    this.j.setOnItemLongClickListener(this);
    this.j.setAdapter(this.m);
    this.j.setChoiceMode(1);
    this.j.setOnTouchListener(this.o);
    this.n = new c(this.d, 2131755010, 2131689472, this);
    android.support.v4.app.z.a(true);
    getLoaderManager().a(1, null, new h(this));
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
    this.m = new textnow.p.o(this.d, null, 0, this);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    if (!textnow.v.z.d(this.d))
      paramMenuInflater.inflate(2131755011, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    View localView = paramLayoutInflater.inflate(2130903108, null);
    this.j = ((ListView)localView.findViewById(2131558647));
    this.p = ((SwipeRefreshLayout)localView.findViewById(2131558646));
    this.p.a(new int[] { 2131230856, 2131230872, 2131230868, 2131230874 });
    this.p.a(new android.support.v4.widget.av()
    {
      public final void a()
      {
        f.this.f();
      }
    });
    this.o = new al(this.j, this.p, 2131558630, 2131558639);
    this.k = ((LinearLayout)localView.findViewById(2131558644));
    this.k.setVisibility(8);
    this.l = ((Button)localView.findViewById(2131558645));
    this.l.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (f.e(f.this) != null)
          f.e(f.this).a(1, null, MessageViewFragment.MessageViewState.a);
      }
    });
    this.f = true;
    return localView;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.j = null;
    this.m = null;
    this.n = null;
    this.k = null;
    this.l = null;
  }

  public void onDestroyView()
  {
    this.f = false;
    q();
    super.onDestroyView();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.n.a() == 2)
      this.j.setItemChecked(paramInt, a(paramView, true));
    r localr;
    do
    {
      do
      {
        do
        {
          return;
          localr = (r)paramView.getTag();
        }
        while (localr == null);
        if (!localr.m)
          break;
        d();
      }
      while (this.d == null);
      this.d.a(new textnow.z.f(localr.a.c(), localr.a.d(), localr.a.e(), localr.a.h(), true));
    }
    while (!this.d.i());
    a(localr.a);
    return;
    textnow.z.h localh = localr.a;
    if (localh.d() == 5);
    for (String str = "group"; ; str = "1:1")
    {
      com.enflick.android.TextNow.ads.b.a("open_chat", "chat_type", str);
      if (this.q == null)
        break;
      d();
      this.q.a(2, localh, MessageViewFragment.MessageViewState.a);
      return;
    }
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i1 = 1;
    if (this.n.a() == i1)
    {
      a(paramView, false);
      this.j.setItemChecked(paramInt, i1);
      return false;
    }
    if (this.n.a() == 3)
      this.j.clearChoices();
    if (!this.m.a(paramView))
    {
      a(paramView, i1);
      this.j.setItemChecked(paramInt, i1);
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
    this.g = false;
  }

  public void onResume()
  {
    super.onResume();
    this.g = true;
    if (this.i)
    {
      a(true);
      this.i = false;
    }
    com.enflick.android.TextNow.ads.b.b("view_activity_stream");
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i1 = 1;
    al localal;
    if (paramInt == 2)
    {
      textnow.v.o.a(this.d).c();
      localal = this.o;
      if (((this.n != null) && (this.n.a() != 3)) || (paramInt == i1))
        break label66;
    }
    while (true)
    {
      localal.a(i1);
      return;
      textnow.v.o.a(this.d).d();
      break;
      label66: i1 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.f
 * JD-Core Version:    0.6.2
 */