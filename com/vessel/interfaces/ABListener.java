package com.vessel.interfaces;

import com.vessel.enums.VesselEnums.TestVariation;

public abstract interface ABListener
{
  public abstract void testAvailable(String paramString, VesselEnums.TestVariation paramTestVariation);

  public abstract void testNotAvailable(VesselEnums.TestVariation paramTestVariation);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.interfaces.ABListener
 * JD-Core Version:    0.6.2
 */