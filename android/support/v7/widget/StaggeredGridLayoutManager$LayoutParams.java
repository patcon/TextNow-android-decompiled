package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class StaggeredGridLayoutManager$LayoutParams extends RecyclerView.LayoutParams
{
  bm e;
  boolean f;

  public StaggeredGridLayoutManager$LayoutParams(int paramInt1, int paramInt2)
  {
    super(-2, -2);
  }

  public StaggeredGridLayoutManager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public StaggeredGridLayoutManager$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }

  public final int a()
  {
    if (this.e == null)
      return -1;
    return this.e.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams
 * JD-Core Version:    0.6.2
 */