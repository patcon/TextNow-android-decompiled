package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView
  implements ac, p, AdapterView.OnItemClickListener
{
  private n a;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
  }

  public final void a(n paramn)
  {
    this.a = paramn;
  }

  public final boolean a(r paramr)
  {
    return this.a.a(paramr, 0);
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((r)getAdapter().getItem(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.2
 */