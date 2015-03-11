package com.enflick.android.TextNow.activities.preferences;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.CallForwardingEnableTask;
import textnow.u.r;

final class b
  implements DialogInterface.OnClickListener
{
  private MainActivity b;
  private CallForwardingPreference c;
  private TextView d;
  private r e;

  public b(CallForwardingPreference paramCallForwardingPreference1, CallForwardingPreference paramCallForwardingPreference2, TextView paramTextView, MainActivity paramMainActivity, r paramr)
  {
    this.c = paramCallForwardingPreference2;
    this.d = paramTextView;
    this.b = paramMainActivity;
    this.e = paramr;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.d.getText().toString();
    if (!textnow.q.b.a(str))
    {
      this.b.c(2131493135);
      CallForwardingPreference.a(this.c, this.e.M());
      return;
    }
    this.c.b(true);
    new StringBuilder().append("Updating to: ").append(str).toString();
    new CallForwardingEnableTask(this.e.b(), str).b(this.b);
    CallForwardingPreference.b(this.a, str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.b
 * JD-Core Version:    0.6.2
 */