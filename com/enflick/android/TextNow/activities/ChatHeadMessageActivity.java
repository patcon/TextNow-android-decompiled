package com.enflick.android.TextNow.activities;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.s;
import android.support.v4.content.m;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bq;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.enflick.android.TextNow.chatheads.d;
import com.enflick.android.TextNow.widget.TNWidget;
import java.io.File;
import java.util.concurrent.TimeUnit;
import textnow.v.k;
import textnow.v.z;
import textnow.z.f;
import textnow.z.h;

public class ChatHeadMessageActivity extends an
  implements bq, v, d
{
  private static boolean a = false;
  private MessageViewFragment A;
  private l B;
  private com.enflick.android.TextNow.chatheads.c b;
  private com.enflick.android.TextNow.chatheads.g c;
  private IntentFilter d;
  private BroadcastReceiver e;
  private h f = null;
  private f o = null;
  private boolean p = true;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private RelativeLayout v;
  private FrameLayout w;
  private RelativeLayout x;
  private Toolbar y;
  private n z;

  public static void a(Context paramContext, f paramf)
  {
    Intent localIntent = new Intent(paramContext, ChatHeadMessageActivity.class);
    localIntent.setFlags(276889600);
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("arg_contact", paramf);
    localIntent.putExtras(localBundle);
    paramContext.startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    if ((localBundle == null) || (!localBundle.containsKey("arg_contact")));
    do
    {
      return;
      this.o = ((f)localBundle.getSerializable("arg_contact"));
      this.f = h.a(this, this.o);
      if (this.f != null)
      {
        this.c.j();
        h localh = this.f;
        if ((this.z == null) || (isFinishing()));
        while (true)
        {
          l();
          if (!this.p)
            break;
          this.p = false;
          return;
          this.A = MessageViewFragment.a(2, localh, MessageViewFragment.MessageViewState.a, this);
          s locals = this.z.a();
          locals.b(2131558521, this.A, localh.c());
          locals.b();
        }
      }
    }
    while (this.o == null);
    this.c.a(this.o.a());
  }

  private void a(boolean paramBoolean)
  {
    if (this.t)
      return;
    this.t = true;
    if (paramBoolean)
    {
      this.b.a(this.x, this, 0.5F, 0.0F);
      this.b.a(this.v, this);
      return;
    }
    n();
  }

  public static boolean g()
  {
    return a;
  }

  private void l()
  {
    if (this.y == null)
      return;
    Toolbar localToolbar1 = this.y;
    String str1;
    String str2;
    label73: u localu;
    if (this.f != null)
    {
      str1 = this.f.p();
      localToolbar1.a(str1);
      Toolbar localToolbar2 = this.y;
      if (this.f == null)
        break label350;
      if (this.f.d() != 2)
        break label285;
      if (!k.a(this.f.c()))
        break label270;
      str2 = "Unknown Number";
      localToolbar2.b(str2);
      Menu localMenu = this.y.m();
      localu = new u(localMenu);
      localu.a();
      MenuItem localMenuItem1 = localMenu.findItem(2131559049);
      MenuItem localMenuItem2 = localMenu.findItem(2131559050);
      if (localMenuItem2 != null)
        localMenuItem2.getIcon().setAlpha(255);
      if (localMenuItem1 != null)
        localMenuItem1.getIcon().setAlpha(255);
      if ((this.f == null) || (this.o == null))
        break label396;
      if (!this.o.j())
        localu.a(2131559049);
      if (this.f.n())
        break label358;
      localu.a(2131559050);
      localu.a(2131559052);
      localu.b(2131559051);
      label230: if (!TextUtils.isEmpty(this.f.l()))
        break label385;
      localu.a(2131559057);
    }
    while (true)
    {
      this.y.requestLayout();
      return;
      str1 = getString(2131296418);
      break;
      label270: str2 = textnow.v.b.f(this.f.c());
      break label73;
      label285: if (this.f.d() == 1)
      {
        str2 = this.f.c() + "@textnow.me";
        break label73;
      }
      if (this.f.d() != 5)
      {
        str2 = this.f.c();
        break label73;
      }
      label350: str2 = "";
      break label73;
      label358: localu.b(2131559050);
      localu.b(2131559052);
      localu.a(2131559051);
      break label230;
      label385: localu.b(2131559057);
      continue;
      label396: localu.a(2131559049);
    }
  }

  private void m()
  {
    com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "unmuting notifications from Floating Notification");
    this.f.a(false);
    aa.a(this, this.f, false);
    l();
  }

  private void n()
  {
    PendingIntent localPendingIntent;
    if (this.q)
      localPendingIntent = TNWidget.getDialerIntent(this.o, this, 0, "ChatHeads");
    try
    {
      localPendingIntent.send();
      if (this.r)
      {
        if (this.f != null)
          MainActivity.a(this, this.f, MessageViewFragment.MessageViewState.a, 2);
      }
      else
      {
        finish();
        overridePendingTransition(0, 0);
        return;
      }
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
      while (true)
      {
        localCanceledException.printStackTrace();
        continue;
        MainActivity.a(this, false, false);
      }
    }
  }

  public final void a(int paramInt)
  {
    if (paramInt == 9)
      n();
    while (paramInt != 10)
      return;
    this.y = ((Toolbar)findViewById(2131558519));
    this.y.a(this);
    this.y.e(2131755009);
    this.y.b(getResources().getColor(2131230803));
    this.y.c(getResources().getColor(2131230803));
    a(getIntent());
    a = true;
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    boolean bool = c(paramc.j());
    if ((this.A != null) && (this.A.getActivity() != null))
      this.A.a(paramc, bool);
    if (!textnow.v.b.a(this.k.r(), this.k.W()))
      D();
    while ((this.A == null) || (!this.A.isVisible()) || (F()))
      return;
    E();
  }

  public final void a(h paramh)
  {
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131559051:
      com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "muting notifications from Floating Notification");
      this.f.a(true);
      aa.a(this, this.f, true);
      l();
      return true;
    case 2131559052:
      m();
      return true;
    case 2131559053:
      com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "opening conversation in TextNow from Floating Notification");
      this.r = true;
      a(true);
      return true;
    case 2131559054:
      if (this.f != null)
        aa.a(this, this.f);
      return true;
    case 2131559055:
      this.h = true;
      aa.a(this, this.f);
      return true;
    case 2131559056:
      if (this.f != null)
      {
        this.h = true;
        Intent localIntent = new Intent("android.intent.action.PICK");
        localIntent.setType("image/*");
        startActivityForResult(localIntent, 10);
      }
      return true;
    case 2131559057:
      if (this.f != null)
      {
        new com.enflick.android.TextNow.tasks.a(this, this.f, "", null, null, this.f.a()).execute(new Void[0]);
        this.A.a(null, true);
        this.f.a("");
        l();
      }
      return true;
    case 2131559049:
      com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "calling from Floating Notification");
      this.q = true;
      a(true);
      return true;
    case 2131559050:
    }
    m();
    return true;
  }

  public final boolean h()
  {
    return this.s;
  }

  protected final void i()
  {
    D();
    if ((this.A != null) && (this.A.h()))
      this.A.a(false);
  }

  protected final void j()
  {
    if ((this.A != null) && (this.A.isVisible()))
    {
      if (!u())
        break label46;
      E();
      e(false);
    }
    while (true)
    {
      if (u())
        e(false);
      return;
      label46: a(1, TimeUnit.SECONDS);
    }
  }

  public final void k()
  {
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 12)
    {
      this.h = false;
      if ((paramInt2 == -1) && (paramIntent != null) && (this.f != null))
      {
        Uri localUri2 = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (localUri2 != null);
        for (String str2 = localUri2.toString(); ; str2 = "")
        {
          new com.enflick.android.TextNow.tasks.a(this, this.f, null, str2, null, this.f.a()).execute(new Void[0]);
          this.A.a(str2);
          return;
        }
      }
    }
    else
    {
      if (paramInt1 != 10)
        break label236;
      if ((paramInt2 != -1) || (paramIntent == null) || (paramIntent.getData() == null) || (!paramIntent.getData().toString().startsWith("content://")))
        break label228;
      String str1 = textnow.v.g.a(this, paramIntent.getData().toString());
      Uri localUri1 = paramIntent.getData();
      if (this.f != null)
      {
        Intent localIntent = new Intent(this, WallpaperPreviewActivity.class);
        localIntent.setData(localUri1);
        localIntent.putExtra("conv_id", this.f.a());
        localIntent.putExtra("local_path", str1);
        startActivityForResult(localIntent, 11);
      }
    }
    label228: label236: 
    do
    {
      do
        while (true)
        {
          super.onActivityResult(paramInt1, paramInt2, paramIntent);
          return;
          this.h = false;
        }
      while (paramInt1 != 11);
      this.h = false;
    }
    while ((paramInt2 != -1) || (this.f == null));
    File localFile = getFileStreamPath(z.a(this.f.a()));
    new com.enflick.android.TextNow.tasks.a(this, this.f, localFile.getAbsolutePath(), null, null, this.f.a()).execute(new Void[0]);
    this.A.a(localFile.getAbsolutePath(), false);
    this.f.a(localFile.getAbsolutePath());
    l();
  }

  public void onBackPressed()
  {
    if (this.w.getVisibility() == 0)
    {
      this.w.setVisibility(8);
      this.v.getLayoutParams().height = -1;
      this.x.requestLayout();
      return;
    }
    a(true);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if ((this.A != null) && (this.A.isVisible()))
      this.A.p();
  }

  public void onCreate(Bundle paramBundle)
  {
    overridePendingTransition(0, 0);
    this.i = true;
    this.j = false;
    this.t = false;
    super.onCreate(paramBundle);
    setContentView(2130903067);
    this.d = new IntentFilter();
    this.d.addAction("action_open_conversation");
    this.d.addAction("action_close");
    this.d.addAction("action_open_img_preview");
    this.e = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        if ((paramAnonymousIntent == null) || (paramAnonymousIntent.getAction() == null));
        String str;
        do
        {
          return;
          Bundle localBundle = paramAnonymousIntent.getExtras();
          str = paramAnonymousIntent.getAction();
          if ((str == "action_open_conversation") && (localBundle != null))
          {
            ChatHeadMessageActivity.a(ChatHeadMessageActivity.this, paramAnonymousIntent);
            return;
          }
          if (str == "action_close")
          {
            ChatHeadMessageActivity.a(ChatHeadMessageActivity.this, true);
            return;
          }
        }
        while (str != "action_open_img_preview");
        ChatHeadMessageActivity.b(ChatHeadMessageActivity.this, paramAnonymousIntent);
      }
    };
    if (!com.enflick.android.TextNow.chatheads.g.f())
      a(false);
    this.c = com.enflick.android.TextNow.chatheads.g.a(this);
    this.b = com.enflick.android.TextNow.chatheads.c.a(null);
    this.z = getSupportFragmentManager();
    this.v = ((RelativeLayout)findViewById(2131558518));
    this.w = ((FrameLayout)findViewById(2131558517));
    this.x = ((RelativeLayout)findViewById(2131558516));
    this.x.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, (byte)0));
    getIntent();
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    if (Build.VERSION.SDK_INT >= 21);
    for (int i = -t(); ; i = 0)
    {
      localLayoutParams.setMargins((int)getResources().getDimension(2131165266), i + (z.g(this) + z.a(this, 64)), (int)getResources().getDimension(2131165266), (int)getResources().getDimension(2131165268));
      this.v.setLayoutParams(localLayoutParams);
      this.b.a(this.x, this, 0.0F, 0.5F);
      this.b.b(this.v, this);
      C();
      return;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    a = false;
    if (this.u)
    {
      this.c.l();
      this.u = false;
    }
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    m.a(this).a(this.e);
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  public void onPause()
  {
    super.onPause();
    if (!this.h)
    {
      m.a(this).a(this.e);
      this.u = true;
      finish();
      overridePendingTransition(0, 0);
    }
  }

  public void onResume()
  {
    super.onResume();
    m.a(this).a(this.e, this.d);
    if (!F())
      i(false);
  }

  public void onStop()
  {
    super.onStop();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ChatHeadMessageActivity
 * JD-Core Version:    0.6.2
 */