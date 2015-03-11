package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import textnow.g.c;

public class ActionBarOverlayLayout extends FrameLayout
{
  static final int[] a = arrayOfInt;
  private int b;
  private ActionBar c;
  private final Rect d = new Rect(0, 0, 0, 0);

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = c.a;
  }

  public ActionBarOverlayLayout(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  private void a()
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(a);
    this.b = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
  }

  public final void a(ActionBar paramActionBar)
  {
    this.c = paramActionBar;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.2
 */