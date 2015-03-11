package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public int a = 0;
  float b;
  boolean c;
  boolean d;

  public DrawerLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(-1, -1);
  }

  public DrawerLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.b());
    this.a = localTypedArray.getInt(0, 0);
    localTypedArray.recycle();
  }

  public DrawerLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = paramLayoutParams.a;
  }

  public DrawerLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public DrawerLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout.LayoutParams
 * JD-Core Version:    0.6.2
 */