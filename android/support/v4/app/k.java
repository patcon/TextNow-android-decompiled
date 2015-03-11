package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class k
{
  private static final int[] a = { 16843531 };

  public static Drawable a(Activity paramActivity)
  {
    ActionBar localActionBar = paramActivity.getActionBar();
    if (localActionBar != null)
      paramActivity = localActionBar.getThemedContext();
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(null, a, 16843470, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public static Object a(Object paramObject, Activity paramActivity, int paramInt)
  {
    ActionBar localActionBar = paramActivity.getActionBar();
    if (localActionBar != null)
      localActionBar.setHomeActionContentDescription(paramInt);
    return paramObject;
  }

  public static Object a(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = paramActivity.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
    return paramObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.k
 * JD-Core Version:    0.6.2
 */