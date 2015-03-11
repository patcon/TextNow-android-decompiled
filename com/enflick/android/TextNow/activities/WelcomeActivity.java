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
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.enflick.android.TextNow.tasks.FacebookSessionTask;
import com.enflick.android.TextNow.tasks.GetIsPaidUserTask;
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
import textnow.v.a;
import textnow.v.l;
import textnow.v.x;
import textnow.z.h;
import textnow.z.p;
import textnow.z.q;
import textnow.z.u;

public class WelcomeActivity extends ao
  implements View.OnClickListener, View.OnLongClickListener
{
  private q a = q.c;
  private Button b;
  private Button c;
  private Button d;
  private Button e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private LinearLayout n;
  private View o;
  private boolean p;
  private String q;
  private boolean r;
  private boolean s;

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
      new ax(this, paramBoolean).execute(new Void[0]);
      return;
    }
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        new ax(WelcomeActivity.this, paramBoolean).execute(new Void[0]);
      }
    });
  }

  private void c(String paramString)
  {
    switch (6.a[this.a.ordinal()])
    {
    default:
      x.a = "https://api.textnow.me/api2.0/";
      x.b = "https://media.enflick.com/";
      return;
    case 1:
      x.a = "https://tntest.textnow.me/api2.0/";
      x.b = "http://media-sandbox.enflick.com/";
      return;
    case 2:
      x.a = "https://tnstage.textnow.me/api2.0/";
      x.b = "http://media-sandbox.enflick.com/";
      return;
    case 3:
    }
    x.a = paramString;
    x.b = "http://media-sandbox.enflick.com/";
  }

  private void g()
  {
    a(2131296447, false);
    l.a(this, new Session.StatusCallback()
    {
      public final void call(Session paramAnonymousSession, SessionState paramAnonymousSessionState, Exception paramAnonymousException)
      {
        WelcomeActivity.this.v();
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
          WelcomeActivity.this.b(2131296432);
          return;
        }
        while (paramAnonymousException == null);
        WelcomeActivity.this.b(2131296432);
      }
    }
    , Arrays.asList(new String[] { "public_profile", "user_birthday", "email" }), false);
  }

  private boolean h()
  {
    String str = this.k.b();
    if ((TextUtils.isEmpty(str)) || (!this.k.l()) || (TextUtils.isEmpty(this.k.m())))
    {
      new StringBuilder().append("Not doing anything, username: ").append(str).append(" signed in: ").append(this.k.l()).append(" sessionId: ").append(this.k.m()).toString();
      a(false);
      return false;
    }
    if (this.k.n())
      return i();
    a(2131296428, false);
    new GetNewMessagesTask().b(this);
    return false;
  }

  private boolean i()
  {
    if (TextUtils.isEmpty(this.k.c()))
    {
      new GetUserInfoTask(this.k.b()).b(this);
      return false;
    }
    finish();
    overridePendingTransition(0, 0);
    if (this.r)
      MainActivity.a(this);
    while (true)
    {
      return true;
      if (this.s)
      {
        MainActivity.a(this, null, null);
      }
      else if (this.q != null)
      {
        ContentResolver localContentResolver = getContentResolver();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.q;
        h localh = h.a(localContentResolver, arrayOfString);
        if (localh != null)
          MainActivity.a(this, localh, MessageViewFragment.MessageViewState.a, 2);
      }
      else
      {
        MainActivity.a(this, false, this.p);
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
      v();
      if (bool);
    }
    label46: int j;
    do
    {
      do
      {
        do
        {
          do
          {
            i();
            break label46;
            break label46;
            do
              return;
            while ("NO_NETWORK".equals(str));
            if ("DB_ERROR".equals(str))
            {
              c(2131296942);
              return;
            }
            c(2131296490);
            return;
            if (localClass != GetUserInfoTask.class)
              break;
            v();
            if (!bool)
            {
              if (TextUtils.isEmpty(this.k.c()))
              {
                AreaCodeActivity.a(this, 2, true);
                return;
              }
              finish();
              if (this.r)
              {
                MainActivity.a(this);
                return;
              }
              if (this.s)
              {
                MainActivity.a(this, null, null);
                return;
              }
              MainActivity.a(this, false, this.p);
              return;
            }
          }
          while ("NO_NETWORK".equals(str));
          b(2131296491);
          return;
          if (localClass != FacebookSessionTask.class)
            break;
          v();
          if (!bool)
          {
            com.enflick.android.TextNow.ads.b.a("fb_sign_in", "type", "existing");
            h();
            return;
          }
          if (i == 404)
          {
            com.enflick.android.TextNow.ads.b.a("fb_sign_in", "type", "new");
            new UsernameSuggestionsTask(l.a.getUsername(), l.a.getFirstName(), l.a.getLastName()).b(this);
            return;
          }
        }
        while ("NO_NETWORK".equals(str));
        b(2131296432);
        return;
        if (localClass == UsernameSuggestionsTask.class)
        {
          if (!bool)
          {
            l.b = str;
            new StringBuilder().append("Generated name: ").append(str).toString();
            AreaCodeUsernameActivity.a(this, 3);
            return;
          }
          b(2131296432);
          return;
        }
      }
      while (localClass != GetIsPaidUserTask.class);
      j = this.k.af();
    }
    while ((bool) || (j == -1));
    if (j == 1)
    {
      this.c.setVisibility(8);
      return;
    }
    this.c.setVisibility(0);
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
          if (TextUtils.isEmpty(this.k.c()))
          {
            AreaCodeActivity.a(this, 2, true);
            return;
          }
          MainActivity.a(this, false, this.p);
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
          MainActivity.a(this, true, this.p);
          finish();
          return;
        }
      }
      while (paramInt1 != 3);
      MainActivity.a(this, true, this.p);
      finish();
      return;
    }
    while (paramInt1 != 2);
    finish();
  }

  public void onClick(View paramView)
  {
    if (paramView == this.c)
    {
      startActivityForResult(new Intent(this, CreateAccountActivity.class), 1);
      com.enflick.android.TextNow.ads.b.b("press_create_account");
    }
    do
    {
      return;
      if (paramView == this.b)
      {
        startActivityForResult(new Intent(this, SignInActivity.class), 0);
        com.enflick.android.TextNow.ads.b.b("press_sign_in");
        return;
      }
      if (paramView == this.d)
      {
        g();
        com.enflick.android.TextNow.ads.b.b("press_fb_sign_in");
        return;
      }
    }
    while (paramView != this.e);
    this.f.setVisibility(0);
    this.n.setVisibility(0);
    this.h.setVisibility(8);
    this.g.setVisibility(8);
    a(true);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    this.p = getIntent().getBooleanExtra("extra_from_notification", false);
    this.q = getIntent().getStringExtra("extra_notification_contact_value");
    this.r = getIntent().getBooleanExtra("extra_show_account", false);
    this.s = getIntent().getBooleanExtra("extra_show_dialer", false);
    p localp = new p(this);
    this.a = localp.x();
    c(localp.y());
    if (h())
      return;
    setContentView(2130903219);
    this.f = ((LinearLayout)findViewById(2131559018));
    if (Build.MODEL.equals("BNRV200"))
    {
      this.g = ((LinearLayout)findViewById(2131559030));
      this.b = ((Button)findViewById(2131559032));
      this.c = ((Button)findViewById(2131559031));
    }
    while (true)
    {
      this.h = ((LinearLayout)findViewById(2131559021));
      this.n = ((LinearLayout)findViewById(2131559023));
      this.o = findViewById(2131559027);
      this.b.setOnClickListener(this);
      if (a.a)
        this.b.setOnLongClickListener(this);
      this.c.setOnClickListener(this);
      this.e = ((Button)findViewById(2131559022));
      this.e.setOnClickListener(this);
      this.f.setVisibility(8);
      this.n.setVisibility(8);
      this.h.setVisibility(8);
      this.g.setVisibility(8);
      a(getIntent());
      this.c.setVisibility(8);
      if (textnow.v.b.h(this))
        break;
      this.c.setVisibility(0);
      return;
      this.g = ((LinearLayout)findViewById(2131559024));
      this.b = ((Button)findViewById(2131559028));
      this.c = ((Button)findViewById(2131559029));
      this.d = ((Button)findViewById(2131559025));
      this.d.setOnClickListener(this);
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
    View localView = LayoutInflater.from(this).inflate(2130903201, null);
    final EditText localEditText = (EditText)localView.findViewById(2131558956);
    localEditText.setVisibility(8);
    ((RadioGroup)localView.findViewById(2131558951)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        case 2131558954:
        default:
          WelcomeActivity.a(WelcomeActivity.this, q.c);
          localEditText.setVisibility(8);
          return;
        case 2131558952:
          WelcomeActivity.a(WelcomeActivity.this, q.a);
          localEditText.setVisibility(8);
          return;
        case 2131558953:
          WelcomeActivity.a(WelcomeActivity.this, q.b);
          localEditText.setVisibility(8);
          return;
        case 2131558955:
        }
        WelcomeActivity.a(WelcomeActivity.this, q.d);
        localEditText.setVisibility(0);
        localEditText.setText(x.a);
      }
    });
    return new AlertDialog.Builder(this).setTitle("Choose Server").setView(localView).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        WelcomeActivity.a(WelcomeActivity.this, localEditText.getText().toString());
        p localp = new p(WelcomeActivity.this);
        localp.a(WelcomeActivity.c(WelcomeActivity.this), localEditText.getText().toString().trim().toLowerCase());
        localp.B();
      }
    }).setNegativeButton(2131296425, null).create();
  }

  public boolean onLongClick(View paramView)
  {
    if (paramView == this.b)
    {
      if (a.a)
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
      RadioGroup localRadioGroup = (RadioGroup)paramDialog.findViewById(2131558951);
      int i = 2131558955;
      if (x.a.equals("https://tnstage.textnow.me/api2.0/"))
        i = 2131558953;
      while (true)
      {
        localRadioGroup.check(i);
        return;
        if (x.a.equals("https://api.textnow.me/api2.0/"))
          i = 2131558954;
        else if (x.a.equals("https://tntest.textnow.me/api2.0/"))
          i = 2131558952;
      }
    }
    super.onPrepareDialog(paramInt, paramDialog, paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    if (this.k.X())
    {
      com.enflick.android.TextNow.ads.b.b("new_user_start");
      this.k.h(false);
      this.k.B();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.WelcomeActivity
 * JD-Core Version:    0.6.2
 */