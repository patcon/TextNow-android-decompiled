package com.enflick.android.TextNow.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceScreen;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.phone.a;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.activities.phone.j;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.GetGroupTask;
import com.enflick.android.TextNow.tasks.GetSettingsTask;
import com.enflick.android.TextNow.tasks.SpeedTestTask;
import com.enflick.android.TextNow.tasks.c;
import cz.acrobits.libsoftphone.Instance;
import cz.acrobits.libsoftphone.Instance.Settings;
import cz.acrobits.libsoftphone.Preferences;
import cz.acrobits.libsoftphone.Preferences.Key;
import textnow.q.ad;
import textnow.u.n;

public final class h extends w
{
  public static h a()
  {
    return new h();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == SpeedTestTask.class)
    {
      com.enflick.android.TextNow.tasks.b localb = ((SpeedTestTask)paramc).a();
      if (localb == null)
        this.e.a("Timed out");
      while (true)
      {
        return true;
        this.e.a("Response time: " + localb.a() + " ms\nData Transfered: " + localb.b() / 1024 + " kb\nTransfer Speed: " + localb.c() + " kb/s");
      }
    }
    return false;
  }

  protected final String k()
  {
    return "/Dev_Option";
  }

  protected final String l()
  {
    return this.e.getString(2131493500);
  }

  public final boolean n()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b(2131034116);
    ((PreferenceScreen)a("dump_sip_traffic")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        d.D();
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_host")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.a(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_proxy")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.b(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_codec_order")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.c(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("test_speed")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.d(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("cdma_config")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.e(h.this);
        return true;
      }
    });
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)a("cdma_aggressive");
    localCheckBoxPreference1.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        n localn = new n(h.this.e);
        localn.b(Boolean.valueOf(paramAnonymousObject.toString()).booleanValue());
        localn.n();
        new GetSettingsTask().b(h.this.e);
        return true;
      }
    });
    localCheckBoxPreference1.setChecked(new n(this.e).l());
    ((CheckBoxPreference)a("cdma_feedback")).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        com.enflick.android.TextNow.activities.phone.DialerFragment.a = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    ((PreferenceScreen)a("volume_boost")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.f(h.this);
        return true;
      }
    });
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)a("force_two_pane");
    localCheckBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        ad.b = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference2.setChecked(ad.b);
    CheckBoxPreference localCheckBoxPreference3 = (CheckBoxPreference)a("force_one_pane");
    localCheckBoxPreference3.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        ad.a = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference3.setChecked(ad.a);
    ((CheckBoxPreference)a("force_no_ads")).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        ad.d = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference3.setChecked(ad.d);
    ((PreferenceScreen)a("force_ad_network")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.g(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("create_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.h(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("get_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.i(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("get_groups")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.j(h.this);
        return true;
      }
    });
    ((PreferenceScreen)a("delete_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.k(h.this);
        return true;
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.h
 * JD-Core Version:    0.6.2
 */