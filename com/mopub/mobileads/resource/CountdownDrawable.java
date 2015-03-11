package com.mopub.mobileads.resource;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import com.mopub.common.util.Dips;

public class CountdownDrawable extends CircleDrawable
  implements TextDrawable
{
  private static final float TEXT_SIZE_SP = 18.0F;
  private String mSecondsRemaining = "";
  private final Paint mTextPaint = new Paint();
  private Rect mTextRect;
  private final float textSizePixels;

  public CountdownDrawable(Context paramContext)
  {
    this.textSizePixels = Dips.dipsToFloatPixels(18.0F, paramContext);
    this.mTextPaint.setTextSize(this.textSizePixels);
    this.mTextPaint.setAntiAlias(true);
    this.mTextPaint.setColor(-1);
    this.mTextPaint.setStyle(Paint.Style.FILL);
    this.mTextPaint.setTextAlign(Paint.Align.LEFT);
    this.mTextRect = new Rect();
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    String str = String.valueOf(this.mSecondsRemaining);
    this.mTextPaint.getTextBounds(str, 0, str.length(), this.mTextRect);
    int i = getCenterX() - this.mTextRect.width() / 2;
    int j = getCenterY() + this.mTextRect.height() / 2;
    paramCanvas.drawText(str, i, j, this.mTextPaint);
  }

  public void updateText(String paramString)
  {
    if (!this.mSecondsRemaining.equals(paramString))
    {
      this.mSecondsRemaining = paramString;
      invalidateSelf();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.resource.CountdownDrawable
 * JD-Core Version:    0.6.2
 */