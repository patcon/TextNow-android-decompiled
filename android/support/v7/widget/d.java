package android.support.v7.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintImageView;
import android.view.View;
import textnow.a.a;
import textnow.g.b;

final class d extends TintImageView
  implements g
{
  private final float[] b = new float[2];

  public d(final ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, b.k);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    setOnTouchListener(new aa(this)
    {
      public final ListPopupWindow a()
      {
        if (ActionMenuPresenter.a(paramActionMenuPresenter) == null)
          return null;
        return ActionMenuPresenter.a(paramActionMenuPresenter).c();
      }

      public final boolean b()
      {
        paramActionMenuPresenter.d();
        return true;
      }

      public final boolean c()
      {
        if (ActionMenuPresenter.b(paramActionMenuPresenter) != null)
          return false;
        paramActionMenuPresenter.e();
        return true;
      }
    });
  }

  public final boolean d()
  {
    return false;
  }

  public final boolean e()
  {
    return false;
  }

  public final boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.a.d();
    return true;
  }

  protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      float[] arrayOfFloat = this.b;
      arrayOfFloat[0] = localDrawable1.getBounds().centerX();
      getImageMatrix().mapPoints(arrayOfFloat);
      int i = (int)arrayOfFloat[0] - getWidth() / 2;
      a.a(localDrawable2, i, 0, i + getWidth(), getHeight());
    }
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.d
 * JD-Core Version:    0.6.2
 */