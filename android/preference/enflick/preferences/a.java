package android.preference.enflick.preferences;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.Window;
import android.widget.EditText;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.CallForwardingDisableTask;
import textnow.v.z;
import textnow.z.u;

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
      if ((this.b.b == null) || (!this.b.b.isFinishing()))
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.b.b);
        localBuilder.setTitle(2131296681);
        EditText localEditText = new EditText(this.b.b);
        localEditText.setInputType(3);
        localBuilder.setView(localEditText);
        localBuilder.setPositiveButton(2131296427, new b(this.b, localCallForwardingPreference, localEditText, this.b.b, this.b.a));
        localBuilder.setNegativeButton(2131296425, new DialogInterface.OnClickListener()
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
        z.a(localAlertDialog, this.b.b);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.a
 * JD-Core Version:    0.6.2
 */