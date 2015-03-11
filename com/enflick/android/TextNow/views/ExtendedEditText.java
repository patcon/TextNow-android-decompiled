package com.enflick.android.TextNow.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.BaseSavedState;
import android.widget.EditText;

public class ExtendedEditText extends EditText
{
  private e a;

  public ExtendedEditText(Context paramContext)
  {
    super(paramContext);
  }

  public ExtendedEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ExtendedEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(e parame)
  {
    this.a = parame;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (Build.VERSION.SDK_INT >= 11)
      setCustomSelectionActionModeCallback(null);
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.a != null))
      this.a.z();
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }

  public Parcelable onSaveInstanceState()
  {
    try
    {
      Parcelable localParcelable = super.onSaveInstanceState();
      return localParcelable;
    }
    catch (Exception localException)
    {
    }
    return View.BaseSavedState.EMPTY_STATE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.ExtendedEditText
 * JD-Core Version:    0.6.2
 */