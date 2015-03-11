package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class r
{
  private static final int[] a = { 16843531 };

  public static Drawable a(Activity paramActivity)
  {
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(a);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public static s a(Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    s locals = new s(paramActivity);
    if (locals.a != null);
    try
    {
      ActionBar localActionBar = paramActivity.getActionBar();
      locals.a.invoke(localActionBar, new Object[] { paramDrawable });
      Method localMethod = locals.b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localMethod.invoke(localActionBar, arrayOfObject);
      do
        return locals;
      while (locals.c == null);
      locals.c.setImageDrawable(paramDrawable);
      return locals;
    }
    catch (Exception localException)
    {
    }
    return locals;
  }

  public static s a(s params, Activity paramActivity, int paramInt)
  {
    if (params == null)
      params = new s(paramActivity);
    if (params.a != null);
    try
    {
      ActionBar localActionBar = paramActivity.getActionBar();
      Method localMethod = params.b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localMethod.invoke(localActionBar, arrayOfObject);
      if (Build.VERSION.SDK_INT <= 19)
        localActionBar.setSubtitle(localActionBar.getSubtitle());
      return params;
    }
    catch (Exception localException)
    {
    }
    return params;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.r
 * JD-Core Version:    0.6.2
 */