package com.mopub.mobileads.resource;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Point;

public class LearnMoreDrawable extends CircleDrawable
{
  private Point bottomLeftPoint;
  private Point centerPoint;
  private final Paint learnMorePaint = new Paint(getPaint());
  private Point leftBarbPoint;
  private int mBarbLength;
  private int mDisplacement;
  private Point rightBarbPoint;
  private Point topRightPoint;

  public LearnMoreDrawable()
  {
    this.learnMorePaint.setStrokeWidth(4.5F);
    this.learnMorePaint.setStrokeCap(Paint.Cap.ROUND);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    this.mDisplacement = ((int)(0.5F * getRadius() / Math.sqrt(2.0D)));
    this.mBarbLength = ((int)(1.5F * this.mDisplacement));
    this.centerPoint = new Point(getCenterX(), getCenterY());
    this.bottomLeftPoint = new Point(this.centerPoint);
    this.bottomLeftPoint.offset(-this.mDisplacement, this.mDisplacement);
    this.topRightPoint = new Point(this.centerPoint);
    this.topRightPoint.offset(this.mDisplacement, -this.mDisplacement);
    this.leftBarbPoint = new Point(this.topRightPoint);
    this.leftBarbPoint.offset(-this.mBarbLength, 0);
    this.rightBarbPoint = new Point(this.topRightPoint);
    this.rightBarbPoint.offset(0, this.mBarbLength);
    paramCanvas.drawLine(this.bottomLeftPoint.x, this.bottomLeftPoint.y, this.topRightPoint.x, this.topRightPoint.y, this.learnMorePaint);
    paramCanvas.drawLine(this.topRightPoint.x, this.topRightPoint.y, this.leftBarbPoint.x, this.leftBarbPoint.y, this.learnMorePaint);
    paramCanvas.drawLine(this.topRightPoint.x, this.topRightPoint.y, this.rightBarbPoint.x, this.rightBarbPoint.y, this.learnMorePaint);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.resource.LearnMoreDrawable
 * JD-Core Version:    0.6.2
 */