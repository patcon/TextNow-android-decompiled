package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

public final class bc
  implements aq
{
  private ArrayList<al> a = new ArrayList();
  private int b = 1;
  private PendingIntent c;
  private ArrayList<Notification> d = new ArrayList();
  private Bitmap e;
  private int f;
  private int g = 8388613;
  private int h = -1;
  private int i = 0;
  private int j;
  private int k = 80;

  public final ap a(ap paramap)
  {
    Bundle localBundle = new Bundle();
    if (!this.a.isEmpty())
      localBundle.putParcelableArrayList("actions", ak.a().a((al[])this.a.toArray(new al[this.a.size()])));
    if (this.b != 1)
      localBundle.putInt("flags", this.b);
    if (this.c != null)
      localBundle.putParcelable("displayIntent", this.c);
    if (!this.d.isEmpty())
      localBundle.putParcelableArray("pages", (Parcelable[])this.d.toArray(new Notification[this.d.size()]));
    if (this.e != null)
      localBundle.putParcelable("background", this.e);
    if (this.f != 0)
      localBundle.putInt("contentIcon", this.f);
    if (this.g != 8388613)
      localBundle.putInt("contentIconGravity", this.g);
    if (this.h != -1)
      localBundle.putInt("contentActionIndex", this.h);
    if (this.i != 0)
      localBundle.putInt("customSizePreset", this.i);
    if (this.j != 0)
      localBundle.putInt("customContentHeight", this.j);
    if (this.k != 80)
      localBundle.putInt("gravity", this.k);
    if (paramap.x == null)
      paramap.x = new Bundle();
    paramap.x.putBundle("android.wearable.EXTENSIONS", localBundle);
    return paramap;
  }

  public final bc a(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
    return this;
  }

  public final bc a(al paramal)
  {
    this.a.add(paramal);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bc
 * JD-Core Version:    0.6.2
 */