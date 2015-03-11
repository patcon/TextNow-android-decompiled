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
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.support.v4.app.bz;
import android.support.v4.content.m;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.text.util.Linkify;
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
import android.widget.TextView;
import com.appsflyer.AppsFlyerLib;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.phone.DialerFragment;
import com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.Banner;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.INexage;
import com.enflick.android.TextNow.tasks.CheckESNTask;
import com.enflick.android.TextNow.tasks.GetGroupsTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetSubscriptionTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.ImportSMSTask;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import com.enflick.android.TextNow.tasks.RefreshContactProxyTask;
import com.enflick.android.TextNow.tasks.ReportIdfaTask;
import com.enflick.android.TextNow.tasks.SendMessageTask;
import com.enflick.android.TextNow.tasks.UpdateBillingInfoTask;
import com.facebook.FacebookRequestError;
import com.facebook.Request.Callback;
import com.facebook.Response;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import textnow.p.y;
import textnow.u.d;
import textnow.u.e;
import textnow.u.j;
import textnow.v.z;
import textnow.z.u;

public class MainActivity extends au
  implements com.enflick.android.TextNow.views.a
{
  public static Activity a;
  private Dialog A;
  private int B = 0;
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
  textnow.u.i c = new textnow.u.i()
  {
    public final void a(j paramAnonymousj, textnow.u.k paramAnonymousk)
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
          if (textnow.s.i.c(str2))
            localArrayList.add(paramAnonymousk.b(str2));
        }
        textnow.z.l locall = new textnow.z.l(MainActivity.this);
        Iterator localIterator2 = textnow.s.i.a().iterator();
        while (localIterator2.hasNext())
        {
          String str1 = (String)localIterator2.next();
          textnow.u.n localn = paramAnonymousk.a(str1);
          if (localn != null)
            locall.a(str1, localn.a());
        }
        locall.B();
      }
      while ((localArrayList.size() <= 0) || (MainActivity.a(MainActivity.this) == null));
      MainActivity.a(MainActivity.this).a(localArrayList, MainActivity.this.f);
    }
  };
  textnow.u.g d = new textnow.u.g()
  {
    public final void a(j paramAnonymousj, textnow.u.l paramAnonymousl)
    {
      new StringBuilder().append("Purchase finished: ").append(paramAnonymousj).append(", purchase: ").append(paramAnonymousl).toString();
      if (paramAnonymousj.c())
        if ((paramAnonymousj.a() != 1) && (paramAnonymousj.a() != -1005))
          MainActivity.this.b(2131296746);
      do
      {
        do
          return;
        while (!textnow.s.i.c(paramAnonymousl.a()));
        MainActivity.this.a(2131296428, false);
      }
      while (MainActivity.a(MainActivity.this) == null);
      MainActivity.a(MainActivity.this).a(paramAnonymousl, MainActivity.this.e);
    }
  };
  e e = new e()
  {
    public final void a(textnow.u.l paramAnonymousl, j paramAnonymousj)
    {
      new StringBuilder().append("Consumption finished. Purchase: ").append(paramAnonymousl).append(", result: ").append(paramAnonymousj).toString();
      if (paramAnonymousj.b())
      {
        new StringBuilder().append(paramAnonymousl.a()).append(" consumption successful").toString();
        String str1 = paramAnonymousl.a();
        String str2 = paramAnonymousl.c();
        String str3 = paramAnonymousl.d();
        new textnow.s.f(MainActivity.this).a(str1, str2, str3, textnow.s.g.b);
        return;
      }
      new StringBuilder().append(paramAnonymousl.a()).append(": Error while consuming: ").append(paramAnonymousj).toString();
      MainActivity.this.v();
      MainActivity.this.b(2131296746);
    }
  };
  textnow.u.f f = new textnow.u.f()
  {
    public final void a(List<textnow.u.l> paramAnonymousList, List<j> paramAnonymousList1)
    {
      int i = 0;
      if (i < paramAnonymousList.size())
      {
        j localj = (j)paramAnonymousList1.get(i);
        textnow.u.l locall = (textnow.u.l)paramAnonymousList.get(i);
        if (localj.b())
        {
          String str1 = locall.a();
          String str2 = locall.c();
          String str3 = locall.d();
          new StringBuilder().append(locall.a()).append(" consumption successful").toString();
          new textnow.s.f(MainActivity.this).a(str1, str2, str3, textnow.s.g.b);
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
  private q o;
  private boolean p;
  private d q = null;
  private boolean r = false;
  private boolean s = false;
  private p t;
  private boolean u = false;
  private INexage v;
  private textnow.z.s w;
  private long x;
  private int y = 0;
  private Dialog z;

  private void J()
  {
    textnow.z.p localp = new textnow.z.p(this);
    textnow.z.s locals = new textnow.z.s(this);
    Settings.AndroidSettings.Banner[] arrayOfBanner = localp.w();
    int j;
    final Settings.AndroidSettings.Banner localBanner;
    if (arrayOfBanner != null)
    {
      int i = arrayOfBanner.length;
      j = 0;
      if (j < i)
      {
        localBanner = arrayOfBanner[j];
        if ("delinquent".equalsIgnoreCase(localBanner.id))
          if (!"DELINQUENT".equalsIgnoreCase(locals.f()))
            break label162;
      }
    }
    while (true)
    {
      label72: if (localBanner == null)
        break label385;
      a(localBanner, new aq()
      {
        public final void a()
        {
          MainActivity.this.z();
          com.enflick.android.TextNow.ads.b.a("promo_banner_clicked", "id", localBanner.id);
          Intent localIntent;
          if (!TextUtils.isEmpty(localBanner.url))
          {
            String str = localBanner.url;
            localIntent = new Intent("android.intent.action.VIEW");
            localIntent.setData(Uri.parse(str));
          }
          try
          {
            MainActivity.this.startActivity(localIntent);
            do
            {
              return;
              if ("activate".equalsIgnoreCase(localBanner.id))
              {
                MainActivity.this.c(false);
                return;
              }
              if ("delinquent".equalsIgnoreCase(localBanner.id))
              {
                MainActivity.this.l();
                return;
              }
              if ("reactivate".equalsIgnoreCase(localBanner.id))
              {
                MainActivity.c(MainActivity.this).a(1);
                return;
              }
            }
            while (!"data_usage".equalsIgnoreCase(localBanner.id));
            MainActivity.c(MainActivity.this).a(6);
            return;
          }
          catch (Throwable localThrowable)
          {
          }
        }

        public final void b()
        {
          MainActivity localMainActivity = MainActivity.this;
          Settings.AndroidSettings.Banner localBanner1 = localBanner;
          textnow.z.p localp;
          Settings.AndroidSettings.Banner[] arrayOfBanner;
          int i;
          if (localBanner1 != null)
          {
            localp = new textnow.z.p(localMainActivity);
            arrayOfBanner = localp.w();
            i = arrayOfBanner.length;
          }
          for (int j = 0; ; j++)
          {
            if (j < i)
            {
              Settings.AndroidSettings.Banner localBanner2 = arrayOfBanner[j];
              if (!localBanner2.id.equals(localBanner1.id))
                continue;
              localBanner2.lastDismissedTime = System.currentTimeMillis();
              if (localBanner2.firstDismissedTime == 0L)
                localBanner2.firstDismissedTime = localBanner2.lastDismissedTime;
            }
            localp.a(arrayOfBanner);
            localp.B();
            return;
          }
        }
      }
      , "delinquent".equalsIgnoreCase(localBanner.id));
      return;
      int k;
      if (localBanner != null)
      {
        if ((localBanner.lastDismissedTime == 0L) || (localBanner.firstDismissedTime == 0L))
        {
          k = 1;
          label132: if (k != 0)
          {
            if (!"reactivate".equalsIgnoreCase(localBanner.id))
              break label252;
            if ("EXPIRED".equalsIgnoreCase(locals.f()))
              continue;
          }
        }
      }
      else
      {
        label162: label252: int m;
        label278: 
        do
        {
          Plan localPlan;
          do
          {
            do
            {
              j++;
              break;
              if ((System.currentTimeMillis() - localBanner.lastDismissedTime > 1000 * (60 * (60 * (24 * localBanner.interval)))) && ((localBanner.duration == 0) || (System.currentTimeMillis() - localBanner.firstDismissedTime < 1000 * (60 * (60 * (24 * localBanner.duration))))))
              {
                k = 1;
                break label132;
              }
              k = 0;
              break label132;
              if (!"activate".equalsIgnoreCase(localBanner.id))
                break label278;
            }
            while (locals.q() != textnow.z.t.c);
            break label72;
            if (!"data_usage".equalsIgnoreCase(localBanner.id))
              break label72;
            localPlan = locals.c();
          }
          while (localPlan == null);
          m = 100 * locals.e() / localPlan.data;
        }
        while (m < 75);
        String str = localBanner.secondary;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = (String.valueOf(m) + "%");
        localBanner.secondary = String.format(str, arrayOfObject);
        continue;
        localBanner = null;
      }
    }
    label385: y();
  }

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

  public static void a(Activity paramActivity, textnow.z.f paramf, DialerFragment.DialerState paramDialerState)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("extra_show_dialer", true);
    localIntent.putExtra("extra_dialer_contact", paramf);
    localIntent.putExtra("extra_dialer_state", paramDialerState);
    paramActivity.startActivity(localIntent);
  }

  public static void a(Activity paramActivity, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState, int paramInt)
  {
    Intent localIntent = new Intent(paramActivity, MainActivity.class);
    localIntent.addFlags(268435456);
    localIntent.putExtra("extra_msg_view_type", paramInt);
    localIntent.putExtra("extra_selected_convo", paramh);
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
    int j;
    textnow.z.h localh3;
    MessageViewFragment.MessageViewState localMessageViewState2;
    if (paramIntent.hasExtra("extra_msg_view_type"))
    {
      j = paramIntent.getIntExtra("extra_msg_view_type", -1);
      localh3 = (textnow.z.h)paramIntent.getSerializableExtra("extra_selected_convo");
      localMessageViewState2 = (MessageViewFragment.MessageViewState)paramIntent.getParcelableExtra("extra_message_view_state");
      if (localMessageViewState2 != null)
        break label1158;
    }
    label453: label493: label1137: for (MessageViewFragment.MessageViewState localMessageViewState3 = MessageViewFragment.MessageViewState.a; ; localMessageViewState3 = localMessageViewState2)
    {
      String str10;
      int m;
      textnow.z.g localg3;
      if (localh3 == null)
      {
        str10 = paramIntent.getStringExtra("extra_selected_cv");
        if (paramIntent.hasExtra("extra_selected_ct"))
        {
          m = paramIntent.getIntExtra("extra_selected_ct", 2);
          localg3 = textnow.z.f.a(this, textnow.z.h.b(this), str10, m);
          if (localg3 == null)
            break label1151;
        }
      }
      label372: label1151: for (String str11 = localg3.a; ; str11 = str10)
      {
        if (str11 != null);
        for (textnow.z.h localh4 = textnow.z.h.a(getContentResolver(), new String[] { str11 }); ; localh4 = localh3)
        {
          if ((j == 1) || ((localh4 != null) && (j != -1)) || (!(this.o instanceof s)))
            if ((!paramIntent.hasExtra("extra_launched_from_widget")) || (!paramIntent.getBooleanExtra("extra_widget_reply", false)))
              break label1137;
          for (int k = 3; ; k = j)
          {
            this.o.a(k, localh4, localMessageViewState3);
            CharSequence localCharSequence;
            do
            {
              Bundle localBundle;
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        return;
                        m = textnow.z.f.d(str10);
                        break;
                        if (paramIntent.hasExtra("extra_dialer_hangup"))
                          try
                          {
                            com.enflick.android.TextNow.activities.phone.h.a().b(false);
                            textnow.aa.a.a(this).c();
                            return;
                          }
                          catch (com.enflick.android.TextNow.activities.phone.n localn)
                          {
                            return;
                          }
                        if (paramIntent.hasExtra("extra_show_dialer"))
                        {
                          if (com.enflick.android.TextNow.activities.phone.h.d())
                          {
                            if ("widget_action_dialer".equals(paramIntent.getAction()))
                              paramIntent.getExtras().getString("extra_launched_from_widget");
                            DialerFragment.DialerState localDialerState = (DialerFragment.DialerState)paramIntent.getParcelableExtra("extra_dialer_state");
                            textnow.z.f localf = (textnow.z.f)paramIntent.getSerializableExtra("extra_dialer_contact");
                            if (paramIntent.hasExtra("extra_launched_from_widget"))
                            {
                              this.o.a(localf, localDialerState, false, true);
                              return;
                            }
                            this.o.a(localf, localDialerState, false, false);
                            return;
                          }
                          b(2131296448);
                          return;
                        }
                        if (!paramIntent.hasExtra("extra_show_account"))
                          break label372;
                      }
                      while (this.w.c() == null);
                      this.o.a(0);
                      return;
                      if (paramIntent.hasExtra("extra_show_theme"))
                      {
                        Parcelable localParcelable = paramIntent.getParcelableExtra("extra_view_state");
                        this.o.e();
                        this.o.a(new aw(localParcelable));
                        return;
                      }
                      if (!"widget_action_answer".equals(paramIntent.getAction()))
                        break label453;
                    }
                    while (!this.o.a(DialerFragment.class));
                    ((DialerFragment)this.o.l()).i();
                    return;
                    if (!"widget_action_reject".equals(paramIntent.getAction()))
                      break label493;
                  }
                  while (!this.o.a(DialerFragment.class));
                  ((DialerFragment)this.o.l()).j();
                  return;
                  if (("android.intent.action.SENDTO".equals(paramIntent.getAction())) || ("android.intent.action.SEND".equals(paramIntent.getAction())))
                  {
                    new StringBuilder().append("sms intent received: ").append(paramIntent.getDataString()).toString();
                    Uri localUri1 = paramIntent.getData();
                    String str1 = paramIntent.getStringExtra("android.intent.extra.TEXT");
                    MessageViewFragment.MessageViewState localMessageViewState1 = new MessageViewFragment.MessageViewState();
                    localMessageViewState1.b = str1;
                    if (localUri1 != null)
                    {
                      String str2 = localUri1.getSchemeSpecificPart();
                      boolean bool = TextUtils.isEmpty(str2);
                      String str3 = null;
                      if (!bool)
                        str3 = textnow.v.b.a(str2.split(",")[0], true);
                      String str4 = textnow.v.b.b(str3);
                      if (str4 != null)
                      {
                        textnow.z.h localh1 = textnow.z.h.a(getContentResolver(), new String[] { str4 });
                        if (localh1 != null)
                        {
                          this.o.a(2, localh1, localMessageViewState1);
                          return;
                        }
                      }
                      localMessageViewState1.c = new textnow.z.f[] { new textnow.z.f(str4, 2, "", null) };
                      this.o.a(1, null, localMessageViewState1);
                      return;
                    }
                    this.o.a(1, null, localMessageViewState1);
                    return;
                  }
                  if (("android.intent.action.DIAL".equals(paramIntent.getAction())) || ("android.intent.action.CALL".equals(paramIntent.getAction())) || ("android.intent.action.VIEW".equals(paramIntent.getAction())) || ((textnow.v.b.h(this)) && ("android.intent.action.CALL_EMERGENCY".equals(paramIntent.getAction()))) || ("android.intent.action.CALL_PRIVILEGED".equals(paramIntent.getAction())))
                  {
                    new StringBuilder().append("Intent received: ").append(paramIntent.getDataString()).toString();
                    Uri localUri2 = paramIntent.getData();
                    if (localUri2 != null)
                    {
                      String str5 = localUri2.getSchemeSpecificPart();
                      if (!TextUtils.isEmpty(str5))
                        str5 = textnow.v.b.e(str5);
                      com.enflick.android.TextNow.activities.phone.h.e();
                      textnow.z.g localg1 = textnow.z.f.a(this, textnow.z.h.b(this), str5, 2);
                      if (localg1 != null);
                      for (String str6 = localg1.a; ; str6 = str5)
                      {
                        this.o.a(new textnow.z.f(str6, 2, textnow.v.b.f(str6), null, true), null, false, true);
                        return;
                      }
                    }
                    this.o.a(null, null, false, false);
                    return;
                  }
                }
                while ((Build.VERSION.SDK_INT < 16) || (paramIntent.getClipData() == null));
                localBundle = bz.a(paramIntent);
              }
              while (localBundle == null);
              textnow.aa.a.a(this).b();
              localCharSequence = localBundle.getCharSequence("extra_voice_reply");
            }
            while (TextUtils.isEmpty(localCharSequence));
            String str7 = paramIntent.getStringExtra("extra_selected_cv");
            String str8 = paramIntent.getStringExtra("extra_selected_cn");
            int i = textnow.z.f.d(str7);
            textnow.z.g localg2 = textnow.z.f.a(this, textnow.z.h.b(this), str7, i);
            if (localg2 != null)
              str7 = localg2.a;
            textnow.z.h localh2 = textnow.z.h.a(getContentResolver(), new String[] { str7 });
            String str9;
            if (localh2 != null)
              str9 = localh2.h();
            while (true)
            {
              com.enflick.android.TextNow.ads.b.a("wearable", "reply_notification", "");
              new SendMessageTask(this, i, str7, str8, str9, 1, 2, true, localCharSequence.toString(), null).b(this);
              new MarkMessagesReadTask(str7).b(this);
              return;
              Uri localUri3 = textnow.v.k.a(getContentResolver(), str7, i);
              str9 = null;
              if (localUri3 != null)
                str9 = localUri3.toString();
            }
          }
        }
      }
    }
  }

  public static boolean p()
  {
    return textnow.v.b.b(textnow.v.c.f);
  }

  public final void a(int paramInt)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default:
      bool = false;
    case 2131558814:
    case 2131558817:
    case 2131558820:
    case 2131558809:
    case 2131558823:
    case 2131558837:
    case 2131558831:
    case 2131558811:
    case 2131558500:
    case 2131558828:
    case 2131558834:
    case 2131558840:
    }
    while (true)
    {
      if (bool)
        I();
      return;
      bool = this.o.a(f.class);
      this.o.f();
      continue;
      this.o.b(bool);
      continue;
      bool = this.o.a(ae.class);
      this.o.d();
      continue;
      bool = this.o.a(textnow.s.h.class);
      this.o.a(false);
      continue;
      bool = this.o.a(ah.class);
      this.o.e();
      continue;
      bool = this.o.a(com.enflick.android.TextNow.activities.account.a.class);
      this.o.a(0);
      continue;
      bool = this.o.a(com.enflick.android.TextNow.activities.account.k.class);
      this.o.a(2);
      continue;
      bool = this.o.a(ag.class);
      this.o.g();
      continue;
      this.B = paramInt;
    }
  }

  public final void a(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState)
  {
    this.o.a(2, paramh, paramMessageViewState);
  }

  protected final void a(Bundle paramBundle)
  {
    if (textnow.v.b.k(this));
    textnow.z.f localf;
    do
    {
      do
        return;
      while ((paramBundle == null) || (paramBundle.getBoolean("to_dismiss")));
      String str = paramBundle.getString("callid");
      localf = (textnow.z.f)paramBundle.getSerializable("contact");
      new StringBuilder().append("Showing incoming call dialog for callId ").append(str).append(" and number ").append(localf.a()).toString();
    }
    while (!com.enflick.android.TextNow.activities.phone.h.d());
    this.o.a(localf, null, true, false);
  }

  public final void a(av paramav)
  {
    this.o.a(paramav);
  }

  protected final void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    super.a(paramc);
    if ((TextUtils.isEmpty(this.k.c())) && (!TextUtils.isEmpty(this.k.m())))
    {
      v();
      AreaCodeActivity.a(this, 20, true);
    }
    Class localClass;
    boolean bool;
    label119: 
    do
    {
      break label119;
      if (!textnow.v.b.a(this.k.r(), this.k.W()))
        D();
      while (true)
      {
        localClass = paramc.getClass();
        paramc.h();
        paramc.i();
        bool = c(paramc.j());
        if (bool)
          v();
        if (!this.o.a(paramc, bool))
          break label238;
        if (textnow.v.a.a);
        return;
        if ((this.k.l()) && (!TextUtils.isEmpty(this.k.m())) && (!TextUtils.isEmpty(this.k.c())))
          break;
        v();
        TextNowApp.b();
        finish();
        WelcomeActivity.a(this);
        return;
        if (((!this.o.a(MessageViewFragment.class)) || (!F())) && (!this.o.a(DialerFragment.class)) && (!this.o.a(l.class)) && (!this.o.a(textnow.s.b.class)))
          E();
      }
      if ((localClass == GetUserInfoTask.class) && (!bool))
      {
        com.enflick.android.TextNow.activities.phone.h.e();
        G();
        return;
      }
      if (localClass == ImportSMSTask.class)
      {
        h(true);
        return;
      }
      if ((localClass == GetSubscriptionTask.class) && (!bool))
      {
        J();
        G();
        return;
      }
      if ((localClass == UpdateBillingInfoTask.class) && (!bool))
      {
        UpdateBillingInfoTask localUpdateBillingInfoTask = (UpdateBillingInfoTask)paramc;
        v();
        if (localUpdateBillingInfoTask.h())
        {
          if ("NOT_FOUND".equals(localUpdateBillingInfoTask.j()))
          {
            b(2131296847);
            return;
          }
          b(2131296432);
          return;
        }
        if ((this.z != null) && (this.z.isShowing()))
          this.z.dismiss();
        b(2131296849);
        return;
      }
    }
    while ((localClass != GetNewMessagesTask.class) || (bool));
    label238: J();
  }

  public final void a(String paramString1, String paramString2)
  {
    this.o.a(paramString1, paramString2);
  }

  public final void a(textnow.z.f paramf)
  {
    a(paramf, false, false);
  }

  public final void a(textnow.z.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramf != null)
      new StringBuilder().append("opening dialer with a number:").append(paramf.a()).toString();
    this.o.a(paramf, null, false, paramBoolean2);
  }

  public final void a(boolean paramBoolean)
  {
    this.o.b(false);
  }

  public final void b(String paramString1, String paramString2)
  {
    if (this.r)
      this.q.a(this, paramString1, 1208, this.d, paramString2);
  }

  public final void b(boolean paramBoolean)
  {
    this.o.a(true);
  }

  public final void c(boolean paramBoolean)
  {
    Intent localIntent = new Intent(this, ActivateDataActivity.class);
    localIntent.putExtra("extra_show_eli", paramBoolean);
    startActivity(localIntent);
  }

  public final void g()
  {
    super.g();
    switch (this.B)
    {
    default:
    case 2131558828:
    case 2131558834:
    case 2131558840:
    }
    while (true)
    {
      this.B = 0;
      return;
      c(true);
      continue;
      Intent localIntent2 = new Intent("android.intent.action.VIEW");
      localIntent2.addFlags(268435456);
      localIntent2.setData(Uri.parse("https://www.textnow.com/wireless?ref=android"));
      try
      {
        startActivity(localIntent2);
      }
      catch (Throwable localThrowable)
      {
      }
      continue;
      com.enflick.android.TextNow.ads.b.b("share");
      Intent localIntent1 = new Intent();
      localIntent1.setAction("android.intent.action.SEND");
      localIntent1.putExtra("android.intent.extra.TEXT", getString(2131296934));
      localIntent1.setType("text/plain");
      startActivity(Intent.createChooser(localIntent1, getString(2131296933)));
    }
  }

  public final void h()
  {
    super.h();
    if ((!TextUtils.isEmpty(this.w.f())) && (System.currentTimeMillis() - this.x > 5000L))
    {
      new GetSubscriptionTask(this.k.b()).b(this);
      this.x = System.currentTimeMillis();
    }
  }

  public final boolean i()
  {
    return this.o instanceof t;
  }

  public final void j()
  {
    this.o.f();
  }

  public final av k()
  {
    return this.o.l();
  }

  public final void l()
  {
    if (isFinishing())
      return;
    this.z = com.enflick.android.TextNow.activities.account.a.a(this);
    this.z.show();
  }

  public final int m()
  {
    av localav = this.o.l();
    if (localav == null)
      return -1;
    return localav.n();
  }

  public final boolean n()
  {
    return (this.r) && (!textnow.v.a.b);
  }

  public final boolean o()
  {
    return (this.s) && (textnow.v.b.a());
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((this.q != null) && (this.q.a(paramInt1, paramInt2, paramIntent)));
    while (textnow.v.l.a(this, paramInt1, paramInt2, paramIntent))
      return;
    if ((paramInt1 == 10) && (paramInt2 == -1) && (paramIntent != null) && (paramIntent.getData() != null) && (paramIntent.getData().toString().startsWith("content://")) && (this.o.a(MessageViewFragment.class)))
    {
      String str2 = textnow.v.g.a(this, paramIntent.getData().toString());
      Uri localUri2 = paramIntent.getData();
      textnow.z.h localh4 = ((MessageViewFragment)this.o.b(MessageViewFragment.class)).f();
      if (localh4 != null)
      {
        Intent localIntent = new Intent(this, WallpaperPreviewActivity.class);
        localIntent.setData(localUri2);
        localIntent.putExtra("conv_id", localh4.a());
        localIntent.putExtra("local_path", str2);
        startActivityForResult(localIntent, 11);
      }
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      if ((paramInt1 == 11) && (paramInt2 == -1) && (this.o.a(MessageViewFragment.class)))
      {
        MessageViewFragment localMessageViewFragment3 = (MessageViewFragment)this.o.b(MessageViewFragment.class);
        textnow.z.h localh3 = localMessageViewFragment3.f();
        if (localh3 != null)
        {
          File localFile = getFileStreamPath(z.a(localh3.a()));
          new com.enflick.android.TextNow.tasks.a(this, localh3, localFile.getAbsolutePath(), null, null, localh3.a()).execute(new Void[0]);
          localMessageViewFragment3.a(localFile.getAbsolutePath(), false);
          supportInvalidateOptionsMenu();
        }
      }
      else if ((paramInt1 == 12) && (paramInt2 == -1) && (this.o.a(MessageViewFragment.class)))
      {
        if (paramIntent != null)
        {
          MessageViewFragment localMessageViewFragment2 = (MessageViewFragment)this.o.b(MessageViewFragment.class);
          textnow.z.h localh2 = localMessageViewFragment2.f();
          if (localh2 != null)
          {
            Uri localUri1 = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (localUri1 != null);
            for (String str1 = localUri1.toString(); ; str1 = "")
            {
              new com.enflick.android.TextNow.tasks.a(this, localh2, null, str1, null, localh2.a()).execute(new Void[0]);
              localMessageViewFragment2.a(str1);
              return;
            }
          }
        }
      }
      else if ((paramInt1 == 17) && (paramInt2 == -1) && (this.o.a(MessageViewFragment.class)))
      {
        MessageViewFragment localMessageViewFragment1 = (MessageViewFragment)this.o.b(MessageViewFragment.class);
        if (localMessageViewFragment1 != null)
        {
          textnow.z.h localh1 = localMessageViewFragment1.f();
          textnow.z.f localf1 = localMessageViewFragment1.g();
          if (localh1 != null)
          {
            textnow.z.f localf2 = textnow.v.k.a(getContentResolver(), localh1, localf1);
            if (localf2 != null)
            {
              setTitle(localf2.g());
              localMessageViewFragment1.a(localf2);
              invalidateOptionsMenu();
            }
          }
        }
      }
      else if (paramInt1 == 18)
      {
        if (paramInt2 == -1)
        {
          this.o.e();
          this.o.a(new aw(null));
        }
      }
      else if (paramInt1 == 19)
      {
        if (paramInt2 == -1)
          this.o.a(1, null, MessageViewFragment.MessageViewState.a);
      }
      else if (paramInt1 == 20)
      {
        finish();
        a(this, true, false);
      }
      else if ((paramInt1 == 1118) && (this.o.a(textnow.s.a.class)))
      {
        ((textnow.s.a)this.o.b(textnow.s.a.class)).b();
      }
      else if ((paramInt1 == 21) && (paramInt2 == -1))
      {
        if (!textnow.v.b.h(this))
          this.k.f(true);
        z.a(this);
      }
    }
  }

  public void onBackPressed()
  {
    if (H())
      I();
    while (this.o.b())
      return;
    super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if ((w()) && (z.e(this)) && (!z.f(this)))
    {
      this.p = true;
      if (this.o.a(MessageViewFragment.class))
      {
        localMessageViewFragment = (MessageViewFragment)this.o.b(MessageViewFragment.class);
        if (localMessageViewFragment.w())
        {
          localMessageViewState2 = localMessageViewFragment.B();
          i = 1;
          localMessageViewState1 = localMessageViewState2;
          localObject = null;
          finish();
          a(this, (textnow.z.h)localObject, localMessageViewState1, i);
        }
      }
    }
    while (!this.o.a(MessageViewFragment.class))
    {
      while (true)
      {
        MessageViewFragment localMessageViewFragment;
        MessageViewFragment.MessageViewState localMessageViewState2;
        int i;
        MessageViewFragment.MessageViewState localMessageViewState1;
        Object localObject;
        return;
        if (localMessageViewFragment.v())
        {
          localMessageViewState1 = MessageViewFragment.MessageViewState.a;
          i = -1;
          localObject = null;
        }
        else
        {
          textnow.z.h localh = localMessageViewFragment.f();
          localMessageViewState1 = localMessageViewFragment.B();
          localObject = localh;
          i = 2;
        }
      }
      if (this.o.a(DialerFragment.class))
      {
        DialerFragment localDialerFragment = (DialerFragment)this.o.b(DialerFragment.class);
        finish();
        a(this, localDialerFragment.f(), localDialerFragment.k());
        return;
      }
      finish();
      a(this, false, false);
      return;
    }
    ((MessageViewFragment)this.o.b(MessageViewFragment.class)).p();
  }

  public void onCreate(Bundle paramBundle)
  {
    a = this;
    if (z.d(this));
    for (Object localObject = new t(this); ; localObject = new s(this))
    {
      this.o = ((q)localObject);
      super.onCreate(paramBundle);
      if ((this.k.l()) && (!TextUtils.isEmpty(this.k.m())))
        break;
      TextNowApp.b();
      finish();
      WelcomeActivity.a(this);
      return;
    }
    this.w = new textnow.z.s(this);
    try
    {
      this.v = ((INexage)CustomLoader.newBannerLoader(this, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper").loadWrapper(INexage.class, "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper"));
      this.v.init(this.k.o(), this.k.q());
      label135: new Thread(new Runnable()
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
      setContentView(this.o.a());
      a(2131558799, 2131558803);
      setTitle(2131296418);
      a(false, true);
      C();
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
      if (getIntent().getBooleanExtra("extra_show_phone_dialog", false))
        if (new Random().nextInt(100) < 50)
          new Handler().post(new Runnable()
          {
            public final void run()
            {
              MainActivity.this.startActivityForResult(new Intent(MainActivity.this, NewNumberAssignedActivity.class), 19);
            }
          });
      while (true)
      {
        this.o.i();
        a(getIntent());
        this.p = false;
        try
        {
          com.enflick.android.TextNow.activities.phone.h.a().j();
          label287: String str1 = this.k.b();
          new GetUserInfoTask(str1).b(this);
          String str3;
          long l;
          if (textnow.v.b.o(this))
          {
            str3 = textnow.v.b.i(this);
            if (!TextUtils.isEmpty(str3))
            {
              textnow.z.t localt = this.l.q();
              l = this.l.r();
              if (l >= 0L)
                break label735;
              this.l.b(localt);
              this.l.B();
              new StringBuilder().append("schedule next esn check on ").append(new SimpleDateFormat().format(new Date(this.l.r()))).toString();
            }
          }
          label416: new GetSubscriptionTask(str1).b(true).b(this);
          new ReportIdfaTask().b(this);
          if ((this.k.Z()) && ("ACTIVE".equalsIgnoreCase(this.w.f())))
            new RefreshContactProxyTask(str1).b(this);
          this.k.c(15000L);
          this.k.B();
          TextNowApp.a().d();
          try
          {
            str2 = new String(textnow.v.b.a(textnow.u.a.a("GSwxNgcFNhonHx8/Bxw9IkEDfi02BSA+NQ8gNBU0QDUDJj4WJh8/DS4mESQQTH0iQn8vMD5/DT4MCwsafg4FPl0dLQ0NJjI9M0wKDgEtVTcbeS0dbSkMDgpfT2NKLCQGPgEFJCg6J14jHD0zWzkgEB0/KB4dVzwZLQ49KFcbPy4BBgI+FjtQPiU0Ig5nERQROwc9bQMoPwc3Nn9dNiN9Xho3KDQEOAhAFiAuGCsaQD8zQBoFHkU6DjVHAlkDMigRPAwIBAcmNTAnIT0yLj1MHyUCPxAtAz0ABhhQAAEfVhIzHzEYJDlCNioSDgciQyQ1GxAeKxk1DjcmGgYcZj0qHCxfLxMgL00vCwUbKhkHHggbZgEoOBkLPDxQDyQUHxg4L0AxJTUcH0pKMRteHBASNxIkXwMjTj0FLFYVJiQSGzhAWGIvEQ0qFUMCUyoNfF9EbSkfN3YHPGROPxgcVjQ7KgpHFFsEHSxXJBYjHzYmNyV6NwAWUSkyHgxBPVQoLiEaOQUsPDUfLjU="), "TextNow".getBytes()));
            this.q = new d(this, str2);
            this.q.a(true);
            if (checkCallingOrSelfPermission("com.android.vending.BILLING") == 0)
              this.q.a(new textnow.u.h()
              {
                public final void a(j paramAnonymousj)
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
                  MainActivity.a(MainActivity.this).a(true, textnow.s.i.a(), MainActivity.this.c);
                }
              });
            this.t = new p(this);
            getContentResolver().registerContentObserver(ContactsContract.AUTHORITY_URI, true, this.t);
            textnow.v.o.a(this).f();
            AppsFlyerLib.sendTracking(getApplicationContext());
            return;
            showDialog(1);
            continue;
            if (this.k.ag())
            {
              showDialog(6);
              if (this.A != null)
              {
                TextView localTextView = (TextView)this.A.findViewById(16908299);
                if (localTextView != null)
                  localTextView.setMovementMethod(LinkMovementMethod.getInstance());
              }
              this.k.m(false);
              continue;
            }
            if ((Build.VERSION.SDK_INT < 19) || (!textnow.v.b.j(this)) || (this.k.S()) || (textnow.v.b.h(this)))
              continue;
            this.k.f(true);
            continue;
            label735: if (System.currentTimeMillis() < l)
            {
              new StringBuilder().append("skipping, next schedule on ").append(new SimpleDateFormat().format(Long.valueOf(l))).toString();
              break label416;
            }
            new CheckESNTask(str3).b(true).b(this);
          }
          catch (textnow.u.b localb)
          {
            while (true)
              String str2 = "";
          }
        }
        catch (com.enflick.android.TextNow.activities.phone.n localn)
        {
          break label287;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      break label135;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if ((paramView instanceof ListView))
    {
      ListView localListView = (ListView)paramView;
      if ((localListView.getAdapter() instanceof HeaderViewListAdapter));
      for (ListAdapter localListAdapter = ((HeaderViewListAdapter)localListView.getAdapter()).getWrappedAdapter(); (localListAdapter instanceof y); localListAdapter = localListView.getAdapter())
      {
        new MenuInflater(this).inflate(2131755018, paramContextMenu);
        return;
      }
      if ((localListAdapter instanceof textnow.p.o))
      {
        new MenuInflater(this).inflate(2131755010, paramContextMenu);
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
      final String str1 = textnow.v.b.f(this.k.c());
      String str2 = getString(2131296525);
      int j = 1 + str2.length();
      int k = j + str1.length();
      SpannableString localSpannableString2 = new SpannableString(str2 + " " + str1 + "\n\n" + getString(2131296526));
      localSpannableString2.setSpan(new TextAppearanceSpan(this, 2131362052), j, k, 18);
      return new AlertDialog.Builder(this).setTitle(2131296422).setMessage(localSpannableString2).setCancelable(false).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          try
          {
            String str = MainActivity.this.k.b() + "@textnow.me";
            MainActivity localMainActivity1 = MainActivity.this;
            MainActivity localMainActivity2 = MainActivity.this;
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = str1;
            arrayOfObject[1] = str;
            textnow.v.l.a(localMainActivity1, localMainActivity2.getString(2131296941, arrayOfObject), "http://www.textnow.com", MainActivity.this.getString(2131296610), MainActivity.this.getString(2131296611), MainActivity.this.b);
            return;
          }
          catch (Throwable localThrowable)
          {
          }
        }
      }).setNegativeButton(2131296424, null).create();
    case 2:
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131296529);
      if (paramBundle.getInt("count") > 1);
      for (int i = 2131296530; ; i = 2131296531)
        return localBuilder.setMessage(i).setCancelable(true).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            MainActivity.c(MainActivity.this).o();
          }
        }).setNegativeButton(2131296424, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            f localf = (f)MainActivity.c(MainActivity.this).b(f.class);
            if (localf != null)
              localf.i();
          }
        }).create();
    case 3:
      return new AlertDialog.Builder(this).setTitle(2131296551).setMessage(2131296552).setCancelable(true).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          MessageViewFragment localMessageViewFragment = (MessageViewFragment)MainActivity.c(MainActivity.this).b(MessageViewFragment.class);
          if (localMessageViewFragment != null)
            localMessageViewFragment.s();
        }
      }).setNegativeButton(2131296424, null).create();
    case 5:
      return new AlertDialog.Builder(this).setTitle(2131296777).setMessage(2131296778).setCancelable(true).setPositiveButton(2131296427, null).create();
    case 6:
    }
    SpannableString localSpannableString1 = new SpannableString(getString(2131296983));
    Linkify.addLinks(localSpannableString1, 15);
    this.A = new AlertDialog.Builder(this).setTitle(2131296982).setMessage(localSpannableString1).setPositiveButton(2131296427, null).setCancelable(true).create();
    return this.A;
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.o.a(paramMenu);
    return super.onCreateOptionsMenu(paramMenu);
  }

  protected void onDestroy()
  {
    a = null;
    super.onDestroy();
    if (!this.p)
      textnow.v.o.a(this).e();
    if (this.q != null)
      this.q.a();
    this.q = null;
    if (this.t != null)
      getContentResolver().unregisterContentObserver(this.t);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (((paramInt == 25) || (paramInt == 24) || (paramInt == 26)) && (this.o.a(DialerFragment.class)))
      ((DialerFragment)this.o.b(DialerFragment.class)).h();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.o.a(paramIntent);
    a(paramIntent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.o.a(paramMenuItem))
      return true;
    return super.onOptionsItemSelected(paramMenuItem);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.v != null)
      this.v.pauseNexageSDK();
    try
    {
      com.enflick.android.TextNow.activities.phone.h.a();
      com.enflick.android.TextNow.activities.phone.h.c();
      try
      {
        label32: com.enflick.android.TextNow.activities.phone.h localh = com.enflick.android.TextNow.activities.phone.h.a();
        if (com.enflick.android.TextNow.activities.phone.h.c(localh.y()))
        {
          w localw = localh.p();
          if (localw != null)
            textnow.aa.a.a(this).a(localw.b(), System.currentTimeMillis() - (SystemClock.uptimeMillis() - localw.j()));
        }
        return;
      }
      catch (com.enflick.android.TextNow.activities.phone.n localn2)
      {
      }
    }
    catch (com.enflick.android.TextNow.activities.phone.n localn1)
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
    for (String str = getString(2131296530); ; str = getString(2131296531))
    {
      localAlertDialog.setMessage(str);
      break;
    }
  }

  protected void onResume()
  {
    try
    {
      com.enflick.android.TextNow.activities.phone.h.a();
      com.enflick.android.TextNow.activities.phone.h.b();
      com.enflick.android.TextNow.activities.phone.h.a().C();
      label13: super.onResume();
      setVolumeControlStream(0);
      textnow.aa.a.a(this).b();
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
      this.o.j();
      if (this.v != null)
        this.v.resumeNexageSDK();
      c("POKE");
      if ((z.d(this)) && ((this.o instanceof s)))
        onConfigurationChanged(getResources().getConfiguration());
      while (true)
      {
        net.hockeyapp.android.b.a(this, "6f37333bdc4907e2030ec685669edf48");
        if (!F())
          i(false);
        m.a(this).a(new Intent("quickreply_action_finish"));
        return;
        if ((!z.d(this)) && ((this.o instanceof t)))
          onConfigurationChanged(getResources().getConfiguration());
      }
    }
    catch (com.enflick.android.TextNow.activities.phone.n localn)
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

  public final boolean q()
  {
    return this.o.r();
  }

  public final void r()
  {
    this.o.h();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MainActivity
 * JD-Core Version:    0.6.2
 */