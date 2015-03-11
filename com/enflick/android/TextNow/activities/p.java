package com.enflick.android.TextNow.activities;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import textnow.v.o;

final class p extends ContentObserver
{
  public p(MainActivity paramMainActivity)
  {
    super(new Handler());
  }

  public final void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }

  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    o.a(this.a).e();
    MainActivity.d(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.p
 * JD-Core Version:    0.6.2
 */