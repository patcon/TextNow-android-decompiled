package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.widget.ao;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView
  implements k, x, AdapterView.OnItemClickListener
{
  private static final int[] a = { 16842964, 16843049 };
  private i b;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (localao.d(0))
      setBackgroundDrawable(localao.a(0));
    if (localao.d(1))
      setDivider(localao.a(1));
    localao.b();
  }

  public final void a(i parami)
  {
    this.b = parami;
  }

  public final boolean a(m paramm)
  {
    return this.b.a(paramm, 0);
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((m)getAdapter().getItem(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.2
 */