package com.enflick.android.TextNow.activities.quickreply;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.MessageViewFragment.MessageViewState;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import com.enflick.android.TextNow.views.QuickReplyConversationFlipper;
import com.enflick.android.TextNow.views.QuickReplyConversationView;
import java.util.HashMap;
import java.util.Map;
import textnow.aa.a;
import textnow.v.k;
import textnow.z.f;
import textnow.z.o;

public class QuickReplyActivityBase extends Activity
  implements View.OnClickListener, com.enflick.android.TextNow.views.g, com.enflick.android.TextNow.views.h
{
  private BroadcastReceiver a;
  private boolean b = false;
  private Map<String, QuickReplyConversationView> c = new HashMap(5);
  private QuickReplyConversationFlipper d;

  private void a(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null)
    {
      if (!localBundle.containsKey("extra_outgoing_contact_value"))
        break label29;
      a(localBundle.getString("extra_outgoing_contact_value"));
    }
    label29: f localf;
    String str;
    int i;
    QuickReplyConversationView localQuickReplyConversationView2;
    do
    {
      do
      {
        return;
        localf = (f)localBundle.getSerializable("extra_contact");
        textnow.z.g localg = f.a(this, textnow.z.h.b(this), localf.a(), localf.b());
        if (localg != null)
        {
          localf.a(localg.a);
          localf.a(localg.b);
        }
        str = localBundle.getString("extra_message");
        i = localBundle.getInt("extra_source");
        new StringBuilder().append("Adding new quick reply message: ").append(localf.a()).append(" message: ").append(str).toString();
      }
      while ((!this.c.containsKey(localf.a())) && (this.c.size() >= 5));
      if (!this.c.containsKey(localf.a()))
        break;
      localQuickReplyConversationView2 = (QuickReplyConversationView)this.c.get(localf.a());
    }
    while (localQuickReplyConversationView2 == null);
    localQuickReplyConversationView2.a(new o(str, i));
    return;
    ContentResolver localContentResolver = getContentResolver();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = localf.a();
    textnow.z.h localh = textnow.z.h.a(localContentResolver, arrayOfString);
    if (localh != null)
      localf.c(localh.h());
    while (true)
    {
      QuickReplyConversationView localQuickReplyConversationView1 = (QuickReplyConversationView)getLayoutInflater().inflate(2130903191, null);
      localQuickReplyConversationView1.a(localf);
      localQuickReplyConversationView1.a(this);
      localQuickReplyConversationView1.a(new o(str, i));
      this.c.put(localf.a(), localQuickReplyConversationView1);
      if (this.d == null)
        break;
      this.d.a(localQuickReplyConversationView1);
      return;
      Uri localUri = k.a(getContentResolver(), localf.a(), localf.b());
      if (localUri != null)
        localf.c(localUri.toString());
    }
  }

  private void c()
  {
    View localView = this.d.a().getCurrentView();
    if ((localView != null) && ((localView instanceof QuickReplyConversationView)))
    {
      QuickReplyConversationView localQuickReplyConversationView = (QuickReplyConversationView)localView;
      f localf = localQuickReplyConversationView.a();
      ContentResolver localContentResolver = getContentResolver();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = localf.a();
      textnow.z.h localh = textnow.z.h.a(localContentResolver, arrayOfString);
      if (localh != null)
      {
        int i = localh.i();
        new StringBuilder().append(localQuickReplyConversationView.c()).append(" quick msgs, ").append(i).append(" unread msgs").toString();
        if ((i > 0) && (i <= localQuickReplyConversationView.c()))
        {
          new StringBuilder().append("marking conv ").append(localf.a()).append(" as read").toString();
          new MarkMessagesReadTask(localf.a()).b(this);
        }
      }
    }
  }

  public final void a()
  {
    c();
  }

  public final void a(String paramString)
  {
    if (this.c.containsKey(paramString))
    {
      a.a(this).a(paramString);
      if (this.c.size() > 1)
      {
        c();
        this.d.b((View)this.c.get(paramString));
        this.c.remove(paramString);
      }
    }
    while (!this.c.isEmpty())
    {
      return;
      finish();
      return;
    }
    finish();
  }

  public final void b()
  {
    finish();
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131558935:
    case 2131558936:
    }
    View localView;
    do
    {
      return;
      finish();
      return;
      localView = this.d.a().getCurrentView();
    }
    while ((localView == null) || (!(localView instanceof QuickReplyConversationView)));
    f localf = ((QuickReplyConversationView)localView).a();
    ContentResolver localContentResolver = getContentResolver();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = localf.a();
    textnow.z.h localh = textnow.z.h.a(localContentResolver, arrayOfString);
    if (localh != null)
    {
      MainActivity.a(this, localh, MessageViewFragment.MessageViewState.a, 2);
      finish();
      return;
    }
    MainActivity.a(this, false, false);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903189);
    this.a = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if ("quickreply_action_finish".equals(paramAnonymousIntent.getAction()))
        {
          QuickReplyActivityBase.a(QuickReplyActivityBase.this, true);
          QuickReplyActivityBase.this.finish();
        }
      }
    };
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("quickreply_action_finish");
    m.a(this).a(this.a, localIntentFilter);
    this.d = ((QuickReplyConversationFlipper)findViewById(2131558934));
    this.d.a(this);
    View localView1 = findViewById(2131558935);
    View localView2 = findViewById(2131558936);
    a(getIntent());
    localView1.setOnClickListener(this);
    localView2.setOnClickListener(this);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.c != null)
      this.c.clear();
    m.a(this).a(this.a);
    if (!this.b)
      c();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
      a(paramIntent);
  }

  protected void onStart()
  {
    super.onStart();
    b.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    b.b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase
 * JD-Core Version:    0.6.2
 */