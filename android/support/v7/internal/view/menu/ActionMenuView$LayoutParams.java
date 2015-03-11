package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.widget.LinearLayout.LayoutParams;

public class ActionMenuView$LayoutParams extends LinearLayout.LayoutParams
{

  @ViewDebug.ExportedProperty
  public boolean a;

  @ViewDebug.ExportedProperty
  public int b;

  @ViewDebug.ExportedProperty
  public int c;

  @ViewDebug.ExportedProperty
  public boolean d;

  @ViewDebug.ExportedProperty
  public boolean e;
  public boolean f;

  public ActionMenuView$LayoutParams(int paramInt1, int paramInt2)
  {
    super(-2, -2);
    this.a = false;
  }

  public ActionMenuView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ActionMenuView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = paramLayoutParams.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuView.LayoutParams
 * JD-Core Version:    0.6.2
 */