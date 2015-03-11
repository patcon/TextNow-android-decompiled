package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class d extends ContentObserver
{
  public d(c paramc)
  {
    super(new Handler());
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.2
 */