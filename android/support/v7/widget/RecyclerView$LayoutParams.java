package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class RecyclerView$LayoutParams extends ViewGroup.MarginLayoutParams
{
  be a;
  final Rect b = new Rect();
  boolean c = true;
  boolean d = false;

  public RecyclerView$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }

  public RecyclerView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public RecyclerView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public RecyclerView$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public RecyclerView$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }

  public final boolean c()
  {
    return this.a.l();
  }

  public final boolean d()
  {
    return this.a.j();
  }

  public final int e()
  {
    return this.a.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.LayoutParams
 * JD-Core Version:    0.6.2
 */