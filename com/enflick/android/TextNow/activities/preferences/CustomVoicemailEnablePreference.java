package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.util.AttributeSet;
import textnow.u.r;

public class CustomVoicemailEnablePreference extends SettingsCheckBoxPreference
  implements Preference.OnPreferenceChangeListener, c
{
  public CustomVoicemailEnablePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(boolean paramBoolean)
  {
    if (new r(getContext()).N().equals("0"))
    {
      setChecked(false);
      return;
    }
    setChecked(true);
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.CustomVoicemailEnablePreference
 * JD-Core Version:    0.6.2
 */