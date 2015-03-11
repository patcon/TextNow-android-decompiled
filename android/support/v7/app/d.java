package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class d
  implements j
{
  private d(c paramc)
  {
  }

  public final Drawable a()
  {
    Context localContext = this.a.i();
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = this.a.h();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(arrayOfInt);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public final void a(int paramInt)
  {
    ActionBar localActionBar = this.a.b();
    if (localActionBar != null)
      localActionBar.b(paramInt);
  }

  public final void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.a.b();
    if (localActionBar != null)
    {
      localActionBar.b(paramDrawable);
      localActionBar.b(paramInt);
    }
  }

  public final Context b()
  {
    return this.a.i();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.d
 * JD-Core Version:    0.6.2
 */