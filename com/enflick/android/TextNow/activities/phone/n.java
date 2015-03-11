package com.enflick.android.TextNow.activities.phone;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.HashMap;

final class n
  implements View.OnTouchListener
{
  private n(DialerFragment paramDialerFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramView.getId();
    if (DialerFragment.j().containsKey(Integer.valueOf(i)))
      switch (paramMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
    while (true)
    {
      return false;
      DialerFragment.a(this.a, ((Character)DialerFragment.j().get(Integer.valueOf(i))).charValue());
      continue;
      this.a.f();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.n
 * JD-Core Version:    0.6.2
 */