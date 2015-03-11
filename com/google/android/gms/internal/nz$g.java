package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$g extends jj
  implements Person.PlacesLived
{
  public static final oi CREATOR = new oi();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  final Set<Integer> amc;
  boolean anG;
  String mValue;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("primary", ji.a.k("primary", 2));
    amb.put("value", ji.a.l("value", 3));
  }

  public nz$g()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$g(Set<Integer> paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    this.amc = paramSet;
    this.BR = paramInt;
    this.anG = paramBoolean;
    this.mValue = paramString;
  }

  protected final boolean a(ji.a parama)
  {
    return this.amc.contains(Integer.valueOf(parama.hm()));
  }

  protected final Object b(ji.a parama)
  {
    switch (parama.hm())
    {
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
    case 2:
      return Boolean.valueOf(this.anG);
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
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
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

  public final String getValue()
  {
    return this.mValue;
  }

  public final boolean hasPrimary()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasValue()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final int hashCode()
  {
    Iterator localIterator = amb.values().iterator();
    int i = 0;
    ji.a locala;
    if (localIterator.hasNext())
    {
      locala = (ji.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.hm() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final HashMap<String, ji.a<?, ?>> hf()
  {
    return amb;
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final boolean isPrimary()
  {
    return this.anG;
  }

  public final g nC()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oi.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.g
 * JD-Core Version:    0.6.2
 */