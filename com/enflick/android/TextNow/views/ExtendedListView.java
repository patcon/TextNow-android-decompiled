package com.enflick.android.TextNow.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class ExtendedListView extends ListView
{
  public ExtendedListView(Context paramContext)
  {
    super(paramContext);
  }

  public ExtendedListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ExtendedListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    try
    {
      super.dispatchDraw(paramCanvas);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.ExtendedListView
 * JD-Core Version:    0.6.2
 */