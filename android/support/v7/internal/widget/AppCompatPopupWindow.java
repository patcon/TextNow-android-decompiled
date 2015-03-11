package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import textnow.g.l;

public class AppCompatPopupWindow extends PopupWindow
{
  private final boolean a;

  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, l.aM, paramInt, 0);
    this.a = localao.a(l.aP, false);
    setBackgroundDrawable(localao.a(l.aO));
    localao.b();
  }

  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    if ((Build.VERSION.SDK_INT < 21) && (this.a))
      paramInt2 -= paramView.getHeight();
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }

  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((Build.VERSION.SDK_INT < 21) && (this.a))
      paramInt2 -= paramView.getHeight();
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }

  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((Build.VERSION.SDK_INT < 21) && (this.a));
    for (int i = paramInt2 - paramView.getHeight(); ; i = paramInt2)
    {
      super.update(paramView, paramInt1, i, paramInt3, paramInt4);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AppCompatPopupWindow
 * JD-Core Version:    0.6.2
 */