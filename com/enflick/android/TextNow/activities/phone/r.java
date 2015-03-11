package com.enflick.android.TextNow.activities.phone;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.HashMap;

final class r
  implements View.OnTouchListener
{
  private r(DialerFragment paramDialerFragment)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramView.getId();
    if (DialerFragment.q().containsKey(Integer.valueOf(i)))
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
      DialerFragment.a(this.a, ((Character)DialerFragment.q().get(Integer.valueOf(i))).charValue());
      continue;
      this.a.g();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.r
 * JD-Core Version:    0.6.2
 */