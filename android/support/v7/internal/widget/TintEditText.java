package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class TintEditText extends EditText
{
  private static final int[] a = { 16842964 };

  public TintEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842862);
  }

  public TintEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    setBackgroundDrawable(localao.a(0));
    localao.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintEditText
 * JD-Core Version:    0.6.2
 */