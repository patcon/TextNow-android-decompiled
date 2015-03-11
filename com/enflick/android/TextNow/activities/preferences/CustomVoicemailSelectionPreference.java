package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import textnow.u.r;

public class CustomVoicemailSelectionPreference extends ListPreference
  implements c
{
  public CustomVoicemailSelectionPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(boolean paramBoolean)
  {
    r localr;
    if (!paramBoolean)
    {
      localr = new r(getContext());
      if (!localr.N().equals("0"))
        break label60;
      setValue(getContext().getString(2131493286));
      setSummary(getContext().getString(2131493286));
      setEnabled(false);
    }
    label60: 
    do
    {
      return;
      if (localr.N().equals("1"))
      {
        setValue(getContext().getString(2131493286));
        setSummary(getContext().getString(2131493286));
        setEnabled(true);
        return;
      }
    }
    while (!localr.N().equals("2"));
    setValue(getContext().getString(2131493287));
    setSummary(getContext().getString(2131493287));
    setEnabled(true);
  }

  protected void onDialogClosed(boolean paramBoolean)
  {
    super.onDialogClosed(paramBoolean);
    setSummary(getEntry());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.CustomVoicemailSelectionPreference
 * JD-Core Version:    0.6.2
 */