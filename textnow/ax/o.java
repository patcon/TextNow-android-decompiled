package textnow.ax;

import android.content.Context;
import android.widget.VideoView;

public final class o extends VideoView
{
  public boolean a = false;
  private int c = 0;
  private int d = 0;

  o(n paramn, Context paramContext)
  {
    super(paramContext);
  }

  public final void a()
  {
    this.c = 0;
    this.d = 0;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
  }

  public final int getId()
  {
    return 48879;
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.c == 0) || (this.d == 0))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    setMeasuredDimension(this.c, this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.o
 * JD-Core Version:    0.6.2
 */