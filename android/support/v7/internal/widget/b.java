package android.support.v7.internal.widget;

import android.support.v4.view.cd;
import android.support.v4.view.cp;
import android.support.v7.widget.ActionMenuView;
import android.view.View;

public final class b
  implements cp
{
  int a;
  private boolean c = false;

  protected b(a parama)
  {
  }

  public final b a(cd paramcd, int paramInt)
  {
    this.b.h = paramcd;
    this.a = paramInt;
    return this;
  }

  public final void a(View paramView)
  {
    this.b.setVisibility(0);
    this.c = false;
  }

  public final void b(View paramView)
  {
    if (this.c);
    do
    {
      return;
      this.b.h = null;
      this.b.setVisibility(this.a);
    }
    while ((this.b.e == null) || (this.b.c == null));
    this.b.c.setVisibility(this.a);
  }

  public final void c(View paramView)
  {
    this.c = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.b
 * JD-Core Version:    0.6.2
 */