package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class nz$b$a extends jj
  implements Person.Cover.CoverInfo
{
  public static final od CREATOR = new od();
  private static final HashMap<String, ji.a<?, ?>> amb;
  final int BR;
  final Set<Integer> amc;
  int any;
  int anz;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("leftImageOffset", ji.a.i("leftImageOffset", 2));
    amb.put("topImageOffset", ji.a.i("topImageOffset", 3));
  }

  public nz$b$a()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  nz$b$a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.any = paramInt2;
    this.anz = paramInt3;
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
      return Integer.valueOf(this.any);
    case 3:
    }
    return Integer.valueOf(this.anz);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    if (this == paramObject)
      return true;
    a locala = (a)paramObject;
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala1 = (ji.a)localIterator.next();
      if (a(locala1))
      {
        if (locala.a(locala1))
        {
          if (!b(locala1).equals(locala.b(locala1)))
            return false;
        }
        else
          return false;
      }
      else if (locala.a(locala1))
        return false;
    }
    return true;
  }

  public final int getLeftImageOffset()
  {
    return this.any;
  }

  public final int getTopImageOffset()
  {
    return this.anz;
  }

  public final boolean hasLeftImageOffset()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasTopImageOffset()
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

  public final a nx()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    od.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.b.a
 * JD-Core Version:    0.6.2
 */