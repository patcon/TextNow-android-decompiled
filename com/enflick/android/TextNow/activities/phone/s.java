package com.enflick.android.TextNow.activities.phone;

import android.text.Editable;
import android.text.method.DialerKeyListener;
import android.view.KeyEvent;
import android.view.View;

final class s extends DialerKeyListener
{
  private s(DialerFragment paramDialerFragment)
  {
  }

  public final boolean backspace(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public final boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    char c = (char)lookup(paramKeyEvent, paramEditable);
    if ((paramKeyEvent.getRepeatCount() == 0) && (super.onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent)))
    {
      if (ok(getAcceptedChars(), c))
      {
        new StringBuilder().append("DTMFKeyListener reading '").append(c).append("' from input.").toString();
        DialerFragment.a(this.a, c);
      }
      while (true)
      {
        return true;
        new StringBuilder().append("DTMFKeyListener rejecting '").append(c).append("' from input.").toString();
      }
    }
    return false;
  }

  public final boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    super.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
    char c = (char)lookup(paramKeyEvent, paramEditable);
    if (ok(getAcceptedChars(), c))
    {
      new StringBuilder().append("Stopping the tone for '").append(c).append("'").toString();
      this.a.g();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.s
 * JD-Core Version:    0.6.2
 */