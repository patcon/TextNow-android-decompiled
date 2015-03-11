package android.preference.enflick.preferences;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.util.AttributeSet;
import textnow.z.u;

public class CustomVoicemailEnablePreference extends SettingsCheckBoxPreference
  implements Preference.OnPreferenceChangeListener, c
{
  public CustomVoicemailEnablePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(boolean paramBoolean)
  {
    if (new u(getContext()).P().equals("0"))
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.CustomVoicemailEnablePreference
 * JD-Core Version:    0.6.2
 */