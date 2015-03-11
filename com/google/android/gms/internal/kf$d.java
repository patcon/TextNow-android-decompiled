package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.panorama.Panorama;

abstract class kf$d<R extends Result> extends a.b<R, kg>
{
  protected kf$d()
  {
    super(Panorama.yH);
  }

  protected abstract void a(Context paramContext, ke paramke);

  protected final void a(kg paramkg)
  {
    a(paramkg.getContext(), (ke)paramkg.ft());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kf.d
 * JD-Core Version:    0.6.2
 */