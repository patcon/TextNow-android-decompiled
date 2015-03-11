package textnow.ay;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

final class o extends GestureDetector.SimpleOnGestureListener
{
  private o(l paraml)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    l.a(this.a).set(true);
    l.b(this.a).set(System.currentTimeMillis());
    return true;
  }

  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    l.a(this.a).set(true);
    l.b(this.a).set(System.currentTimeMillis());
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.o
 * JD-Core Version:    0.6.2
 */