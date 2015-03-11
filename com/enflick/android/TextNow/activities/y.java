package com.enflick.android.TextNow.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.preferences.SelectablePreference;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.ReleasePhoneNumberTask;
import com.enflick.android.TextNow.tasks.SendEmailVerificationTask;
import com.enflick.android.TextNow.tasks.UpdateUserInfoPasswordTask;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import com.enflick.android.TextNow.tasks.c;
import textnow.q.ac;
import textnow.q.ad;
import textnow.q.b;
import textnow.q.l;
import textnow.u.r;

public class y extends w
{
  @SuppressLint({"NewApi"})
  private void a()
  {
    this.a.findViewById(2131165597).setVisibility(0);
    TextView localTextView1 = (TextView)this.a.findViewById(2131165598);
    TextView localTextView2 = (TextView)this.a.findViewById(2131165599);
    if (this.b == 1)
    {
      str2 = b.f(this.c.c());
      localTextView1.setText(str2);
      if (Build.VERSION.SDK_INT >= 11)
        localTextView1.setTextIsSelectable(true);
      localTextView2.setText(2131493196);
      a("settings_phone_facebook").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          a.b("share_number_fb");
          MainActivity localMainActivity = y.this.e;
          y localy = y.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = str2;
          l.a(localMainActivity, localy.getString(2131493199, arrayOfObject), "http://www.textnow.com", y.this.getString(2131493201), y.this.getString(2131493202), y.this.e.b);
          return true;
        }
      });
      a("settings_phone_twitter").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          a.b("share_number_twitter");
          MainActivity localMainActivity = y.this.e;
          y localy = y.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = str2;
          ac.a(localMainActivity, localy.getString(2131493200, arrayOfObject));
          return true;
        }
      });
    }
    while (this.b != 2)
    {
      final String str2;
      return;
    }
    final String str1 = this.c.b() + "@textnow.me";
    localTextView1.setText(str1);
    if (Build.VERSION.SDK_INT >= 11)
      localTextView1.setTextIsSelectable(true);
    localTextView2.setText(2131493182);
    a("settings_username_facebook").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        a.b("share_tn_email_fb");
        MainActivity localMainActivity = y.this.e;
        y localy = y.this;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = str1;
        l.a(localMainActivity, localy.getString(2131493185, arrayOfObject), "http://www.textnow.com", y.this.getString(2131493201), y.this.getString(2131493202), y.this.e.b);
        return true;
      }
    });
    a("settings_username_twitter").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        a.b("share_tn_email_twitter");
        MainActivity localMainActivity = y.this.e;
        y localy = y.this;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = str1;
        ac.a(localMainActivity, localy.getString(2131493186, arrayOfObject));
        return true;
      }
    });
  }

  private void a(boolean paramBoolean1, int paramInt, String paramString, boolean paramBoolean2)
  {
    this.e.r();
    for (int i = 0; i < c().getPreferenceCount(); i++)
      a(c().getPreference(i), paramBoolean1, paramInt, paramString);
    if (paramBoolean1)
    {
      this.c = new r(this.e);
      if (this.e.s())
      {
        if (!paramBoolean2)
          break label88;
        this.e.c(2131493026);
      }
    }
    return;
    label88: if ("EMAIL_ADDRESS_IN_USE".equals(paramString))
    {
      this.e.c(2131493073);
      return;
    }
    if ("PERMISSION_DENIED".equals(paramString))
    {
      this.e.c(2131493212);
      return;
    }
    this.e.c(2131493213);
  }

  public static y c(int paramInt)
  {
    y localy = new y();
    localy.a(paramInt);
    return localy;
  }

  protected final void a(Preference paramPreference, String paramString)
  {
    super.a(paramPreference, paramString);
    if ((paramPreference instanceof Preference))
    {
      String str;
      try
      {
        str = paramPreference.getKey();
        if ("userinfo_username".equals(str))
        {
          paramPreference.setSummary(paramPreference.getSharedPreferences().getString(str, "") + "@textnow.me");
          return;
        }
        if ("userinfo_phone".equals(str))
        {
          paramPreference.setSummary(b.f(paramPreference.getSharedPreferences().getString(str, "")));
          return;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        new StringBuilder().append("Key doesn't contain a string: ").append(paramPreference.getKey()).toString();
        return;
      }
      if ("userinfo_email".equals(str))
        paramPreference.setSummary(paramPreference.getSharedPreferences().getString(paramPreference.getKey(), ""));
    }
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str1 = paramc.j();
    if (localClass == UpdateUserInfoTask.class)
    {
      a(bool, i, str1, paramBoolean);
      return true;
    }
    if (localClass == UpdateUserInfoPasswordTask.class)
    {
      a(bool, i, str1, paramBoolean);
      return true;
    }
    if (localClass == SendEmailVerificationTask.class)
    {
      this.e.r();
      if (this.e.s())
      {
        if (!paramBoolean)
          break label99;
        this.e.c(2131493026);
      }
      while (true)
      {
        return true;
        label99: if (bool)
          this.e.c(2131493216);
        else
          this.e.c(2131493207);
      }
    }
    if (localClass == ReleasePhoneNumberTask.class)
    {
      this.e.r();
      if (bool)
        if (this.e.s())
        {
          if (!paramBoolean)
            break label171;
          this.e.c(2131493026);
        }
      while (true)
      {
        return true;
        label171: String str2 = getString(2131493195);
        if ((str1 != null) && ("PHONE_NUMBER_UNREGISTRATION_THRESHOLD_EXCEEDED".equals(str1)))
          str2 = getString(2131493194);
        this.e.a(str2);
        continue;
        this.e.finish();
        WelcomeActivity.a(this.e);
      }
    }
    return false;
  }

  public final String k()
  {
    switch (this.b)
    {
    default:
      return "/Profile";
    case 1:
      return "/Phone_Number";
    case 2:
      return "/Texting_Address";
    case 3:
    }
    return "/Edit_Email";
  }

  public final String l()
  {
    if ((ad.b(this.e)) && (this.b != 0))
      return null;
    int i;
    switch (this.b)
    {
    default:
      i = 2131493173;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return this.e.getString(i);
      i = 2131493189;
      continue;
      i = 2131493181;
      continue;
      i = 2131493180;
    }
  }

  public final int m()
  {
    return 2131165538;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    switch (this.b)
    {
    default:
      b(2131034119);
      final SelectablePreference localSelectablePreference1 = (SelectablePreference)a("userinfo_phone");
      final SelectablePreference localSelectablePreference2 = (SelectablePreference)a("userinfo_username");
      final SelectablePreference localSelectablePreference3 = (SelectablePreference)a("userinfo_email");
      localSelectablePreference1.setOnPreferenceClickListener(new x(c(1), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          a.b("tap_to_view_number");
          localSelectablePreference1.a(0);
          localSelectablePreference2.a(8);
          localSelectablePreference3.a(8);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference2.setOnPreferenceClickListener(new x(c(2), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          localSelectablePreference1.a(8);
          localSelectablePreference2.a(0);
          localSelectablePreference3.a(8);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference3.setOnPreferenceClickListener(new x(c(3), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          a.b("tap_to_view_tn_email");
          localSelectablePreference1.a(8);
          localSelectablePreference2.a(8);
          localSelectablePreference3.a(0);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      return;
    case 1:
      b(2131034118);
      a();
      setHasOptionsMenu(true);
      return;
    case 2:
      b(2131034121);
      a();
      return;
    case 3:
    }
    b(2131034117);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    switch (this.b)
    {
    default:
      return;
    case 1:
    }
    this.e.getMenuInflater().inflate(2131755018, paramMenu);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165789:
    }
    new AlertDialog.Builder(this.e).setTitle(2131493191).setMessage(getString(2131493192) + "\n\n" + getString(2131493193)).setPositiveButton(2131493017, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        y.this.e.a(y.this.getString(2131493021), false);
        new ReleasePhoneNumberTask().b(y.this.e);
      }
    }).setNegativeButton(2131493018, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    }).create().show();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.y
 * JD-Core Version:    0.6.2
 */