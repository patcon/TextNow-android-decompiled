package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class SlidingPaneLayout$LayoutParams extends ViewGroup.MarginLayoutParams
{
  private static final int[] e = { 16843137 };
  public float a = 0.0F;
  boolean b;
  boolean c;
  Paint d;

  public SlidingPaneLayout$LayoutParams()
  {
    super(-1, -1);
  }

  public SlidingPaneLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e);
    this.a = localTypedArray.getFloat(0, 0.0F);
    localTypedArray.recycle();
  }

  public SlidingPaneLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public SlidingPaneLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout.LayoutParams
 * JD-Core Version:    0.6.2
 */