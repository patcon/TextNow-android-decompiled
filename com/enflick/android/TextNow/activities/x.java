package com.enflick.android.TextNow.activities;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

public class x
  implements Preference.OnPreferenceClickListener
{
  final ao a;

  public x(w paramw, ao paramao)
  {
    this.a = paramao;
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.b.e.a(this.a);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.x
 * JD-Core Version:    0.6.2
 */