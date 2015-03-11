package android.support.v4.view;

import android.view.MotionEvent;

final class ad
  implements ae
{
  public final int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getPointerCount();
  }

  public final int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.findPointerIndex(paramInt);
  }

  public final int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getPointerId(paramInt);
  }

  public final float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getX(paramInt);
  }

  public final float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getY(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ad
 * JD-Core Version:    0.6.2
 */