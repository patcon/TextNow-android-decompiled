package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class am
{
  static final ap a = new an();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ao();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.am
 * JD-Core Version:    0.6.2
 */