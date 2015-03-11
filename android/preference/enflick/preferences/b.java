package android.preference.enflick.preferences;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.CallForwardingEnableTask;
import textnow.z.u;

final class b
  implements DialogInterface.OnClickListener
{
  private MainActivity b;
  private CallForwardingPreference c;
  private TextView d;
  private u e;

  public b(CallForwardingPreference paramCallForwardingPreference1, CallForwardingPreference paramCallForwardingPreference2, TextView paramTextView, MainActivity paramMainActivity, u paramu)
  {
    this.c = paramCallForwardingPreference2;
    this.d = paramTextView;
    this.b = paramMainActivity;
    this.e = paramu;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.d.getText().toString();
    if (!textnow.v.b.a(str))
    {
      this.b.b(2131296547);
      CallForwardingPreference.a(this.c, this.e.O());
      return;
    }
    this.c.b(true);
    new StringBuilder().append("Updating to: ").append(str).toString();
    new CallForwardingEnableTask(this.e.b(), str).b(this.b);
    CallForwardingPreference.b(this.a, str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.b
 * JD-Core Version:    0.6.2
 */