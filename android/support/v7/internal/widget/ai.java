package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

final class ai extends ListPopupWindow
  implements aj
{
  private CharSequence c;
  private ListAdapter d;

  public ai(final SpinnerCompat paramSpinnerCompat, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramSpinnerCompat);
    a(true);
    a(0);
    a(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramSpinnerCompat.a(paramAnonymousInt);
        if (paramSpinnerCompat.s != null)
          paramSpinnerCompat.a(paramAnonymousView, paramAnonymousInt, ai.a(ai.this).getItemId(paramAnonymousInt));
        ai.this.a();
      }
    });
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ai
 * JD-Core Version:    0.6.2
 */