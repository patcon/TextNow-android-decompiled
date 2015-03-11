package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import textnow.al.a;

public class n extends ListView
  implements a
{
  private boolean b = false;

  public n(PullToRefreshListView paramPullToRefreshListView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(View paramView)
  {
    super.setEmptyView(paramView);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    try
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.printStackTrace();
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      localIndexOutOfBoundsException.printStackTrace();
    }
    return false;
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if ((PullToRefreshListView.a(this.a) != null) && (!this.b))
    {
      addFooterView(PullToRefreshListView.a(this.a), null, false);
      this.b = true;
    }
    super.setAdapter(paramListAdapter);
  }

  public void setEmptyView(View paramView)
  {
    this.a.a(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.n
 * JD-Core Version:    0.6.2
 */