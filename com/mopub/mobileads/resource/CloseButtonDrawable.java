package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Point;

public class CloseButtonDrawable extends CircleDrawable
{
  private Point bottomLeftPoint;
  private Point bottomRightPoint;
  private Point centerPoint;
  private final Paint closeButtonPaint = new Paint(getPaint());
  private int mDisplacement;
  private Point topLeftPoint;
  private Point topRightPoint;

  public CloseButtonDrawable()
  {
    this.closeButtonPaint.setStrokeWidth(4.5F);
    this.closeButtonPaint.setStrokeCap(Paint.Cap.ROUND);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    this.mDisplacement = ((int)(0.5F * getRadius() / (float)Math.sqrt(2.0D)));
    this.centerPoint = new Point(getCenterX(), getCenterY());
    this.bottomLeftPoint = new Point(this.centerPoint);
    this.bottomLeftPoint.offset(-this.mDisplacement, this.mDisplacement);
    this.topLeftPoint = new Point(this.centerPoint);
    this.topLeftPoint.offset(-this.mDisplacement, -this.mDisplacement);
    this.topRightPoint = new Point(this.centerPoint);
    this.topRightPoint.offset(this.mDisplacement, -this.mDisplacement);
    this.bottomRightPoint = new Point(this.centerPoint);
    this.bottomRightPoint.offset(this.mDisplacement, this.mDisplacement);
    paramCanvas.drawLine(this.bottomLeftPoint.x, this.bottomLeftPoint.y, this.topRightPoint.x, this.topRightPoint.y, this.closeButtonPaint);
    paramCanvas.drawLine(this.topLeftPoint.x, this.topLeftPoint.y, this.bottomRightPoint.x, this.bottomRightPoint.y, this.closeButtonPaint);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.resource.CloseButtonDrawable
 * JD-Core Version:    0.6.2
 */