package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class o
  implements j
{
  final Activity a;
  s b;

  private o(Activity paramActivity)
  {
    this.a = paramActivity;
  }

  public final Drawable a()
  {
    return r.a(this.a);
  }

  public final void a(int paramInt)
  {
    this.b = r.a(this.b, this.a, paramInt);
  }

  public final void a(Drawable paramDrawable, int paramInt)
  {
    this.a.getActionBar().setDisplayShowHomeEnabled(true);
    this.b = r.a(this.a, paramDrawable, paramInt);
    this.a.getActionBar().setDisplayShowHomeEnabled(false);
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
 * Qualified Name:     android.support.v7.app.o
 * JD-Core Version:    0.6.2
 */