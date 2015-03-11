package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class e extends OvalShape
{
  private RadialGradient b;
  private int c;
  private Paint d = new Paint();
  private int e;

  public e(d paramd, int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.e = paramInt2;
    this.b = new RadialGradient(this.e / 2, this.e / 2, this.c, new int[] { 1023410176, 0 }, null, Shader.TileMode.CLAMP);
    this.d.setShader(this.b);
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.a.getWidth();
    int j = this.a.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.e / 2 + this.c, this.d);
    paramCanvas.drawCircle(i / 2, j / 2, this.e / 2, paramPaint);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.2
 */