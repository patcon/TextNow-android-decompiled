package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

final class p extends DataSetObserver
{
  private Parcelable b = null;

  p(o paramo)
  {
  }

  public final void onChanged()
  {
    this.a.t = true;
    this.a.z = this.a.y;
    this.a.y = this.a.c().getCount();
    if ((this.a.c().hasStableIds()) && (this.b != null) && (this.a.z == 0) && (this.a.y > 0))
    {
      o.a(this.a, this.b);
      this.b = null;
    }
    while (true)
    {
      this.a.e();
      this.a.requestLayout();
      return;
      this.a.h();
    }
  }

  public final void onInvalidated()
  {
    this.a.t = true;
    if (this.a.c().hasStableIds())
      this.b = o.a(this.a);
    this.a.z = this.a.y;
    this.a.y = 0;
    this.a.w = -1;
    this.a.x = -9223372036854775808L;
    this.a.u = -1;
    this.a.v = -9223372036854775808L;
    this.a.o = false;
    this.a.e();
    this.a.requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.p
 * JD-Core Version:    0.6.2
 */