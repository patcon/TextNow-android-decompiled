package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

class kh
  implements PanoramaApi.PanoramaResult
{
  private final Intent abo;
  private final Status yz;

  public kh(Status paramStatus, Intent paramIntent)
  {
    this.yz = ((Status)hm.f(paramStatus));
    this.abo = paramIntent;
  }

  public Status getStatus()
  {
    return this.yz;
  }

  public Intent getViewerIntent()
  {
    return this.abo;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kh
 * JD-Core Version:    0.6.2
 */