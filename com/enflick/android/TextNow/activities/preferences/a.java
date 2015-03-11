package com.enflick.android.TextNow.activities.preferences;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.Window;
import android.widget.EditText;
import com.enflick.android.TextNow.tasks.CallForwardingDisableTask;
import textnow.q.ad;
import textnow.u.r;

public final class a
  implements Preference.OnPreferenceChangeListener
{
  Preference.OnPreferenceChangeListener a;

  public a(CallForwardingPreference paramCallForwardingPreference, Preference.OnPreferenceChangeListener paramOnPreferenceChangeListener)
  {
    this.a = paramOnPreferenceChangeListener;
  }

  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    if (this.a != null)
      this.a.onPreferenceChange(paramPreference, paramObject);
    CallForwardingPreference localCallForwardingPreference = (CallForwardingPreference)paramPreference;
    if (((Boolean)paramObject).booleanValue())
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.b.b);
      localBuilder.setTitle(2131493272);
      EditText localEditText = new EditText(this.b.b);
      localEditText.setInputType(3);
      localBuilder.setView(localEditText);
      localBuilder.setPositiveButton(2131493020, new b(this.b, localCallForwardingPreference, localEditText, this.b.b, this.b.a));
      localBuilder.setNegativeButton(2131493019, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          CallForwardingPreference.a(a.this.b, CallForwardingPreference.a(a.this.b));
        }
      });
      localBuilder.setOnCancelListener(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          CallForwardingPreference.a(a.this.b, CallForwardingPreference.a(a.this.b));
        }
      });
      AlertDialog localAlertDialog = localBuilder.create();
      localAlertDialog.getWindow().setSoftInputMode(4);
      ad.a(localAlertDialog, this.b.b);
      localAlertDialog.show();
    }
    while (true)
    {
      return ((Boolean)paramObject).booleanValue();
      new CallForwardingDisableTask(this.b.a.b()).b(this.b.b);
      CallForwardingPreference.b(this.b, "");
      this.b.b(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.a
 * JD-Core Version:    0.6.2
 */