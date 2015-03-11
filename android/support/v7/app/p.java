package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class p
  implements j
{
  final Activity a;

  private p(Activity paramActivity)
  {
    this.a = paramActivity;
  }

  public final Drawable a()
  {
    TypedArray localTypedArray = b().obtainStyledAttributes(null, new int[] { 16843531 }, 16843470, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public final void a(int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null)
      localActionBar.setHomeActionContentDescription(paramInt);
  }

  public final void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }

  public final Context b()
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null)
      return localActionBar.getThemedContext();
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.p
 * JD-Core Version:    0.6.2
 */