package com.google.android.gms.fitness.service;

import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

public abstract interface SensorEventDispatcher
{
  public abstract void publish(DataPoint paramDataPoint);

  public abstract void publish(List<DataPoint> paramList);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.service.SensorEventDispatcher
 * JD-Core Version:    0.6.2
 */