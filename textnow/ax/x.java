package textnow.ax;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.tremorvideo.sdk.android.videoad.r;

public final class x extends View
{
  aj a;

  public x(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(aj paramaj)
  {
    this.a = paramaj;
  }

  protected final int getSuggestedMinimumHeight()
  {
    return 0;
  }

  protected final int getSuggestedMinimumWidth()
  {
    return 0;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    paramCanvas.translate(getWidth() / 2, getHeight() / 2);
    try
    {
      this.a.b(paramCanvas);
      paramCanvas.restore();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.x
 * JD-Core Version:    0.6.2
 */