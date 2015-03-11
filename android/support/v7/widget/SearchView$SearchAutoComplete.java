package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.ao;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

public class SearchView$SearchAutoComplete extends AutoCompleteTextView
{
  private final int[] a = { 16843126 };
  private int b = getThreshold();
  private SearchView c;
  private final al d;

  public SearchView$SearchAutoComplete(Context paramContext)
  {
    this(paramContext, null);
  }

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842859);
  }

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, this.a, paramInt, 0);
    if (localao.d(0))
      setDropDownBackgroundDrawable(localao.a(0));
    localao.b();
    this.d = localao.c();
  }

  final void a(SearchView paramSearchView)
  {
    this.c = paramSearchView;
  }

  public boolean enoughToFilter()
  {
    return (this.b <= 0) || (super.enoughToFilter());
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.c.c();
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        KeyEvent.DispatcherState localDispatcherState2 = getKeyDispatcherState();
        if (localDispatcherState2 != null)
          localDispatcherState2.startTracking(paramKeyEvent, this);
        return true;
      }
      if (paramKeyEvent.getAction() == 1)
      {
        KeyEvent.DispatcherState localDispatcherState1 = getKeyDispatcherState();
        if (localDispatcherState1 != null)
          localDispatcherState1.handleUpEvent(paramKeyEvent);
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          this.c.clearFocus();
          SearchView.a(this.c, false);
          return true;
        }
      }
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (this.c.hasFocus()) && (getVisibility() == 0))
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
      if (SearchView.a(getContext()))
        SearchView.a.a(this, true);
    }
  }

  public void performCompletion()
  {
  }

  protected void replaceText(CharSequence paramCharSequence)
  {
  }

  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(this.d.a(paramInt));
  }

  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    this.b = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.SearchAutoComplete
 * JD-Core Version:    0.6.2
 */