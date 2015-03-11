package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class ar
{
  static final au a = new as();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new at();
      return;
    }
  }

  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }

  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ar
 * JD-Core Version:    0.6.2
 */