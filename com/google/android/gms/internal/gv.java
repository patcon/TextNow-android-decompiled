package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class gv extends ImageView
{
  private Uri FO;
  private int FP;
  private int FQ;
  private gv.a FR;

  public final void al(int paramInt)
  {
    this.FP = paramInt;
  }

  public final int fi()
  {
    return this.FP;
  }

  public final void g(Uri paramUri)
  {
    this.FO = paramUri;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.FR != null)
      paramCanvas.clipPath(this.FR.d(getWidth(), getHeight()));
    super.onDraw(paramCanvas);
    if (this.FQ != 0)
      paramCanvas.drawColor(this.FQ);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gv
 * JD-Core Version:    0.6.2
 */