package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import com.enflick.android.TextNow.activities.MainActivity;
import textnow.u.r;

public class SettingsCheckBoxPreference extends CheckBoxPreference
{
  protected r a;
  protected MainActivity b;

  public SettingsCheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new r(paramContext);
    this.b = ((MainActivity)paramContext);
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.a(this.b.getString(2131493022), false);
      return;
    }
    this.b.r();
  }

  protected boolean getPersistedBoolean(boolean paramBoolean)
  {
    if (!shouldPersist())
      return paramBoolean;
    return this.a.i(getKey()).booleanValue();
  }

  protected boolean persistBoolean(boolean paramBoolean)
  {
    if (shouldPersist())
    {
      boolean bool = false;
      if (!paramBoolean)
        bool = true;
      if (paramBoolean == getPersistedBoolean(bool))
        return true;
      this.a.a(getKey(), paramBoolean);
      this.a.n();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.SettingsCheckBoxPreference
 * JD-Core Version:    0.6.2
 */