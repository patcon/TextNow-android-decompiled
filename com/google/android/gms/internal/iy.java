package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class iy extends ImageView
{
  private Uri Lj;
  private int Lk;
  private int Ll;
  private iy.a Lm;
  private int Ln;
  private float Lo;

  public final void ay(int paramInt)
  {
    this.Lk = paramInt;
  }

  public final void g(Uri paramUri)
  {
    this.Lj = paramUri;
  }

  public final int gM()
  {
    return this.Lk;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.Lm != null)
      paramCanvas.clipPath(this.Lm.g(getWidth(), getHeight()));
    super.onDraw(paramCanvas);
    if (this.Ll != 0)
      paramCanvas.drawColor(this.Ll);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j;
    int i;
    switch (this.Ln)
    {
    default:
      return;
    case 1:
      j = getMeasuredHeight();
      i = (int)(j * this.Lo);
    case 2:
    }
    while (true)
    {
      setMeasuredDimension(i, j);
      return;
      i = getMeasuredWidth();
      j = (int)(i / this.Lo);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iy
 * JD-Core Version:    0.6.2
 */