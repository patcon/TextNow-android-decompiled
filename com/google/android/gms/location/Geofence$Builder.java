package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.mc;

public final class Geofence$Builder
{
  private String XC = null;
  private int aeh = 0;
  private long aei = -9223372036854775808L;
  private short aej = -1;
  private double aek;
  private double ael;
  private float aem;
  private int aen = 0;
  private int aeo = -1;

  public final Geofence build()
  {
    if (this.XC == null)
      throw new IllegalArgumentException("Request ID not set.");
    if (this.aeh == 0)
      throw new IllegalArgumentException("Transitions types not set.");
    if (((0x4 & this.aeh) != 0) && (this.aeo < 0))
      throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
    if (this.aei == -9223372036854775808L)
      throw new IllegalArgumentException("Expiration not set.");
    if (this.aej == -1)
      throw new IllegalArgumentException("Geofence region not set.");
    if (this.aen < 0)
      throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
    return new mc(this.XC, this.aeh, (short)1, this.aek, this.ael, this.aem, this.aei, this.aen, this.aeo);
  }

  public final Builder setCircularRegion(double paramDouble1, double paramDouble2, float paramFloat)
  {
    this.aej = 1;
    this.aek = paramDouble1;
    this.ael = paramDouble2;
    this.aem = paramFloat;
    return this;
  }

  public final Builder setExpirationDuration(long paramLong)
  {
    if (paramLong < 0L)
    {
      this.aei = -1L;
      return this;
    }
    this.aei = (paramLong + SystemClock.elapsedRealtime());
    return this;
  }

  public final Builder setLoiteringDelay(int paramInt)
  {
    this.aeo = paramInt;
    return this;
  }

  public final Builder setNotificationResponsiveness(int paramInt)
  {
    this.aen = paramInt;
    return this;
  }

  public final Builder setRequestId(String paramString)
  {
    this.XC = paramString;
    return this;
  }

  public final Builder setTransitionTypes(int paramInt)
  {
    this.aeh = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.Geofence.Builder
 * JD-Core Version:    0.6.2
 */