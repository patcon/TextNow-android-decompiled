package com.enflick.android.TextNow.activities;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import textnow.q.q;

final class k extends ContentObserver
{
  public k(MainActivity paramMainActivity)
  {
    super(new Handler());
  }

  public final void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }

  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    q.a(this.a).e();
    MainActivity.d(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.k
 * JD-Core Version:    0.6.2
 */