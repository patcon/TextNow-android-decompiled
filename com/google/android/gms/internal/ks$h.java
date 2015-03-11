package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$h extends hy
  implements SafeParcelable, Person.Urls
{
  public static final lc CREATOR = new lc();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private int AT;
  private final Set<Integer> acs;
  private String adX;
  private final int adY = 4;
  private String mValue;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("label", hy.a.j("label", 5));
    acr.put("type", hy.a.a("type", 6, new hv().f("home", 0).f("work", 1).f("blog", 2).f("profile", 3).f("other", 4).f("otherProfile", 5).f("contributor", 6).f("website", 7), false));
    acr.put("value", hy.a.j("value", 4));
  }

  public ks$h()
  {
    this.xM = 2;
    this.acs = new HashSet();
  }

  ks$h(Set<Integer> paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.adX = paramString1;
    this.AT = paramInt2;
    this.mValue = paramString2;
  }

  protected final boolean a(hy.a parama)
  {
    return this.acs.contains(Integer.valueOf(parama.fN()));
  }

  protected final Object aF(String paramString)
  {
    return null;
  }

  protected final boolean aG(String paramString)
  {
    return false;
  }

  protected final Object b(hy.a parama)
  {
    switch (parama.fN())
    {
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.fN());
    case 5:
      return this.adX;
    case 6:
      return Integer.valueOf(this.AT);
    case 4:
    }
    return this.mValue;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h))
      return false;
    if (this == paramObject)
      return true;
    h localh = (h)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localh.a(locala))
        {
          if (!b(locala).equals(localh.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localh.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final String getLabel()
  {
    return this.adX;
  }

  public final int getType()
  {
    return this.AT;
  }

  public final String getValue()
  {
    return this.mValue;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasLabel()
  {
    return this.acs.contains(Integer.valueOf(5));
  }

  public final boolean hasType()
  {
    return this.acs.contains(Integer.valueOf(6));
  }

  public final boolean hasValue()
  {
    return this.acs.contains(Integer.valueOf(4));
  }

  public final int hashCode()
  {
    Iterator localIterator = acr.values().iterator();
    int i = 0;
    hy.a locala;
    if (localIterator.hasNext())
    {
      locala = (hy.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.fN() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final boolean isDataValid()
  {
    return true;
  }

  @Deprecated
  public final int kX()
  {
    return 4;
  }

  public final h kY()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    lc.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.h
 * JD-Core Version:    0.6.2
 */