package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$c extends jj
  implements Person.Image
{
  public static final of CREATOR = new of();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  final Set<Integer> amc;
  String uR;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("url", ji.a.l("url", 2));
  }

  public nz$c()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  public nz$c(String paramString)
  {
    this.amc = new HashSet();
    this.BR = 1;
    this.uR = paramString;
    this.amc.add(Integer.valueOf(2));
  }

  nz$c(Set<Integer> paramSet, int paramInt, String paramString)
  {
    this.amc = paramSet;
    this.BR = paramInt;
    this.uR = paramString;
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
    }
    return this.uR;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c))
      return false;
    if (this == paramObject)
      return true;
    c localc = (c)paramObject;
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
      if (a(locala))
      {
        if (localc.a(locala))
        {
          if (!b(locala).equals(localc.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localc.a(locala))
        return false;
    }
    return true;
  }

  public final String getUrl()
  {
    return this.uR;
  }

  public final boolean hasUrl()
  {
    return this.amc.contains(Integer.valueOf(2));
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

  public final c nz()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    of.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.c
 * JD-Core Version:    0.6.2
 */