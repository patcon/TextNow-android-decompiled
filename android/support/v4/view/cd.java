package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class cd
{
  static final cl a = new ce();
  private WeakReference<View> b;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19)
    {
      a = new ck();
      return;
    }
    if (i >= 18)
    {
      a = new ci();
      return;
    }
    if (i >= 16)
    {
      a = new cj();
      return;
    }
    if (i >= 14)
    {
      a = new cg();
      return;
    }
  }

  cd(View paramView)
  {
    this.b = new WeakReference(paramView);
  }

  public final cd a(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView, paramFloat);
    return this;
  }

  public final cd a(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(localView, paramLong);
    return this;
  }

  public final cd a(cp paramcp)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView, paramcp);
    return this;
  }

  public final cd a(cr paramcr)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(localView, paramcr);
    return this;
  }

  public final cd a(Interpolator paramInterpolator)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(localView, paramInterpolator);
    return this;
  }

  public final void a()
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView);
  }

  public final cd b(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.b(this, localView, paramFloat);
    return this;
  }

  public final void b()
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.b(this, localView);
  }

  public final cd c(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.c(this, localView, paramFloat);
    return this;
  }

  public final cd d(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.d(this, localView, 1.0F);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cd
 * JD-Core Version:    0.6.2
 */