package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class ExtendedEditText extends EditText
{
  private d a;

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

  public final void a(d paramd)
  {
    this.a = paramd;
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (this.a != null))
      this.a.y();
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.ExtendedEditText
 * JD-Core Version:    0.6.2
 */