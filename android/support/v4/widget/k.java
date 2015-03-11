package android.support.v4.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class k
  implements j
{
  public final int a(Object paramObject)
  {
    if (paramObject != null)
      return ((WindowInsets)paramObject).getSystemWindowInsetTop();
    return 0;
  }

  public final void a(View paramView)
  {
    if ((paramView instanceof q))
    {
      paramView.setOnApplyWindowInsetsListener(new p());
      paramView.setSystemUiVisibility(1280);
    }
  }

  public final void a(View paramView, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    while (true)
    {
      paramView.dispatchApplyWindowInsets(localWindowInsets);
      return;
      if (paramInt == 5)
        localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
  }

  public final void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3)
      localWindowInsets = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    while (true)
    {
      paramMarginLayoutParams.leftMargin = localWindowInsets.getSystemWindowInsetLeft();
      paramMarginLayoutParams.topMargin = localWindowInsets.getSystemWindowInsetTop();
      paramMarginLayoutParams.rightMargin = localWindowInsets.getSystemWindowInsetRight();
      paramMarginLayoutParams.bottomMargin = localWindowInsets.getSystemWindowInsetBottom();
      return;
      if (paramInt == 5)
        localWindowInsets = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k
 * JD-Core Version:    0.6.2
 */