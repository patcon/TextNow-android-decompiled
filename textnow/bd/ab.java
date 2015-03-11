package textnow.bd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;

final class ab
{
  private volatile v a;

  @SuppressLint({"NewApi"})
  public final v a(Context paramContext)
  {
    Display localDisplay;
    if (this.a == null)
    {
      localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      if (Build.VERSION.SDK_INT >= 13)
        break label60;
    }
    label60: Point localPoint;
    for (this.a = new v(Integer.valueOf(localDisplay.getWidth()), Integer.valueOf(localDisplay.getHeight())); ; this.a = new v(Integer.valueOf(localPoint.x), Integer.valueOf(localPoint.y)))
    {
      return this.a;
      localPoint = new Point();
      localDisplay.getSize(localPoint);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.ab
 * JD-Core Version:    0.6.2
 */