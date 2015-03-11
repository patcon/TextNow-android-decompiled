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
import android.preference.enflick.preferences.SelectablePreference;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.enflick.android.TextNow.tasks.ReleasePhoneNumberTask;
import com.enflick.android.TextNow.tasks.SendEmailVerificationTask;
import com.enflick.android.TextNow.tasks.UpdateUserInfoPasswordTask;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import com.enflick.android.TextNow.tasks.c;
import textnow.v.l;
import textnow.v.z;
import textnow.z.u;

public class ae extends ac
{
  @SuppressLint({"NewApi"})
  private void a()
  {
    this.a.findViewById(2131558899).setVisibility(0);
    TextView localTextView1 = (TextView)this.a.findViewById(2131558900);
    TextView localTextView2 = (TextView)this.a.findViewById(2131558901);
    if (Build.VERSION.SDK_INT >= 11)
      localTextView1.setTextIsSelectable(true);
    if (this.b == 1)
    {
      str2 = textnow.v.b.f(this.c.c());
      localTextView1.setText(str2);
      localTextView2.setText(2131296607);
      a("settings_phone_facebook").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          com.enflick.android.TextNow.ads.b.b("share_number_fb");
          MainActivity localMainActivity = ae.this.d;
          ae localae = ae.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = str2;
          l.a(localMainActivity, localae.getString(2131296609, arrayOfObject), "http://www.textnow.com", ae.this.getString(2131296610), ae.this.getString(2131296611), ae.this.d.b);
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
    localTextView2.setText(2131296597);
    a("settings_username_facebook").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        com.enflick.android.TextNow.ads.b.b("share_tn_email_fb");
        MainActivity localMainActivity = ae.this.d;
        ae localae = ae.this;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = str1;
        l.a(localMainActivity, localae.getString(2131296599, arrayOfObject), "http://www.textnow.com", ae.this.getString(2131296610), ae.this.getString(2131296611), ae.this.d.b);
        return true;
      }
    });
  }

  private void a(boolean paramBoolean1, int paramInt, String paramString, boolean paramBoolean2)
  {
    this.d.v();
    for (int i = 0; i < c().getPreferenceCount(); i++)
      a(c().getPreference(i), paramBoolean1, paramInt, paramString);
    if (paramBoolean1)
    {
      this.c = new u(this.d);
      if (this.d.w())
      {
        if (!paramBoolean2)
          break label88;
        this.d.b(2131296433);
      }
    }
    return;
    label88: if ("EMAIL_ADDRESS_IN_USE".equals(paramString))
    {
      this.d.b(2131296480);
      return;
    }
    if ("PERMISSION_DENIED".equals(paramString))
    {
      this.d.b(2131296621);
      return;
    }
    this.d.b(2131296622);
  }

  public static ae c(int paramInt)
  {
    ae localae = new ae();
    localae.a(paramInt);
    return localae;
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
          paramPreference.setSummary(textnow.v.b.f(paramPreference.getSharedPreferences().getString(str, "")));
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
      this.d.v();
      if (this.d.w())
      {
        if (!paramBoolean)
          break label99;
        this.d.b(2131296433);
      }
      while (true)
      {
        return true;
        label99: if (bool)
          this.d.b(2131296625);
        else
          this.d.b(2131296616);
      }
    }
    if (localClass == ReleasePhoneNumberTask.class)
    {
      this.d.v();
      if (bool)
        if (this.d.w())
        {
          if (!paramBoolean)
            break label171;
          this.d.b(2131296433);
        }
      while (true)
      {
        return true;
        label171: String str2 = getString(2131296606);
        if ((str1 != null) && ("PHONE_NUMBER_UNREGISTRATION_THRESHOLD_EXCEEDED".equals(str1)))
          str2 = getString(2131296605);
        this.d.a(str2);
        continue;
        this.d.finish();
        WelcomeActivity.a(this.d);
      }
    }
    return false;
  }

  public final String l()
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

  public final String m()
  {
    if ((z.d(this.d)) && (this.b != 0))
      return null;
    int i;
    switch (this.b)
    {
    default:
      i = 2131296588;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return this.d.getString(i);
      i = 2131296600;
      continue;
      i = 2131296596;
      continue;
      i = 2131296595;
    }
  }

  public final int n()
  {
    return 2131558820;
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
      localSelectablePreference1.setOnPreferenceClickListener(new ad(c(1), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          com.enflick.android.TextNow.ads.b.b("tap_to_view_number");
          localSelectablePreference1.a(0);
          localSelectablePreference2.a(8);
          localSelectablePreference3.a(8);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference2.setOnPreferenceClickListener(new ad(c(2), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          localSelectablePreference1.a(8);
          localSelectablePreference2.a(0);
          localSelectablePreference3.a(8);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference3.setOnPreferenceClickListener(new ad(c(3), localSelectablePreference1)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          com.enflick.android.TextNow.ads.b.b("tap_to_view_tn_email");
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
      b(2131034122);
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
    this.d.getMenuInflater().inflate(2131755020, paramMenu);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131559093:
    }
    new AlertDialog.Builder(this.d).setTitle(2131296602).setMessage(getString(2131296603) + "\n\n" + getString(2131296604)).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        ae.this.d.a(ae.this.getString(2131296428), false);
        new ReleasePhoneNumberTask().b(ae.this.d);
      }
    }).setNegativeButton(2131296424, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    }).create().show();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ae
 * JD-Core Version:    0.6.2
 */