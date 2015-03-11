package com.enflick.android.TextNow.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.enflick.android.TextNow.b;
import textnow.v.z;

public class CircularImageView extends ImageView
{
  private int a = -1;
  private Paint b;
  private int c;
  private boolean d = false;

  public CircularImageView(Context paramContext)
  {
    super(paramContext);
    if (!isInEditMode())
      a(paramContext, null);
  }

  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    Drawable localDrawable;
    if (paramAttributeSet != null)
    {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.i);
      this.d = localTypedArray.getBoolean(0, false);
      if (this.d)
      {
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        int i = localTypedArray.getDimensionPixelOffset(2, z.a(getContext(), 2));
        this.c = i;
        this.b.setStrokeWidth(i);
        invalidate();
        b(localTypedArray.getColor(1, 0));
      }
      this.a = localTypedArray.getColor(3, this.a);
      localDrawable = getResources().getDrawable(2130837707);
      if ((this.a != -1) && (this.a != 16777215))
      {
        if (Build.VERSION.SDK_INT >= 16)
          break label164;
        setBackgroundDrawable(localDrawable);
      }
    }
    while (true)
    {
      localTypedArray.recycle();
      return;
      label164: setBackground(localDrawable);
    }
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
    if ((this.a != -1) && (this.a != 16777215))
    {
      if (Build.VERSION.SDK_INT < 16)
        setBackgroundDrawable(getBackground());
    }
    else
      return;
    setBackground(getBackground());
  }

  public final void a(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
  }

  public final void b(int paramInt)
  {
    if (this.b != null)
      this.b.setColor(paramInt);
    invalidate();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.d)
      if (getWidth() <= 0)
        break label52;
    label52: for (int i = getWidth(); ; i = z.a(getContext(), 56))
    {
      paramCanvas.drawCircle(i / 2, i / 2, i / 2 - this.c / 2, this.b);
      return;
    }
  }

  @TargetApi(16)
  public void setBackground(Drawable paramDrawable)
  {
    if ((paramDrawable != null) && (this.a != -1) && (this.a != 16777215))
      paramDrawable.mutate().setColorFilter(this.a, PorterDuff.Mode.MULTIPLY);
    super.setBackground(paramDrawable);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    if ((paramDrawable != null) && (this.a != -1) && (this.a != 16777215))
      paramDrawable.mutate().setColorFilter(this.a, PorterDuff.Mode.MULTIPLY);
    super.setBackgroundDrawable(paramDrawable);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    int j;
    if ((paramDrawable instanceof TransitionDrawable))
      j = -1 + ((TransitionDrawable)paramDrawable).getNumberOfLayers();
    for (Object localObject = ((TransitionDrawable)paramDrawable).getDrawable(j); ; localObject = paramDrawable)
    {
      Bitmap localBitmap1;
      if (localObject != null)
      {
        localBitmap1 = ((BitmapDrawable)localObject).getBitmap();
        if (getWidth() <= 0)
          break label267;
      }
      label267: for (int i = getWidth(); ; i = z.a(getContext(), 56))
      {
        if ((localBitmap1.getWidth() != i) || (localBitmap1.getHeight() != i))
        {
          float f = Math.min(localBitmap1.getWidth(), localBitmap1.getHeight()) / i;
          localBitmap1 = Bitmap.createScaledBitmap(localBitmap1, (int)(localBitmap1.getWidth() / f), (int)(localBitmap1.getHeight() / f), false);
        }
        Bitmap localBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap2);
        Paint localPaint = new Paint();
        Rect localRect = new Rect(0, 0, i, i);
        localPaint.setAntiAlias(true);
        localPaint.setFilterBitmap(true);
        localPaint.setDither(true);
        localCanvas.drawARGB(0, 0, 0, 0);
        localPaint.setColor(Color.parseColor("#BAB399"));
        localCanvas.drawCircle(i / 2, i / 2, i / 2, localPaint);
        localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        localCanvas.drawBitmap(localBitmap1, localRect, localRect, localPaint);
        localObject = new BitmapDrawable(getResources(), localBitmap2);
        super.setImageDrawable((Drawable)localObject);
        return;
      }
    }
  }

  public void setImageResource(int paramInt)
  {
    setImageDrawable(getContext().getResources().getDrawable(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.CircularImageView
 * JD-Core Version:    0.6.2
 */