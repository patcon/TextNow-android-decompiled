package com.enflick.android.TextNow.activities;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.enflick.android.TextNow.tasks.FacebookSessionTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.UsernameSuggestionsTask;
import com.enflick.android.TextNow.tasks.c;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Request.GraphUserCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;
import java.util.Arrays;
import textnow.q.aa;
import textnow.q.b;
import textnow.q.l;
import textnow.u.f;
import textnow.u.n;
import textnow.u.o;
import textnow.u.r;

public class WelcomeActivity extends ai
  implements View.OnClickListener, View.OnLongClickListener
{
  private o b = o.c;
  private Button c;
  private Button d;
  private Button e;
  private Button f;
  private LinearLayout g;
  private LinearLayout k;
  private LinearLayout l;
  private LinearLayout m;
  private ImageView n;
  private ImageView o;
  private TextView p;
  private TextView q;
  private Button r;
  private Button s;
  private TextView t;
  private View u;
  private boolean v;
  private String w;
  private boolean x;
  private boolean y;

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, WelcomeActivity.class);
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
    paramContext.sendBroadcast(new Intent("com.enflick.android.TextNow.widget.WIDGET_LOGIN_CHANGE"));
  }

  private void a(Intent paramIntent)
  {
    if ("action_create_account".equals(paramIntent.getAction()))
      startActivityForResult(new Intent(this, CreateAccountActivity.class), 1);
    do
    {
      return;
      if ("action_login_standard".equals(paramIntent.getAction()))
      {
        startActivityForResult(new Intent(this, SignInActivity.class), 0);
        return;
      }
    }
    while (!"action_login_facebook".equals(paramIntent.getAction()));
    g();
  }

  private void a(final boolean paramBoolean)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      new aq(this, paramBoolean).execute(new Void[0]);
      return;
    }
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        new aq(WelcomeActivity.this, paramBoolean).execute(new Void[0]);
      }
    });
  }

  private void c(String paramString)
  {
    switch (6.a[this.b.ordinal()])
    {
    default:
      aa.a = "https://api.textnow.me/api2.0/";
      aa.b = "https://media.enflick.com/";
      return;
    case 1:
      aa.a = "https://tntest.textnow.me/api2.0/";
      aa.b = "http://media-sandbox.enflick.com/";
      return;
    case 2:
      aa.a = "https://tnstage.textnow.me/api2.0/";
      aa.b = "http://media-sandbox.enflick.com/";
      return;
    case 3:
    }
    aa.a = paramString;
    aa.b = "http://media-sandbox.enflick.com/";
  }

  private void g()
  {
    a(2131493040, false);
    l.a(this, new Session.StatusCallback()
    {
      public final void call(Session paramAnonymousSession, SessionState paramAnonymousSessionState, Exception paramAnonymousException)
      {
        WelcomeActivity.this.r();
        if (paramAnonymousSession.isOpened())
          WelcomeActivity.a(WelcomeActivity.this, paramAnonymousSession);
        do
        {
          do
          {
            return;
            if (paramAnonymousSessionState != SessionState.CLOSED_LOGIN_FAILED)
              break;
          }
          while (((paramAnonymousException instanceof FacebookOperationCanceledException)) || ((paramAnonymousException != null) && ("Log in attempt aborted.".equals(paramAnonymousException.getMessage()))));
          WelcomeActivity.this.c(2131493025);
          return;
        }
        while (paramAnonymousException == null);
        WelcomeActivity.this.c(2131493025);
      }
    }
    , Arrays.asList(new String[] { "user_birthday", "email" }), false);
  }

  private boolean h()
  {
    String str = this.h.b();
    if ((TextUtils.isEmpty(str)) || (!this.h.l()) || (TextUtils.isEmpty(this.h.m())))
    {
      new StringBuilder().append("Not doing anything, username: ").append(str).append(" signed in: ").append(this.h.l()).append(" sessionId: ").append(this.h.m()).toString();
      a(false);
      return false;
    }
    if (this.h.p())
      return i();
    a(2131493021, false);
    new GetNewMessagesTask().b(this);
    return false;
  }

  private boolean i()
  {
    if (TextUtils.isEmpty(this.h.c()))
    {
      new GetUserInfoTask(this.h.b()).b(this);
      return false;
    }
    finish();
    overridePendingTransition(0, 0);
    if (this.x)
      MainActivity.a(this);
    while (true)
    {
      return true;
      if (this.y)
      {
        MainActivity.a(this, null, null);
      }
      else if (this.w != null)
      {
        ContentResolver localContentResolver = getContentResolver();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.w;
        f localf = f.a(localContentResolver, arrayOfString);
        if (localf != null)
          MainActivity.a(this, localf, MessageViewFragment.MessageViewState.a, 2);
      }
      else
      {
        MainActivity.a(this, false, this.v);
      }
    }
  }

  protected final void a(c paramc)
  {
    super.a(paramc);
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str = paramc.j();
    if (localClass == GetNewMessagesTask.class)
    {
      r();
      if (bool);
    }
    label47: 
    do
    {
      do
      {
        do
        {
          i();
          break label47;
          do
            return;
          while ("NO_NETWORK".equals(str));
          c(2131493083);
          return;
          if (localClass != GetUserInfoTask.class)
            break;
          r();
          if (!bool)
          {
            if (TextUtils.isEmpty(this.h.c()))
            {
              AreaCodeActivity.a(this, 2, true);
              return;
            }
            finish();
            if (this.x)
            {
              MainActivity.a(this);
              return;
            }
            if (this.y)
            {
              MainActivity.a(this, null, null);
              return;
            }
            MainActivity.a(this, false, this.v);
            return;
          }
        }
        while ("NO_NETWORK".equals(str));
        c(2131493084);
        return;
        if (localClass != FacebookSessionTask.class)
          break;
        r();
        if (!bool)
        {
          com.enflick.android.TextNow.ads.a.a("fb_sign_in", "type", "existing");
          h();
          return;
        }
        if (i == 404)
        {
          com.enflick.android.TextNow.ads.a.a("fb_sign_in", "type", "new");
          new UsernameSuggestionsTask(l.a.getUsername(), l.a.getFirstName(), l.a.getLastName()).b(this);
          return;
        }
      }
      while ("NO_NETWORK".equals(str));
      c(2131493025);
      return;
    }
    while (localClass != UsernameSuggestionsTask.class);
    if (!bool)
    {
      l.b = str;
      new StringBuilder().append("Generated name: ").append(str).toString();
      AreaCodeUsernameActivity.a(this, 3);
      return;
    }
    c(2131493025);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    l.a(this, paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    case -1:
    case 0:
    }
    do
    {
      do
      {
        return;
        if (paramInt1 == 0)
        {
          if (TextUtils.isEmpty(this.h.c()))
          {
            AreaCodeActivity.a(this, 2, true);
            return;
          }
          MainActivity.a(this, false, this.v);
          finish();
          return;
        }
        if (paramInt1 == 1)
        {
          AreaCodeActivity.a(this, 2, false);
          return;
        }
        if (paramInt1 == 2)
        {
          MainActivity.a(this, true, this.v);
          finish();
          return;
        }
      }
      while (paramInt1 != 3);
      MainActivity.a(this, true, this.v);
      finish();
      return;
    }
    while (paramInt1 != 2);
    finish();
  }

  public void onClick(View paramView)
  {
    if ((paramView == this.d) || (paramView == this.r) || (paramView == this.s))
    {
      startActivityForResult(new Intent(this, CreateAccountActivity.class), 1);
      com.enflick.android.TextNow.ads.a.b("press_create_account");
    }
    do
    {
      return;
      if ((paramView == this.c) || (paramView == this.t))
      {
        startActivityForResult(new Intent(this, SignInActivity.class), 0);
        com.enflick.android.TextNow.ads.a.b("press_sign_in");
        return;
      }
      if (paramView == this.e)
      {
        g();
        com.enflick.android.TextNow.ads.a.b("press_fb_sign_in");
        return;
      }
    }
    while (paramView != this.f);
    this.g.setVisibility(0);
    this.m.setVisibility(0);
    this.l.setVisibility(8);
    this.k.setVisibility(8);
    a(true);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.v = getIntent().getBooleanExtra("extra_from_notification", false);
    this.w = getIntent().getStringExtra("extra_notification_contact_value");
    this.x = getIntent().getBooleanExtra("extra_show_account", false);
    this.y = getIntent().getBooleanExtra("extra_show_dialer", false);
    n localn = new n(this);
    this.b = localn.j();
    c(localn.k());
    if (h())
      return;
    requestWindowFeature(1);
    setContentView(2130903203);
    this.g = ((LinearLayout)findViewById(2131165718));
    if (Build.MODEL.equals("BNRV200"))
    {
      this.k = ((LinearLayout)findViewById(2131165735));
      this.c = ((Button)findViewById(2131165737));
      this.d = ((Button)findViewById(2131165736));
    }
    while (true)
    {
      this.l = ((LinearLayout)findViewById(2131165724));
      this.m = ((LinearLayout)findViewById(2131165726));
      this.o = ((ImageView)findViewById(2131165720));
      this.n = ((ImageView)findViewById(2131165719));
      this.q = ((TextView)findViewById(2131165723));
      this.p = ((TextView)findViewById(2131165721));
      this.r = ((Button)findViewById(2131165728));
      this.s = ((Button)findViewById(2131165730));
      this.t = ((TextView)findViewById(2131165731));
      this.u = findViewById(2131165732);
      this.c.setOnClickListener(this);
      if (textnow.q.a.a)
      {
        this.c.setOnLongClickListener(this);
        this.t.setOnLongClickListener(this);
      }
      this.d.setOnClickListener(this);
      this.f = ((Button)findViewById(2131165725));
      this.f.setOnClickListener(this);
      this.g.setVisibility(8);
      this.m.setVisibility(8);
      this.l.setVisibility(8);
      this.k.setVisibility(8);
      a(getIntent());
      if (!b.i(this))
        break;
      this.d.setVisibility(8);
      this.r.setVisibility(8);
      this.s.setVisibility(8);
      return;
      this.k = ((LinearLayout)findViewById(2131165727));
      this.c = ((Button)findViewById(2131165733));
      this.d = ((Button)findViewById(2131165734));
      this.e = ((Button)findViewById(2131165729));
      this.e.setOnClickListener(this);
    }
  }

  protected Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt, paramBundle);
    case 2:
    }
    View localView = LayoutInflater.from(this).inflate(2130903183, null);
    final EditText localEditText = (EditText)localView.findViewById(2131165654);
    localEditText.setVisibility(8);
    ((RadioGroup)localView.findViewById(2131165649)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        case 2131165652:
        default:
          WelcomeActivity.a(WelcomeActivity.this, o.c);
          localEditText.setVisibility(8);
          return;
        case 2131165650:
          WelcomeActivity.a(WelcomeActivity.this, o.a);
          localEditText.setVisibility(8);
          return;
        case 2131165651:
          WelcomeActivity.a(WelcomeActivity.this, o.b);
          localEditText.setVisibility(8);
          return;
        case 2131165653:
        }
        WelcomeActivity.a(WelcomeActivity.this, o.d);
        localEditText.setVisibility(0);
        localEditText.setText(aa.a);
      }
    });
    return new AlertDialog.Builder(this).setTitle("Choose Server").setView(localView).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        WelcomeActivity.a(WelcomeActivity.this, localEditText.getText().toString());
        n localn = new n(WelcomeActivity.this);
        localn.a(WelcomeActivity.c(WelcomeActivity.this), localEditText.getText().toString().trim().toLowerCase());
        localn.n();
      }
    }).setNegativeButton(2131493019, null).create();
  }

  public boolean onLongClick(View paramView)
  {
    if ((paramView == this.c) || (paramView == this.t))
    {
      if (textnow.q.a.a)
        showDialog(2);
      return true;
    }
    return false;
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog, Bundle paramBundle)
  {
    super.onPrepareDialog(paramInt, paramDialog, paramBundle);
    if (paramInt == 2)
    {
      RadioGroup localRadioGroup = (RadioGroup)paramDialog.findViewById(2131165649);
      int i = 2131165653;
      if (aa.a.equals("https://tnstage.textnow.me/api2.0/"))
        i = 2131165651;
      while (true)
      {
        localRadioGroup.check(i);
        return;
        if (aa.a.equals("https://api.textnow.me/api2.0/"))
          i = 2131165652;
        else if (aa.a.equals("https://tntest.textnow.me/api2.0/"))
          i = 2131165650;
      }
    }
    super.onPrepareDialog(paramInt, paramDialog, paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    if (this.h.Y())
    {
      com.enflick.android.TextNow.ads.a.b("new_user_start");
      this.h.h(false);
      this.h.n();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.WelcomeActivity
 * JD-Core Version:    0.6.2
 */