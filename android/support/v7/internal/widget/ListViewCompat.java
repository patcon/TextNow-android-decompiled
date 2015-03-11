package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import textnow.a.a;

public class ListViewCompat extends ListView
{
  private static final int[] f = { 0 };
  final Rect a = new Rect();
  int b = 0;
  int c = 0;
  int d = 0;
  int e = 0;
  private Field g;
  private y h;

  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      this.g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.g.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
    }
  }

  private void a(int paramInt, View paramView)
  {
    Rect localRect = this.a;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    localRect.left -= this.b;
    localRect.top -= this.c;
    localRect.right += this.d;
    localRect.bottom += this.e;
    try
    {
      boolean bool1 = this.g.getBoolean(this);
      Field localField;
      if (paramView.isEnabled() != bool1)
      {
        localField = this.g;
        if (bool1)
          break label131;
      }
      label131: for (boolean bool2 = true; ; bool2 = false)
      {
        localField.set(this, Boolean.valueOf(bool2));
        if (paramInt != -1)
          refreshDrawableState();
        return;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localIllegalAccessException.printStackTrace();
    }
  }

  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = i + j;
      return paramInt2;
    }
    int m = j + i;
    label70: int i1;
    View localView1;
    label88: View localView2;
    label120: int i4;
    if ((k > 0) && (localDrawable != null))
    {
      int n = localListAdapter.getCount();
      i1 = 0;
      int i2 = 0;
      localView1 = null;
      if (i1 >= n)
        break label224;
      int i3 = localListAdapter.getItemViewType(i1);
      if (i3 == i2)
        break label227;
      i2 = i3;
      localView2 = null;
      localView1 = localListAdapter.getView(i1, localView2, this);
      ViewGroup.LayoutParams localLayoutParams = localView1.getLayoutParams();
      if ((localLayoutParams == null) || (localLayoutParams.height <= 0))
        break label214;
      i4 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
      label166: localView1.measure(paramInt1, i4);
      if (i1 <= 0)
        break label234;
    }
    label214: label224: label227: label234: for (int i5 = m + k; ; i5 = m)
    {
      m = i5 + localView1.getMeasuredHeight();
      if (m >= paramInt2)
        break;
      i1++;
      break label88;
      k = 0;
      break label70;
      i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label166;
      return m;
      localView2 = localView1;
      break label120;
    }
  }

  protected final void a(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    Drawable localDrawable1 = getSelector();
    boolean bool2;
    float f1;
    float f2;
    if ((localDrawable1 != null) && (paramInt != -1))
    {
      bool2 = bool1;
      if (bool2)
        localDrawable1.setVisible(false, false);
      a(paramInt, paramView);
      if (bool2)
      {
        Rect localRect = this.a;
        f1 = localRect.exactCenterX();
        f2 = localRect.exactCenterY();
        if (getVisibility() != 0)
          break label123;
      }
    }
    while (true)
    {
      localDrawable1.setVisible(bool1, false);
      a.a(localDrawable1, f1, f2);
      Drawable localDrawable2 = getSelector();
      if ((localDrawable2 != null) && (paramInt != -1))
        a.a(localDrawable2, paramFloat1, paramFloat2);
      return;
      bool2 = false;
      break;
      label123: bool1 = false;
    }
  }

  protected final void a(boolean paramBoolean)
  {
    this.h.a(false);
  }

  protected boolean a()
  {
    return false;
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!this.a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      localDrawable.setBounds(this.a);
      localDrawable.draw(paramCanvas);
    }
    super.dispatchDraw(paramCanvas);
  }

  protected void drawableStateChanged()
  {
    boolean bool = true;
    super.drawableStateChanged();
    this.h.a(bool);
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
      if ((!a()) || (!isPressed()))
        break label51;
    while (true)
    {
      if (bool)
        localDrawable.setState(getDrawableState());
      return;
      label51: bool = false;
    }
  }

  public void setSelector(Drawable paramDrawable)
  {
    this.h = new y(paramDrawable);
    super.setSelector(this.h);
    Rect localRect = new Rect();
    paramDrawable.getPadding(localRect);
    this.b = localRect.left;
    this.c = localRect.top;
    this.d = localRect.right;
    this.e = localRect.bottom;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ListViewCompat
 * JD-Core Version:    0.6.2
 */