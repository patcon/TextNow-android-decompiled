package android.preference.enflick.preferences;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.util.AttributeSet;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import java.util.HashMap;
import textnow.z.u;

public class EmailNotificationsPreference extends SettingsCheckBoxPreference
  implements Preference.OnPreferenceChangeListener, c
{
  public EmailNotificationsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(boolean paramBoolean)
  {
    b(false);
    setChecked(new u(getContext()).i());
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    b(true);
    HashMap localHashMap = new HashMap();
    localHashMap.put("userinfo_forward_messages", (Boolean)paramObject);
    new UpdateUserInfoTask(localHashMap).b(getContext());
    return true;
  }

  protected boolean shouldPersist()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.EmailNotificationsPreference
 * JD-Core Version:    0.6.2
 */