package com.admarvel.android.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Date;

class m$k extends FrameLayout
{
  Bitmap a;
  Canvas b;
  long c = 0L;
  boolean d = false;
  boolean e = false;

  public m$k(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }

  private boolean a(MotionEvent paramMotionEvent)
  {
    try
    {
      int i;
      if (this.d)
      {
        b();
        if ((this.a != null) && (!this.a.isRecycled()) && (paramMotionEvent != null) && (paramMotionEvent.getX() >= 0.0F) && (paramMotionEvent.getX() < this.a.getWidth()) && (paramMotionEvent.getY() >= 0.0F) && (paramMotionEvent.getY() < this.a.getHeight()))
          i = Color.alpha(this.a.getPixel((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()));
      }
      return i <= 0;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private void b()
  {
    long l = new Date().getTime();
    if ((l - this.c > 500L) && (getWidth() > 0) && (getHeight() > 0))
    {
      if ((this.a == null) || (this.a.getWidth() != getWidth()) || (this.a.getHeight() != getHeight()))
      {
        if (this.a != null)
          this.a.recycle();
        this.a = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
      }
      this.b.drawColor(0, PorterDuff.Mode.CLEAR);
      draw(this.b);
      this.c = l;
    }
  }

  public void a()
  {
    if (this.a != null)
      this.a.recycle();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return a(paramMotionEvent);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.e)
      return true;
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.k
 * JD-Core Version:    0.6.2
 */