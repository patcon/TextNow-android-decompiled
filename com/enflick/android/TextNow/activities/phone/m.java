package com.enflick.android.TextNow.activities.phone;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import java.util.HashMap;

final class m
  implements View.OnKeyListener
{
  private m(DialerFragment paramDialerFragment)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    if (paramInt == 23)
    {
      i = paramView.getId();
      if (DialerFragment.j().containsKey(Integer.valueOf(i)))
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
        DialerFragment.a(this.a, ((Character)DialerFragment.j().get(Integer.valueOf(i))).charValue());
        continue;
        this.a.f();
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.m
 * JD-Core Version:    0.6.2
 */