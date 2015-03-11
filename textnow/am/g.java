package textnow.am;

import android.view.animation.Interpolator;

public abstract class g
  implements Cloneable
{
  float a;
  Class b;
  boolean c = false;
  private Interpolator d = null;

  public static g a(float paramFloat1, float paramFloat2)
  {
    return new h(paramFloat1, paramFloat2);
  }

  public static g a(float paramFloat, int paramInt)
  {
    return new i(paramFloat, paramInt);
  }

  public abstract Object a();

  public final void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }

  public final float b()
  {
    return this.a;
  }

  public final Interpolator c()
  {
    return this.d;
  }

  public abstract g d();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.g
 * JD-Core Version:    0.6.2
 */