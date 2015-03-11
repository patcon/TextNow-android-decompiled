package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class bg$a
{
  private Date d;
  private Location h;
  private String ol;
  private int om = -1;
  private boolean on = false;
  private final Bundle oo = new Bundle();
  private String oq;
  private int os = -1;
  private final HashSet<String> ou = new HashSet();
  private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> ov = new HashMap();
  private final HashSet<String> ow = new HashSet();

  public final void a(Location paramLocation)
  {
    this.h = paramLocation;
  }

  @Deprecated
  public final void a(NetworkExtras paramNetworkExtras)
  {
    if ((paramNetworkExtras instanceof AdMobExtras))
    {
      a(AdMobAdapter.class, ((AdMobExtras)paramNetworkExtras).getExtras());
      return;
    }
    this.ov.put(paramNetworkExtras.getClass(), paramNetworkExtras);
  }

  public final void a(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
  {
    this.oo.putBundle(paramClass.getName(), paramBundle);
  }

  public final void a(Date paramDate)
  {
    this.d = paramDate;
  }

  public final void b(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    if (this.oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
      this.oo.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
    this.oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(paramClass.getName(), paramBundle);
  }

  public final void g(int paramInt)
  {
    this.om = paramInt;
  }

  public final void g(boolean paramBoolean)
  {
    this.on = paramBoolean;
  }

  public final void h(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.os = i;
      return;
    }
  }

  public final void r(String paramString)
  {
    this.ou.add(paramString);
  }

  public final void s(String paramString)
  {
    this.ow.add(paramString);
  }

  public final void t(String paramString)
  {
    this.ol = paramString;
  }

  public final void u(String paramString)
  {
    this.oq = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bg.a
 * JD-Core Version:    0.6.2
 */