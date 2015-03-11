package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import textnow.g.k;

public class CompatTextView extends TextView
{
  public CompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.h, paramInt, 0);
    boolean bool = localTypedArray.getBoolean(0, false);
    localTypedArray.recycle();
    if (bool)
      setTransformationMethod(new r(paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.CompatTextView
 * JD-Core Version:    0.6.2
 */