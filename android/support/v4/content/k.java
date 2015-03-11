package android.support.v4.content;

import android.database.ContentObserver;
import android.os.Handler;

public final class k extends ContentObserver
{
  public k(j paramj)
  {
    super(new Handler());
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.a.onContentChanged();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.k
 * JD-Core Version:    0.6.2
 */