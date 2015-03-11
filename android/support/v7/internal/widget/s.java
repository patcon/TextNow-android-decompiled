package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import textnow.g.c;

final class s extends ListView
{
  private boolean a;
  private boolean b;

  public s(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, c.h);
    this.b = paramBoolean;
    setCacheColorHint(0);
  }

  final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = i + j;
      return paramInt2;
    }
    int m = j + i;
    label70: int i1;
    View localView1;
    label88: View localView2;
    label120: int i5;
    if ((k > 0) && (localDrawable != null))
    {
      int n = localListAdapter.getCount();
      i1 = 0;
      int i2 = 0;
      localView1 = null;
      if (i1 >= n)
        break label216;
      int i3 = localListAdapter.getItemViewType(i1);
      if (i3 == i2)
        break label219;
      i2 = i3;
      localView2 = null;
      localView1 = localListAdapter.getView(i1, localView2, this);
      int i4 = localView1.getLayoutParams().height;
      if (i4 <= 0)
        break label206;
      i5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
      label158: localView1.measure(paramInt1, i5);
      if (i1 <= 0)
        break label226;
    }
    label206: label216: label219: label226: for (int i6 = m + k; ; i6 = m)
    {
      m = i6 + localView1.getMeasuredHeight();
      if (m >= paramInt2)
        break;
      i1++;
      break label88;
      k = 0;
      break label70;
      i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label158;
      return m;
      localView2 = localView1;
      break label120;
    }
  }

  public final boolean hasFocus()
  {
    return (this.b) || (super.hasFocus());
  }

  public final boolean hasWindowFocus()
  {
    return (this.b) || (super.hasWindowFocus());
  }

  public final boolean isFocused()
  {
    return (this.b) || (super.isFocused());
  }

  public final boolean isInTouchMode()
  {
    return ((this.b) && (this.a)) || (super.isInTouchMode());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.s
 * JD-Core Version:    0.6.2
 */