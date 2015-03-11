package textnow.ax;

import android.location.Location;
import android.location.LocationManager;

public class l
{
  static final String a = l.class.getName();
  private Location b;
  private LocationManager c;
  private k d;
  private boolean e = false;

  public final void a()
  {
    if ((this.c != null) && (this.d != null));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.c.removeUpdates(this.d);
      return;
    }
  }

  public final Location b()
  {
    Location localLocation = this.b;
    if ((localLocation == null) && (this.d != null))
      localLocation = this.d.a();
    return localLocation;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ax.l
 * JD-Core Version:    0.6.2
 */