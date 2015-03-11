package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class at
{
  public static final String DEVICE_ID_EMULATOR = et.y("emulator");
  private final Date d;
  private final Set<String> f;
  private final Location h;
  private final String mk;
  private final int ml;
  private final boolean mm;
  private final Bundle mn;
  private final Map<Class<? extends NetworkExtras>, NetworkExtras> mo;
  private final String mp;
  private final SearchAdRequest mq;
  private final int mr;
  private final Set<String> ms;

  public at(at.a parama)
  {
    this(parama, null);
  }

  public at(at.a parama, SearchAdRequest paramSearchAdRequest)
  {
    this.d = at.a.a(parama);
    this.mk = at.a.b(parama);
    this.ml = at.a.c(parama);
    this.f = Collections.unmodifiableSet(at.a.d(parama));
    this.h = at.a.e(parama);
    this.mm = at.a.f(parama);
    this.mn = at.a.g(parama);
    this.mo = Collections.unmodifiableMap(at.a.h(parama));
    this.mp = at.a.i(parama);
    this.mq = paramSearchAdRequest;
    this.mr = at.a.j(parama);
    this.ms = Collections.unmodifiableSet(at.a.k(parama));
  }

  public final SearchAdRequest aH()
  {
    return this.mq;
  }

  public final Map<Class<? extends NetworkExtras>, NetworkExtras> aI()
  {
    return this.mo;
  }

  public final Bundle aJ()
  {
    return this.mn;
  }

  public final int aK()
  {
    return this.mr;
  }

  public final Date getBirthday()
  {
    return this.d;
  }

  public final String getContentUrl()
  {
    return this.mk;
  }

  public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass)
  {
    Bundle localBundle = this.mn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null)
      return localBundle.getBundle(paramClass.getClass().getName());
    return null;
  }

  public final int getGender()
  {
    return this.ml;
  }

  public final Set<String> getKeywords()
  {
    return this.f;
  }

  public final Location getLocation()
  {
    return this.h;
  }

  public final boolean getManualImpressionsEnabled()
  {
    return this.mm;
  }

  @Deprecated
  public final <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return (NetworkExtras)this.mo.get(paramClass);
  }

  public final Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass)
  {
    return this.mn.getBundle(paramClass.getName());
  }

  public final String getPublisherProvidedId()
  {
    return this.mp;
  }

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ms.contains(et.r(paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.at
 * JD-Core Version:    0.6.2
 */