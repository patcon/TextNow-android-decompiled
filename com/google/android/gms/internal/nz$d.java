package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$d extends jj
  implements Person.Name
{
  public static final og CREATOR = new og();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  String amA;
  String amD;
  final Set<Integer> amc;
  String anA;
  String anB;
  String anC;
  String anD;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("familyName", ji.a.l("familyName", 2));
    amb.put("formatted", ji.a.l("formatted", 3));
    amb.put("givenName", ji.a.l("givenName", 4));
    amb.put("honorificPrefix", ji.a.l("honorificPrefix", 5));
    amb.put("honorificSuffix", ji.a.l("honorificSuffix", 6));
    amb.put("middleName", ji.a.l("middleName", 7));
  }

  public nz$d()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$d(Set<Integer> paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.amc = paramSet;
    this.BR = paramInt;
    this.amA = paramString1;
    this.anA = paramString2;
    this.amD = paramString3;
    this.anB = paramString4;
    this.anC = paramString5;
    this.anD = paramString6;
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
      return this.amA;
    case 3:
      return this.anA;
    case 4:
      return this.amD;
    case 5:
      return this.anB;
    case 6:
      return this.anC;
    case 7:
    }
    return this.anD;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d))
      return false;
    if (this == paramObject)
      return true;
    d locald = (d)paramObject;
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
      if (a(locala))
      {
        if (locald.a(locala))
        {
          if (!b(locala).equals(locald.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (locald.a(locala))
        return false;
    }
    return true;
  }

  public final String getFamilyName()
  {
    return this.amA;
  }

  public final String getFormatted()
  {
    return this.anA;
  }

  public final String getGivenName()
  {
    return this.amD;
  }

  public final String getHonorificPrefix()
  {
    return this.anB;
  }

  public final String getHonorificSuffix()
  {
    return this.anC;
  }

  public final String getMiddleName()
  {
    return this.anD;
  }

  public final boolean hasFamilyName()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasFormatted()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final boolean hasGivenName()
  {
    return this.amc.contains(Integer.valueOf(4));
  }

  public final boolean hasHonorificPrefix()
  {
    return this.amc.contains(Integer.valueOf(5));
  }

  public final boolean hasHonorificSuffix()
  {
    return this.amc.contains(Integer.valueOf(6));
  }

  public final boolean hasMiddleName()
  {
    return this.amc.contains(Integer.valueOf(7));
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

  public final d nA()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    og.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.d
 * JD-Core Version:    0.6.2
 */