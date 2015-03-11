package com.enflick.android.TextNow.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.enflick.android.TextNow.views.imagezoom.ImageViewTouch;

public class ZoomViewPager extends ViewPager
{
  public ZoomViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public ZoomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean f()
  {
    m localm = (m)a();
    if (localm != null)
    {
      ImageViewTouch localImageViewTouch = localm.c();
      if (localImageViewTouch != null)
        return localImageViewTouch.g() > 1.0F;
    }
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (f())
      return false;
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (f())
      return true;
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.ZoomViewPager
 * JD-Core Version:    0.6.2
 */