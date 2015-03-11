package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TintImageView extends ImageView
{
  private static final int[] a = { 16842964, 16843033 };
  private final al b;

  public TintImageView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TintImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TintImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (localao.a() > 0)
    {
      if (localao.d(0))
        setBackgroundDrawable(localao.a(0));
      if (localao.d(1))
        setImageDrawable(localao.a(1));
    }
    localao.b();
    this.b = localao.c();
  }

  public void setImageResource(int paramInt)
  {
    setImageDrawable(this.b.a(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.TintImageView
 * JD-Core Version:    0.6.2
 */