package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import textnow.g.l;

public class LinearLayoutCompat$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;

  public LinearLayoutCompat$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }

  public LinearLayoutCompat$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.U);
    this.g = localTypedArray.getFloat(l.W, 0.0F);
    this.h = localTypedArray.getInt(l.V, -1);
    localTypedArray.recycle();
  }

  public LinearLayoutCompat$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutCompat.LayoutParams
 * JD-Core Version:    0.6.2
 */