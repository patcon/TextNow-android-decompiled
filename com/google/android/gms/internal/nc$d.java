package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.panorama.Panorama;

abstract class nc$d<R extends Result> extends BaseImplementation.a<R, nd>
{
  protected nc$d()
  {
    super(Panorama.CU);
  }

  protected abstract void a(Context paramContext, nb paramnb);

  protected final void a(nd paramnd)
  {
    a(paramnd.getContext(), (nb)paramnd.gS());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nc.d
 * JD-Core Version:    0.6.2
 */