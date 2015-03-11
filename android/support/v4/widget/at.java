package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class at extends as
{
  private Method a;
  private Field b;

  at()
  {
    try
    {
      this.a = View.class.getDeclaredMethod("getDisplayList", null);
      try
      {
        label16: this.b = View.class.getDeclaredField("mRecreateDisplayList");
        this.b.setAccessible(true);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label16;
    }
  }

  public final void a(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.a != null) && (this.b != null));
    try
    {
      this.b.setBoolean(paramView, true);
      this.a.invoke(paramView, null);
      label33: super.a(paramSlidingPaneLayout, paramView);
      return;
      paramView.invalidate();
      return;
    }
    catch (Exception localException)
    {
      break label33;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.at
 * JD-Core Version:    0.6.2
 */