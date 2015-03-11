package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout
  implements w
{
  private x a;

  public FitWindowsFrameLayout(Context paramContext)
  {
    super(paramContext);
  }

  public FitWindowsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(x paramx)
  {
    this.a = paramx;
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    if (this.a != null)
      this.a.a(paramRect);
    return super.fitSystemWindows(paramRect);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.FitWindowsFrameLayout
 * JD-Core Version:    0.6.2
 */