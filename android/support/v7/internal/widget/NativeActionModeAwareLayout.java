package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.View;

@TargetApi(11)
public class NativeActionModeAwareLayout extends ContentFrameLayout
{
  private z a;

  public NativeActionModeAwareLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(z paramz)
  {
    this.a = paramz;
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    if (this.a != null)
      return this.a.a(paramView, paramCallback);
    return super.startActionModeForChild(paramView, paramCallback);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.NativeActionModeAwareLayout
 * JD-Core Version:    0.6.2
 */