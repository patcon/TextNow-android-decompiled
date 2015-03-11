package com.enflick.android.TextNow.activities;

import android.net.Uri;
import android.preference.ListPreference;
import android.preference.Preference;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.VoicemailEnableTask;
import textnow.o.e;

final class ad
  implements e
{
  private ListPreference b;
  private Preference c;

  public ad(ab paramab, ListPreference paramListPreference, Preference paramPreference)
  {
    this.b = paramListPreference;
    this.c = paramPreference;
  }

  public final void a(Uri paramUri)
  {
    new StringBuilder().append("Saving file to uri: ").append(paramUri.toString()).toString();
    new VoicemailEnableTask(paramUri, this.a.e).b(this.a.e);
    this.a.e.a(this.a.getString(2131493022), false);
    ab.a(this.a, this.c);
    this.c.setSummary(null);
    ab.a(this.a, this.b);
    this.b.setValue(this.a.getString(2131493287));
    a.a("change_voicemail_greeting", "action", "custom");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ad
 * JD-Core Version:    0.6.2
 */