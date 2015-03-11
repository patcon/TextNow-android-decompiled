package android.support.v4.app;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;

public abstract class ck
{
  private Matrix a;

  public final Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    int i = Math.round(paramRectF.width());
    int j = Math.round(paramRectF.height());
    Bitmap localBitmap = null;
    if (i > 0)
    {
      localBitmap = null;
      if (j > 0)
      {
        if (this.a == null)
          this.a = new Matrix();
        this.a.set(paramMatrix);
        this.a.postTranslate(-paramRectF.left, -paramRectF.top);
        localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        localCanvas.concat(this.a);
        paramView.draw(localCanvas);
      }
    }
    return localBitmap;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ck
 * JD-Core Version:    0.6.2
 */