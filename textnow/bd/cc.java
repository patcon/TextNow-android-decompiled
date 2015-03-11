package textnow.bd;

import android.graphics.Point;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

final class cc
{
  private static int a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams;
    int i;
    if (paramViewGroup != null)
    {
      localLayoutParams = paramViewGroup.getLayoutParams();
      if (localLayoutParams != null);
    }
    else
    {
      i = -1;
    }
    do
    {
      return i;
      if (paramBoolean);
      for (i = localLayoutParams.width; i == -2; i = localLayoutParams.height)
        return -1;
    }
    while (i != -1);
    try
    {
      int j = a((ViewGroup)paramViewGroup.getParent(), paramBoolean);
      return j;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return -1;
  }

  private static int a(ImageView paramImageView, boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams = paramImageView.getLayoutParams();
    int i;
    if (localLayoutParams == null)
      i = -1;
    do
    {
      return i;
      if (paramBoolean);
      for (i = localLayoutParams.width; i == -2; i = localLayoutParams.height)
        return -1;
    }
    while (i != -1);
    try
    {
      int j = a((ViewGroup)paramImageView.getParent(), paramBoolean);
      return j;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return -1;
  }

  public static Point a(ImageView paramImageView)
  {
    Point localPoint = new Point();
    localPoint.x = a(paramImageView, true);
    localPoint.y = a(paramImageView, false);
    if (localPoint.x <= 0)
      localPoint.x = -1;
    if (localPoint.y <= 0)
      localPoint.y = -1;
    return localPoint;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.cc
 * JD-Core Version:    0.6.2
 */