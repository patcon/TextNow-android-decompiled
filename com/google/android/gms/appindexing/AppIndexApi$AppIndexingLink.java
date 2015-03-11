package com.google.android.gms.appindexing;

import android.net.Uri;
import android.view.View;

public final class AppIndexApi$AppIndexingLink
{
  public final Uri appIndexingUrl;
  public final int viewId;
  public final Uri webUrl;

  public AppIndexApi$AppIndexingLink(Uri paramUri1, Uri paramUri2, View paramView)
  {
    this.appIndexingUrl = paramUri1;
    this.webUrl = paramUri2;
    this.viewId = paramView.getId();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink
 * JD-Core Version:    0.6.2
 */