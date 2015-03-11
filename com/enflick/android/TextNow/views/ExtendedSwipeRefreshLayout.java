package com.enflick.android.TextNow.views;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ExtendedSwipeRefreshLayout extends SwipeRefreshLayout
{
  public ExtendedSwipeRefreshLayout(Context paramContext)
  {
    super(paramContext);
  }

  public ExtendedSwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.ExtendedSwipeRefreshLayout
 * JD-Core Version:    0.6.2
 */