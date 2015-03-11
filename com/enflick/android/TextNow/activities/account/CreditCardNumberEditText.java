package com.enflick.android.TextNow.activities.account;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;

public class CreditCardNumberEditText extends EditText
{
  private i a = i.g;
  private g b;
  private h c;
  private ColorStateList d;
  private d e = null;

  public CreditCardNumberEditText(Context paramContext)
  {
    super(paramContext);
  }

  public CreditCardNumberEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CreditCardNumberEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final d a()
  {
    return this.e;
  }

  public final void a(g paramg)
  {
    this.b = paramg;
  }

  public final void a(h paramh)
  {
    this.c = paramh;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
    addTextChangedListener(new f(this, (byte)0));
    this.d = getTextColors();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.CreditCardNumberEditText
 * JD-Core Version:    0.6.2
 */