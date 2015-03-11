package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import textnow.g.l;
import textnow.j.a;

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
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.I, paramInt, 0);
    boolean bool = localTypedArray.getBoolean(l.J, false);
    localTypedArray.recycle();
    if (bool)
      setTransformationMethod(new a(paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.CompatTextView
 * JD-Core Version:    0.6.2
 */