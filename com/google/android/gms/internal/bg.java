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

@ez
public final class bg
{
  public static final String DEVICE_ID_EMULATOR = gr.R("emulator");
  private final Date d;
  private final Set<String> f;
  private final Location h;
  private final String ol;
  private final int om;
  private final boolean on;
  private final Bundle oo;
  private final Map<Class<? extends NetworkExtras>, NetworkExtras> op;
  private final String oq;
  private final SearchAdRequest or;
  private final int os;
  private final Set<String> ot;

  public bg(bg.a parama)
  {
    this(parama, null);
  }

  public bg(bg.a parama, SearchAdRequest paramSearchAdRequest)
  {
    this.d = bg.a.a(parama);
    this.ol = bg.a.b(parama);
    this.om = bg.a.c(parama);
    this.f = Collections.unmodifiableSet(bg.a.d(parama));
    this.h = bg.a.e(parama);
    this.on = bg.a.f(parama);
    this.oo = bg.a.g(parama);
    this.op = Collections.unmodifiableMap(bg.a.h(parama));
    this.oq = bg.a.i(parama);
    this.or = paramSearchAdRequest;
    this.os = bg.a.j(parama);
    this.ot = Collections.unmodifiableSet(bg.a.k(parama));
  }

  public final SearchAdRequest bd()
  {
    return this.or;
  }

  public final Map<Class<? extends NetworkExtras>, NetworkExtras> be()
  {
    return this.op;
  }

  public final Bundle bf()
  {
    return this.oo;
  }

  public final int bg()
  {
    return this.os;
  }

  public final Date getBirthday()
  {
    return this.d;
  }

  public final String getContentUrl()
  {
    return this.ol;
  }

  public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass)
  {
    Bundle localBundle = this.oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null)
      return localBundle.getBundle(paramClass.getClass().getName());
    return null;
  }

  public final int getGender()
  {
    return this.om;
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
    return this.on;
  }

  @Deprecated
  public final <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return (NetworkExtras)this.op.get(paramClass);
  }

  public final Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass)
  {
    return this.oo.getBundle(paramClass.getName());
  }

  public final String getPublisherProvidedId()
  {
    return this.oq;
  }

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ot.contains(gr.v(paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bg
 * JD-Core Version:    0.6.2
 */