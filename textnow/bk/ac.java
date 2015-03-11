package textnow.bk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;

final class ac
{
  private volatile w a;

  @SuppressLint({"NewApi"})
  public final w a(Context paramContext)
  {
    Display localDisplay;
    if (this.a == null)
    {
      localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      if (Build.VERSION.SDK_INT >= 13)
        break label60;
    }
    label60: Point localPoint;
    for (this.a = new w(Integer.valueOf(localDisplay.getWidth()), Integer.valueOf(localDisplay.getHeight())); ; this.a = new w(Integer.valueOf(localPoint.x), Integer.valueOf(localPoint.y)))
    {
      return this.a;
      localPoint = new Point();
      localDisplay.getSize(localPoint);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.ac
 * JD-Core Version:    0.6.2
 */