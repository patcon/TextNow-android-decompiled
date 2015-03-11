package android.support.v7.internal.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Spinner;

public class TintSpinner extends Spinner
{
  private static final int[] a = { 16842964, 16843126 };

  public TintSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842881);
  }

  public TintSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    setBackgroundDrawable(localao.a(0));
    if ((Build.VERSION.SDK_INT >= 16) && (localao.d(1)))
      setPopupBackgroundDrawable(localao.a(1));
    localao.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintSpinner
 * JD-Core Version:    0.6.2
 */