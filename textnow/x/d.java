package textnow.x;

import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;

final class d
  implements ConnPerRoute
{
  public final int getMaxForRoute(HttpRoute paramHttpRoute)
  {
    return 50;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.x.d
 * JD-Core Version:    0.6.2
 */