package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.af;
import android.support.v4.view.cd;
import android.support.v4.widget.y;
import android.support.v7.internal.widget.ListViewCompat;
import android.view.MotionEvent;
import android.view.View;
import textnow.g.b;

final class z extends ListViewCompat
{
  private boolean f;
  private boolean g;
  private boolean h;
  private cd i;
  private y j;

  public z(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, b.q);
    this.g = paramBoolean;
    setCacheColorHint(0);
  }

  protected final boolean a()
  {
    return (this.h) || (super.a());
  }

  public final boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int k = af.a(paramMotionEvent);
    int n;
    boolean bool2;
    switch (k)
    {
    default:
      n = 0;
    case 3:
      for (bool2 = true; ; bool2 = false)
      {
        label38: if ((!bool2) || (n != 0))
        {
          this.h = false;
          setPressed(false);
          drawableStateChanged();
          if (this.i != null)
          {
            this.i.a();
            this.i = null;
          }
        }
        if (!bool2)
          break;
        if (this.j == null)
          this.j = new y(this);
        this.j.a(true);
        this.j.onTouch(this, paramMotionEvent);
        label124: return bool2;
        n = 0;
      }
    case 1:
    case 2:
    }
    for (boolean bool1 = false; ; bool1 = true)
    {
      int m = paramMotionEvent.findPointerIndex(paramInt);
      if (m < 0)
      {
        n = 0;
        bool2 = false;
        break label38;
      }
      int i1 = (int)paramMotionEvent.getX(m);
      int i2 = (int)paramMotionEvent.getY(m);
      int i3 = pointToPosition(i1, i2);
      if (i3 == -1)
      {
        bool2 = bool1;
        n = 1;
        break label38;
      }
      View localView = getChildAt(i3 - getFirstVisiblePosition());
      float f1 = i1;
      float f2 = i2;
      this.h = true;
      setPressed(true);
      layoutChildren();
      setSelection(i3);
      a(i3, localView, f1, f2);
      a(false);
      refreshDrawableState();
      if (k != 1)
        break;
      performItemClick(localView, i3, getItemIdAtPosition(i3));
      break;
      if (this.j == null)
        break label124;
      this.j.a(false);
      return bool2;
    }
  }

  public final boolean hasFocus()
  {
    return (this.g) || (super.hasFocus());
  }

  public final boolean hasWindowFocus()
  {
    return (this.g) || (super.hasWindowFocus());
  }

  public final boolean isFocused()
  {
    return (this.g) || (super.isFocused());
  }

  public final boolean isInTouchMode()
  {
    return ((this.g) && (this.f)) || (super.isInTouchMode());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.z
 * JD-Core Version:    0.6.2
 */