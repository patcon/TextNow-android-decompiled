package android.preference.enflick.preferences;

import android.content.Context;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import textnow.z.u;

public class CallForwardingPreference extends SettingsCheckBoxPreference
  implements c
{
  private String c;

  public CallForwardingPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnPreferenceChangeListener(new a(this, getOnPreferenceChangeListener()));
    this.c = this.a.O();
  }

  private void a(String paramString)
  {
    Preference localPreference = findPreferenceInHierarchy("userinfo_callforwarding_forward_to");
    if (TextUtils.isEmpty(paramString))
    {
      localPreference.setSummary(2131296686);
      localPreference.setEnabled(false);
      super.persistBoolean(false);
      setChecked(false);
    }
    while (true)
    {
      this.a.w(paramString);
      this.a.B();
      return;
      localPreference.setSummary(paramString);
      localPreference.setEnabled(true);
      super.persistBoolean(true);
      setChecked(true);
    }
  }

  public final void a(boolean paramBoolean)
  {
    a(this.a.O());
    b(false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.CallForwardingPreference
 * JD-Core Version:    0.6.2
 */