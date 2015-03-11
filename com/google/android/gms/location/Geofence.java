package com.google.android.gms.location;

public abstract interface Geofence
{
  public static final int GEOFENCE_TRANSITION_DWELL = 4;
  public static final int GEOFENCE_TRANSITION_ENTER = 1;
  public static final int GEOFENCE_TRANSITION_EXIT = 2;
  public static final long NEVER_EXPIRE = -1L;

  public abstract String getRequestId();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.Geofence
 * JD-Core Version:    0.6.2
 */