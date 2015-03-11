package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class TintCheckBox extends CheckBox
{
  private static final int[] a = { 16843015 };
  private final al b;

  public TintCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842860);
  }

  public TintCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    setButtonDrawable(localao.a(0));
    localao.b();
    this.b = localao.c();
  }

  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(this.b.a(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintCheckBox
 * JD-Core Version:    0.6.2
 */