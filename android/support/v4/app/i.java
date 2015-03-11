package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class i
{
  private static final int[] a = { 16843531 };

  public static Drawable a(Activity paramActivity)
  {
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(a);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public static Object a(Object paramObject, Activity paramActivity, int paramInt)
  {
    if (paramObject == null);
    for (Object localObject = new j(paramActivity); ; localObject = paramObject)
    {
      j localj = (j)localObject;
      if (localj.a != null);
      try
      {
        ActionBar localActionBar = paramActivity.getActionBar();
        Method localMethod = localj.b;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        localMethod.invoke(localActionBar, arrayOfObject);
        if (Build.VERSION.SDK_INT <= 19)
          localActionBar.setSubtitle(localActionBar.getSubtitle());
        return localObject;
      }
      catch (Exception localException)
      {
        return localObject;
      }
    }
  }

  public static Object a(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    if (paramObject == null);
    for (Object localObject = new j(paramActivity); ; localObject = paramObject)
    {
      j localj = (j)localObject;
      if (localj.a != null);
      try
      {
        ActionBar localActionBar = paramActivity.getActionBar();
        localj.a.invoke(localActionBar, new Object[] { paramDrawable });
        Method localMethod = localj.b;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        localMethod.invoke(localActionBar, arrayOfObject);
        do
          return localObject;
        while (localj.c == null);
        localj.c.setImageDrawable(paramDrawable);
        return localObject;
      }
      catch (Exception localException)
      {
        return localObject;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.i
 * JD-Core Version:    0.6.2
 */