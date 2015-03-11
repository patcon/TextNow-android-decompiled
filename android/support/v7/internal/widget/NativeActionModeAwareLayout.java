package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.View;
import android.widget.LinearLayout;

public class NativeActionModeAwareLayout extends LinearLayout
{
  private y a;

  public NativeActionModeAwareLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(y paramy)
  {
    this.a = paramy;
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    if (this.a != null)
      paramCallback = this.a.a(paramCallback);
    return super.startActionModeForChild(paramView, paramCallback);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.NativeActionModeAwareLayout
 * JD-Core Version:    0.6.2
 */