package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

class av
  implements as
{
  public Notification a(ap paramap)
  {
    Notification localNotification = paramap.B;
    localNotification.setLatestEventInfo(paramap.a, paramap.b, paramap.c, paramap.d);
    if (paramap.j > 0)
      localNotification.flags = (0x80 | localNotification.flags);
    return localNotification;
  }

  public Bundle a(Notification paramNotification)
  {
    return null;
  }

  public ArrayList<Parcelable> a(al[] paramArrayOfal)
  {
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.av
 * JD-Core Version:    0.6.2
 */