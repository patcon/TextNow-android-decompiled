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

public final class at$a
{
  private Date d;
  private Location h;
  private String mk;
  private int ml = -1;
  private boolean mm = false;
  private final Bundle mn = new Bundle();
  private String mp;
  private int mr = -1;
  private final HashSet<String> mt = new HashSet();
  private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> mu = new HashMap();
  private final HashSet<String> mv = new HashSet();

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
    this.mu.put(paramNetworkExtras.getClass(), paramNetworkExtras);
  }

  public final void a(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
  {
    this.mn.putBundle(paramClass.getName(), paramBundle);
  }

  public final void a(Date paramDate)
  {
    this.d = paramDate;
  }

  public final void b(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    if (this.mn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
      this.mn.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
    this.mn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(paramClass.getName(), paramBundle);
  }

  public final void e(int paramInt)
  {
    this.ml = paramInt;
  }

  public final void g(String paramString)
  {
    this.mt.add(paramString);
  }

  public final void g(boolean paramBoolean)
  {
    this.mm = paramBoolean;
  }

  public final void h(String paramString)
  {
    this.mv.add(paramString);
  }

  public final void h(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.mr = i;
      return;
    }
  }

  public final void i(String paramString)
  {
    this.mk = paramString;
  }

  public final void j(String paramString)
  {
    this.mp = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.at.a
 * JD-Core Version:    0.6.2
 */