package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class ao
{
  private final Context a;
  private final TypedArray b;
  private al c;

  private ao(Context paramContext, TypedArray paramTypedArray)
  {
    this.a = paramContext;
    this.b = paramTypedArray;
  }

  public static ao a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new ao(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, 0));
  }

  public final float a(int paramInt, float paramFloat)
  {
    return this.b.getFloat(paramInt, -1.0F);
  }

  public final int a()
  {
    return this.b.length();
  }

  public final int a(int paramInt1, int paramInt2)
  {
    return this.b.getInt(paramInt1, paramInt2);
  }

  public final Drawable a(int paramInt)
  {
    if (this.b.hasValue(paramInt))
    {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return c().a(i);
    }
    return this.b.getDrawable(paramInt);
  }

  public final boolean a(int paramInt, boolean paramBoolean)
  {
    return this.b.getBoolean(paramInt, paramBoolean);
  }

  public final int b(int paramInt1, int paramInt2)
  {
    return this.b.getInteger(paramInt1, paramInt2);
  }

  public final CharSequence b(int paramInt)
  {
    return this.b.getText(paramInt);
  }

  public final void b()
  {
    this.b.recycle();
  }

  public final int c(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }

  public final al c()
  {
    if (this.c == null)
      this.c = new al(this.a);
    return this.c;
  }

  public final String c(int paramInt)
  {
    return this.b.getString(paramInt);
  }

  public final int d(int paramInt1, int paramInt2)
  {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }

  public final boolean d(int paramInt)
  {
    return this.b.hasValue(paramInt);
  }

  public final int e(int paramInt1, int paramInt2)
  {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }

  public final int f(int paramInt1, int paramInt2)
  {
    return this.b.getResourceId(paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ao
 * JD-Core Version:    0.6.2
 */