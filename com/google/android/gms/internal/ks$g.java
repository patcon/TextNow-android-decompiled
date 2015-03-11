package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ks$g extends hy
  implements SafeParcelable, Person.PlacesLived
{
  public static final lb CREATOR = new lb();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private final Set<Integer> acs;
  private boolean adW;
  private String mValue;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("primary", hy.a.i("primary", 2));
    acr.put("value", hy.a.j("value", 3));
  }

  public ks$g()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  ks$g(Set<Integer> paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    this.acs = paramSet;
    this.xM = paramInt;
    this.adW = paramBoolean;
    this.mValue = paramString;
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
    case 2:
      return Boolean.valueOf(this.adW);
    case 3:
    }
    return this.mValue;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof g))
      return false;
    if (this == paramObject)
      return true;
    g localg = (g)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localg.a(locala))
        {
          if (!b(locala).equals(localg.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localg.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final String getValue()
  {
    return this.mValue;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasPrimary()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasValue()
  {
    return this.acs.contains(Integer.valueOf(3));
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

  public final boolean isPrimary()
  {
    return this.adW;
  }

  public final g kW()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    lb.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.g
 * JD-Core Version:    0.6.2
 */