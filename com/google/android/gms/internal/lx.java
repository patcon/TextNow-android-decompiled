package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public abstract interface lx extends IInterface
{
  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent);

  public abstract void a(PendingIntent paramPendingIntent);

  public abstract void a(PendingIntent paramPendingIntent, lw paramlw, String paramString);

  public abstract void a(Location paramLocation, int paramInt);

  public abstract void a(lw paramlw, String paramString);

  public abstract void a(ma paramma, PendingIntent paramPendingIntent);

  public abstract void a(ma paramma, a parama);

  public abstract void a(mh parammh, mx parammx, PendingIntent paramPendingIntent);

  public abstract void a(mj parammj, mx parammx, mv parammv);

  public abstract void a(ml paramml, mx parammx);

  public abstract void a(mn parammn, mx parammx, PendingIntent paramPendingIntent);

  public abstract void a(mr parammr, mx parammx, mv parammv);

  public abstract void a(mt parammt, LatLngBounds paramLatLngBounds, List<String> paramList, mx parammx, mv parammv);

  public abstract void a(mx parammx, PendingIntent paramPendingIntent);

  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);

  public abstract void a(LocationRequest paramLocationRequest, a parama);

  public abstract void a(LocationRequest paramLocationRequest, a parama, String paramString);

  public abstract void a(a parama);

  public abstract void a(LatLng paramLatLng, mj parammj, mx parammx, mv parammv);

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, mj parammj, mx parammx, mv parammv);

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, mj parammj, mx parammx, mv parammv);

  public abstract void a(String paramString, mx parammx, mv parammv);

  public abstract void a(String paramString, LatLngBounds paramLatLngBounds, mf parammf, mx parammx, mv parammv);

  public abstract void a(List<mc> paramList, PendingIntent paramPendingIntent, lw paramlw, String paramString);

  public abstract void a(String[] paramArrayOfString, lw paramlw, String paramString);

  public abstract void b(mx parammx, PendingIntent paramPendingIntent);

  public abstract void b(String paramString, mx parammx, mv parammv);

  public abstract Location bW(String paramString);

  public abstract c bX(String paramString);

  public abstract Location lV();

  public abstract IBinder lW();

  public abstract IBinder lX();

  public abstract void removeActivityUpdates(PendingIntent paramPendingIntent);

  public abstract void setMockLocation(Location paramLocation);

  public abstract void setMockMode(boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lx
 * JD-Core Version:    0.6.2
 */