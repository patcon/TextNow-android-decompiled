package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class ix
{
  public static Bitmap a(Bitmap paramBitmap)
  {
    int i = 0;
    if (paramBitmap == null)
      return null;
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    if (j >= k);
    for (int n = j / 2 - k / 2; ; n = 0)
    {
      Bitmap localBitmap = Bitmap.createBitmap(k, k, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint(1);
      localPaint.setColor(-16777216);
      localCanvas.drawCircle(k / 2, k / 2, k / 2, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, n, i, localPaint);
      return localBitmap;
      int m = k / 2 - j / 2;
      k = j;
      i = m;
    }
  }

  private static Bitmap a(Drawable paramDrawable)
  {
    if (paramDrawable == null)
      return null;
    if ((paramDrawable instanceof BitmapDrawable))
      return ((BitmapDrawable)paramDrawable).getBitmap();
    Bitmap localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
    paramDrawable.draw(localCanvas);
    return localBitmap;
  }

  public static Drawable a(Resources paramResources, Drawable paramDrawable)
  {
    return new BitmapDrawable(paramResources, a(a(paramDrawable)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ix
 * JD-Core Version:    0.6.2
 */