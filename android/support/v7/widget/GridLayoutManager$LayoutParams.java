package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class GridLayoutManager$LayoutParams extends RecyclerView.LayoutParams
{
  private int e = -1;
  private int f = 0;

  public GridLayoutManager$LayoutParams(int paramInt1, int paramInt2)
  {
    super(-2, -2);
  }

  public GridLayoutManager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public GridLayoutManager$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public GridLayoutManager$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }

  public final int a()
  {
    return this.e;
  }

  public final int b()
  {
    return this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayoutManager.LayoutParams
 * JD-Core Version:    0.6.2
 */