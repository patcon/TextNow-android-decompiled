package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

final class ak extends v
{
  private final ColorStateList a;
  private final PorterDuff.Mode b;
  private int c;

  public ak(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    this(paramDrawable, paramColorStateList, al.a);
  }

  public ak(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    super(paramDrawable);
    this.a = paramColorStateList;
    this.b = paramMode;
  }

  public final boolean isStateful()
  {
    return ((this.a != null) && (this.a.isStateful())) || (super.isStateful());
  }

  public final boolean setState(int[] paramArrayOfInt)
  {
    boolean bool1 = super.setState(paramArrayOfInt);
    if (this.a != null)
    {
      int j = this.a.getColorForState(paramArrayOfInt, this.c);
      if (j != this.c)
        if (j != 0)
        {
          setColorFilter(j, this.b);
          this.c = j;
        }
    }
    for (int i = 1; ; i = 0)
    {
      boolean bool2;
      if (i == 0)
      {
        bool2 = false;
        if (!bool1);
      }
      else
      {
        bool2 = true;
      }
      return bool2;
      clearColorFilter();
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ak
 * JD-Core Version:    0.6.2
 */