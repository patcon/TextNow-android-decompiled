package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public abstract class CircleDrawable extends Drawable
{
  private final Paint mPaint = new Paint();

  public CircleDrawable()
  {
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStrokeWidth(3.0F);
    this.mPaint.setColor(-1);
    this.mPaint.setStyle(Paint.Style.STROKE);
  }

  public void draw(Canvas paramCanvas)
  {
    paramCanvas.drawCircle(getCenterX(), getCenterY(), getRadius(), this.mPaint);
  }

  protected int getCenterX()
  {
    return getBounds().width() / 2;
  }

  protected int getCenterY()
  {
    return getBounds().height() / 2;
  }

  public int getOpacity()
  {
    return 0;
  }

  protected Paint getPaint()
  {
    return this.mPaint;
  }

  protected int getRadius()
  {
    return Math.min(getCenterX(), getCenterY());
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.resource.CircleDrawable
 * JD-Core Version:    0.6.2
 */