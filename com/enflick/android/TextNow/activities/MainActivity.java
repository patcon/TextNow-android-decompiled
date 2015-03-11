package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.activities.phone.s;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.INexage;
import com.enflick.android.TextNow.tasks.GetGroupsTask;
import com.enflick.android.TextNow.tasks.GetSettingsTask;
import com.enflick.android.TextNow.tasks.GetSubscriptionTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.ImportSMSTask;
import com.enflick.android.TextNow.tasks.RefreshContactProxyTask;
import com.enflick.android.TextNow.tasks.ReportIdfaTask;
import com.enflick.android.TextNow.tasks.TwitterPostTask;
import com.facebook.FacebookRequestError;
import com.facebook.Request.Callback;
import com.facebook.Response;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import textnow.k.w;
import textnow.p.h;
import textnow.q.ac;
import textnow.q.ad;

public class MainActivity extends an
  implements com.enflick.android.TextNow.views.a
{
  public Request.Callback b = new Request.Callback()
  {
    public final void onCompleted(Response paramAnonymousResponse)
    {
      boolean bool = true;
      if (paramAnonymousResponse != null)
      {
        paramAnonymousResponse.toString();
        if (paramAnonymousResponse.getError() != null);
        while (true)
        {
          int i = 0;
          if (bool)
            i = paramAnonymousResponse.getError().getErrorCode();
          MainActivity.a(MainActivity.this, bool, i, null);
          return;
          bool = false;
        }
      }
      MainActivity.a(MainActivity.this, bool, -1, null);
    }
  };
  textnow.p.i c = new textnow.p.i()
  {
    public final void a(textnow.p.j paramAnonymousj, textnow.p.k paramAnonymousk)
    {
      if (paramAnonymousj.c())
        new StringBuilder().append("Failed to query inventory: ").append(paramAnonymousj).toString();
      ArrayList localArrayList;
      do
      {
        return;
        localArrayList = new ArrayList();
        Iterator localIterator1 = paramAnonymousk.a().iterator();
        while (localIterator1.hasNext())
        {
          String str2 = (String)localIterator1.next();
          if (textnow.n.i.c(str2))
            localArrayList.add(paramAnonymousk.b(str2));
        }
        textnow.u.j localj = new textnow.u.j(MainActivity.this);
        Iterator localIterator2 = textnow.n.i.a().iterator();
        while (localIterator2.hasNext())
        {
          String str1 = (String)localIterator2.next();
          textnow.p.n localn = paramAnonymousk.a(str1);
          if (localn != null)
            localj.a(str1, localn.a());
        }
        localj.n();
      }
      while ((localArrayList.size() <= 0) || (MainActivity.a(MainActivity.this) == null));
      MainActivity.a(MainActivity.this).a(localArrayList, MainActivity.this.f);
    }
  };
  textnow.p.g d = new textnow.p.g()
  {
    public final void a(textnow.p.j paramAnonymousj, textnow.p.l paramAnonymousl)
    {
      new StringBuilder().append("Purchase finished: ").append(paramAnonymousj).append(", purchase: ").append(paramAnonymousl).toString();
      if (paramAnonymousj.c())
        if ((paramAnonymousj.a() != 1) && (paramAnonymousj.a() != -1005))
          MainActivity.this.c(2131493343);
      do
      {
        do
          return;
        while (!textnow.n.i.c(paramAnonymousl.a()));
        MainActivity.this.a(2131493021, false);
      }
      while (MainActivity.a(MainActivity.this) == null);
      MainActivity.a(MainActivity.this).a(paramAnonymousl, MainActivity.this.e);
    }
  };
  textnow.p.e e = new textnow.p.e()
  {
    public final void a(textnow.p.l paramAnonymousl, textnow.p.j paramAnonymousj)
    {
      new StringBuilder().append("Consumption finished. Purchase: ").append(paramAnonymousl).append(", result: ").append(paramAnonymousj).toString();
      if (paramAnonymousj.b())
      {
        new StringBuilder().append(paramAnonymousl.a()).append(" consumption successful").toString();
        String str1 = paramAnonymousl.a();
        String str2 = paramAnonymousl.c();
        String str3 = paramAnonymousl.d();
        new textnow.n.f(MainActivity.this).a(str1, str2, str3, textnow.n.g.b);
        return;
      }
      new StringBuilder().append(paramAnonymousl.a()).append(": Error while consuming: ").append(paramAnonymousj).toString();
      MainActivity.this.r();
      MainActivity.this.c(2131493343);
    }
  };
  textnow.p.f f = new textnow.p.f()
  {
    public final void a(List<textnow.p.l> paramAnonymousList, List<textnow.p.j> paramAnonymousList1)
    {
      int i = 0;
      if (i < paramAnonymousList.size())
      {
        textnow.p.j localj = (textnow.p.j)paramAnonymousList1.get(i);
        textnow.p.l locall = (textnow.p.l)paramAnonymousList.get(i);
        if (localj.b())
        {
          String str1 = locall.a();
          String str2 = locall.c();
          String str3 = locall.d();
          new StringBuilder().append(locall.a()).append(" consumption successful").toString();
          new textnow.n.f(MainActivity.this).a(str1, str2, str3, textnow.n.g.b);
        }
        while (true)
        {
          i++;
          break;
          new StringBuilder().append(locall.a()).append(": Error while consuming: ").append(localj).toString();
        }
      }
    }
  };
  private l l;
  private boolean m;
  private Menu n;
  private textnow.p.d o = null;
  private boolean p = false;
  private boolean q = false;
  private k r;
  private boolean s = false;
  private INexage t;

  public static void a(Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.putExtra("extra_show_account", true);
    localIntent.addFlags(268435456);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, Parcelable paramParcelable)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("extra_show_theme", true);
    localIntent.putExtra("extra_view_state", paramParcelable);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, textnow.u.d paramd, DialerFragment.DialerState paramDialerState)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("extra_show_dialer", true);
    localIntent.putExtra("extra_dialer_contact", paramd);
    localIntent.putExtra("extra_dialer_state", paramDialerState);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, textnow.u.f paramf, MessageViewFragment.MessageViewState paramMessageViewState, int paramInt)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("extra_msg_view_type", paramInt);
    localIntent.putExtra("extra_selected_convo", paramf);
    localIntent.putExtra("extra_message_view_state", paramMessageViewState);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    if (paramBoolean1)
      localIntent.putExtra("extra_show_phone_dialog", true);
    localIntent.putExtra("extra_from_notification", paramBoolean2);
    paramActivity.startActivity(localIntent);
    paramActivity.sendBroadcast(new Intent("com.enflick.android.TextNow.widget.WIDGET_LOGIN_CHANGE"));
  }

  private void a(Intent paramIntent)
  {
    int i;
    textnow.u.f localf2;
    MessageViewFragment.MessageViewState localMessageViewState1;
    if (paramIntent.hasExtra("extra_msg_view_type"))
    {
      i = paramIntent.getIntExtra("extra_msg_view_type", -1);
      localf2 = (textnow.u.f)paramIntent.getSerializableExtra("extra_selected_convo");
      localMessageViewState1 = (MessageViewFragment.MessageViewState)paramIntent.getParcelableExtra("extra_message_view_state");
      if (localMessageViewState1 != null)
        break label852;
    }
    label566: label831: label845: label852: for (MessageViewFragment.MessageViewState localMessageViewState2 = MessageViewFragment.MessageViewState.a; ; localMessageViewState2 = localMessageViewState1)
    {
      String str7;
      int k;
      textnow.u.e locale2;
      if (localf2 == null)
      {
        str7 = paramIntent.getStringExtra("extra_selected_cv");
        if (paramIntent.hasExtra("extra_selected_ct"))
        {
          k = paramIntent.getIntExtra("extra_selected_ct", 2);
          locale2 = textnow.u.d.a(this, textnow.u.f.b(this), str7, k);
          if (locale2 == null)
            break label845;
        }
      }
      for (String str8 = locale2.a; ; str8 = str7)
      {
        if (str8 != null);
        for (textnow.u.f localf3 = textnow.u.f.a(getContentResolver(), new String[] { str8 }); ; localf3 = localf2)
        {
          if (((localf3 != null) && (i != -1)) || (!(this.l instanceof n)))
            if ((!paramIntent.hasExtra("extra_launched_from_widget")) || (!paramIntent.getBooleanExtra("extra_widget_reply", false)))
              break label831;
          for (int j = 3; ; j = i)
          {
            this.l.a(j, localf3, localMessageViewState2, null, null);
            label363: Uri localUri1;
            String str1;
            do
            {
              do
              {
                return;
                k = textnow.u.d.d(str7);
                break;
                if (paramIntent.hasExtra("extra_dialer_hangup"))
                  try
                  {
                    com.enflick.android.TextNow.activities.phone.d.a().b(false);
                    textnow.q.o.a(this).c();
                    return;
                  }
                  catch (com.enflick.android.TextNow.activities.phone.j localj)
                  {
                    return;
                  }
                if (paramIntent.hasExtra("extra_show_dialer"))
                {
                  if (com.enflick.android.TextNow.activities.phone.d.d())
                  {
                    if ("widget_action_dialer".equals(paramIntent.getAction()))
                      paramIntent.getExtras().getString("extra_launched_from_widget");
                    DialerFragment.DialerState localDialerState = (DialerFragment.DialerState)paramIntent.getParcelableExtra("extra_dialer_state");
                    textnow.u.d locald = (textnow.u.d)paramIntent.getSerializableExtra("extra_dialer_contact");
                    if (paramIntent.hasExtra("extra_launched_from_widget"))
                    {
                      this.l.a(locald, localDialerState, false, true);
                      return;
                    }
                    this.l.a(locald, localDialerState, false, false);
                    return;
                  }
                  c(2131493041);
                  return;
                }
                if (!paramIntent.hasExtra("extra_show_account"))
                  break label363;
              }
              while (new textnow.u.q(this).b() == null);
              this.l.a(0);
              return;
              if (paramIntent.hasExtra("extra_show_theme"))
              {
                Parcelable localParcelable = paramIntent.getParcelableExtra("extra_view_state");
                this.l.e();
                this.l.a(new ap(localParcelable));
                return;
              }
              if ((!"android.intent.action.SENDTO".equals(paramIntent.getAction())) && (!"android.intent.action.SEND".equals(paramIntent.getAction())))
                break label566;
              new StringBuilder().append("sms intent received: ").append(paramIntent.getDataString()).toString();
              localUri1 = paramIntent.getData();
              str1 = paramIntent.getStringExtra("android.intent.extra.TEXT");
            }
            while (localUri1 == null);
            String str2 = localUri1.getSchemeSpecificPart();
            if (!TextUtils.isEmpty(str2));
            for (String str3 = textnow.q.b.a(str2.split(",")[0], true); ; str3 = null)
            {
              String str4 = textnow.q.b.b(str3);
              if (str4 != null)
              {
                textnow.u.f localf1 = textnow.u.f.a(getContentResolver(), new String[] { str4 });
                if (localf1 != null)
                {
                  this.l.a(2, localf1, MessageViewFragment.MessageViewState.a, null, str1);
                  return;
                }
              }
              this.l.a(str3, str1);
              return;
              if ((!"android.intent.action.DIAL".equals(paramIntent.getAction())) && (!"android.intent.action.CALL".equals(paramIntent.getAction())) && (!"android.intent.action.VIEW".equals(paramIntent.getAction())) && ((!textnow.q.b.i(this)) || (!"android.intent.action.CALL_EMERGENCY".equals(paramIntent.getAction()))) && (!"android.intent.action.CALL_PRIVILEGED".equals(paramIntent.getAction())))
                break;
              new StringBuilder().append("Intent received: ").append(paramIntent.getDataString()).toString();
              Uri localUri2 = paramIntent.getData();
              if ((localUri2 != null) && (localUri2.toString().startsWith("twitter://callback")))
              {
                if (!ac.a(this, localUri2.getQueryParameter("oauth_verifier")))
                  break;
                new TwitterPostTask(this.h.X()).b(this);
                return;
              }
              if (localUri2 != null)
              {
                String str5 = localUri2.getSchemeSpecificPart();
                if (!TextUtils.isEmpty(str5))
                  str5 = textnow.q.b.e(str5);
                com.enflick.android.TextNow.activities.phone.d.e();
                textnow.u.e locale1 = textnow.u.d.a(this, textnow.u.f.b(this), str5, 2);
                if (locale1 != null);
                for (String str6 = locale1.a; ; str6 = str5)
                {
                  this.l.a(new textnow.u.d(str6, 2, textnow.q.b.f(str6), null, true), null, false, true);
                  return;
                }
              }
              this.l.a(null, null, false, false);
              return;
            }
          }
        }
      }
    }
  }

  public static boolean n()
  {
    return textnow.q.b.b(textnow.q.c.e);
  }

  public final void a(int paramInt, textnow.u.f paramf, MessageViewFragment.MessageViewState paramMessageViewState, w paramw, String paramString)
  {
    this.l.a(2, paramf, paramMessageViewState, paramw, null);
  }

  protected final void a(Bundle paramBundle)
  {
    if (textnow.q.b.l(this));
    textnow.u.d locald;
    do
    {
      do
        return;
      while ((paramBundle == null) || (paramBundle.getBoolean("to_dismiss")));
      String str = paramBundle.getString("callid");
      locald = (textnow.u.d)paramBundle.getSerializable("contact");
      new StringBuilder().append("Showing incoming call dialog for callId ").append(str).append(" and number ").append(locald.a()).toString();
    }
    while (!com.enflick.android.TextNow.activities.phone.d.d());
    this.l.a(locald, null, true, false);
  }

  public final void a(ao paramao)
  {
    this.l.a(paramao);
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    if ((TextUtils.isEmpty(this.h.c())) && (!TextUtils.isEmpty(this.h.m())))
    {
      r();
      AreaCodeActivity.a(this, 20, true);
    }
    label123: textnow.u.n localn;
    label242: 
    do
    {
      Class localClass;
      boolean bool2;
      do
      {
        break label123;
        break label123;
        if (!textnow.q.b.a(this.h.t(), this.h.U()))
          y();
        boolean bool1;
        String str;
        while (true)
        {
          localClass = paramc.getClass();
          bool1 = paramc.h();
          paramc.i();
          str = paramc.j();
          bool2 = c(str);
          if (bool2)
            r();
          if (!this.l.a(paramc, bool2))
            break label242;
          if (textnow.q.a.a);
          return;
          if ((this.h.l()) && (!TextUtils.isEmpty(this.h.m())) && (!TextUtils.isEmpty(this.h.c())))
            break;
          r();
          TextNowApp.b();
          finish();
          WelcomeActivity.a(this);
          return;
          if (((!this.l.a(MessageViewFragment.class)) || (!A())) && (!this.l.a(DialerFragment.class)) && (!this.l.a(j.class)) && (!this.l.a(textnow.n.b.class)))
            z();
        }
        if ((localClass == TwitterPostTask.class) && (!bool2))
        {
          if (!bool1)
          {
            c(2131493218);
            this.h.D("");
            this.h.n();
            return;
          }
          if ("187".equals(str))
          {
            c(2131493222);
            return;
          }
          c(2131493220);
          return;
        }
        if ((localClass == GetUserInfoTask.class) && (!bool2))
        {
          com.enflick.android.TextNow.activities.phone.d.e();
          return;
        }
        if (localClass == ImportSMSTask.class)
        {
          e(true);
          return;
        }
      }
      while ((localClass != GetSubscriptionTask.class) || (bool2));
      localn = new textnow.u.n(this);
    }
    while (!localn.h());
    a(localn.i());
  }

  public final void a(String paramString1, String paramString2)
  {
    this.l.b(paramString1, paramString2);
  }

  public final void a(textnow.u.d paramd)
  {
    a(paramd, false, false);
  }

  public final void a(textnow.u.d paramd, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramd != null)
      new StringBuilder().append("opening dialer with a number:").append(paramd.a()).toString();
    this.l.a(paramd, null, false, paramBoolean2);
  }

  public final void a(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2131165537:
    case 2131165538:
    case 2131165531:
    case 2131165539:
    case 2131165542:
    case 2131165540:
    case 2131165534:
    case 2131165272:
    }
    while (true)
    {
      C();
      return;
      this.l.g();
      continue;
      this.l.d();
      continue;
      this.l.f();
      continue;
      this.l.e();
      continue;
      this.l.a(0);
      continue;
      this.l.a(2);
      continue;
      this.l.h();
    }
  }

  public final void b(String paramString1, String paramString2)
  {
    if (this.p)
      this.o.a(this, paramString1, 1208, this.d, paramString2);
  }

  public final boolean g()
  {
    return this.l instanceof o;
  }

  public final void h()
  {
    this.l.g();
  }

  public final void i()
  {
    this.l.f();
  }

  public final ao j()
  {
    return this.l.l();
  }

  public final int k()
  {
    ao localao = this.l.l();
    if (localao == null)
      return -1;
    return localao.m();
  }

  public final boolean l()
  {
    return (this.p) && (!textnow.q.a.b);
  }

  public final boolean m()
  {
    return (this.q) && (textnow.q.b.a());
  }

  public final boolean o()
  {
    return this.s;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((this.o != null) && (this.o.a(paramInt1, paramInt2, paramIntent)));
    while (textnow.q.l.a(this, paramInt1, paramInt2, paramIntent))
      return;
    if ((paramInt1 == 10) && (paramInt2 == -1) && (paramIntent != null) && (paramIntent.getData() != null) && (paramIntent.getData().toString().startsWith("content://")) && (this.l.a(MessageViewFragment.class)))
    {
      String str2 = textnow.q.g.a(this, paramIntent.getData().toString());
      Uri localUri2 = paramIntent.getData();
      textnow.u.f localf4 = ((MessageViewFragment)this.l.b(MessageViewFragment.class)).e();
      if (localf4 != null)
      {
        Intent localIntent = new Intent(this, WallpaperPreviewActivity.class);
        localIntent.setData(localUri2);
        localIntent.putExtra("conv_id", localf4.a());
        localIntent.putExtra("local_path", str2);
        startActivityForResult(localIntent, 11);
      }
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramInt1 == 11) && (paramInt2 == -1) && (this.l.a(MessageViewFragment.class)))
      {
        MessageViewFragment localMessageViewFragment3 = (MessageViewFragment)this.l.b(MessageViewFragment.class);
        textnow.u.f localf3 = localMessageViewFragment3.e();
        if (localf3 != null)
        {
          File localFile = getFileStreamPath(ad.a(localf3.a()));
          new com.enflick.android.TextNow.tasks.a(this, localf3, localFile.getAbsolutePath(), null, localf3.a()).execute(new Void[0]);
          localMessageViewFragment3.a(localFile.getAbsolutePath(), false);
          supportInvalidateOptionsMenu();
        }
      }
      else if ((paramInt1 == 12) && (paramInt2 == -1) && (this.l.a(MessageViewFragment.class)))
      {
        if (paramIntent != null)
        {
          MessageViewFragment localMessageViewFragment2 = (MessageViewFragment)this.l.b(MessageViewFragment.class);
          textnow.u.f localf2 = localMessageViewFragment2.e();
          if (localf2 != null)
          {
            Uri localUri1 = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (localUri1 != null);
            for (String str1 = localUri1.toString(); ; str1 = "")
            {
              new com.enflick.android.TextNow.tasks.a(this, localf2, null, str1, localf2.a()).execute(new Void[0]);
              localMessageViewFragment2.a(str1);
              return;
            }
          }
        }
      }
      else if ((paramInt1 == 17) && (paramInt2 == -1) && (this.l.a(MessageViewFragment.class)))
      {
        MessageViewFragment localMessageViewFragment1 = (MessageViewFragment)this.l.b(MessageViewFragment.class);
        if (localMessageViewFragment1 != null)
        {
          textnow.u.f localf1 = localMessageViewFragment1.e();
          textnow.u.d locald1 = localMessageViewFragment1.f();
          if (localf1 != null)
          {
            textnow.u.d locald2 = textnow.q.k.a(getContentResolver(), localf1, locald1);
            if (locald2 != null)
            {
              setTitle(locald2.g());
              this.n.removeItem(2131165759);
            }
          }
        }
      }
      else if (paramInt1 == 18)
      {
        if (paramInt2 == -1)
        {
          this.l.e();
          this.l.a(new ap(null));
        }
      }
      else if (paramInt1 == 19)
      {
        if (paramInt2 == -1)
          this.l.a(1, null, MessageViewFragment.MessageViewState.a, null, null);
      }
      else if (paramInt1 == 20)
      {
        finish();
        a(this, true, false);
      }
      else if ((paramInt1 == 1118) && (this.l.a(textnow.n.a.class)))
      {
        ((textnow.n.a)this.l.b(textnow.n.a.class)).b();
      }
      else if ((paramInt1 == 21) && (paramInt2 == -1))
      {
        if (!textnow.q.b.i(this))
          this.h.f(true);
        ad.a(this);
      }
    }
  }

  public void onBackPressed()
  {
    if (B())
      C();
    while (this.l.b())
      return;
    super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if ((s()) && (ad.c(this)) && (!ad.d(this)))
    {
      this.m = true;
      if (this.l.a(MessageViewFragment.class))
      {
        localMessageViewFragment = (MessageViewFragment)this.l.b(MessageViewFragment.class);
        if (localMessageViewFragment.v())
        {
          localMessageViewState2 = localMessageViewFragment.z();
          i = 1;
          localMessageViewState1 = localMessageViewState2;
          localObject = null;
          finish();
          a(this, (textnow.u.f)localObject, localMessageViewState1, i);
        }
      }
    }
    while (!this.l.a(MessageViewFragment.class))
    {
      while (true)
      {
        MessageViewFragment localMessageViewFragment;
        MessageViewFragment.MessageViewState localMessageViewState2;
        int i;
        MessageViewFragment.MessageViewState localMessageViewState1;
        Object localObject;
        return;
        if (localMessageViewFragment.u())
        {
          localMessageViewState1 = MessageViewFragment.MessageViewState.a;
          i = -1;
          localObject = null;
        }
        else
        {
          textnow.u.f localf = localMessageViewFragment.e();
          localMessageViewState1 = localMessageViewFragment.z();
          localObject = localf;
          i = 2;
        }
      }
      if (this.l.a(DialerFragment.class))
      {
        DialerFragment localDialerFragment = (DialerFragment)this.l.b(DialerFragment.class);
        finish();
        a(this, localDialerFragment.e(), localDialerFragment.h());
        return;
      }
      finish();
      a(this, false, false);
      return;
    }
    ((MessageViewFragment)this.l.b(MessageViewFragment.class)).o();
  }

  public void onCreate(Bundle paramBundle)
  {
    if (ad.b(this));
    for (Object localObject = new o(this); ; localObject = new n(this))
    {
      this.l = ((l)localObject);
      super.onCreate(paramBundle);
      if ((this.h.l()) && (!TextUtils.isEmpty(this.h.m())))
        break;
      TextNowApp.b();
      finish();
      WelcomeActivity.a(this);
      return;
    }
    try
    {
      this.t = ((INexage)CustomLoader.newBannerLoader(this, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper").loadWrapper(INexage.class, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper"));
      this.t.init(this.h.q(), this.h.s());
      label119: new Thread(new Runnable()
      {
        public final void run()
        {
          try
          {
            CustomLoader.newVideoLoader(MainActivity.this, "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper");
            return;
          }
          catch (Throwable localThrowable)
          {
          }
        }
      }).start();
      setContentView(this.l.a());
      a(2131165521, 2131165527);
      setTitle(2131493012);
      a(false, true);
      x();
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
      if (getIntent().getBooleanExtra("extra_show_phone_dialog", false))
        if (new Random().nextInt(100) < 50)
          startActivityForResult(new Intent(this, NewNumberAssignedActivity.class), 19);
      while (true)
      {
        this.l.j();
        a(getIntent());
        this.m = false;
        try
        {
          com.enflick.android.TextNow.activities.phone.d.a().j();
          label269: String str1 = this.h.b();
          new GetUserInfoTask(str1).b(this);
          new GetSubscriptionTask(str1).b(this);
          new ReportIdfaTask().b(this);
          new GetSettingsTask().b(this);
          if ((this.h.aa()) && ("ACTIVE".equalsIgnoreCase(new textnow.u.q(this).d())))
            new RefreshContactProxyTask(str1).b(this);
          this.h.c(15000L);
          this.h.n();
          TextNowApp.a().d();
          try
          {
            str2 = new String(textnow.q.b.a(textnow.p.a.a("GSwxNgcFNhonHx8/Bxw9IkEDfi02BSA+NQ8gNBU0QDUDJj4WJh8/DS4mESQQTH0iQn8vMD5/DT4MCwsafg4FPl0dLQ0NJjI9M0wKDgEtVTcbeS0dbSkMDgpfT2NKLCQGPgEFJCg6J14jHD0zWzkgEB0/KB4dVzwZLQ49KFcbPy4BBgI+FjtQPiU0Ig5nERQROwc9bQMoPwc3Nn9dNiN9Xho3KDQEOAhAFiAuGCsaQD8zQBoFHkU6DjVHAlkDMigRPAwIBAcmNTAnIT0yLj1MHyUCPxAtAz0ABhhQAAEfVhIzHzEYJDlCNioSDgciQyQ1GxAeKxk1DjcmGgYcZj0qHCxfLxMgL00vCwUbKhkHHggbZgEoOBkLPDxQDyQUHxg4L0AxJTUcH0pKMRteHBASNxIkXwMjTj0FLFYVJiQSGzhAWGIvEQ0qFUMCUyoNfF9EbSkfN3YHPGROPxgcVjQ7KgpHFFsEHSxXJBYjHzYmNyV6NwAWUSkyHgxBPVQoLiEaOQUsPDUfLjU="), "TextNow".getBytes()));
            this.o = new textnow.p.d(this, str2);
            this.o.a(true);
            if (checkCallingOrSelfPermission("com.android.vending.BILLING") == 0)
              this.o.a(new h()
              {
                public final void a(textnow.p.j paramAnonymousj)
                {
                  if (!paramAnonymousj.b())
                  {
                    new StringBuilder().append("Problem setting up in-app billing: ").append(paramAnonymousj).toString();
                    MainActivity.a(MainActivity.this, false);
                  }
                  do
                  {
                    return;
                    MainActivity.a(MainActivity.this, true);
                  }
                  while (MainActivity.a(MainActivity.this) == null);
                  MainActivity.a(MainActivity.this).a(true, textnow.n.i.a(), MainActivity.this.c);
                }
              });
            this.r = new k(this);
            getContentResolver().registerContentObserver(ContactsContract.AUTHORITY_URI, true, this.r);
            textnow.q.q.a(this).f();
            return;
            showDialog(1);
            continue;
            if ((Build.VERSION.SDK_INT < 19) || (!textnow.q.b.k(this)) || (this.h.Q()) || (textnow.q.b.i(this)))
              continue;
            this.h.f(true);
          }
          catch (textnow.p.b localb)
          {
            while (true)
              String str2 = "";
          }
        }
        catch (com.enflick.android.TextNow.activities.phone.j localj)
        {
          break label269;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      break label119;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if ((paramView instanceof ListView))
    {
      ListView localListView = (ListView)paramView;
      if ((localListView.getAdapter() instanceof HeaderViewListAdapter));
      for (ListAdapter localListAdapter = ((HeaderViewListAdapter)localListView.getAdapter()).getWrappedAdapter(); (localListAdapter instanceof textnow.k.r); localListAdapter = localListView.getAdapter())
      {
        new MenuInflater(this).inflate(2131755016, paramContextMenu);
        return;
      }
      if ((localListAdapter instanceof textnow.k.j))
      {
        new MenuInflater(this).inflate(2131755008, paramContextMenu);
        return;
      }
    }
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  protected Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    case 4:
    default:
      return super.onCreateDialog(paramInt, paramBundle);
    case 1:
      final String str1 = textnow.q.b.f(this.h.c());
      String str2 = getString(2131493113);
      int j = 1 + str2.length();
      int k = j + str1.length();
      SpannableString localSpannableString = new SpannableString(str2 + " " + str1 + "\n\n" + getString(2131493114));
      localSpannableString.setSpan(new TextAppearanceSpan(this, 2131558555), j, k, 18);
      return new AlertDialog.Builder(this).setTitle(2131493016).setMessage(localSpannableString).setCancelable(false).setPositiveButton(2131493017, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          try
          {
            MainActivity localMainActivity1 = MainActivity.this;
            MainActivity localMainActivity2 = MainActivity.this;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = str1;
            textnow.q.l.a(localMainActivity1, localMainActivity2.getString(2131493199, arrayOfObject), "http://www.textnow.com", MainActivity.this.getString(2131493201), MainActivity.this.getString(2131493202), MainActivity.this.b);
            return;
          }
          catch (Throwable localThrowable)
          {
          }
        }
      }).setNegativeButton(2131493018, null).create();
    case 2:
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131493117);
      if (paramBundle.getInt("count") > 1);
      for (int i = 2131493118; ; i = 2131493119)
        return localBuilder.setMessage(i).setCancelable(true).setPositiveButton(2131493017, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            MainActivity.c(MainActivity.this).o();
          }
        }).setNegativeButton(2131493018, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            e locale = (e)MainActivity.c(MainActivity.this).b(e.class);
            if (locale != null)
              locale.i();
          }
        }).create();
    case 3:
      return new AlertDialog.Builder(this).setTitle(2131493139).setMessage(2131493140).setCancelable(true).setPositiveButton(2131493017, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          MessageViewFragment localMessageViewFragment = (MessageViewFragment)MainActivity.c(MainActivity.this).b(MessageViewFragment.class);
          if (localMessageViewFragment != null)
            localMessageViewFragment.r();
        }
      }).setNegativeButton(2131493018, null).create();
    case 5:
    }
    return new AlertDialog.Builder(this).setTitle(2131493374).setMessage(2131493375).setCancelable(true).setPositiveButton(2131493020, null).create();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.l.a(paramMenu);
    this.n = paramMenu;
    return super.onCreateOptionsMenu(paramMenu);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (!this.m)
      textnow.q.q.a(this).e();
    if (this.o != null)
      this.o.a();
    this.o = null;
    if (this.r != null)
      getContentResolver().unregisterContentObserver(this.r);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 25) || (paramInt == 24) || (paramInt == 26)) && (this.l.a(DialerFragment.class)))
      ((DialerFragment)this.l.b(DialerFragment.class)).g();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.l.a(paramIntent);
    a(paramIntent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.l.a(paramMenuItem))
      return true;
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165757:
    }
    textnow.q.b.a(this, textnow.q.d.a);
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    if (this.t != null)
      this.t.pauseNexageSDK();
    try
    {
      com.enflick.android.TextNow.activities.phone.d.a();
      com.enflick.android.TextNow.activities.phone.d.c();
      try
      {
        label32: com.enflick.android.TextNow.activities.phone.d locald = com.enflick.android.TextNow.activities.phone.d.a();
        if (com.enflick.android.TextNow.activities.phone.d.c(locald.y()))
        {
          s locals = locald.p();
          if (locals != null)
            textnow.q.o.a(this).a(locals.b(), System.currentTimeMillis() - (SystemClock.uptimeMillis() - locals.j()));
        }
        return;
      }
      catch (com.enflick.android.TextNow.activities.phone.j localj2)
      {
      }
    }
    catch (com.enflick.android.TextNow.activities.phone.j localj1)
    {
      break label32;
    }
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      super.onPrepareDialog(paramInt, paramDialog, paramBundle);
      return;
    case 2:
    }
    AlertDialog localAlertDialog = (AlertDialog)paramDialog;
    if (paramBundle.getInt("count") > 1);
    for (String str = getString(2131493118); ; str = getString(2131493119))
    {
      localAlertDialog.setMessage(str);
      break;
    }
  }

  protected void onResume()
  {
    try
    {
      com.enflick.android.TextNow.activities.phone.d.a();
      com.enflick.android.TextNow.activities.phone.d.b();
      com.enflick.android.TextNow.activities.phone.d.a().C();
      label13: super.onResume();
      setVolumeControlStream(2);
      textnow.q.o.a(this).b();
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
      this.l.k();
      if (this.t != null)
        this.t.resumeNexageSDK();
      c("POKE");
      if ((ad.b(this)) && ((this.l instanceof n)))
        onConfigurationChanged(getResources().getConfiguration());
      while (true)
      {
        net.hockeyapp.android.b.a(this, "6f37333bdc4907e2030ec685669edf48");
        if (!A())
          f(false);
        return;
        if ((!ad.b(this)) && ((this.l instanceof o)))
          onConfigurationChanged(getResources().getConfiguration());
      }
    }
    catch (com.enflick.android.TextNow.activities.phone.j localj)
    {
      break label13;
    }
  }

  protected void onStart()
  {
    super.onStart();
    new GetGroupsTask().b(this);
  }

  protected void onStop()
  {
    super.onStop();
  }

  public final boolean p()
  {
    return this.l.r();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MainActivity
 * JD-Core Version:    0.6.2
 */