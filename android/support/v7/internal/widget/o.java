package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class o
  implements AdapterView.OnItemClickListener
{
  private final n b;

  public o(l paraml, n paramn)
  {
    this.b = paramn;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    n localn = this.b;
    localn.a(paramView, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.o
 * JD-Core Version:    0.6.2
 */