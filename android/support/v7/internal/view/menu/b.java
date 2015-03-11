package android.support.v7.internal.view.menu;

import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.aa;

final class b extends aa
{
  public b(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }

  public final ListPopupWindow a()
  {
    if (ActionMenuItemView.a(this.a) != null)
      return ActionMenuItemView.a(this.a).a();
    return null;
  }

  protected final boolean b()
  {
    k localk = ActionMenuItemView.b(this.a);
    boolean bool1 = false;
    if (localk != null)
    {
      boolean bool2 = ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a));
      bool1 = false;
      if (bool2)
      {
        ListPopupWindow localListPopupWindow = a();
        bool1 = false;
        if (localListPopupWindow != null)
        {
          boolean bool3 = localListPopupWindow.b();
          bool1 = false;
          if (bool3)
            bool1 = true;
        }
      }
    }
    return bool1;
  }

  protected final boolean c()
  {
    ListPopupWindow localListPopupWindow = a();
    if (localListPopupWindow != null)
    {
      localListPopupWindow.a();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.b
 * JD-Core Version:    0.6.2
 */