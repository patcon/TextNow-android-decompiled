package com.enflick.android.TextNow.activities.quickreply;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.MessageViewFragment.MessageViewState;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import com.enflick.android.TextNow.views.QuickReplyConversationFlipper;
import com.enflick.android.TextNow.views.QuickReplyConversationView;
import com.enflick.android.TextNow.views.g;
import java.util.HashMap;
import java.util.Map;
import textnow.q.k;
import textnow.q.o;
import textnow.u.d;
import textnow.u.e;
import textnow.u.m;

public class QuickReplyActivityBase extends Activity
  implements View.OnClickListener, com.enflick.android.TextNow.views.f, g
{
  private Map<String, QuickReplyConversationView> a = new HashMap(5);
  private QuickReplyConversationFlipper b;

  private void a(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null)
    {
      if (!localBundle.containsKey("extra_outgoing_contact_value"))
        break label29;
      a(localBundle.getString("extra_outgoing_contact_value"));
    }
    label29: d locald;
    String str;
    int i;
    QuickReplyConversationView localQuickReplyConversationView2;
    do
    {
      do
      {
        return;
        locald = (d)localBundle.getSerializable("extra_contact");
        e locale = d.a(this, textnow.u.f.b(this), locald.a(), locald.b());
        if (locale != null)
        {
          locald.a(locale.a);
          locald.a(locale.b);
        }
        str = localBundle.getString("extra_message");
        i = localBundle.getInt("extra_source");
        new StringBuilder().append("Adding new quick reply message: ").append(locald.a()).append(" message: ").append(str).toString();
      }
      while ((!this.a.containsKey(locald.a())) && (this.a.size() >= 5));
      if (!this.a.containsKey(locald.a()))
        break;
      localQuickReplyConversationView2 = (QuickReplyConversationView)this.a.get(locald.a());
    }
    while (localQuickReplyConversationView2 == null);
    localQuickReplyConversationView2.a(new m(str, i));
    return;
    ContentResolver localContentResolver = getContentResolver();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = locald.a();
    textnow.u.f localf = textnow.u.f.a(localContentResolver, arrayOfString);
    if (localf != null)
      locald.c(localf.h());
    while (true)
    {
      QuickReplyConversationView localQuickReplyConversationView1 = (QuickReplyConversationView)getLayoutInflater().inflate(2130903173, null);
      localQuickReplyConversationView1.a(locald);
      localQuickReplyConversationView1.a(this);
      localQuickReplyConversationView1.a(new m(str, i));
      this.a.put(locald.a(), localQuickReplyConversationView1);
      if (this.b == null)
        break;
      this.b.a(localQuickReplyConversationView1);
      return;
      Uri localUri = k.a(getContentResolver(), locald.a(), locald.b());
      if (localUri != null)
        locald.c(localUri.toString());
    }
  }

  private void c()
  {
    View localView = this.b.a().getCurrentView();
    if ((localView != null) && ((localView instanceof QuickReplyConversationView)))
    {
      QuickReplyConversationView localQuickReplyConversationView = (QuickReplyConversationView)localView;
      d locald = localQuickReplyConversationView.a();
      ContentResolver localContentResolver = getContentResolver();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = locald.a();
      textnow.u.f localf = textnow.u.f.a(localContentResolver, arrayOfString);
      if (localf != null)
      {
        int i = localf.i();
        new StringBuilder().append(localQuickReplyConversationView.c()).append(" quick msgs, ").append(i).append(" unread msgs").toString();
        if ((i > 0) && (i <= localQuickReplyConversationView.c()))
        {
          new StringBuilder().append("marking conv ").append(locald.a()).append(" as read").toString();
          new MarkMessagesReadTask(locald.a()).b(this);
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
    if (this.a.containsKey(paramString))
    {
      o.a(this).a(paramString);
      if (this.a.size() > 1)
      {
        c();
        this.b.b((View)this.a.get(paramString));
        this.a.remove(paramString);
      }
    }
    while (!this.a.isEmpty())
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
    case 2131165633:
    case 2131165634:
    }
    View localView;
    do
    {
      return;
      finish();
      return;
      localView = this.b.a().getCurrentView();
    }
    while ((localView == null) || (!(localView instanceof QuickReplyConversationView)));
    d locald = ((QuickReplyConversationView)localView).a();
    ContentResolver localContentResolver = getContentResolver();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = locald.a();
    textnow.u.f localf = textnow.u.f.a(localContentResolver, arrayOfString);
    if (localf != null)
    {
      MainActivity.a(this, localf, MessageViewFragment.MessageViewState.a, 2);
      finish();
      return;
    }
    MainActivity.a(this, false, false);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903171);
    this.b = ((QuickReplyConversationFlipper)findViewById(2131165632));
    this.b.a(this);
    View localView1 = findViewById(2131165633);
    View localView2 = findViewById(2131165634);
    a(getIntent());
    localView1.setOnClickListener(this);
    localView2.setOnClickListener(this);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.a != null)
      this.a.clear();
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
    a.a(this);
  }

  protected void onStop()
  {
    super.onStop();
    a.b(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase
 * JD-Core Version:    0.6.2
 */