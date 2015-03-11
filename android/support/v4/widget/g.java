package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class g extends ContentObserver
{
  public g(f paramf)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.g
 * JD-Core Version:    0.6.2
 */