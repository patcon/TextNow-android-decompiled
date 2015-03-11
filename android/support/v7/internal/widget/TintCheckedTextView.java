package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class TintCheckedTextView extends CheckedTextView
{
  private static final int[] a = { 16843016 };
  private final al b;

  public TintCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }

  public TintCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    setCheckMarkDrawable(localao.a(0));
    localao.b();
    this.b = localao.c();
  }

  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(this.b.a(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintCheckedTextView
 * JD-Core Version:    0.6.2
 */