package android.support.v7.app;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarView;

final class g
  implements android.support.v4.app.f
{
  private g(f paramf)
  {
  }

  public final Drawable a()
  {
    TypedArray localTypedArray = this.a.a.obtainStyledAttributes(f.m());
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public final void a(Drawable paramDrawable)
  {
    if (f.b(this.a) != null)
      f.b(this.a).a(paramDrawable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.g
 * JD-Core Version:    0.6.2
 */