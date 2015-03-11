package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

final class af extends ListPopupWindow
  implements ag
{
  private CharSequence c;
  private ListAdapter d;

  public af(final ac paramac, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramac);
    a(true);
    a(0);
    a(new o(paramac, new n()
    {
      public final void a(View paramAnonymousView, int paramAnonymousInt)
      {
        af.this.b.a(paramAnonymousInt);
        if (af.this.b.t != null)
          af.this.b.a(paramAnonymousView, paramAnonymousInt, af.a(af.this).getItemId(paramAnonymousInt));
        af.this.d();
      }
    }));
  }

  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.d = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }

  public final void c()
  {
    int i = this.b.getPaddingLeft();
    if (this.b.E == -2)
    {
      int n = this.b.getWidth();
      int i1 = this.b.getPaddingRight();
      d(Math.max(this.b.a((SpinnerAdapter)this.d, a()), n - i - i1));
    }
    while (true)
    {
      Drawable localDrawable = a();
      int j = 0;
      if (localDrawable != null)
      {
        localDrawable.getPadding(ac.a(this.b));
        j = -ac.a(this.b).left;
      }
      b(j + i);
      e(2);
      super.c();
      h().setChoiceMode(1);
      f(this.b.d());
      return;
      if (this.b.E == -1)
      {
        int k = this.b.getWidth();
        int m = this.b.getPaddingRight();
        d(k - i - m);
      }
      else
      {
        d(this.b.E);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.af
 * JD-Core Version:    0.6.2
 */