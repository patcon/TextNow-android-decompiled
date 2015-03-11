package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.request.OnDataPointListener;

public class l extends k.a
{
  private final OnDataPointListener Ti;

  private l(OnDataPointListener paramOnDataPointListener)
  {
    this.Ti = ((OnDataPointListener)o.i(paramOnDataPointListener));
  }

  public void c(DataPoint paramDataPoint)
  {
    this.Ti.onDataPoint(paramDataPoint);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.l
 * JD-Core Version:    0.6.2
 */