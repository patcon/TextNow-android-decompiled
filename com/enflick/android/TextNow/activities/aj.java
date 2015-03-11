package com.enflick.android.TextNow.activities;

import android.net.Uri;
import android.preference.ListPreference;
import android.preference.Preference;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.VoicemailEnableTask;
import textnow.t.e;

final class aj
  implements e
{
  private ListPreference b;
  private Preference c;

  public aj(ah paramah, ListPreference paramListPreference, Preference paramPreference)
  {
    this.b = paramListPreference;
    this.c = paramPreference;
  }

  public final void a(Uri paramUri)
  {
    new StringBuilder().append("Saving file to uri: ").append(paramUri.toString()).toString();
    new VoicemailEnableTask(paramUri, this.a.d).b(this.a.d);
    this.a.d.a(this.a.getString(2131296429), false);
    ah.a(this.a, this.c);
    this.c.setSummary(null);
    ah.a(this.a, this.b);
    this.b.setValue(this.a.getString(2131296696));
    b.a("change_voicemail_greeting", "action", "custom");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aj
 * JD-Core Version:    0.6.2
 */