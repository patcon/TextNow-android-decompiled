package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import textnow.g.l;

public final class ViewStubCompat extends View
{
  private int a = 0;
  private int b;
  private WeakReference<View> c;
  private LayoutInflater d;
  private aq e;

  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.cg, paramInt, 0);
    this.b = localTypedArray.getResourceId(l.ci, -1);
    this.a = localTypedArray.getResourceId(l.cj, 0);
    setId(localTypedArray.getResourceId(l.ch, -1));
    localTypedArray.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }

  public final View a()
  {
    ViewParent localViewParent = getParent();
    if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
    {
      if (this.a != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localViewParent;
        LayoutInflater localLayoutInflater;
        View localView;
        int i;
        if (this.d != null)
        {
          localLayoutInflater = this.d;
          localView = localLayoutInflater.inflate(this.a, localViewGroup, false);
          if (this.b != -1)
            localView.setId(this.b);
          i = localViewGroup.indexOfChild(this);
          localViewGroup.removeViewInLayout(this);
          ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
          if (localLayoutParams == null)
            break label141;
          localViewGroup.addView(localView, i, localLayoutParams);
        }
        while (true)
        {
          this.c = new WeakReference(localView);
          if (this.e != null);
          return localView;
          localLayoutInflater = LayoutInflater.from(getContext());
          break;
          label141: localViewGroup.addView(localView, i);
        }
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }

  public final void a(LayoutInflater paramLayoutInflater)
  {
    this.d = paramLayoutInflater;
  }

  protected final void dispatchDraw(Canvas paramCanvas)
  {
  }

  public final void draw(Canvas paramCanvas)
  {
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }

  public final void setVisibility(int paramInt)
  {
    if (this.c != null)
    {
      View localView = (View)this.c.get();
      if (localView != null)
        localView.setVisibility(paramInt);
    }
    do
    {
      return;
      throw new IllegalStateException("setVisibility called on un-referenced view");
      super.setVisibility(paramInt);
    }
    while ((paramInt != 0) && (paramInt != 4));
    a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ViewStubCompat
 * JD-Core Version:    0.6.2
 */