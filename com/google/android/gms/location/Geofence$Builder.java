package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.jh;

public final class Geofence$Builder
{
  private String OB = null;
  private int Va = 0;
  private long Vb = -9223372036854775808L;
  private short Vc = -1;
  private double Vd;
  private double Ve;
  private float Vf;
  private int Vg = 0;
  private int Vh = -1;

  public final Geofence build()
  {
    if (this.OB == null)
      throw new IllegalArgumentException("Request ID not set.");
    if (this.Va == 0)
      throw new IllegalArgumentException("Transitions types not set.");
    if (((0x4 & this.Va) != 0) && (this.Vh < 0))
      throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
    if (this.Vb == -9223372036854775808L)
      throw new IllegalArgumentException("Expiration not set.");
    if (this.Vc == -1)
      throw new IllegalArgumentException("Geofence region not set.");
    if (this.Vg < 0)
      throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
    return new jh(this.OB, this.Va, (short)1, this.Vd, this.Ve, this.Vf, this.Vb, this.Vg, this.Vh);
  }

  public final Builder setCircularRegion(double paramDouble1, double paramDouble2, float paramFloat)
  {
    this.Vc = 1;
    this.Vd = paramDouble1;
    this.Ve = paramDouble2;
    this.Vf = paramFloat;
    return this;
  }

  public final Builder setExpirationDuration(long paramLong)
  {
    if (paramLong < 0L)
    {
      this.Vb = -1L;
      return this;
    }
    this.Vb = (paramLong + SystemClock.elapsedRealtime());
    return this;
  }

  public final Builder setLoiteringDelay(int paramInt)
  {
    this.Vh = paramInt;
    return this;
  }

  public final Builder setNotificationResponsiveness(int paramInt)
  {
    this.Vg = paramInt;
    return this;
  }

  public final Builder setRequestId(String paramString)
  {
    this.OB = paramString;
    return this;
  }

  public final Builder setTransitionTypes(int paramInt)
  {
    this.Va = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.Geofence.Builder
 * JD-Core Version:    0.6.2
 */