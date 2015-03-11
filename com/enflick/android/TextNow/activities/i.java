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
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.tasks.DeleteGroupTask;
import com.enflick.android.TextNow.tasks.GetGroupTask;
import com.enflick.android.TextNow.tasks.GetSettingsTask;
import com.enflick.android.TextNow.tasks.SpeedTestTask;
import com.enflick.android.TextNow.tasks.c;
import cz.acrobits.libsoftphone.Instance;
import cz.acrobits.libsoftphone.Instance.Settings;
import cz.acrobits.libsoftphone.Preferences;
import cz.acrobits.libsoftphone.Preferences.Key;
import textnow.v.z;
import textnow.z.m;
import textnow.z.p;

public final class i extends ac
{
  private p f;

  public static i a()
  {
    return new i();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == SpeedTestTask.class)
    {
      com.enflick.android.TextNow.tasks.b localb = ((SpeedTestTask)paramc).a();
      if (localb == null)
        this.d.a("Timed out");
      while (true)
      {
        return true;
        this.d.a("Response time: " + localb.a() + " ms\nData Transfered: " + localb.b() / 1024 + " kb\nTransfer Speed: " + localb.c() + " kb/s");
      }
    }
    return false;
  }

  protected final String l()
  {
    return "/Dev_Option";
  }

  protected final String m()
  {
    return this.d.getString(2131296874);
  }

  public final boolean o()
  {
    return true;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.f = new p(this.d);
    b(2131034116);
    ((PreferenceScreen)a("dump_sip_traffic")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        h.D();
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_host")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.a(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_proxy")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.b(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("change_sip_codec_order")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.c(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("test_speed")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.d(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("cdma_config")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.e(i.this);
        return true;
      }
    });
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)a("cdma_aggressive");
    localCheckBoxPreference1.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        i.f(i.this).c(Boolean.valueOf(paramAnonymousObject.toString()).booleanValue());
        i.f(i.this).B();
        new GetSettingsTask().b(i.this.d);
        return true;
      }
    });
    localCheckBoxPreference1.setChecked(this.f.z());
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)a("call_rating");
    localCheckBoxPreference2.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        i.f(i.this).a(Boolean.valueOf(paramAnonymousObject.toString()).booleanValue());
        i.f(i.this).B();
        return true;
      }
    });
    localCheckBoxPreference2.setChecked(this.f.a());
    ((PreferenceScreen)a("volume_boost")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.g(i.this);
        return true;
      }
    });
    CheckBoxPreference localCheckBoxPreference3 = (CheckBoxPreference)a("force_two_pane");
    localCheckBoxPreference3.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        z.c = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference3.setChecked(z.c);
    CheckBoxPreference localCheckBoxPreference4 = (CheckBoxPreference)a("force_one_pane");
    localCheckBoxPreference4.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        z.b = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference4.setChecked(z.b);
    CheckBoxPreference localCheckBoxPreference5 = (CheckBoxPreference)a("force_intro_screen");
    localCheckBoxPreference5.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        z.a = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference5.setChecked(z.a);
    ((CheckBoxPreference)a("force_no_ads")).setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        z.e = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference4.setChecked(z.e);
    ((PreferenceScreen)a("force_ad_network")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.h(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("create_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.i(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("get_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.j(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("get_groups")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.k(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("delete_group")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.l(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("mock_esn")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.m(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("mock_data_usage")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.n(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("create_messages")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.o(i.this);
        return true;
      }
    });
    ((PreferenceScreen)a("create_conversations")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.p(i.this);
        return true;
      }
    });
    CheckBoxPreference localCheckBoxPreference6 = (CheckBoxPreference)a("debug_mode");
    localCheckBoxPreference6.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        textnow.v.a.a = Boolean.valueOf(paramAnonymousObject.toString()).booleanValue();
        return true;
      }
    });
    localCheckBoxPreference6.setChecked(textnow.v.a.a);
    ((PreferenceScreen)a("clear_data")).setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        i.q(i.this);
        return true;
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.i
 * JD-Core Version:    0.6.2
 */