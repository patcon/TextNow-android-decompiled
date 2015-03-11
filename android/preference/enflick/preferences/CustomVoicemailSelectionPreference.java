package android.preference.enflick.preferences;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import textnow.z.u;

public class CustomVoicemailSelectionPreference extends ListPreference
  implements c
{
  public CustomVoicemailSelectionPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(boolean paramBoolean)
  {
    u localu;
    if (!paramBoolean)
    {
      localu = new u(getContext());
      if (!localu.P().equals("0"))
        break label60;
      setValue(getContext().getString(2131296695));
      setSummary(getContext().getString(2131296695));
      setEnabled(false);
    }
    label60: 
    do
    {
      return;
      if (localu.P().equals("1"))
      {
        setValue(getContext().getString(2131296695));
        setSummary(getContext().getString(2131296695));
        setEnabled(true);
        return;
      }
    }
    while (!localu.P().equals("2"));
    setValue(getContext().getString(2131296696));
    setSummary(getContext().getString(2131296696));
    setEnabled(true);
  }

  protected void onDialogClosed(boolean paramBoolean)
  {
    super.onDialogClosed(paramBoolean);
    setSummary(getEntry());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.CustomVoicemailSelectionPreference
 * JD-Core Version:    0.6.2
 */