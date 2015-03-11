package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$h extends jj
  implements Person.Urls
{
  public static final oj CREATOR = new oj();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  int FD;
  final Set<Integer> amc;
  String anH;
  private final int anI = 4;
  String mValue;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("label", ji.a.l("label", 5));
    amb.put("type", ji.a.a("type", 6, new jf().h("home", 0).h("work", 1).h("blog", 2).h("profile", 3).h("other", 4).h("otherProfile", 5).h("contributor", 6).h("website", 7), false));
    amb.put("value", ji.a.l("value", 4));
  }

  public nz$h()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$h(Set<Integer> paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.anH = paramString1;
    this.FD = paramInt2;
    this.mValue = paramString2;
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
    case 5:
      return this.anH;
    case 6:
      return Integer.valueOf(this.FD);
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
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
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

  public final String getLabel()
  {
    return this.anH;
  }

  public final int getType()
  {
    return this.FD;
  }

  public final String getValue()
  {
    return this.mValue;
  }

  public final boolean hasLabel()
  {
    return this.amc.contains(Integer.valueOf(5));
  }

  public final boolean hasType()
  {
    return this.amc.contains(Integer.valueOf(6));
  }

  public final boolean hasValue()
  {
    return this.amc.contains(Integer.valueOf(4));
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

  @Deprecated
  public final int nD()
  {
    return 4;
  }

  public final h nE()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oj.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.h
 * JD-Core Version:    0.6.2
 */