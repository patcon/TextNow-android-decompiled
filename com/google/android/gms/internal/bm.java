package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bm
{
  public final List<bl> nr;
  public final long ns;
  public final List<String> nt;
  public final List<String> nu;
  public final List<String> nv;
  public final String nw;
  public final long nx;
  public int ny;
  public int nz;

  public bm(String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    if (eu.p(2))
      eu.C("Mediation Response JSON: " + localJSONObject1.toString(2));
    JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = -1;
    for (int j = 0; j < localJSONArray.length(); j++)
    {
      bl localbl = new bl(localJSONArray.getJSONObject(j));
      localArrayList.add(localbl);
      if ((i < 0) && (a(localbl)))
        i = j;
    }
    this.ny = i;
    this.nz = localJSONArray.length();
    this.nr = Collections.unmodifiableList(localArrayList);
    this.nw = localJSONObject1.getString("qdata");
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    if (localJSONObject2 != null)
    {
      this.ns = localJSONObject2.optLong("ad_network_timeout_millis", -1L);
      this.nt = br.a(localJSONObject2, "click_urls");
      this.nu = br.a(localJSONObject2, "imp_urls");
      this.nv = br.a(localJSONObject2, "nofill_urls");
      long l1 = localJSONObject2.optLong("refresh", -1L);
      if (l1 > 0L);
      for (long l2 = l1 * 1000L; ; l2 = -1L)
      {
        this.nx = l2;
        return;
      }
    }
    this.ns = -1L;
    this.nt = null;
    this.nu = null;
    this.nv = null;
    this.nx = -1L;
  }

  private boolean a(bl parambl)
  {
    Iterator localIterator = parambl.nm.iterator();
    while (localIterator.hasNext())
      if (((String)localIterator.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
        return true;
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bm
 * JD-Core Version:    0.6.2
 */