package android.support.v7.widget;

import android.content.Context;
import android.support.v7.app.ActionBar.LayoutParams;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class Toolbar$LayoutParams extends ActionBar.LayoutParams
{
  int b = 0;

  public Toolbar$LayoutParams(int paramInt1, int paramInt2)
  {
    super(-2, -2);
    this.a = 8388627;
  }

  public Toolbar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public Toolbar$LayoutParams(ActionBar.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public Toolbar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.b = paramLayoutParams.b;
  }

  public Toolbar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public Toolbar$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.leftMargin = paramMarginLayoutParams.leftMargin;
    this.topMargin = paramMarginLayoutParams.topMargin;
    this.rightMargin = paramMarginLayoutParams.rightMargin;
    this.bottomMargin = paramMarginLayoutParams.bottomMargin;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.Toolbar.LayoutParams
 * JD-Core Version:    0.6.2
 */