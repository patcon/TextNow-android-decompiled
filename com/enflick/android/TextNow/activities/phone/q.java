package com.enflick.android.TextNow.activities.phone;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import java.util.HashMap;

final class q
  implements View.OnKeyListener
{
  private q(DialerFragment paramDialerFragment)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    if (paramInt == 23)
    {
      i = paramView.getId();
      if (DialerFragment.q().containsKey(Integer.valueOf(i)))
        switch (paramKeyEvent.getAction())
        {
        default:
        case 0:
        case 1:
        }
    }
    while (true)
    {
      return false;
      if (paramKeyEvent.getRepeatCount() == 0)
      {
        DialerFragment.a(this.a, ((Character)DialerFragment.q().get(Integer.valueOf(i))).charValue());
        continue;
        this.a.g();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.q
 * JD-Core Version:    0.6.2
 */