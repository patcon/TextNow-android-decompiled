package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class j
{
  public Method a;
  public Method b;
  public ImageView c;

  j(Activity paramActivity)
  {
    while (true)
    {
      View localView2;
      View localView3;
      try
      {
        this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Integer.TYPE;
        this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", arrayOfClass);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        View localView1 = paramActivity.findViewById(16908332);
        if (localView1 == null)
          continue;
        ViewGroup localViewGroup = (ViewGroup)localView1.getParent();
        if (localViewGroup.getChildCount() != 2)
          continue;
        localView2 = localViewGroup.getChildAt(0);
        localView3 = localViewGroup.getChildAt(1);
        if (localView2.getId() != 16908332);
      }
      while ((localView3 instanceof ImageView))
      {
        this.c = ((ImageView)localView3);
        return;
        localView3 = localView2;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.j
 * JD-Core Version:    0.6.2
 */