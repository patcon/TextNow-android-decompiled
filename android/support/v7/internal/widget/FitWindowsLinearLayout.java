package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout
  implements w
{
  private x a;

  public FitWindowsLinearLayout(Context paramContext)
  {
    super(paramContext);
  }

  public FitWindowsLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
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
 * Qualified Name:     android.support.v7.internal.widget.FitWindowsLinearLayout
 * JD-Core Version:    0.6.2
 */