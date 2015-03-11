package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

final class cf$b extends RelativeLayout
{
  private final ep kI;

  public cf$b(Context paramContext, String paramString)
  {
    super(paramContext);
    this.kI = new ep(paramContext, paramString);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.kI.c(paramMotionEvent);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf.b
 * JD-Core Version:    0.6.2
 */